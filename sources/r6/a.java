package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f47035a;
    public final int f47036b;

    public a(int i10, boolean z10) {
        this.f47035a = z10;
        this.f47036b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f47035a ? 1 : 0);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f47036b);
        d0.r(parcel, q6);
    }
}
