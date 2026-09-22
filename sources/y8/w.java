package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f46754a;
    public final ConnectionConfiguration f46755b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f46754a = i10;
        this.f46755b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46754a);
        w7.f0.k(parcel, 3, this.f46755b, i10);
        w7.f0.r(parcel, q6);
    }
}
