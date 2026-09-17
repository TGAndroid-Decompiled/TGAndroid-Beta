package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45359a;
    public final a f45360b;
    public final String f45361c;
    public final boolean d;
    public final int e;
    public final c f45362f;
    public final b h;
    public final boolean f45363n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45359a = dVar;
        l.h(aVar);
        this.f45360b = aVar;
        this.f45361c = str;
        this.d = z10;
        this.e = i10;
        this.f45362f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45363n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45359a, eVar.f45359a) || !l.l(this.f45360b, eVar.f45360b) || !l.l(this.f45362f, eVar.f45362f) || !l.l(this.h, eVar.h) || !l.l(this.f45361c, eVar.f45361c) || this.d != eVar.d || this.e != eVar.e || this.f45363n != eVar.f45363n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45359a, this.f45360b, this.f45362f, this.h, this.f45361c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45363n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f45359a, i10);
        e0.k(parcel, 2, this.f45360b, i10);
        e0.l(parcel, 3, this.f45361c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        e0.k(parcel, 6, this.f45362f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f45363n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
