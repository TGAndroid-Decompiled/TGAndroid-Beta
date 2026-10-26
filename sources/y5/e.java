package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f52052a;
    public final a f52053b;
    public final String f52054c;
    public final boolean d;
    public final int e;
    public final c f52055f;
    public final b h;
    public final boolean f52056n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f52052a = dVar;
        l.h(aVar);
        this.f52053b = aVar;
        this.f52054c = str;
        this.d = z10;
        this.e = i10;
        this.f52055f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f52056n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f52052a, eVar.f52052a) || !l.l(this.f52053b, eVar.f52053b) || !l.l(this.f52055f, eVar.f52055f) || !l.l(this.h, eVar.h) || !l.l(this.f52054c, eVar.f52054c) || this.d != eVar.d || this.e != eVar.e || this.f52056n != eVar.f52056n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52052a, this.f52053b, this.f52055f, this.h, this.f52054c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f52056n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f52052a, i10);
        df.k(parcel, 2, this.f52053b, i10);
        df.l(parcel, 3, this.f52054c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.k(parcel, 6, this.f52055f, i10);
        df.k(parcel, 7, this.h, i10);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f52056n ? 1 : 0);
        df.r(parcel, q5);
    }
}
