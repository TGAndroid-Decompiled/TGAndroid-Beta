package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f59287a;
    public b f59288b;
    public UserAddress f59289c;
    public k d;
    public String f59290e;
    public Bundle f59291f;
    public String h;
    public Bundle f59292n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f59287a);
        xb.k(parcel, 2, this.f59288b, i7);
        xb.k(parcel, 3, this.f59289c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.l(parcel, 5, this.f59290e);
        xb.b(parcel, 6, this.f59291f);
        xb.l(parcel, 7, this.h);
        xb.b(parcel, 8, this.f59292n);
        xb.s(parcel, r10);
    }
}
