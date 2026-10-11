package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f49550a;
    public b f49551b;
    public UserAddress f49552c;
    public k d;
    public String f49553e;
    public Bundle f49554f;
    public String h;
    public Bundle f49555n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f49550a);
        d0.k(parcel, 2, this.f49551b, i10);
        d0.k(parcel, 3, this.f49552c, i10);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f49553e);
        d0.b(parcel, 6, this.f49554f);
        d0.l(parcel, 7, this.h);
        d0.b(parcel, 8, this.f49555n);
        d0.r(parcel, q6);
    }
}
