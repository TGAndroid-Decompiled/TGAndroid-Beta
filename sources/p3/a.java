package p3;

import m3.c;
import m3.d;
import m3.e;
import m3.l;
import m3.n;

public final class a {

    public final m3.a f45345a;

    public final e f45346b;

    public m3.b f45347c;
    public final int d;

    public a(c cVar, e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f45346b = eVar;
        this.d = i10;
        this.f45345a = new m3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j10, n nVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        nVar.f17620a = j10;
        return 1;
    }

    public final int b(l lVar, n nVar) {
        while (true) {
            m3.b bVar = this.f45347c;
            d5.a.j(bVar);
            long j10 = bVar.f17594f;
            long j11 = bVar.f17595g;
            long j12 = bVar.h;
            long j13 = j11 - j10;
            long j14 = this.d;
            e eVar = this.f45346b;
            if (j13 <= j14) {
                this.f45347c = null;
                eVar.f2();
                return c(lVar, j10, nVar);
            }
            long position = j12 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                return c(lVar, j12, nVar);
            }
            lVar.t((int) position);
            lVar.q();
            d dVarP1 = eVar.P1(lVar, bVar.f17591b);
            int i10 = dVarP1.f17596a;
            long j15 = dVarP1.f17597b;
            long j16 = dVarP1.f17598c;
            if (i10 == -3) {
                this.f45347c = null;
                eVar.f2();
                return c(lVar, j12, nVar);
            }
            if (i10 == -2) {
                bVar.d = j15;
                bVar.f17594f = j16;
                bVar.h = m3.b.a(bVar.f17591b, j15, bVar.f17593e, j16, bVar.f17595g, bVar.f17592c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - lVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        lVar.t((int) position2);
                    }
                    this.f45347c = null;
                    eVar.f2();
                    return c(lVar, j16, nVar);
                }
                bVar.f17593e = j15;
                bVar.f17595g = j16;
                bVar.h = m3.b.a(bVar.f17591b, bVar.d, j15, bVar.f17594f, j16, bVar.f17592c);
            }
        }
    }

    public final void d(long j10) {
        m3.b bVar = this.f45347c;
        if (bVar == null || bVar.f17590a != j10) {
            m3.a aVar = this.f45345a;
            this.f45347c = new m3.b(j10, aVar.f17585a.B(j10), aVar.f17587c, aVar.d, aVar.f17588e, aVar.f17589f);
        }
    }
}
