package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f52454a;
    public final int f52455b;
    public final int f52456c;
    public final int d;
    public final long f52457e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f52454a = i10;
        this.f52455b = i11;
        this.f52456c = i12;
        this.d = i13;
        this.f52457e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f52454a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f52455b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f52456c);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.f52457e);
        w7.g0.r(parcel, q6);
    }
}
