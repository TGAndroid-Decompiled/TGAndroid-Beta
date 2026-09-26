package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f46714a;
    public final List f46715b;

    public y(int i10, ArrayList arrayList) {
        this.f46714a = i10;
        this.f46715b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46714a);
        w7.f0.p(parcel, 3, this.f46715b);
        w7.f0.r(parcel, q6);
    }
}
