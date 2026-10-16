package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import pi.g;
import qi.k;
import qi.q;
public final class uo implements Runnable {
    public final int f40456a;
    public final long f40457b;
    public final long f40458c;
    public final Object d;

    public uo(Object obj, long j10, long j11, int i10) {
        this.f40456a = i10;
        this.d = obj;
        this.f40457b = j10;
        this.f40458c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.a71 a71Var;
        switch (this.f40456a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40457b, this.f40458c, new f5((zo) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                long j10 = this.f40457b;
                long j11 = this.f40458c;
                z1Var.f41271f = j10;
                z1Var.h = j11;
                org.telegram.ui.Components.c71 c71Var = z1Var.f24003a;
                if (c71Var != null && (a71Var = c71Var.W2) != null && c71Var.G) {
                    a71Var.N(true);
                    return;
                }
                return;
            case 2:
                qi.q qVar = (qi.q) this.d;
                long j12 = this.f40457b;
                long j13 = this.f40458c;
                if (qVar.f43438m == qi.o.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    qVar.f43441p = j14;
                    qVar.f43443r = 0L;
                    qVar.f43444s = qi.q.q(j14);
                    qVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f40457b;
                long j16 = this.f40458c;
                final qi.q qVar2 = (qi.q) ((cc.e) this.d).f4725c;
                if (j15 == qVar2.f43440o) {
                    qVar2.f43439n = null;
                    qVar2.f43441p += j16;
                    qVar2.f43442q = 0L;
                    qVar2.h.removeCallbacks(qVar2.D);
                    qi.o oVar = qVar2.f43438m;
                    if (oVar == qi.o.f43427s) {
                        qVar2.c();
                        qVar2.s();
                        qVar2.l("cancelled");
                        return;
                    } else if (oVar == qi.o.f43426r) {
                        qVar2.c();
                        qVar2.s();
                        return;
                    } else if (qVar2.v) {
                        qVar2.v = false;
                        qVar2.i();
                        return;
                    } else if (oVar == qi.o.d) {
                        final qi.k kVar = qVar2.f43450z;
                        if (kVar == null) {
                            qVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = qVar2.j();
                        qVar2.f43443r = 0L;
                        qVar2.f43444s = j17;
                        qVar2.f43434i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                q qVar3 = q.this;
                                k kVar2 = kVar;
                                try {
                                    bArr = AudioRecorderNative.e(kVar2.f43413b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    qVar3.f43433g.a("waveform extraction failed", th2);
                                    bArr = null;
                                }
                                qVar3.h.post(new g(qVar3, kVar2, bArr, 1));
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
