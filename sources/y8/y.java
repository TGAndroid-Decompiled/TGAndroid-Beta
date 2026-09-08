package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f49696a;
    public final List f49697b;

    public y(int i10, ArrayList arrayList) {
        this.f49696a = i10;
        this.f49697b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49696a);
        w7.e0.p(parcel, 3, this.f49697b);
        w7.e0.r(parcel, q6);
    }
}
