package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f54270a;
    public final List f54271b;

    public m(int i10, ArrayList arrayList) {
        this.f54270a = i10;
        this.f54271b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54270a);
        w7.h0.p(parcel, 3, this.f54271b);
        w7.h0.r(parcel, q6);
    }
}
