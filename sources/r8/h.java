package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f55914a;
    public final n6.a f55915b;
    public final q6.x f55916c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f55914a = i7;
        this.f55915b = aVar;
        this.f55916c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55914a);
        yb.k(parcel, 2, this.f55915b, i7);
        yb.k(parcel, 3, this.f55916c, i7);
        yb.s(parcel, r10);
    }
}
