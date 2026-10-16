package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f48691a;
    public final m f48692b;

    public z(int i10, m mVar) {
        this.f48691a = i10;
        this.f48692b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48691a);
        w7.f0.k(parcel, 3, this.f48692b, i10);
        w7.f0.r(parcel, q6);
    }
}
