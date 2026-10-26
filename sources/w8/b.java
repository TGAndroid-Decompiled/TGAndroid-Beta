package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(5);
    public String f51074a;
    public String f51075b;
    public String f51076c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f51074a);
        df.l(parcel, 2, this.f51075b);
        df.l(parcel, 3, this.f51076c);
        int i11 = this.d;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.k(parcel, 5, this.e, i10);
        df.r(parcel, q5);
    }
}
