package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f54246a;
    public final int f54247b;

    public l(int i10, int i11) {
        this.f54246a = i10;
        this.f54247b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54246a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54247b);
        w7.h0.r(parcel, q6);
    }
}
