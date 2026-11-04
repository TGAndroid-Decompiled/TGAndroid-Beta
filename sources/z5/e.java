package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p6.m;
import y8.i;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new i(1);
    public final d f59776a;
    public final a f59777b;
    public final String f59778c;
    public final boolean d;
    public final int f59779e;
    public final c f59780f;
    public final b h;
    public final boolean f59781n;

    public e(d dVar, a aVar, String str, boolean z10, int i3, c cVar, b bVar, boolean z11) {
        m.g(dVar);
        this.f59776a = dVar;
        m.g(aVar);
        this.f59777b = aVar;
        this.f59778c = str;
        this.d = z10;
        this.f59779e = i3;
        this.f59780f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f59781n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.k(this.f59776a, eVar.f59776a) || !m.k(this.f59777b, eVar.f59777b) || !m.k(this.f59780f, eVar.f59780f) || !m.k(this.h, eVar.h) || !m.k(this.f59778c, eVar.f59778c) || this.d != eVar.d || this.f59779e != eVar.f59779e || this.f59781n != eVar.f59781n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59776a, this.f59777b, this.f59780f, this.h, this.f59778c, Boolean.valueOf(this.d), Integer.valueOf(this.f59779e), Boolean.valueOf(this.f59781n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f59776a, i3);
        j8.a.l(parcel, 2, this.f59777b, i3);
        j8.a.m(parcel, 3, this.f59778c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f59779e);
        j8.a.l(parcel, 6, this.f59780f, i3);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.f59781n ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
