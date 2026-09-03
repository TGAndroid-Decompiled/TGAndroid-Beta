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
public final class t21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.gj0 B;
    public final r21 C;
    public f2.i0 D;
    public final View E;
    public final View F;
    public e21 G;
    public org.telegram.ui.Components.ip H;
    public boolean J;
    public ValueAnimator K;
    public org.telegram.ui.Components.to L;
    public float M;
    public boolean N;
    public boolean O;
    public final u21 P;
    public final org.telegram.ui.Components.hp f38362b;
    public final q21 f38363c;
    public final u21 d;
    public final Window e;
    public final Drawable f38364f;
    public final ah.e h;
    public final TextView f38365n;
    public final org.telegram.ui.Components.u00 f38366r;
    public final TextView f38367s;
    public final LinearLayout v;
    public final TextView f38368w;
    public final ImageView f38369x;
    public final org.telegram.ui.Components.rl0 f38370y;
    public final Paint f38361a = new Paint(1);
    public int I = -1;

    public t21(u21 u21Var, u21 u21Var2, Window window) {
        int i10;
        f2.i0 wVar;
        int i11;
        this.P = u21Var;
        this.d = u21Var2;
        this.e = window;
        Activity parentActivity = u21Var2.getParentActivity();
        this.f38363c = new f2.j0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f38364f = mutate;
        int themedColor = u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ah.e eVar = new ah.e(this, parentActivity, u21Var2);
        this.h = eVar;
        TextView textView = new TextView(parentActivity);
        this.f38365n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19987j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        eVar.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = u21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun_outline, dp, dp, false, null);
        this.B = gj0Var;
        this.J = !org.telegram.ui.ActionBar.j6.I.q();
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        r21 r21Var = new r21(this, parentActivity);
        this.C = r21Var;
        r21Var.setAnimation(gj0Var);
        r21Var.setScaleType(ImageView.ScaleType.CENTER);
        r21Var.setOnClickListener(new g60(this, 27));
        r21Var.setAlpha(0.0f);
        r21Var.setVisibility(4);
        eVar.addView(r21Var, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity, u21Var2.f38674a);
        this.f38366r = u00Var;
        u00Var.setVisibility(0);
        eVar.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.O = true;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(parentActivity, null);
        this.f38370y = rl0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(i10, 2, u21Var.f38674a);
        this.f38362b = hpVar;
        rl0Var.setAdapter(hpVar);
        rl0Var.setClipChildren(false);
        rl0Var.setClipToPadding(false);
        rl0Var.setItemAnimator(null);
        rl0Var.setNestedScrollingEnabled(false);
        if (this.O) {
            u21Var2.getParentActivity();
            wVar = new f2.i0(0, false);
        } else {
            u21Var2.getParentActivity();
            wVar = new f2.w(3, false);
        }
        this.D = wVar;
        rl0Var.setLayoutManager(wVar);
        rl0Var.setOnItemClickListener(new p21(this, 0));
        rl0Var.setOnScrollListener(new org.telegram.ui.Components.n41(this));
        eVar.addView(rl0Var);
        View view = new View(parentActivity);
        this.E = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        eVar.addView(view);
        View view2 = new View(parentActivity);
        this.F = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        eVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f38367s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, u21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        eVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == u21Var.I) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(u21Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f38369x = imageView;
            imageView.setLayoutParams(k7.b6.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(u21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f38368w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(u21Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            eVar.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f38369x = null;
        this.f38368w = null;
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        if (this.J != z4) {
            this.J = z4;
            org.telegram.ui.Components.gj0 gj0Var = this.B;
            if (z4) {
                i10 = gj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            r21 r21Var = this.C;
            if (z10) {
                gj0Var.N(i10);
                if (r21Var != null) {
                    r21Var.d();
                    return;
                }
                return;
            }
            gj0Var.N(i10);
            gj0Var.L(i10, false, true);
            if (r21Var != null) {
                r21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.I = i10;
        org.telegram.ui.Components.hp hpVar = this.f38362b;
        hpVar.E(i10);
        if (i10 > 0 && i10 < hpVar.d.size() / 2) {
            i10--;
        }
        this.D.h1(Math.min(i10, hpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f38362b.l();
        }
    }
}
