package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f50496a;
    public final boolean f50497b;
    public final boolean f50498c;
    public final boolean d;
    public final boolean f50499e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f50496a = i10;
        this.f50497b = z10;
        this.f50498c = z11;
        this.d = z12;
        this.f50499e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f50496a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50497b ? 1 : 0);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50498c ? 1 : 0);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f50499e ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
