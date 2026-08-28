package z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d5.f0;
import d5.n;
import g7.y8;
import gh.i3;
import h3.g1;
import h3.h0;
import h3.h1;
import h3.k0;
import h3.t0;
import h3.u0;
import java.util.ArrayList;
public final class f extends h3.e implements Handler.Callback {
    public final d f50292a;
    public final h0 f50293b;
    public final Handler f50294c;
    public final e d;
    public y8 f50295e;
    public boolean f50296f;
    public boolean h;
    public long f50297n;
    public c f50298r;
    public long f50299s;

    public f(h0 h0Var, Looper looper) {
        super(5);
        Handler handler;
        this.f50293b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = f0.f4349a;
            handler = new Handler(looper, this);
        }
        this.f50294c = handler;
        this.f50292a = d.f50290a;
        this.d = new e();
        this.f50299s = -9223372036854775807L;
    }

    public final void a(c cVar, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.f50288a;
            if (i9 < bVarArr.length) {
                t0 wrappedMetadataFormat = bVarArr[i9].getWrappedMetadataFormat();
                if (wrappedMetadataFormat != null) {
                    d dVar = this.f50292a;
                    if (dVar.b(wrappedMetadataFormat)) {
                        y8 a2 = dVar.a(wrappedMetadataFormat);
                        byte[] wrappedMetadataBytes = bVarArr[i9].getWrappedMetadataBytes();
                        wrappedMetadataBytes.getClass();
                        e eVar = this.d;
                        eVar.clear();
                        eVar.c(wrappedMetadataBytes.length);
                        eVar.f14608b.put(wrappedMetadataBytes);
                        eVar.d();
                        c a3 = a2.a(eVar);
                        if (a3 != null) {
                            a(a3, arrayList);
                        }
                        i9++;
                    }
                }
                arrayList.add(bVarArr[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    public final long b(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        if (this.f50299s != -9223372036854775807L) {
            z11 = true;
        }
        d5.a.i(z11);
        return j10 - this.f50299s;
    }

    public final void c(c cVar) {
        h0 h0Var = this.f50293b;
        k0 k0Var = h0Var.f9440a;
        h1 h1Var = k0Var.f9543h0;
        n nVar = k0Var.f9550l;
        g1 a2 = h1Var.a();
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.f50288a;
            if (i9 >= bVarArr.length) {
                break;
            }
            bVarArr[i9].populateMediaMetadata(a2);
            i9++;
        }
        k0Var.f9543h0 = new h1(a2);
        h1 R = k0Var.R();
        if (!R.equals(k0Var.O)) {
            k0Var.O = R;
            nVar.c(14, new i3(h0Var, 11));
        }
        nVar.c(28, new i3(cVar, 12));
        nVar.b();
    }

    @Override
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean isEnded() {
        return this.h;
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        this.f50298r = null;
        this.f50295e = null;
        this.f50299s = -9223372036854775807L;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.f50298r = null;
        this.f50296f = false;
        this.h = false;
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        this.f50295e = this.f50292a.a(t0VarArr[0]);
        c cVar = this.f50298r;
        if (cVar != null) {
            long j12 = cVar.f50289b;
            long j13 = (this.f50299s + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f50288a);
            }
            this.f50298r = cVar;
        }
        this.f50299s = j11;
    }

    @Override
    public final void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f50296f && this.f50298r == null) {
                e eVar = this.d;
                eVar.clear();
                u0 formatHolder = getFormatHolder();
                int readSource = readSource(formatHolder, eVar, 0);
                if (readSource == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f50296f = true;
                    } else {
                        eVar.f50291n = this.f50297n;
                        eVar.d();
                        y8 y8Var = this.f50295e;
                        int i9 = f0.f4349a;
                        c a2 = y8Var.a(eVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f50288a.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f50298r = new c(b(eVar.d), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (readSource == -5) {
                    t0 t0Var = formatHolder.f9778b;
                    t0Var.getClass();
                    this.f50297n = t0Var.F;
                }
            }
            c cVar = this.f50298r;
            if (cVar != null && cVar.f50289b <= b(j10)) {
                c cVar2 = this.f50298r;
                Handler handler = this.f50294c;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    c(cVar2);
                }
                this.f50298r = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f50296f && this.f50298r == null) {
                this.h = true;
            }
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        int i9;
        if (this.f50292a.b(t0Var)) {
            if (t0Var.W == 0) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            return e2.c.b(i9, 0, 0);
        }
        return e2.c.b(0, 0, 0);
    }
}
