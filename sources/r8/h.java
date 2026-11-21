package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f56529a;
    public final n6.a f56530b;
    public final q6.x f56531c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f56529a = i7;
        this.f56530b = aVar;
        this.f56531c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56529a);
        bc.k(parcel, 2, this.f56530b, i7);
        bc.k(parcel, 3, this.f56531c, i7);
        bc.s(parcel, r10);
    }
}
