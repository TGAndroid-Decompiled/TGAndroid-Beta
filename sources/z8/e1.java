package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends p6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f52722a;
    public final List f52723b;
    public final b1 f52724c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.f52722a = i10;
        this.f52723b = arrayList;
        this.f52724c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52722a);
        df.p(parcel, 2, this.f52723b);
        df.k(parcel, 3, this.f52724c, i10);
        df.r(parcel, q5);
    }
}
