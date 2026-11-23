package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int f58516a;
    public String f58517b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f58516a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f58517b);
        cc.s(parcel, r10);
    }
}
