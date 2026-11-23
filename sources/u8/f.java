package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f58621a;
    public String f58622b;
    public String f58623c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f58621a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f58622b);
        cc.l(parcel, 4, this.f58623c);
        cc.l(parcel, 5, this.d);
        cc.s(parcel, r10);
    }
}
