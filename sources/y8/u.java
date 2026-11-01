package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f54306a;
    public final ConnectionConfiguration f54307b;

    public u(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f54306a = i10;
        this.f54307b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54306a);
        w7.h0.k(parcel, 3, this.f54307b, i10);
        w7.h0.r(parcel, q6);
    }
}
