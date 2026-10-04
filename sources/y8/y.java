package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f50548a;
    public final List f50549b;

    public y(int i10, ArrayList arrayList) {
        this.f50548a = i10;
        this.f50549b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50548a);
        w7.g0.p(parcel, 3, this.f50549b);
        w7.g0.r(parcel, q6);
    }
}
