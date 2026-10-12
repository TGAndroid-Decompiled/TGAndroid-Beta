package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.mh0;
import pi.m;
import pi.s;
public final class to implements Runnable {
    public final int f42254a;
    public final long f42255b;
    public final long f42256c;
    public final Object d;

    public to(Object obj, long j3, long j10, int i10) {
        this.f42254a = i10;
        this.d = obj;
        this.f42255b = j3;
        this.f42256c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.h71 h71Var;
        switch (this.f42254a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f42255b, this.f42256c, new e5((xo) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j3 = this.f42255b;
                long j10 = this.f42256c;
                y1Var.f43491f = j3;
                y1Var.h = j10;
                org.telegram.ui.Components.j71 j71Var = y1Var.f27773a;
                if (j71Var != null && (h71Var = j71Var.W2) != null && j71Var.G) {
                    h71Var.N(true);
                    return;
                }
                return;
            case 2:
                pi.s sVar = (pi.s) this.d;
                long j11 = this.f42255b;
                long j12 = this.f42256c;
                if (sVar.f45822m == pi.q.h) {
                    long j13 = ((j11 - j12) * 48000) / 1000;
                    sVar.f45825p = j13;
                    sVar.f45827r = 0L;
                    sVar.f45828s = pi.s.q(j13);
                    sVar.i();
                    return;
                }
                return;
            default:
                long j14 = this.f42255b;
                long j15 = this.f42256c;
                final pi.s sVar2 = (pi.s) ((bc.e) this.d).f3855c;
                if (j14 == sVar2.f45824o) {
                    sVar2.f45823n = null;
                    sVar2.f45825p += j15;
                    sVar2.f45826q = 0L;
                    sVar2.h.removeCallbacks(sVar2.D);
                    pi.q qVar = sVar2.f45822m;
                    if (qVar == pi.q.f45810s) {
                        sVar2.r();
                        sVar2.l("cancelled");
                        return;
                    } else if (qVar == pi.q.f45809r) {
                        sVar2.r();
                        return;
                    } else if (sVar2.v) {
                        sVar2.v = false;
                        sVar2.i();
                        return;
                    } else if (qVar == pi.q.d) {
                        final pi.m mVar = sVar2.f45834z;
                        if (mVar == null) {
                            sVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j16 = sVar2.j();
                        sVar2.f45827r = 0L;
                        sVar2.f45828s = j16;
                        sVar2.f45818i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                s sVar3 = s.this;
                                m mVar2 = mVar;
                                try {
                                    bArr = AudioRecorderNative.e(mVar2.f45794b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    sVar3.f45817g.a("waveform extraction failed", th2);
                                    bArr = null;
                                }
                                sVar3.h.post(new mh0(sVar3, mVar2, bArr, 28));
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
