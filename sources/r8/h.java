package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f56498a;
    public final n6.a f56499b;
    public final q6.x f56500c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f56498a = i7;
        this.f56499b = aVar;
        this.f56500c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56498a);
        cc.k(parcel, 2, this.f56499b, i7);
        cc.k(parcel, 3, this.f56500c, i7);
        cc.s(parcel, r10);
    }
}
