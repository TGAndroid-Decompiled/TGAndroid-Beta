package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class y extends p6.a {
    public static final Parcelable.Creator<y> CREATOR = new d(19);
    public final int f52856a;
    public final ConnectionConfiguration[] f52857b;

    public y(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f52856a = i10;
        this.f52857b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52856a);
        df.o(parcel, 3, this.f52857b, i10);
        df.r(parcel, q5);
    }
}
