package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;
public final class g extends o6.a {
    public final String f44858a;
    public final k f44859b;
    public final int f44860c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new m8.i(25);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, p7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: p7.g.<init>(java.lang.String, p7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f44858a);
        h0.k(parcel, 3, this.f44859b, i10);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f44860c);
        h0.c(parcel, 5, this.d);
        h0.r(parcel, q6);
    }
}
