package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f48681a;
    public final ConnectionConfiguration[] f48682b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f48681a = i10;
        this.f48682b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48681a);
        w7.g0.o(parcel, 3, this.f48682b, i10);
        w7.g0.r(parcel, q6);
    }
}
