package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new m(6);
    public final int f45037a;
    public final boolean f45038b;

    public c(int i10, boolean z10) {
        this.f45037a = i10;
        this.f45038b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45037a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45038b ? 1 : 0);
        f0.r(parcel, q6);
    }
}
