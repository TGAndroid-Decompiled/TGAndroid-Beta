package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n4.x;
public final class g extends p6.a {
    public final String f47025a;
    public final k f47026b;
    public final int f47027c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new x(26);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, q7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: q7.g.<init>(java.lang.String, q7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f47025a);
        df.k(parcel, 3, this.f47026b, i10);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f47027c);
        df.c(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
