package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f54314a;
    public final n6.a f54315b;
    public final q6.x f54316c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f54314a = i7;
        this.f54315b = aVar;
        this.f54316c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f54314a);
        wb.k(parcel, 2, this.f54315b, i7);
        wb.k(parcel, 3, this.f54316c, i7);
        wb.s(parcel, r10);
    }
}
