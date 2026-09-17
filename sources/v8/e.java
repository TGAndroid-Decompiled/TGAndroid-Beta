package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f47724a;
    public String f47725b;
    public String f47726c;
    public ArrayList d;
    public boolean f47727e;
    public String f47728f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.h(parcel, 2, this.f47724a);
        e0.l(parcel, 4, this.f47725b);
        e0.l(parcel, 5, this.f47726c);
        e0.h(parcel, 6, this.d);
        boolean z10 = this.f47727e;
        e0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 8, this.f47728f);
        e0.r(parcel, q6);
    }
}
