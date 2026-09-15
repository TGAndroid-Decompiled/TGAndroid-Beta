package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ri0 implements org.telegram.ui.Components.ek0 {
    public final org.telegram.ui.ActionBar.n2 f37121a;
    public final bj0 f37122b;

    public ri0(bj0 bj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37122b = bj0Var;
        this.f37121a = n2Var;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.p0 p0Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.p0 p0Var3;
        zg.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            bj0 bj0Var = this.f37122b;
            pi0 pi0Var = bj0Var.f32182e0;
            ni0 ni0Var = bj0Var.f32176a0;
            int i10 = bj0Var.f32179c;
            if (pi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = p0Var4.f49126c;
                        if (j11 == j10) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z14 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j11;
                            z14 = false;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.t1 t1Var2 = bj0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = bj0Var.l(messageObject);
                            if (bj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.X3(messageObject, l4, z15, false, false, false);
                            pi0 pi0Var2 = bj0Var.f32182e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            pi0Var2.setSelectedReactionAnimated(p0Var3);
                            if (bj0Var.f32182e0.getReactionsWindow() != null && bj0Var.f32182e0.getReactionsWindow().f48992m != null) {
                                zg.y yVar = bj0Var.f32182e0.getReactionsWindow().f48992m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                yVar.setSelectedReaction(p0Var4);
                                bj0Var.f32182e0.getReactionsWindow().f48983a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        ni0Var.c();
                        if (!z14) {
                            ni0Var.o(bj0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        oi0 oi0Var = bj0Var.X;
                        if (oi0Var != null) {
                            oi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        bj0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (bj0Var.f32190l0 != null) {
                    long j12 = p0Var4.f49126c;
                    if (j12 == bj0Var.I) {
                        bj0Var.I = 0L;
                        z13 = true;
                    } else {
                        bj0Var.I = j12;
                        z13 = false;
                    }
                    oi0 oi0Var2 = bj0Var.X;
                    if (oi0Var2 != null) {
                        oi0Var2.setEffect(bj0Var.I);
                    }
                    bj0Var.m(bj0Var.I);
                    if (!z12) {
                        if (bj0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(bj0Var.I);
                        }
                        org.telegram.ui.Components.m5 m5Var = bj0Var.J;
                        if (m5Var != null) {
                            if (bj0Var.I != 0 && effect != null) {
                                m5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                m5Var.g(null, true);
                            }
                        }
                        pi0 pi0Var3 = bj0Var.f32182e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        pi0Var3.setSelectedReactionAnimated(p0Var2);
                        if (bj0Var.f32182e0.getReactionsWindow() != null && bj0Var.f32182e0.getReactionsWindow().f48992m != null) {
                            zg.y yVar2 = bj0Var.f32182e0.getReactionsWindow().f48992m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            yVar2.setSelectedReaction(p0Var4);
                            bj0Var.f32182e0.getReactionsWindow().f48983a.invalidate();
                        }
                    }
                    ni0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = bj0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        bj0Var.f32176a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f37121a) != null) {
                    new org.telegram.ui.Components.vc(bj0Var.G, bj0Var.f32177b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new qi0(0, n2Var))).j();
                }
                bj0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
