package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xf0 implements org.telegram.ui.Components.wi0 {
    public final org.telegram.ui.ActionBar.g2 f53800a;
    public final eg0 f53801b;

    public xf0(eg0 eg0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f53801b = eg0Var;
        this.f53800a = g2Var;
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
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z14;
        long j3;
        long j10;
        ch.p0 p0Var3;
        ch.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            eg0 eg0Var = this.f53801b;
            vf0 vf0Var = eg0Var.f47240e0;
            tf0 tf0Var = eg0Var.f47233a0;
            int i7 = eg0Var.f47236c;
            if (vf0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.k10.i(i7).q() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.r1 r1Var = eg0Var.Q;
                if (r1Var != null) {
                    org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f24177k;
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
                            org.telegram.ui.Cells.r1 r1Var2 = eg0Var.Q;
                            org.telegram.messenger.bj l10 = eg0Var.l(messageObject);
                            if (eg0Var.N.size() <= 1) {
                                z15 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            r1Var2.y3(messageObject, l10, z15, false, false, false);
                            vf0 vf0Var2 = eg0Var.f47240e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            vf0Var2.setSelectedReactionAnimated(p0Var3);
                            if (eg0Var.f47240e0.getReactionsWindow() != null && eg0Var.f47240e0.getReactionsWindow().f5299m != null) {
                                ch.x xVar = eg0Var.f47240e0.getReactionsWindow().f5299m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                xVar.setSelectedReaction(p0Var4);
                                eg0Var.f47240e0.getReactionsWindow().f5289a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        tf0Var.c();
                        if (!z14) {
                            tf0Var.n(eg0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f24177k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        uf0 uf0Var = eg0Var.X;
                        if (uf0Var != null) {
                            uf0Var.setEffect(messageObject.f24177k.effect);
                        }
                        eg0Var.m(messageObject.f24177k.effect);
                    } else {
                        return;
                    }
                } else if (eg0Var.f47248l0 != null) {
                    long j13 = p0Var4.f5468c;
                    if (j13 == eg0Var.I) {
                        eg0Var.I = 0L;
                        z13 = true;
                    } else {
                        eg0Var.I = j13;
                        z13 = false;
                    }
                    uf0 uf0Var2 = eg0Var.X;
                    if (uf0Var2 != null) {
                        uf0Var2.setEffect(eg0Var.I);
                    }
                    eg0Var.m(eg0Var.I);
                    if (!z12) {
                        if (eg0Var.I == 0) {
                            b12 = null;
                        } else {
                            b12 = org.telegram.messenger.np.u1(i7).b1(eg0Var.I);
                        }
                        org.telegram.ui.Components.n5 n5Var = eg0Var.J;
                        if (n5Var != null) {
                            if (eg0Var.I != 0 && b12 != null) {
                                n5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                            } else {
                                n5Var.g(null, true);
                            }
                        }
                        vf0 vf0Var3 = eg0Var.f47240e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        vf0Var3.setSelectedReactionAnimated(p0Var2);
                        if (eg0Var.f47240e0.getReactionsWindow() != null && eg0Var.f47240e0.getReactionsWindow().f5299m != null) {
                            ch.x xVar2 = eg0Var.f47240e0.getReactionsWindow().f5299m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            xVar2.setSelectedReaction(p0Var4);
                            eg0Var.f47240e0.getReactionsWindow().f5289a.invalidate();
                        }
                    }
                    tf0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = eg0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        eg0Var.f47233a0.d(null, 0, null, new org.telegram.messenger.gj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (g2Var = this.f53800a) != null) {
                    new org.telegram.ui.Components.lc(eg0Var.G, eg0Var.f47234b).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131754250, null), new wf0(0, g2Var))).j();
                }
                eg0Var.H.invalidate();
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
