package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class n6 extends o6.a {
    public static final Parcelable.Creator<n6> CREATOR = new n5(1);
    public final int f45802a;
    public final float f45803b;
    public final int f45804c;

    public n6(int i10, int i11, float f7, int i12) {
        if (i10 == 1) {
            this.f45802a = i11;
            this.f45803b = f7;
            this.f45804c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(1);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f45802a);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f45803b);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.f45804c);
        w7.f0.r(parcel, q6);
    }
}
