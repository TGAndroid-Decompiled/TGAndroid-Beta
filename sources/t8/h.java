package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new q8.i(21);
    public String f55015a;
    public String f55016b;
    public String f55017c;
    public String d;
    public String f55018e;
    public String f55019f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f55015a);
        j8.a.m(parcel, 3, this.f55016b);
        j8.a.m(parcel, 4, this.f55017c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f55018e);
        j8.a.m(parcel, 7, this.f55019f);
        j8.a.m(parcel, 8, this.h);
        j8.a.t(parcel, s6);
    }
}
