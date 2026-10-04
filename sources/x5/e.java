package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f49389a;
    public final a f49390b;
    public final String f49391c;
    public final boolean d;
    public final int f49392e;
    public final c f49393f;
    public final b h;
    public final boolean f49394n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49389a = dVar;
        l.h(aVar);
        this.f49390b = aVar;
        this.f49391c = str;
        this.d = z10;
        this.f49392e = i10;
        this.f49393f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49394n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49389a, eVar.f49389a) || !l.l(this.f49390b, eVar.f49390b) || !l.l(this.f49393f, eVar.f49393f) || !l.l(this.h, eVar.h) || !l.l(this.f49391c, eVar.f49391c) || this.d != eVar.d || this.f49392e != eVar.f49392e || this.f49394n != eVar.f49394n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49389a, this.f49390b, this.f49393f, this.h, this.f49391c, Boolean.valueOf(this.d), Integer.valueOf(this.f49392e), Boolean.valueOf(this.f49394n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f49389a, i10);
        g0.k(parcel, 2, this.f49390b, i10);
        g0.l(parcel, 3, this.f49391c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f49392e);
        g0.k(parcel, 6, this.f49393f, i10);
        g0.k(parcel, 7, this.h, i10);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f49394n ? 1 : 0);
        g0.r(parcel, q6);
    }
}
