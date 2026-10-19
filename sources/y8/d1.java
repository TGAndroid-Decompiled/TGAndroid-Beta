package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f49991a;
    public final List f49992b;
    public final a1 f49993c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.f49991a = i10;
        this.f49992b = arrayList;
        this.f49993c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49991a);
        w7.f0.p(parcel, 2, this.f49992b);
        w7.f0.k(parcel, 3, this.f49993c, i10);
        w7.f0.r(parcel, q6);
    }
}
