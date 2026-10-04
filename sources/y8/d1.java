package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f50470a;
    public final List f50471b;
    public final a1 f50472c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.f50470a = i10;
        this.f50471b = arrayList;
        this.f50472c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f50470a);
        w7.g0.p(parcel, 2, this.f50471b);
        w7.g0.k(parcel, 3, this.f50472c, i10);
        w7.g0.r(parcel, q6);
    }
}
