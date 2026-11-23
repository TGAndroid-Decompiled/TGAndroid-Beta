package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f61153a;
    public final String f61154b;
    public final int f61155c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f61153a = str;
        this.f61154b = str2;
        this.f61155c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61153a);
        bc.l(parcel, 3, this.f61154b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f61155c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
