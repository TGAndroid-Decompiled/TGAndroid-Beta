package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uf0 implements org.telegram.ui.Components.hi0 {
    public final org.telegram.ui.ActionBar.f2 f50403a;
    public final bg0 f50404b;

    public uf0(bg0 bg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f50404b = bg0Var;
        this.f50403a = f2Var;
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
            bg0 bg0Var = this.f50404b;
            sf0 sf0Var = bg0Var.f44306d0;
            qf0 qf0Var = bg0Var.Z;
            int i7 = bg0Var.f44304c;
            if (sf0Var != null) {
                boolean z14 = true;
                if (!org.telegram.messenger.p10.i(i7).q() && o0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = bg0Var.P;
                if (q1Var != null) {
                    org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f23237k;
                        long j11 = message.effect;
                        long j12 = o0Var4.f6354c;
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
                            org.telegram.ui.Cells.q1 q1Var2 = bg0Var.P;
                            org.telegram.messenger.dj k10 = bg0Var.k(messageObject);
                            if (bg0Var.M.size() <= 1) {
                                z14 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            q1Var2.v3(messageObject, k10, z14, false, false, false);
                            sf0 sf0Var2 = bg0Var.f44306d0;
                            if (z13) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            sf0Var2.setSelectedReactionAnimated(o0Var3);
                            if (bg0Var.f44306d0.getReactionsWindow() != null && bg0Var.f44306d0.getReactionsWindow().f6193m != null) {
                                ch.w wVar = bg0Var.f44306d0.getReactionsWindow().f6193m;
                                if (z13) {
                                    o0Var4 = null;
                                }
                                wVar.setSelectedReaction(o0Var4);
                                bg0Var.f44306d0.getReactionsWindow().f6183a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        qf0Var.c();
                        if (!z13) {
                            qf0Var.n(bg0Var.P, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.f23237k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        rf0 rf0Var = bg0Var.W;
                        if (rf0Var != null) {
                            rf0Var.setEffect(messageObject.f23237k.effect);
                        }
                        bg0Var.l(messageObject.f23237k.effect);
                    } else {
                        return;
                    }
                } else if (bg0Var.f44315k0 != null) {
                    long j13 = o0Var4.f6354c;
                    if (j13 == bg0Var.H) {
                        bg0Var.H = 0L;
                        z12 = true;
                    } else {
                        bg0Var.H = j13;
                        z12 = false;
                    }
                    rf0 rf0Var2 = bg0Var.W;
                    if (rf0Var2 != null) {
                        rf0Var2.setEffect(bg0Var.H);
                    }
                    bg0Var.l(bg0Var.H);
                    if (!z11) {
                        if (bg0Var.H == 0) {
                            Z0 = null;
                        } else {
                            Z0 = org.telegram.messenger.qp.s1(i7).Z0(bg0Var.H);
                        }
                        org.telegram.ui.Components.g5 g5Var = bg0Var.I;
                        if (g5Var != null) {
                            if (bg0Var.H != 0 && Z0 != null) {
                                g5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                            } else {
                                g5Var.g(null, true);
                            }
                        }
                        sf0 sf0Var3 = bg0Var.f44306d0;
                        if (z12) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        sf0Var3.setSelectedReactionAnimated(o0Var2);
                        if (bg0Var.f44306d0.getReactionsWindow() != null && bg0Var.f44306d0.getReactionsWindow().f6193m != null) {
                            ch.w wVar2 = bg0Var.f44306d0.getReactionsWindow().f6193m;
                            if (z12) {
                                o0Var4 = null;
                            }
                            wVar2.setSelectedReaction(o0Var4);
                            bg0Var.f44306d0.getReactionsWindow().f6183a.invalidate();
                        }
                    }
                    qf0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = bg0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        bg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (f2Var = this.f50403a) != null) {
                    new org.telegram.ui.Components.hc(bg0Var.F, bg0Var.f44302b).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131754253, null), new tf0(0, f2Var))).j();
                }
                bg0Var.G.invalidate();
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
