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
public final class si0 implements org.telegram.ui.Components.ek0 {
    public final org.telegram.ui.ActionBar.n2 f40486a;
    public final cj0 f40487b;

    public si0(cj0 cj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f40487b = cj0Var;
        this.f40486a = n2Var;
    }

    @Override
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        ah.j1 j1Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j3;
        boolean z15;
        ah.j1 j1Var3;
        ah.j1 j1Var4 = j1Var;
        if (j1Var4 != null) {
            cj0 cj0Var = this.f40487b;
            qi0 qi0Var = cj0Var.f35162e0;
            oi0 oi0Var = cj0Var.f35155a0;
            int i10 = cj0Var.f35158c;
            if (qi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && j1Var4.d) {
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
                        long j11 = j1Var4.f607c;
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
                            qi0 qi0Var2 = cj0Var.f35162e0;
                            if (z14) {
                                j1Var3 = null;
                            } else {
                                j1Var3 = j1Var4;
                            }
                            qi0Var2.setSelectedReactionAnimated(j1Var3);
                            if (cj0Var.f35162e0.getReactionsWindow() != null && cj0Var.f35162e0.getReactionsWindow().f707m != null) {
                                ah.o0 o0Var = cj0Var.f35162e0.getReactionsWindow().f707m;
                                if (z14) {
                                    j1Var4 = null;
                                }
                                o0Var.setSelectedReaction(j1Var4);
                                cj0Var.f35162e0.getReactionsWindow().f697a.invalidate();
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
                } else if (cj0Var.f35170l0 != null) {
                    long j12 = j1Var4.f607c;
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
                        qi0 qi0Var3 = cj0Var.f35162e0;
                        if (z13) {
                            j1Var2 = null;
                        } else {
                            j1Var2 = j1Var4;
                        }
                        qi0Var3.setSelectedReactionAnimated(j1Var2);
                        if (cj0Var.f35162e0.getReactionsWindow() != null && cj0Var.f35162e0.getReactionsWindow().f707m != null) {
                            ah.o0 o0Var2 = cj0Var.f35162e0.getReactionsWindow().f707m;
                            if (z13) {
                                j1Var4 = null;
                            }
                            o0Var2.setSelectedReaction(j1Var4);
                            cj0Var.f35162e0.getReactionsWindow().f697a.invalidate();
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
                        cj0Var.f35155a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f40486a) != null) {
                    new org.telegram.ui.Components.yc(cj0Var.G, cj0Var.f35156b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ri0(0, n2Var))).j();
                }
                cj0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
