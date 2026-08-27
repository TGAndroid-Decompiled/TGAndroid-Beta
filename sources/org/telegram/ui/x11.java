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

public final class x11 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.oi0 A;
    public final v11 B;
    public f2.k0 C;
    public final View D;
    public final View E;
    public k11 F;
    public org.telegram.ui.Components.zo G;
    public boolean I;
    public ValueAnimator J;
    public lh.bb K;
    public float L;
    public boolean M;
    public boolean N;
    public final y11 O;

    public final org.telegram.ui.Components.yo f44248b;

    public final u11 f44249c;
    public final y11 d;

    public final Window f44250e;

    public final Drawable f44251f;
    public final ag.y1 h;

    public final TextView f44252n;

    public final org.telegram.ui.Components.h00 f44253r;

    public final TextView f44254s;
    public final LinearLayout v;

    public final TextView f44255w;

    public final ImageView f44256x;

    public final org.telegram.ui.Components.zk0 f44257y;

    public final Paint f44247a = new Paint(1);
    public int H = -1;

    public x11(y11 y11Var, y11 y11Var2, Window window) {
        f2.k0 xVar;
        this.O = y11Var;
        this.d = y11Var2;
        this.f44250e = window;
        Activity parentActivity = y11Var2.getParentActivity();
        this.f44249c = new u11(parentActivity);
        Drawable drawableMutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f44251f = drawableMutate;
        int themedColor = y11Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ag.y1 y1Var = new ag.y1(this, parentActivity, y11Var2);
        this.h = y1Var;
        TextView textView = new TextView(parentActivity);
        this.f44252n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(y11Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        y1Var.addView(textView, h7.z5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = y11Var2.getThemedColor(i10);
        int iDp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun_outline, "" + R.raw.sun_outline, iDp, iDp, false, null);
        this.A = oi0Var;
        this.I = org.telegram.ui.ActionBar.g6.I.q() ^ true;
        a(org.telegram.ui.ActionBar.g6.I.q(), false);
        oi0Var.h = true;
        oi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        v11 v11Var = new v11(this, parentActivity);
        this.B = v11Var;
        v11Var.setAnimation(oi0Var);
        v11Var.setScaleType(ImageView.ScaleType.CENTER);
        v11Var.setOnClickListener(new u50(this, 28));
        v11Var.setAlpha(0.0f);
        v11Var.setVisibility(4);
        y1Var.addView(v11Var, h7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(parentActivity, y11Var2.f44666a);
        this.f44253r = h00Var;
        h00Var.setVisibility(0);
        y1Var.addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.N = true;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(parentActivity, null);
        this.f44257y = zk0Var;
        org.telegram.ui.Components.yo yoVar = new org.telegram.ui.Components.yo(((org.telegram.ui.ActionBar.n2) y11Var).currentAccount, 2, y11Var.f44666a);
        this.f44248b = yoVar;
        zk0Var.setAdapter(yoVar);
        zk0Var.setClipChildren(false);
        zk0Var.setClipToPadding(false);
        zk0Var.setItemAnimator(null);
        zk0Var.setNestedScrollingEnabled(false);
        if (this.N) {
            y11Var2.getParentActivity();
            xVar = new f2.k0(0, false);
        } else {
            y11Var2.getParentActivity();
            xVar = new f2.x(3, false);
        }
        this.C = xVar;
        zk0Var.setLayoutManager(xVar);
        zk0Var.setOnItemClickListener(new i(this, 29));
        zk0Var.setOnScrollListener(new org.telegram.ui.Components.s31(this));
        y1Var.addView(zk0Var);
        View view = new View(parentActivity);
        this.D = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        y1Var.addView(view);
        View view2 = new View(parentActivity);
        this.E = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        y1Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f44254s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, y11Var2.getThemedColor(i10)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(y11Var2.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        y1Var.addView(textView2);
        if (UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) y11Var).currentAccount).getClientUserId() != y11Var.H) {
            this.v = null;
            this.f44256x = null;
            this.f44255w = null;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.v = linearLayout;
        linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.b.k(org.telegram.ui.ActionBar.w5.b(y11Var2.getThemedColor(i10)), 25)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(parentActivity);
        this.f44256x = imageView;
        imageView.setLayoutParams(h7.z5.t(24, 24, 17, 0, 0, 10, 0));
        imageView.setImageResource(R.drawable.profile_qr_scan_24);
        imageView.setColorFilter(new PorterDuffColorFilter(y11Var2.getThemedColor(i10), mode));
        linearLayout.addView(imageView);
        TextView textView3 = new TextView(parentActivity);
        this.f44255w = textView3;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setText(LocaleController.getString(R.string.ScanQrCode));
        textView3.setTextColor(y11Var2.getThemedColor(i10));
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3);
        y1Var.addView(linearLayout);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        org.telegram.ui.Components.oi0 oi0Var = this.A;
        int i10 = z10 ? oi0Var.f31312e[0] - 1 : 0;
        v11 v11Var = this.B;
        if (z11) {
            oi0Var.N(i10);
            if (v11Var != null) {
                v11Var.d();
                return;
            }
            return;
        }
        oi0Var.N(i10);
        oi0Var.L(i10, false, true);
        if (v11Var != null) {
            v11Var.invalidate();
        }
    }

    public final void b(int i10) {
        this.H = i10;
        org.telegram.ui.Components.yo yoVar = this.f44248b;
        yoVar.E(i10);
        if (i10 > 0 && i10 < yoVar.d.size() / 2) {
            i10--;
        }
        this.C.h1(Math.min(i10, yoVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f44248b.l();
        }
    }
}
