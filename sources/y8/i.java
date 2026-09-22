package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f46697a;

    public i(int i10) {
        this.f46697a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46697a);
        w7.f0.r(parcel, q6);
    }
}
