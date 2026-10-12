package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49725a;
    public String f49726b;
    public String f49727c;
    public String d;
    public String f49728e;
    public String f49729f;
    public String h;
    public String f49730n;
    public String f49731r;
    public boolean f49732s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49725a);
        c0.l(parcel, 3, this.f49726b);
        c0.l(parcel, 4, this.f49727c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f49728e);
        c0.l(parcel, 7, this.f49729f);
        c0.l(parcel, 8, this.h);
        c0.l(parcel, 9, this.f49730n);
        c0.l(parcel, 10, this.f49731r);
        boolean z10 = this.f49732s;
        c0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.l(parcel, 12, this.v);
        c0.r(parcel, q6);
    }
}
