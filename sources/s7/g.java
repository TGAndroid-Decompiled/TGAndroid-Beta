package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import q4.x;
public final class g extends r6.a {
    public final String f57085a;
    public final k f57086b;
    public final int f57087c;
    public final byte[] d;
    public static final int f57084e = Integer.parseInt("-1");
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57085a);
        bc.k(parcel, 3, this.f57086b, i7);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f57087c);
        bc.c(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
