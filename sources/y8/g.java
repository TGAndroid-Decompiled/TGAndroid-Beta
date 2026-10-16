package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f48618a;

    public g(int i10) {
        this.f48618a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48618a);
        w7.f0.r(parcel, q6);
    }
}
