package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f44676a;
    public final a f44677b;
    public final String f44678c;
    public final boolean d;
    public final int e;
    public final c f44679f;
    public final b h;
    public final boolean f44680n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f44676a = dVar;
        l.h(aVar);
        this.f44677b = aVar;
        this.f44678c = str;
        this.d = z10;
        this.e = i10;
        this.f44679f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f44680n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f44676a, eVar.f44676a) || !l.l(this.f44677b, eVar.f44677b) || !l.l(this.f44679f, eVar.f44679f) || !l.l(this.h, eVar.h) || !l.l(this.f44678c, eVar.f44678c) || this.d != eVar.d || this.e != eVar.e || this.f44680n != eVar.f44680n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44676a, this.f44677b, this.f44679f, this.h, this.f44678c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f44680n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f44676a, i10);
        e0.k(parcel, 2, this.f44677b, i10);
        e0.l(parcel, 3, this.f44678c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        e0.k(parcel, 6, this.f44679f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f44680n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
