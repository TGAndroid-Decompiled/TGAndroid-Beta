package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class g extends o6.a {
    public final String f43155a;
    public final k f43156b;
    public final int f43157c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new m8.h(26);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, p7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: p7.g.<init>(java.lang.String, p7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f43155a);
        g0.k(parcel, 3, this.f43156b, i10);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f43157c);
        g0.c(parcel, 5, this.d);
        g0.r(parcel, q6);
    }
}
