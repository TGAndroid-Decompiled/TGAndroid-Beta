package zf;

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
import h7.z5;
import lh.c5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fb0;

public final class t2 extends Dialog {
    public ValueAnimator A;
    public boolean B;
    public m0 C;
    public n6 D;

    public final int f50705a;

    public final qg.f f50706b;

    public final hh.m f50707c;
    public final hh.h1 d;

    public final ImageView f50708e;

    public final r2 f50709f;
    public final Rect h;

    public Bitmap f50710n;

    public BitmapShader f50711r;

    public Paint f50712s;
    public Matrix v;

    public final fb0 f50713w;

    public final fb0 f50714x;

    public float f50715y;

    public t2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        jh.b bVar = new jh.b();
        this.h = new Rect();
        this.B = false;
        this.f50705a = i10;
        qg.f fVar = new qg.f(this, context, 3);
        this.f50706b = fVar;
        fVar.setOnClickListener(new c5(this, 27));
        hh.m mVar = new hh.m(context, 10);
        this.f50707c = mVar;
        mVar.setOrientation(1);
        fVar.addView(mVar, z5.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        hh.h1 h1Var = new hh.h1(this, context, 11);
        h1Var.setWillNotDraw(false);
        mVar.addView(h1Var, z5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        h1Var.addView(frameLayout, z5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textViewH = pa.h(frameLayout, textView, z5.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        textViewH.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        textViewH.setTextColor(-8421505);
        textViewH.setTextSize(1, 14.0f);
        frameLayout.addView(textViewH, z5.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        hh.h1 h1Var2 = new hh.h1(this, context, 12);
        this.d = h1Var2;
        h1Var.addView(h1Var2, z5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f50708e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        h1Var2.addView(imageView, z5.e(-1, -1, 119));
        r2 r2Var = new r2(this, context, AndroidUtilities.density);
        this.f50709f = r2Var;
        h1Var2.addView(r2Var, z5.e(-2, -2, 17));
        b70 b70VarF = b70.F(fVar, bVar, fVar);
        fb0 fb0Var = new fb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f50713w = fb0Var;
        final int i11 = 0;
        fb0Var.setOnClickListener(new View.OnClickListener(this) {

            public final t2 f50668b;

            {
                this.f50668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        t2 t2Var = this.f50668b;
                        m0 m0Var = t2Var.C;
                        boolean z10 = m0Var.f50572f;
                        m0Var.f50572f = !z10;
                        t2Var.f50713w.a(z10, true);
                        t2Var.f50709f.b(i10, t2Var.C, true);
                        break;
                    default:
                        t2 t2Var2 = this.f50668b;
                        m0 m0Var2 = t2Var2.C;
                        boolean z11 = m0Var2.f50571e;
                        m0Var2.f50571e = !z11;
                        t2Var2.f50714x.a(z11, true);
                        t2Var2.f50709f.b(i10, t2Var2.C, true);
                        break;
                }
            }
        });
        b70VarF.q(fb0Var);
        fb0 fb0Var2 = new fb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f50714x = fb0Var2;
        final int i12 = 1;
        fb0Var2.setOnClickListener(new View.OnClickListener(this) {

            public final t2 f50668b;

            {
                this.f50668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t2 t2Var = this.f50668b;
                        m0 m0Var = t2Var.C;
                        boolean z10 = m0Var.f50572f;
                        m0Var.f50572f = !z10;
                        t2Var.f50713w.a(z10, true);
                        t2Var.f50709f.b(i10, t2Var.C, true);
                        break;
                    default:
                        t2 t2Var2 = this.f50668b;
                        m0 m0Var2 = t2Var2.C;
                        boolean z11 = m0Var2.f50571e;
                        m0Var2.f50571e = !z11;
                        t2Var2.f50714x.a(z11, true);
                        t2Var2.f50709f.b(i10, t2Var2.C, true);
                        break;
                }
            }
        });
        b70VarF.q(fb0Var2);
        b70VarF.k();
        b70VarF.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new p2(this, 2), false);
        b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new p2(this, 3), true);
        mVar.addView(b70VarF.A, z5.o(-2, -2, 0.0f, 85));
        fVar.setFitsSystemWindows(true);
        fVar.setOnApplyWindowInsetsListener(new s2(this));
    }

    public final void b(boolean z10, p2 p2Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50715y, z10 ? 1.0f : 0.0f);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new lh.m2(this, 27));
        this.A.addListener(new androidx.fragment.app.g(this, z10, p2Var, 13));
        this.A.setInterpolator(er.h);
        this.A.setDuration(z10 ? 420L : 320L);
        this.A.start();
    }

    @Override
    public final void dismiss() {
        if (this.B) {
            return;
        }
        n6 n6Var = this.D;
        if (n6Var != null) {
            n6Var.run(this.C);
            this.D = null;
        }
        this.B = true;
        b(false, new p2(this, 1));
        this.f50706b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.B;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        qg.f fVar = this.f50706b;
        setContentView(fVar, layoutParams);
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
        fVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(fVar, !g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new n6(this, 25), 14.0f);
            b(true, null);
        }
    }
}
