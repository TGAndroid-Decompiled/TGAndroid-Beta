package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(4);
    public String f48321a;
    public String f48322b;
    public String f48323c;
    public String d;
    public String e;
    public String f48324f;
    public String h;
    public String f48325n;
    public String f48326r;
    public boolean f48327s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48321a);
        f0.l(parcel, 3, this.f48322b);
        f0.l(parcel, 4, this.f48323c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f48324f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f48325n);
        f0.l(parcel, 10, this.f48326r);
        boolean z10 = this.f48327s;
        f0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 12, this.v);
        f0.r(parcel, q6);
    }
}
