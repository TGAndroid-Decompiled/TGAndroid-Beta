package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.e0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f47715a;
    public b f47716b;
    public UserAddress f47717c;
    public k d;
    public String f47718e;
    public Bundle f47719f;
    public String h;
    public Bundle f47720n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f47715a);
        e0.k(parcel, 2, this.f47716b, i10);
        e0.k(parcel, 3, this.f47717c, i10);
        e0.k(parcel, 4, this.d, i10);
        e0.l(parcel, 5, this.f47718e);
        e0.b(parcel, 6, this.f47719f);
        e0.l(parcel, 7, this.h);
        e0.b(parcel, 8, this.f47720n);
        e0.r(parcel, q6);
    }
}
