package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(6);
    public ArrayList f46866a;
    public boolean f46867b;
    public boolean f46868c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.h(parcel, 1, this.f46866a);
        boolean z10 = this.f46867b;
        g0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f46868c;
        g0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
