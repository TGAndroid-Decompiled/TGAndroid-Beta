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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.yh;
public abstract class c0 extends FrameLayout {
    public final l5 f41305a;
    public final org.telegram.ui.Components.z5 f41306b;
    public final org.telegram.ui.Components.z5 f41307c;
    public final b0 d;
    public final FrameLayout e;
    public final a0 f41308f;
    public final yf.e h;
    public final FrameLayout f41309n;
    public float f41310r;
    public final int[] f41311s;
    public final int[] v;
    public final yf.f f41312w;
    public u6 f41313x;
    public boolean f41314y;

    public c0(Context context, l5 l5Var) {
        super(context);
        this.f41310r = 0.0f;
        this.f41311s = new int[2];
        this.v = new int[2];
        this.f41312w = new Object();
        this.f41305a = l5Var;
        b0 b0Var = new b0(this, context);
        this.d = b0Var;
        nr nrVar = nr.h;
        this.f41306b = new org.telegram.ui.Components.z5(b0Var, 0L, 320L, nrVar);
        this.f41307c = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        a0 a0Var = new a0(this, context, 0);
        this.f41308f = a0Var;
        a0Var.setListener(new ja.c(this, 29));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        yf.e eVar = new yf.e(context);
        this.h = eVar;
        eVar.setListener(new ve0(1, this));
        frameLayout.addView(eVar, k7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41309n = frameLayout2;
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yh.p(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.b6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final c0 f42639b;

            {
                this.f42639b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42639b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42639b;
                        c0Var.f41308f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42639b;
                        u6 u6Var = c0Var2.f41313x;
                        if (u6Var != null) {
                            u6Var.m0 = new MediaController.CropState();
                            c0Var2.f41308f.b(c0Var2.f41313x.m0);
                            u6 u6Var2 = c0Var2.f41313x;
                            u6Var2.m0.orientation = u6Var2.Q;
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
            public final c0 f42639b;

            {
                this.f42639b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42639b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42639b;
                        c0Var.f41308f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42639b;
                        u6 u6Var = c0Var2.f41313x;
                        if (u6Var != null) {
                            u6Var.m0 = new MediaController.CropState();
                            c0Var2.f41308f.b(c0Var2.f41313x.m0);
                            u6 u6Var2 = c0Var2.f41313x;
                            u6Var2.m0.orientation = u6Var2.Q;
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
            public final c0 f42639b;

            {
                this.f42639b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((n9) this.f42639b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f42639b;
                        c0Var.f41308f.l(true);
                        yf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f42639b;
                        u6 u6Var = c0Var2.f41313x;
                        if (u6Var != null) {
                            u6Var.m0 = new MediaController.CropState();
                            c0Var2.f41308f.b(c0Var2.f41313x.m0);
                            u6 u6Var2 = c0Var2.f41313x;
                            u6Var2.m0.orientation = u6Var2.Q;
                        }
                        ((n9) c0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        u6 u6Var = this.f41313x;
        if (u6Var == null) {
            return 1;
        }
        int i10 = u6Var.Q;
        l5 l5Var = this.f41305a;
        if (i10 != 90 && i10 != 270) {
            return l5Var.getContentHeight();
        }
        return l5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        u6 u6Var = this.f41313x;
        if (u6Var == null) {
            return 1;
        }
        int i10 = u6Var.Q;
        l5 l5Var = this.f41305a;
        if (i10 != 90 && i10 != 270) {
            return l5Var.getContentWidth();
        }
        return l5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f41310r;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f41308f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f41310r - f10) < 0.001f) {
            return;
        }
        this.f41310r = f10;
        b0 b0Var = this.d;
        b0Var.setAlpha(f10);
        b0Var.invalidate();
        a0 a0Var = this.f41308f;
        CropAreaView cropAreaView = a0Var.f47246a;
        CropAreaView cropAreaView2 = a0Var.f47246a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f41305a.invalidate();
    }

    public void setEntry(u6 u6Var) {
        boolean z4;
        if (u6Var == null) {
            return;
        }
        this.f41313x = u6Var;
        this.f41314y = false;
        a0 a0Var = this.f41308f;
        a0Var.G = true;
        getLocationOnScreen(this.f41311s);
        int[] iArr = this.v;
        l5 l5Var = this.f41305a;
        l5Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = u6Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = u6Var.Q;
        yf.f fVar = this.f41312w;
        a0Var.p(i10, fVar, cropState);
        float rotation = a0Var.getRotation();
        yf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.f41306b;
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
        this.f41307c.d(fVar.f47214i, true);
        b0 b0Var = this.d;
        b0Var.setVisibility(0);
        b0Var.invalidate();
        l5Var.setCropEditorDrawing(this);
    }
}
