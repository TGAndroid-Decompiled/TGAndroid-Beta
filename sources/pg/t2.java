package pg;

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
import bi.ld;
import bi.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.zd;
import w7.a6;
public final class t2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.b H;
    public final int f40302a;
    public final ld f40303b;
    public final zd f40304c;
    public final w7 d;
    public final ImageView e;
    public final r2 f40305f;
    public final Rect h;
    public Bitmap f40306n;
    public BitmapShader f40307r;
    public Paint f40308s;
    public Matrix v;
    public final dc0 f40309w;
    public final dc0 f40310x;
    public float f40311y;

    public t2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        zh.b bVar = new zh.b();
        this.h = new Rect();
        this.F = false;
        this.f40302a = i10;
        ld ldVar = new ld(this, context, 24);
        this.f40303b = ldVar;
        ldVar.setOnClickListener(new org.telegram.ui.web.c(this, 2));
        zd zdVar = new zd(context, 8);
        this.f40304c = zdVar;
        zdVar.setOrientation(1);
        ldVar.addView(zdVar, a6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        w7 w7Var = new w7(this, context, 8);
        w7Var.setWillNotDraw(false);
        zdVar.addView(w7Var, a6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        w7Var.addView(frameLayout, a6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView f7 = r6.f(frameLayout, textView, a6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        f7.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        f7.setTextColor(-8421505);
        f7.setTextSize(1, 14.0f);
        frameLayout.addView(f7, a6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        w7 w7Var2 = new w7(this, context, 9);
        this.d = w7Var2;
        w7Var.addView(w7Var2, a6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        w7Var2.addView(imageView, a6.e(-1, -1, 119));
        r2 r2Var = new r2(this, context, AndroidUtilities.density);
        this.f40305f = r2Var;
        w7Var2.addView(r2Var, a6.e(-2, -2, 17));
        w70 F = w70.F(ldVar, bVar, ldVar);
        dc0 dc0Var = new dc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f40309w = dc0Var;
        dc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f40264b;

            {
                this.f40264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f40264b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f40170f;
                        n0Var.f40170f = !z10;
                        t2Var.f40309w.a(z10, true);
                        t2Var.f40305f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f40264b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        t2Var2.f40310x.a(z11, true);
                        t2Var2.f40305f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(dc0Var);
        dc0 dc0Var2 = new dc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f40310x = dc0Var2;
        dc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f40264b;

            {
                this.f40264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f40264b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f40170f;
                        n0Var.f40170f = !z10;
                        t2Var.f40309w.a(z10, true);
                        t2Var.f40305f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f40264b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        t2Var2.f40310x.a(z11, true);
                        t2Var2.f40305f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(dc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new p2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new p2(this, 3), true);
        zdVar.addView(F.A, a6.o(-2, -2, 0.0f, 85));
        ldVar.setFitsSystemWindows(true);
        ldVar.setOnApplyWindowInsetsListener(new s2(this));
    }

    public final void b(boolean z10, p2 p2Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f40311y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 29));
        this.E.addListener(new androidx.fragment.app.g(this, z10, p2Var, 12));
        this.E.setInterpolator(wr.h);
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
        ai.b bVar = this.H;
        if (bVar != null) {
            bVar.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new p2(this, 1));
        this.f40303b.invalidate();
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
        ld ldVar = this.f40303b;
        setContentView(ldVar, layoutParams);
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
        ldVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ldVar, !j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.y1(this, 2), 14.0f);
        b(true, null);
    }
}
