package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new s(0);
    public ArrayList f50717a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.n(parcel, 1, this.f50717a);
        h0.r(parcel, q6);
    }
}
