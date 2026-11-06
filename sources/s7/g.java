package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import q4.x;
public final class g extends r6.a {
    public final String f54852a;
    public final k f54853b;
    public final int f54854c;
    public final byte[] d;
    public static final int f54851e = Integer.parseInt("-1");
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
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f54852a);
        wb.k(parcel, 3, this.f54853b, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f54854c);
        wb.c(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
