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
public final class ui0 implements org.telegram.ui.Components.ml0 {
    public final org.telegram.ui.ActionBar.m2 f42527a;
    public final ej0 f42528b;

    public ui0(ej0 ej0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f42528b = ej0Var;
        this.f42527a = m2Var;
    }

    @Override
    public final void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
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
            ej0 ej0Var = this.f42528b;
            si0 si0Var = ej0Var.f37138e0;
            qi0 qi0Var = ej0Var.f37131a0;
            int i10 = ej0Var.f37134c;
            if (si0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && n0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = ej0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = n0Var4.f54847c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = ej0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = ej0Var.l(messageObject);
                            if (ej0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            si0 si0Var2 = ej0Var.f37138e0;
                            if (z14) {
                                n0Var3 = null;
                            } else {
                                n0Var3 = n0Var4;
                            }
                            si0Var2.setSelectedReactionAnimated(n0Var3);
                            if (ej0Var.f37138e0.getReactionsWindow() != null && ej0Var.f37138e0.getReactionsWindow().f54691m != null) {
                                zg.w wVar = ej0Var.f37138e0.getReactionsWindow().f54691m;
                                if (z14) {
                                    n0Var4 = null;
                                }
                                wVar.setSelectedReaction(n0Var4);
                                ej0Var.f37138e0.getReactionsWindow().f54681a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        qi0Var.c();
                        if (!z14) {
                            qi0Var.n(ej0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ri0 ri0Var = ej0Var.X;
                        if (ri0Var != null) {
                            ri0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ej0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ej0Var.f37146l0 != null) {
                    long j12 = n0Var4.f54847c;
                    if (j12 == ej0Var.I) {
                        ej0Var.I = 0L;
                        z13 = true;
                    } else {
                        ej0Var.I = j12;
                        z13 = false;
                    }
                    ri0 ri0Var2 = ej0Var.X;
                    if (ri0Var2 != null) {
                        ri0Var2.setEffect(ej0Var.I);
                    }
                    ej0Var.m(ej0Var.I);
                    if (!z12) {
                        if (ej0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ej0Var.I);
                        }
                        org.telegram.ui.Components.q5 q5Var = ej0Var.J;
                        if (q5Var != null) {
                            if (ej0Var.I != 0 && effect != null) {
                                q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                q5Var.g(null, true);
                            }
                        }
                        si0 si0Var3 = ej0Var.f37138e0;
                        if (z13) {
                            n0Var2 = null;
                        } else {
                            n0Var2 = n0Var4;
                        }
                        si0Var3.setSelectedReactionAnimated(n0Var2);
                        if (ej0Var.f37138e0.getReactionsWindow() != null && ej0Var.f37138e0.getReactionsWindow().f54691m != null) {
                            zg.w wVar2 = ej0Var.f37138e0.getReactionsWindow().f54691m;
                            if (z13) {
                                n0Var4 = null;
                            }
                            wVar2.setSelectedReaction(n0Var4);
                            ej0Var.f37138e0.getReactionsWindow().f54681a.invalidate();
                        }
                    }
                    qi0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = ej0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ej0Var.f37131a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (m2Var = this.f42527a) != null) {
                    new org.telegram.ui.Components.zc(ej0Var.G, ej0Var.f37132b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ti0(0, m2Var))).j();
                }
                ej0Var.H.invalidate();
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
    public final void p() {
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
