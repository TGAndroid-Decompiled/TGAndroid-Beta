package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f51999a;
    public final List f52000b;
    public final a1 f52001c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.f51999a = i10;
        this.f52000b = arrayList;
        this.f52001c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f51999a);
        w7.c0.p(parcel, 2, this.f52000b);
        w7.c0.k(parcel, 3, this.f52001c, i10);
        w7.c0.r(parcel, q6);
    }
}
