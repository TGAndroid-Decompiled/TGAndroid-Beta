package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(5);
    public String f46863a;
    public String f46864b;
    public String f46865c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f46863a);
        g0.l(parcel, 2, this.f46864b);
        g0.l(parcel, 3, this.f46865c);
        int i11 = this.d;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.k(parcel, 5, this.e, i10);
        g0.r(parcel, q6);
    }
}
