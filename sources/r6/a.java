package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f47213a;
    public final int f47214b;

    public a(int i10, boolean z10) {
        this.f47213a = z10;
        this.f47214b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f47213a ? 1 : 0);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f47214b);
        c0.r(parcel, q6);
    }
}
