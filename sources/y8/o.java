package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f46545a;
    public final List f46546b;

    public o(int i10, ArrayList arrayList) {
        this.f46545a = i10;
        this.f46546b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46545a);
        w7.e0.p(parcel, 3, this.f46546b);
        w7.e0.r(parcel, q6);
    }
}
