package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f59178a;
    public String f59179b;
    public String f59180c;
    public ArrayList d;
    public boolean f59181e;
    public String f59182f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.h(parcel, 2, this.f59178a);
        xb.l(parcel, 4, this.f59179b);
        xb.l(parcel, 5, this.f59180c);
        xb.h(parcel, 6, this.d);
        boolean z9 = this.f59181e;
        xb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 8, this.f59182f);
        xb.s(parcel, r10);
    }
}
