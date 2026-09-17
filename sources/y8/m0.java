package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f46413a;
    public final f f46414b;

    public m0(int i10, f fVar) {
        this.f46413a = i10;
        this.f46414b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46413a);
        w7.e0.k(parcel, 3, this.f46414b, i10);
        w7.e0.r(parcel, q6);
    }
}
