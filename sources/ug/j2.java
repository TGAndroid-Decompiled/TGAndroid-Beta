package ug;

import ai.v2;
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
import b8.mf;
import gi.j8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.xq;
public final class j2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public g0 H;
    public v2 I;
    public final int f56101a;
    public final kw0 f56102b;
    public final ci.q f56103c;
    public final ci.l1 d;
    public final ImageView f56104e;
    public final h2 f56105f;
    public final Rect h;
    public Bitmap f56106n;
    public BitmapShader f56107r;
    public Paint f56108s;
    public Matrix f56109w;
    public final ca0 f56110x;
    public final ca0 f56111y;

    public j2(Context context, final int i3) {
        super(context, 2131755352);
        ei.b bVar = new ei.b();
        this.h = new Rect();
        this.G = false;
        this.f56101a = i3;
        kw0 kw0Var = new kw0(10, context, this);
        this.f56102b = kw0Var;
        kw0Var.setOnClickListener(new ii.m(this, 28));
        ci.q qVar = new ci.q(context, 12);
        this.f56103c = qVar;
        qVar.setOrientation(1);
        kw0Var.addView(qVar, mf.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        ci.l1 l1Var = new ci.l1(this, context, 12);
        l1Var.setWillNotDraw(false);
        qVar.addView(l1Var, mf.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        l1Var.addView(frameLayout, mf.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131744643, null));
        textView.setTextColor(-1);
        k2.p1.t(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(bd.M0(2131744644, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        ci.l1 l1Var2 = new ci.l1(this, context, 13);
        this.d = l1Var2;
        l1Var.addView(l1Var2, mf.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f56104e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        l1Var2.addView(imageView, mf.e(-1, -1, 119));
        h2 h2Var = new h2(this, context, org.telegram.messenger.g0.f22607p);
        this.f56105f = h2Var;
        l1Var2.addView(h2Var, mf.e(-2, -2, 17));
        f60 F = f60.F(kw0Var, bVar, kw0Var);
        ca0 ca0Var = new ca0(getContext(), 2131624139, bd.M0(2131744654, null), 2131624138, bd.M0(2131744653, null), bVar);
        this.f56110x = ca0Var;
        ca0Var.setOnClickListener(new View.OnClickListener(this) {
            public final j2 f56022b;

            {
                this.f56022b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j2 j2Var = this.f56022b;
                        g0 g0Var = j2Var.H;
                        boolean z10 = g0Var.f56012f;
                        g0Var.f56012f = !z10;
                        j2Var.f56110x.a(z10, true);
                        j2Var.f56105f.b(i3, j2Var.H, true);
                        return;
                    default:
                        j2 j2Var2 = this.f56022b;
                        g0 g0Var2 = j2Var2.H;
                        boolean z11 = g0Var2.f56011e;
                        g0Var2.f56011e = !z11;
                        j2Var2.f56111y.a(z11, true);
                        j2Var2.f56105f.b(i3, j2Var2.H, true);
                        return;
                }
            }
        });
        F.q(ca0Var);
        ca0 ca0Var2 = new ca0(context, 2131624089, bd.M0(2131748907, null), 2131624086, bd.M0(2131748906, null), bVar);
        this.f56111y = ca0Var2;
        ca0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j2 f56022b;

            {
                this.f56022b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j2 j2Var = this.f56022b;
                        g0 g0Var = j2Var.H;
                        boolean z10 = g0Var.f56012f;
                        g0Var.f56012f = !z10;
                        j2Var.f56110x.a(z10, true);
                        j2Var.f56105f.b(i3, j2Var.H, true);
                        return;
                    default:
                        j2 j2Var2 = this.f56022b;
                        g0 g0Var2 = j2Var2.H;
                        boolean z11 = g0Var2.f56011e;
                        g0Var2.f56011e = !z11;
                        j2Var2.f56111y.a(z11, true);
                        j2Var2.f56105f.b(i3, j2Var2.H, true);
                        return;
                }
            }
        });
        F.q(ca0Var2);
        F.k();
        F.c(2131232357, bd.M0(2131754218, null), new e2(this, 2), false);
        F.c(2131232108, bd.M0(2131751362, null), new e2(this, 3), true);
        qVar.addView(F.A, mf.p(-2, -2, 0.0f, 85));
        kw0Var.setFitsSystemWindows(true);
        kw0Var.setOnApplyWindowInsetsListener(new i2(this));
    }

    public final void b(boolean z10, e2 e2Var) {
        float f10;
        long j10;
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
        ofFloat.addUpdateListener(new f2(this, 0));
        this.F.addListener(new androidx.fragment.app.g(this, z10, e2Var, 15));
        this.F.setInterpolator(xq.h);
        ValueAnimator valueAnimator2 = this.F;
        if (z10) {
            j10 = 420;
        } else {
            j10 = 320;
        }
        valueAnimator2.setDuration(j10);
        this.F.start();
    }

    @Override
    public final void dismiss() {
        if (this.G) {
            return;
        }
        v2 v2Var = this.I;
        if (v2Var != null) {
            v2Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new e2(this, 1));
        this.f56102b.invalidate();
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
        kw0 kw0Var = this.f56102b;
        setContentView(kw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i3;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i3 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        kw0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(kw0Var, !k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.messenger.g0.l2(new j8(this, 26), 14.0f);
        b(true, null);
    }
}
