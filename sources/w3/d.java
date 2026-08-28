package w3;
public final class d implements m3.k {
    public final int f48515a;
    public final d5.y d;
    public final d5.x f48518e;
    public m3.m f48519f;
    public long f48520g;
    public boolean f48522j;
    public boolean f48523k;
    public boolean f48524l;
    public final e f48516b = new e(null, true);
    public final d5.y f48517c = new d5.y(2048);
    public int f48521i = -1;
    public long h = -1;

    public d(int i9) {
        this.f48515a = i9;
        d5.y yVar = new d5.y(10);
        this.d = yVar;
        byte[] bArr = yVar.f4410a;
        this.f48518e = new d5.x(bArr, bArr.length);
    }

    public final int a(m3.l lVar) {
        int i9 = 0;
        while (true) {
            d5.y yVar = this.d;
            lVar.c(0, 10, yVar.f4410a);
            yVar.C(0);
            if (yVar.t() != 4801587) {
                break;
            }
            yVar.D(3);
            int q10 = yVar.q();
            i9 += q10 + 10;
            lVar.n(q10);
        }
        lVar.t();
        lVar.n(i9);
        if (this.h == -1) {
            this.h = i9;
        }
        return i9;
    }

    @Override
    public final int b(m3.l r20, m3.n r21) {
        throw new UnsupportedOperationException("Method not decompiled: w3.d.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48519f = mVar;
        this.f48516b.j(mVar, new d0(0, 1));
        mVar.B();
    }

    @Override
    public final boolean f(m3.l lVar) {
        int a2 = a(lVar);
        int i9 = a2;
        int i10 = 0;
        int i11 = 0;
        do {
            d5.y yVar = this.d;
            m3.h hVar = (m3.h) lVar;
            hVar.g(yVar.f4410a, 0, 2, false);
            yVar.C(0);
            if ((yVar.w() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                hVar.g(yVar.f4410a, 0, 4, false);
                d5.x xVar = this.f48518e;
                xVar.p(14);
                int i12 = xVar.i(13);
                if (i12 <= 6) {
                    i9++;
                    hVar.f17238f = 0;
                    hVar.a(i9, false);
                } else {
                    hVar.a(i12 - 6, false);
                    i11 += i12;
                }
            } else {
                i9++;
                hVar.f17238f = 0;
                hVar.a(i9, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i9 - a2 < 8192);
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48523k = false;
        this.f48516b.h();
        this.f48520g = j11;
    }

    @Override
    public final void release() {
    }
}
