package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList D;
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public z8.c L;
    public String f59178a;
    public String f59179b;
    public String f59180c;
    public String d;
    public String f59181e;
    public String f59182f;
    public String h;
    public String f59183n;
    public String f59184r;
    public String f59185s;
    public int f59186w;
    public ArrayList f59187x;
    public z8.f f59188y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59178a);
        wb.l(parcel, 3, this.f59179b);
        wb.l(parcel, 4, this.f59180c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f59181e);
        wb.l(parcel, 7, this.f59182f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.f59183n);
        wb.l(parcel, 10, this.f59184r);
        wb.l(parcel, 11, this.f59185s);
        int i10 = this.f59186w;
        wb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        wb.p(parcel, 13, this.f59187x);
        wb.k(parcel, 14, this.f59188y, i7);
        wb.p(parcel, 15, this.D);
        wb.l(parcel, 16, this.E);
        wb.l(parcel, 17, this.F);
        wb.p(parcel, 18, this.G);
        boolean z9 = this.H;
        wb.q(parcel, 19, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.p(parcel, 20, this.I);
        wb.p(parcel, 21, this.J);
        wb.p(parcel, 22, this.K);
        wb.k(parcel, 23, this.L, i7);
        wb.s(parcel, r10);
    }
}
