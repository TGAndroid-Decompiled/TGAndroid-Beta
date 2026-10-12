package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f48643a;
    public final List f48644b;

    public o(int i10, ArrayList arrayList) {
        this.f48643a = i10;
        this.f48644b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48643a);
        w7.g0.p(parcel, 3, this.f48644b);
        w7.g0.r(parcel, q6);
    }
}
