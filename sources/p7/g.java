package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class g extends o6.a {
    public final String f45486a;
    public final l f45487b;
    public final int f45488c;
    public final byte[] d;
    public static final int f45485e = Integer.parseInt("-1");
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
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45486a);
        d0.k(parcel, 3, this.f45487b, i10);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f45488c);
        d0.c(parcel, 5, this.d);
        d0.r(parcel, q6);
    }
}
