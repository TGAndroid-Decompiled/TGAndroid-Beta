package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f50552a;
    public final ConnectionConfiguration f50553b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f50552a = i10;
        this.f50553b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50552a);
        w7.g0.k(parcel, 3, this.f50553b, i10);
        w7.g0.r(parcel, q6);
    }
}
