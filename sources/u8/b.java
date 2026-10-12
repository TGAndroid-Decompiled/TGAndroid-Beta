package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int f49103a;
    public int f49104b;
    public int f49105c;
    public boolean d;
    public boolean f49106e;
    public float f49107f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f49103a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f49104b;
        c0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f49105c;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        c0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49106e;
        c0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f49107f;
        c0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        c0.r(parcel, q6);
    }
}
