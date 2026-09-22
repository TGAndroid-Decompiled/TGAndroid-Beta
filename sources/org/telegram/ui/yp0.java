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
public class yp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.e6 f39924a;
    public final int f39925b;
    public final boolean f39926c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.f9 e;
    public final ll f39927f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean f39928n;
    public final org.telegram.ui.Components.m5 f39929r;
    public final org.telegram.ui.Components.m5 f39930s;
    public final org.telegram.ui.Components.m5 v;
    public final ai.ea f39931w;
    public final org.telegram.ui.Components.c6 f39932x;
    public MessagesController.PeerColor f39933y;

    public yp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        this.e = f9Var;
        this.v = new org.telegram.ui.Components.m5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f39931w = new ai.ea(this);
        this.f39932x = new org.telegram.ui.Components.c6(this, 320L, org.telegram.ui.Components.qr.h);
        this.E = new RectF();
        this.f39925b = i10;
        this.f39924a = e6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39926c = z10;
        ll llVar = new ll(this, context, 2);
        this.f39927f = llVar;
        this.f39929r = new org.telegram.ui.Components.m5(AndroidUtilities.dp(17.0f), llVar);
        this.f39930s = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), llVar);
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
            f9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, f9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            f9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, f9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f39927f.l(userName, false);
        this.f39929r.j(botVerificationIcon, false);
        this.f39927f.setLeftDrawable(this.f39929r);
        this.f39930s.j(j10, false);
        this.f39927f.i(this.f39930s);
        if (this.f39926c) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f39924a;
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
                v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.f(color1)], e6Var);
                v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.f(color1)], e6Var);
            } else {
                long j3 = i10;
                v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.e(j3)], e6Var);
                v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.e(j3)], e6Var);
            }
        } else {
            long j10 = i10;
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19054p8[org.telegram.ui.Components.f9.e(j10)], e6Var);
            v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19072q8[org.telegram.ui.Components.f9.e(j10)], e6Var);
        }
        this.e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39925b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f39933y = peerColor;
        org.telegram.ui.ActionBar.e6 e6Var = this.f39924a;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        ll llVar = this.f39927f;
        org.telegram.ui.Components.m5 m5Var = this.f39929r;
        org.telegram.ui.Components.m5 m5Var2 = this.f39930s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.m5 m5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                m5Var3.k(Integer.valueOf(i10));
            } else {
                m5Var3.k(Integer.valueOf(aq0.w0(peerColor.getBgColor1(q6))));
            }
            m5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), -1)));
            m5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.i6.f19110s8;
            if (!org.telegram.ui.ActionBar.i6.b1(org.telegram.ui.ActionBar.i6.v0(i11, e6Var))) {
                j5Var.setTextColor(d);
            } else {
                j5Var.setTextColor(org.telegram.ui.ActionBar.i6.C(q6, org.telegram.ui.ActionBar.i6.v0(i11, e6Var), d, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h8, e6Var), d));
            }
            llVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.f19110s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i12, e6Var)) > 0.8f) {
                m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19018n6, e6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i12, e6Var)) < 0.2f) {
                m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, e6Var))));
            } else {
                m5Var3.k(Integer.valueOf(aq0.w0(org.telegram.ui.ActionBar.i6.v0(i12, e6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.i6.f19245zh;
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(i13, e6Var)));
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(i13, e6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B8, e6Var));
            llVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        }
        this.f39931w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.m5 m5Var = this.v;
        if (j3 == 0) {
            m5Var.g(null, z11);
        } else {
            m5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f39924a;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f39933y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                m5Var.k(Integer.valueOf(i11));
            } else {
                m5Var.k(Integer.valueOf(aq0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.f19110s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i12, e6Var)) > 0.8f) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19018n6, e6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i12, e6Var)) < 0.2f) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A8, false))));
            } else {
                m5Var.k(Integer.valueOf(aq0.w0(org.telegram.ui.ActionBar.i6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f39933y;
        org.telegram.ui.Components.m5 m5Var2 = this.f39930s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, e6Var);
            if (this.f39933y.hasColor6(q6)) {
                peerColor = this.f39933y;
                i10 = 4;
            } else {
                peerColor = this.f39933y;
                i10 = 2;
            }
            m5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, e6Var))));
        } else {
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19245zh, e6Var)));
        }
        if (!z11) {
            this.f39932x.a(z10);
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
        if (this.f39928n) {
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
        if (this.f39928n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f39931w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.m5 m5Var = this.f39930s;
        m5Var.j(j3, z11);
        m5Var.m(z10, z11);
        org.telegram.ui.ActionBar.e6 e6Var = this.f39924a;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f39933y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f39933y.hasColor6(q6)) {
                color3 = this.f39933y.getColor5(q6);
            } else {
                color3 = this.f39933y.getColor3(q6);
            }
            m5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19245zh, e6Var)));
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
        if (this.f39928n != z10) {
            invalidate();
        }
        this.f39928n = z10;
    }
}
