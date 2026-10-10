package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50716a;
    public final a f50717b;
    public final String f50718c;
    public final boolean d;
    public final int f50719e;
    public final c f50720f;
    public final b h;
    public final boolean f50721n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f50716a = dVar;
        l.h(aVar);
        this.f50717b = aVar;
        this.f50718c = str;
        this.d = z10;
        this.f50719e = i10;
        this.f50720f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50721n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f50716a, eVar.f50716a) || !l.l(this.f50717b, eVar.f50717b) || !l.l(this.f50720f, eVar.f50720f) || !l.l(this.h, eVar.h) || !l.l(this.f50718c, eVar.f50718c) || this.d != eVar.d || this.f50719e != eVar.f50719e || this.f50721n != eVar.f50721n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50716a, this.f50717b, this.f50720f, this.h, this.f50718c, Boolean.valueOf(this.d), Integer.valueOf(this.f50719e), Boolean.valueOf(this.f50721n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50716a, i10);
        d0.k(parcel, 2, this.f50717b, i10);
        d0.l(parcel, 3, this.f50718c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f50719e);
        d0.k(parcel, 6, this.f50720f, i10);
        d0.k(parcel, 7, this.h, i10);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f50721n ? 1 : 0);
        d0.r(parcel, q6);
    }
}
