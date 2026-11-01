package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(22);
    public final d f53091a;
    public final a f53092b;
    public final String f53093c;
    public final boolean d;
    public final int e;
    public final c f53094f;
    public final b h;
    public final boolean f53095n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.g(dVar);
        this.f53091a = dVar;
        l.g(aVar);
        this.f53092b = aVar;
        this.f53093c = str;
        this.d = z10;
        this.e = i10;
        this.f53094f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f53095n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.k(this.f53091a, eVar.f53091a) || !l.k(this.f53092b, eVar.f53092b) || !l.k(this.f53094f, eVar.f53094f) || !l.k(this.h, eVar.h) || !l.k(this.f53093c, eVar.f53093c) || this.d != eVar.d || this.e != eVar.e || this.f53095n != eVar.f53095n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53091a, this.f53092b, this.f53094f, this.h, this.f53093c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f53095n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f53091a, i10);
        h0.k(parcel, 2, this.f53092b, i10);
        h0.l(parcel, 3, this.f53093c);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        h0.k(parcel, 6, this.f53094f, i10);
        h0.k(parcel, 7, this.h, i10);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.f53095n ? 1 : 0);
        h0.r(parcel, q6);
    }
}
