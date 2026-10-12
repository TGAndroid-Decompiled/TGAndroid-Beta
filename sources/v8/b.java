package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(7);
    public String f49661a;
    public String f49662b;
    public String f49663c;
    public int d;
    public UserAddress f49664e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f49661a);
        c0.l(parcel, 2, this.f49662b);
        c0.l(parcel, 3, this.f49663c);
        int i11 = this.d;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        c0.k(parcel, 5, this.f49664e, i10);
        c0.r(parcel, q6);
    }
}
