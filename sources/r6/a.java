package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f41270a;
    public final int f41271b;

    public a(int i10, boolean z10) {
        this.f41270a = z10;
        this.f41271b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f41270a ? 1 : 0);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f41271b);
        e0.r(parcel, q6);
    }
}
