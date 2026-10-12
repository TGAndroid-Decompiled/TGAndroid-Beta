package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList f46872a;
    public String f46873b;
    public String f46874c;
    public ArrayList d;
    public boolean e;
    public String f46875f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.h(parcel, 2, this.f46872a);
        g0.l(parcel, 4, this.f46873b);
        g0.l(parcel, 5, this.f46874c);
        g0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        g0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 8, this.f46875f);
        g0.r(parcel, q6);
    }
}
