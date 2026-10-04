package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f49381a;
    public final a f49382b;
    public final String f49383c;
    public final boolean d;
    public final int f49384e;
    public final c f49385f;
    public final b h;
    public final boolean f49386n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49381a = dVar;
        l.h(aVar);
        this.f49382b = aVar;
        this.f49383c = str;
        this.d = z10;
        this.f49384e = i10;
        this.f49385f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49386n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49381a, eVar.f49381a) || !l.l(this.f49382b, eVar.f49382b) || !l.l(this.f49385f, eVar.f49385f) || !l.l(this.h, eVar.h) || !l.l(this.f49383c, eVar.f49383c) || this.d != eVar.d || this.f49384e != eVar.f49384e || this.f49386n != eVar.f49386n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49381a, this.f49382b, this.f49385f, this.h, this.f49383c, Boolean.valueOf(this.d), Integer.valueOf(this.f49384e), Boolean.valueOf(this.f49386n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f49381a, i10);
        g0.k(parcel, 2, this.f49382b, i10);
        g0.l(parcel, 3, this.f49383c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f49384e);
        g0.k(parcel, 6, this.f49385f, i10);
        g0.k(parcel, 7, this.h, i10);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f49386n ? 1 : 0);
        g0.r(parcel, q6);
    }
}
