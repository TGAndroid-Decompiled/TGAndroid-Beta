package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f52110a;
    public final a f52111b;
    public final String f52112c;
    public final boolean d;
    public final int e;
    public final c f52113f;
    public final b h;
    public final boolean f52114n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f52110a = dVar;
        l.h(aVar);
        this.f52111b = aVar;
        this.f52112c = str;
        this.d = z10;
        this.e = i10;
        this.f52113f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f52114n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f52110a, eVar.f52110a) || !l.l(this.f52111b, eVar.f52111b) || !l.l(this.f52113f, eVar.f52113f) || !l.l(this.h, eVar.h) || !l.l(this.f52112c, eVar.f52112c) || this.d != eVar.d || this.e != eVar.e || this.f52114n != eVar.f52114n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52110a, this.f52111b, this.f52113f, this.h, this.f52112c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f52114n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f52110a, i10);
        df.k(parcel, 2, this.f52111b, i10);
        df.l(parcel, 3, this.f52112c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.k(parcel, 6, this.f52113f, i10);
        df.k(parcel, 7, this.h, i10);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f52114n ? 1 : 0);
        df.r(parcel, q5);
    }
}
