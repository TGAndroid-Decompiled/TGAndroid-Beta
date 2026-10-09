package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f49441a;
    public String f49442b;
    public String f49443c;
    public ArrayList d;
    public boolean f49444e;
    public String f49445f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.h(parcel, 2, this.f49441a);
        d0.l(parcel, 4, this.f49442b);
        d0.l(parcel, 5, this.f49443c);
        d0.h(parcel, 6, this.d);
        boolean z10 = this.f49444e;
        d0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 8, this.f49445f);
        d0.r(parcel, q6);
    }
}
