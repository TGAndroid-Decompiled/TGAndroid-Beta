package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.n(13);
    public String f46396a;
    public String f46397b;
    public String f46398c;
    public String d;
    public String e;
    public String f46399f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46396a);
        h0.l(parcel, 3, this.f46397b);
        h0.l(parcel, 4, this.f46398c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f46399f);
        h0.l(parcel, 8, this.h);
        h0.r(parcel, q6);
    }
}
