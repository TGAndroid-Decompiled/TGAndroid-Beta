package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class p extends p6.a {
    public static final Parcelable.Creator<p> CREATOR = new d(10);
    public final int f52760a;
    public final List f52761b;

    public p(int i10, ArrayList arrayList) {
        this.f52760a = i10;
        this.f52761b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52760a);
        df.p(parcel, 3, this.f52761b);
        df.r(parcel, q5);
    }
}
