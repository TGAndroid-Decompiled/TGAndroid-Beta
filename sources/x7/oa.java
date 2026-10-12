package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String f51128a;
    public final float f51129b;
    public final String f51130c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.f51128a = str;
        this.f51129b = f7;
        this.f51130c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 1, this.f51128a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeFloat(this.f51129b);
        w7.c0.l(parcel, 3, this.f51130c);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.c0.r(parcel, q6);
    }
}
