package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import pi.n;
import pi.t;
public final class to implements Runnable {
    public final int f42256a;
    public final long f42257b;
    public final long f42258c;
    public final Object d;

    public to(Object obj, long j3, long j10, int i10) {
        this.f42256a = i10;
        this.d = obj;
        this.f42257b = j3;
        this.f42258c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.h71 h71Var;
        switch (this.f42256a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f42257b, this.f42258c, new e5((xo) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j3 = this.f42257b;
                long j10 = this.f42258c;
                y1Var.f43496f = j3;
                y1Var.h = j10;
                org.telegram.ui.Components.j71 j71Var = y1Var.f27776a;
                if (j71Var != null && (h71Var = j71Var.W2) != null && j71Var.G) {
                    h71Var.N(true);
                    return;
                }
                return;
            case 2:
                pi.t tVar = (pi.t) this.d;
                long j11 = this.f42257b;
                long j12 = this.f42258c;
                if (tVar.f45830m == pi.r.h) {
                    long j13 = ((j11 - j12) * 48000) / 1000;
                    tVar.f45833p = j13;
                    tVar.f45835r = 0L;
                    tVar.f45836s = pi.t.s(j13);
                    tVar.k();
                    return;
                }
                return;
            default:
                long j14 = this.f42257b;
                long j15 = this.f42258c;
                final pi.t tVar2 = (pi.t) ((bc.e) this.d).f3855c;
                if (j14 == tVar2.f45832o) {
                    tVar2.f45831n = null;
                    tVar2.f45833p += j15;
                    tVar2.f45834q = 0L;
                    tVar2.h.removeCallbacks(tVar2.D);
                    pi.r rVar = tVar2.f45830m;
                    if (rVar == pi.r.f45818s) {
                        tVar2.t();
                        tVar2.n("cancelled");
                        return;
                    } else if (rVar == pi.r.f45817r) {
                        tVar2.t();
                        return;
                    } else if (tVar2.v) {
                        tVar2.v = false;
                        tVar2.k();
                        return;
                    } else if (rVar == pi.r.d) {
                        final pi.n nVar = tVar2.f45842z;
                        if (nVar == null) {
                            tVar2.i(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long l4 = tVar2.l();
                        tVar2.f45835r = 0L;
                        tVar2.f45836s = l4;
                        tVar2.f45826i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                t tVar3 = t.this;
                                n nVar2 = nVar;
                                try {
                                    bArr = AudioRecorderNative.e(nVar2.f45802b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    tVar3.f45825g.a("waveform extraction failed", th2);
                                    bArr = null;
                                }
                                tVar3.h.post(new pi.f(tVar3, nVar2, bArr, 1));
                            }
                        });
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
