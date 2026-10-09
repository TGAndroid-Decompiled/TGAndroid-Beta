package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final int f46994a;
    public final boolean f46995b;

    public c(int i10, boolean z10) {
        this.f46994a = i10;
        this.f46995b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f46994a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f46995b ? 1 : 0);
        d0.r(parcel, q6);
    }
}
