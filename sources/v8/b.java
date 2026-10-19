package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(5);
    public String f48250a;
    public String f48251b;
    public String f48252c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f48250a);
        f0.l(parcel, 2, this.f48251b);
        f0.l(parcel, 3, this.f48252c);
        int i11 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.k(parcel, 5, this.e, i10);
        f0.r(parcel, q6);
    }
}
