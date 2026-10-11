package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String f51021a;
    public final float f51022b;
    public final String f51023c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.f51021a = str;
        this.f51022b = f7;
        this.f51023c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51021a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeFloat(this.f51022b);
        w7.d0.l(parcel, 3, this.f51023c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.r(parcel, q6);
    }
}
