package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(8);
    public ArrayList f49481a;
    public boolean f49482b;
    public boolean f49483c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.h(parcel, 1, this.f49481a);
        boolean z10 = this.f49482b;
        d0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49483c;
        d0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        d0.r(parcel, q6);
    }
}
