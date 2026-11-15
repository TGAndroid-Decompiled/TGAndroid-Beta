package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uf0 implements org.telegram.ui.Components.li0 {
    public final org.telegram.ui.ActionBar.e2 f51935a;
    public final bg0 f51936b;

    public uf0(bg0 bg0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f51936b = bg0Var;
        this.f51935a = e2Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect Z0;
        ch.p0 p0Var2;
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z14;
        long j3;
        long j10;
        ch.p0 p0Var3;
        ch.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            bg0 bg0Var = this.f51936b;
            sf0 sf0Var = bg0Var.f45714e0;
            qf0 qf0Var = bg0Var.f45707a0;
            int i7 = bg0Var.f45710c;
            if (sf0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.m10.i(i7).q() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = bg0Var.Q;
                if (q1Var != null) {
                    org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f23819k;
                        long j11 = message.effect;
                        long j12 = p0Var4.f5189c;
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
                            org.telegram.ui.Cells.q1 q1Var2 = bg0Var.Q;
                            org.telegram.messenger.bj l10 = bg0Var.l(messageObject);
                            if (bg0Var.N.size() <= 1) {
                                z15 = false;
                            }
                            j3 = 0;
                            j10 = j11;
                            q1Var2.x3(messageObject, l10, z15, false, false, false);
                            sf0 sf0Var2 = bg0Var.f45714e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            sf0Var2.setSelectedReactionAnimated(p0Var3);
                            if (bg0Var.f45714e0.getReactionsWindow() != null && bg0Var.f45714e0.getReactionsWindow().f5021m != null) {
                                ch.x xVar = bg0Var.f45714e0.getReactionsWindow().f5021m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                xVar.setSelectedReaction(p0Var4);
                                bg0Var.f45714e0.getReactionsWindow().f5011a.invalidate();
                            }
                        } else {
                            j3 = 0;
                            j10 = j11;
                        }
                        qf0Var.c();
                        if (!z14) {
                            qf0Var.n(bg0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f23819k;
                            message2.effect = j10;
                            if (j10 == j3) {
                                message2.flags2 &= -5;
                            }
                        }
                        rf0 rf0Var = bg0Var.X;
                        if (rf0Var != null) {
                            rf0Var.setEffect(messageObject.f23819k.effect);
                        }
                        bg0Var.m(messageObject.f23819k.effect);
                    } else {
                        return;
                    }
                } else if (bg0Var.f45722l0 != null) {
                    long j13 = p0Var4.f5189c;
                    if (j13 == bg0Var.I) {
                        bg0Var.I = 0L;
                        z13 = true;
                    } else {
                        bg0Var.I = j13;
                        z13 = false;
                    }
                    rf0 rf0Var2 = bg0Var.X;
                    if (rf0Var2 != null) {
                        rf0Var2.setEffect(bg0Var.I);
                    }
                    bg0Var.m(bg0Var.I);
                    if (!z12) {
                        if (bg0Var.I == 0) {
                            Z0 = null;
                        } else {
                            Z0 = org.telegram.messenger.np.s1(i7).Z0(bg0Var.I);
                        }
                        org.telegram.ui.Components.e5 e5Var = bg0Var.J;
                        if (e5Var != null) {
                            if (bg0Var.I != 0 && Z0 != null) {
                                e5Var.g(org.telegram.messenger.j6.g(Z0.emoticon), true);
                            } else {
                                e5Var.g(null, true);
                            }
                        }
                        sf0 sf0Var3 = bg0Var.f45714e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        sf0Var3.setSelectedReactionAnimated(p0Var2);
                        if (bg0Var.f45714e0.getReactionsWindow() != null && bg0Var.f45714e0.getReactionsWindow().f5021m != null) {
                            ch.x xVar2 = bg0Var.f45714e0.getReactionsWindow().f5021m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            xVar2.setSelectedReaction(p0Var4);
                            bg0Var.f45714e0.getReactionsWindow().f5011a.invalidate();
                        }
                    }
                    qf0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = bg0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        bg0Var.f45707a0.d(null, 0, null, new org.telegram.messenger.gj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (e2Var = this.f51935a) != null) {
                    new org.telegram.ui.Components.cc(bg0Var.G, bg0Var.f45708b).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131754253, null), new tf0(0, e2Var))).j();
                }
                bg0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final void K() {
    }

    @Override
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
