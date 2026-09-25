package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f46640a;
    public final List f46641b;
    public final a1 f46642c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.f46640a = i10;
        this.f46641b = arrayList;
        this.f46642c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46640a);
        w7.f0.p(parcel, 2, this.f46641b);
        w7.f0.k(parcel, 3, this.f46642c, i10);
        w7.f0.r(parcel, q6);
    }
}
