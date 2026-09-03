package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ai;
public abstract class f0 extends FrameLayout {
    public boolean B;
    public final k5 f41633a;
    public dg.v2 f41634b;
    public final org.telegram.ui.Components.z5 f41635c;
    public final org.telegram.ui.Components.z5 d;
    public final e0 e;
    public final FrameLayout f41636f;
    public final a0 h;
    public final yf.e f41637n;
    public final FrameLayout f41638r;
    public float f41639s;
    public final int[] v;
    public final int[] f41640w;
    public final int[] f41641x;
    public final yf.f f41642y;

    public f0(Context context, k5 k5Var) {
        super(context);
        this.f41639s = 0.0f;
        this.v = new int[2];
        this.f41640w = new int[2];
        this.f41641x = new int[2];
        this.f41642y = new Object();
        this.f41633a = k5Var;
        e0 e0Var = new e0(this, context);
        this.e = e0Var;
        mr mrVar = mr.h;
        this.f41635c = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, mrVar);
        this.d = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, mrVar);
        a0 a0Var = new a0(this, context, 1);
        this.h = a0Var;
        a0Var.setListener(new tp0(this, 5));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41636f = frameLayout;
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        yf.e eVar = new yf.e(context);
        this.f41637n = eVar;
        eVar.setListener(new we0(2, this));
        frameLayout.addView(eVar, k7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41638r = frameLayout2;
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ai.o(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.b6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f41466b;

            {
                this.f41466b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((o9) this.f41466b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f41466b;
                        f0Var.h.l(true);
                        yf.e eVar2 = f0Var.f41637n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f41466b;
                        dg.v2 v2Var = f0Var2.f41634b;
                        if (v2Var != null) {
                            v2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f41634b.D0);
                            dg.v2 v2Var2 = f0Var2.f41634b;
                            v2Var2.D0.orientation = v2Var2.getOrientation();
                            f0Var2.f41634b.k();
                            f0Var2.f41634b.requestLayout();
                            f0Var2.f41634b.f4832w0.requestLayout();
                            f0Var2.f41634b.f4832w0.invalidate();
                            f0Var2.f41634b.f4832w0.post(new org.telegram.ui.web.q0(f0Var2, 10));
                        }
                        ((o9) f0Var2).C.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, k7.b6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f41466b;

            {
                this.f41466b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((o9) this.f41466b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f41466b;
                        f0Var.h.l(true);
                        yf.e eVar2 = f0Var.f41637n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f41466b;
                        dg.v2 v2Var = f0Var2.f41634b;
                        if (v2Var != null) {
                            v2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f41634b.D0);
                            dg.v2 v2Var2 = f0Var2.f41634b;
                            v2Var2.D0.orientation = v2Var2.getOrientation();
                            f0Var2.f41634b.k();
                            f0Var2.f41634b.requestLayout();
                            f0Var2.f41634b.f4832w0.requestLayout();
                            f0Var2.f41634b.f4832w0.invalidate();
                            f0Var2.f41634b.f4832w0.post(new org.telegram.ui.web.q0(f0Var2, 10));
                        }
                        ((o9) f0Var2).C.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.b.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, k7.b6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f41466b;

            {
                this.f41466b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((o9) this.f41466b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f41466b;
                        f0Var.h.l(true);
                        yf.e eVar2 = f0Var.f41637n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f41466b;
                        dg.v2 v2Var = f0Var2.f41634b;
                        if (v2Var != null) {
                            v2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f41634b.D0);
                            dg.v2 v2Var2 = f0Var2.f41634b;
                            v2Var2.D0.orientation = v2Var2.getOrientation();
                            f0Var2.f41634b.k();
                            f0Var2.f41634b.requestLayout();
                            f0Var2.f41634b.f4832w0.requestLayout();
                            f0Var2.f41634b.f4832w0.invalidate();
                            f0Var2.f41634b.f4832w0.post(new org.telegram.ui.web.q0(f0Var2, 10));
                        }
                        ((o9) f0Var2).C.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        dg.v2 v2Var = this.f41634b;
        if (v2Var == null) {
            return 1;
        }
        if (v2Var.getOrientation() != 90 && this.f41634b.getOrientation() != 270) {
            return this.f41634b.getContentHeight();
        }
        return this.f41634b.getContentWidth();
    }

    public int getCurrentWidth() {
        dg.v2 v2Var = this.f41634b;
        if (v2Var == null) {
            return 1;
        }
        if (v2Var.getOrientation() != 90 && this.f41634b.getOrientation() != 270) {
            return this.f41634b.getContentWidth();
        }
        return this.f41634b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f41639s;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        a0 a0Var = this.h;
        a0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        a0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f41636f.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void set(dg.v2 v2Var) {
        if (v2Var == null) {
            return;
        }
        this.f41634b = v2Var;
        setVisibility(0);
        this.B = false;
        a0 a0Var = this.h;
        boolean z4 = true;
        a0Var.G = true;
        getLocationOnScreen(this.v);
        this.f41633a.getLocationOnScreen(this.f41640w);
        v2Var.getLocationOnScreen(this.f41641x);
        MediaController.CropState cropState = v2Var.D0;
        if (cropState == null) {
            cropState = null;
        }
        a0Var.p(v2Var.getOrientation(), this.f41642y, cropState);
        float rotation = a0Var.getRotation();
        yf.e eVar = this.f41637n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.f41635c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z4 = false;
            }
            eVar.setRotated(z4);
            eVar.setMirrored(cropState.mirrored);
            z5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            z5Var.getClass();
            z5Var.d(0.0f, false);
        }
        a0Var.r(false);
        e0 e0Var = this.e;
        e0Var.setVisibility(0);
        e0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f41639s - f10) < 0.001f) {
            return;
        }
        this.f41639s = f10;
        this.e.invalidate();
        a0 a0Var = this.h;
        CropAreaView cropAreaView = a0Var.f47310a;
        CropAreaView cropAreaView2 = a0Var.f47310a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
