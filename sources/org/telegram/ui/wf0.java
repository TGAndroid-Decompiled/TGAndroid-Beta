package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wf0 implements org.telegram.ui.Components.wi0 {
    public final org.telegram.ui.ActionBar.g2 f53659a;
    public final dg0 f53660b;

    public wf0(dg0 dg0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f53660b = dg0Var;
        this.f53659a = g2Var;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect b12;
        ch.p0 p0Var2;
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z14;
        long j3;
        long j10;
        ch.p0 p0Var3;
        ch.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            dg0 dg0Var = this.f53660b;
            uf0 uf0Var = dg0Var.f47099e0;
            sf0 sf0Var = dg0Var.f47092a0;
            int i7 = dg0Var.f47095c;
            if (uf0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.i10.i(i7).q() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
                if (r1Var != null) {
                    org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f24073k;
                        long j11 = message.effect;
                        long j12 = p0Var4.f5468c;
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
                            org.telegram.ui.Cells.r1 r1Var2 = dg0Var.Q;
                            org.telegram.messenger.aj l10 = dg0Var.l(messageObject);
                            if (dg0Var.N.size() <= 1) {
                                z15 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            r1Var2.y3(messageObject, l10, z15, false, false, false);
                            uf0 uf0Var2 = dg0Var.f47099e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            uf0Var2.setSelectedReactionAnimated(p0Var3);
                            if (dg0Var.f47099e0.getReactionsWindow() != null && dg0Var.f47099e0.getReactionsWindow().f5299m != null) {
                                ch.x xVar = dg0Var.f47099e0.getReactionsWindow().f5299m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                xVar.setSelectedReaction(p0Var4);
                                dg0Var.f47099e0.getReactionsWindow().f5289a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        sf0Var.c();
                        if (!z14) {
                            sf0Var.n(dg0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f24073k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        tf0 tf0Var = dg0Var.X;
                        if (tf0Var != null) {
                            tf0Var.setEffect(messageObject.f24073k.effect);
                        }
                        dg0Var.m(messageObject.f24073k.effect);
                    } else {
                        return;
                    }
                } else if (dg0Var.f47107l0 != null) {
                    long j13 = p0Var4.f5468c;
                    if (j13 == dg0Var.I) {
                        dg0Var.I = 0L;
                        z13 = true;
                    } else {
                        dg0Var.I = j13;
                        z13 = false;
                    }
                    tf0 tf0Var2 = dg0Var.X;
                    if (tf0Var2 != null) {
                        tf0Var2.setEffect(dg0Var.I);
                    }
                    dg0Var.m(dg0Var.I);
                    if (!z12) {
                        if (dg0Var.I == 0) {
                            b12 = null;
                        } else {
                            b12 = org.telegram.messenger.mp.u1(i7).b1(dg0Var.I);
                        }
                        org.telegram.ui.Components.m5 m5Var = dg0Var.J;
                        if (m5Var != null) {
                            if (dg0Var.I != 0 && b12 != null) {
                                m5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                            } else {
                                m5Var.g(null, true);
                            }
                        }
                        uf0 uf0Var3 = dg0Var.f47099e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        uf0Var3.setSelectedReactionAnimated(p0Var2);
                        if (dg0Var.f47099e0.getReactionsWindow() != null && dg0Var.f47099e0.getReactionsWindow().f5299m != null) {
                            ch.x xVar2 = dg0Var.f47099e0.getReactionsWindow().f5299m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            xVar2.setSelectedReaction(p0Var4);
                            dg0Var.f47099e0.getReactionsWindow().f5289a.invalidate();
                        }
                    }
                    sf0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = dg0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        dg0Var.f47092a0.d(null, 0, null, new org.telegram.messenger.fj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (g2Var = this.f53659a) != null) {
                    new org.telegram.ui.Components.kc(dg0Var.G, dg0Var.f47093b).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131754250, null), new vf0(0, g2Var))).j();
                }
                dg0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void r() {
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
