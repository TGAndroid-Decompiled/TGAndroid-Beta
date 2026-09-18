package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f46418a;
    public final f f46419b;

    public m0(int i10, f fVar) {
        this.f46418a = i10;
        this.f46419b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46418a);
        w7.e0.k(parcel, 3, this.f46419b, i10);
        w7.e0.r(parcel, q6);
    }
}
