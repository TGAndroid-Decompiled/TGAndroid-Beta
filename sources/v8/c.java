package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(8);
    public ArrayList f49673a;
    public boolean f49674b;
    public boolean f49675c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.h(parcel, 1, this.f49673a);
        boolean z10 = this.f49674b;
        c0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49675c;
        c0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        c0.r(parcel, q6);
    }
}
