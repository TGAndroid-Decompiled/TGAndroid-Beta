package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f59192a;
    public b f59193b;
    public UserAddress f59194c;
    public k d;
    public String f59195e;
    public Bundle f59196f;
    public String h;
    public Bundle f59197n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f59192a);
        xb.k(parcel, 2, this.f59193b, i7);
        xb.k(parcel, 3, this.f59194c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.l(parcel, 5, this.f59195e);
        xb.b(parcel, 6, this.f59196f);
        xb.l(parcel, 7, this.h);
        xb.b(parcel, 8, this.f59197n);
        xb.s(parcel, r10);
    }
}
