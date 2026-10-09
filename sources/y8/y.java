package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f51843a;
    public final List f51844b;

    public y(int i10, ArrayList arrayList) {
        this.f51843a = i10;
        this.f51844b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51843a);
        w7.d0.p(parcel, 3, this.f51844b);
        w7.d0.r(parcel, q6);
    }
}
