package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f59138a;
    public String f59139b;
    public String f59140c;
    public int d;
    public UserAddress f59141e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f59138a);
        wb.l(parcel, 2, this.f59139b);
        wb.l(parcel, 3, this.f59140c);
        int i10 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.k(parcel, 5, this.f59141e, i7);
        wb.s(parcel, r10);
    }
}
