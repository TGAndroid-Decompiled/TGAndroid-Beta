package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50670a;
    public final a f50671b;
    public final String f50672c;
    public final boolean d;
    public final int f50673e;
    public final c f50674f;
    public final b h;
    public final boolean f50675n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f50670a = dVar;
        l.h(aVar);
        this.f50671b = aVar;
        this.f50672c = str;
        this.d = z10;
        this.f50673e = i10;
        this.f50674f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50675n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f50670a, eVar.f50670a) || !l.l(this.f50671b, eVar.f50671b) || !l.l(this.f50674f, eVar.f50674f) || !l.l(this.h, eVar.h) || !l.l(this.f50672c, eVar.f50672c) || this.d != eVar.d || this.f50673e != eVar.f50673e || this.f50675n != eVar.f50675n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50670a, this.f50671b, this.f50674f, this.h, this.f50672c, Boolean.valueOf(this.d), Integer.valueOf(this.f50673e), Boolean.valueOf(this.f50675n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50670a, i10);
        d0.k(parcel, 2, this.f50671b, i10);
        d0.l(parcel, 3, this.f50672c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f50673e);
        d0.k(parcel, 6, this.f50674f, i10);
        d0.k(parcel, 7, this.h, i10);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f50675n ? 1 : 0);
        d0.r(parcel, q6);
    }
}
