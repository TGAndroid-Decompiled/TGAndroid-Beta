package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wf0 implements org.telegram.ui.Components.ii0 {
    public final org.telegram.ui.ActionBar.f2 f51403a;
    public final dg0 f51404b;

    public wf0(dg0 dg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f51404b = dg0Var;
        this.f51403a = f2Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.TL_availableEffect Z0;
        ch.o0 o0Var2;
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z13;
        long j3;
        long j10;
        ch.o0 o0Var3;
        ch.o0 o0Var4 = o0Var;
        if (o0Var4 != null) {
            dg0 dg0Var = this.f51404b;
            uf0 uf0Var = dg0Var.f44953d0;
            sf0 sf0Var = dg0Var.Z;
            int i7 = dg0Var.f44951c;
            if (uf0Var != null) {
                boolean z14 = true;
                if (!org.telegram.messenger.p10.i(i7).q() && o0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = dg0Var.P;
                if (q1Var != null) {
                    org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f23262k;
                        long j11 = message.effect;
                        long j12 = o0Var4.f6352c;
                        if (j12 == j11) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z13 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j12;
                            z13 = false;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.q1 q1Var2 = dg0Var.P;
                            org.telegram.messenger.dj k10 = dg0Var.k(messageObject);
                            if (dg0Var.M.size() <= 1) {
                                z14 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            q1Var2.w3(messageObject, k10, z14, false, false, false);
                            uf0 uf0Var2 = dg0Var.f44953d0;
                            if (z13) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            uf0Var2.setSelectedReactionAnimated(o0Var3);
                            if (dg0Var.f44953d0.getReactionsWindow() != null && dg0Var.f44953d0.getReactionsWindow().f6191m != null) {
                                ch.w wVar = dg0Var.f44953d0.getReactionsWindow().f6191m;
                                if (z13) {
                                    o0Var4 = null;
                                }
                                wVar.setSelectedReaction(o0Var4);
                                dg0Var.f44953d0.getReactionsWindow().f6181a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        sf0Var.c();
                        if (!z13) {
                            sf0Var.n(dg0Var.P, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.f23262k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        tf0 tf0Var = dg0Var.W;
                        if (tf0Var != null) {
                            tf0Var.setEffect(messageObject.f23262k.effect);
                        }
                        dg0Var.l(messageObject.f23262k.effect);
                    } else {
                        return;
                    }
                } else if (dg0Var.f44962k0 != null) {
                    long j13 = o0Var4.f6352c;
                    if (j13 == dg0Var.H) {
                        dg0Var.H = 0L;
                        z12 = true;
                    } else {
                        dg0Var.H = j13;
                        z12 = false;
                    }
                    tf0 tf0Var2 = dg0Var.W;
                    if (tf0Var2 != null) {
                        tf0Var2.setEffect(dg0Var.H);
                    }
                    dg0Var.l(dg0Var.H);
                    if (!z11) {
                        if (dg0Var.H == 0) {
                            Z0 = null;
                        } else {
                            Z0 = org.telegram.messenger.qp.s1(i7).Z0(dg0Var.H);
                        }
                        org.telegram.ui.Components.g5 g5Var = dg0Var.I;
                        if (g5Var != null) {
                            if (dg0Var.H != 0 && Z0 != null) {
                                g5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                            } else {
                                g5Var.g(null, true);
                            }
                        }
                        uf0 uf0Var3 = dg0Var.f44953d0;
                        if (z12) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        uf0Var3.setSelectedReactionAnimated(o0Var2);
                        if (dg0Var.f44953d0.getReactionsWindow() != null && dg0Var.f44953d0.getReactionsWindow().f6191m != null) {
                            ch.w wVar2 = dg0Var.f44953d0.getReactionsWindow().f6191m;
                            if (z12) {
                                o0Var4 = null;
                            }
                            wVar2.setSelectedReaction(o0Var4);
                            dg0Var.f44953d0.getReactionsWindow().f6181a.invalidate();
                        }
                    }
                    sf0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = dg0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        dg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (f2Var = this.f51403a) != null) {
                    new org.telegram.ui.Components.hc(dg0Var.F, dg0Var.f44949b).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131754253, null), new vf0(0, f2Var))).j();
                }
                dg0Var.G.invalidate();
            }
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void M() {
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
