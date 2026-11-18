package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f61774a;
    public String f61775b;
    public ArrayList f61776c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61774a);
        bc.l(parcel, 3, this.f61775b);
        bc.p(parcel, 4, this.f61776c);
        bc.s(parcel, r10);
    }
}
