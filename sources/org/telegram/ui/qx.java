package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class qx extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f51333a;
    public final FrameLayout[] f51334b;
    public final org.telegram.ui.Components.q9[] f51335c;
    public final FrameLayout[] d;
    public final FrameLayout[] f51336e;
    public final float[] f51337f;
    public final int[] h;
    public org.telegram.messenger.y10 f51338n;
    public org.telegram.ui.Components.o41 f51339r;
    public int f51340s;
    public ValueAnimator f51341w;
    public int f51342x;
    public static final int[] f51332y = {2131624298, 2131624296, 2131624297};
    public static final int[] E = {2131743742, 2131743743, 2131743739};

    public qx(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7 = 3;
        this.f51334b = new FrameLayout[3];
        this.f51335c = new org.telegram.ui.Components.q9[3];
        this.d = new FrameLayout[3];
        this.f51336e = new FrameLayout[3];
        this.f51337f = new float[3];
        this.h = new int[3];
        int i10 = -1;
        this.f51340s = -1;
        this.f51333a = h6Var;
        ?? r52 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        setClipChildren(false);
        int i11 = 0;
        while (i11 < i7) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r52);
            c8.sa.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new ci.q(this, i11, 25));
            addView(frameLayout, c8.na.p(r52, i10, 1.0f, 119));
            this.f51334b[i11] = frameLayout;
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setImageDrawable(new org.telegram.ui.Components.oh0(f51332y[i11], org.telegram.messenger.g0.L(160.0f), org.telegram.messenger.g0.L(160.0f)));
            frameLayout.addView(q9Var, c8.na.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.f51335c[i11] = q9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = c8.wa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.f29758z6, true, null);
            int[] iArr = E;
            b10.setText(org.telegram.messenger.hd.N0(iArr[i11], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.g0.L(10.0f), r52, org.telegram.messenger.g0.L(10.0f), r52);
            frameLayout2.addView(b10, c8.na.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(10.0f), r52, org.telegram.messenger.g0.L(10.0f), r52);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i12 = org.telegram.ui.ActionBar.m6.Fi;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.t6.j(frameLayout3, d02, M, null, h6Var);
            frameLayout2.addView(frameLayout3, c8.na.e(-2, 26, 17));
            TextView b11 = c8.wa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.f29402g6, true, null);
            b11.setText(org.telegram.messenger.hd.N0(iArr[i11], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, c8.na.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, c8.na.e(-2, 26, 49));
            this.d[i11] = frameLayout2;
            this.f51336e[i11] = frameLayout3;
            i11++;
            i7 = 3;
            i10 = -1;
            r52 = 0;
        }
        boolean z10 = r52;
        b(z10 ? 1 : 0, z10);
    }

    public final void a() {
        for (int i7 = 0; i7 < 3; i7++) {
            int i10 = org.telegram.ui.ActionBar.m6.C6;
            org.telegram.ui.ActionBar.h6 h6Var = this.f51333a;
            int f10 = i0.a.f(this.f51337f[i7], org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var));
            int[] iArr = this.h;
            if (f10 != iArr[i7]) {
                iArr[i7] = f10;
                org.telegram.ui.Components.q9[] q9VarArr = this.f51335c;
                q9VarArr[i7].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                q9VarArr[i7].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.C6));
    }

    public final void b(int i7, boolean z10) {
        float f10;
        if (this.f51340s != i7) {
            this.f51340s = i7;
            ValueAnimator valueAnimator = this.f51341w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f51341w = null;
            }
            int i10 = 0;
            while (true) {
                float f11 = 1.0f;
                if (i10 >= 3) {
                    break;
                }
                if (i10 != i7) {
                    f11 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.f51336e;
                if (z10) {
                    org.telegram.messenger.o10.o(frameLayoutArr[i10].animate().scaleX(f11).scaleY(f11).alpha(f11), org.telegram.ui.Components.nr.h, 320L);
                } else {
                    frameLayoutArr[i10].animate().cancel();
                    frameLayoutArr[i10].setScaleX(f11);
                    frameLayoutArr[i10].setScaleY(f11);
                    frameLayoutArr[i10].setAlpha(f11);
                }
                i10++;
            }
            float[] fArr = this.f51337f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f51341w = ofFloat;
                ofFloat.addUpdateListener(new hi.a4(this, (float[]) fArr.clone(), i7, 2));
                this.f51341w.addListener(new org.telegram.ui.Cells.y9(this, 29));
                this.f51341w.setInterpolator(org.telegram.ui.Components.nr.h);
                this.f51341w.setDuration(320L);
                this.f51341w.start();
            } else {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == i7) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr[i11] = f10;
                }
                a();
            }
            org.telegram.ui.Components.oh0 B = this.f51335c[i7].getImageReceiver().B();
            if (B != null) {
                if (B.t() > 0.8f) {
                    B.T(false, 0.0f);
                }
                B.H(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), Math.min(org.telegram.messenger.g0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.g0.L(8.0f)) / 0.61f)));
        if (max != this.f51342x) {
            this.f51342x = max;
            for (int i11 = 0; i11 < 3; i11++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51335c[i11].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i11].getLayoutParams()).topMargin = org.telegram.messenger.g0.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(66.0f) + max, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.f51341w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
