package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f59267a;
    public String f59268b;
    public String f59269c;
    public ArrayList d;
    public boolean f59270e;
    public String f59271f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.h(parcel, 2, this.f59267a);
        xb.l(parcel, 4, this.f59268b);
        xb.l(parcel, 5, this.f59269c);
        xb.h(parcel, 6, this.d);
        boolean z9 = this.f59270e;
        xb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 8, this.f59271f);
        xb.s(parcel, r10);
    }
}
