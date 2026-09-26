package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f44496a;
    public String f44497b;
    public String f44498c;
    public ArrayList d;
    public boolean e;
    public String f44499f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.h(parcel, 2, this.f44496a);
        f0.l(parcel, 4, this.f44497b);
        f0.l(parcel, 5, this.f44498c);
        f0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        f0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 8, this.f44499f);
        f0.r(parcel, q6);
    }
}
