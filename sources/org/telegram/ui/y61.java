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
public abstract class y61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f39825a;
    public final ImageView f39826b;
    public final ImageView f39827c;
    public final org.telegram.ui.Components.vg0 d;
    public final View e;
    public final org.telegram.ui.Components.mn0 f39828f;
    public final org.telegram.ui.Cells.d6 h;
    public x61 f39829n;
    public float f39830r;
    public ValueAnimator f39831s;
    public e01 v;
    public boolean f39832w;
    public boolean f39833x;
    public final j71 f39834y;

    public y61(j71 j71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        this.f39834y = j71Var;
        this.f39832w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39825a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f47161a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.y5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f39826b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0();
        this.f39828f = mn0Var;
        mn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        mn0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(mn0Var);
        final a61 a61Var = (a61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var = a61Var2.h;
                        if (a61Var2.f39828f.f26480k == 1) {
                            d6Var.setText("");
                            a61Var2.f39834y.v(null, true, false);
                            x61 x61Var = a61Var2.f39829n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f39829n.H1(true, true);
                                a61Var2.f39829n.E1();
                            }
                            d6Var.clearAnimation();
                            d6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f39834y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = a61Var4.h;
                        d6Var2.setText("");
                        a61Var4.f39834y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f39829n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f39829n.H1(true, true);
                        }
                        d6Var2.clearAnimation();
                        d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        org.telegram.ui.Components.vg0 vg0Var = new org.telegram.ui.Components.vg0(a61Var, context, z10);
        this.d = vg0Var;
        frameLayout.addView(vg0Var, w7.y5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(a61Var, context, f6Var, 1);
        this.h = d6Var;
        d6Var.addTextChangedListener(new l0(a61Var, 15));
        d6Var.setBackground(null);
        d6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        d6Var.setTextSize(1, 16.0f);
        d6Var.setHint(LocaleController.getString(R.string.Search));
        d6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        d6Var.setImeOptions(268435459);
        d6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        d6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        d6Var.setGravity(19);
        d6Var.setCursorWidth(1.5f);
        d6Var.setMaxLines(1);
        d6Var.setSingleLine(true);
        d6Var.setLines(1);
        d6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        vg0Var.addView(d6Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            vg0Var.addView(view, w7.y5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = a61Var2.h;
                        if (a61Var2.f39828f.f26480k == 1) {
                            d6Var2.setText("");
                            a61Var2.f39834y.v(null, true, false);
                            x61 x61Var = a61Var2.f39829n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f39829n.H1(true, true);
                                a61Var2.f39829n.E1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f39834y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = a61Var4.h;
                        d6Var22.setText("");
                        a61Var4.f39834y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f39829n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f39829n.H1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f39827c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(a61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = a61Var2.h;
                        if (a61Var2.f39828f.f26480k == 1) {
                            d6Var2.setText("");
                            a61Var2.f39834y.v(null, true, false);
                            x61 x61Var = a61Var2.f39829n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f39829n.H1(true, true);
                                a61Var2.f39829n.E1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f39834y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = a61Var4.h;
                        d6Var22.setText("");
                        a61Var4.f39834y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f39829n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f39829n.H1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (!zg.f0.d) {
            b();
        }
    }

    public static void a(a61 a61Var, boolean z10) {
        if (z10) {
            if (a61Var.v == null) {
                e01 e01Var = new e01(a61Var, 14);
                a61Var.v = e01Var;
                AndroidUtilities.runOnUIThread(e01Var, 340L);
                return;
            }
            return;
        }
        e01 e01Var2 = a61Var.v;
        if (e01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(e01Var2);
            a61Var.v = null;
        }
        AndroidUtilities.updateViewShow(a61Var.f39827c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f39832w) {
            return;
        }
        this.f39832w = z10;
        ValueAnimator valueAnimator = this.f39831s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f39830r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39831s = ofFloat;
        ofFloat.addUpdateListener(new i21(this, 8));
        this.f39831s.setDuration(120L);
        this.f39831s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f39831s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        x61 x61Var;
        x61 x61Var2;
        org.telegram.ui.Components.mn0 mn0Var = this.f39828f;
        int i10 = mn0Var.f26480k;
        org.telegram.ui.Cells.d6 d6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((d6Var.length() != 0 || ((x61Var2 = this.f39829n) != null && x61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (d6Var.length() <= 0 && ((x61Var = this.f39829n) == null || x61Var.f25504o3 <= 0.5f || (!x61Var.j3 && x61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        mn0Var.b(r62);
        ImageView imageView = this.f39826b;
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
        if (this.f39833x) {
            this.f39825a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f39834y.Z0))));
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
