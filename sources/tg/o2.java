package tg;

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
import c8.na;
import hi.c7;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x60;
public final class o2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public m0 H;
    public c7 I;
    public final int f58152a;
    public final w01 f58153b;
    public final ai.l2 f58154c;
    public final di.d1 d;
    public final ImageView f58155e;
    public final m2 f58156f;
    public final Rect h;
    public Bitmap f58157n;
    public BitmapShader f58158r;
    public Paint f58159s;
    public Matrix f58160w;
    public final sa0 f58161x;
    public final sa0 f58162y;

    public o2(Context context, final int i7) {
        super(context, 2131755352);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        this.G = false;
        this.f58152a = i7;
        w01 w01Var = new w01(9, context, this);
        this.f58153b = w01Var;
        w01Var.setOnClickListener(new a0(this, 1));
        ai.l2 l2Var = new ai.l2(context, 11);
        this.f58154c = l2Var;
        l2Var.setOrientation(1);
        w01Var.addView(l2Var, na.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        l2Var.addView(d1Var, na.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, na.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744389, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, na.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(gd.N0(2131744390, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, na.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.d1 d1Var2 = new di.d1(this, context, 13);
        this.d = d1Var2;
        d1Var.addView(d1Var2, na.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f58155e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d1Var2.addView(imageView, na.e(-1, -1, 119));
        m2 m2Var = new m2(this, context, org.telegram.messenger.g0.f24225p);
        this.f58156f = m2Var;
        d1Var2.addView(m2Var, na.e(-2, -2, 17));
        x60 G = x60.G(w01Var, bVar, w01Var);
        sa0 sa0Var = new sa0(getContext(), 2131624140, gd.N0(2131744400, null), 2131624139, gd.N0(2131744399, null), bVar);
        this.f58161x = sa0Var;
        sa0Var.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f58064b;

            {
                this.f58064b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o2 o2Var = this.f58064b;
                        m0 m0Var = o2Var.H;
                        boolean z10 = m0Var.f58076f;
                        m0Var.f58076f = !z10;
                        o2Var.f58161x.a(z10, true);
                        o2Var.f58156f.b(i7, o2Var.H, true);
                        return;
                    default:
                        o2 o2Var2 = this.f58064b;
                        m0 m0Var2 = o2Var2.H;
                        boolean z11 = m0Var2.f58075e;
                        m0Var2.f58075e = !z11;
                        o2Var2.f58162y.a(z11, true);
                        o2Var2.f58156f.b(i7, o2Var2.H, true);
                        return;
                }
            }
        });
        G.q(sa0Var);
        sa0 sa0Var2 = new sa0(context, 2131624090, gd.N0(2131748706, null), 2131624087, gd.N0(2131748705, null), bVar);
        this.f58162y = sa0Var2;
        sa0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f58064b;

            {
                this.f58064b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o2 o2Var = this.f58064b;
                        m0 m0Var = o2Var.H;
                        boolean z10 = m0Var.f58076f;
                        m0Var.f58076f = !z10;
                        o2Var.f58161x.a(z10, true);
                        o2Var.f58156f.b(i7, o2Var.H, true);
                        return;
                    default:
                        o2 o2Var2 = this.f58064b;
                        m0 m0Var2 = o2Var2.H;
                        boolean z11 = m0Var2.f58075e;
                        m0Var2.f58075e = !z11;
                        o2Var2.f58162y.a(z11, true);
                        o2Var2.f58156f.b(i7, o2Var2.H, true);
                        return;
                }
            }
        });
        G.q(sa0Var2);
        G.k();
        G.c(2131232362, gd.N0(2131754215, null), new k2(this, 2), false);
        G.c(2131232113, gd.N0(2131751349, null), new k2(this, 3), true);
        l2Var.addView(G.A, na.p(-2, -2, 0.0f, 85));
        w01Var.setFitsSystemWindows(true);
        w01Var.setOnApplyWindowInsetsListener(new n2(this));
    }

    public final void b(boolean z10, k2 k2Var) {
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
        ofFloat.addUpdateListener(new c2(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, k2Var, 15));
        this.F.setInterpolator(kr.h);
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
        c7 c7Var = this.I;
        if (c7Var != null) {
            c7Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new k2(this, 1));
        this.f58153b.invalidate();
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
        w01 w01Var = this.f58153b;
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
        org.telegram.messenger.g0.l2(new c7(this, 29), 14.0f);
        b(true, null);
    }
}
