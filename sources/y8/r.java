package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f61107a;
    public final String f61108b;
    public final int f61109c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f61107a = str;
        this.f61108b = str2;
        this.f61109c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61107a);
        bc.l(parcel, 3, this.f61108b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f61109c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
