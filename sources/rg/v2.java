package rg;

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
import bi.e7;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.yd;
import w7.x5;
public final class v2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public p0 G;
    public bi.o1 H;
    public final int f45552a;
    public final ah.y f45553b;
    public final yd f45554c;
    public final e7 d;
    public final ImageView f45555e;
    public final t2 f45556f;
    public final Rect h;
    public Bitmap f45557n;
    public BitmapShader f45558r;
    public Paint f45559s;
    public Matrix v;
    public final vb0 f45560w;
    public final vb0 f45561x;
    public float f45562y;

    public v2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        bi.b bVar = new bi.b();
        this.h = new Rect();
        this.F = false;
        this.f45552a = i10;
        ah.y yVar = new ah.y(this, context, 27);
        this.f45553b = yVar;
        yVar.setOnClickListener(new m4(this, 8));
        yd ydVar = new yd(context, 8);
        this.f45554c = ydVar;
        ydVar.setOrientation(1);
        yVar.addView(ydVar, x5.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        e7 e7Var = new e7(this, context, 9);
        e7Var.setWillNotDraw(false);
        ydVar.addView(e7Var, x5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        e7Var.addView(frameLayout, x5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView f7 = p6.f(frameLayout, textView, x5.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        f7.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        f7.setTextColor(-8421505);
        f7.setTextSize(1, 14.0f);
        frameLayout.addView(f7, x5.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        e7 e7Var2 = new e7(this, context, 10);
        this.d = e7Var2;
        e7Var.addView(e7Var2, x5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45555e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        e7Var2.addView(imageView, x5.e(-1, -1, 119));
        t2 t2Var = new t2(this, context, AndroidUtilities.density);
        this.f45556f = t2Var;
        e7Var2.addView(t2Var, x5.e(-2, -2, 17));
        n70 F = n70.F(yVar, bVar, yVar);
        vb0 vb0Var = new vb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f45560w = vb0Var;
        vb0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f45511b;

            {
                this.f45511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f45511b;
                        p0 p0Var = v2Var.G;
                        boolean z10 = p0Var.f45439f;
                        p0Var.f45439f = !z10;
                        v2Var.f45560w.a(z10, true);
                        v2Var.f45556f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f45511b;
                        p0 p0Var2 = v2Var2.G;
                        boolean z11 = p0Var2.f45438e;
                        p0Var2.f45438e = !z11;
                        v2Var2.f45561x.a(z11, true);
                        v2Var2.f45556f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(vb0Var);
        vb0 vb0Var2 = new vb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f45561x = vb0Var2;
        vb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f45511b;

            {
                this.f45511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f45511b;
                        p0 p0Var = v2Var.G;
                        boolean z10 = p0Var.f45439f;
                        p0Var.f45439f = !z10;
                        v2Var.f45560w.a(z10, true);
                        v2Var.f45556f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f45511b;
                        p0 p0Var2 = v2Var2.G;
                        boolean z11 = p0Var2.f45438e;
                        p0Var2.f45438e = !z11;
                        v2Var2.f45561x.a(z11, true);
                        v2Var2.f45556f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(vb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new r2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new r2(this, 3), true);
        ydVar.addView(F.A, x5.o(-2, -2, 0.0f, 85));
        yVar.setFitsSystemWindows(true);
        yVar.setOnApplyWindowInsetsListener(new u2(this));
    }

    public final void b(boolean z10, r2 r2Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f45562y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 15));
        this.E.addListener(new ah.r0(this, z10, r2Var, 13));
        this.E.setInterpolator(pr.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z10) {
            j3 = 420;
        } else {
            j3 = 320;
        }
        valueAnimator2.setDuration(j3);
        this.E.start();
    }

    @Override
    public final void dismiss() {
        if (this.F) {
            return;
        }
        bi.o1 o1Var = this.H;
        if (o1Var != null) {
            o1Var.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new r2(this, 1));
        this.f45553b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.F;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ah.y yVar = this.f45553b;
        setContentView(yVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        yVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(yVar, !j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.b1(this, 6), 14.0f);
        b(true, null);
    }
}
