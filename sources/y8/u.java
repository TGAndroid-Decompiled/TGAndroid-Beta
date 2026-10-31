package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f54285a;
    public final ConnectionConfiguration f54286b;

    public u(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f54285a = i10;
        this.f54286b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54285a);
        w7.h0.k(parcel, 3, this.f54286b, i10);
        w7.h0.r(parcel, q6);
    }
}
