package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(3);
    public final float f45809a;
    public final int f45810b;

    public oa(float f7, int i10) {
        this.f45809a = f7;
        this.f45810b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeFloat(this.f45809a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45810b);
        w7.f0.r(parcel, q6);
    }
}
