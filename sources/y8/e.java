package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f61062a;
    public String f61063b;
    public String f61064c;
    public ArrayList d;
    public boolean f61065e;
    public String f61066f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.h(parcel, 2, this.f61062a);
        cc.l(parcel, 4, this.f61063b);
        cc.l(parcel, 5, this.f61064c);
        cc.h(parcel, 6, this.d);
        boolean z10 = this.f61065e;
        cc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 8, this.f61066f);
        cc.s(parcel, r10);
    }
}
