package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class z extends p6.a {
    public static final Parcelable.Creator<z> CREATOR = new d(20);
    public final int f52859a;
    public final List f52860b;

    public z(int i10, ArrayList arrayList) {
        this.f52859a = i10;
        this.f52860b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52859a);
        df.p(parcel, 3, this.f52860b);
        df.r(parcel, q5);
    }
}
