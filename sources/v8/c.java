package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(8);
    public ArrayList f43229a;
    public boolean f43230b;
    public boolean f43231c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.h(parcel, 1, this.f43229a);
        boolean z10 = this.f43230b;
        e0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f43231c;
        e0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.r(parcel, q6);
    }
}
