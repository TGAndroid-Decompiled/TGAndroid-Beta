package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f49691a;
    public final ConnectionConfiguration f49692b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f49691a = i10;
        this.f49692b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49691a);
        w7.e0.k(parcel, 3, this.f49692b, i10);
        w7.e0.r(parcel, q6);
    }
}
