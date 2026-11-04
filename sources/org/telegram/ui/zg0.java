package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class zg0 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public final xg0 f52673j1;
    public final org.telegram.ui.Components.fh0 k1;
    public org.telegram.messenger.u10 f52674l1;

    public zg0(Context context, boolean z10, org.telegram.messenger.u10 u10Var) {
        super(context, false);
        int i3;
        this.f52674l1 = u10Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.k1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624194, 46, 46, null);
        imageView.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, null);
        frameLayout.addView((View) imageView, b8.mf.e(72, 72, 17));
        xg0 xg0Var = new xg0(context);
        this.f52673j1 = xg0Var;
        frameLayout.addView(xg0Var, b8.mf.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        xg0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final zg0 f51150b;

            {
                this.f51150b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fh0 fh0Var = this.f51150b.k1;
                        if (!fh0Var.b()) {
                            fh0Var.setProgress(0.0f);
                            fh0Var.d();
                            return;
                        }
                        return;
                    default:
                        zg0 zg0Var = this.f51150b;
                        org.telegram.messenger.u10 u10Var2 = zg0Var.f52674l1;
                        if (u10Var2 != null) {
                            u10Var2.a(Boolean.TRUE);
                            zg0Var.f52674l1 = null;
                        }
                        zg0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(frameLayout, b8.mf.o(-1, 110));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.bd.M0(2131747894, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        f10.addView(textView, b8.mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.bd.M0(2131747895, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        f10.addView(textView2, b8.mf.o(-1, -2));
        f10.addView(new yg0(2131232225, context, org.telegram.messenger.bd.M0(2131747898, null)), b8.mf.o(-1, -2));
        f10.addView(new yg0(2131232221, context, org.telegram.messenger.bd.M0(2131747897, null)), b8.mf.o(-1, -2));
        f10.addView(new yg0(2131232107, context, org.telegram.messenger.bd.M0(2131747896, null)), b8.mf.o(-1, -2));
        this.O = f10;
        P(org.telegram.ui.ActionBar.k6.f27954h5);
        TextView textView3 = new TextView(context);
        if (z10) {
            i3 = 2131747892;
        } else {
            i3 = 2131747893;
        }
        textView3.setText(org.telegram.messenger.bd.M0(i3, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 24.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N2, f11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final zg0 f51150b;

            {
                this.f51150b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fh0 fh0Var = this.f51150b.k1;
                        if (!fh0Var.b()) {
                            fh0Var.setProgress(0.0f);
                            fh0Var.d();
                            return;
                        }
                        return;
                    default:
                        zg0 zg0Var = this.f51150b;
                        org.telegram.messenger.u10 u10Var2 = zg0Var.f52674l1;
                        if (u10Var2 != null) {
                            u10Var2.a(Boolean.TRUE);
                            zg0Var.f52674l1 = null;
                        }
                        zg0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(textView3, b8.mf.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                org.telegram.messenger.hs.f(i12).c(this, org.telegram.messenger.hs.f23292r);
            } catch (Exception unused) {
            }
        }
    }

    public static void I0() {
        long j10 = org.telegram.messenger.hp.e1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        org.telegram.messenger.hp.e1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean J0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j10 = org.telegram.messenger.hp.e1().getLong("askNotificationsAfter", -1L);
            if (j10 != -2) {
                if (j10 < 0 || System.currentTimeMillis() >= j10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.qr.a0(i13).L;
                }
                if (this.f52673j1.a(i12)) {
                    org.telegram.ui.Components.fh0 fh0Var = this.k1;
                    if (!fh0Var.b()) {
                        fh0Var.setProgress(0.0f);
                        fh0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.u10 u10Var = this.f52674l1;
        if (u10Var != null) {
            u10Var.a(Boolean.FALSE);
            this.f52674l1 = null;
            I0();
        }
        for (int i3 = 0; i3 < 4; i3++) {
            try {
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23292r);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
