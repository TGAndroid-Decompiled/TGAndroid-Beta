package y2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b4.i;
import b4.j;
import b8.ac;
import b8.zb;
import d2.u0;
import d2.v;
import ei.y8;
import g2.f;
import g2.n0;
import g9.s1;
import j$.util.Objects;
import j2.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k2.c0;
import k2.i0;
import k2.p1;
import k2.z;
import org.telegram.ui.Components.y00;
import v7.s;
import w2.d1;
import w2.g0;
public final class e extends k2.b implements Handler.Callback {
    public final s J;
    public final h K;
    public a L;
    public final d M;
    public boolean N;
    public int O;
    public b4.e P;
    public i Q;
    public j R;
    public j S;
    public int T;
    public final Handler U;
    public final c0 V;
    public final tf.b W;
    public boolean X;
    public boolean Y;
    public v Z;
    public long f58900a0;
    public long f58901b0;

    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        y00 y00Var = d.C;
        this.V = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = n0.f11873a;
            handler = new Handler(looper, this);
        }
        this.U = handler;
        this.M = y00Var;
        this.J = new s(3);
        this.K = new h(1, 0);
        this.W = new Object();
        this.f58901b0 = -9223372036854775807L;
        this.f58900a0 = -9223372036854775807L;
    }

    @Override
    public final int C(v vVar) {
        int i3;
        boolean equals = Objects.equals(vVar.f8489s, "application/x-media3-cues");
        String str = vVar.f8489s;
        if (!equals) {
            y00 y00Var = (y00) this.M;
            y00Var.getClass();
            if (!((mb.b) y00Var.f40562a).l(vVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (u0.l(str)) {
                    return p1.a(1, 0, 0, 0);
                }
                return p1.a(0, 0, 0, 0);
            }
        }
        if (vVar.T == 0) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        return p1.a(i3, 0, 0, 0);
    }

    public final void F() {
        boolean z10;
        if (!Objects.equals(this.Z.f8489s, "application/cea-608") && !Objects.equals(this.Z.f8489s, "application/x-mp4-cea-608") && !Objects.equals(this.Z.f8489s, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = this.Z.f8489s;
        if (z10) {
            return;
        }
        throw new IllegalStateException(ac.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long G() {
        if (this.T == -1) {
            return Long.MAX_VALUE;
        }
        this.R.getClass();
        if (this.T >= this.R.t()) {
            return Long.MAX_VALUE;
        }
        return this.R.h(this.T);
    }

    public final long H(long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        return j10 - this.f16451w;
    }

    public final void I() {
        throw new UnsupportedOperationException("Method not decompiled: y2.e.I():void");
    }

    public final void J(f2.c cVar) {
        s1 s1Var = cVar.f11380a;
        c0 c0Var = this.V;
        c0Var.f16459a.f16561m.e(27, new z(0, s1Var));
        i0 i0Var = c0Var.f16459a;
        i0Var.f16547e0 = cVar;
        i0Var.f16561m.e(27, new y8(cVar, 20));
    }

    public final void K() {
        this.Q = null;
        this.T = -1;
        j jVar = this.R;
        if (jVar != null) {
            jVar.release();
            this.R = null;
        }
        j jVar2 = this.S;
        if (jVar2 != null) {
            jVar2.release();
            this.S = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            J((f2.c) message.obj);
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
        return this.Y;
    }

    @Override
    public final boolean m() {
        v vVar = this.Z;
        if (vVar != null) {
            if (Objects.equals(vVar.f8489s, "application/x-media3-cues")) {
                a aVar = this.L;
                aVar.getClass();
                if (aVar.a(this.f58900a0) == Long.MIN_VALUE) {
                    try {
                        d1 d1Var = this.f16449r;
                        d1Var.getClass();
                        d1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.Y) {
                if (this.X) {
                    j jVar = this.R;
                    long j10 = this.f58900a0;
                    if (jVar == null || jVar.t() <= 0 || jVar.h(jVar.t() - 1) <= j10) {
                        j jVar2 = this.S;
                        long j11 = this.f58900a0;
                        if ((jVar2 == null || jVar2.t() <= 0 || jVar2.h(jVar2.t() - 1) <= j11) && this.Q != null) {
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
        this.Z = null;
        this.f58901b0 = -9223372036854775807L;
        f2.c cVar = new f2.c(H(this.f58900a0), s1.f12146e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.f58900a0 = -9223372036854775807L;
        if (this.P != null) {
            K();
            b4.e eVar = this.P;
            eVar.getClass();
            eVar.release();
            this.P = null;
            this.O = 0;
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.f58900a0 = j10;
        a aVar = this.L;
        if (aVar != null) {
            aVar.clear();
        }
        f2.c cVar = new f2.c(H(this.f58900a0), s1.f12146e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.X = false;
        this.Y = false;
        this.f58901b0 = -9223372036854775807L;
        v vVar = this.Z;
        if (vVar != null && !Objects.equals(vVar.f8489s, "application/x-media3-cues")) {
            if (this.O != 0) {
                K();
                b4.e eVar = this.P;
                eVar.getClass();
                eVar.release();
                this.P = null;
                this.O = 0;
                I();
                return;
            }
            K();
            b4.e eVar2 = this.P;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f16452x);
        }
    }

    @Override
    public final void u(v[] vVarArr, long j10, long j11, g0 g0Var) {
        a jVar;
        v vVar = vVarArr[0];
        this.Z = vVar;
        if (!Objects.equals(vVar.f8489s, "application/x-media3-cues")) {
            F();
            if (this.P != null) {
                this.O = 1;
                return;
            } else {
                I();
                return;
            }
        }
        if (this.Z.Q == 1) {
            jVar = new c();
        } else {
            jVar = new e5.j(4);
        }
        this.L = jVar;
    }

    @Override
    public final void x(long j10, long j11) {
        boolean z10;
        long j12;
        if (this.E) {
            long j13 = this.f58901b0;
            if (j13 != -9223372036854775807L && j10 >= j13) {
                K();
                this.Y = true;
            }
        }
        if (!this.Y) {
            v vVar = this.Z;
            vVar.getClass();
            boolean equals = Objects.equals(vVar.f8489s, "application/x-media3-cues");
            Handler handler = this.U;
            tf.b bVar = this.W;
            boolean z11 = false;
            if (equals) {
                this.L.getClass();
                if (!this.X) {
                    h hVar = this.K;
                    if (w(bVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.X = true;
                        } else {
                            hVar.c();
                            ByteBuffer byteBuffer = hVar.f16157c;
                            byteBuffer.getClass();
                            long j14 = hVar.f16158e;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.J.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            b4.a aVar = new b4.a(j14, readBundle.getLong("d"), f.b(new a3.j(8), parcelableArrayList));
                            hVar.clear();
                            z11 = this.L.b(aVar, j10);
                        }
                    }
                }
                long a10 = this.L.a(this.f58900a0);
                int i3 = (a10 > Long.MIN_VALUE ? 1 : (a10 == Long.MIN_VALUE ? 0 : -1));
                if (i3 == 0 && this.X && !z11) {
                    this.Y = true;
                }
                if (i3 != 0 && a10 <= j10) {
                    z11 = true;
                }
                if (z11) {
                    g9.i0 c2 = this.L.c(j10);
                    long d = this.L.d(j10);
                    f2.c cVar = new f2.c(H(d), c2);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar).sendToTarget();
                    } else {
                        J(cVar);
                    }
                    this.L.e(d);
                }
                this.f58900a0 = j10;
                return;
            }
            F();
            this.f58900a0 = j10;
            if (this.S == null) {
                b4.e eVar = this.P;
                eVar.getClass();
                eVar.b(j10);
                try {
                    b4.e eVar2 = this.P;
                    eVar2.getClass();
                    this.S = (j) eVar2.c();
                } catch (b4.f e10) {
                    g2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e10);
                    f2.c cVar2 = new f2.c(H(this.f58900a0), s1.f12146e);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar2).sendToTarget();
                    } else {
                        J(cVar2);
                    }
                    K();
                    b4.e eVar3 = this.P;
                    eVar3.getClass();
                    eVar3.release();
                    this.P = null;
                    this.O = 0;
                    I();
                    return;
                }
            }
            if (this.f16448n == 2) {
                if (this.R != null) {
                    long G = G();
                    z10 = false;
                    while (G <= j10) {
                        this.T++;
                        G = G();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.S;
                if (jVar != null) {
                    if (jVar.isEndOfStream()) {
                        if (!z10 && G() == Long.MAX_VALUE) {
                            if (this.O == 2) {
                                K();
                                b4.e eVar4 = this.P;
                                eVar4.getClass();
                                eVar4.release();
                                this.P = null;
                                this.O = 0;
                                I();
                            } else {
                                K();
                                this.Y = true;
                            }
                        }
                    } else if (jVar.timeUs <= j10) {
                        j jVar2 = this.R;
                        if (jVar2 != null) {
                            jVar2.release();
                        }
                        this.T = jVar.d(j10);
                        this.R = jVar;
                        this.S = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.R.getClass();
                    int d10 = this.R.d(j10);
                    if (d10 != 0 && this.R.t() != 0) {
                        if (d10 == -1) {
                            j jVar3 = this.R;
                            j12 = jVar3.h(jVar3.t() - 1);
                        } else {
                            j12 = this.R.h(d10 - 1);
                        }
                    } else {
                        j12 = this.R.timeUs;
                    }
                    f2.c cVar3 = new f2.c(H(j12), this.R.p(j10));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        J(cVar3);
                    }
                }
                if (this.O != 2) {
                    while (!this.X) {
                        try {
                            i iVar = this.Q;
                            if (iVar == null) {
                                b4.e eVar5 = this.P;
                                eVar5.getClass();
                                iVar = (i) eVar5.d();
                                if (iVar != null) {
                                    this.Q = iVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.O == 1) {
                                iVar.setFlags(4);
                                b4.e eVar6 = this.P;
                                eVar6.getClass();
                                eVar6.e(iVar);
                                this.Q = null;
                                this.O = 2;
                                return;
                            }
                            int w10 = w(bVar, iVar, 0);
                            if (w10 == -4) {
                                if (iVar.isEndOfStream()) {
                                    this.X = true;
                                    this.N = false;
                                } else {
                                    v vVar2 = (v) bVar.f55095b;
                                    if (vVar2 != null) {
                                        iVar.f2369r = vVar2.f8493x;
                                        iVar.c();
                                        this.N &= !iVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.N) {
                                    b4.e eVar7 = this.P;
                                    eVar7.getClass();
                                    eVar7.e(iVar);
                                    this.Q = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (b4.f e11) {
                            g2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e11);
                            f2.c cVar4 = new f2.c(H(this.f58900a0), s1.f12146e);
                            if (handler != null) {
                                handler.obtainMessage(1, cVar4).sendToTarget();
                            } else {
                                J(cVar4);
                            }
                            K();
                            b4.e eVar8 = this.P;
                            eVar8.getClass();
                            eVar8.release();
                            this.P = null;
                            this.O = 0;
                            I();
                            return;
                        }
                    }
                }
            }
        }
    }
}
