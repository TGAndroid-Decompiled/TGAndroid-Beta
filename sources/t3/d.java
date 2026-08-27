package t3;

import a9.i;
import a9.p;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.o0;
import java.io.EOFException;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.q;
import m3.w;

public final class d implements k {

    public final int f48018a;

    public final long f48019b;

    public final z f48020c;
    public final o0 d;

    public final q f48021e;

    public final i f48022f;

    public final j f48023g;
    public m h;

    public w f48024i;

    public w f48025j;

    public int f48026k;

    public z3.c f48027l;

    public long f48028m;

    public long f48029n;

    public long f48030o;

    public int f48031p;

    public f f48032q;

    public boolean f48033r;

    public boolean f48034s;

    public long f48035t;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        z zVar = this.f48020c;
        lVar.b(0, 4, zVar.f4858a);
        zVar.C(0);
        int iE = zVar.e();
        o0 o0Var = this.d;
        o0Var.a(iE);
        return new a(lVar.getLength(), o0Var.f12396e, o0Var.f12394b, z10, lVar.getPosition());
    }

    @Override
    public final int b(l lVar, n nVar) throws Throwable {
        int i10;
        int i11;
        long j10;
        f fVar;
        z zVar;
        Throwable th;
        long j11;
        long j12;
        long j13;
        int iB;
        int i12;
        int iE;
        z zVar2;
        int i13;
        int iE2;
        q qVar;
        m3.h hVar;
        int iE3;
        f fVarA;
        q qVar2;
        int i14;
        int i15;
        int iU;
        h hVar2;
        z3.c cVar;
        long j14;
        c cVar2;
        f fVarA2;
        z3.b[] bVarArr;
        int length;
        int i16;
        z3.b bVar;
        e4.l lVar2;
        int[] iArr;
        long jH;
        int length2;
        long[] jArr;
        long[] jArr2;
        long j15;
        int i17;
        z3.b[] bVarArr2;
        int length3;
        int i18;
        z3.b bVar2;
        e4.n nVar2;
        q qVar3;
        int iR;
        this = this;
        d5.a.j(this.f48024i);
        int i19 = g0.f4795a;
        int i20 = this.f48026k;
        o0 o0Var = this.d;
        if (i20 == 0) {
            try {
                this.e(lVar, false);
                fVar = this.f48032q;
                zVar = this.f48020c;
                if (fVar == null) {
                    zVar2 = new z(o0Var.f12394b);
                    j10 = 1000000;
                    ((m3.h) lVar).g(zVar2.f4858a, 0, o0Var.f12394b, false);
                    i13 = 21;
                    if ((o0Var.f12393a & 1) != 0) {
                        if (o0Var.d != 1) {
                            i13 = 36;
                        }
                    } else if (o0Var.d == 1) {
                        i13 = 13;
                    }
                    th = null;
                    j11 = 0;
                    if (zVar2.f4860c >= i13 + 4) {
                        zVar2.C(i13);
                        iE2 = zVar2.e();
                        if (iE2 != 1483304551 && iE2 != 1231971951) {
                            if (zVar2.f4860c >= 40) {
                                zVar2.C(36);
                                if (zVar2.e() == 1447187017) {
                                    iE2 = 1447187017;
                                } else {
                                    iE2 = 0;
                                }
                            } else {
                                iE2 = 0;
                            }
                        }
                    } else if (zVar2.f4860c >= 40) {
                        zVar2.C(36);
                        if (zVar2.e() == 1447187017) {
                            iE2 = 1447187017;
                        } else {
                            iE2 = 0;
                        }
                    } else {
                        iE2 = 0;
                    }
                    qVar = this.f48021e;
                    if (iE2 != 1483304551 || iE2 == 1231971951) {
                        hVar = (m3.h) lVar;
                        long j16 = hVar.f17612c;
                        long j17 = hVar.d;
                        int i21 = o0Var.f12397f;
                        int i22 = o0Var.f12395c;
                        iE3 = zVar2.e();
                        if ((iE3 & 1) == 1 || (iU = zVar2.u()) == 0) {
                            fVarA = null;
                        } else {
                            long jO = g0.O(iU, ((long) i21) * 1000000, i22);
                            if ((iE3 & 6) != 6) {
                                hVar2 = new h(j17, o0Var.f12394b, jO, -1L, null);
                            } else {
                                long jS = zVar2.s();
                                long[] jArr3 = new long[100];
                                for (int i23 = 0; i23 < 100; i23++) {
                                    jArr3[i23] = zVar2.r();
                                }
                                if (j16 != -1) {
                                    long j18 = j17 + jS;
                                    if (j16 != j18) {
                                        StringBuilder sbQ = p.q(j16, "XING data size mismatch: ", ", ");
                                        sbQ.append(j18);
                                        d5.a.K("XingSeeker", sbQ.toString());
                                    }
                                }
                                hVar2 = new h(j17, o0Var.f12394b, jO, jS, jArr3);
                            }
                            fVarA = hVar2;
                        }
                        qVar2 = qVar;
                        if (fVarA != null && (qVar2.f17627a == -1 || qVar2.f17628b == -1)) {
                            hVar.f17614f = 0;
                            hVar.a(i13 + 141, false);
                            hVar.g(zVar.f4858a, 0, 3, false);
                            zVar.C(0);
                            int iT = zVar.t();
                            i14 = iT >> 12;
                            i15 = iT & 4095;
                            if (i14 <= 0 || i15 > 0) {
                                qVar2.f17627a = i14;
                                qVar2.f17628b = i15;
                            }
                        }
                        hVar.t(o0Var.f12394b);
                        if (fVarA == null && !fVarA.e() && iE2 == 1231971951) {
                            this = this;
                            lVar = lVar;
                            fVarA = this.a(lVar, false);
                        } else {
                            this = this;
                            lVar = lVar;
                        }
                    } else {
                        if (iE2 == 1447187017) {
                            m3.h hVar3 = (m3.h) lVar;
                            long j19 = hVar3.f17612c;
                            long j20 = hVar3.d;
                            zVar2.D(10);
                            int iE4 = zVar2.e();
                            if (iE4 > 0) {
                                int i24 = o0Var.f12395c;
                                long jO2 = g0.O(iE4, ((long) (i24 >= 32000 ? 1152 : 576)) * 1000000, i24);
                                int iW = zVar2.w();
                                int iW2 = zVar2.w();
                                int iW3 = zVar2.w();
                                zVar2.D(2);
                                long j21 = j20 + ((long) o0Var.f12394b);
                                long[] jArr4 = new long[iW];
                                long[] jArr5 = new long[iW];
                                long j22 = j20;
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= iW) {
                                        long[] jArr6 = jArr5;
                                        qVar3 = qVar;
                                        if (j19 != -1 && j19 != j22) {
                                            StringBuilder sbQ2 = p.q(j19, "VBRI data size mismatch: ", ", ");
                                            sbQ2.append(j22);
                                            d5.a.K("VbriSeeker", sbQ2.toString());
                                        }
                                        fVarA = new g(jArr4, jArr6, jO2, j22);
                                        break;
                                    }
                                    long[] jArr7 = jArr5;
                                    qVar3 = qVar;
                                    jArr4[i25] = (((long) i25) * jO2) / ((long) iW);
                                    jArr7[i25] = Math.max(j22, j21);
                                    if (iW3 == 1) {
                                        iR = zVar2.r();
                                    } else if (iW3 == 2) {
                                        iR = zVar2.w();
                                    } else if (iW3 == 3) {
                                        iR = zVar2.t();
                                    } else {
                                        if (iW3 != 4) {
                                            fVarA = null;
                                            break;
                                        }
                                        iR = zVar2.u();
                                    }
                                    j22 += ((long) iR) * ((long) iW2);
                                    i25++;
                                    qVar = qVar3;
                                    iW3 = iW3;
                                    jArr5 = jArr7;
                                }
                            } else {
                                fVarA = null;
                                qVar3 = qVar;
                            }
                            hVar3.t(o0Var.f12394b);
                        } else {
                            qVar3 = qVar;
                            ((m3.h) lVar).f17614f = 0;
                            fVarA = null;
                        }
                        qVar2 = qVar3;
                    }
                    cVar = this.f48027l;
                    m3.h hVar4 = (m3.h) lVar;
                    j14 = hVar4.d;
                    if (cVar != null) {
                        cVar2 = null;
                        break;
                    }
                    bVarArr = cVar.f50188a;
                    length = bVarArr.length;
                    i16 = 0;
                    while (true) {
                        if (i16 < length) {
                            cVar2 = null;
                            break;
                        }
                        bVar = bVarArr[i16];
                        if (bVar instanceof e4.l) {
                            lVar2 = (e4.l) bVar;
                            iArr = lVar2.f5214e;
                            if (cVar != null) {
                                jH = -9223372036854775807L;
                                break;
                            }
                            bVarArr2 = cVar.f50188a;
                            length3 = bVarArr2.length;
                            i18 = 0;
                            while (true) {
                                if (i18 < length3) {
                                    jH = -9223372036854775807L;
                                    break;
                                }
                                bVar2 = bVarArr2[i18];
                                if (bVar2 instanceof e4.n) {
                                    nVar2 = (e4.n) bVar2;
                                    if (nVar2.f5209a.equals("TLEN")) {
                                        jH = g0.H(Long.parseLong((String) nVar2.f5219c.get(0)));
                                        break;
                                    }
                                }
                                i18++;
                            }
                            length2 = iArr.length;
                            int i26 = length2 + 1;
                            jArr = new long[i26];
                            jArr2 = new long[i26];
                            jArr[0] = j14;
                            jArr2[0] = 0;
                            j15 = 0;
                            i17 = 1;
                            while (i17 <= length2) {
                                int i27 = i17 - 1;
                                long j23 = j14 + ((long) (lVar2.f5213c + iArr[i27]));
                                j15 += (long) (lVar2.d + lVar2.f5215f[i27]);
                                jArr[i17] = j23;
                                jArr2[i17] = j15;
                                i17++;
                                length2 = length2;
                                j14 = j23;
                            }
                            cVar2 = new c(jH, jArr, jArr2);
                            break;
                        }
                        i16++;
                    }
                    if (this.f48033r) {
                        fVarA2 = new e(-9223372036854775807L);
                    } else {
                        if (cVar2 != null) {
                            fVarA = cVar2;
                        } else if (fVarA == null) {
                            fVarA = null;
                        }
                        fVarA2 = (fVarA == null && (fVarA.e() || (this.f48018a & 1) == 0)) ? fVarA : this.a(lVar, false);
                    }
                    this.f48032q = fVarA2;
                    this.h.n(fVarA2);
                    w wVar = this.f48025j;
                    s0 s0Var = new s0();
                    s0Var.f8135o = (String) o0Var.f12398g;
                    s0Var.f8136p = 4096;
                    s0Var.B = o0Var.d;
                    s0Var.C = o0Var.f12395c;
                    s0Var.E = qVar2.f17627a;
                    s0Var.F = qVar2.f17628b;
                    s0Var.f8129i = this.f48027l;
                    wVar.c(new t0(s0Var));
                    this.f48030o = hVar4.d;
                } else {
                    lVar = lVar;
                    th = null;
                    j10 = 1000000;
                    j11 = 0;
                    j12 = this.f48030o;
                    if (j12 != 0) {
                        j13 = ((m3.h) lVar).d;
                        if (j13 < j12) {
                            ((m3.h) lVar).t((int) (j12 - j13));
                        }
                    }
                }
                if (this.f48031p == 0) {
                    ((m3.h) lVar).f17614f = 0;
                    if (d(lVar)) {
                        i10 = -1;
                        i11 = -1;
                    } else {
                        zVar.C(0);
                        iE = zVar.e();
                        if (((-128000) & iE) == (((long) this.f48026k) & (-128000)) || j3.b.d(iE) == -1) {
                            ((m3.h) lVar).t(1);
                            this.f48026k = 0;
                        } else {
                            o0Var.a(iE);
                            if (this.f48028m == -9223372036854775807L) {
                                this.f48028m = this.f48032q.a(((m3.h) lVar).d);
                                long j24 = this.f48019b;
                                if (j24 != -9223372036854775807L) {
                                    this.f48028m = (j24 - this.f48032q.a(j11)) + this.f48028m;
                                }
                            }
                            this.f48031p = o0Var.f12394b;
                            f fVar2 = this.f48032q;
                            if (fVar2 instanceof b) {
                                b bVar3 = (b) fVar2;
                                long j25 = (((this.f48029n + ((long) o0Var.f12397f)) * j10) / ((long) o0Var.f12395c)) + this.f48028m;
                                long j26 = ((m3.h) lVar).d;
                                if (!bVar3.b(j25)) {
                                    throw th;
                                }
                                if (this.f48034s && bVar3.b(this.f48035t)) {
                                    this.f48034s = false;
                                    this.f48025j = this.f48024i;
                                }
                            }
                            iB = this.f48025j.b(lVar, this.f48031p, true);
                            if (iB == -1) {
                                i10 = -1;
                                i11 = -1;
                            } else {
                                i12 = this.f48031p - iB;
                                this.f48031p = i12;
                                if (i12 <= 0) {
                                    this.f48025j.e(((this.f48029n * j10) / ((long) o0Var.f12395c)) + this.f48028m, 1, o0Var.f12394b, 0, null);
                                    this.f48029n += (long) o0Var.f12397f;
                                    this.f48031p = 0;
                                }
                            }
                        }
                        i10 = -1;
                        i11 = 0;
                    }
                } else {
                    iB = this.f48025j.b(lVar, this.f48031p, true);
                    if (iB == -1) {
                        i10 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.f48031p - iB;
                        this.f48031p = i12;
                        if (i12 <= 0) {
                            this.f48025j.e(((this.f48029n * j10) / ((long) o0Var.f12395c)) + this.f48028m, 1, o0Var.f12394b, 0, null);
                            this.f48029n += (long) o0Var.f12397f;
                            this.f48031p = 0;
                        }
                        i10 = -1;
                        i11 = 0;
                    }
                }
            } catch (EOFException unused) {
                i10 = -1;
                i11 = -1;
                j10 = 1000000;
            }
        } else {
            fVar = this.f48032q;
            zVar = this.f48020c;
            if (fVar == null) {
                zVar2 = new z(o0Var.f12394b);
                j10 = 1000000;
                ((m3.h) lVar).g(zVar2.f4858a, 0, o0Var.f12394b, false);
                i13 = 21;
                if ((o0Var.f12393a & 1) != 0) {
                    if (o0Var.d != 1) {
                        i13 = 36;
                    }
                } else if (o0Var.d == 1) {
                    i13 = 13;
                }
                th = null;
                j11 = 0;
                if (zVar2.f4860c >= i13 + 4) {
                    zVar2.C(i13);
                    iE2 = zVar2.e();
                    if (iE2 != 1483304551) {
                        if (zVar2.f4860c >= 40) {
                            zVar2.C(36);
                            if (zVar2.e() == 1447187017) {
                                iE2 = 1447187017;
                            } else {
                                iE2 = 0;
                            }
                        } else {
                            iE2 = 0;
                        }
                    }
                } else if (zVar2.f4860c >= 40) {
                    zVar2.C(36);
                    if (zVar2.e() == 1447187017) {
                        iE2 = 1447187017;
                    } else {
                        iE2 = 0;
                    }
                } else {
                    iE2 = 0;
                }
                qVar = this.f48021e;
                if (iE2 != 1483304551) {
                    hVar = (m3.h) lVar;
                    long j110 = hVar.f17612c;
                    long j111 = hVar.d;
                    int i28 = o0Var.f12397f;
                    int i29 = o0Var.f12395c;
                    iE3 = zVar2.e();
                    if ((iE3 & 1) == 1) {
                        fVarA = null;
                    } else {
                        fVarA = null;
                    }
                    qVar2 = qVar;
                    if (fVarA != null) {
                        hVar.f17614f = 0;
                        hVar.a(i13 + 141, false);
                        hVar.g(zVar.f4858a, 0, 3, false);
                        zVar.C(0);
                        int iT2 = zVar.t();
                        i14 = iT2 >> 12;
                        i15 = iT2 & 4095;
                        if (i14 <= 0) {
                            qVar2.f17627a = i14;
                            qVar2.f17628b = i15;
                        } else {
                            qVar2.f17627a = i14;
                            qVar2.f17628b = i15;
                        }
                    }
                    hVar.t(o0Var.f12394b);
                    if (fVarA == null) {
                        this = this;
                        lVar = lVar;
                    } else {
                        this = this;
                        lVar = lVar;
                    }
                } else {
                    hVar = (m3.h) lVar;
                    long j112 = hVar.f17612c;
                    long j113 = hVar.d;
                    int i210 = o0Var.f12397f;
                    int i211 = o0Var.f12395c;
                    iE3 = zVar2.e();
                    if ((iE3 & 1) == 1) {
                        fVarA = null;
                    } else {
                        fVarA = null;
                    }
                    qVar2 = qVar;
                    if (fVarA != null) {
                        hVar.f17614f = 0;
                        hVar.a(i13 + 141, false);
                        hVar.g(zVar.f4858a, 0, 3, false);
                        zVar.C(0);
                        int iT3 = zVar.t();
                        i14 = iT3 >> 12;
                        i15 = iT3 & 4095;
                        if (i14 <= 0) {
                            qVar2.f17627a = i14;
                            qVar2.f17628b = i15;
                        } else {
                            qVar2.f17627a = i14;
                            qVar2.f17628b = i15;
                        }
                    }
                    hVar.t(o0Var.f12394b);
                    if (fVarA == null) {
                        this = this;
                        lVar = lVar;
                    } else {
                        this = this;
                        lVar = lVar;
                    }
                }
                cVar = this.f48027l;
                m3.h hVar5 = (m3.h) lVar;
                j14 = hVar5.d;
                if (cVar != null) {
                    cVar2 = null;
                    break;
                }
                bVarArr = cVar.f50188a;
                length = bVarArr.length;
                i16 = 0;
                while (true) {
                    if (i16 < length) {
                        cVar2 = null;
                        break;
                    }
                    bVar = bVarArr[i16];
                    if (bVar instanceof e4.l) {
                        lVar2 = (e4.l) bVar;
                        iArr = lVar2.f5214e;
                        if (cVar != null) {
                            jH = -9223372036854775807L;
                            break;
                        }
                        bVarArr2 = cVar.f50188a;
                        length3 = bVarArr2.length;
                        i18 = 0;
                        while (true) {
                            if (i18 < length3) {
                                jH = -9223372036854775807L;
                                break;
                            }
                            bVar2 = bVarArr2[i18];
                            if (bVar2 instanceof e4.n) {
                                nVar2 = (e4.n) bVar2;
                                if (nVar2.f5209a.equals("TLEN")) {
                                    jH = g0.H(Long.parseLong((String) nVar2.f5219c.get(0)));
                                    break;
                                }
                            }
                            i18++;
                        }
                        length2 = iArr.length;
                        int i212 = length2 + 1;
                        jArr = new long[i212];
                        jArr2 = new long[i212];
                        jArr[0] = j14;
                        jArr2[0] = 0;
                        j15 = 0;
                        i17 = 1;
                        while (i17 <= length2) {
                            int i213 = i17 - 1;
                            long j27 = j14 + ((long) (lVar2.f5213c + iArr[i213]));
                            j15 += (long) (lVar2.d + lVar2.f5215f[i213]);
                            jArr[i17] = j27;
                            jArr2[i17] = j15;
                            i17++;
                            length2 = length2;
                            j14 = j27;
                        }
                        cVar2 = new c(jH, jArr, jArr2);
                        break;
                    }
                    i16++;
                }
                if (this.f48033r) {
                    fVarA2 = new e(-9223372036854775807L);
                } else {
                    if (cVar2 != null) {
                        fVarA = cVar2;
                    } else if (fVarA == null) {
                        fVarA = null;
                    }
                    if (fVarA == null) {
                    }
                }
                this.f48032q = fVarA2;
                this.h.n(fVarA2);
                w wVar2 = this.f48025j;
                s0 s0Var2 = new s0();
                s0Var2.f8135o = (String) o0Var.f12398g;
                s0Var2.f8136p = 4096;
                s0Var2.B = o0Var.d;
                s0Var2.C = o0Var.f12395c;
                s0Var2.E = qVar2.f17627a;
                s0Var2.F = qVar2.f17628b;
                s0Var2.f8129i = this.f48027l;
                wVar2.c(new t0(s0Var2));
                this.f48030o = hVar5.d;
            } else {
                lVar = lVar;
                th = null;
                j10 = 1000000;
                j11 = 0;
                j12 = this.f48030o;
                if (j12 != 0) {
                    j13 = ((m3.h) lVar).d;
                    if (j13 < j12) {
                        ((m3.h) lVar).t((int) (j12 - j13));
                    }
                }
            }
            if (this.f48031p == 0) {
                ((m3.h) lVar).f17614f = 0;
                if (d(lVar)) {
                    i10 = -1;
                    i11 = -1;
                } else {
                    zVar.C(0);
                    iE = zVar.e();
                    if (((-128000) & iE) == (((long) this.f48026k) & (-128000))) {
                    }
                    ((m3.h) lVar).t(1);
                    this.f48026k = 0;
                    i10 = -1;
                    i11 = 0;
                }
            } else {
                iB = this.f48025j.b(lVar, this.f48031p, true);
                if (iB == -1) {
                    i10 = -1;
                    i11 = -1;
                } else {
                    i12 = this.f48031p - iB;
                    this.f48031p = i12;
                    if (i12 <= 0) {
                        this.f48025j.e(((this.f48029n * j10) / ((long) o0Var.f12395c)) + this.f48028m, 1, o0Var.f12394b, 0, null);
                        this.f48029n += (long) o0Var.f12397f;
                        this.f48031p = 0;
                    }
                    i10 = -1;
                    i11 = 0;
                }
            }
        }
        if (i11 == i10) {
            f fVar3 = this.f48032q;
            if (fVar3 instanceof b) {
                if (fVar3.i() != ((this.f48029n * j10) / ((long) o0Var.f12395c)) + this.f48028m) {
                    f fVar4 = this.f48032q;
                    ((b) fVar4).getClass();
                    this.h.n(fVar4);
                }
            }
        }
        return i11;
    }

    @Override
    public final void c(m mVar) {
        this.h = mVar;
        w wVarC = mVar.C(0, 1);
        this.f48024i = wVarC;
        this.f48025j = wVarC;
        this.h.A();
    }

    public final boolean d(l lVar) {
        f fVar = this.f48032q;
        if (fVar != null) {
            long jD = fVar.d();
            if (jD == -1 || lVar.i() <= jD - 4) {
            }
            return true;
        }
        try {
            return !lVar.g(this.f48020c.f4858a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean e(l lVar, boolean z10) throws Throwable {
        int i10;
        int i11;
        int iD;
        int i12 = z10 ? 32768 : 131072;
        lVar.q();
        if (lVar.getPosition() == 0) {
            z zVar = (z) this.f48022f.f181b;
            z3.c cVarC = null;
            int i13 = 0;
            while (true) {
                try {
                    lVar.b(0, 10, zVar.f4858a);
                    zVar.C(0);
                    if (zVar.t() != 4801587) {
                        break;
                    }
                    zVar.D(3);
                    int iQ = zVar.q();
                    int i14 = iQ + 10;
                    if (cVarC == null) {
                        byte[] bArr = new byte[i14];
                        System.arraycopy(zVar.f4858a, 0, bArr, 0, 10);
                        lVar.b(10, iQ, bArr);
                        cVarC = new e4.i(null).c(i14, bArr);
                    } else {
                        lVar.j(iQ);
                    }
                    i13 += i14;
                } catch (EOFException unused) {
                }
            }
            lVar.q();
            lVar.j(i13);
            this.f48027l = cVarC;
            if (cVarC != null) {
                this.f48021e.b(cVarC);
            }
            i11 = (int) lVar.i();
            if (!z10) {
                lVar.t(i11);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (d(lVar)) {
                if (i15 > 0) {
                    break;
                }
                throw new EOFException();
            }
            z zVar2 = this.f48020c;
            zVar2.C(0);
            int iE = zVar2.e();
            if ((i10 == 0 || ((-128000) & iE) == (((long) i10) & (-128000))) && (iD = j3.b.d(iE)) != -1) {
                i15++;
                if (i15 != 1) {
                    if (i15 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iE);
                    i10 = iE;
                }
                lVar.j(iD - 4);
            } else {
                int i17 = i16 + 1;
                if (i16 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw t1.a("Searched too many bytes.", null);
                }
                if (z10) {
                    lVar.q();
                    lVar.j(i11 + i17);
                } else {
                    lVar.t(1);
                }
                i16 = i17;
                i10 = 0;
                i15 = 0;
            }
        }
        if (z10) {
            lVar.t(i11 + i16);
        } else {
            lVar.q();
        }
        this.f48026k = i10;
        return true;
    }

    @Override
    public final boolean f(l lVar) {
        return e(lVar, true);
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48026k = 0;
        this.f48028m = -9223372036854775807L;
        this.f48029n = 0L;
        this.f48031p = 0;
        this.f48035t = j11;
        f fVar = this.f48032q;
        if (!(fVar instanceof b) || ((b) fVar).b(j11)) {
            return;
        }
        this.f48034s = true;
        this.f48025j = this.f48023g;
    }

    public d(int i10, long j10) {
        this.f48018a = i10;
        this.f48019b = j10;
        this.f48020c = new z(10);
        this.d = new o0();
        this.f48021e = new q();
        this.f48028m = -9223372036854775807L;
        this.f48022f = new i(28);
        j jVar = new j();
        this.f48023g = jVar;
        this.f48025j = jVar;
    }

    @Override
    public final void release() {
    }
}
