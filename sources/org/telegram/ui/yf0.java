package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class yf0 implements org.telegram.ui.Components.ui0 {
    public final org.telegram.ui.ActionBar.h2 f54139a;
    public final fg0 f54140b;

    public yf0(fg0 fg0Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f54140b = fg0Var;
        this.f54139a = h2Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect b12;
        ch.p0 p0Var2;
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z14;
        long j3;
        long j10;
        ch.p0 p0Var3;
        ch.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            fg0 fg0Var = this.f54140b;
            wf0 wf0Var = fg0Var.f47626e0;
            uf0 uf0Var = fg0Var.f47619a0;
            int i7 = fg0Var.f47622c;
            if (wf0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.j10.i(i7).q() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.r1 r1Var = fg0Var.Q;
                if (r1Var != null) {
                    org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f23965k;
                        long j11 = message.effect;
                        long j12 = p0Var4.f5473c;
                        if (j12 == j11) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z14 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j12;
                            z14 = false;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.r1 r1Var2 = fg0Var.Q;
                            org.telegram.messenger.aj l10 = fg0Var.l(messageObject);
                            if (fg0Var.N.size() <= 1) {
                                z15 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            r1Var2.y3(messageObject, l10, z15, false, false, false);
                            wf0 wf0Var2 = fg0Var.f47626e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            wf0Var2.setSelectedReactionAnimated(p0Var3);
                            if (fg0Var.f47626e0.getReactionsWindow() != null && fg0Var.f47626e0.getReactionsWindow().f5304m != null) {
                                ch.x xVar = fg0Var.f47626e0.getReactionsWindow().f5304m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                xVar.setSelectedReaction(p0Var4);
                                fg0Var.f47626e0.getReactionsWindow().f5294a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        uf0Var.c();
                        if (!z14) {
                            uf0Var.n(fg0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f23965k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        vf0 vf0Var = fg0Var.X;
                        if (vf0Var != null) {
                            vf0Var.setEffect(messageObject.f23965k.effect);
                        }
                        fg0Var.m(messageObject.f23965k.effect);
                    } else {
                        return;
                    }
                } else if (fg0Var.f47634l0 != null) {
                    long j13 = p0Var4.f5473c;
                    if (j13 == fg0Var.I) {
                        fg0Var.I = 0L;
                        z13 = true;
                    } else {
                        fg0Var.I = j13;
                        z13 = false;
                    }
                    vf0 vf0Var2 = fg0Var.X;
                    if (vf0Var2 != null) {
                        vf0Var2.setEffect(fg0Var.I);
                    }
                    fg0Var.m(fg0Var.I);
                    if (!z12) {
                        if (fg0Var.I == 0) {
                            b12 = null;
                        } else {
                            b12 = org.telegram.messenger.mp.u1(i7).b1(fg0Var.I);
                        }
                        org.telegram.ui.Components.m5 m5Var = fg0Var.J;
                        if (m5Var != null) {
                            if (fg0Var.I != 0 && b12 != null) {
                                m5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                            } else {
                                m5Var.g(null, true);
                            }
                        }
                        wf0 wf0Var3 = fg0Var.f47626e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        wf0Var3.setSelectedReactionAnimated(p0Var2);
                        if (fg0Var.f47626e0.getReactionsWindow() != null && fg0Var.f47626e0.getReactionsWindow().f5304m != null) {
                            ch.x xVar2 = fg0Var.f47626e0.getReactionsWindow().f5304m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            xVar2.setSelectedReaction(p0Var4);
                            fg0Var.f47626e0.getReactionsWindow().f5294a.invalidate();
                        }
                    }
                    uf0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = fg0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        fg0Var.f47619a0.d(null, 0, null, new org.telegram.messenger.fj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (h2Var = this.f54139a) != null) {
                    new org.telegram.ui.Components.lc(fg0Var.G, fg0Var.f47620b).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131754251, null), new xf0(0, h2Var))).j();
                }
                fg0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
