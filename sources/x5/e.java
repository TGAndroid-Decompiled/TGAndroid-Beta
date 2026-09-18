package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45587a;
    public final a f45588b;
    public final String f45589c;
    public final boolean d;
    public final int e;
    public final c f45590f;
    public final b h;
    public final boolean f45591n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45587a = dVar;
        l.h(aVar);
        this.f45588b = aVar;
        this.f45589c = str;
        this.d = z10;
        this.e = i10;
        this.f45590f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45591n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45587a, eVar.f45587a) || !l.l(this.f45588b, eVar.f45588b) || !l.l(this.f45590f, eVar.f45590f) || !l.l(this.h, eVar.h) || !l.l(this.f45589c, eVar.f45589c) || this.d != eVar.d || this.e != eVar.e || this.f45591n != eVar.f45591n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45587a, this.f45588b, this.f45590f, this.h, this.f45589c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45591n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f45587a, i10);
        f0.k(parcel, 2, this.f45588b, i10);
        f0.l(parcel, 3, this.f45589c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f45590f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f45591n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
