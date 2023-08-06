package com.example.testapp.data

import android.os.Parcel
import android.os.Parcelable

data class ArgumentsTest(val count: Int) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(count)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ArgumentsTest> {
        override fun createFromParcel(parcel: Parcel): ArgumentsTest {
            return ArgumentsTest(parcel)
        }

        override fun newArray(size: Int): Array<ArgumentsTest?> {
            return arrayOfNulls(size)
        }
    }
}