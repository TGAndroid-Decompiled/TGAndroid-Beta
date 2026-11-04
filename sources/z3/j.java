package z3;

import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import d2.v0;
import e0.e0;
import e3.k0;
import e3.z;
import g2.y;
import g9.i0;
import java.util.ArrayList;
import java.util.Arrays;
public final class j extends i {
    public e0 f59690n;
    public int f59691o;
    public boolean f59692p;
    public z f59693q;
    public k0 f59694r;

    @Override
    public final void a(long j10) {
        boolean z10;
        this.f59684g = j10;
        int i3 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59692p = z10;
        z zVar = this.f59693q;
        if (zVar != null) {
            i3 = zVar.f9543e;
        }
        this.f59691o = i3;
    }

    @Override
    public final long b(y yVar) {
        int i3;
        int i10 = 0;
        byte b10 = yVar.f11923a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        e0 e0Var = this.f59690n;
        e0Var.getClass();
        int i11 = e0Var.f9225b;
        z zVar = (z) e0Var.f9226c;
        if (!((di.a[]) e0Var.f9228f)[(b10 >> 1) & (255 >>> (8 - i11))].f9179a) {
            i3 = zVar.f9543e;
        } else {
            i3 = zVar.f9544f;
        }
        if (this.f59692p) {
            i10 = (this.f59691o + i3) / 4;
        }
        long j10 = i10;
        byte[] bArr = yVar.f11923a;
        int length = bArr.length;
        int i12 = yVar.f11925c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            yVar.L(copyOf.length, copyOf);
        } else {
            yVar.M(i12);
        }
        byte[] bArr2 = yVar.f11923a;
        int i13 = yVar.f11925c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f59692p = true;
        this.f59691o = i3;
        return j10;
    }

    @Override
    public final boolean c(y yVar, long j10, ua.b bVar) {
        e0 e0Var;
        int i3;
        int i10;
        long j11;
        if (this.f59690n != null) {
            ((v) bVar.f55783b).getClass();
            return false;
        }
        z zVar = this.f59693q;
        int i11 = 4;
        int i12 = -1;
        if (zVar == null) {
            e3.b.w(1, yVar, false);
            yVar.s();
            int A = yVar.A();
            int s6 = yVar.s();
            int o10 = yVar.o();
            if (o10 <= 0) {
                o10 = -1;
            }
            int o11 = yVar.o();
            if (o11 > 0) {
                i12 = o11;
            }
            yVar.o();
            int A2 = yVar.A();
            int pow = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            yVar.A();
            ?? copyOf = Arrays.copyOf(yVar.f11923a, yVar.f11925c);
            ?? obj = new Object();
            obj.f9540a = A;
            obj.f9541b = s6;
            obj.f9542c = o10;
            obj.d = i12;
            obj.f9543e = (int) Math.pow(2.0d, A2 & 15);
            obj.f9544f = pow;
            obj.f9545g = copyOf;
            this.f59693q = obj;
        } else {
            k0 k0Var = this.f59694r;
            if (k0Var == null) {
                this.f59694r = e3.b.u(yVar, true, true);
            } else {
                int i13 = yVar.f11925c;
                byte[] bArr = new byte[i13];
                System.arraycopy(yVar.f11923a, 0, bArr, 0, i13);
                int i14 = zVar.f9540a;
                int i15 = 5;
                e3.b.w(5, yVar, false);
                int A3 = yVar.A() + 1;
                c4.f fVar = new c4.f(yVar.f11923a);
                int i16 = 8;
                fVar.L(yVar.f11924b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 < A3) {
                        int i19 = i16;
                        if (fVar.j(24) == 5653314) {
                            int j12 = fVar.j(16);
                            int j13 = fVar.j(24);
                            if (!fVar.i()) {
                                boolean i20 = fVar.i();
                                for (int i21 = 0; i21 < j13; i21++) {
                                    if (i20) {
                                        if (fVar.i()) {
                                            fVar.L(i15);
                                        }
                                    } else {
                                        fVar.L(i15);
                                    }
                                }
                            } else {
                                fVar.L(i15);
                                int i22 = 0;
                                while (i22 < j13) {
                                    int i23 = 0;
                                    for (int i24 = j13 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    i22 += fVar.j(i23);
                                }
                            }
                            int j14 = fVar.j(4);
                            if (j14 <= 2) {
                                if (j14 == 1 || j14 == 2) {
                                    fVar.L(32);
                                    fVar.L(32);
                                    int j15 = fVar.j(4) + 1;
                                    fVar.L(1);
                                    if (j14 == 1) {
                                        if (j12 != 0) {
                                            j11 = (long) Math.floor(Math.pow(j13, 1.0d / j12));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = j13 * j12;
                                    }
                                    fVar.L((int) (j11 * j15));
                                }
                                i17++;
                                i16 = i19;
                                i15 = 5;
                            } else {
                                throw v0.a(null, "lookup type greater than 2 not decodable: " + j14);
                            }
                        } else {
                            throw v0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.d * 8) + fVar.f4192e));
                        }
                    } else {
                        int i25 = i16;
                        int i26 = 6;
                        int j16 = fVar.j(6) + 1;
                        for (int i27 = 0; i27 < j16; i27++) {
                            if (fVar.j(16) != 0) {
                                throw v0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i28 = 1;
                        int j17 = fVar.j(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < j17) {
                                int j18 = fVar.j(i18);
                                if (j18 != 0) {
                                    if (j18 == i28) {
                                        int j19 = fVar.j(5);
                                        int[] iArr = new int[j19];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < j19; i32++) {
                                            int j20 = fVar.j(i11);
                                            iArr[i32] = j20;
                                            if (j20 > i31) {
                                                i31 = j20;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = fVar.j(i30) + 1;
                                            int j21 = fVar.j(2);
                                            int i35 = i25;
                                            if (j21 > 0) {
                                                fVar.L(i35);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << j21); i37 = 1) {
                                                fVar.L(i35);
                                                i36++;
                                                i35 = 8;
                                            }
                                            i34++;
                                            iArr2 = iArr3;
                                            i25 = 8;
                                            i30 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        fVar.L(2);
                                        int j22 = fVar.j(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < j19; i40++) {
                                            i38 += iArr4[iArr[i40]];
                                            while (i39 < i38) {
                                                fVar.L(j22);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw v0.a(null, "floor type greater than 1 not decodable: " + j18);
                                    }
                                } else {
                                    int i41 = i25;
                                    fVar.L(i41);
                                    fVar.L(16);
                                    fVar.L(16);
                                    fVar.L(6);
                                    fVar.L(i41);
                                    int j23 = fVar.j(4) + 1;
                                    int i42 = 0;
                                    while (i42 < j23) {
                                        fVar.L(i41);
                                        i42++;
                                        i41 = 8;
                                    }
                                }
                                i29++;
                                i25 = 8;
                                i26 = 6;
                                i11 = 4;
                                i18 = 16;
                                i28 = 1;
                            } else {
                                int j24 = fVar.j(i26) + 1;
                                int i43 = 0;
                                while (i43 < j24) {
                                    if (fVar.j(16) <= 2) {
                                        fVar.L(24);
                                        fVar.L(24);
                                        fVar.L(24);
                                        int j25 = fVar.j(i26) + 1;
                                        int i44 = 8;
                                        fVar.L(8);
                                        int[] iArr5 = new int[j25];
                                        for (int i45 = 0; i45 < j25; i45++) {
                                            int j26 = fVar.j(3);
                                            if (fVar.i()) {
                                                i10 = fVar.j(5);
                                            } else {
                                                i10 = 0;
                                            }
                                            iArr5[i45] = (i10 * 8) + j26;
                                        }
                                        int i46 = 0;
                                        while (i46 < j25) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr5[i46] & (1 << i47)) != 0) {
                                                    fVar.L(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i26 = 6;
                                    } else {
                                        throw v0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int j27 = fVar.j(i26) + 1;
                                for (int i48 = 0; i48 < j27; i48++) {
                                    int j28 = fVar.j(16);
                                    if (j28 != 0) {
                                        g2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + j28);
                                    } else {
                                        if (fVar.i()) {
                                            i3 = fVar.j(4) + 1;
                                        } else {
                                            i3 = 1;
                                        }
                                        if (fVar.i()) {
                                            int j29 = fVar.j(8) + 1;
                                            for (int i49 = 0; i49 < j29; i49++) {
                                                int i50 = i14 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                fVar.L(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                fVar.L(i53);
                                            }
                                        }
                                        if (fVar.j(2) == 0) {
                                            if (i3 > 1) {
                                                for (int i54 = 0; i54 < i14; i54++) {
                                                    fVar.L(4);
                                                }
                                            }
                                            for (int i55 = 0; i55 < i3; i55++) {
                                                fVar.L(8);
                                                fVar.L(8);
                                                fVar.L(8);
                                            }
                                        } else {
                                            throw v0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int j30 = fVar.j(6);
                                int i56 = j30 + 1;
                                di.a[] aVarArr = new di.a[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean i58 = fVar.i();
                                    fVar.j(16);
                                    fVar.j(16);
                                    fVar.j(8);
                                    ?? obj2 = new Object();
                                    obj2.f9179a = i58;
                                    aVarArr[i57] = obj2;
                                }
                                if (fVar.i()) {
                                    int i59 = 0;
                                    while (j30 > 0) {
                                        i59++;
                                        j30 >>>= 1;
                                    }
                                    e0Var = new e0(zVar, k0Var, bArr, aVarArr, i59);
                                } else {
                                    throw v0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        e0Var = null;
        this.f59690n = e0Var;
        if (e0Var == null) {
            return true;
        }
        z zVar2 = (z) e0Var.f9226c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar2.f9545g);
        arrayList.add((byte[]) e0Var.f9227e);
        s0 r5 = e3.b.r(i0.r(((k0) e0Var.d).f9491a));
        u uVar = new u();
        uVar.f8430q = u0.n("audio/ogg");
        uVar.f8431r = u0.n("audio/vorbis");
        uVar.h = zVar2.d;
        uVar.f8422i = zVar2.f9542c;
        uVar.J = zVar2.f9540a;
        uVar.K = zVar2.f9541b;
        uVar.f8434u = arrayList;
        uVar.f8424k = r5;
        bVar.f55783b = new v(uVar);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f59690n = null;
            this.f59693q = null;
            this.f59694r = null;
        }
        this.f59691o = 0;
        this.f59692p = false;
    }
}
