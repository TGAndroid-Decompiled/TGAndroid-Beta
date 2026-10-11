package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50794a;
    public final a f50795b;
    public final String f50796c;
    public final boolean d;
    public final int f50797e;
    public final c f50798f;
    public final b h;
    public final boolean f50799n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        m.h(dVar);
        this.f50794a = dVar;
        m.h(aVar);
        this.f50795b = aVar;
        this.f50796c = str;
        this.d = z10;
        this.f50797e = i10;
        this.f50798f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50799n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f50794a, eVar.f50794a) || !m.l(this.f50795b, eVar.f50795b) || !m.l(this.f50798f, eVar.f50798f) || !m.l(this.h, eVar.h) || !m.l(this.f50796c, eVar.f50796c) || this.d != eVar.d || this.f50797e != eVar.f50797e || this.f50799n != eVar.f50799n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50794a, this.f50795b, this.f50798f, this.h, this.f50796c, Boolean.valueOf(this.d), Integer.valueOf(this.f50797e), Boolean.valueOf(this.f50799n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50794a, i10);
        d0.k(parcel, 2, this.f50795b, i10);
        d0.l(parcel, 3, this.f50796c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f50797e);
        d0.k(parcel, 6, this.f50798f, i10);
        d0.k(parcel, 7, this.h, i10);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f50799n ? 1 : 0);
        d0.r(parcel, q6);
    }
}
