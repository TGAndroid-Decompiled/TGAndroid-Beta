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
public final class wi0 implements org.telegram.ui.Components.fl0 {
    public final org.telegram.ui.ActionBar.m2 f41295a;
    public final gj0 f41296b;

    public wi0(gj0 gj0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f41296b = gj0Var;
        this.f41295a = m2Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
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
            gj0 gj0Var = this.f41296b;
            ui0 ui0Var = gj0Var.f36239e0;
            si0 si0Var = gj0Var.f36233a0;
            int i10 = gj0Var.f36236c;
            if (ui0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = gj0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = i1Var4.f782c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = gj0Var.Q;
                            j10 = j11;
                            MessageObject.GroupedMessages l4 = gj0Var.l(messageObject);
                            if (gj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            ui0 ui0Var2 = gj0Var.f36239e0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            ui0Var2.setSelectedReactionAnimated(i1Var3);
                            if (gj0Var.f36239e0.getReactionsWindow() != null && gj0Var.f36239e0.getReactionsWindow().f877m != null) {
                                ah.n0 n0Var = gj0Var.f36239e0.getReactionsWindow().f877m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                gj0Var.f36239e0.getReactionsWindow().f868a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        si0Var.c();
                        if (!z14) {
                            si0Var.n(gj0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ti0 ti0Var = gj0Var.X;
                        if (ti0Var != null) {
                            ti0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        gj0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (gj0Var.f36247l0 != null) {
                    long j13 = i1Var4.f782c;
                    if (j13 == gj0Var.I) {
                        gj0Var.I = 0L;
                        z13 = true;
                    } else {
                        gj0Var.I = j13;
                        z13 = false;
                    }
                    ti0 ti0Var2 = gj0Var.X;
                    if (ti0Var2 != null) {
                        ti0Var2.setEffect(gj0Var.I);
                    }
                    gj0Var.m(gj0Var.I);
                    if (!z12) {
                        if (gj0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(gj0Var.I);
                        }
                        org.telegram.ui.Components.q5 q5Var = gj0Var.J;
                        if (q5Var != null) {
                            if (gj0Var.I != 0 && effect != null) {
                                q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                q5Var.g(null, true);
                            }
                        }
                        ui0 ui0Var3 = gj0Var.f36239e0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        ui0Var3.setSelectedReactionAnimated(i1Var2);
                        if (gj0Var.f36239e0.getReactionsWindow() != null && gj0Var.f36239e0.getReactionsWindow().f877m != null) {
                            ah.n0 n0Var2 = gj0Var.f36239e0.getReactionsWindow().f877m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            gj0Var.f36239e0.getReactionsWindow().f868a.invalidate();
                        }
                    }
                    si0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = gj0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        gj0Var.f36233a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (m2Var = this.f41295a) != null) {
                    new org.telegram.ui.Components.zc(gj0Var.G, gj0Var.f36234b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new vi0(0, m2Var))).j();
                }
                gj0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void y() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
