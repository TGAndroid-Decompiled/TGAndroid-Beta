package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f55956a;
    public List f55957b;

    public p(int i7, List list) {
        this.f55956a = i7;
        this.f55957b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55956a);
        cc.p(parcel, 2, this.f55957b);
        cc.s(parcel, r10);
    }
}
