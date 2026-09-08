package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f49704a;
    public final m f49705b;

    public z(int i10, m mVar) {
        this.f49704a = i10;
        this.f49705b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49704a);
        w7.e0.k(parcel, 3, this.f49705b, i10);
        w7.e0.r(parcel, q6);
    }
}
