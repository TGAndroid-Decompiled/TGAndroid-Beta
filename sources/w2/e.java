package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.w0;
import b2.x;
import e2.m0;
import e9.n0;
import e9.x1;
import h2.h;
import i2.b0;
import i2.h0;
import i2.y;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m.l;
import t7.u;
import u2.d1;
import u2.g0;
import v7.u6;
import v7.v6;
import z3.f;
import z3.g;
import z3.j;
import z3.k;
public final class e extends i2.b implements Handler.Callback {
    public final rb.b I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public f O;
    public j P;
    public k Q;
    public k R;
    public int S;
    public final Handler T;
    public final b0 U;
    public final qf.b V;
    public boolean W;
    public boolean X;
    public x Y;
    public long Z;
    public long f47076a0;

    public e(b0 b0Var, Looper looper) {
        super(3);
        Handler handler;
        v0.k kVar = d.C;
        this.U = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.f8375a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = kVar;
        this.I = new rb.b(28);
        this.J = new h(1, 0);
        this.V = new qf.b(24);
        this.f47076a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int C(x xVar) {
        int i10;
        boolean equals = Objects.equals(xVar.f2523s, "application/x-media3-cues");
        String str = xVar.f2523s;
        if (!equals) {
            v0.k kVar = (v0.k) this.L;
            kVar.getClass();
            if (!((u) kVar.f46466a).a0(xVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (w0.l(str)) {
                    return i2.d.c(1, 0, 0, 0);
                }
                return i2.d.c(0, 0, 0, 0);
            }
        }
        if (xVar.T == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return i2.d.c(i10, 0, 0, 0);
    }

    public final void F() {
        boolean z10;
        if (!Objects.equals(this.Y.f2523s, "application/cea-608") && !Objects.equals(this.Y.f2523s, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f2523s, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = this.Y.f2523s;
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
        if (this.S >= this.Q.u()) {
            return Long.MAX_VALUE;
        }
        return this.Q.h(this.S);
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
        x1 x1Var = cVar.f6317a;
        b0 b0Var = this.U;
        b0Var.f10929a.f11005m.e(27, new y(0, x1Var));
        h0 h0Var = b0Var.f10929a;
        h0Var.f10991e0 = cVar;
        h0Var.f11005m.e(27, new f1.a(cVar, 7));
    }

    public final void K() {
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
        x xVar = this.Y;
        if (xVar != null) {
            if (Objects.equals(xVar.f2523s, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.b(this.Z) == Long.MIN_VALUE) {
                    try {
                        d1 d1Var = this.f10924r;
                        d1Var.getClass();
                        d1Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    k kVar = this.Q;
                    long j10 = this.Z;
                    if (kVar == null || kVar.u() <= 0 || kVar.h(kVar.u() - 1) <= j10) {
                        k kVar2 = this.R;
                        long j11 = this.Z;
                        if ((kVar2 == null || kVar2.u() <= 0 || kVar2.h(kVar2.u() - 1) <= j11) && this.P != null) {
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
        this.f47076a0 = -9223372036854775807L;
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
            f fVar = this.O;
            fVar.getClass();
            fVar.release();
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
        this.f47076a0 = -9223372036854775807L;
        x xVar = this.Y;
        if (xVar != null && !Objects.equals(xVar.f2523s, "application/x-media3-cues")) {
            if (this.N != 0) {
                K();
                f fVar = this.O;
                fVar.getClass();
                fVar.release();
                this.O = null;
                this.N = 0;
                I();
                return;
            }
            K();
            f fVar2 = this.O;
            fVar2.getClass();
            fVar2.flush();
            fVar2.a(this.f10926w);
        }
    }

    @Override
    public final void u(x[] xVarArr, long j10, long j11, g0 g0Var) {
        a lVar;
        x xVar = xVarArr[0];
        this.Y = xVar;
        if (!Objects.equals(xVar.f2523s, "application/x-media3-cues")) {
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
            lVar = new c();
        } else {
            lVar = new l(23);
        }
        this.K = lVar;
    }

    @Override
    public final void x(long j10, long j11) {
        boolean z10;
        long j12;
        if (this.f10928y) {
            long j13 = this.f47076a0;
            if (j13 != -9223372036854775807L && j10 >= j13) {
                K();
                this.X = true;
            }
        }
        if (!this.X) {
            x xVar = this.Y;
            xVar.getClass();
            boolean equals = Objects.equals(xVar.f2523s, "application/x-media3-cues");
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
                            hVar.d();
                            ByteBuffer byteBuffer = hVar.f10330c;
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
                            z3.b bVar2 = new z3.b(j14, readBundle.getLong("d"), e2.e.b(new z3.a(0), parcelableArrayList));
                            hVar.clear();
                            z11 = this.K.j(bVar2, j10);
                        }
                    }
                }
                long b10 = this.K.b(this.Z);
                int i10 = (b10 > Long.MIN_VALUE ? 1 : (b10 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 && this.W && !z11) {
                    this.X = true;
                }
                if (i10 != 0 && b10 <= j10) {
                    z11 = true;
                }
                if (z11) {
                    n0 d = this.K.d(j10);
                    long p5 = this.K.p(j10);
                    d2.c cVar = new d2.c(H(p5), d);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar).sendToTarget();
                    } else {
                        J(cVar);
                    }
                    this.K.q(p5);
                }
                this.Z = j10;
                return;
            }
            F();
            this.Z = j10;
            if (this.R == null) {
                f fVar = this.O;
                fVar.getClass();
                fVar.b(j10);
                try {
                    f fVar2 = this.O;
                    fVar2.getClass();
                    this.R = (k) fVar2.c();
                } catch (g e) {
                    e2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e);
                    d2.c cVar2 = new d2.c(H(this.Z), x1.e);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar2).sendToTarget();
                    } else {
                        J(cVar2);
                    }
                    K();
                    f fVar3 = this.O;
                    fVar3.getClass();
                    fVar3.release();
                    this.O = null;
                    this.N = 0;
                    I();
                    return;
                }
            }
            if (this.f10923n == 2) {
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
                k kVar = this.R;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
                        if (!z10 && G() == Long.MAX_VALUE) {
                            if (this.N == 2) {
                                K();
                                f fVar4 = this.O;
                                fVar4.getClass();
                                fVar4.release();
                                this.O = null;
                                this.N = 0;
                                I();
                            } else {
                                K();
                                this.X = true;
                            }
                        }
                    } else if (kVar.timeUs <= j10) {
                        k kVar2 = this.Q;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.S = kVar.c(j10);
                        this.Q = kVar;
                        this.R = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int c10 = this.Q.c(j10);
                    if (c10 != 0 && this.Q.u() != 0) {
                        if (c10 == -1) {
                            k kVar3 = this.Q;
                            j12 = kVar3.h(kVar3.u() - 1);
                        } else {
                            j12 = this.Q.h(c10 - 1);
                        }
                    } else {
                        j12 = this.Q.timeUs;
                    }
                    d2.c cVar3 = new d2.c(H(j12), this.Q.o(j10));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        J(cVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            j jVar = this.P;
                            if (jVar == null) {
                                f fVar5 = this.O;
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
                                f fVar6 = this.O;
                                fVar6.getClass();
                                fVar6.e(jVar);
                                this.P = null;
                                this.N = 2;
                                return;
                            }
                            int w9 = w(bVar, jVar, 0);
                            if (w9 == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    x xVar2 = (x) bVar.f43098c;
                                    if (xVar2 != null) {
                                        jVar.f49267r = xVar2.f2527x;
                                        jVar.d();
                                        this.M &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    f fVar7 = this.O;
                                    fVar7.getClass();
                                    fVar7.e(jVar);
                                    this.P = null;
                                }
                            } else if (w9 == -3) {
                                return;
                            }
                        } catch (g e7) {
                            e2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                            d2.c cVar4 = new d2.c(H(this.Z), x1.e);
                            if (handler != null) {
                                handler.obtainMessage(1, cVar4).sendToTarget();
                            } else {
                                J(cVar4);
                            }
                            K();
                            f fVar8 = this.O;
                            fVar8.getClass();
                            fVar8.release();
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
