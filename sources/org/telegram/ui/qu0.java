package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class qu0 extends FrameLayout {
    public float f40970a;
    public boolean f40971b;
    public boolean f40972c;
    public boolean d;
    public int e;
    public int f40973f;
    public int h;
    public final o1.j f40974n;
    public final o1.k f40975r;
    public final PhotoViewer f40976s;

    public qu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40976s = photoViewer;
        this.f40970a = 1.0f;
        this.f40972c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f40974n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17559u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new yc0(this, 3));
        this.f40975r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f40976s;
        photoViewer.f33369o3.setAlpha(f7);
        photoViewer.f33378p3.setAlpha(f7);
        if (this.f40971b) {
            org.telegram.ui.ActionBar.j5 j5Var = photoViewer.f33369o3;
            j5Var.setPivotX(j5Var.getWidth());
            org.telegram.ui.ActionBar.j5 j5Var2 = photoViewer.f33369o3;
            j5Var2.setPivotY(j5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33369o3.setScaleX(f11);
            photoViewer.f33369o3.setScaleY(f11);
            org.telegram.ui.Components.e81 e81Var = photoViewer.f33386q3;
            if (e81Var.f25838y != f10) {
                e81Var.f25838y = f10;
                e81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f40972c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f33395r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f40970a != f7) {
            this.f40970a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f40971b != z10) {
            this.f40971b = z10;
            PhotoViewer photoViewer = this.f40976s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33395r3.setAlpha(1.0f);
            } else {
                photoViewer.f33369o3.setScaleX(1.0f);
                photoViewer.f33369o3.setScaleY(1.0f);
                org.telegram.ui.Components.e81 e81Var = photoViewer.f33386q3;
                if (e81Var.f25838y != 0.0f) {
                    e81Var.f25838y = 0.0f;
                    e81Var.v.invalidate();
                }
            }
            a(this.f40970a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40974n.f17558a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f40976s;
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        if (c81Var != null) {
            f7 = ((float) c81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33386q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f40976s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33369o3.getLayoutParams();
        if (this.e > this.f40973f) {
            if (photoViewer.f33378p3.getVisibility() != 0) {
                photoViewer.f33378p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33378p3.getVisibility() != 4) {
                photoViewer.f33378p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        long j10 = 0;
        if (c81Var != null) {
            long p5 = c81Var.p();
            if (p5 != -9223372036854775807L) {
                j10 = p5;
            }
        } else {
            ot0 ot0Var = photoViewer.f33288f0;
            if (ot0Var != null && ot0Var.f28159x) {
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
        int ceil = (int) Math.ceil(photoViewer.f33369o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f40975r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f40974n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f17558a != f7) {
                kVar.f17559u.f17565i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.e81 e81Var = photoViewer.f33386q3;
        int measuredHeight = getMeasuredHeight();
        e81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        e81Var.f25823i = measuredHeight;
        View view = e81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f17558a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40970a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f40976s;
        if (photoViewer.f33386q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33395r3.invalidate();
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
