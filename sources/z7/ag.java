package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f53630a;
    public final int f53631b;
    public final int f53632c;
    public final int d;
    public final long f53633e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f53630a = i10;
        this.f53631b = i11;
        this.f53632c = i12;
        this.d = i13;
        this.f53633e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53630a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53631b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53632c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f53633e);
        w7.d0.r(parcel, q6);
    }
}
