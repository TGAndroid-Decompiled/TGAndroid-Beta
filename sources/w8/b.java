package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f50312a;
    public String f50313b;
    public ArrayList f50314c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50312a);
        d0.l(parcel, 3, this.f50313b);
        d0.p(parcel, 4, this.f50314c);
        d0.r(parcel, q6);
    }
}
