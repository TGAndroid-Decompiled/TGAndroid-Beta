package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new q8.i(17);
    public h f54994a;
    public String f54995b;
    public String f54996c;
    public i[] d;
    public f[] f54997e;
    public String[] f54998f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f54994a, i3);
        j8.a.m(parcel, 3, this.f54995b);
        j8.a.m(parcel, 4, this.f54996c);
        j8.a.p(parcel, 5, this.d, i3);
        j8.a.p(parcel, 6, this.f54997e, i3);
        j8.a.n(parcel, 7, this.f54998f);
        j8.a.p(parcel, 8, this.h, i3);
        j8.a.t(parcel, s6);
    }
}
