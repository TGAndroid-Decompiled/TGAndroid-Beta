package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final int f47216a;
    public final boolean f47217b;

    public c(int i10, boolean z10) {
        this.f47216a = i10;
        this.f47217b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f47216a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f47217b ? 1 : 0);
        c0.r(parcel, q6);
    }
}
