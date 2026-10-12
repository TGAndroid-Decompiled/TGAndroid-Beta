package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.webrtc.i;
import ri.k;
import ri.q;
public final class uo implements Runnable {
    public final int f40779a;
    public final long f40780b;
    public final long f40781c;
    public final Object d;

    public uo(Object obj, long j10, long j11, int i10) {
        this.f40779a = i10;
        this.d = obj;
        this.f40780b = j10;
        this.f40781c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z61 z61Var;
        switch (this.f40779a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40780b, this.f40781c, new f5((zo) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f40780b;
                long j11 = this.f40781c;
                y1Var.f41570f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.b71 b71Var = y1Var.f23964a;
                if (b71Var != null && (z61Var = b71Var.W2) != null && b71Var.G) {
                    z61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.q qVar = (ri.q) this.d;
                long j12 = this.f40780b;
                long j13 = this.f40781c;
                if (qVar.f44762m == ri.o.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    qVar.f44765p = j14;
                    qVar.f44767r = 0L;
                    qVar.f44768s = ri.q.q(j14);
                    qVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f40780b;
                long j16 = this.f40781c;
                final ri.q qVar2 = (ri.q) ((cc.e) this.d).f4722c;
                if (j15 == qVar2.f44764o) {
                    qVar2.f44763n = null;
                    qVar2.f44765p += j16;
                    qVar2.f44766q = 0L;
                    qVar2.h.removeCallbacks(qVar2.D);
                    ri.o oVar = qVar2.f44762m;
                    if (oVar == ri.o.f44751s) {
                        qVar2.c();
                        qVar2.s();
                        qVar2.l("cancelled");
                        return;
                    } else if (oVar == ri.o.f44750r) {
                        qVar2.c();
                        qVar2.s();
                        return;
                    } else if (qVar2.v) {
                        qVar2.v = false;
                        qVar2.i();
                        return;
                    } else if (oVar == ri.o.d) {
                        final ri.k kVar = qVar2.f44774z;
                        if (kVar == null) {
                            qVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = qVar2.j();
                        qVar2.f44767r = 0L;
                        qVar2.f44768s = j17;
                        qVar2.f44758i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                q qVar3 = q.this;
                                k kVar2 = kVar;
                                try {
                                    bArr = AudioRecorderNative.e(kVar2.f44737b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    qVar3.f44757g.a("waveform extraction failed", th2);
                                    bArr = null;
                                }
                                qVar3.h.post(new i(qVar3, kVar2, bArr, 4));
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
