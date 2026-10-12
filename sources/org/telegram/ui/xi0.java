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
public final class xi0 implements org.telegram.ui.Components.fl0 {
    public final org.telegram.ui.ActionBar.m2 f41865a;
    public final hj0 f41866b;

    public xi0(hj0 hj0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f41866b = hj0Var;
        this.f41865a = m2Var;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        ah.i1 i1Var2;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z14;
        long j10;
        boolean z15;
        ah.i1 i1Var3;
        ah.i1 i1Var4 = i1Var;
        if (i1Var4 != null) {
            hj0 hj0Var = this.f41866b;
            vi0 vi0Var = hj0Var.f36841e0;
            ti0 ti0Var = hj0Var.f36835a0;
            int i10 = hj0Var.f36838c;
            if (vi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = i1Var4.f778c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = hj0Var.Q;
                            j10 = j11;
                            MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
                            if (hj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            vi0 vi0Var2 = hj0Var.f36841e0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            vi0Var2.setSelectedReactionAnimated(i1Var3);
                            if (hj0Var.f36841e0.getReactionsWindow() != null && hj0Var.f36841e0.getReactionsWindow().f873m != null) {
                                ah.n0 n0Var = hj0Var.f36841e0.getReactionsWindow().f873m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                hj0Var.f36841e0.getReactionsWindow().f864a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        ti0Var.c();
                        if (!z14) {
                            ti0Var.n(hj0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ui0 ui0Var = hj0Var.X;
                        if (ui0Var != null) {
                            ui0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        hj0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (hj0Var.f36849l0 != null) {
                    long j13 = i1Var4.f778c;
                    if (j13 == hj0Var.I) {
                        hj0Var.I = 0L;
                        z13 = true;
                    } else {
                        hj0Var.I = j13;
                        z13 = false;
                    }
                    ui0 ui0Var2 = hj0Var.X;
                    if (ui0Var2 != null) {
                        ui0Var2.setEffect(hj0Var.I);
                    }
                    hj0Var.m(hj0Var.I);
                    if (!z12) {
                        if (hj0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(hj0Var.I);
                        }
                        org.telegram.ui.Components.q5 q5Var = hj0Var.J;
                        if (q5Var != null) {
                            if (hj0Var.I != 0 && effect != null) {
                                q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                q5Var.g(null, true);
                            }
                        }
                        vi0 vi0Var3 = hj0Var.f36841e0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        vi0Var3.setSelectedReactionAnimated(i1Var2);
                        if (hj0Var.f36841e0.getReactionsWindow() != null && hj0Var.f36841e0.getReactionsWindow().f873m != null) {
                            ah.n0 n0Var2 = hj0Var.f36841e0.getReactionsWindow().f873m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            hj0Var.f36841e0.getReactionsWindow().f864a.invalidate();
                        }
                    }
                    ti0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = hj0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        hj0Var.f36835a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (m2Var = this.f41865a) != null) {
                    new org.telegram.ui.Components.zc(hj0Var.G, hj0Var.f36836b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new wi0(0, m2Var))).j();
                }
                hj0Var.H.invalidate();
            }
        }
    }

    @Override
    public final void y() {
    }

    @Override
    public final void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
