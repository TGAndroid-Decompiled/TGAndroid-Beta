package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50672a;
    public final a f50673b;
    public final String f50674c;
    public final boolean d;
    public final int f50675e;
    public final c f50676f;
    public final b h;
    public final boolean f50677n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f50672a = dVar;
        l.h(aVar);
        this.f50673b = aVar;
        this.f50674c = str;
        this.d = z10;
        this.f50675e = i10;
        this.f50676f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50677n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f50672a, eVar.f50672a) || !l.l(this.f50673b, eVar.f50673b) || !l.l(this.f50676f, eVar.f50676f) || !l.l(this.h, eVar.h) || !l.l(this.f50674c, eVar.f50674c) || this.d != eVar.d || this.f50675e != eVar.f50675e || this.f50677n != eVar.f50677n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50672a, this.f50673b, this.f50676f, this.h, this.f50674c, Boolean.valueOf(this.d), Integer.valueOf(this.f50675e), Boolean.valueOf(this.f50677n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50672a, i10);
        d0.k(parcel, 2, this.f50673b, i10);
        d0.l(parcel, 3, this.f50674c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f50675e);
        d0.k(parcel, 6, this.f50676f, i10);
        d0.k(parcel, 7, this.h, i10);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f50677n ? 1 : 0);
        d0.r(parcel, q6);
    }
}
