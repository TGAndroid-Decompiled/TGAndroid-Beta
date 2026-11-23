package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f61784a;
    public String f61785b;
    public ArrayList f61786c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61784a);
        cc.l(parcel, 3, this.f61785b);
        cc.p(parcel, 4, this.f61786c);
        cc.s(parcel, r10);
    }
}
