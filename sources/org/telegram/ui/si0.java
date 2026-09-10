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
public final class si0 implements org.telegram.ui.Components.ok0 {
    public final org.telegram.ui.ActionBar.p2 f36690a;
    public final cj0 f36691b;

    public si0(cj0 cj0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f36691b = cj0Var;
        this.f36690a = p2Var;
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
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        yg.p0 p0Var2;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z14;
        long j3;
        boolean z15;
        yg.p0 p0Var3;
        yg.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            cj0 cj0Var = this.f36691b;
            qi0 qi0Var = cj0Var.f31689e0;
            oi0 oi0Var = cj0Var.f31683a0;
            int i10 = cj0Var.f31686c;
            if (qi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = cj0Var.Q;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = p0Var4.f47100c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = cj0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
                            if (cj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.X3(messageObject, l4, z15, false, false, false);
                            qi0 qi0Var2 = cj0Var.f31689e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            qi0Var2.setSelectedReactionAnimated(p0Var3);
                            if (cj0Var.f31689e0.getReactionsWindow() != null && cj0Var.f31689e0.getReactionsWindow().f46959m != null) {
                                yg.y yVar = cj0Var.f31689e0.getReactionsWindow().f46959m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                yVar.setSelectedReaction(p0Var4);
                                cj0Var.f31689e0.getReactionsWindow().f46950a.invalidate();
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
                } else if (cj0Var.f31697l0 != null) {
                    long j12 = p0Var4.f47100c;
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
                        org.telegram.ui.Components.n5 n5Var = cj0Var.J;
                        if (n5Var != null) {
                            if (cj0Var.I != 0 && effect != null) {
                                n5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                n5Var.g(null, true);
                            }
                        }
                        qi0 qi0Var3 = cj0Var.f31689e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        qi0Var3.setSelectedReactionAnimated(p0Var2);
                        if (cj0Var.f31689e0.getReactionsWindow() != null && cj0Var.f31689e0.getReactionsWindow().f46959m != null) {
                            yg.y yVar2 = cj0Var.f31689e0.getReactionsWindow().f46959m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            yVar2.setSelectedReaction(p0Var4);
                            cj0Var.f31689e0.getReactionsWindow().f46950a.invalidate();
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
                        cj0Var.f31683a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (p2Var = this.f36690a) != null) {
                    new org.telegram.ui.Components.wc(cj0Var.G, cj0Var.f31684b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ri0(0, p2Var))).j();
                }
                cj0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
