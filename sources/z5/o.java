package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends a6.a {
    public static final Parcelable.Creator<o> CREATOR = new w5.k(15);
    public final int f50661a;
    public List f50662b;

    public o(int i10, List list) {
        this.f50661a = i10;
        this.f50662b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50661a);
        com.google.android.gms.internal.cast.o.p(parcel, 2, this.f50662b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
