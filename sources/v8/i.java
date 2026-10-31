package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.h0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.n(25);
    public String f50700a;
    public b f50701b;
    public UserAddress f50702c;
    public k d;
    public String e;
    public Bundle f50703f;
    public String h;
    public Bundle f50704n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f50700a);
        h0.k(parcel, 2, this.f50701b, i10);
        h0.k(parcel, 3, this.f50702c, i10);
        h0.k(parcel, 4, this.d, i10);
        h0.l(parcel, 5, this.e);
        h0.b(parcel, 6, this.f50703f);
        h0.l(parcel, 7, this.h);
        h0.b(parcel, 8, this.f50704n);
        h0.r(parcel, q6);
    }
}
