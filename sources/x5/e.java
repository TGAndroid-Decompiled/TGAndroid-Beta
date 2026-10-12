package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50901a;
    public final a f50902b;
    public final String f50903c;
    public final boolean d;
    public final int f50904e;
    public final c f50905f;
    public final b h;
    public final boolean f50906n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        m.h(dVar);
        this.f50901a = dVar;
        m.h(aVar);
        this.f50902b = aVar;
        this.f50903c = str;
        this.d = z10;
        this.f50904e = i10;
        this.f50905f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50906n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f50901a, eVar.f50901a) || !m.l(this.f50902b, eVar.f50902b) || !m.l(this.f50905f, eVar.f50905f) || !m.l(this.h, eVar.h) || !m.l(this.f50903c, eVar.f50903c) || this.d != eVar.d || this.f50904e != eVar.f50904e || this.f50906n != eVar.f50906n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50901a, this.f50902b, this.f50905f, this.h, this.f50903c, Boolean.valueOf(this.d), Integer.valueOf(this.f50904e), Boolean.valueOf(this.f50906n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f50901a, i10);
        c0.k(parcel, 2, this.f50902b, i10);
        c0.l(parcel, 3, this.f50903c);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f50904e);
        c0.k(parcel, 6, this.f50905f, i10);
        c0.k(parcel, 7, this.h, i10);
        c0.s(parcel, 8, 4);
        parcel.writeInt(this.f50906n ? 1 : 0);
        c0.r(parcel, q6);
    }
}
