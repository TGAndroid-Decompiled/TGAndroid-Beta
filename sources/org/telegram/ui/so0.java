package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class so0 extends View {
    public final int f41278a;
    public final boolean f41279b;
    public final boolean f41280c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final Drawable f41281e;
    public final org.telegram.ui.Components.k01 f41282f;
    public final wo0 h;
    public final Paint f41283n;
    public org.telegram.ui.Components.k01 f41284r;
    public int f41285s;
    public boolean v;
    public ip0 f41286w;
    public ip0 f41287x;

    public so0(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z4;
        boolean z10;
        int i11;
        int i12;
        this.f41283n = new Paint(1);
        this.f41285s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.f41278a = i10;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f41279b = z4;
        if (z4 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41280c = z10;
        this.d = g6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.f41281e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q6, g6Var), PorterDuff.Mode.SRC_IN));
        if (z4) {
            if (z10) {
                i11 = R.string.ChangeGroupAppearance;
            } else {
                i11 = R.string.ChangeChannelNameColor2;
            }
        } else {
            i11 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i11);
        if (z4 && !z10 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i13 = Integer.MAX_VALUE;
            if (peerColors != null) {
                int min = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i13 = min2;
                i12 = max2;
            } else {
                i12 = 0;
            }
            int min3 = Math.min(i13, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i12, messagesController.channelBgIconLevelMin);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                int min5 = Math.min(min3, peerColors2.maxLevel());
                int max3 = Math.max(min4, messagesController.profilePeerColors.maxLevel());
                min3 = Math.min(min5, messagesController.profilePeerColors.minLevel());
                min4 = Math.max(max3, messagesController.profilePeerColors.minLevel());
            }
            int min6 = Math.min(min3, messagesController.channelProfileIconLevelMin);
            int max4 = Math.max(min4, messagesController.channelProfileIconLevelMin);
            int min7 = Math.min(min6, messagesController.channelEmojiStatusLevelMin);
            int max5 = Math.max(max4, messagesController.channelEmojiStatusLevelMin);
            int min8 = Math.min(min7, messagesController.channelWallpaperLevelMin);
            int max6 = Math.max(max5, messagesController.channelWallpaperLevelMin);
            int min9 = Math.min(min8, messagesController.channelCustomWallpaperLevelMin);
            int max7 = Math.max(max6, messagesController.channelCustomWallpaperLevelMin);
            int i14 = chat != null ? chat.level : 0;
            if (i14 < max7) {
                this.h = new wo0(Math.max(i14, min9), context, g6Var, true);
            }
        }
        setContentDescription(string);
        this.f41282f = new org.telegram.ui.Components.k01(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z4 = this.f41279b;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.k6.f21823m6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21896q6;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        this.f41281e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        if (z4) {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21896q6;
        }
        this.f41282f.o(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (this.f41284r != null && (paint = this.f41283n) != null && (i12 = this.f41285s) != -1) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
            this.f41284r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, v02));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float dp;
        int dp2;
        int B;
        int measuredWidth;
        int B2;
        int measuredWidth2;
        Paint paint;
        float dp3;
        int measuredWidth3;
        int dp4 = AndroidUtilities.dp(28.0f);
        if (LocaleController.isRTL) {
            dp4 = getMeasuredWidth() - dp4;
        }
        Drawable drawable = this.f41281e;
        lf.r.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        wo0 wo0Var = this.h;
        if (wo0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + wo0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.k01 k01Var = this.f41282f;
        k01Var.f28238p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - k01Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        k01Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (wo0Var != null) {
            int l10 = (int) (k01Var.l() + dp + AndroidUtilities.dp(6.0f));
            wo0Var.setBounds(l10, 0, l10, getHeight());
            wo0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        boolean z4 = this.f41280c;
        if (z4 && this.f41287x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f41287x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f41287x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var));
            this.f41287x.draw(canvas);
        } else if (this.f41286w != null && this.f41287x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f41287x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            ip0 ip0Var = this.f41287x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.k6.f21661d6;
            ip0Var.f(dpf2, org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            this.f41287x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f41286w.setBounds(dp5 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f41286w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            this.f41286w.draw(canvas);
        } else if (this.f41284r != null && !z4) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l11 = k01Var.l();
            if (wo0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + wo0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l11 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f41284r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.y3.B(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f41283n);
            org.telegram.ui.Components.k01 k01Var2 = this.f41284r;
            k01Var2.f28238p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.y3.B(24.0f, getMeasuredWidth(), min2);
            }
            k01Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (g6Var != null) {
                paint = g6Var.F("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21781k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(58.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(58.0f);
            }
            canvas.drawLine(dp3, measuredHeight2, measuredWidth6 - i11, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        ip0 ip0Var;
        int v02;
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.f41284r = new org.telegram.ui.Components.k01(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.k6.f21855o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        ip0 ip0Var2 = this.f41286w;
        MessagesController.PeerColor peerColor = null;
        if (ip0Var2 != null) {
            ip0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z4 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f41278a;
        if (z4) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = ip0.f37753j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f41286w = new ip0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                ip0Var = ip0.c(i13, UserObject.getProfileColorId(user));
                ip0Var.f37754a = AndroidUtilities.dp(11.0f);
                ip0Var.d();
            } else {
                ip0Var = null;
            }
            this.f41286w = ip0Var;
        }
        ip0 ip0Var3 = this.f41286w;
        if (ip0Var3 != null) {
            ip0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z10 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f41283n;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z10) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (g6Var != null) {
                q10 = g6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i10 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i10 = tL_peerColorCollectible.accent_color;
            }
            if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i11 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            if (arrayList.size() >= 3) {
                i12 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i12 = intValue;
            }
            this.f41284r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
            ip0 ip0Var4 = new ip0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            ip0Var4.f37754a = AndroidUtilities.dp(11.0f);
            ip0Var4.d();
            this.f41287x = ip0Var4;
            ip0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.k6.f21916r8[colorId];
            this.f41285s = i16;
            v02 = org.telegram.ui.ActionBar.k6.v0(i16, g6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f41285s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.k6.f21916r8[0];
                this.f41285s = i17;
                v02 = org.telegram.ui.ActionBar.k6.v0(i17, g6Var);
            }
        }
        this.f41284r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, v02));
        ip0 a2 = ip0.a(i13, colorId);
        a2.f37754a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f41287x = a2;
    }
}
