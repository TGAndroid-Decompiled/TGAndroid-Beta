package y3;
public final class d implements o3.k {
    public final int f50248a;
    public final f5.w d;
    public final f5.v f50251e;
    public o3.m f50252f;
    public long f50253g;
    public boolean f50255j;
    public boolean f50256k;
    public boolean f50257l;
    public final e f50249b = new e(null, true);
    public final f5.w f50250c = new f5.w(2048);
    public int f50254i = -1;
    public long h = -1;

    public d(int i10) {
        this.f50248a = i10;
        f5.w wVar = new f5.w(10);
        this.d = wVar;
        byte[] bArr = wVar.f6640a;
        this.f50251e = new f5.v(bArr, bArr.length);
    }

    public final int a(o3.l lVar) {
        int i10 = 0;
        while (true) {
            f5.w wVar = this.d;
            lVar.a(0, 10, wVar.f6640a);
            wVar.C(0);
            if (wVar.t() != 4801587) {
                break;
            }
            wVar.D(3);
            int q6 = wVar.q();
            i10 += q6 + 10;
            lVar.i(q6);
        }
        lVar.s();
        lVar.i(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final int d(o3.l r20, o3.n r21) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(o3.l lVar) {
        int a2 = a(lVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            f5.w wVar = this.d;
            o3.h hVar = (o3.h) lVar;
            hVar.f(wVar.f6640a, 0, 2, false);
            wVar.C(0);
            if ((wVar.w() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.f(wVar.f6640a, 0, 4, false);
                f5.v vVar = this.f50251e;
                vVar.p(14);
                int i13 = vVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f19097f = 0;
                    hVar.b(i10, false);
                } else {
                    hVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f19097f = 0;
                hVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        this.f50256k = false;
        this.f50249b.a();
        this.f50253g = j11;
    }

    @Override
    public final void i(o3.m mVar) {
        this.f50252f = mVar;
        this.f50249b.e(mVar, new d0(0, 1));
        mVar.e1();
    }

    @Override
    public final void release() {
    }
}
