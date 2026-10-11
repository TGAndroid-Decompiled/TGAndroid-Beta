package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50760a;
    public final a f50761b;
    public final String f50762c;
    public final boolean d;
    public final int f50763e;
    public final c f50764f;
    public final b h;
    public final boolean f50765n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        m.h(dVar);
        this.f50760a = dVar;
        m.h(aVar);
        this.f50761b = aVar;
        this.f50762c = str;
        this.d = z10;
        this.f50763e = i10;
        this.f50764f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50765n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f50760a, eVar.f50760a) || !m.l(this.f50761b, eVar.f50761b) || !m.l(this.f50764f, eVar.f50764f) || !m.l(this.h, eVar.h) || !m.l(this.f50762c, eVar.f50762c) || this.d != eVar.d || this.f50763e != eVar.f50763e || this.f50765n != eVar.f50765n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50760a, this.f50761b, this.f50764f, this.h, this.f50762c, Boolean.valueOf(this.d), Integer.valueOf(this.f50763e), Boolean.valueOf(this.f50765n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50760a, i10);
        d0.k(parcel, 2, this.f50761b, i10);
        d0.l(parcel, 3, this.f50762c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f50763e);
        d0.k(parcel, 6, this.f50764f, i10);
        d0.k(parcel, 7, this.h, i10);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f50765n ? 1 : 0);
        d0.r(parcel, q6);
    }
}
