package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f60486a;
    public String f60487b;
    public String f60488c;
    public ArrayList d;
    public boolean f60489e;
    public String f60490f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.h(parcel, 2, this.f60486a);
        yb.l(parcel, 4, this.f60487b);
        yb.l(parcel, 5, this.f60488c);
        yb.h(parcel, 6, this.d);
        boolean z10 = this.f60489e;
        yb.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 8, this.f60490f);
        yb.s(parcel, r10);
    }
}
