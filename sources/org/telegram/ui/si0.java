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
public final class si0 implements org.telegram.ui.Components.pk0 {
    public final org.telegram.ui.ActionBar.n2 f37292a;
    public final cj0 f37293b;

    public si0(cj0 cj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37293b = cj0Var;
        this.f37292a = n2Var;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.o0 o0Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.o0 o0Var3;
        zg.o0 o0Var4 = o0Var;
        if (o0Var4 != null) {
            cj0 cj0Var = this.f37293b;
            qi0 qi0Var = cj0Var.f32678e0;
            oi0 oi0Var = cj0Var.f32672a0;
            int i10 = cj0Var.f32675c;
            if (qi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && o0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = cj0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = o0Var4.f49376c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = cj0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
                            if (cj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            qi0 qi0Var2 = cj0Var.f32678e0;
                            if (z14) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            qi0Var2.setSelectedReactionAnimated(o0Var3);
                            if (cj0Var.f32678e0.getReactionsWindow() != null && cj0Var.f32678e0.getReactionsWindow().f49235m != null) {
                                zg.x xVar = cj0Var.f32678e0.getReactionsWindow().f49235m;
                                if (z14) {
                                    o0Var4 = null;
                                }
                                xVar.setSelectedReaction(o0Var4);
                                cj0Var.f32678e0.getReactionsWindow().f49226a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        oi0Var.c();
                        if (!z14) {
                            oi0Var.o(cj0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        pi0 pi0Var = cj0Var.X;
                        if (pi0Var != null) {
                            pi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        cj0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (cj0Var.f32686l0 != null) {
                    long j12 = o0Var4.f49376c;
                    if (j12 == cj0Var.I) {
                        cj0Var.I = 0L;
                        z13 = true;
                    } else {
                        cj0Var.I = j12;
                        z13 = false;
                    }
                    pi0 pi0Var2 = cj0Var.X;
                    if (pi0Var2 != null) {
                        pi0Var2.setEffect(cj0Var.I);
                    }
                    cj0Var.m(cj0Var.I);
                    if (!z12) {
                        if (cj0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(cj0Var.I);
                        }
                        org.telegram.ui.Components.o5 o5Var = cj0Var.J;
                        if (o5Var != null) {
                            if (cj0Var.I != 0 && effect != null) {
                                o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                o5Var.g(null, true);
                            }
                        }
                        qi0 qi0Var3 = cj0Var.f32678e0;
                        if (z13) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        qi0Var3.setSelectedReactionAnimated(o0Var2);
                        if (cj0Var.f32678e0.getReactionsWindow() != null && cj0Var.f32678e0.getReactionsWindow().f49235m != null) {
                            zg.x xVar2 = cj0Var.f32678e0.getReactionsWindow().f49235m;
                            if (z13) {
                                o0Var4 = null;
                            }
                            xVar2.setSelectedReaction(o0Var4);
                            cj0Var.f32678e0.getReactionsWindow().f49226a.invalidate();
                        }
                    }
                    oi0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = cj0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        cj0Var.f32672a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f37292a) != null) {
                    new org.telegram.ui.Components.xc(cj0Var.G, cj0Var.f32673b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ri0(0, n2Var))).j();
                }
                cj0Var.H.invalidate();
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
    public final boolean r() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
