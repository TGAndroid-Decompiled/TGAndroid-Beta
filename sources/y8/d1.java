package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f49589a;
    public final List f49590b;
    public final a1 f49591c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.f49589a = i10;
        this.f49590b = arrayList;
        this.f49591c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f49589a);
        w7.e0.p(parcel, 2, this.f49590b);
        w7.e0.k(parcel, 3, this.f49591c, i10);
        w7.e0.r(parcel, q6);
    }
}
