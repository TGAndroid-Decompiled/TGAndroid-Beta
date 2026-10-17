package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.v0;
import b2.w;
import e2.m0;
import e9.n0;
import e9.x1;
import h2.h;
import i2.a0;
import i2.g0;
import i2.x;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import t7.u;
import u2.d1;
import v7.u6;
import v7.v6;
import yh.g;
import z3.f;
import z3.i;
import z3.j;
public final class e extends i2.b implements Handler.Callback {
    public final rb.b I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public z3.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final a0 U;
    public final qf.b V;
    public boolean W;
    public boolean X;
    public w Y;
    public long Z;
    public long f48483a0;

    public e(a0 a0Var, Looper looper) {
        super(3);
        Handler handler;
        le.b bVar = d.C;
        this.U = a0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.f8254a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = bVar;
        this.I = new rb.b(28);
        this.J = new h(1, 0);
        this.V = new qf.b(22);
        this.f48483a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int C(w wVar) {
        int i10;
        boolean equals = Objects.equals(wVar.f4131s, "application/x-media3-cues");
        String str = wVar.f4131s;
        if (!equals) {
            le.b bVar = (le.b) this.L;
            bVar.getClass();
            if (!((u) bVar.f16003b).a0(wVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (v0.l(str)) {
                    return i0.a.c(1, 0, 0, 0);
                }
                return i0.a.c(0, 0, 0, 0);
            }
        }
        if (wVar.T == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return i0.a.c(i10, 0, 0, 0);
    }

    public final void F() {
        boolean z10;
        if (!Objects.equals(this.Y.f4131s, "application/cea-608") && !Objects.equals(this.Y.f4131s, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f4131s, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = this.Y.f4131s;
        if (z10) {
            return;
        }
        throw new IllegalStateException(v6.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long G() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.h()) {
            return Long.MAX_VALUE;
        }
        return this.Q.d(this.S);
    }

    public final long H(long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return j10 - this.v;
    }

    public final void I() {
        throw new UnsupportedOperationException("Method not decompiled: w2.e.I():void");
    }

    public final void J(d2.c cVar) {
        x1 x1Var = cVar.f7772a;
        a0 a0Var = this.U;
        a0Var.f12309a.f12397m.e(27, new x(0, x1Var));
        g0 g0Var = a0Var.f12309a;
        g0Var.f12383e0 = cVar;
        g0Var.f12397m.e(27, new e1.c(cVar, 16));
    }

    public final void K() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.release();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.release();
            this.R = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            J((d2.c) message.obj);
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
        w wVar = this.Y;
        if (wVar != null) {
            if (Objects.equals(wVar.f4131s, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        d1 d1Var = this.f12318r;
                        d1Var.getClass();
                        d1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    j jVar = this.Q;
                    long j10 = this.Z;
                    if (jVar == null || jVar.h() <= 0 || jVar.d(jVar.h() - 1) <= j10) {
                        j jVar2 = this.R;
                        long j11 = this.Z;
                        if ((jVar2 == null || jVar2.h() <= 0 || jVar2.d(jVar2.h() - 1) <= j11) && this.P != null) {
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
    public final void n() {
        this.Y = null;
        this.f48483a0 = -9223372036854775807L;
        d2.c cVar = new d2.c(H(this.Z), x1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            K();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.Z = j10;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.c cVar = new d2.c(H(this.Z), x1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.W = false;
        this.X = false;
        this.f48483a0 = -9223372036854775807L;
        w wVar = this.Y;
        if (wVar != null && !Objects.equals(wVar.f4131s, "application/x-media3-cues")) {
            if (this.N != 0) {
                K();
                z3.e eVar = this.O;
                eVar.getClass();
                eVar.release();
                this.O = null;
                this.N = 0;
                I();
                return;
            }
            K();
            z3.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f12320w);
        }
    }

    @Override
    public final void u(w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
        a cVar;
        w wVar = wVarArr[0];
        this.Y = wVar;
        if (!Objects.equals(wVar.f4131s, "application/x-media3-cues")) {
            F();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                I();
                return;
            }
        }
        if (this.Y.Q == 1) {
            cVar = new c();
        } else {
            cVar = new u3.c();
        }
        this.K = cVar;
    }

    @Override
    public final void x(long j10, long j11) {
        boolean z10;
        long j12;
        if (this.f12322y) {
            long j13 = this.f48483a0;
            if (j13 != -9223372036854775807L && j10 >= j13) {
                K();
                this.X = true;
            }
        }
        if (!this.X) {
            w wVar = this.Y;
            wVar.getClass();
            boolean equals = Objects.equals(wVar.f4131s, "application/x-media3-cues");
            Handler handler = this.T;
            qf.b bVar = this.V;
            boolean z11 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(bVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.f();
                            ByteBuffer byteBuffer = hVar.f11635c;
                            byteBuffer.getClass();
                            long j14 = hVar.e;
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
                            z3.a aVar = new z3.a(j14, readBundle.getLong("d"), e2.e.b(new g(3), parcelableArrayList));
                            hVar.clear();
                            z11 = this.K.c(aVar, j10);
                        }
                    }
                }
                long a2 = this.K.a(this.Z);
                int i10 = (a2 > Long.MIN_VALUE ? 1 : (a2 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 && this.W && !z11) {
                    this.X = true;
                }
                if (i10 != 0 && a2 <= j10) {
                    z11 = true;
                }
                if (z11) {
                    n0 b10 = this.K.b(j10);
                    long d = this.K.d(j10);
                    d2.c cVar = new d2.c(H(d), b10);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar).sendToTarget();
                    } else {
                        J(cVar);
                    }
                    this.K.e(d);
                }
                this.Z = j10;
                return;
            }
            F();
            this.Z = j10;
            if (this.R == null) {
                z3.e eVar = this.O;
                eVar.getClass();
                eVar.b(j10);
                try {
                    z3.e eVar2 = this.O;
                    eVar2.getClass();
                    this.R = (j) eVar2.c();
                } catch (f e) {
                    e2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e);
                    d2.c cVar2 = new d2.c(H(this.Z), x1.e);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar2).sendToTarget();
                    } else {
                        J(cVar2);
                    }
                    K();
                    z3.e eVar3 = this.O;
                    eVar3.getClass();
                    eVar3.release();
                    this.O = null;
                    this.N = 0;
                    I();
                    return;
                }
            }
            if (this.f12317n == 2) {
                if (this.Q != null) {
                    long G = G();
                    z10 = false;
                    while (G <= j10) {
                        this.S++;
                        G = G();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.R;
                if (jVar != null) {
                    if (jVar.isEndOfStream()) {
                        if (!z10 && G() == Long.MAX_VALUE) {
                            if (this.N == 2) {
                                K();
                                z3.e eVar4 = this.O;
                                eVar4.getClass();
                                eVar4.release();
                                this.O = null;
                                this.N = 0;
                                I();
                            } else {
                                K();
                                this.X = true;
                            }
                        }
                    } else if (jVar.timeUs <= j10) {
                        j jVar2 = this.Q;
                        if (jVar2 != null) {
                            jVar2.release();
                        }
                        this.S = jVar.c(j10);
                        this.Q = jVar;
                        this.R = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int c10 = this.Q.c(j10);
                    if (c10 != 0 && this.Q.h() != 0) {
                        if (c10 == -1) {
                            j jVar3 = this.Q;
                            j12 = jVar3.d(jVar3.h() - 1);
                        } else {
                            j12 = this.Q.d(c10 - 1);
                        }
                    } else {
                        j12 = this.Q.timeUs;
                    }
                    d2.c cVar3 = new d2.c(H(j12), this.Q.e(j10));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        J(cVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            i iVar = this.P;
                            if (iVar == null) {
                                z3.e eVar5 = this.O;
                                eVar5.getClass();
                                iVar = (i) eVar5.d();
                                if (iVar != null) {
                                    this.P = iVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.N == 1) {
                                iVar.setFlags(4);
                                z3.e eVar6 = this.O;
                                eVar6.getClass();
                                eVar6.e(iVar);
                                this.P = null;
                                this.N = 2;
                                return;
                            }
                            int w9 = w(bVar, iVar, 0);
                            if (w9 == -4) {
                                if (iVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    w wVar2 = (w) bVar.f44466c;
                                    if (wVar2 != null) {
                                        iVar.f50672r = wVar2.f4135x;
                                        iVar.f();
                                        this.M &= !iVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    z3.e eVar7 = this.O;
                                    eVar7.getClass();
                                    eVar7.e(iVar);
                                    this.P = null;
                                }
                            } else if (w9 == -3) {
                                return;
                            }
                        } catch (f e7) {
                            e2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                            d2.c cVar4 = new d2.c(H(this.Z), x1.e);
                            if (handler != null) {
                                handler.obtainMessage(1, cVar4).sendToTarget();
                            } else {
                                J(cVar4);
                            }
                            K();
                            z3.e eVar8 = this.O;
                            eVar8.getClass();
                            eVar8.release();
                            this.O = null;
                            this.N = 0;
                            I();
                            return;
                        }
                    }
                }
            }
        }
    }
}
