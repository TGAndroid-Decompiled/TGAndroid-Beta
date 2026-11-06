package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle f53767a;
    public n6.c[] f53768b;
    public int f53769c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.b(parcel, 1, this.f53767a);
        wb.o(parcel, 2, this.f53768b, i7);
        int i10 = this.f53769c;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        wb.k(parcel, 4, this.d, i7);
        wb.s(parcel, r10);
    }
}
