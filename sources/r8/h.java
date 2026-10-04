package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f45906a;
    public String f45907b;
    public String f45908c;
    public String d;
    public String f45909e;
    public String f45910f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45906a);
        g0.l(parcel, 3, this.f45907b);
        g0.l(parcel, 4, this.f45908c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f45909e);
        g0.l(parcel, 7, this.f45910f);
        g0.l(parcel, 8, this.h);
        g0.r(parcel, q6);
    }
}
