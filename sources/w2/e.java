package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.r0;
import b2.s;
import c5.m;
import e2.d0;
import e9.a1;
import e9.i0;
import ei.d5;
import h2.h;
import i2.b0;
import i2.e0;
import i2.f;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n4.y;
import u2.b1;
import u2.f0;
import z3.g;
import z3.j;
import z3.k;
public final class e extends f implements Handler.Callback {
    public final na.d I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public z3.f O;
    public j P;
    public k Q;
    public k R;
    public int S;
    public final Handler T;
    public final b0 U;
    public final y V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long f44475a0;

    public e(b0 b0Var, Looper looper) {
        super(3);
        Handler handler;
        v8.s sVar = d.C;
        this.U = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f7885a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = sVar;
        this.I = new na.d(28);
        this.J = new h(1, 0);
        this.V = new y(17);
        this.f44475a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int A(s sVar) {
        int i10;
        boolean equals = Objects.equals(sVar.f3306r, "application/x-media3-cues");
        String str = sVar.f3306r;
        if (!equals) {
            v8.s sVar2 = (v8.s) this.L;
            sVar2.getClass();
            if (!((qb.b) sVar2.f44261a).W(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r0.l(str)) {
                    return hg.c.b(1, 0, 0, 0);
                }
                return hg.c.b(0, 0, 0, 0);
            }
        }
        if (sVar.S == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return hg.c.b(i10, 0, 0, 0);
    }

    public final void C() {
        boolean z10;
        if (!Objects.equals(this.Y.f3306r, "application/cea-608") && !Objects.equals(this.Y.f3306r, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f3306r, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.f3306r + " samples (expected application/x-media3-cues).", z10);
    }

    public final long D() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.A()) {
            return Long.MAX_VALUE;
        }
        return this.Q.g(this.S);
    }

    public final long E(long j3) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return j3 - this.v;
    }

    public final void F() {
        throw new UnsupportedOperationException("Method not decompiled: w2.e.F():void");
    }

    public final void G(d2.d dVar) {
        a1 a1Var = dVar.f7450a;
        b0 b0Var = this.U;
        b0Var.f10623a.f10666m.e(27, new i2.y(0, a1Var));
        e0 e0Var = b0Var.f10623a;
        e0Var.f10648b0 = dVar;
        e0Var.f10666m.e(27, new d5(dVar, 10));
    }

