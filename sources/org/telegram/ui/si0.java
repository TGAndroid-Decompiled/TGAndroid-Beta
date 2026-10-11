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
public final class si0 implements org.telegram.ui.Components.kl0 {
    public final org.telegram.ui.ActionBar.m2 f41788a;
    public final cj0 f41789b;

    public si0(cj0 cj0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f41789b = cj0Var;
        this.f41788a = m2Var;
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.n0 n0Var2;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.n0 n0Var3;
        zg.n0 n0Var4 = n0Var;
        if (n0Var4 != null) {
            cj0 cj0Var = this.f41789b;
            qi0 qi0Var = cj0Var.f36765e0;
            oi0 oi0Var = cj0Var.f36758a0;
            int i10 = cj0Var.f36761c;
            if (qi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && n0Var4.d) {
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
                        long j11 = n0Var4.f54736c;
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
                            qi0 qi0Var2 = cj0Var.f36765e0;
                            if (z14) {
                                n0Var3 = null;
                            } else {
                                n0Var3 = n0Var4;
                            }
                            qi0Var2.setSelectedReactionAnimated(n0Var3);
                            if (cj0Var.f36765e0.getReactionsWindow() != null && cj0Var.f36765e0.getReactionsWindow().f54580m != null) {
                                zg.w wVar = cj0Var.f36765e0.getReactionsWindow().f54580m;
                                if (z14) {
                                    n0Var4 = null;
                                }
                                wVar.setSelectedReaction(n0Var4);
                                cj0Var.f36765e0.getReactionsWindow().f54570a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        oi0Var.c();
                        if (!z14) {
                            oi0Var.n(cj0Var.Q, 0, false, false);
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
                } else if (cj0Var.f36773l0 != null) {
                    long j12 = n0Var4.f54736c;
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
                        org.telegram.ui.Components.q5 q5Var = cj0Var.J;
                        if (q5Var != null) {
                            if (cj0Var.I != 0 && effect != null) {
                                q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                q5Var.g(null, true);
                            }
                        }
                        qi0 qi0Var3 = cj0Var.f36765e0;
                        if (z13) {
                            n0Var2 = null;
                        } else {
                            n0Var2 = n0Var4;
                        }
                        qi0Var3.setSelectedReactionAnimated(n0Var2);
                        if (cj0Var.f36765e0.getReactionsWindow() != null && cj0Var.f36765e0.getReactionsWindow().f54580m != null) {
                            zg.w wVar2 = cj0Var.f36765e0.getReactionsWindow().f54580m;
                            if (z13) {
                                n0Var4 = null;
                            }
                            wVar2.setSelectedReaction(n0Var4);
                            cj0Var.f36765e0.getReactionsWindow().f54570a.invalidate();
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
                        cj0Var.f36758a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (m2Var = this.f41788a) != null) {
                    new org.telegram.ui.Components.ad(cj0Var.G, cj0Var.f36759b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ri0(0, m2Var))).j();
                }
                cj0Var.H.invalidate();
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
    public final boolean v() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
