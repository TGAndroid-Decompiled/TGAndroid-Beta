package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class tu0 extends FrameLayout {
    public float f42076a;
    public boolean f42077b;
    public boolean f42078c;
    public boolean d;
    public int e;
    public int f42079f;
    public int h;
    public final o1.j f42080n;
    public final o1.k f42081r;
    public final PhotoViewer f42082s;

    public tu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f42082s = photoViewer;
        this.f42076a = 1.0f;
        this.f42078c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f42080n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new dd0(this, 3));
        this.f42081r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f42082s;
        photoViewer.f33670o3.setAlpha(f7);
        photoViewer.f33679p3.setAlpha(f7);
        if (this.f42077b) {
            org.telegram.ui.ActionBar.n5 n5Var = photoViewer.f33670o3;
            n5Var.setPivotX(n5Var.getWidth());
            org.telegram.ui.ActionBar.n5 n5Var2 = photoViewer.f33670o3;
            n5Var2.setPivotY(n5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33670o3.setScaleX(f11);
            photoViewer.f33670o3.setScaleY(f11);
            org.telegram.ui.Components.l81 l81Var = photoViewer.f33687q3;
            if (l81Var.f28298y != f10) {
                l81Var.f28298y = f10;
                l81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f42078c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f33696r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f42076a != f7) {
            this.f42076a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f42077b != z10) {
            this.f42077b = z10;
            PhotoViewer photoViewer = this.f42082s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33696r3.setAlpha(1.0f);
            } else {
                photoViewer.f33670o3.setScaleX(1.0f);
                photoViewer.f33670o3.setScaleY(1.0f);
                org.telegram.ui.Components.l81 l81Var = photoViewer.f33687q3;
                if (l81Var.f28298y != 0.0f) {
                    l81Var.f28298y = 0.0f;
                    l81Var.v.invalidate();
                }
            }
            a(this.f42076a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42080n.f17621a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f42082s;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var != null) {
            f7 = ((float) j81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33687q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f42082s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33670o3.getLayoutParams();
        if (this.e > this.f42079f) {
            if (photoViewer.f33679p3.getVisibility() != 0) {
                photoViewer.f33679p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33679p3.getVisibility() != 4) {
                photoViewer.f33679p3.setVisibility(4);
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
            rt0 rt0Var = photoViewer.f33589f0;
            if (rt0Var != null && rt0Var.f29558x) {
                j10 = rt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f33670o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f42081r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f42080n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f17621a != f7) {
                kVar.f17622u.f17628i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.l81 l81Var = photoViewer.f33687q3;
        int measuredHeight = getMeasuredHeight();
        l81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        l81Var.f28283i = measuredHeight;
        View view = l81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f17621a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42076a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f42082s;
        if (photoViewer.f33687q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33696r3.invalidate();
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
