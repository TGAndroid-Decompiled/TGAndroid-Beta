package t6;

import android.os.Parcel;
import android.os.Parcelable;
import q8.i;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new i(13);
    public final int f54946a;
    public final boolean f54947b;

    public c(int i3, boolean z10) {
        this.f54946a = i3;
        this.f54947b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f54946a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f54947b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
