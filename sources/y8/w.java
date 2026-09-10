package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f46581a;
    public final ConnectionConfiguration f46582b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f46581a = i10;
        this.f46582b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46581a);
        w7.e0.k(parcel, 3, this.f46582b, i10);
        w7.e0.r(parcel, q6);
    }
}
