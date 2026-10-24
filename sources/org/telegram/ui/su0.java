package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class su0 extends FrameLayout {
    public float f41804a;
    public boolean f41805b;
    public boolean f41806c;
    public boolean d;
    public int e;
    public int f41807f;
    public int h;
    public final o1.j f41808n;
    public final o1.k f41809r;
    public final PhotoViewer f41810s;

    public su0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f41810s = photoViewer;
        this.f41804a = 1.0f;
        this.f41806c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f41808n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 3));
        this.f41809r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f41810s;
        photoViewer.f33672o3.setAlpha(f7);
        photoViewer.f33681p3.setAlpha(f7);
        if (this.f41805b) {
            org.telegram.ui.ActionBar.n5 n5Var = photoViewer.f33672o3;
            n5Var.setPivotX(n5Var.getWidth());
            org.telegram.ui.ActionBar.n5 n5Var2 = photoViewer.f33672o3;
            n5Var2.setPivotY(n5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33672o3.setScaleX(f11);
            photoViewer.f33672o3.setScaleY(f11);
            org.telegram.ui.Components.l81 l81Var = photoViewer.f33689q3;
            if (l81Var.f28270y != f10) {
                l81Var.f28270y = f10;
                l81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f41806c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f33698r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f41804a != f7) {
            this.f41804a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f41805b != z10) {
            this.f41805b = z10;
            PhotoViewer photoViewer = this.f41810s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33698r3.setAlpha(1.0f);
            } else {
                photoViewer.f33672o3.setScaleX(1.0f);
                photoViewer.f33672o3.setScaleY(1.0f);
                org.telegram.ui.Components.l81 l81Var = photoViewer.f33689q3;
                if (l81Var.f28270y != 0.0f) {
                    l81Var.f28270y = 0.0f;
                    l81Var.v.invalidate();
                }
            }
            a(this.f41804a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41808n.f17621a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f41810s;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var != null) {
            f7 = ((float) j81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33689q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f41810s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33672o3.getLayoutParams();
        if (this.e > this.f41807f) {
            if (photoViewer.f33681p3.getVisibility() != 0) {
                photoViewer.f33681p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33681p3.getVisibility() != 4) {
                photoViewer.f33681p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        long j10 = 0;
        if (j81Var != null) {
            long p5 = j81Var.p();
            if (p5 != -9223372036854775807L) {
                j10 = p5;
            }
        } else {
            qt0 qt0Var = photoViewer.f33591f0;
            if (qt0Var != null && qt0Var.f29277x) {
                j10 = qt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f33672o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f41809r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f41808n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f17621a != f7) {
                kVar.f17622u.f17628i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.l81 l81Var = photoViewer.f33689q3;
        int measuredHeight = getMeasuredHeight();
        l81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        l81Var.f28255i = measuredHeight;
        View view = l81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f17621a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41804a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f41810s;
        if (photoViewer.f33689q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33698r3.invalidate();
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
