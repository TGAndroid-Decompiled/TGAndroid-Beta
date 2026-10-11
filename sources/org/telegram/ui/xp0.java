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
public class xp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.d6 f44185a;
    public final int f44186b;
    public final boolean f44187c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.j9 f44188e;
    public final ml f44189f;
    public final org.telegram.ui.ActionBar.h5 h;
    public boolean f44190n;
    public final org.telegram.ui.Components.q5 f44191r;
    public final org.telegram.ui.Components.q5 f44192s;
    public final org.telegram.ui.Components.q5 v;
    public final ai.fa f44193w;
    public final org.telegram.ui.Components.g6 f44194x;
    public MessagesController.PeerColor f44195y;

    public xp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        this.f44188e = j9Var;
        this.v = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f44193w = new ai.fa(this);
        this.f44194x = new org.telegram.ui.Components.g6(this, 320L, org.telegram.ui.Components.is.h);
        this.E = new RectF();
        this.f44186b = i10;
        this.f44185a = d6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44187c = z10;
        ml mlVar = new ml(this, context, 2);
        this.f44189f = mlVar;
        this.f44191r = new org.telegram.ui.Components.q5(AndroidUtilities.dp(17.0f), mlVar);
        this.f44192s = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), mlVar);
        mlVar.setLeftDrawableOutside(true);
        mlVar.setRightDrawableOutside(true);
        mlVar.setTextColor(-1);
        mlVar.setTextSize(20);
        mlVar.setTypeface(AndroidUtilities.bold());
        mlVar.setWidthWrapContent(true);
        addView(mlVar, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.33f, -2, 81));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.h = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(-2130706433);
        h5Var.setGravity(1);
        addView(h5Var, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 20.66f, -2, 81));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            j9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f44189f.l(userName, false);
        this.f44191r.j(botVerificationIcon, false);
        this.f44189f.setLeftDrawable(this.f44191r);
        this.f44192s.j(j10, false);
        this.f44189f.i(this.f44192s);
        if (this.f44187c) {
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
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        org.telegram.ui.ActionBar.d6 d6Var = this.f44185a;
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
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21044p8[org.telegram.ui.Components.j9.f(color1)], d6Var);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21063q8[org.telegram.ui.Components.j9.f(color1)], d6Var);
            } else {
                long j3 = i10;
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21044p8[org.telegram.ui.Components.j9.e(j3)], d6Var);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21063q8[org.telegram.ui.Components.j9.e(j3)], d6Var);
            }
        } else {
            long j10 = i10;
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21044p8[org.telegram.ui.Components.j9.e(j10)], d6Var);
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21063q8[org.telegram.ui.Components.j9.e(j10)], d6Var);
        }
        this.f44188e.i(w02, w03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f44186b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f44195y = peerColor;
        org.telegram.ui.ActionBar.d6 d6Var = this.f44185a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        ml mlVar = this.f44189f;
        org.telegram.ui.Components.q5 q5Var = this.f44191r;
        org.telegram.ui.Components.q5 q5Var2 = this.f44192s;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        org.telegram.ui.Components.q5 q5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                q5Var3.k(Integer.valueOf(i10));
            } else {
                q5Var3.k(Integer.valueOf(zp0.w0(peerColor.getBgColor1(q6))));
            }
            q5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            q5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.h6.f21101s8;
            if (!org.telegram.ui.ActionBar.h6.c1(org.telegram.ui.ActionBar.h6.w0(i11, d6Var))) {
                h5Var.setTextColor(d);
            } else {
                h5Var.setTextColor(org.telegram.ui.ActionBar.h6.C(q6, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), d, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20896h8, d6Var), d));
            }
            mlVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.f21101s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i12, d6Var)) > 0.8f) {
                q5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i12, d6Var)) < 0.2f) {
                q5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var))));
            } else {
                q5Var3.k(Integer.valueOf(zp0.w0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.h6.f21236zh;
            q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B8, d6Var));
            mlVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        }
        this.f44193w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var = this.v;
        if (i11 == 0) {
            q5Var.g(null, z11);
        } else {
            q5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f44185a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f44195y;
        if (peerColor2 != null) {
            int i12 = peerColor2.patternColor;
            if (i12 != 0) {
                q5Var.k(Integer.valueOf(i12));
            } else {
                q5Var.k(Integer.valueOf(zp0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.h6.f21101s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)) > 0.8f) {
                q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)) < 0.2f) {
                q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false))));
            } else {
                q5Var.k(Integer.valueOf(zp0.w0(org.telegram.ui.ActionBar.h6.x0(null, i13, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f44195y;
        org.telegram.ui.Components.q5 q5Var2 = this.f44192s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, d6Var);
            if (this.f44195y.hasColor6(q6)) {
                peerColor = this.f44195y;
                i10 = 4;
            } else {
                peerColor = this.f44195y;
                i10 = 2;
            }
            q5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, d6Var))));
        } else {
            q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, d6Var)));
        }
        if (!z11) {
            this.f44194x.a(z10);
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
        yh.i0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f44190n) {
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
        if (this.f44190n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f44193w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.q5 q5Var = this.f44192s;
        q5Var.j(j3, z11);
        q5Var.m(z10, z11);
        org.telegram.ui.ActionBar.d6 d6Var = this.f44185a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f44195y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f44195y.hasColor6(q6)) {
                color3 = this.f44195y.getColor5(q6);
            } else {
                color3 = this.f44195y.getColor3(q6);
            }
            q5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, d6Var)));
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
        if (this.f44190n != z10) {
            invalidate();
        }
        this.f44190n = z10;
    }
}
