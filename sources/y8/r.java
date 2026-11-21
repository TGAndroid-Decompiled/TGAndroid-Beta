package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f61149a;
    public final String f61150b;
    public final int f61151c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f61149a = str;
        this.f61150b = str2;
        this.f61151c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61149a);
        bc.l(parcel, 3, this.f61150b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f61151c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
