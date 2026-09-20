package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String f45836a;
    public final float f45837b;
    public final String f45838c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.f45836a = str;
        this.f45837b = f7;
        this.f45838c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f45836a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f45837b);
        w7.f0.l(parcel, 3, this.f45838c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
