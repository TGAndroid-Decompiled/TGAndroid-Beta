package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class n6 extends o6.a {
    public static final Parcelable.Creator<n6> CREATOR = new n5(1);
    public final int f49131a;
    public final float f49132b;
    public final int f49133c;

    public n6(int i10, int i11, float f7, int i12) {
        if (i10 == 1) {
            this.f49131a = i11;
            this.f49132b = f7;
            this.f49133c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(1);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49131a);
        w7.e0.s(parcel, 4, 4);
        parcel.writeFloat(this.f49132b);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.f49133c);
        w7.e0.r(parcel, q6);
    }
}
