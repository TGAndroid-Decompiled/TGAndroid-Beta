package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.s;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(16);
    public String f48875a;
    public String f48876b;
    public ArrayList f48877c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48875a);
        f0.l(parcel, 3, this.f48876b);
        f0.p(parcel, 4, this.f48877c);
        f0.r(parcel, q6);
    }
}
