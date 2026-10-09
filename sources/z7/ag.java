package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f53586a;
    public final int f53587b;
    public final int f53588c;
    public final int d;
    public final long f53589e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f53586a = i10;
        this.f53587b = i11;
        this.f53588c = i12;
        this.d = i13;
        this.f53589e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53586a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53587b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53588c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f53589e);
        w7.d0.r(parcel, q6);
    }
}
