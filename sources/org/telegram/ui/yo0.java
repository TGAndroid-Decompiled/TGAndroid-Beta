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
public class yo0 extends FrameLayout {
    public final RectF A;
    public final org.telegram.ui.ActionBar.b6 f44919a;
    public final int f44920b;
    public final boolean f44921c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.z8 f44922e;
    public final zk f44923f;
    public final org.telegram.ui.ActionBar.h5 h;
    public boolean f44924n;
    public final org.telegram.ui.Components.i5 f44925r;
    public final org.telegram.ui.Components.i5 f44926s;
    public final org.telegram.ui.Components.i5 v;
    public final ih.n7 f44927w;
    public final org.telegram.ui.Components.y5 f44928x;
    public MessagesController.PeerColor f44929y;

    public yo0(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f44922e = z8Var;
        this.v = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f44927w = new ih.n7(this);
        this.f44928x = new org.telegram.ui.Components.y5(this, 320L, org.telegram.ui.Components.gr.h);
        this.A = new RectF();
        this.f44920b = i9;
        this.f44919a = b6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44921c = z10;
        zk zkVar = new zk(this, context, 2);
        this.f44923f = zkVar;
        this.f44925r = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), zkVar);
        this.f44926s = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), zkVar);
        zkVar.setLeftDrawableOutside(true);
        zkVar.setRightDrawableOutside(true);
        zkVar.setTextColor(-1);
        zkVar.setTextSize(20);
        zkVar.setTypeface(AndroidUtilities.bold());
        zkVar.setWidthWrapContent(true);
        addView(zkVar, g7.e6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.h = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(-2130706433);
        h5Var.setGravity(1);
        addView(h5Var, g7.e6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            z8Var.k(i9, chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            z8Var.m(i9, currentUser);
            imageReceiver.setForUserOrChat(currentUser, z8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f44923f.l(userName, false);
        this.f44925r.j(botVerificationIcon, false);
        this.f44923f.setLeftDrawable(this.f44925r);
        this.f44926s.j(j11, false);
        this.f44923f.i(this.f44926s);
        if (this.f44921c) {
            long j12 = -j10;
            TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(j12));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(j12);
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
                        i11 = R.string.ChannelPublic;
                    } else {
                        i11 = R.string.ChannelPrivate;
                    }
                    h5Var2.l(LocaleController.getString(i11).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.h5 h5Var3 = this.h;
                    if (isPublic) {
                        i10 = R.string.MegaPublic;
                    } else {
                        i10 = R.string.MegaPrivate;
                    }
                    h5Var3.l(LocaleController.getString(i10).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i9) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        org.telegram.ui.ActionBar.b6 b6Var = this.f44919a;
        if (i9 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColor peerColor = null;
            if (messagesController != null) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = null;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i9);
            }
            if (peerColor != null) {
                int color1 = peerColor.getColor1();
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.f(color1)], b6Var);
                v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.f(color1)], b6Var);
            } else {
                long j10 = i9;
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.e(j10)], b6Var);
                v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.e(j10)], b6Var);
            }
        } else {
            long j11 = i9;
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[org.telegram.ui.Components.z8.e(j11)], b6Var);
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[org.telegram.ui.Components.z8.e(j11)], b6Var);
        }
        this.f44922e.i(v02, v03);
        invalidate();
    }

    public void b(int i9, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f44920b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i9);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q10;
        this.f44929y = peerColor;
        org.telegram.ui.ActionBar.b6 b6Var = this.f44919a;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        zk zkVar = this.f44923f;
        org.telegram.ui.Components.i5 i5Var = this.f44925r;
        org.telegram.ui.Components.i5 i5Var2 = this.f44926s;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        org.telegram.ui.Components.i5 i5Var3 = this.v;
        if (peerColor != null) {
            int i9 = peerColor.patternColor;
            if (i9 != 0) {
                i5Var3.k(Integer.valueOf(i9));
            } else {
                i5Var3.k(Integer.valueOf(zo0.t0(peerColor.getBgColor1(q10))));
            }
            i5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.f6.I.q()), -1)));
            i5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.f6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q10), peerColor.getStoryColor2(q10));
            int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (!org.telegram.ui.ActionBar.f6.b1(org.telegram.ui.ActionBar.f6.v0(i10, b6Var))) {
                h5Var.setTextColor(d);
            } else {
                h5Var.setTextColor(org.telegram.ui.ActionBar.f6.C(q10, org.telegram.ui.ActionBar.f6.v0(i10, b6Var), d, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23075h8, b6Var), d));
            }
            zkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i11, b6Var)) > 0.8f) {
                i5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i11, b6Var)) < 0.2f) {
                i5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var))));
            } else {
                i5Var3.k(Integer.valueOf(zo0.t0(org.telegram.ui.ActionBar.f6.v0(i11, b6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.f6.zh;
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, b6Var));
            zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
        }
        this.f44927w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q10;
        MessagesController.PeerColor peerColor;
        int i9;
        org.telegram.ui.Components.i5 i5Var = this.v;
        if (j10 == 0) {
            i5Var.g(null, z11);
        } else {
            i5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f44919a;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f44929y;
        if (peerColor2 != null) {
            int i10 = peerColor2.patternColor;
            if (i10 != 0) {
                i5Var.k(Integer.valueOf(i10));
            } else {
                i5Var.k(Integer.valueOf(zo0.t0(peerColor2.getBgColor1(q10))));
            }
        } else {
            int i11 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i11, b6Var)) > 0.8f) {
                i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i11, b6Var)) < 0.2f) {
                i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A8, false))));
            } else {
                i5Var.k(Integer.valueOf(zo0.t0(org.telegram.ui.ActionBar.f6.w0(null, i11, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f44929y;
        org.telegram.ui.Components.i5 i5Var2 = this.f44926s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, b6Var);
            if (this.f44929y.hasColor6(q10)) {
                peerColor = this.f44929y;
                i9 = 4;
            } else {
                peerColor = this.f44929y;
                i9 = 2;
            }
            i5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i9, b6Var))));
        } else {
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
        }
        if (!z11) {
            this.f44928x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int width = getWidth();
        RectF rectF = this.A;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        gh.y0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f44924n) {
            f10 = 18.0f;
        } else {
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width2 = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        if (this.f44924n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f44927w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q10;
        int color3;
        org.telegram.ui.Components.i5 i5Var = this.f44926s;
        i5Var.j(j10, z11);
        i5Var.m(z10, z11);
        org.telegram.ui.ActionBar.b6 b6Var = this.f44919a;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f44929y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q10);
            if (this.f44929y.hasColor6(q10)) {
                color3 = this.f44929y.getColor5(q10);
            } else {
                color3 = this.f44929y.getColor3(q10);
            }
            i5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
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
        if (this.f44924n != z10) {
            invalidate();
        }
        this.f44924n = z10;
    }
}
