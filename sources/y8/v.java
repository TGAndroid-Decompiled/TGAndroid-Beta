package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f54308a;
    public final ConnectionConfiguration[] f54309b;

    public v(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f54308a = i10;
        this.f54309b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54308a);
        w7.h0.o(parcel, 3, this.f54309b, i10);
        w7.h0.r(parcel, q6);
    }
}
