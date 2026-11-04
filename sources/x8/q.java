package x8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q extends q6.a {
    public static final Parcelable.Creator<q> CREATOR = new w8.b(12);
    public String f58571a;
    public String f58572b;
    public String f58573c;
    public String d;
    public String f58574e;
    public String f58575f;
    public String h;
    public String f58576n;
    public String f58577r;
    public boolean f58578s;
    public String f58579w;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f58571a);
        j8.a.m(parcel, 3, this.f58572b);
        j8.a.m(parcel, 4, this.f58573c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f58574e);
        j8.a.m(parcel, 7, this.f58575f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.f58576n);
        j8.a.m(parcel, 10, this.f58577r);
        boolean z10 = this.f58578s;
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.m(parcel, 12, this.f58579w);
        j8.a.t(parcel, s6);
    }
}
