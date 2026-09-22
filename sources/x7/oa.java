package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String f45857a;
    public final float f45858b;
    public final String f45859c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.f45857a = str;
        this.f45858b = f7;
        this.f45859c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f45857a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f45858b);
        w7.f0.l(parcel, 3, this.f45859c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
