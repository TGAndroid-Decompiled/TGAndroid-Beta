package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f52069a;
    public final List f52070b;

    public y(int i10, ArrayList arrayList) {
        this.f52069a = i10;
        this.f52070b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52069a);
        w7.c0.p(parcel, 3, this.f52070b);
        w7.c0.r(parcel, q6);
    }
}
