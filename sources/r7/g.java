package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class g extends q6.a {
    public final String f54411a;
    public final k f54412b;
    public final int f54413c;
    public final byte[] d;
    public static final int f54410e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new q8.i(3);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, r7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: r7.g.<init>(java.lang.String, r7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f54411a);
        j8.a.l(parcel, 3, this.f54412b, i3);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f54413c);
        j8.a.d(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
