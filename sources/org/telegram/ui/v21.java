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
    public final org.telegram.ui.Components.lj0 E;
    public final t21 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public g21 J;
    public org.telegram.ui.Components.op K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final w21 S;
    public final org.telegram.ui.Components.np f38698b;
    public final s21 f38699c;
    public final w21 d;
    public final Window e;
    public final Drawable f38700f;
    public final ci.m6 h;
    public final TextView f38701n;
    public final org.telegram.ui.Components.w00 f38702r;
    public final TextView f38703s;
    public final LinearLayout v;
    public final TextView f38704w;
    public final ImageView f38705x;
    public final org.telegram.ui.Components.zl0 f38706y;
    public final Paint f38697a = new Paint(1);
    public int L = -1;

    public v21(w21 w21Var, w21 w21Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = w21Var;
        this.d = w21Var2;
        this.e = window;
        Activity parentActivity = w21Var2.getParentActivity();
        this.f38699c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f38700f = mutate;
        int themedColor = w21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, w21Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f38701n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(w21Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19182j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.y5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = w21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(R.raw.sun_outline, dp, dp, false, null);
        this.E = lj0Var;
        this.M = !org.telegram.ui.ActionBar.h6.I.q();
        a(org.telegram.ui.ActionBar.h6.I.q(), false);
        lj0Var.h = true;
        lj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        t21 t21Var = new t21(this, parentActivity);
        this.F = t21Var;
        t21Var.setAnimation(lj0Var);
        t21Var.setScaleType(ImageView.ScaleType.CENTER);
        t21Var.setOnClickListener(new f60(this, 27));
        t21Var.setAlpha(0.0f);
        t21Var.setVisibility(4);
        m6Var.addView(t21Var, w7.y5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(parentActivity, w21Var2.f38960a);
        this.f38702r = w00Var;
        w00Var.setVisibility(0);
        m6Var.addView(w00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(parentActivity, null);
        this.f38706y = zl0Var;
        i10 = ((org.telegram.ui.ActionBar.m2) w21Var).currentAccount;
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(i10, 2, w21Var.f38960a);
        this.f38698b = npVar;
        zl0Var.setAdapter(npVar);
        zl0Var.setClipChildren(false);
        zl0Var.setClipToPadding(false);
        zl0Var.setItemAnimator(null);
        zl0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            w21Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            w21Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        zl0Var.setLayoutManager(sVar);
        zl0Var.setOnItemClickListener(new r21(this, 0));
        zl0Var.setOnScrollListener(new org.telegram.ui.Components.d51(this));
        m6Var.addView(zl0Var);
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
        this.f38703s = textView2;
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
            this.f38705x = imageView;
            imageView.setLayoutParams(w7.y5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(w21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f38704w = textView3;
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
        this.f38705x = null;
        this.f38704w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.lj0 lj0Var = this.E;
            if (z10) {
                i10 = lj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            t21 t21Var = this.F;
            if (z11) {
                lj0Var.P(i10);
                if (t21Var != null) {
                    t21Var.d();
                    return;
                }
                return;
            }
            lj0Var.P(i10);
            lj0Var.N(i10, false, true);
            if (t21Var != null) {
                t21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.np npVar = this.f38698b;
        npVar.E(i10);
        if (i10 > 0 && i10 < npVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, npVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f38698b.l();
        }
    }
}
