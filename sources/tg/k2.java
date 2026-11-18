package tg;

import ai.r2;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import hi.t6;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.y60;
public final class k2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public h0 H;
    public t6 I;
    public final int f57987a;
    public final w01 f57988b;
    public final r2 f57989c;
    public final di.d1 d;
    public final ImageView f57990e;
    public final i2 f57991f;
    public final Rect h;
    public Bitmap f57992n;
    public BitmapShader f57993r;
    public Paint f57994s;
    public Matrix f57995w;
    public final ta0 f57996x;
    public final ta0 f57997y;

    public k2(Context context, final int i7) {
        super(context, 2131755352);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        this.G = false;
        this.f57987a = i7;
        w01 w01Var = new w01(9, context, this);
        this.f57988b = w01Var;
        w01Var.setOnClickListener(new sh.b(this, 2));
        r2 r2Var = new r2(context, 11);
        this.f57989c = r2Var;
        r2Var.setOrientation(1);
        w01Var.addView(r2Var, ma.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        r2Var.addView(d1Var, ma.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, ma.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131744398, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(gd.M0(2131744399, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, ma.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.d1 d1Var2 = new di.d1(this, context, 13);
        this.d = d1Var2;
        d1Var.addView(d1Var2, ma.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f57990e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d1Var2.addView(imageView, ma.e(-1, -1, 119));
        i2 i2Var = new i2(this, context, org.telegram.messenger.g0.f24117p);
        this.f57991f = i2Var;
        d1Var2.addView(i2Var, ma.e(-2, -2, 17));
        y60 G = y60.G(w01Var, bVar, w01Var);
        ta0 ta0Var = new ta0(getContext(), 2131624140, gd.M0(2131744409, null), 2131624139, gd.M0(2131744408, null), bVar);
        this.f57996x = ta0Var;
        ta0Var.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f57906b;

            {
                this.f57906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k2 k2Var = this.f57906b;
                        h0 h0Var = k2Var.H;
                        boolean z10 = h0Var.f57896f;
                        h0Var.f57896f = !z10;
                        k2Var.f57996x.a(z10, true);
                        k2Var.f57991f.b(i7, k2Var.H, true);
                        return;
                    default:
                        k2 k2Var2 = this.f57906b;
                        h0 h0Var2 = k2Var2.H;
                        boolean z11 = h0Var2.f57895e;
                        h0Var2.f57895e = !z11;
                        k2Var2.f57997y.a(z11, true);
                        k2Var2.f57991f.b(i7, k2Var2.H, true);
                        return;
                }
            }
        });
        G.q(ta0Var);
        ta0 ta0Var2 = new ta0(context, 2131624090, gd.M0(2131748707, null), 2131624087, gd.M0(2131748706, null), bVar);
        this.f57997y = ta0Var2;
        ta0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f57906b;

            {
                this.f57906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k2 k2Var = this.f57906b;
                        h0 h0Var = k2Var.H;
                        boolean z10 = h0Var.f57896f;
                        h0Var.f57896f = !z10;
                        k2Var.f57996x.a(z10, true);
                        k2Var.f57991f.b(i7, k2Var.H, true);
                        return;
                    default:
                        k2 k2Var2 = this.f57906b;
                        h0 h0Var2 = k2Var2.H;
                        boolean z11 = h0Var2.f57895e;
                        h0Var2.f57895e = !z11;
                        k2Var2.f57997y.a(z11, true);
                        k2Var2.f57991f.b(i7, k2Var2.H, true);
                        return;
                }
            }
        });
        G.q(ta0Var2);
        G.k();
        G.c(2131232359, gd.M0(2131754216, null), new g2(this, 2), false);
        G.c(2131232110, gd.M0(2131751350, null), new g2(this, 3), true);
        r2Var.addView(G.A, ma.p(-2, -2, 0.0f, 85));
        w01Var.setFitsSystemWindows(true);
        w01Var.setOnApplyWindowInsetsListener(new j2(this));
    }

    public final void b(boolean z10, g2 g2Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, g2Var, 15));
        this.F.setInterpolator(lr.h);
        ValueAnimator valueAnimator2 = this.F;
        if (z10) {
            j3 = 420;
        } else {
            j3 = 320;
        }
        valueAnimator2.setDuration(j3);
        this.F.start();
    }

    @Override
    public final void dismiss() {
        if (this.G) {
            return;
        }
        t6 t6Var = this.I;
        if (t6Var != null) {
            t6Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new g2(this, 1));
        this.f57988b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.G;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        w01 w01Var = this.f57988b;
        setContentView(w01Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i7;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i7 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        w01Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(w01Var, !n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.messenger.g0.l2(new t6(this, 29), 14.0f);
        b(true, null);
    }
}
