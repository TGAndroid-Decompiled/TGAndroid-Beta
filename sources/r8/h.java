package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int f54430a;
    public final n6.a f54431b;
    public final q6.x f54432c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.f54430a = i7;
        this.f54431b = aVar;
        this.f54432c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f54430a);
        xb.k(parcel, 2, this.f54431b, i7);
        xb.k(parcel, 3, this.f54432c, i7);
        xb.s(parcel, r10);
    }
}
