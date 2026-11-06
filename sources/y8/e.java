package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f59173a;
    public String f59174b;
    public String f59175c;
    public ArrayList d;
    public boolean f59176e;
    public String f59177f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.h(parcel, 2, this.f59173a);
        wb.l(parcel, 4, this.f59174b);
        wb.l(parcel, 5, this.f59175c);
        wb.h(parcel, 6, this.d);
        boolean z9 = this.f59176e;
        wb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 8, this.f59177f);
        wb.s(parcel, r10);
    }
}
