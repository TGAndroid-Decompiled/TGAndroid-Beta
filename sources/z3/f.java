package z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d5.g0;
import d5.n;
import h3.g1;
import h3.h0;
import h3.h1;
import h3.k0;
import h3.t0;
import h3.u0;
import h3.x;
import h7.p8;
import java.util.ArrayList;

public final class f extends h3.e implements Handler.Callback {

    public final d f50192a;

    public final h0 f50193b;

    public final Handler f50194c;
    public final e d;

    public p8 f50195e;

    public boolean f50196f;
    public boolean h;

    public long f50197n;

    public c f50198r;

    public long f50199s;

    public f(h0 h0Var, Looper looper) {
        Handler handler;
        super(5);
        this.f50193b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = g0.f4795a;
            handler = new Handler(looper, this);
        }
        this.f50194c = handler;
        this.f50192a = d.f50190a;
        this.d = new e();
        this.f50199s = -9223372036854775807L;
    }

    public final void a(c cVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f50188a;
            if (i10 >= bVarArr.length) {
                return;
            }
            t0 wrappedMetadataFormat = bVarArr[i10].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                d dVar = this.f50192a;
                if (dVar.b(wrappedMetadataFormat)) {
                    p8 p8VarA = dVar.a(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = bVarArr[i10].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    e eVar = this.d;
                    eVar.clear();
                    eVar.b(wrappedMetadataBytes.length);
                    eVar.f14429b.put(wrappedMetadataBytes);
                    eVar.d();
                    c cVarA = p8VarA.a(eVar);
                    if (cVarA != null) {
                        a(cVarA, arrayList);
                    }
                } else {
                    arrayList.add(bVarArr[i10]);
                }
            } else {
                arrayList.add(bVarArr[i10]);
            }
            i10++;
        }
    }

    public final long b(long j10) {
        d5.a.i(j10 != -9223372036854775807L);
        d5.a.i(this.f50199s != -9223372036854775807L);
        return j10 - this.f50199s;
    }

    public final void c(c cVar) {
        h0 h0Var = this.f50193b;
        k0 k0Var = h0Var.f7870a;
        h1 h1Var = k0Var.f7973h0;
        n nVar = k0Var.f7980l;
        g1 g1VarA = h1Var.a();
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f50188a;
            if (i10 >= bVarArr.length) {
                break;
            }
            bVarArr[i10].populateMediaMetadata(g1VarA);
            i10++;
        }
        k0Var.f7973h0 = new h1(g1VarA);
        h1 h1VarR = k0Var.R();
        if (!h1VarR.equals(k0Var.O)) {
            k0Var.O = h1VarR;
            nVar.c(14, new x(h0Var, 2));
        }
        nVar.c(28, new x(cVar, 3));
        nVar.b();
    }

    @Override
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c((c) message.obj);
        return true;
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
        this.f50198r = null;
        this.f50195e = null;
        this.f50199s = -9223372036854775807L;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.f50198r = null;
        this.f50196f = false;
        this.h = false;
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        this.f50195e = this.f50192a.a(t0VarArr[0]);
        c cVar = this.f50198r;
        if (cVar != null) {
            long j12 = cVar.f50189b;
            long j13 = (this.f50199s + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f50188a);
            }
            this.f50198r = cVar;
        }
        this.f50199s = j11;
    }

    @Override
    public final void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f50196f && this.f50198r == null) {
                e eVar = this.d;
                eVar.clear();
                u0 formatHolder = getFormatHolder();
                int source = readSource(formatHolder, eVar, 0);
                if (source == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f50196f = true;
                    } else {
                        eVar.f50191n = this.f50197n;
                        eVar.d();
                        p8 p8Var = this.f50195e;
                        int i10 = g0.f4795a;
                        c cVarA = p8Var.a(eVar);
                        if (cVarA != null) {
                            ArrayList arrayList = new ArrayList(cVarA.f50188a.length);
                            a(cVarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f50198r = new c(b(eVar.d), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (source == -5) {
                    t0 t0Var = formatHolder.f8207b;
                    t0Var.getClass();
                    this.f50197n = t0Var.F;
                }
            }
            c cVar = this.f50198r;
            if (cVar == null || cVar.f50189b > b(j10)) {
                z10 = false;
            } else {
                c cVar2 = this.f50198r;
                Handler handler = this.f50194c;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    c(cVar2);
                }
                this.f50198r = null;
                z10 = true;
            }
            if (this.f50196f && this.f50198r == null) {
                this.h = true;
            }
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        if (this.f50192a.b(t0Var)) {
            return com.google.android.recaptcha.internal.a.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }
}
