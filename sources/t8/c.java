package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new q8.i(18);
    public String f54989a;
    public String f54990b;
    public String f54991c;
    public String d;
    public String f54992e;
    public b f54993f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f54989a);
        j8.a.m(parcel, 3, this.f54990b);
        j8.a.m(parcel, 4, this.f54991c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f54992e);
        j8.a.l(parcel, 7, this.f54993f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.t(parcel, s6);
    }
}
