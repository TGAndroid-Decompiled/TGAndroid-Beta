package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int f59317a;
    public String f59318b;
    public String f59319c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f59317a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 2, this.f59318b);
        xb.l(parcel, 3, this.f59319c);
        xb.s(parcel, r10);
    }
}
