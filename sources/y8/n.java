package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int f60526a;
    public String f60527b;
    public String f60528c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f60526a;
        yb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 2, this.f60527b);
        yb.l(parcel, 3, this.f60528c);
        yb.s(parcel, r10);
    }
}
