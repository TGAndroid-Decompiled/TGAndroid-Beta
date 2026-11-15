package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f60476a;
    public String f60477b;
    public String f60478c;
    public int d;
    public UserAddress f60479e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f60476a);
        yb.l(parcel, 2, this.f60477b);
        yb.l(parcel, 3, this.f60478c);
        int i10 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 5, this.f60479e, i7);
        yb.s(parcel, r10);
    }
}
