package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(4);
    public String f46914a;
    public String f46915b;
    public String f46916c;
    public String d;
    public String e;
    public String f46917f;
    public String h;
    public String f46918n;
    public String f46919r;
    public boolean f46920s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f46914a);
        f0.l(parcel, 3, this.f46915b);
        f0.l(parcel, 4, this.f46916c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f46917f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f46918n);
        f0.l(parcel, 10, this.f46919r);
        boolean z10 = this.f46920s;
        f0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 12, this.v);
        f0.r(parcel, q6);
    }
}
