package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f50812a;
    public final int f50813b;
    public final int f50814c;
    public final int d;
    public final long f50815e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f50812a = i10;
        this.f50813b = i11;
        this.f50814c = i12;
        this.d = i13;
        this.f50815e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f50812a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f50813b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f50814c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.f50815e);
        w7.e0.r(parcel, q6);
    }
}
