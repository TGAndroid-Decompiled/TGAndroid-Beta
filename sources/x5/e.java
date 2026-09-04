package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f48899a;
    public final a f48900b;
    public final String f48901c;
    public final boolean d;
    public final int f48902e;
    public final c f48903f;
    public final b h;
    public final boolean f48904n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f48899a = dVar;
        l.h(aVar);
        this.f48900b = aVar;
        this.f48901c = str;
        this.d = z10;
        this.f48902e = i10;
        this.f48903f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f48904n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f48899a, eVar.f48899a) || !l.l(this.f48900b, eVar.f48900b) || !l.l(this.f48903f, eVar.f48903f) || !l.l(this.h, eVar.h) || !l.l(this.f48901c, eVar.f48901c) || this.d != eVar.d || this.f48902e != eVar.f48902e || this.f48904n != eVar.f48904n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48899a, this.f48900b, this.f48903f, this.h, this.f48901c, Boolean.valueOf(this.d), Integer.valueOf(this.f48902e), Boolean.valueOf(this.f48904n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f48899a, i10);
        e0.k(parcel, 2, this.f48900b, i10);
        e0.l(parcel, 3, this.f48901c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f48902e);
        e0.k(parcel, 6, this.f48903f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f48904n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
