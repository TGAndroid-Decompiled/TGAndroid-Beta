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
public final class v21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.jj0 E;
    public final t21 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public g21 J;
    public org.telegram.ui.Components.np K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final w21 S;
    public final org.telegram.ui.Components.mp f38608b;
    public final s21 f38609c;
    public final w21 d;
    public final Window e;
    public final Drawable f38610f;
    public final ci.m6 h;
    public final TextView f38611n;
    public final org.telegram.ui.Components.v00 f38612r;
    public final TextView f38613s;
    public final LinearLayout v;
    public final TextView f38614w;
    public final ImageView f38615x;
    public final org.telegram.ui.Components.xl0 f38616y;
    public final Paint f38607a = new Paint(1);
    public int L = -1;

    public v21(w21 w21Var, w21 w21Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = w21Var;
        this.d = w21Var2;
        this.e = window;
        Activity parentActivity = w21Var2.getParentActivity();
        this.f38609c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f38610f = mutate;
        int themedColor = w21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, w21Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f38611n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(w21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.y5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = w21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(R.raw.sun_outline, dp, dp, false, null);
        this.E = jj0Var;
        this.M = !org.telegram.ui.ActionBar.h6.I.q();
        a(org.telegram.ui.ActionBar.h6.I.q(), false);
        jj0Var.h = true;
        jj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        t21 t21Var = new t21(this, parentActivity);
        this.F = t21Var;
        t21Var.setAnimation(jj0Var);
        t21Var.setScaleType(ImageView.ScaleType.CENTER);
        t21Var.setOnClickListener(new f60(this, 27));
        t21Var.setAlpha(0.0f);
        t21Var.setVisibility(4);
        m6Var.addView(t21Var, w7.y5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(parentActivity, w21Var2.f38871a);
        this.f38612r = v00Var;
        v00Var.setVisibility(0);
        m6Var.addView(v00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(parentActivity, null);
        this.f38616y = xl0Var;
        i10 = ((org.telegram.ui.ActionBar.m2) w21Var).currentAccount;
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(i10, 2, w21Var.f38871a);
        this.f38608b = mpVar;
        xl0Var.setAdapter(mpVar);
        xl0Var.setClipChildren(false);
        xl0Var.setClipToPadding(false);
        xl0Var.setItemAnimator(null);
        xl0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            w21Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            w21Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        xl0Var.setLayoutManager(sVar);
        xl0Var.setOnItemClickListener(new r21(this, 0));
        xl0Var.setOnScrollListener(new org.telegram.ui.Components.b51(this));
        m6Var.addView(xl0Var);
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
        this.f38613s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, w21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(w21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.m2) w21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == w21Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(w21Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f38615x = imageView;
            imageView.setLayoutParams(w7.y5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(w21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f38614w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(w21Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f38615x = null;
        this.f38614w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.jj0 jj0Var = this.E;
            if (z10) {
                i10 = jj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            t21 t21Var = this.F;
            if (z11) {
                jj0Var.P(i10);
                if (t21Var != null) {
                    t21Var.d();
                    return;
                }
                return;
            }
            jj0Var.P(i10);
            jj0Var.N(i10, false, true);
            if (t21Var != null) {
                t21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.mp mpVar = this.f38608b;
        mpVar.E(i10);
        if (i10 > 0 && i10 < mpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, mpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f38608b.l();
        }
    }
}
