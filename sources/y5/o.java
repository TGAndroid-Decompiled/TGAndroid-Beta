package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.List;

public final class o extends z5.a {
    public static final Parcelable.Creator<o> CREATOR = new w7.f(11);

    public final int f49678a;

    public List f49679b;

    public o(int i10, List list) {
        this.f49678a = i10;
        this.f49679b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49678a);
        r8.p(parcel, 2, this.f49679b);
        r8.r(parcel, iQ);
    }
}
