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
public final class y11 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.mi0 A;
    public final w11 B;
    public f2.m0 C;
    public final View D;
    public final View E;
    public l11 F;
    public org.telegram.ui.Components.bp G;
    public boolean I;
    public ValueAnimator J;
    public kh.eb K;
    public float L;
    public boolean M;
    public boolean N;
    public final z11 O;
    public final org.telegram.ui.Components.ap f44675b;
    public final v11 f44676c;
    public final z11 d;
    public final Window f44677e;
    public final Drawable f44678f;
    public final fh.v h;
    public final TextView f44679n;
    public final org.telegram.ui.Components.e00 f44680r;
    public final TextView f44681s;
    public final LinearLayout v;
    public final TextView f44682w;
    public final ImageView f44683x;
    public final org.telegram.ui.Components.wk0 f44684y;
    public final Paint f44674a = new Paint(1);
    public int H = -1;

    public y11(z11 z11Var, z11 z11Var2, Window window) {
        int i9;
        f2.m0 yVar;
        int i10;
        this.O = z11Var;
        this.d = z11Var2;
        this.f44677e = window;
        Activity parentActivity = z11Var2.getParentActivity();
        this.f44676c = new f2.n0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f44678f = mutate;
        int themedColor = z11Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        fh.v vVar = new fh.v(this, parentActivity, z11Var2);
        this.h = vVar;
        TextView textView = new TextView(parentActivity);
        this.f44679n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(z11Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        vVar.addView(textView, g7.e6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        int themedColor2 = z11Var2.getThemedColor(i11);
        int dp = AndroidUtilities.dp(28.0f);
        int i12 = R.raw.sun_outline;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i12, "" + R.raw.sun_outline, dp, dp, false, null);
        this.A = mi0Var;
        this.I = org.telegram.ui.ActionBar.f6.I.q() ^ true;
        a(org.telegram.ui.ActionBar.f6.I.q(), false);
        mi0Var.h = true;
        mi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        w11 w11Var = new w11(this, parentActivity);
        this.B = w11Var;
        w11Var.setAnimation(mi0Var);
        w11Var.setScaleType(ImageView.ScaleType.CENTER);
        w11Var.setOnClickListener(new q50(this, 28));
        w11Var.setAlpha(0.0f);
        w11Var.setVisibility(4);
        vVar.addView(w11Var, g7.e6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(parentActivity, z11Var2.f45000a);
        this.f44680r = e00Var;
        e00Var.setVisibility(0);
        vVar.addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.N = true;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(parentActivity, null);
        this.f44684y = wk0Var;
        i9 = ((org.telegram.ui.ActionBar.o2) z11Var).currentAccount;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(i9, 2, z11Var.f45000a);
        this.f44675b = apVar;
        wk0Var.setAdapter(apVar);
        wk0Var.setClipChildren(false);
        wk0Var.setClipToPadding(false);
        wk0Var.setItemAnimator(null);
        wk0Var.setNestedScrollingEnabled(false);
        if (this.N) {
            z11Var2.getParentActivity();
            yVar = new f2.m0(0, false);
        } else {
            z11Var2.getParentActivity();
            yVar = new f2.y(3, false);
        }
        this.C = yVar;
        wk0Var.setLayoutManager(yVar);
        wk0Var.setOnItemClickListener(new i(this, 29));
        wk0Var.setOnScrollListener(new org.telegram.ui.Components.q31(this));
        vVar.addView(wk0Var);
        View view = new View(parentActivity);
        this.D = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        vVar.addView(view);
        View view2 = new View(parentActivity);
        this.E = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        vVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f44681s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, z11Var2.getThemedColor(i11)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(z11Var2.getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        vVar.addView(textView2);
        i10 = ((org.telegram.ui.ActionBar.o2) z11Var).currentAccount;
        if (UserConfig.getInstance(i10).getClientUserId() == z11Var.H) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.v5.b(z11Var2.getThemedColor(i11)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f44683x = imageView;
            imageView.setLayoutParams(g7.e6.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(z11Var2.getThemedColor(i11), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f44682w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(z11Var2.getThemedColor(i11));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            vVar.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f44683x = null;
        this.f44682w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i9;
        if (this.I != z10) {
            this.I = z10;
            org.telegram.ui.Components.mi0 mi0Var = this.A;
            if (z10) {
                i9 = mi0Var.f30847e[0] - 1;
            } else {
                i9 = 0;
            }
            w11 w11Var = this.B;
            if (z11) {
                mi0Var.N(i9);
                if (w11Var != null) {
                    w11Var.d();
                    return;
                }
                return;
            }
            mi0Var.N(i9);
            mi0Var.L(i9, false, true);
            if (w11Var != null) {
                w11Var.invalidate();
            }
        }
    }

    public final void b(int i9) {
        this.H = i9;
        org.telegram.ui.Components.ap apVar = this.f44675b;
        apVar.E(i9);
        if (i9 > 0 && i9 < apVar.d.size() / 2) {
            i9--;
        }
        this.C.h1(Math.min(i9, apVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            this.f44675b.l();
        }
    }
}
