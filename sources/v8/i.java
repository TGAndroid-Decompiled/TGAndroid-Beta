package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.c0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f49691a;
    public b f49692b;
    public UserAddress f49693c;
    public k d;
    public String f49694e;
    public Bundle f49695f;
    public String h;
    public Bundle f49696n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f49691a);
        c0.k(parcel, 2, this.f49692b, i10);
        c0.k(parcel, 3, this.f49693c, i10);
        c0.k(parcel, 4, this.d, i10);
        c0.l(parcel, 5, this.f49694e);
        c0.b(parcel, 6, this.f49695f);
        c0.l(parcel, 7, this.h);
        c0.b(parcel, 8, this.f49696n);
        c0.r(parcel, q6);
    }
}
