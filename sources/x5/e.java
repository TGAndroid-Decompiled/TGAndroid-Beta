package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f49380a;
    public final a f49381b;
    public final String f49382c;
    public final boolean d;
    public final int f49383e;
    public final c f49384f;
    public final b h;
    public final boolean f49385n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49380a = dVar;
        l.h(aVar);
        this.f49381b = aVar;
        this.f49382c = str;
        this.d = z10;
        this.f49383e = i10;
        this.f49384f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49385n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49380a, eVar.f49380a) || !l.l(this.f49381b, eVar.f49381b) || !l.l(this.f49384f, eVar.f49384f) || !l.l(this.h, eVar.h) || !l.l(this.f49382c, eVar.f49382c) || this.d != eVar.d || this.f49383e != eVar.f49383e || this.f49385n != eVar.f49385n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49380a, this.f49381b, this.f49384f, this.h, this.f49382c, Boolean.valueOf(this.d), Integer.valueOf(this.f49383e), Boolean.valueOf(this.f49385n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f49380a, i10);
        g0.k(parcel, 2, this.f49381b, i10);
        g0.l(parcel, 3, this.f49382c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f49383e);
        g0.k(parcel, 6, this.f49384f, i10);
        g0.k(parcel, 7, this.h, i10);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f49385n ? 1 : 0);
        g0.r(parcel, q6);
    }
}
