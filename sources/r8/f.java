package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.m(12);
    public int f45089a;
    public String f45090b;
    public String f45091c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45089a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45090b);
        f0.l(parcel, 4, this.f45091c);
        f0.l(parcel, 5, this.d);
        f0.r(parcel, q6);
    }
}
