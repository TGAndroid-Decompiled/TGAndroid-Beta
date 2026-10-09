package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f49443a;
    public String f49444b;
    public String f49445c;
    public ArrayList d;
    public boolean f49446e;
    public String f49447f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.h(parcel, 2, this.f49443a);
        d0.l(parcel, 4, this.f49444b);
        d0.l(parcel, 5, this.f49445c);
        d0.h(parcel, 6, this.d);
        boolean z10 = this.f49446e;
        d0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 8, this.f49447f);
        d0.r(parcel, q6);
    }
}
