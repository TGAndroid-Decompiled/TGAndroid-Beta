package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int f48919a;
    public int f48920b;
    public int f48921c;
    public boolean d;
    public boolean f48922e;
    public float f48923f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f48919a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f48920b;
        d0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f48921c;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48922e;
        d0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f48923f;
        d0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        d0.r(parcel, q6);
    }
}
