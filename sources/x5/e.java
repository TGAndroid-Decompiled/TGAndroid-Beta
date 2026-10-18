package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f49340a;
    public final a f49341b;
    public final String f49342c;
    public final boolean d;
    public final int e;
    public final c f49343f;
    public final b h;
    public final boolean f49344n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49340a = dVar;
        l.h(aVar);
        this.f49341b = aVar;
        this.f49342c = str;
        this.d = z10;
        this.e = i10;
        this.f49343f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49344n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49340a, eVar.f49340a) || !l.l(this.f49341b, eVar.f49341b) || !l.l(this.f49343f, eVar.f49343f) || !l.l(this.h, eVar.h) || !l.l(this.f49342c, eVar.f49342c) || this.d != eVar.d || this.e != eVar.e || this.f49344n != eVar.f49344n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49340a, this.f49341b, this.f49343f, this.h, this.f49342c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f49344n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f49340a, i10);
        f0.k(parcel, 2, this.f49341b, i10);
        f0.l(parcel, 3, this.f49342c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f49343f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f49344n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
