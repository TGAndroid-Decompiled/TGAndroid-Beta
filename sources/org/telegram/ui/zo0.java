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

public class zo0 extends FrameLayout {
    public final RectF A;

    public final org.telegram.ui.ActionBar.c6 f45221a;

    public final int f45222b;

    public final boolean f45223c;
    public final ImageReceiver d;

    public final org.telegram.ui.Components.y8 f45224e;

    public final bl f45225f;
    public final org.telegram.ui.ActionBar.h5 h;

    public boolean f45226n;

    public final org.telegram.ui.Components.i5 f45227r;

    public final org.telegram.ui.Components.i5 f45228s;
    public final org.telegram.ui.Components.i5 v;

    public final jh.j7 f45229w;

    public final org.telegram.ui.Components.y5 f45230x;

    public MessagesController.PeerColor f45231y;

    public zo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence userName;
        long botVerificationIcon;
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f45224e = y8Var;
        this.v = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f45229w = new jh.j7(this);
        this.f45230x = new org.telegram.ui.Components.y5(this, 320L, org.telegram.ui.Components.er.h);
        this.A = new RectF();
        this.f45222b = i10;
        this.f45221a = c6Var;
        long emojiStatusDocumentId = 0;
        boolean z10 = j10 < 0;
        this.f45223c = z10;
        bl blVar = new bl(this, context, 2);
        this.f45225f = blVar;
        this.f45227r = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), blVar);
        this.f45228s = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), blVar);
        blVar.setLeftDrawableOutside(true);
        blVar.setRightDrawableOutside(true);
        blVar.setTextColor(-1);
        blVar.setTextSize(20);
        blVar.setTypeface(AndroidUtilities.bold());
        blVar.setWidthWrapContent(true);
        addView(blVar, h7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.h = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(-2130706433);
        h5Var.setGravity(1);
        addView(h5Var, h7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            userName = chat == null ? "" : chat.title;
            y8Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, y8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            y8Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, y8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f45225f.l(userName, false);
        this.f45227r.j(botVerificationIcon, false);
        this.f45225f.setLeftDrawable(this.f45227r);
        this.f45228s.j(emojiStatusDocumentId, false);
        this.f45225f.i(this.f45228s);
        if (this.f45223c) {
            long j11 = -j10;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull == null || chatFull.participants_count <= 0) {
                if (chat2 == null || chat2.participants_count <= 0) {
                    boolean zIsPublic = ChatObject.isPublic(chat2);
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.h.l(LocaleController.getString(zIsPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase(), false);
                    } else {
                        this.h.l(LocaleController.getString(zIsPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase(), false);
                    }
                } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                }
            } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                this.h.l(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
            } else {
                this.h.l(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int iV0;
        int iV1;
        org.telegram.ui.ActionBar.c6 c6Var = this.f45221a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
            if (color != null) {
                int color1 = color.getColor1();
                iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.f(color1)], c6Var);
                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.f(color1)], c6Var);
            } else {
                long j10 = i10;
                iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(j10)], c6Var);
                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(j10)], c6Var);
            }
        } else {
            long j11 = i10;
            iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(j11)], c6Var);
            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(j11)], c6Var);
        }
        this.f45224e.i(iV0, iV1);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f45222b).profilePeerColors;
        c(peerColors == null ? null : peerColors.getColor(i10), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.f45231y = peerColor;
        org.telegram.ui.ActionBar.c6 c6Var = this.f45221a;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        bl blVar = this.f45225f;
        org.telegram.ui.Components.i5 i5Var = this.f45227r;
        org.telegram.ui.Components.i5 i5Var2 = this.f45228s;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        org.telegram.ui.Components.i5 i5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                i5Var3.k(Integer.valueOf(i10));
            } else {
                i5Var3.k(Integer.valueOf(ap0.u0(peerColor.getBgColor1(zA))));
            }
            i5Var2.k(Integer.valueOf(i0.b.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1)));
            i5Var.k(Integer.valueOf(i0.b.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1)));
            int iD = i0.b.d(0.5f, peerColor.getStoryColor1(zA), peerColor.getStoryColor2(zA));
            int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
            if (org.telegram.ui.ActionBar.g6.b1(org.telegram.ui.ActionBar.g6.v0(i11, c6Var))) {
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.C(zA, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), iD, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, c6Var), iD));
            } else {
                h5Var.setTextColor(iD);
            }
            blVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.f23322s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) > 0.8f) {
                i5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) < 0.2f) {
                i5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var))));
            } else {
                i5Var3.k(Integer.valueOf(ap0.u0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.g6.zh;
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, c6Var));
            blVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        }
        this.f45229w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.i5 i5Var = this.v;
        if (j10 == 0) {
            i5Var.g(null, z11);
        } else {
            i5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f45221a;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        MessagesController.PeerColor peerColor2 = this.f45231y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                i5Var.k(Integer.valueOf(i11));
            } else {
                i5Var.k(Integer.valueOf(ap0.u0(peerColor2.getBgColor1(zA))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.f23322s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) > 0.8f) {
                i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) < 0.2f) {
                i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false))));
            } else {
                i5Var.k(Integer.valueOf(ap0.u0(org.telegram.ui.ActionBar.g6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f45231y;
        org.telegram.ui.Components.i5 i5Var2 = this.f45228s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, c6Var);
            if (this.f45231y.hasColor6(zA)) {
                peerColor = this.f45231y;
                i10 = 4;
            } else {
                peerColor = this.f45231y;
                i10 = 2;
            }
            i5Var2.k(Integer.valueOf(i0.b.d(0.5f, color, peerColor.getColor(i10, c6Var))));
        } else {
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
        }
        if (!z11) {
            this.f45230x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f;
        float height = getHeight() - AndroidUtilities.dp(168.0f);
        float fDp = (AndroidUtilities.dp(86.0f) + getWidth()) / 2.0f;
        float height2 = getHeight() - AndroidUtilities.dp(82.0f);
        RectF rectF = this.A;
        rectF.set(width, height, fDp, height2);
        hh.y0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int iDp = AndroidUtilities.dp(this.f45226n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(iDp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float fWidth = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        float fDp2 = AndroidUtilities.dp(this.f45226n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - fWidth, rectF.centerY() - fWidth, rectF.centerX() + fWidth, rectF.centerY() + fWidth, fDp2, fDp2, this.f45229w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.i5 i5Var = this.f45228s;
        i5Var.j(j10, z11);
        i5Var.m(z10, z11);
        org.telegram.ui.ActionBar.c6 c6Var = this.f45221a;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        MessagesController.PeerColor peerColor = this.f45231y;
        if (peerColor != null) {
            i5Var.k(Integer.valueOf(i0.b.d(0.5f, peerColor.getColor2(zA), this.f45231y.hasColor6(zA) ? this.f45231y.getColor5(zA) : this.f45231y.getColor3(zA))));
        } else {
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
        }
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
        if (this.f45226n != z10) {
            invalidate();
        }
        this.f45226n = z10;
    }
}
