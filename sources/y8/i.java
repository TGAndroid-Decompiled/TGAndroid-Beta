package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f59168a;
    public b f59169b;
    public UserAddress f59170c;
    public k d;
    public String f59171e;
    public Bundle f59172f;
    public String h;
    public Bundle f59173n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f59168a);
        wb.k(parcel, 2, this.f59169b, i7);
        wb.k(parcel, 3, this.f59170c, i7);
        wb.k(parcel, 4, this.d, i7);
        wb.l(parcel, 5, this.f59171e);
        wb.b(parcel, 6, this.f59172f);
        wb.l(parcel, 7, this.h);
        wb.b(parcel, 8, this.f59173n);
        wb.s(parcel, r10);
    }
}
