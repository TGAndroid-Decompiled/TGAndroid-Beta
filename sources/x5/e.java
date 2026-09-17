package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f48900a;
    public final a f48901b;
    public final String f48902c;
    public final boolean d;
    public final int f48903e;
    public final c f48904f;
    public final b h;
    public final boolean f48905n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f48900a = dVar;
        l.h(aVar);
        this.f48901b = aVar;
        this.f48902c = str;
        this.d = z10;
        this.f48903e = i10;
        this.f48904f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f48905n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f48900a, eVar.f48900a) || !l.l(this.f48901b, eVar.f48901b) || !l.l(this.f48904f, eVar.f48904f) || !l.l(this.h, eVar.h) || !l.l(this.f48902c, eVar.f48902c) || this.d != eVar.d || this.f48903e != eVar.f48903e || this.f48905n != eVar.f48905n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48900a, this.f48901b, this.f48904f, this.h, this.f48902c, Boolean.valueOf(this.d), Integer.valueOf(this.f48903e), Boolean.valueOf(this.f48905n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f48900a, i10);
        e0.k(parcel, 2, this.f48901b, i10);
        e0.l(parcel, 3, this.f48902c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f48903e);
        e0.k(parcel, 6, this.f48904f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f48905n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
