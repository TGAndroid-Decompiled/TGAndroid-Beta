package t6;

import android.os.Parcel;
import android.os.Parcelable;
import q8.i;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new i(11);
    public final boolean f54943a;
    public final int f54944b;

    public a(int i3, boolean z10) {
        this.f54943a = z10;
        this.f54944b = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f54943a ? 1 : 0);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f54944b);
        j8.a.t(parcel, s6);
    }
}
