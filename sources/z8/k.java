package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new d(6);
    public final int f52739a;
    public final boolean f52740b;
    public final boolean f52741c;
    public final boolean d;
    public final boolean e;

    public k(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52739a = i10;
        this.f52740b = z10;
        this.f52741c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52739a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52740b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52741c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.r(parcel, q5);
    }
}
