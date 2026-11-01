package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class b1 extends o6.a {
    public static final Parcelable.Creator<b1> CREATOR = new l0(11);
    public final int f54233a;
    public final List f54234b;
    public final y0 f54235c;

    public b1(int i10, ArrayList arrayList, y0 y0Var) {
        this.f54233a = i10;
        this.f54234b = arrayList;
        this.f54235c = y0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54233a);
        w7.h0.p(parcel, 2, this.f54234b);
        w7.h0.k(parcel, 3, this.f54235c, i10);
        w7.h0.r(parcel, q6);
    }
}
