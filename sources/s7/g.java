package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import q4.x;
public final class g extends r6.a {
    public final String f57209a;
    public final k f57210b;
    public final int f57211c;
    public final byte[] d;
    public static final int f57208e = Integer.parseInt("-1");
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f57209a);
        cc.k(parcel, 3, this.f57210b, i7);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f57211c);
        cc.c(parcel, 5, this.d);
        cc.s(parcel, r10);
    }
}
