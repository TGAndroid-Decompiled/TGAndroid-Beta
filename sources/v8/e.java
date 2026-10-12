package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f49671a;
    public String f49672b;
    public String f49673c;
    public ArrayList d;
    public boolean f49674e;
    public String f49675f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.h(parcel, 2, this.f49671a);
        c0.l(parcel, 4, this.f49672b);
        c0.l(parcel, 5, this.f49673c);
        c0.h(parcel, 6, this.d);
        boolean z10 = this.f49674e;
        c0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.l(parcel, 8, this.f49675f);
        c0.r(parcel, q6);
    }
}
