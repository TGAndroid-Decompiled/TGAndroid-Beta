package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f44869a;
    public final float f44870b;
    public final String f44871c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f44869a = str;
        this.f44870b = f7;
        this.f44871c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f44869a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f44870b);
        w7.e0.l(parcel, 3, this.f44871c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
