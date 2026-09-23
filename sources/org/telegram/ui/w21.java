package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class w21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.yi0 E;
    public final u21 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public i21 J;
    public org.telegram.ui.Components.mp K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final x21 S;
    public final org.telegram.ui.Components.lp f38516b;
    public final t21 f38517c;
    public final x21 d;
    public final Window e;
    public final Drawable f38518f;
    public final ci.m6 h;
    public final TextView f38519n;
    public final org.telegram.ui.Components.u00 f38520r;
    public final TextView f38521s;
    public final LinearLayout v;
    public final TextView f38522w;
    public final ImageView f38523x;
    public final org.telegram.ui.Components.ml0 f38524y;
    public final Paint f38515a = new Paint(1);
    public int L = -1;

    public w21(x21 x21Var, x21 x21Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = x21Var;
        this.d = x21Var2;
        this.e = window;
        Activity parentActivity = x21Var2.getParentActivity();
        this.f38517c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f38518f = mutate;
        int themedColor = x21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, x21Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f38519n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(x21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18895j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = x21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.sun_outline, dp, dp, false, null);
        this.E = yi0Var;
        this.M = !org.telegram.ui.ActionBar.h6.I.q();
        a(org.telegram.ui.ActionBar.h6.I.q(), false);
        yi0Var.h = true;
        yi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        u21 u21Var = new u21(this, parentActivity);
        this.F = u21Var;
        u21Var.setAnimation(yi0Var);
        u21Var.setScaleType(ImageView.ScaleType.CENTER);
        u21Var.setOnClickListener(new h60(this, 27));
        u21Var.setAlpha(0.0f);
        u21Var.setVisibility(4);
        m6Var.addView(u21Var, w7.x5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity, x21Var2.f39169a);
        this.f38520r = u00Var;
        u00Var.setVisibility(0);
        m6Var.addView(u00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(parentActivity, null);
        this.f38524y = ml0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) x21Var).currentAccount;
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(i10, 2, x21Var.f39169a);
        this.f38516b = lpVar;
        ml0Var.setAdapter(lpVar);
        ml0Var.setClipChildren(false);
        ml0Var.setClipToPadding(false);
        ml0Var.setItemAnimator(null);
        ml0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            x21Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            x21Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        ml0Var.setLayoutManager(sVar);
        ml0Var.setOnItemClickListener(new s21(this, 0));
        ml0Var.setOnScrollListener(new org.telegram.ui.Components.m41(this));
        m6Var.addView(ml0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        m6Var.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        m6Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f38521s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{24.0f}, x21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(x21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) x21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == x21Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.x5.b(x21Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f38523x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(x21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f38522w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(x21Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f38523x = null;
        this.f38522w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.yi0 yi0Var = this.E;
            if (z10) {
                i10 = yi0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            u21 u21Var = this.F;
            if (z11) {
                yi0Var.P(i10);
                if (u21Var != null) {
                    u21Var.d();
                    return;
                }
                return;
            }
            yi0Var.P(i10);
            yi0Var.N(i10, false, true);
            if (u21Var != null) {
                u21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.lp lpVar = this.f38516b;
        lpVar.E(i10);
        if (i10 > 0 && i10 < lpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, lpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f38516b.l();
        }
    }
}
