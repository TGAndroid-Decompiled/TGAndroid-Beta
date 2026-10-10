package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f49487a;
    public String f49488b;
    public String f49489c;
    public ArrayList d;
    public boolean f49490e;
    public String f49491f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.h(parcel, 2, this.f49487a);
        d0.l(parcel, 4, this.f49488b);
        d0.l(parcel, 5, this.f49489c);
        d0.h(parcel, 6, this.d);
        boolean z10 = this.f49490e;
        d0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 8, this.f49491f);
        d0.r(parcel, q6);
    }
}
