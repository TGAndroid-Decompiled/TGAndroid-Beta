package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.s;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(15);
    public String f52750a;
    public String f52751b;
    public ArrayList f52752c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52750a);
        h0.l(parcel, 3, this.f52751b);
        h0.p(parcel, 4, this.f52752c);
        h0.r(parcel, q6);
    }
}
