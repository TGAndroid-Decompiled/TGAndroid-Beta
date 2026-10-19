package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class qu0 extends FrameLayout {
    public float f40972a;
    public boolean f40973b;
    public boolean f40974c;
    public boolean d;
    public int e;
    public int f40975f;
    public int h;
    public final o1.j f40976n;
    public final o1.k f40977r;
    public final PhotoViewer f40978s;

    public qu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40978s = photoViewer;
        this.f40972a = 1.0f;
        this.f40974c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f40976n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17561u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new yc0(this, 3));
        this.f40977r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f40978s;
        photoViewer.f33362o3.setAlpha(f7);
        photoViewer.f33371p3.setAlpha(f7);
        if (this.f40973b) {
            org.telegram.ui.ActionBar.j5 j5Var = photoViewer.f33362o3;
            j5Var.setPivotX(j5Var.getWidth());
            org.telegram.ui.ActionBar.j5 j5Var2 = photoViewer.f33362o3;
            j5Var2.setPivotY(j5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33362o3.setScaleX(f11);
            photoViewer.f33362o3.setScaleY(f11);
            org.telegram.ui.Components.d81 d81Var = photoViewer.f33379q3;
            if (d81Var.f25485y != f10) {
                d81Var.f25485y = f10;
                d81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f40974c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f33388r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f40972a != f7) {
            this.f40972a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f40973b != z10) {
            this.f40973b = z10;
            PhotoViewer photoViewer = this.f40978s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33388r3.setAlpha(1.0f);
            } else {
                photoViewer.f33362o3.setScaleX(1.0f);
                photoViewer.f33362o3.setScaleY(1.0f);
                org.telegram.ui.Components.d81 d81Var = photoViewer.f33379q3;
                if (d81Var.f25485y != 0.0f) {
                    d81Var.f25485y = 0.0f;
                    d81Var.v.invalidate();
                }
            }
            a(this.f40972a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40976n.f17560a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f40978s;
        org.telegram.ui.Components.b81 b81Var = photoViewer.F2;
        if (b81Var != null) {
            f7 = ((float) b81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33379q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f40978s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33362o3.getLayoutParams();
        if (this.e > this.f40975f) {
            if (photoViewer.f33371p3.getVisibility() != 0) {
                photoViewer.f33371p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33371p3.getVisibility() != 4) {
                photoViewer.f33371p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.b81 b81Var = photoViewer.F2;
        long j10 = 0;
        if (b81Var != null) {
            long p5 = b81Var.p();
            if (p5 != -9223372036854775807L) {
                j10 = p5;
            }
        } else {
            ot0 ot0Var = photoViewer.f33281f0;
            if (ot0Var != null && ot0Var.f27851x) {
                j10 = ot0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f33362o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f40977r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f40976n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f17560a != f7) {
                kVar.f17561u.f17567i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.d81 d81Var = photoViewer.f33379q3;
        int measuredHeight = getMeasuredHeight();
        d81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        d81Var.f25470i = measuredHeight;
        View view = d81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f17560a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40972a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f40978s;
        if (photoViewer.f33379q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33388r3.invalidate();
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
