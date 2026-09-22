package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.e0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f44229a;
    public b f44230b;
    public UserAddress f44231c;
    public k d;
    public String e;
    public Bundle f44232f;
    public String h;
    public Bundle f44233n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f44229a);
        e0.k(parcel, 2, this.f44230b, i10);
        e0.k(parcel, 3, this.f44231c, i10);
        e0.k(parcel, 4, this.d, i10);
        e0.l(parcel, 5, this.e);
        e0.b(parcel, 6, this.f44232f);
        e0.l(parcel, 7, this.h);
        e0.b(parcel, 8, this.f44233n);
        e0.r(parcel, q6);
    }
}
