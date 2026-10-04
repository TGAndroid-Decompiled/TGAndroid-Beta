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
public final class x21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.kj0 E;
    public final v21 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public i21 J;
    public org.telegram.ui.Components.op K;
    public boolean M;
    public ValueAnimator N;
    public ci.sb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final y21 S;
    public final org.telegram.ui.Components.np f42725b;
    public final u21 f42726c;
    public final y21 d;
    public final Window f42727e;
    public final Drawable f42728f;
    public final ci.m6 h;
    public final TextView f42729n;
    public final org.telegram.ui.Components.w00 f42730r;
    public final TextView f42731s;
    public final LinearLayout v;
    public final TextView f42732w;
    public final ImageView f42733x;
    public final org.telegram.ui.Components.zl0 f42734y;
    public final Paint f42724a = new Paint(1);
    public int L = -1;

    public x21(y21 y21Var, y21 y21Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = y21Var;
        this.d = y21Var2;
        this.f42727e = window;
        Activity parentActivity = y21Var2.getParentActivity();
        this.f42726c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f42728f = mutate;
        int themedColor = y21Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, y21Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f42729n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(y21Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20926j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int themedColor2 = y21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.sun_outline, dp, dp, false, null);
        this.E = kj0Var;
        this.M = !org.telegram.ui.ActionBar.i6.I.q();
        a(org.telegram.ui.ActionBar.i6.I.q(), false);
        kj0Var.h = true;
        kj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        v21 v21Var = new v21(this, parentActivity);
        this.F = v21Var;
        v21Var.setAnimation(kj0Var);
        v21Var.setScaleType(ImageView.ScaleType.CENTER);
        v21Var.setOnClickListener(new j60(this, 27));
        v21Var.setAlpha(0.0f);
        v21Var.setVisibility(4);
        m6Var.addView(v21Var, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(parentActivity, y21Var2.f43017a);
        this.f42730r = w00Var;
        w00Var.setVisibility(0);
        m6Var.addView(w00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(parentActivity, null);
        this.f42734y = zl0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) y21Var).currentAccount;
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(i10, 2, y21Var.f43017a);
        this.f42725b = npVar;
        zl0Var.setAdapter(npVar);
        zl0Var.setClipChildren(false);
        zl0Var.setClipToPadding(false);
        zl0Var.setItemAnimator(null);
        zl0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            y21Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            y21Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        zl0Var.setLayoutManager(sVar);
        zl0Var.setOnItemClickListener(new t21(this, 0));
        zl0Var.setOnScrollListener(new org.telegram.ui.Components.l51(this));
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
        this.f42731s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{24.0f}, y21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(y21Var2.getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) y21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == y21Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.x5.b(y21Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f42733x = imageView;
            imageView.setLayoutParams(w7.z5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(y21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f42732w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(y21Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f42733x = null;
        this.f42732w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.kj0 kj0Var = this.E;
            if (z10) {
                i10 = kj0Var.f28125e[0] - 1;
            } else {
                i10 = 0;
            }
            v21 v21Var = this.F;
            if (z11) {
                kj0Var.P(i10);
                if (v21Var != null) {
                    v21Var.d();
                    return;
                }
                return;
            }
            kj0Var.P(i10);
            kj0Var.N(i10, false, true);
            if (v21Var != null) {
                v21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.np npVar = this.f42725b;
        npVar.E(i10);
        if (i10 > 0 && i10 < npVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, npVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f42725b.l();
        }
    }
}
