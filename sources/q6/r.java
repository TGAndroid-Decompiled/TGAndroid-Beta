package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f55960a;
    public final String f55961b;
    public final long f55962c;
    public final int d;
    public final boolean f55963e;

    public r(int i7, int i10, long j3, String str, boolean z10) {
        this.f55960a = i7;
        this.f55961b = str;
        this.f55962c = j3;
        this.d = i10;
        this.f55963e = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55960a);
        cc.l(parcel, 2, this.f55961b);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f55962c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f55963e ? 1 : 0);
        cc.s(parcel, r10);
    }
}
