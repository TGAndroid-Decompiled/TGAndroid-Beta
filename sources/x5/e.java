package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45364a;
    public final a f45365b;
    public final String f45366c;
    public final boolean d;
    public final int e;
    public final c f45367f;
    public final b h;
    public final boolean f45368n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45364a = dVar;
        l.h(aVar);
        this.f45365b = aVar;
        this.f45366c = str;
        this.d = z10;
        this.e = i10;
        this.f45367f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45368n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45364a, eVar.f45364a) || !l.l(this.f45365b, eVar.f45365b) || !l.l(this.f45367f, eVar.f45367f) || !l.l(this.h, eVar.h) || !l.l(this.f45366c, eVar.f45366c) || this.d != eVar.d || this.e != eVar.e || this.f45368n != eVar.f45368n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45364a, this.f45365b, this.f45367f, this.h, this.f45366c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45368n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f45364a, i10);
        e0.k(parcel, 2, this.f45365b, i10);
        e0.l(parcel, 3, this.f45366c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        e0.k(parcel, 6, this.f45367f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f45368n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
