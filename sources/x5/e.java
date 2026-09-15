package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45336a;
    public final a f45337b;
    public final String f45338c;
    public final boolean d;
    public final int e;
    public final c f45339f;
    public final b h;
    public final boolean f45340n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45336a = dVar;
        l.h(aVar);
        this.f45337b = aVar;
        this.f45338c = str;
        this.d = z10;
        this.e = i10;
        this.f45339f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45340n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45336a, eVar.f45336a) || !l.l(this.f45337b, eVar.f45337b) || !l.l(this.f45339f, eVar.f45339f) || !l.l(this.h, eVar.h) || !l.l(this.f45338c, eVar.f45338c) || this.d != eVar.d || this.e != eVar.e || this.f45340n != eVar.f45340n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45336a, this.f45337b, this.f45339f, this.h, this.f45338c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45340n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f45336a, i10);
        e0.k(parcel, 2, this.f45337b, i10);
        e0.l(parcel, 3, this.f45338c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        e0.k(parcel, 6, this.f45339f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f45340n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
