package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class m6 extends p6.a {
    public static final Parcelable.Creator<m6> CREATOR = new m5(1);
    public final int f52230a;
    public final float f52231b;
    public final int f52232c;

    public m6(int i10, int i11, float f7, int i12) {
        if (i10 == 1) {
            this.f52230a = i11;
            this.f52231b = f7;
            this.f52232c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(1);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52230a);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.f52231b);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.f52232c);
        df.r(parcel, q5);
    }
}
