package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f49744a;
    public final a f49745b;
    public final String f49746c;
    public final boolean d;
    public final int e;
    public final c f49747f;
    public final b h;
    public final boolean f49748n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49744a = dVar;
        l.h(aVar);
        this.f49745b = aVar;
        this.f49746c = str;
        this.d = z10;
        this.e = i10;
        this.f49747f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49748n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49744a, eVar.f49744a) || !l.l(this.f49745b, eVar.f49745b) || !l.l(this.f49747f, eVar.f49747f) || !l.l(this.h, eVar.h) || !l.l(this.f49746c, eVar.f49746c) || this.d != eVar.d || this.e != eVar.e || this.f49748n != eVar.f49748n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49744a, this.f49745b, this.f49747f, this.h, this.f49746c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f49748n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f49744a, i10);
        f0.k(parcel, 2, this.f49745b, i10);
        f0.l(parcel, 3, this.f49746c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f49747f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f49748n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
