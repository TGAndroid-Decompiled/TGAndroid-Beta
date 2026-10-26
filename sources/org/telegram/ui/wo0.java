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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class wo0 extends View implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final int f45527a;
    public final boolean f45528b;
    public final boolean f45529c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.q11 f45530f;
    public final ap0 h;
    public final Paint f45531n;
    public org.telegram.ui.Components.q11 f45532r;
    public int f45533s;
    public boolean v;
    public mp0 f45534w;
    public mp0 f45535x;
    public boolean f45536y;

    public wo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.f45531n = new Paint(1);
        this.f45533s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.f45527a = i10;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45528b = z10;
        if (z10 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45529c = z11;
        this.d = u6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23597q6, u6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i11 = R.string.ChangeGroupAppearance;
            } else {
                i11 = R.string.ChangeChannelNameColor2;
            }
        } else {
            i11 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i11);
        if (z10 && !z11 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
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
                this.h = new ap0(Math.max(i14, min9), context, u6Var, true);
            }
        }
        setContentDescription(string);
        this.f45530f = new org.telegram.ui.Components.q11(string, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float dp;
        int dp2;
        int C;
        int measuredWidth;
        int C2;
        int measuredWidth2;
        Paint paint;
        float dp3;
        int measuredWidth3;
        int dp4 = AndroidUtilities.dp(64.0f) / 2;
        if (LocaleController.isRTL) {
            dp4 = getMeasuredWidth() - dp4;
        }
        Drawable drawable = this.e;
        ag.v.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        ap0 ap0Var = this.h;
        if (ap0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + ap0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.q11 q11Var = this.f45530f;
        q11Var.f31800p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - q11Var.l()) - AndroidUtilities.dp(71.0f);
        } else {
            dp = AndroidUtilities.dp(71.0f);
        }
        q11Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (ap0Var != null) {
            int l4 = (int) (q11Var.l() + dp + AndroidUtilities.dp(6.0f));
            ap0Var.setBounds(l4, 0, l4, getHeight());
            ap0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        boolean z10 = this.f45529c;
        if (z10 && this.f45535x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f45535x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f45535x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var));
            this.f45535x.draw(canvas);
        } else if (this.f45534w != null && this.f45535x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f45535x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            mp0 mp0Var = this.f45535x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
            mp0Var.f(dpf2, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            this.f45535x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f45534w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f45534w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            this.f45534w.draw(canvas);
        } else if (this.f45532r != null && !z10) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l10 = q11Var.l();
            if (ap0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + ap0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l10 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f45532r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                C = AndroidUtilities.dp(15.0f);
            } else {
                C = org.telegram.messenger.t.C(33.0f, getMeasuredWidth(), min2);
            }
            float f7 = C;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f7, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f45531n);
            org.telegram.ui.Components.q11 q11Var2 = this.f45532r;
            q11Var2.f31800p = min;
            if (LocaleController.isRTL) {
                C2 = AndroidUtilities.dp(24.0f);
            } else {
                C2 = org.telegram.messenger.t.C(24.0f, getMeasuredWidth(), min2);
            }
            q11Var2.e(canvas, C2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23478k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(71.0f);
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
        mp0 mp0Var;
        int w02;
        boolean q5;
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
        this.f45532r = new org.telegram.ui.Components.q11(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        mp0 mp0Var2 = this.f45534w;
        MessagesController.PeerColor peerColor = null;
        if (mp0Var2 != null) {
            mp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f45527a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = mp0.f41635j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f45534w = new mp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                mp0Var = mp0.c(i13, UserObject.getProfileColorId(user));
                mp0Var.f41636a = AndroidUtilities.dp(11.0f);
                mp0Var.d();
            } else {
                mp0Var = null;
            }
            this.f45534w = mp0Var;
        }
        mp0 mp0Var3 = this.f45534w;
        if (mp0Var3 != null) {
            mp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z11 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f45531n;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (u6Var != null) {
                q5 = u6Var.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            if (q5 && (tL_peerColorCollectible.flags & 1) != 0) {
                i10 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i10 = tL_peerColorCollectible.accent_color;
            }
            if (!q5 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
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
            this.f45532r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, i10));
            mp0 mp0Var4 = new mp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            mp0Var4.f41636a = AndroidUtilities.dp(11.0f);
            mp0Var4.d();
            this.f45535x = mp0Var4;
            mp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.y6.f23616r8[colorId];
            this.f45533s = i16;
            w02 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f45533s = -1;
                w02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.y6.f23616r8[0];
                this.f45533s = i17;
                w02 = org.telegram.ui.ActionBar.y6.w0(i17, u6Var);
            }
        }
        this.f45532r.o(w02);
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
        mp0 a2 = mp0.a(i13, colorId);
        a2.f41636a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f45535x = a2;
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z10 = this.f45528b;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.f23520m6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23597q6;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        if (!this.f45536y || this.E != w02) {
            this.f45536y = true;
            this.E = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i11 = org.telegram.ui.ActionBar.y6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23597q6;
        }
        this.f45530f.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        if (this.f45532r != null && (paint = this.f45531n) != null && (i12 = this.f45533s) != -1) {
            int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            this.f45532r.o(w03);
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