    public final void H() {
        this.P = null;
        this.S = -1;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.release();
            this.Q = null;
        }
        k kVar2 = this.R;
        if (kVar2 != null) {
            kVar2.release();
            this.R = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            G((d2.d) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final String j() {
        return "TextRenderer";
    }

    @Override
    public final boolean l() {
        return this.X;
    }

    @Override
    public final boolean m() {
        s sVar = this.Y;
        if (sVar != null) {
            if (Objects.equals(sVar.f3306r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        b1 b1Var = this.f10688r;
                        b1Var.getClass();
                        b1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    k kVar = this.Q;
                    long j3 = this.Z;
                    if (kVar == null || kVar.A() <= 0 || kVar.g(kVar.A() - 1) <= j3) {
                        k kVar2 = this.R;
                        long j10 = this.Z;
                        if ((kVar2 == null || kVar2.A() <= 0 || kVar2.g(kVar2.A() - 1) <= j10) && this.P != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void o() {
        this.Y = null;
        this.f44475a0 = -9223372036854775807L;
        d2.d dVar = new d2.d(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            G(dVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            H();
            z3.f fVar = this.O;
            fVar.getClass();
            fVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.d dVar = new d2.d(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            G(dVar);
        }
        this.W = false;
        this.X = false;
        this.f44475a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar != null && !Objects.equals(sVar.f3306r, "application/x-media3-cues")) {
            if (this.N != 0) {
                H();
                z3.f fVar = this.O;
                fVar.getClass();
                fVar.release();
                this.O = null;
                this.N = 0;
                F();
                return;
            }
            H();
            z3.f fVar2 = this.O;
            fVar2.getClass();
            fVar2.flush();
            fVar2.a(this.f10690w);
        }
    }

    @Override
    public final void v(s[] sVarArr, long j3, long j10, f0 f0Var) {
        a mVar;
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (!Objects.equals(sVar.f3306r, "application/x-media3-cues")) {
            C();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                F();
                return;
            }
        }
        if (this.Y.P == 1) {
            mVar = new c();
        } else {
            mVar = new m();
        }
        this.K = mVar;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.f10692y) {
            long j12 = this.f44475a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                H();
                this.X = true;
            }
        }
        if (!this.X) {
            s sVar = this.Y;
            sVar.getClass();
            boolean equals = Objects.equals(sVar.f3306r, "application/x-media3-cues");
            Handler handler = this.T;
            y yVar = this.V;
            boolean z11 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(yVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.c();
                            ByteBuffer byteBuffer = hVar.f10093c;
                            byteBuffer.getClass();
                            long j13 = hVar.e;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.I.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            z3.b bVar = new z3.b(j13, readBundle.getLong("d"), e2.d.j(new z3.a(0), parcelableArrayList));
                            hVar.clear();
                            z11 = this.K.c(bVar, j3);
                        }
                    }
                }
                long a2 = this.K.a(this.Z);
                int i10 = (a2 > Long.MIN_VALUE ? 1 : (a2 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 && this.W && !z11) {
                    this.X = true;
                }
                if (i10 != 0 && a2 <= j3) {
                    z11 = true;
                }
                if (z11) {
                    i0 b10 = this.K.b(j3);
                    long d = this.K.d(j3);
                    d2.d dVar = new d2.d(E(d), b10);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar).sendToTarget();
                    } else {
                        G(dVar);
                    }
                    this.K.e(d);
                }
                this.Z = j3;
                return;
            }
            C();
            this.Z = j3;
            if (this.R == null) {
                z3.f fVar = this.O;
                fVar.getClass();
                fVar.b(j3);
                try {
                    z3.f fVar2 = this.O;
                    fVar2.getClass();
                    this.R = (k) fVar2.c();
                } catch (g e) {
                    e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e);
                    d2.d dVar2 = new d2.d(E(this.Z), a1.e);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar2).sendToTarget();
                    } else {
                        G(dVar2);
                    }
                    H();
                    z3.f fVar3 = this.O;
                    fVar3.getClass();
                    fVar3.release();
                    this.O = null;
                    this.N = 0;
                    F();
                    return;
                }
            }
            if (this.f10687n == 2) {
                if (this.Q != null) {
                    long D = D();
                    z10 = false;
                    while (D <= j3) {
                        this.S++;
                        D = D();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                k kVar = this.R;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
                        if (!z10 && D() == Long.MAX_VALUE) {
                            if (this.N == 2) {
                                H();
                                z3.f fVar4 = this.O;
                                fVar4.getClass();
                                fVar4.release();
                                this.O = null;
                                this.N = 0;
                                F();
                            } else {
                                H();
                                this.X = true;
                            }
                        }
                    } else if (kVar.timeUs <= j3) {
                        k kVar2 = this.Q;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.S = kVar.d(j3);
                        this.Q = kVar;
                        this.R = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int d10 = this.Q.d(j3);
                    if (d10 != 0 && this.Q.A() != 0) {
                        if (d10 == -1) {
                            k kVar3 = this.Q;
                            j11 = kVar3.g(kVar3.A() - 1);
                        } else {
                            j11 = this.Q.g(d10 - 1);
                        }
                    } else {
                        j11 = this.Q.timeUs;
                    }
                    d2.d dVar3 = new d2.d(E(j11), this.Q.l(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, dVar3).sendToTarget();
                    } else {
                        G(dVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            j jVar = this.P;
                            if (jVar == null) {
                                z3.f fVar5 = this.O;
                                fVar5.getClass();
                                jVar = (j) fVar5.d();
                                if (jVar != null) {
                                    this.P = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.N == 1) {
                                jVar.setFlags(4);
                                z3.f fVar6 = this.O;
                                fVar6.getClass();
                                fVar6.e(jVar);
                                this.P = null;
                                this.N = 2;
                                return;
                            }
                            int w10 = w(yVar, jVar, 0);
                            if (w10 == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    s sVar2 = (s) yVar.f14993c;
                                    if (sVar2 != null) {
                                        jVar.f48089r = sVar2.f3310w;
                                        jVar.c();
                                        this.M &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    z3.f fVar7 = this.O;
                                    fVar7.getClass();
                                    fVar7.e(jVar);
                                    this.P = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (g e7) {
                            e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                            d2.d dVar4 = new d2.d(E(this.Z), a1.e);
                            if (handler != null) {
                                handler.obtainMessage(1, dVar4).sendToTarget();
                            } else {
                                G(dVar4);
                            }
                            H();
                            z3.f fVar8 = this.O;
                            fVar8.getClass();
                            fVar8.release();
                            this.O = null;
                            this.N = 0;
                            F();
                            return;
                        }
                    }
                }
            }
        }
    }
}
