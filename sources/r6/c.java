package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final int f45835a;
    public final boolean f45836b;

    public c(int i10, boolean z10) {
        this.f45835a = i10;
        this.f45836b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f45835a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f45836b ? 1 : 0);
        g0.r(parcel, q6);
    }
}
