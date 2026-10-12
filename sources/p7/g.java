package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
public final class g extends o6.a {
    public final String f45379a;
    public final l f45380b;
    public final int f45381c;
    public final byte[] d;
    public static final int f45378e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new m8.h(28);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, p7.l r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: p7.g.<init>(java.lang.String, p7.l, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f45379a);
        c0.k(parcel, 3, this.f45380b, i10);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f45381c);
        c0.c(parcel, 5, this.d);
        c0.r(parcel, q6);
    }
}
