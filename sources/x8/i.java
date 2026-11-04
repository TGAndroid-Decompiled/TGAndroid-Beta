package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends q6.a {
    public static final Parcelable.Creator<i> CREATOR = new w8.b(4);
    public String f58544a;
    public b f58545b;
    public UserAddress f58546c;
    public k d;
    public String f58547e;
    public Bundle f58548f;
    public String h;
    public Bundle f58549n;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f58544a);
        j8.a.l(parcel, 2, this.f58545b, i3);
        j8.a.l(parcel, 3, this.f58546c, i3);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.m(parcel, 5, this.f58547e);
        j8.a.c(parcel, 6, this.f58548f);
        j8.a.m(parcel, 7, this.h);
        j8.a.c(parcel, 8, this.f58549n);
        j8.a.t(parcel, s6);
    }
}
