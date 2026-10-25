package v8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new m(24);
    public int f50089a;
    public int f50090b;
    public int f50091c;
    public boolean d;
    public boolean e;
    public float f50092f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f50089a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f50090b;
        df.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f50091c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f50092f;
        df.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        df.r(parcel, q5);
    }
}
