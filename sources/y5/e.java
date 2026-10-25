package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f52049a;
    public final a f52050b;
    public final String f52051c;
    public final boolean d;
    public final int e;
    public final c f52052f;
    public final b h;
    public final boolean f52053n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f52049a = dVar;
        l.h(aVar);
        this.f52050b = aVar;
        this.f52051c = str;
        this.d = z10;
        this.e = i10;
        this.f52052f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f52053n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f52049a, eVar.f52049a) || !l.l(this.f52050b, eVar.f52050b) || !l.l(this.f52052f, eVar.f52052f) || !l.l(this.h, eVar.h) || !l.l(this.f52051c, eVar.f52051c) || this.d != eVar.d || this.e != eVar.e || this.f52053n != eVar.f52053n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52049a, this.f52050b, this.f52052f, this.h, this.f52051c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f52053n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f52049a, i10);
        df.k(parcel, 2, this.f52050b, i10);
        df.l(parcel, 3, this.f52051c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.k(parcel, 6, this.f52052f, i10);
        df.k(parcel, 7, this.h, i10);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f52053n ? 1 : 0);
        df.r(parcel, q5);
    }
}
