package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class g extends y5.a {
    public final String f50318a;
    public final k f50319b;
    public final int f50320c;
    public final byte[] d;
    public static final int f50317e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new w7.i(20);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, z6.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: z6.g.<init>(java.lang.String, z6.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f50318a);
        p8.k(parcel, 3, this.f50319b, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f50320c);
        p8.c(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
