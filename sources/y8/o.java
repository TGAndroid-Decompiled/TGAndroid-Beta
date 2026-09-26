package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f46674a;
    public final List f46675b;

    public o(int i10, ArrayList arrayList) {
        this.f46674a = i10;
        this.f46675b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46674a);
        w7.f0.p(parcel, 3, this.f46675b);
        w7.f0.r(parcel, q6);
    }
}
