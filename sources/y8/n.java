package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f49623a;
    public final int f49624b;

    public n(int i10, int i11) {
        this.f49623a = i10;
        this.f49624b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49623a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49624b);
        w7.e0.r(parcel, q6);
    }
}
