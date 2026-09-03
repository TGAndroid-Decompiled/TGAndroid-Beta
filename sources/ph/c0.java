package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ai;
public abstract class c0 extends FrameLayout {
    public final k5 f41345a;
    public final org.telegram.ui.Components.z5 f41346b;
    public final org.telegram.ui.Components.z5 f41347c;
    public final b0 d;
    public final FrameLayout e;
    public final a0 f41348f;
    public final yf.e h;
    public final FrameLayout f41349n;
    public float f41350r;
    public final int[] f41351s;
    public final int[] v;
    public final yf.f f41352w;
    public t6 f41353x;
    public boolean f41354y;

    public c0(Context context, k5 k5Var) {
        super(context);
        this.f41350r = 0.0f;
        this.f41351s = new int[2];
        this.v = new int[2];
        this.f41352w = new Object();
        this.f41345a = k5Var;
        b0 b0Var = new b0(this, context);
        this.d = b0Var;
        mr mrVar = mr.h;
        this.f41346b = new org.telegram.ui.Components.z5(b0Var, 0L, 320L, mrVar);
        this.f41347c = new org.telegram.ui.Components.z5(this, 0L, 360L, mrVar);
        a0 a0Var = new a0(this, context, 0);
        this.f41348f = a0Var;
        a0Var.setListener(new o2.i(this, 10));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        yf.e eVar = new yf.e(context);
        this.h = eVar;
        eVar.setListener(new we0(1, this));
        frameLayout.addView(eVar, k7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41349n = frameLayout2;
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ai.o(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.b6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final c0 f42679b;

            {
                this.f42679b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42679b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42679b;
                        c0Var.f41348f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42679b;
                        t6 t6Var = c0Var2.f41353x;
                        if (t6Var != null) {
                            t6Var.m0 = new MediaController.CropState();
                            c0Var2.f41348f.b(c0Var2.f41353x.m0);
                            t6 t6Var2 = c0Var2.f41353x;
                            t6Var2.m0.orientation = t6Var2.Q;
                        }
                        ((n9) c0Var2).B.l0(-1, false, true);
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
            public final c0 f42679b;

            {
                this.f42679b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42679b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42679b;
                        c0Var.f41348f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42679b;
                        t6 t6Var = c0Var2.f41353x;
                        if (t6Var != null) {
                            t6Var.m0 = new MediaController.CropState();
                            c0Var2.f41348f.b(c0Var2.f41353x.m0);
                            t6 t6Var2 = c0Var2.f41353x;
                            t6Var2.m0.orientation = t6Var2.Q;
                        }
                        ((n9) c0Var2).B.l0(-1, false, true);
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
            public final c0 f42679b;

            {
                this.f42679b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42679b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42679b;
                        c0Var.f41348f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42679b;
                        t6 t6Var = c0Var2.f41353x;
                        if (t6Var != null) {
                            t6Var.m0 = new MediaController.CropState();
                            c0Var2.f41348f.b(c0Var2.f41353x.m0);
                            t6 t6Var2 = c0Var2.f41353x;
                            t6Var2.m0.orientation = t6Var2.Q;
                        }
                        ((n9) c0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        t6 t6Var = this.f41353x;
        if (t6Var == null) {
            return 1;
        }
        int i10 = t6Var.Q;
        k5 k5Var = this.f41345a;
        if (i10 != 90 && i10 != 270) {
            return k5Var.getContentHeight();
        }
        return k5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        t6 t6Var = this.f41353x;
        if (t6Var == null) {
            return 1;
        }
        int i10 = t6Var.Q;
        k5 k5Var = this.f41345a;
        if (i10 != 90 && i10 != 270) {
            return k5Var.getContentWidth();
        }
        return k5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f41350r;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f41348f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f41350r - f10) < 0.001f) {
            return;
        }
        this.f41350r = f10;
        b0 b0Var = this.d;
        b0Var.setAlpha(f10);
        b0Var.invalidate();
        a0 a0Var = this.f41348f;
        CropAreaView cropAreaView = a0Var.f47310a;
        CropAreaView cropAreaView2 = a0Var.f47310a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f41345a.invalidate();
    }

    public void setEntry(t6 t6Var) {
        boolean z4;
        if (t6Var == null) {
            return;
        }
        this.f41353x = t6Var;
        this.f41354y = false;
        a0 a0Var = this.f41348f;
        a0Var.G = true;
        getLocationOnScreen(this.f41351s);
        int[] iArr = this.v;
        k5 k5Var = this.f41345a;
        k5Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = t6Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = t6Var.Q;
        yf.f fVar = this.f41352w;
        a0Var.p(i10, fVar, cropState);
        float rotation = a0Var.getRotation();
        yf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.f41346b;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z4 = true;
            } else {
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
        this.f41347c.d(fVar.f47278i, true);
        b0 b0Var = this.d;
        b0Var.setVisibility(0);
        b0Var.invalidate();
        k5Var.setCropEditorDrawing(this);
    }
}
