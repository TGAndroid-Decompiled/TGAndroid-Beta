package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.f0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f44531a;
    public b f44532b;
    public UserAddress f44533c;
    public k d;
    public String e;
    public Bundle f44534f;
    public String h;
    public Bundle f44535n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44531a);
        f0.k(parcel, 2, this.f44532b, i10);
        f0.k(parcel, 3, this.f44533c, i10);
        f0.k(parcel, 4, this.d, i10);
        f0.l(parcel, 5, this.e);
        f0.b(parcel, 6, this.f44534f);
        f0.l(parcel, 7, this.h);
        f0.b(parcel, 8, this.f44535n);
        f0.r(parcel, q6);
    }
}
