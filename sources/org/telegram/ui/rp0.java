package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public class rp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.d6 f37435a;
    public final int f37436b;
    public final boolean f37437c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.h9 e;
    public final hl f37438f;
    public final org.telegram.ui.ActionBar.h5 h;
    public boolean f37439n;
    public final org.telegram.ui.Components.o5 f37440r;
    public final org.telegram.ui.Components.o5 f37441s;
    public final org.telegram.ui.Components.o5 v;
    public final ai.ea f37442w;
    public final org.telegram.ui.Components.e6 f37443x;
    public MessagesController.PeerColor f37444y;

    public rp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.e = h9Var;
        this.v = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f37442w = new ai.ea(this);
        this.f37443x = new org.telegram.ui.Components.e6(this, 320L, org.telegram.ui.Components.sr.h);
        this.E = new RectF();
        this.f37436b = i10;
        this.f37435a = d6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37437c = z10;
        hl hlVar = new hl(this, context, 2);
        this.f37438f = hlVar;
        this.f37440r = new org.telegram.ui.Components.o5(AndroidUtilities.dp(17.0f), hlVar);
        this.f37441s = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), hlVar);
        hlVar.setLeftDrawableOutside(true);
        hlVar.setRightDrawableOutside(true);
        hlVar.setTextColor(-1);
        hlVar.setTextSize(20);
        hlVar.setTypeface(AndroidUtilities.bold());
        hlVar.setWidthWrapContent(true);
        addView(hlVar, w7.y5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.h = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(-2130706433);
        h5Var.setGravity(1);
        addView(h5Var, w7.y5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            h9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, h9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            h9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, h9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f37438f.l(userName, false);
        this.f37440r.j(botVerificationIcon, false);
        this.f37438f.setLeftDrawable(this.f37440r);
        this.f37441s.j(j10, false);
        this.f37438f.i(this.f37441s);
        if (this.f37437c) {
            long j11 = -j3;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null && chatFull.participants_count > 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
                }
            } else if (chat2 != null && chat2.participants_count > 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                }
            } else {
                boolean isPublic = ChatObject.isPublic(chat2);
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    org.telegram.ui.ActionBar.h5 h5Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    h5Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.h5 h5Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    h5Var3.l(LocaleController.getString(i11).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37435a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColor peerColor = null;
            if (messagesController != null) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = null;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i10);
            }
            if (peerColor != null) {
                int color1 = peerColor.getColor1();
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19280p8[org.telegram.ui.Components.h9.f(color1)], d6Var);
                v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q8[org.telegram.ui.Components.h9.f(color1)], d6Var);
            } else {
                long j3 = i10;
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19280p8[org.telegram.ui.Components.h9.e(j3)], d6Var);
                v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q8[org.telegram.ui.Components.h9.e(j3)], d6Var);
            }
        } else {
            long j10 = i10;
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19280p8[org.telegram.ui.Components.h9.e(j10)], d6Var);
            v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q8[org.telegram.ui.Components.h9.e(j10)], d6Var);
        }
        this.e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f37436b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f37444y = peerColor;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37435a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        hl hlVar = this.f37438f;
        org.telegram.ui.Components.o5 o5Var = this.f37440r;
        org.telegram.ui.Components.o5 o5Var2 = this.f37441s;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        org.telegram.ui.Components.o5 o5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                o5Var3.k(Integer.valueOf(i10));
            } else {
                o5Var3.k(Integer.valueOf(tp0.w0(peerColor.getBgColor1(q6))));
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            o5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.h6.f19337s8;
            if (!org.telegram.ui.ActionBar.h6.b1(org.telegram.ui.ActionBar.h6.v0(i11, d6Var))) {
                h5Var.setTextColor(d);
            } else {
                h5Var.setTextColor(org.telegram.ui.ActionBar.h6.C(q6, org.telegram.ui.ActionBar.h6.v0(i11, d6Var), d, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19132h8, d6Var), d));
            }
            hlVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.f19337s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i12, d6Var)) > 0.8f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19243n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i12, d6Var)) < 0.2f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var))));
            } else {
                o5Var3.k(Integer.valueOf(tp0.w0(org.telegram.ui.ActionBar.h6.v0(i12, d6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.h6.f19472zh;
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(i13, d6Var)));
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(i13, d6Var)));
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B8, d6Var));
            hlVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        }
        this.f37442w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.v;
        if (j3 == 0) {
            o5Var.g(null, z11);
        } else {
            o5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f37435a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f37444y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                o5Var.k(Integer.valueOf(i11));
            } else {
                o5Var.k(Integer.valueOf(tp0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.f19337s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i12, d6Var)) > 0.8f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19243n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i12, d6Var)) < 0.2f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A8, false))));
            } else {
                o5Var.k(Integer.valueOf(tp0.w0(org.telegram.ui.ActionBar.h6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f37444y;
        org.telegram.ui.Components.o5 o5Var2 = this.f37441s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, d6Var);
            if (this.f37444y.hasColor6(q6)) {
                peerColor = this.f37444y;
                i10 = 4;
            } else {
                peerColor = this.f37444y;
                i10 = 2;
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, d6Var))));
        } else {
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19472zh, d6Var)));
        }
        if (!z11) {
            this.f37443x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int width = getWidth();
        RectF rectF = this.E;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        yh.j0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f37439n) {
            f7 = 18.0f;
        } else {
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width2 = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        if (this.f37439n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f37442w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.o5 o5Var = this.f37441s;
        o5Var.j(j3, z11);
        o5Var.m(z10, z11);
        org.telegram.ui.ActionBar.d6 d6Var = this.f37435a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f37444y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f37444y.hasColor6(q6)) {
                color3 = this.f37444y.getColor5(q6);
            } else {
                color3 = this.f37444y.getColor3(q6);
            }
            o5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19472zh, d6Var)));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.a();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.b();
        this.d.onDetachedFromWindow();
    }

    public void setForum(boolean z10) {
        if (this.f37439n != z10) {
            invalidate();
        }
        this.f37439n = z10;
    }
}
