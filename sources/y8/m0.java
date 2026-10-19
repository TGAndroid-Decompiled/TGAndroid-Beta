package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f50021a;
    public final f f50022b;

    public m0(int i10, f fVar) {
        this.f50021a = i10;
        this.f50022b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50021a);
        w7.f0.k(parcel, 3, this.f50022b, i10);
        w7.f0.r(parcel, q6);
    }
}
