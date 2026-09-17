package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f50782a;
    public final int f50783b;
    public final int f50784c;
    public final int d;
    public final long f50785e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f50782a = i10;
        this.f50783b = i11;
        this.f50784c = i12;
        this.d = i13;
        this.f50785e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f50782a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f50783b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f50784c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.f50785e);
        w7.e0.r(parcel, q6);
    }
}
