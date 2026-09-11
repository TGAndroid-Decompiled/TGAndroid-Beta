package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final int f44927a;
    public final boolean f44928b;

    public c(int i10, boolean z10) {
        this.f44927a = i10;
        this.f44928b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44927a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f44928b ? 1 : 0);
        e0.r(parcel, q6);
    }
}
