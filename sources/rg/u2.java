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
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.zr;
import w7.z5;
public final class u2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.r0 H;
    public final int f46083a;
    public final y1 f46084b;
    public final ai.r f46085c;
    public final ai.w1 d;
    public final ImageView e;
    public final s2 f46086f;
    public final Rect h;
    public Bitmap f46087n;
    public BitmapShader f46088r;
    public Paint f46089s;
    public Matrix v;
    public final oc0 f46090w;
    public final oc0 f46091x;
    public float f46092y;

    public u2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        ci.b bVar = new ci.b();
        this.h = new Rect();
        this.F = false;
        this.f46083a = i10;
        y1 y1Var = new y1(this, context, 2);
        this.f46084b = y1Var;
        y1Var.setOnClickListener(new hg.r0(this, 18));
        ai.r rVar = new ai.r(context, 11);
        this.f46085c = rVar;
        rVar.setOrientation(1);
        y1Var.addView(rVar, z5.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        ai.w1 w1Var = new ai.w1(this, context, 11);
        w1Var.setWillNotDraw(false);
        rVar.addView(w1Var, z5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        w1Var.addView(frameLayout, z5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, z5.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        j10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        j10.setTextColor(-8421505);
        j10.setTextSize(1, 14.0f);
        frameLayout.addView(j10, z5.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        ai.w1 w1Var2 = new ai.w1(this, context, 12);
        this.d = w1Var2;
        w1Var.addView(w1Var2, z5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        w1Var2.addView(imageView, z5.e(-1, -1, 119));
        s2 s2Var = new s2(this, context, AndroidUtilities.density);
        this.f46086f = s2Var;
        w1Var2.addView(s2Var, z5.e(-2, -2, 17));
        h80 F = h80.F(y1Var, bVar, y1Var);
        oc0 oc0Var = new oc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f46090w = oc0Var;
        oc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final u2 f46050b;

            {
                this.f46050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u2 u2Var = this.f46050b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f45947f;
                        n0Var.f45947f = !z10;
                        u2Var.f46090w.a(z10, true);
                        u2Var.f46086f.b(i10, u2Var.G, true);
                        return;
                    default:
                        u2 u2Var2 = this.f46050b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        u2Var2.f46091x.a(z11, true);
                        u2Var2.f46086f.b(i10, u2Var2.G, true);
                        return;
                }
            }
        });
        F.q(oc0Var);
        oc0 oc0Var2 = new oc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f46091x = oc0Var2;
        oc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u2 f46050b;

            {
                this.f46050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u2 u2Var = this.f46050b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f45947f;
                        n0Var.f45947f = !z10;
                        u2Var.f46090w.a(z10, true);
                        u2Var.f46086f.b(i10, u2Var.G, true);
                        return;
                    default:
                        u2 u2Var2 = this.f46050b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        u2Var2.f46091x.a(z11, true);
                        u2Var2.f46086f.b(i10, u2Var2.G, true);
                        return;
                }
            }
        });
        F.q(oc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new q2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new q2(this, 3), true);
        rVar.addView(F.A, z5.o(-2, -2, 0.0f, 85));
        y1Var.setFitsSystemWindows(true);
        y1Var.setOnApplyWindowInsetsListener(new t2(this));
    }

    public final void b(boolean z10, q2 q2Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f46092y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 21));
        this.E.addListener(new ah.q0(this, z10, q2Var, 13));
        this.E.setInterpolator(zr.h);
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
        ai.r0 r0Var = this.H;
        if (r0Var != null) {
            r0Var.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new q2(this, 1));
        this.f46084b.invalidate();
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
        y1 y1Var = this.f46084b;
        setContentView(y1Var, layoutParams);
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
        y1Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(y1Var, !k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new ig.k0(this, 15), 14.0f);
        b(true, null);
    }
}
