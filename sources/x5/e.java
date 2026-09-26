package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45613a;
    public final a f45614b;
    public final String f45615c;
    public final boolean d;
    public final int e;
    public final c f45616f;
    public final b h;
    public final boolean f45617n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45613a = dVar;
        l.h(aVar);
        this.f45614b = aVar;
        this.f45615c = str;
        this.d = z10;
        this.e = i10;
        this.f45616f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45617n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45613a, eVar.f45613a) || !l.l(this.f45614b, eVar.f45614b) || !l.l(this.f45616f, eVar.f45616f) || !l.l(this.h, eVar.h) || !l.l(this.f45615c, eVar.f45615c) || this.d != eVar.d || this.e != eVar.e || this.f45617n != eVar.f45617n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45613a, this.f45614b, this.f45616f, this.h, this.f45615c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45617n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f45613a, i10);
        f0.k(parcel, 2, this.f45614b, i10);
        f0.l(parcel, 3, this.f45615c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f45616f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f45617n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
