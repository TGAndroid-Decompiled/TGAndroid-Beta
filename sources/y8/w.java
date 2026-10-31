package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int f54290a;
    public final List f54291b;

    public w(int i10, ArrayList arrayList) {
        this.f54290a = i10;
        this.f54291b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54290a);
        w7.h0.p(parcel, 3, this.f54291b);
        w7.h0.r(parcel, q6);
    }
}
