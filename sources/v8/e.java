package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f49679a;
    public String f49680b;
    public String f49681c;
    public ArrayList d;
    public boolean f49682e;
    public String f49683f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.h(parcel, 2, this.f49679a);
        c0.l(parcel, 4, this.f49680b);
        c0.l(parcel, 5, this.f49681c);
        c0.h(parcel, 6, this.d);
        boolean z10 = this.f49682e;
        c0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.l(parcel, 8, this.f49683f);
        c0.r(parcel, q6);
    }
}
