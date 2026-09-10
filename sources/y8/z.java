package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f46594a;
    public final m f46595b;

    public z(int i10, m mVar) {
        this.f46594a = i10;
        this.f46595b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46594a);
        w7.e0.k(parcel, 3, this.f46595b, i10);
        w7.e0.r(parcel, q6);
    }
}
