package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class b1 extends o6.a {
    public static final Parcelable.Creator<b1> CREATOR = new l0(11);
    public final int f54212a;
    public final List f54213b;
    public final y0 f54214c;

    public b1(int i10, ArrayList arrayList, y0 y0Var) {
        this.f54212a = i10;
        this.f54213b = arrayList;
        this.f54214c = y0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54212a);
        w7.h0.p(parcel, 2, this.f54213b);
        w7.h0.k(parcel, 3, this.f54214c, i10);
        w7.h0.r(parcel, q6);
    }
}
