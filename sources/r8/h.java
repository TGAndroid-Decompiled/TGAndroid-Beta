package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f56488a;
    public final n6.a f56489b;
    public final q6.x f56490c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f56488a = i7;
        this.f56489b = aVar;
        this.f56490c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56488a);
        bc.k(parcel, 2, this.f56489b, i7);
        bc.k(parcel, 3, this.f56490c, i7);
        bc.s(parcel, r10);
    }
}
