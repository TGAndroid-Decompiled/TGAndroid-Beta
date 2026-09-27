package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class r61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f37006a;
    public final ImageView f37007b;
    public final ImageView f37008c;
    public final org.telegram.ui.Components.vg0 d;
    public final View e;
    public final org.telegram.ui.Components.mn0 f37009f;
    public final org.telegram.ui.Cells.c6 h;
    public q61 f37010n;
    public float f37011r;
    public ValueAnimator f37012s;
    public xz0 v;
    public boolean f37013w;
    public boolean f37014x;
    public final c71 f37015y;

    public r61(c71 c71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = c71Var.Z0;
        this.f37015y = c71Var;
        this.f37013w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37006a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f47162a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.y5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f37007b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0();
        this.f37009f = mn0Var;
        mn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.i6.Je;
        mn0Var.a(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        imageView.setImageDrawable(mn0Var);
        final t51 t51Var = (t51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t51 t51Var2 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var = t51Var2.h;
                        if (t51Var2.f37009f.f26482k == 1) {
                            c6Var.setText("");
                            t51Var2.f37015y.v(null, true, false);
                            q61 q61Var = t51Var2.f37010n;
                            if (q61Var != null) {
                                q61Var.G1(null);
                                t51Var2.f37010n.H1(true, true);
                                t51Var2.f37010n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                            t51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t51 t51Var3 = t51Var;
                        c71 c71Var2 = t51Var3.f37015y;
                        if (!c71Var2.u()) {
                            c71Var2.q();
                            t51Var3.h.requestFocus();
                            c71.a(c71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t51 t51Var4 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = t51Var4.h;
                        c6Var2.setText("");
                        t51Var4.f37015y.v(null, true, false);
                        q61 q61Var2 = t51Var4.f37010n;
                        if (q61Var2 != null) {
                            q61Var2.G1(null);
                            t51Var4.f37010n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                        t51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        org.telegram.ui.Components.vg0 vg0Var = new org.telegram.ui.Components.vg0(t51Var, context, z10);
        this.d = vg0Var;
        frameLayout.addView(vg0Var, w7.y5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(t51Var, context, e6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new n0(t51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        vg0Var.addView(c6Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            vg0Var.addView(view, w7.y5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t51 t51Var2 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = t51Var2.h;
                        if (t51Var2.f37009f.f26482k == 1) {
                            c6Var2.setText("");
                            t51Var2.f37015y.v(null, true, false);
                            q61 q61Var = t51Var2.f37010n;
                            if (q61Var != null) {
                                q61Var.G1(null);
                                t51Var2.f37010n.H1(true, true);
                                t51Var2.f37010n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                            t51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t51 t51Var3 = t51Var;
                        c71 c71Var2 = t51Var3.f37015y;
                        if (!c71Var2.u()) {
                            c71Var2.q();
                            t51Var3.h.requestFocus();
                            c71.a(c71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t51 t51Var4 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = t51Var4.h;
                        c6Var22.setText("");
                        t51Var4.f37015y.v(null, true, false);
                        q61 q61Var2 = t51Var4.f37010n;
                        if (q61Var2 != null) {
                            q61Var2.G1(null);
                            t51Var4.f37010n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                        t51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f37008c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(t51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t51 t51Var2 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = t51Var2.h;
                        if (t51Var2.f37009f.f26482k == 1) {
                            c6Var2.setText("");
                            t51Var2.f37015y.v(null, true, false);
                            q61 q61Var = t51Var2.f37010n;
                            if (q61Var != null) {
                                q61Var.G1(null);
                                t51Var2.f37010n.H1(true, true);
                                t51Var2.f37010n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                            t51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t51 t51Var3 = t51Var;
                        c71 c71Var2 = t51Var3.f37015y;
                        if (!c71Var2.u()) {
                            c71Var2.q();
                            t51Var3.h.requestFocus();
                            c71.a(c71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t51 t51Var4 = t51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = t51Var4.h;
                        c6Var22.setText("");
                        t51Var4.f37015y.v(null, true, false);
                        q61 q61Var2 = t51Var4.f37010n;
                        if (q61Var2 != null) {
                            q61Var2.G1(null);
                            t51Var4.f37010n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                        t51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (!zg.f0.d) {
            b();
        }
    }

    public static void a(t51 t51Var, boolean z10) {
        if (z10) {
            if (t51Var.v == null) {
                xz0 xz0Var = new xz0(t51Var, 14);
                t51Var.v = xz0Var;
                AndroidUtilities.runOnUIThread(xz0Var, 340L);
                return;
            }
            return;
        }
        xz0 xz0Var2 = t51Var.v;
        if (xz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xz0Var2);
            t51Var.v = null;
        }
        AndroidUtilities.updateViewShow(t51Var.f37008c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f37013w) {
            return;
        }
        this.f37013w = z10;
        ValueAnimator valueAnimator = this.f37012s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f37011r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37012s = ofFloat;
        ofFloat.addUpdateListener(new b21(this, 8));
        this.f37012s.setDuration(120L);
        this.f37012s.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f37012s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        q61 q61Var;
        q61 q61Var2;
        org.telegram.ui.Components.mn0 mn0Var = this.f37009f;
        int i10 = mn0Var.f26482k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((q61Var2 = this.f37010n) != null && q61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((q61Var = this.f37010n) == null || q61Var.f25255o3 <= 0.5f || (!q61Var.j3 && q61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        mn0Var.b(r62);
        ImageView imageView = this.f37007b;
        imageView.setClickable(r62);
        if (r62 != 0) {
            str = LocaleController.getString(R.string.AccDescrGoBack);
        } else {
            str = null;
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void e() {
        if (this.f37014x) {
            this.f37006a.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.f37015y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
