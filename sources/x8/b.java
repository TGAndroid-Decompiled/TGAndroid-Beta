package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f58537a;
    public int f58538b;
    public int f58539c;
    public boolean d;
    public boolean f58540e;
    public float f58541f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f58537a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58538b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58539c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f58540e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f58541f;
        wb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        wb.s(parcel, r10);
    }
}
