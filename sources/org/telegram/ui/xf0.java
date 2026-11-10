package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xf0 implements org.telegram.ui.Components.hi0 {
    public final org.telegram.ui.ActionBar.f2 f51715a;
    public final eg0 f51716b;

    public xf0(eg0 eg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f51716b = eg0Var;
        this.f51715a = f2Var;
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
            eg0 eg0Var = this.f51716b;
            vf0 vf0Var = eg0Var.f45274d0;
            tf0 tf0Var = eg0Var.Z;
            int i7 = eg0Var.f45272c;
            if (vf0Var != null) {
                boolean z14 = true;
                if (!org.telegram.messenger.p10.i(i7).q() && o0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
                if (q1Var != null) {
                    org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f23266k;
                        long j11 = message.effect;
                        long j12 = o0Var4.f6357c;
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
                            org.telegram.ui.Cells.q1 q1Var2 = eg0Var.P;
                            org.telegram.messenger.dj k10 = eg0Var.k(messageObject);
                            if (eg0Var.M.size() <= 1) {
                                z14 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            q1Var2.w3(messageObject, k10, z14, false, false, false);
                            vf0 vf0Var2 = eg0Var.f45274d0;
                            if (z13) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            vf0Var2.setSelectedReactionAnimated(o0Var3);
                            if (eg0Var.f45274d0.getReactionsWindow() != null && eg0Var.f45274d0.getReactionsWindow().f6196m != null) {
                                ch.w wVar = eg0Var.f45274d0.getReactionsWindow().f6196m;
                                if (z13) {
                                    o0Var4 = null;
                                }
                                wVar.setSelectedReaction(o0Var4);
                                eg0Var.f45274d0.getReactionsWindow().f6186a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        tf0Var.c();
                        if (!z13) {
                            tf0Var.n(eg0Var.P, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.f23266k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        uf0 uf0Var = eg0Var.W;
                        if (uf0Var != null) {
                            uf0Var.setEffect(messageObject.f23266k.effect);
                        }
                        eg0Var.l(messageObject.f23266k.effect);
                    } else {
                        return;
                    }
                } else if (eg0Var.f45283k0 != null) {
                    long j13 = o0Var4.f6357c;
                    if (j13 == eg0Var.H) {
                        eg0Var.H = 0L;
                        z12 = true;
                    } else {
                        eg0Var.H = j13;
                        z12 = false;
                    }
                    uf0 uf0Var2 = eg0Var.W;
                    if (uf0Var2 != null) {
                        uf0Var2.setEffect(eg0Var.H);
                    }
                    eg0Var.l(eg0Var.H);
                    if (!z11) {
                        if (eg0Var.H == 0) {
                            Z0 = null;
                        } else {
                            Z0 = org.telegram.messenger.qp.s1(i7).Z0(eg0Var.H);
                        }
                        org.telegram.ui.Components.f5 f5Var = eg0Var.I;
                        if (f5Var != null) {
                            if (eg0Var.H != 0 && Z0 != null) {
                                f5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                            } else {
                                f5Var.g(null, true);
                            }
                        }
                        vf0 vf0Var3 = eg0Var.f45274d0;
                        if (z12) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        vf0Var3.setSelectedReactionAnimated(o0Var2);
                        if (eg0Var.f45274d0.getReactionsWindow() != null && eg0Var.f45274d0.getReactionsWindow().f6196m != null) {
                            ch.w wVar2 = eg0Var.f45274d0.getReactionsWindow().f6196m;
                            if (z12) {
                                o0Var4 = null;
                            }
                            wVar2.setSelectedReaction(o0Var4);
                            eg0Var.f45274d0.getReactionsWindow().f6186a.invalidate();
                        }
                    }
                    tf0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = eg0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        eg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (f2Var = this.f51715a) != null) {
                    new org.telegram.ui.Components.gc(eg0Var.F, eg0Var.f45270b).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131754253, null), new wf0(0, f2Var))).j();
                }
                eg0Var.G.invalidate();
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
