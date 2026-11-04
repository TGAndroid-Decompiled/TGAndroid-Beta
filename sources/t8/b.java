package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new q8.i(16);
    public int f54983a;
    public int f54984b;
    public int f54985c;
    public int d;
    public int f54986e;
    public int f54987f;
    public boolean h;
    public String f54988n;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f54983a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f54984b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f54985c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f54986e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f54987f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.m(parcel, 9, this.f54988n);
        j8.a.t(parcel, s6);
    }
}
