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
public final class ti0 implements org.telegram.ui.Components.fk0 {
    public final org.telegram.ui.ActionBar.o2 f37758a;
    public final dj0 f37759b;

    public ti0(dj0 dj0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37759b = dj0Var;
        this.f37758a = o2Var;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.p0 p0Var2;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.p0 p0Var3;
        zg.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            dj0 dj0Var = this.f37759b;
            ri0 ri0Var = dj0Var.f33146e0;
            pi0 pi0Var = dj0Var.f33140a0;
            int i10 = dj0Var.f33143c;
            if (ri0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = dj0Var.Q;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = p0Var4.f49154c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = dj0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
                            if (dj0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.X3(messageObject, l4, z15, false, false, false);
                            ri0 ri0Var2 = dj0Var.f33146e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            ri0Var2.setSelectedReactionAnimated(p0Var3);
                            if (dj0Var.f33146e0.getReactionsWindow() != null && dj0Var.f33146e0.getReactionsWindow().f49020m != null) {
                                zg.y yVar = dj0Var.f33146e0.getReactionsWindow().f49020m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                yVar.setSelectedReaction(p0Var4);
                                dj0Var.f33146e0.getReactionsWindow().f49011a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        pi0Var.c();
                        if (!z14) {
                            pi0Var.o(dj0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        qi0 qi0Var = dj0Var.X;
                        if (qi0Var != null) {
                            qi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        dj0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (dj0Var.f33154l0 != null) {
                    long j12 = p0Var4.f49154c;
                    if (j12 == dj0Var.I) {
                        dj0Var.I = 0L;
                        z13 = true;
                    } else {
                        dj0Var.I = j12;
                        z13 = false;
                    }
                    qi0 qi0Var2 = dj0Var.X;
                    if (qi0Var2 != null) {
                        qi0Var2.setEffect(dj0Var.I);
                    }
                    dj0Var.m(dj0Var.I);
                    if (!z12) {
                        if (dj0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(dj0Var.I);
                        }
                        org.telegram.ui.Components.m5 m5Var = dj0Var.J;
                        if (m5Var != null) {
                            if (dj0Var.I != 0 && effect != null) {
                                m5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                m5Var.g(null, true);
                            }
                        }
                        ri0 ri0Var3 = dj0Var.f33146e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        ri0Var3.setSelectedReactionAnimated(p0Var2);
                        if (dj0Var.f33146e0.getReactionsWindow() != null && dj0Var.f33146e0.getReactionsWindow().f49020m != null) {
                            zg.y yVar2 = dj0Var.f33146e0.getReactionsWindow().f49020m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            yVar2.setSelectedReaction(p0Var4);
                            dj0Var.f33146e0.getReactionsWindow().f49011a.invalidate();
                        }
                    }
                    pi0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = dj0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        dj0Var.f33140a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f37758a) != null) {
                    new org.telegram.ui.Components.vc(dj0Var.G, dj0Var.f33141b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new si0(0, o2Var))).j();
                }
                dj0Var.H.invalidate();
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
