package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
public final class b8 extends FrameLayout {
    public Path B;
    public Paint C;
    public final org.telegram.ui.ActionBar.g6 f45028a;
    public final org.telegram.ui.Components.z8 f45029b;
    public final org.telegram.ui.Components.p9 f45030c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 f45031e;
    public final np f45032f;
    public final RadioButton h;
    public final Paint f45033n;
    public boolean f45034r;
    public boolean f45035s;
    public boolean v;
    public final boolean[] f45036w;
    public long f45037x;
    public boolean f45038y;

    public b8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f45029b = z8Var;
        this.f45033n = new Paint(1);
        this.f45034r = false;
        this.f45035s = true;
        this.v = true;
        this.f45036w = new boolean[1];
        this.f45028a = g6Var;
        z8Var.f33849r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f45030c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(l5Var);
        addView(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f45031e = l5Var2;
        l5Var2.setTextSize(14);
        l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(l5Var2);
        addView(l5Var2);
        np npVar = new np(context, 21, g6Var);
        this.f45032f = npVar;
        int i12 = org.telegram.ui.ActionBar.k6.B5;
        int i13 = org.telegram.ui.ActionBar.k6.f21770j7;
        npVar.b(i12, i13, org.telegram.ui.ActionBar.k6.C5);
        npVar.setDrawUnchecked(true);
        npVar.setDrawBackgroundAsArc(10);
        addView(npVar);
        npVar.a(false, false);
        npVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.v0(i13, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f45031e;
        if (charSequence == null) {
            l5Var.setTranslationY(0.0f);
            l5Var2.setVisibility(8);
            return;
        }
        l5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
        l5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
        l5Var2.l(charSequence, false);
        l5Var2.setVisibility(0);
    }

    public final void a(int i10, TLRPC.Chat chat) {
        long j10;
        float f10;
        String lowerCase;
        int i11;
        int i12;
        float f11;
        int i13;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f20845id;
        }
        this.f45037x = j10;
        org.telegram.ui.Components.z8 z8Var = this.f45029b;
        z8Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        org.telegram.ui.Components.p9 p9Var = this.f45030c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f45036w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f45034r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i10 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                }
                lowerCase = LocaleController.formatPluralString(str2, i10, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i13 = R.string.DiscussChannel;
                } else {
                    i13 = R.string.AccDescrGroup;
                }
                lowerCase = LocaleController.getString(i13);
            }
        } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
            if (i10 >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Subscribers", i10 - 1);
            } else if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
        } else if (i10 >= 1) {
            lowerCase = LocaleController.formatPluralStringComma("Members", i10 - 1);
        } else if (chat.has_geo) {
            lowerCase = LocaleController.getString(R.string.MegaLocation);
        } else if (!ChatObject.isPublic(chat)) {
            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        } else {
            lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i11 = org.telegram.ui.ActionBar.k6.f21840n5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21913r5;
        }
        this.f45031e.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, this.f45028a));
        if (this.f45035s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f45032f.setVisibility(i12);
        this.h.setVisibility(8);
        if (i10 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        b(f11, false);
    }

    public final void b(float f10, boolean z4) {
        RadioButton radioButton = this.h;
        np npVar = this.f45032f;
        if (z4) {
            if (Math.abs(npVar.getAlpha() - f10) > 0.1d) {
                npVar.animate().cancel();
                npVar.animate().alpha(f10).start();
            }
            if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f10).start();
                return;
            }
            return;
        }
        npVar.animate().cancel();
        npVar.setAlpha(f10);
        radioButton.animate().cancel();
        radioButton.setAlpha(f10);
    }

    public final void c(boolean z4, boolean z10) {
        np npVar = this.f45032f;
        if (npVar.getVisibility() == 0) {
            npVar.a(z4, z10);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z4, z10);
        }
    }

    public final void d(boolean z4, boolean z10) {
        boolean z11;
        this.f45034r = z4;
        if (z10 != this.f45035s) {
            this.f45035s = z10;
            f();
        }
        if (!this.f45035s) {
            this.h.setVisibility(8);
            this.f45032f.setVisibility(8);
        }
        if (!this.f45038y && (this.f45035s || !this.f45034r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f45028a;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f45031e;
        org.telegram.ui.Components.z8 z8Var = this.f45029b;
        int i12 = 0;
        if (i10 == 4) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21840n5, g6Var));
            z8Var.g(7);
            z8Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21840n5, g6Var));
            z8Var.g(4);
            z8Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21840n5, g6Var));
            z8Var.g(15);
            z8Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21840n5, g6Var));
            z8Var.g(6);
            z8Var.i(-18621, -618956);
        }
        this.f45032f.setVisibility(8);
        if (!this.f45035s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.p9 p9Var = this.f45030c;
        p9Var.setImageDrawable(z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        int i15;
        int i16;
        int i17 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z4 = this.f45035s;
        if (z4) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (z4) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f45030c.setLayoutParams(k7.c6.d(40, 40.0f, i18, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 16;
        int i20 = 68;
        if (z10) {
            f12 = 20.0f;
        } else {
            if (this.f45035s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f12 = i12;
        }
        if (z10) {
            if (this.f45035s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f13 = i16;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(k7.c6.d(-1, -2.0f, i19, f12, 0.0f, f13, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i21 = i13 | 16;
        if (z11) {
            f14 = 20.0f;
        } else {
            if (this.f45035s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f14 = i14;
        }
        if (z11) {
            if (this.f45035s) {
                i20 = 105;
            }
            f15 = i20;
        } else {
            f15 = 20.0f;
        }
        this.f45031e.setLayoutParams(k7.c6.d(-1, -2.0f, i21, f14, 0.0f, f15, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f45032f.setLayoutParams(k7.c6.d(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(k7.c6.d(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        oq oqVar = new oq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f45038y) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.f45028a);
            Paint paint2 = this.f45033n;
            paint2.setColor(v02);
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.B;
        if (path != null && (paint = this.C) != null && !this.f45035s && this.f45034r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b8.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int measuredWidth;
        float f11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f45034r && !this.f45035s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
        if (!this.f45035s && this.f45034r) {
            Path path = this.B;
            if (path == null) {
                this.B = new Path();
            } else {
                path.rewind();
            }
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (LocaleController.isRTL) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            this.B.moveTo(f12, measuredHeight - AndroidUtilities.dp(6.0f));
            this.B.lineTo((f11 * AndroidUtilities.dp(6.0f)) + f12, measuredHeight);
            this.B.lineTo(f12, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.C.setStrokeCap(Paint.Cap.ROUND);
            }
            this.C.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.C.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f45028a)));
        }
    }

    public void set(Object obj) {
        int i10;
        boolean z4 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        if (z4) {
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            l5Var.setTypeface(null);
            int i11 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            l5Var.setTranslationX(i11 * i10);
            l5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z4) {
        boolean z10;
        this.f45038y = z4;
        if (!z4 && (this.f45035s || !this.f45034r)) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public void setRedCheckbox(boolean z4) {
        int i10;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.k6.wj;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.B5;
        }
        this.f45032f.b(i10, org.telegram.ui.ActionBar.k6.f21770j7, org.telegram.ui.ActionBar.k6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f20992id;
        }
        this.f45037x = j10;
        org.telegram.ui.Components.z8 z8Var = this.f45029b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.p9 p9Var = this.f45030c;
        p9Var.setRoundRadius(dp);
        p9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        int i11 = 0;
        l5Var.l(Emoji.replaceEmoji(userName, l5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f45036w;
        zArr[0] = false;
        boolean z4 = this.f45034r;
        org.telegram.ui.ActionBar.g6 g6Var = this.f45028a;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f45031e;
        if (z4) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21913r5, g6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.k6.f21840n5;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21913r5;
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        }
        if (!this.f45035s) {
            i11 = 8;
        }
        np npVar = this.f45032f;
        npVar.setVisibility(i11);
        npVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
