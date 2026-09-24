package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f42324a;
    public final int f42325b;

    public a(int i10, boolean z10) {
        this.f42324a = z10;
        this.f42325b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f42324a ? 1 : 0);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f42325b);
        f0.r(parcel, q6);
    }
}
