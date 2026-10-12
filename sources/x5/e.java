package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f47907a;
    public final a f47908b;
    public final String f47909c;
    public final boolean d;
    public final int e;
    public final c f47910f;
    public final b h;
    public final boolean f47911n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f47907a = dVar;
        l.h(aVar);
        this.f47908b = aVar;
        this.f47909c = str;
        this.d = z10;
        this.e = i10;
        this.f47910f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f47911n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f47907a, eVar.f47907a) || !l.l(this.f47908b, eVar.f47908b) || !l.l(this.f47910f, eVar.f47910f) || !l.l(this.h, eVar.h) || !l.l(this.f47909c, eVar.f47909c) || this.d != eVar.d || this.e != eVar.e || this.f47911n != eVar.f47911n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47907a, this.f47908b, this.f47910f, this.h, this.f47909c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f47911n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f47907a, i10);
        g0.k(parcel, 2, this.f47908b, i10);
        g0.l(parcel, 3, this.f47909c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g0.k(parcel, 6, this.f47910f, i10);
        g0.k(parcel, 7, this.h, i10);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f47911n ? 1 : 0);
        g0.r(parcel, q6);
    }
}
