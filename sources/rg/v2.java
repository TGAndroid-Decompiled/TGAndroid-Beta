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
import bi.i7;
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.ee;
import w7.z5;
public final class v2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public p0 G;
    public bi.o1 H;
    public final int f44340a;
    public final ah.x f44341b;
    public final ee f44342c;
    public final i7 d;
    public final ImageView e;
    public final t2 f44343f;
    public final Rect h;
    public Bitmap f44344n;
    public BitmapShader f44345r;
    public Paint f44346s;
    public Matrix v;
    public final uc0 f44347w;
    public final uc0 f44348x;
    public float f44349y;

    public v2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        bi.b bVar = new bi.b();
        this.h = new Rect();
        this.F = false;
        this.f44340a = i10;
        ah.x xVar = new ah.x(this, context, 29);
        this.f44341b = xVar;
        xVar.setOnClickListener(new o4(this, 8));
        ee eeVar = new ee(context, 8);
        this.f44342c = eeVar;
        eeVar.setOrientation(1);
        xVar.addView(eeVar, z5.a(-2.0f, 8.0f, 8.0f, 8.0f, 8.0f, -2, 17));
        i7 i7Var = new i7(this, context, 10);
        i7Var.setWillNotDraw(false);
        eeVar.addView(i7Var, z5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        i7Var.addView(frameLayout, z5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, z5.a(-2.0f, 18.0f, 8.33f, 18.0f, 0.0f, -1, 55), context);
        g10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        g10.setTextColor(-8421505);
        g10.setTextSize(1, 14.0f);
        frameLayout.addView(g10, z5.a(-2.0f, 18.0f, 31.0f, 18.0f, 0.0f, -1, 55));
        i7 i7Var2 = new i7(this, context, 11);
        this.d = i7Var2;
        i7Var.addView(i7Var2, z5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        i7Var2.addView(imageView, z5.e(-1, -1, 119));
        t2 t2Var = new t2(this, context, AndroidUtilities.density);
        this.f44343f = t2Var;
        i7Var2.addView(t2Var, z5.e(-2, -2, 17));
        l80 F = l80.F(xVar, bVar, xVar);
        uc0 uc0Var = new uc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f44347w = uc0Var;
        uc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f44302b;

            {
                this.f44302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f44302b;
                        p0 p0Var = v2Var.G;
                        boolean z10 = p0Var.f44207f;
                        p0Var.f44207f = !z10;
                        v2Var.f44347w.a(z10, true);
                        v2Var.f44343f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f44302b;
                        p0 p0Var2 = v2Var2.G;
                        boolean z11 = p0Var2.e;
                        p0Var2.e = !z11;
                        v2Var2.f44348x.a(z11, true);
                        v2Var2.f44343f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(uc0Var);
        uc0 uc0Var2 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f44348x = uc0Var2;
        uc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f44302b;

            {
                this.f44302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f44302b;
                        p0 p0Var = v2Var.G;
                        boolean z10 = p0Var.f44207f;
                        p0Var.f44207f = !z10;
                        v2Var.f44347w.a(z10, true);
                        v2Var.f44343f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f44302b;
                        p0 p0Var2 = v2Var2.G;
                        boolean z11 = p0Var2.e;
                        p0Var2.e = !z11;
                        v2Var2.f44348x.a(z11, true);
                        v2Var2.f44343f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(uc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new r2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new r2(this, 3), true);
        eeVar.addView(F.A, z5.o(-2, -2, 0.0f, 85));
        xVar.setFitsSystemWindows(true);
        xVar.setOnApplyWindowInsetsListener(new u2(this));
    }

    public final void b(boolean z10, r2 r2Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f44349y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 14));
        this.E.addListener(new ah.q0(this, z10, r2Var, 13));
        this.E.setInterpolator(es.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z10) {
            j10 = 420;
        } else {
            j10 = 320;
        }
        valueAnimator2.setDuration(j10);
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
        this.f44341b.invalidate();
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
        ah.x xVar = this.f44341b;
        setContentView(xVar, layoutParams);
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
        xVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(xVar, !g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new ji.p1(this, 9), 14.0f);
        b(true, null);
    }
}
