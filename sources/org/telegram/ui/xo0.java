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
public class xo0 extends FrameLayout {
    public final RectF A;
    public final org.telegram.ui.ActionBar.c6 f44626a;
    public final int f44627b;
    public final boolean f44628c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.e9 f44629e;
    public final cl f44630f;
    public final org.telegram.ui.ActionBar.h5 h;
    public boolean f44631n;
    public final org.telegram.ui.Components.n5 f44632r;
    public final org.telegram.ui.Components.n5 f44633s;
    public final org.telegram.ui.Components.n5 v;
    public final lh.j7 f44634w;
    public final org.telegram.ui.Components.d6 f44635x;
    public MessagesController.PeerColor f44636y;

    public xo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f44629e = e9Var;
        this.v = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f44634w = new lh.j7(this);
        this.f44635x = new org.telegram.ui.Components.d6(this, 320L, org.telegram.ui.Components.jr.h);
        this.A = new RectF();
        this.f44627b = i10;
        this.f44626a = c6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44628c = z10;
        cl clVar = new cl(this, context, 2);
        this.f44630f = clVar;
        this.f44632r = new org.telegram.ui.Components.n5(AndroidUtilities.dp(17.0f), clVar);
        this.f44633s = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), clVar);
        clVar.setLeftDrawableOutside(true);
        clVar.setRightDrawableOutside(true);
        clVar.setTextColor(-1);
        clVar.setTextSize(20);
        clVar.setTypeface(AndroidUtilities.bold());
        clVar.setWidthWrapContent(true);
        addView(clVar, i7.f6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.h = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(-2130706433);
        h5Var.setGravity(1);
        addView(h5Var, i7.f6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            e9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, e9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            e9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, e9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f44630f.l(userName, false);
        this.f44632r.j(botVerificationIcon, false);
        this.f44630f.setLeftDrawable(this.f44632r);
        this.f44633s.j(j11, false);
        this.f44630f.i(this.f44633s);
        if (this.f44628c) {
            long j12 = -j10;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j12));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j12);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f44626a;
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
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.f(color1)], c6Var);
                v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.f(color1)], c6Var);
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(j10)], c6Var);
                v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.e(j10)], c6Var);
            }
        } else {
            long j11 = i10;
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(j11)], c6Var);
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.e(j11)], c6Var);
        }
        this.f44629e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f44627b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f44636y = peerColor;
        org.telegram.ui.ActionBar.c6 c6Var = this.f44626a;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        cl clVar = this.f44630f;
        org.telegram.ui.Components.n5 n5Var = this.f44632r;
        org.telegram.ui.Components.n5 n5Var2 = this.f44633s;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        org.telegram.ui.Components.n5 n5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                n5Var3.k(Integer.valueOf(i10));
            } else {
                n5Var3.k(Integer.valueOf(yo0.u0(peerColor.getBgColor1(q6))));
            }
            n5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1)));
            n5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (!org.telegram.ui.ActionBar.g6.b1(org.telegram.ui.ActionBar.g6.v0(i11, c6Var))) {
                h5Var.setTextColor(d);
            } else {
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.C(q6, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), d, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23136h8, c6Var), d));
            }
            clVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) > 0.8f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) < 0.2f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var))));
            } else {
                n5Var3.k(Integer.valueOf(yo0.u0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.g6.zh;
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, c6Var));
            clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        }
        this.f44634w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.n5 n5Var = this.v;
        if (j10 == 0) {
            n5Var.g(null, z11);
        } else {
            n5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f44626a;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f44636y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                n5Var.k(Integer.valueOf(i11));
            } else {
                n5Var.k(Integer.valueOf(yo0.u0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) > 0.8f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) < 0.2f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false))));
            } else {
                n5Var.k(Integer.valueOf(yo0.u0(org.telegram.ui.ActionBar.g6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f44636y;
        org.telegram.ui.Components.n5 n5Var2 = this.f44633s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, c6Var);
            if (this.f44636y.hasColor6(q6)) {
                peerColor = this.f44636y;
                i10 = 4;
            } else {
                peerColor = this.f44636y;
                i10 = 2;
            }
            n5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, c6Var))));
        } else {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
        }
        if (!z11) {
            this.f44635x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        int width = getWidth();
        RectF rectF = this.A;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        jh.x0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f44631n) {
            f9 = 18.0f;
        } else {
            f9 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width2 = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        if (this.f44631n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f44634w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.n5 n5Var = this.f44633s;
        n5Var.j(j10, z11);
        n5Var.m(z10, z11);
        org.telegram.ui.ActionBar.c6 c6Var = this.f44626a;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f44636y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f44636y.hasColor6(q6)) {
                color3 = this.f44636y.getColor5(q6);
            } else {
                color3 = this.f44636y.getColor3(q6);
            }
            n5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
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
        if (this.f44631n != z10) {
            invalidate();
        }
        this.f44631n = z10;
    }
}
