package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f51840a;
    public final ConnectionConfiguration[] f51841b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f51840a = i10;
        this.f51841b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51840a);
        w7.d0.o(parcel, 3, this.f51841b, i10);
        w7.d0.r(parcel, q6);
    }
}
