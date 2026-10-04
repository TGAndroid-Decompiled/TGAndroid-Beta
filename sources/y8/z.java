package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f50557a;
    public final m f50558b;

    public z(int i10, m mVar) {
        this.f50557a = i10;
        this.f50558b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50557a);
        w7.g0.k(parcel, 3, this.f50558b, i10);
        w7.g0.r(parcel, q6);
    }
}
