package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable B;
    public CharSequence[] C;
    public String[] D;
    public int E;
    public v70 F;
    public long G;
    public boolean H;
    public LocaleController.LocaleInfo I;
    public boolean J;
    public boolean K;
    public final Object f39287a;
    public final Object f39288b;
    public final int f39289c;
    public m2.h d;
    public org.telegram.ui.Components.ka e;
    public TextView f39290f;
    public GradientDrawable h;
    public eg.s0 f39291n;
    public FrameLayout f39292r;
    public ah.e f39293s;
    public org.telegram.ui.Components.gj0 v;
    public int f39294w;
    public boolean f39295x;
    public boolean f39296y;

    public w70() {
        super(null);
        this.f39287a = new Object();
        this.f39288b = new Object();
        this.f39289c = UserConfig.selectedAccount;
        this.f39294w = 0;
        this.f39295x = false;
        this.f39296y = false;
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f39289c;
        String str2 = MessagesController.getInstance(i10).suggestedLangCode;
        if ((str2 == null || (str2.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str2 = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str2 = "en";
        }
        if (str2.contains("-")) {
            str = str2.split("-")[0];
        } else {
            str = str2;
        }
        String localeAlias = LocaleController.getLocaleAlias(str);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i11 = 0; i11 < LocaleController.getInstance().languages.size(); i11++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i11);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(str2) || localeInfo3.shortName.equals(str) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo != null && localeInfo2 != null && localeInfo != localeInfo2) {
            TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
            if (localeInfo2 != currentLocaleInfo) {
                tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
                this.I = localeInfo2;
            } else {
                tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
                this.I = localeInfo;
            }
            tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new no(25, this, str2), 8);
        }
    }

    public final void V(boolean z4) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.Ph)});
        this.B.setColorFilter(org.telegram.ui.ActionBar.j6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.j6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f39290f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        this.f39291n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        eg.s0 s0Var = this.f39291n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        if (z4) {
            v70 v70Var = this.F;
            if (v70Var != null) {
                v70Var.postRunnable(new d10(this, 10));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.j6.G6;
                ((TextView) childAt.findViewWithTag(this.f39287a)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f39288b)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.B = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.B), 0, spannableStringBuilder.length(), 33);
        this.C[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, k7.b6.e(28, 28, 17));
        ah.e eVar = new ah.e(this, context, frameLayout, 20);
        this.f39293s = eVar;
        scrollView.addView(eVar, k7.b6.x(-1, -2, 51));
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = gj0Var;
        gj0Var.h = true;
        gj0Var.X = true;
        gj0Var.m();
        org.telegram.ui.Components.gj0 gj0Var2 = this.v;
        if (org.telegram.ui.ActionBar.j6.A0().q()) {
            i10 = this.v.e[0] - 1;
        } else {
            i10 = 0;
        }
        gj0Var2.N(i10);
        org.telegram.ui.Components.gj0 gj0Var3 = this.v;
        if (org.telegram.ui.ActionBar.j6.A0().q()) {
            i11 = this.v.e[0] - 1;
        } else {
            i11 = 0;
        }
        gj0Var3.L(i11, false, false);
        if (org.telegram.ui.ActionBar.j6.A0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.rx0(26, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39292r = frameLayout2;
        this.f39293s.addView(frameLayout2, k7.b6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f39292r.addView(textureView, k7.b6.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new t70(this, 0));
        m2.h hVar = new m2.h(context);
        this.d = hVar;
        hVar.setAdapter(new eg.j1(this, 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f39293s.addView(this.d, k7.b6.c(-1.0f, -1));
        this.d.b(new q2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        eg.s0 s0Var = new eg.s0(this, context);
        this.f39291n = s0Var;
        k7.d6.b(s0Var, 0.02f, 1.2f);
        this.f39291n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f39291n.setGravity(17);
        this.f39291n.setTypeface(AndroidUtilities.bold());
        this.f39291n.setTextSize(1, 15.0f);
        this.f39291n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39293s.addView(this.f39291n, k7.b6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f39291n.setOnClickListener(new View.OnClickListener(this) {
            public final w70 f38116b;

            {
                this.f38116b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w70 w70Var = this.f38116b;
                        if (!w70Var.f39296y) {
                            w70Var.f39296y = true;
                            w70Var.presentFragment(new pg0(), true);
                            w70Var.J = true;
                            return;
                        }
                        return;
                    default:
                        w70 w70Var2 = this.f38116b;
                        if (!w70Var2.f39296y && w70Var2.I != null) {
                            w70Var2.f39296y = true;
                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(view.getContext(), 3, null);
                            d2Var.f19565d0 = false;
                            d2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new u70(w70Var2, d2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(w70Var2.I, true, false, w70Var2.f39289c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(context, this.d, 6);
        this.e = kaVar;
        this.f39293s.addView(kaVar, k7.b6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39290f = textView;
        textView.setGravity(17);
        this.f39290f.setTextSize(1, 16.0f);
        this.f39293s.addView(this.f39290f, k7.b6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f39290f.setOnClickListener(new View.OnClickListener(this) {
            public final w70 f38116b;

            {
                this.f38116b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w70 w70Var = this.f38116b;
                        if (!w70Var.f39296y) {
                            w70Var.f39296y = true;
                            w70Var.presentFragment(new pg0(), true);
                            w70Var.J = true;
                            return;
                        }
                        return;
                    default:
                        w70 w70Var2 = this.f38116b;
                        if (!w70Var2.f39296y && w70Var2.I != null) {
                            w70Var2.f39296y = true;
                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(view.getContext(), 3, null);
                            d2Var.f19565d0 = false;
                            d2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new u70(w70Var2, d2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(w70Var2.I, true, false, w70Var2.f39289c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f39293s.addView(frameLayout, k7.b6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f39289c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.f39295x = true;
        V(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack && i10 != NotificationCenter.configLoaded) {
            return;
        }
        U();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 18), org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20115q6, org.telegram.ui.ActionBar.j6.P9, org.telegram.ui.ActionBar.j6.Q9, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        if (this.K) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.C = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.D = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.J = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.f39289c).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39295x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f39294w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f39294w = 0;
            }
            this.f39295x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
