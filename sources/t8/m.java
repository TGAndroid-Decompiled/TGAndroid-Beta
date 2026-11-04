package t8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new q8.i(15);
    public e E;
    public byte[] F;
    public boolean G;
    public int f55029a;
    public String f55030b;
    public String f55031c;
    public int d;
    public Point[] f55032e;
    public f f55033f;
    public i h;
    public j f55034n;
    public l f55035r;
    public k f55036s;
    public g f55037w;
    public c f55038x;
    public d f55039y;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f55029a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f55030b);
        j8.a.m(parcel, 4, this.f55031c);
        int i11 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i11);
        j8.a.p(parcel, 6, this.f55032e, i3);
        j8.a.l(parcel, 7, this.f55033f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.l(parcel, 9, this.f55034n, i3);
        j8.a.l(parcel, 10, this.f55035r, i3);
        j8.a.l(parcel, 11, this.f55036s, i3);
        j8.a.l(parcel, 12, this.f55037w, i3);
        j8.a.l(parcel, 13, this.f55038x, i3);
        j8.a.l(parcel, 14, this.f55039y, i3);
        j8.a.l(parcel, 15, this.E, i3);
        j8.a.d(parcel, 16, this.F);
        boolean z10 = this.G;
        j8.a.r(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
