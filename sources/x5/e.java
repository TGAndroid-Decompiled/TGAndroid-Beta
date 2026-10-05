package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f49396a;
    public final a f49397b;
    public final String f49398c;
    public final boolean d;
    public final int f49399e;
    public final c f49400f;
    public final b h;
    public final boolean f49401n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49396a = dVar;
        l.h(aVar);
        this.f49397b = aVar;
        this.f49398c = str;
        this.d = z10;
        this.f49399e = i10;
        this.f49400f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49401n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49396a, eVar.f49396a) || !l.l(this.f49397b, eVar.f49397b) || !l.l(this.f49400f, eVar.f49400f) || !l.l(this.h, eVar.h) || !l.l(this.f49398c, eVar.f49398c) || this.d != eVar.d || this.f49399e != eVar.f49399e || this.f49401n != eVar.f49401n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49396a, this.f49397b, this.f49400f, this.h, this.f49398c, Boolean.valueOf(this.d), Integer.valueOf(this.f49399e), Boolean.valueOf(this.f49401n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f49396a, i10);
        g0.k(parcel, 2, this.f49397b, i10);
        g0.l(parcel, 3, this.f49398c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f49399e);
        g0.k(parcel, 6, this.f49400f, i10);
        g0.k(parcel, 7, this.h, i10);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f49401n ? 1 : 0);
        g0.r(parcel, q6);
    }
}
