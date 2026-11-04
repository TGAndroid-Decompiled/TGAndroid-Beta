package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new q8.i(14);
    public int f54981a;
    public String[] f54982b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f54981a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.n(parcel, 3, this.f54982b);
        j8.a.t(parcel, s6);
    }
}
