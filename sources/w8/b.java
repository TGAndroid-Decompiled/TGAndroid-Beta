package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f50418a;
    public String f50419b;
    public ArrayList f50420c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f50418a);
        c0.l(parcel, 3, this.f50419b);
        c0.p(parcel, 4, this.f50420c);
        c0.r(parcel, q6);
    }
}
