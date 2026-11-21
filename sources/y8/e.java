package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f61093a;
    public String f61094b;
    public String f61095c;
    public ArrayList d;
    public boolean f61096e;
    public String f61097f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.h(parcel, 2, this.f61093a);
        bc.l(parcel, 4, this.f61094b);
        bc.l(parcel, 5, this.f61095c);
        bc.h(parcel, 6, this.d);
        boolean z10 = this.f61096e;
        bc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 8, this.f61097f);
        bc.s(parcel, r10);
    }
}
