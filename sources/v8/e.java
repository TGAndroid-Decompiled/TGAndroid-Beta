package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(8);
    public ArrayList f50696a;
    public String f50697b;
    public String f50698c;
    public ArrayList d;
    public boolean e;
    public String f50699f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.h(parcel, 2, this.f50696a);
        h0.l(parcel, 4, this.f50697b);
        h0.l(parcel, 5, this.f50698c);
        h0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        h0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 8, this.f50699f);
        h0.r(parcel, q6);
    }
}
