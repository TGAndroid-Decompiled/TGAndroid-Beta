package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f47906a;
    public final a f47907b;
    public final String f47908c;
    public final boolean d;
    public final int e;
    public final c f47909f;
    public final b h;
    public final boolean f47910n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f47906a = dVar;
        l.h(aVar);
        this.f47907b = aVar;
        this.f47908c = str;
        this.d = z10;
        this.e = i10;
        this.f47909f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f47910n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f47906a, eVar.f47906a) || !l.l(this.f47907b, eVar.f47907b) || !l.l(this.f47909f, eVar.f47909f) || !l.l(this.h, eVar.h) || !l.l(this.f47908c, eVar.f47908c) || this.d != eVar.d || this.e != eVar.e || this.f47910n != eVar.f47910n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47906a, this.f47907b, this.f47909f, this.h, this.f47908c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f47910n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f47906a, i10);
        f0.k(parcel, 2, this.f47907b, i10);
        f0.l(parcel, 3, this.f47908c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f47909f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f47910n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
