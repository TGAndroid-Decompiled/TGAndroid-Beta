package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f61237a;
    public final String f61238b;
    public final int f61239c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f61237a = str;
        this.f61238b = str2;
        this.f61239c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61237a);
        cc.l(parcel, 3, this.f61238b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f61239c);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        cc.s(parcel, r10);
    }
}
