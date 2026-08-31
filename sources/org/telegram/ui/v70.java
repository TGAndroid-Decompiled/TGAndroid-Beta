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
public final class v70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable B;
    public CharSequence[] C;
    public String[] D;
    public int E;
    public u70 F;
    public long G;
    public boolean H;
    public LocaleController.LocaleInfo I;
    public boolean J;
    public boolean K;
    public final Object f42139a;
    public final Object f42140b;
    public final int f42141c;
    public m2.h d;
    public org.telegram.ui.Components.ka f42142e;
    public TextView f42143f;
    public GradientDrawable h;
    public fg.s0 f42144n;
    public FrameLayout f42145r;
    public ag.l f42146s;
    public org.telegram.ui.Components.ij0 v;
    public int f42147w;
    public boolean f42148x;
    public boolean f42149y;

    public v70() {
        super(null);
        this.f42139a = new Object();
        this.f42140b = new Object();
        this.f42141c = UserConfig.selectedAccount;
        this.f42147w = 0;
        this.f42148x = false;
        this.f42149y = false;
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f42141c;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new lo(25, this, str2), 8);
        }
    }

    public final void V(boolean z4) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.k6.Ph)});
        this.B.setColorFilter(org.telegram.ui.ActionBar.k6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f42143f.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        this.f42144n.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        fg.s0 s0Var = this.f42144n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.f42142e.invalidate();
        if (z4) {
            u70 u70Var = this.F;
            if (u70Var != null) {
                u70Var.postRunnable(new c10(this, 10));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.k6.G6;
                ((TextView) childAt.findViewWithTag(this.f42139a)).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f42140b)).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
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
        frameLayout.addView((View) imageView, k7.c6.e(28, 28, 17));
        ag.l lVar = new ag.l(this, context, frameLayout, 21);
        this.f42146s = lVar;
        scrollView.addView(lVar, k7.c6.x(-1, -2, 51));
        int i13 = R.raw.sun;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(i13, String.valueOf(i13), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = ij0Var;
        ij0Var.h = true;
        ij0Var.X = true;
        ij0Var.m();
        org.telegram.ui.Components.ij0 ij0Var2 = this.v;
        if (org.telegram.ui.ActionBar.k6.A0().q()) {
            i10 = this.v.f27817e[0] - 1;
        } else {
            i10 = 0;
        }
        ij0Var2.N(i10);
        org.telegram.ui.Components.ij0 ij0Var3 = this.v;
        if (org.telegram.ui.ActionBar.k6.A0().q()) {
            i11 = this.v.f27817e[0] - 1;
        } else {
            i11 = 0;
        }
        ij0Var3.L(i11, false, false);
        if (org.telegram.ui.ActionBar.k6.A0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.sx0(26, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42145r = frameLayout2;
        this.f42146s.addView(frameLayout2, k7.c6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f42145r.addView(textureView, k7.c6.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new s70(this, 0));
        m2.h hVar = new m2.h(context);
        this.d = hVar;
        hVar.setAdapter(new fg.i1(this, 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f42146s.addView(this.d, k7.c6.c(-1.0f, -1));
        this.d.b(new o2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        fg.s0 s0Var = new fg.s0(this, context);
        this.f42144n = s0Var;
        k7.e6.b(s0Var, 0.02f, 1.2f);
        this.f42144n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f42144n.setGravity(17);
        this.f42144n.setTypeface(AndroidUtilities.bold());
        this.f42144n.setTextSize(1, 15.0f);
        this.f42144n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f42146s.addView(this.f42144n, k7.c6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f42144n.setOnClickListener(new View.OnClickListener(this) {
            public final v70 f40843b;

            {
                this.f40843b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v70 v70Var = this.f40843b;
                        if (!v70Var.f42149y) {
                            v70Var.f42149y = true;
                            v70Var.presentFragment(new og0(), true);
                            v70Var.J = true;
                            return;
                        }
                        return;
                    default:
                        v70 v70Var2 = this.f40843b;
                        if (!v70Var2.f42149y && v70Var2.I != null) {
                            v70Var2.f42149y = true;
                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(view.getContext(), 3, null);
                            d2Var.f21241d0 = false;
                            d2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new t70(v70Var2, d2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(v70Var2.I, true, false, v70Var2.f42141c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(context, this.d, 6);
        this.f42142e = kaVar;
        this.f42146s.addView(kaVar, k7.c6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42143f = textView;
        textView.setGravity(17);
        this.f42143f.setTextSize(1, 16.0f);
        this.f42146s.addView(this.f42143f, k7.c6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f42143f.setOnClickListener(new View.OnClickListener(this) {
            public final v70 f40843b;

            {
                this.f40843b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v70 v70Var = this.f40843b;
                        if (!v70Var.f42149y) {
                            v70Var.f42149y = true;
                            v70Var.presentFragment(new og0(), true);
                            v70Var.J = true;
                            return;
                        }
                        return;
                    default:
                        v70 v70Var2 = this.f40843b;
                        if (!v70Var2.f42149y && v70Var2.I != null) {
                            v70Var2.f42149y = true;
                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(view.getContext(), 3, null);
                            d2Var.f21241d0 = false;
                            d2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new t70(v70Var2, d2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(v70Var2.I, true, false, v70Var2.f42141c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f42146s.addView(frameLayout, k7.c6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i14 = this.f42141c;
        NotificationCenter.getInstance(i14).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i14).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i14);
        U();
        this.f42148x = true;
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
        return k7.f6.a(new f(this, 18), org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.f21894q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, true)) > 0.699999988079071d) {
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
        NotificationCenter.getInstance(this.f42141c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f42148x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f42147w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f42147w = 0;
            }
            this.f42148x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
