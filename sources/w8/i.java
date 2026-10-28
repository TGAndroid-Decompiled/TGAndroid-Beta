package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new q7.m(26);
    public String f51159a;
    public b f51160b;
    public UserAddress f51161c;
    public k d;
    public String e;
    public Bundle f51162f;
    public String h;
    public Bundle f51163n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f51159a);
        df.k(parcel, 2, this.f51160b, i10);
        df.k(parcel, 3, this.f51161c, i10);
        df.k(parcel, 4, this.d, i10);
        df.l(parcel, 5, this.e);
        df.b(parcel, 6, this.f51162f);
        df.l(parcel, 7, this.h);
        df.b(parcel, 8, this.f51163n);
        df.r(parcel, q5);
    }
}
