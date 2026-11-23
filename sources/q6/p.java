package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f56069a;
    public List f56070b;

    public p(int i7, List list) {
        this.f56069a = i7;
        this.f56070b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56069a);
        cc.p(parcel, 2, this.f56070b);
        cc.s(parcel, r10);
    }
}
