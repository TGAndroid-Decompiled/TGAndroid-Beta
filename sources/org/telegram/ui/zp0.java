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
public class zp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.f6 f43479a;
    public final int f43480b;
    public final boolean f43481c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.i9 f43482e;
    public final ll f43483f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean f43484n;
    public final org.telegram.ui.Components.o5 f43485r;
    public final org.telegram.ui.Components.o5 f43486s;
    public final org.telegram.ui.Components.o5 v;
    public final bi.l9 f43487w;
    public final org.telegram.ui.Components.e6 f43488x;
    public MessagesController.PeerColor f43489y;

    public zp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.f43482e = i9Var;
        this.v = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f43487w = new bi.l9(this);
        this.f43488x = new org.telegram.ui.Components.e6(this, 320L, org.telegram.ui.Components.pr.h);
        this.E = new RectF();
        this.f43480b = i10;
        this.f43479a = f6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43481c = z10;
        ll llVar = new ll(this, context, 2);
        this.f43483f = llVar;
        this.f43485r = new org.telegram.ui.Components.o5(AndroidUtilities.dp(17.0f), llVar);
        this.f43486s = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), llVar);
        llVar.setLeftDrawableOutside(true);
        llVar.setRightDrawableOutside(true);
        llVar.setTextColor(-1);
        llVar.setTextSize(20);
        llVar.setTypeface(AndroidUtilities.bold());
        llVar.setWidthWrapContent(true);
        addView(llVar, w7.x5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, w7.x5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            i9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, i9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            i9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, i9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f43483f.l(userName, false);
        this.f43485r.j(botVerificationIcon, false);
        this.f43483f.setLeftDrawable(this.f43485r);
        this.f43486s.j(j10, false);
        this.f43483f.i(this.f43486s);
        if (this.f43481c) {
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
                    org.telegram.ui.ActionBar.j5 j5Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    j5Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.j5 j5Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    j5Var3.l(LocaleController.getString(i11).toLowerCase(), false);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f43479a;
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
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.f(color1)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.f(color1)], f6Var);
            } else {
                long j3 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.e(j3)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.e(j3)], f6Var);
            }
        } else {
            long j10 = i10;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20881p8[org.telegram.ui.Components.i9.e(j10)], f6Var);
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20899q8[org.telegram.ui.Components.i9.e(j10)], f6Var);
        }
        this.f43482e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f43480b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f43489y = peerColor;
        org.telegram.ui.ActionBar.f6 f6Var = this.f43479a;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        ll llVar = this.f43483f;
        org.telegram.ui.Components.o5 o5Var = this.f43485r;
        org.telegram.ui.Components.o5 o5Var2 = this.f43486s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.o5 o5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                o5Var3.k(Integer.valueOf(i10));
            } else {
                o5Var3.k(Integer.valueOf(bq0.w0(peerColor.getBgColor1(q6))));
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            o5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (!org.telegram.ui.ActionBar.j6.b1(org.telegram.ui.ActionBar.j6.v0(i11, f6Var))) {
                j5Var.setTextColor(d);
            } else {
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.C(q6, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), d, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20737h8, f6Var), d));
            }
            llVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var))));
            } else {
                o5Var3.k(Integer.valueOf(bq0.w0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.j6.f21072zh;
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
            llVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        }
        this.f43487w.c(peerColor, z10);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f43479a;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f43489y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                o5Var.k(Integer.valueOf(i11));
            } else {
                o5Var.k(Integer.valueOf(bq0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A8, false))));
            } else {
                o5Var.k(Integer.valueOf(bq0.w0(org.telegram.ui.ActionBar.j6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f43489y;
        org.telegram.ui.Components.o5 o5Var2 = this.f43486s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, f6Var);
            if (this.f43489y.hasColor6(q6)) {
                peerColor = this.f43489y;
                i10 = 4;
            } else {
                peerColor = this.f43489y;
                i10 = 2;
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, f6Var))));
        } else {
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var)));
        }
        if (!z11) {
            this.f43488x.a(z10);
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
        zh.j0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f43484n) {
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
        if (this.f43484n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f43487w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.o5 o5Var = this.f43486s;
        o5Var.j(j3, z11);
        o5Var.m(z10, z11);
        org.telegram.ui.ActionBar.f6 f6Var = this.f43479a;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f43489y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f43489y.hasColor6(q6)) {
                color3 = this.f43489y.getColor5(q6);
            } else {
                color3 = this.f43489y.getColor3(q6);
            }
            o5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var)));
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
        if (this.f43484n != z10) {
            invalidate();
        }
        this.f43484n = z10;
    }
}
