package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends o6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f49617a;
    public final String f49618b;

    public d0(int i10, String str) {
        this.f49617a = i10;
        this.f49618b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49617a);
        w7.e0.l(parcel, 3, this.f49618b);
        w7.e0.r(parcel, q6);
    }
}
