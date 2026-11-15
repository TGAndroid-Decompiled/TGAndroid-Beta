package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import q4.x;
public final class g extends r6.a {
    public final String f56511a;
    public final k f56512b;
    public final int f56513c;
    public final byte[] d;
    public static final int f56510e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new x(18);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, s7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: s7.g.<init>(java.lang.String, s7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f56511a);
        yb.k(parcel, 3, this.f56512b, i7);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f56513c);
        yb.c(parcel, 5, this.d);
        yb.s(parcel, r10);
    }
}
