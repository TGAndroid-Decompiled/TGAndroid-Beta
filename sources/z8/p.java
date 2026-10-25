package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class p extends p6.a {
    public static final Parcelable.Creator<p> CREATOR = new d(10);
    public final int f52757a;
    public final List f52758b;

    public p(int i10, ArrayList arrayList) {
        this.f52757a = i10;
        this.f52758b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52757a);
        df.p(parcel, 3, this.f52758b);
        df.r(parcel, q5);
    }
}
