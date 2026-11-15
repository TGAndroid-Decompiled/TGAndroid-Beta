package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f60506a;
    public b f60507b;
    public UserAddress f60508c;
    public k d;
    public String f60509e;
    public Bundle f60510f;
    public String h;
    public Bundle f60511n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f60506a);
        yb.k(parcel, 2, this.f60507b, i7);
        yb.k(parcel, 3, this.f60508c, i7);
        yb.k(parcel, 4, this.d, i7);
        yb.l(parcel, 5, this.f60509e);
        yb.b(parcel, 6, this.f60510f);
        yb.l(parcel, 7, this.h);
        yb.b(parcel, 8, this.f60511n);
        yb.s(parcel, r10);
    }
}
