package q3;

import d5.y;
import m3.h;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
public final class b implements k {
    public final y f45986a = new y(4);
    public final y f45987b = new y(9);
    public final y f45988c = new y(11);
    public final y d = new y();
    public final c f45989e;
    public m f45990f;
    public int f45991g;
    public boolean h;
    public long f45992i;
    public int f45993j;
    public int f45994k;
    public int f45995l;
    public long f45996m;
    public boolean f45997n;
    public a f45998o;
    public d f45999p;

    public b() {
        ?? aVar = new a8.a(new j());
        aVar.f46000b = -9223372036854775807L;
        aVar.f46001c = new long[0];
        aVar.d = new long[0];
        this.f45989e = aVar;
        this.f45991g = 1;
    }

    public final y a(l lVar) {
        int i9 = this.f45995l;
        y yVar = this.d;
        byte[] bArr = yVar.f4410a;
        if (i9 > bArr.length) {
            yVar.A(0, new byte[Math.max(bArr.length * 2, i9)]);
        } else {
            yVar.C(0);
        }
        yVar.B(this.f45995l);
        lVar.readFully(yVar.f4410a, 0, this.f45995l);
        return yVar;
    }

    @Override
    public final int b(m3.l r32, m3.n r33) {
        throw new UnsupportedOperationException("Method not decompiled: q3.b.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f45990f = mVar;
    }

    @Override
    public final boolean f(l lVar) {
        y yVar = this.f45986a;
        h hVar = (h) lVar;
        hVar.g(yVar.f4410a, 0, 3, false);
        yVar.C(0);
        if (yVar.t() == 4607062) {
            hVar.g(yVar.f4410a, 0, 2, false);
            yVar.C(0);
            if ((yVar.w() & 250) == 0) {
                hVar.g(yVar.f4410a, 0, 4, false);
                yVar.C(0);
                int e10 = yVar.e();
                hVar.f17238f = 0;
                hVar.a(e10, false);
                hVar.g(yVar.f4410a, 0, 4, false);
                yVar.C(0);
                if (yVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f45991g = 1;
            this.h = false;
        } else {
            this.f45991g = 3;
        }
        this.f45993j = 0;
    }

    @Override
    public final void release() {
    }
}
