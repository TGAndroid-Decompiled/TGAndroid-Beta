package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f50031a;
    public final int f50032b;

    public n(int i10, int i11) {
        this.f50031a = i10;
        this.f50032b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50031a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50032b);
        w7.f0.r(parcel, q6);
    }
}
