package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new q7.m(26);
    public String f51098a;
    public b f51099b;
    public UserAddress f51100c;
    public k d;
    public String e;
    public Bundle f51101f;
    public String h;
    public Bundle f51102n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f51098a);
        df.k(parcel, 2, this.f51099b, i10);
        df.k(parcel, 3, this.f51100c, i10);
        df.k(parcel, 4, this.d, i10);
        df.l(parcel, 5, this.e);
        df.b(parcel, 6, this.f51101f);
        df.l(parcel, 7, this.h);
        df.b(parcel, 8, this.f51102n);
        df.r(parcel, q5);
    }
}
