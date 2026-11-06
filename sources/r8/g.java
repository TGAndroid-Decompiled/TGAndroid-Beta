package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
import q6.w;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int f54337a;
    public final w f54338b;

    public g(int i7, w wVar) {
        this.f54337a = i7;
        this.f54338b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f54337a);
        wb.k(parcel, 2, this.f54338b, i7);
        wb.s(parcel, r10);
    }
}
