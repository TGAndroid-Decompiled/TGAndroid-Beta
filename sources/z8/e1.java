package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends p6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f52725a;
    public final List f52726b;
    public final b1 f52727c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.f52725a = i10;
        this.f52726b = arrayList;
        this.f52727c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52725a);
        df.p(parcel, 2, this.f52726b);
        df.k(parcel, 3, this.f52727c, i10);
        df.r(parcel, q5);
    }
}
