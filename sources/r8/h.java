package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f45033a;
    public String f45034b;
    public String f45035c;
    public String d;
    public String f45036e;
    public String f45037f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f45033a);
        e0.l(parcel, 3, this.f45034b);
        e0.l(parcel, 4, this.f45035c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f45036e);
        e0.l(parcel, 7, this.f45037f);
        e0.l(parcel, 8, this.h);
        e0.r(parcel, q6);
    }
}
