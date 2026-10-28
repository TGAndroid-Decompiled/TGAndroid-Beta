package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public class rp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.u6 f43140a;
    public final int f43141b;
    public final boolean f43142c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.j9 e;
    public final hl f43143f;
    public final org.telegram.ui.ActionBar.b6 h;
    public boolean f43144n;
    public final org.telegram.ui.Components.r5 f43145r;
    public final org.telegram.ui.Components.r5 f43146s;
    public final org.telegram.ui.Components.r5 v;
    public final di.y7 f43147w;
    public final org.telegram.ui.Components.h6 f43148x;
    public MessagesController.PeerColor f43149y;

    public rp0(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.e = j9Var;
        this.v = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f43147w = new di.y7(this);
        this.f43148x = new org.telegram.ui.Components.h6(this, 320L, org.telegram.ui.Components.ds.h);
        this.F = new RectF();
        this.f43141b = i10;
        this.f43140a = u6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43142c = z10;
        hl hlVar = new hl(this, context, 2);
        this.f43143f = hlVar;
        this.f43145r = new org.telegram.ui.Components.r5(AndroidUtilities.dp(17.0f), hlVar);
        this.f43146s = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), hlVar);
        hlVar.setLeftDrawableOutside(true);
        hlVar.setRightDrawableOutside(true);
        hlVar.setTextColor(-1);
        hlVar.setTextSize(20);
        hlVar.setTypeface(AndroidUtilities.bold());
        hlVar.setWidthWrapContent(true);
        addView(hlVar, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.h = b6Var;
        b6Var.setTextSize(14);
        b6Var.setTextColor(-2130706433);
        b6Var.setGravity(1);
        addView(b6Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            j9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f43143f.l(userName, false);
        this.f43145r.j(botVerificationIcon, false);
        this.f43143f.setLeftDrawable(this.f43145r);
        this.f43146s.j(j11, false);
        this.f43143f.i(this.f43146s);
        if (this.f43142c) {
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
                    org.telegram.ui.ActionBar.b6 b6Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    b6Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.b6 b6Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    b6Var3.l(LocaleController.getString(i11).toLowerCase(), false);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f43140a;
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
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23583p8[org.telegram.ui.Components.j9.f(color1)], u6Var);
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23600q8[org.telegram.ui.Components.j9.f(color1)], u6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23583p8[org.telegram.ui.Components.j9.e(j10)], u6Var);
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23600q8[org.telegram.ui.Components.j9.e(j10)], u6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23583p8[org.telegram.ui.Components.j9.e(j11)], u6Var);
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23600q8[org.telegram.ui.Components.j9.e(j11)], u6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23541n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23777zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23431h8));
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f43141b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q5;
        this.f43149y = peerColor;
        org.telegram.ui.ActionBar.u6 u6Var = this.f43140a;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        hl hlVar = this.f43143f;
        org.telegram.ui.Components.r5 r5Var = this.f43145r;
        org.telegram.ui.Components.r5 r5Var2 = this.f43146s;
        org.telegram.ui.ActionBar.b6 b6Var = this.h;
        org.telegram.ui.Components.r5 r5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                r5Var3.k(Integer.valueOf(i10));
            } else {
                r5Var3.k(Integer.valueOf(tp0.x0(peerColor.getBgColor1(q5))));
            }
            r5Var2.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
            r5Var.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
            int f7 = i0.a.f(0.5f, peerColor.getStoryColor1(q5), peerColor.getStoryColor2(q5));
            int i11 = org.telegram.ui.ActionBar.y6.f23637s8;
            if (!org.telegram.ui.ActionBar.y6.d1(org.telegram.ui.ActionBar.y6.w0(i11, u6Var))) {
                b6Var.setTextColor(f7);
            } else {
                b6Var.setTextColor(org.telegram.ui.ActionBar.y6.C(q5, org.telegram.ui.ActionBar.y6.w0(i11, u6Var), f7, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23431h8, u6Var), f7));
            }
            hlVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.f23637s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) > 0.8f) {
                r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) < 0.2f) {
                r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var))));
            } else {
                r5Var3.k(Integer.valueOf(tp0.x0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.y6.f23777zh;
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)));
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)));
            b6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
            hlVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        }
        this.E = 0;
        this.f43147w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q5;
        MessagesController.PeerColor peerColor;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.r5 r5Var = this.v;
        if (i11 == 0) {
            r5Var.g(null, z11);
        } else {
            r5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f43140a;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f43149y;
        if (peerColor2 != null) {
            int i12 = peerColor2.patternColor;
            if (i12 != 0) {
                r5Var.k(Integer.valueOf(i12));
            } else {
                r5Var.k(Integer.valueOf(tp0.x0(peerColor2.getBgColor1(q5))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.y6.f23637s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) > 0.8f) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) < 0.2f) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A8, false))));
            } else {
                r5Var.k(Integer.valueOf(tp0.x0(org.telegram.ui.ActionBar.y6.x0(null, i13, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f43149y;
        org.telegram.ui.Components.r5 r5Var2 = this.f43146s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, u6Var);
            if (this.f43149y.hasColor6(q5)) {
                peerColor = this.f43149y;
                i10 = 4;
            } else {
                peerColor = this.f43149y;
                i10 = 2;
            }
            r5Var2.k(Integer.valueOf(i0.a.f(0.5f, color, peerColor.getColor(i10, u6Var))));
        } else {
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, u6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.f43148x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int width = getWidth();
        RectF rectF = this.F;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        bi.l1.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f43144n) {
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
        if (this.f43144n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f43147w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q5;
        int color3;
        org.telegram.ui.Components.r5 r5Var = this.f43146s;
        r5Var.j(j10, z11);
        r5Var.m(z10, z11);
        org.telegram.ui.ActionBar.u6 u6Var = this.f43140a;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f43149y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q5);
            if (this.f43149y.hasColor6(q5)) {
                color3 = this.f43149y.getColor5(q5);
            } else {
                color3 = this.f43149y.getColor3(q5);
            }
            r5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color3)));
        } else {
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, u6Var)));
        }
        this.E = 2;
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
        if (this.f43144n != z10) {
            invalidate();
        }
        this.f43144n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.Components.r5 r5Var2;
        hl hlVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean q5;
        int color3;
        int color;
        org.telegram.ui.Components.r5 r5Var3 = this.v;
        if (r5Var3 != null && (r5Var = this.f43146s) != null && (r5Var2 = this.f43145r) != null && (hlVar = this.f43143f) != null && (b6Var = this.h) != null) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f43140a;
            try {
                if (u6Var != null) {
                    q5 = u6Var.a();
                } else {
                    q5 = org.telegram.ui.ActionBar.y6.I.q();
                }
                MessagesController.PeerColor peerColor = this.f43149y;
                if (peerColor != null) {
                    int i10 = peerColor.patternColor;
                    if (i10 != 0) {
                        r5Var3.k(Integer.valueOf(i10));
                    } else {
                        r5Var3.k(Integer.valueOf(tp0.x0(peerColor.getBgColor1(q5))));
                    }
                    r5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.f43149y.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
                    int i11 = this.E;
                    if (i11 == 1) {
                        int color2 = this.f43149y.getColor(1, u6Var);
                        if (this.f43149y.hasColor6(q5)) {
                            color = this.f43149y.getColor(4, u6Var);
                        } else {
                            color = this.f43149y.getColor(2, u6Var);
                        }
                        r5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color)));
                    } else if (i11 == 2) {
                        int color22 = this.f43149y.getColor2(q5);
                        if (this.f43149y.hasColor6(q5)) {
                            color3 = this.f43149y.getColor5(q5);
                        } else {
                            color3 = this.f43149y.getColor3(q5);
                        }
                        r5Var.k(Integer.valueOf(i0.a.f(0.5f, color22, color3)));
                    } else {
                        r5Var.k(Integer.valueOf(i0.a.f(0.25f, this.f43149y.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
                    }
                    int f7 = i0.a.f(0.5f, this.f43149y.getStoryColor1(q5), this.f43149y.getStoryColor2(q5));
                    int i12 = org.telegram.ui.ActionBar.y6.f23637s8;
                    if (!org.telegram.ui.ActionBar.y6.d1(org.telegram.ui.ActionBar.y6.w0(i12, u6Var))) {
                        b6Var.setTextColor(f7);
                    } else {
                        b6Var.setTextColor(org.telegram.ui.ActionBar.y6.C(q5, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), f7, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23431h8, u6Var), f7));
                    }
                    hlVar.setTextColor(-1);
                } else {
                    int i13 = org.telegram.ui.ActionBar.y6.f23637s8;
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) > 0.8f) {
                        r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var)));
                    } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) < 0.2f) {
                        r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var))));
                    } else {
                        r5Var3.k(Integer.valueOf(tp0.x0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var))));
                    }
                    int i14 = org.telegram.ui.ActionBar.y6.f23777zh;
                    r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i14, u6Var)));
                    r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i14, u6Var)));
                    b6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
                    hlVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
                }
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
