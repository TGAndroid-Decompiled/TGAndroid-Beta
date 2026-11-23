package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f61097a;
    public String f61098b;
    public String f61099c;
    public ArrayList d;
    public boolean f61100e;
    public String f61101f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.h(parcel, 2, this.f61097a);
        bc.l(parcel, 4, this.f61098b);
        bc.l(parcel, 5, this.f61099c);
        bc.h(parcel, 6, this.d);
        boolean z10 = this.f61100e;
        bc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 8, this.f61101f);
        bc.s(parcel, r10);
    }
}
