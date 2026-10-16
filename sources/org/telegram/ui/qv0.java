package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class qv0 extends FrameLayout {
    public float f39224a;
    public boolean f39225b;
    public boolean f39226c;
    public boolean d;
    public int e;
    public int f39227f;
    public int h;
    public final o1.j f39228n;
    public final o1.k f39229r;
    public final PhotoViewer f39230s;

    public qv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39230s = photoViewer;
        this.f39224a = 1.0f;
        this.f39226c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f39228n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16161u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new wd0(this, 3));
        this.f39229r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f39230s;
        photoViewer.f32018o3.setAlpha(f7);
        photoViewer.f32027p3.setAlpha(f7);
        if (this.f39225b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f32018o3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f32018o3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f32018o3.setScaleX(f11);
            photoViewer.f32018o3.setScaleY(f11);
            org.telegram.ui.Components.k81 k81Var = photoViewer.f32035q3;
            if (k81Var.f26278y != f10) {
                k81Var.f26278y = f10;
                k81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f39226c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f32044r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f39224a != f7) {
            this.f39224a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f39225b != z10) {
            this.f39225b = z10;
            PhotoViewer photoViewer = this.f39230s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f32044r3.setAlpha(1.0f);
            } else {
                photoViewer.f32018o3.setScaleX(1.0f);
                photoViewer.f32018o3.setScaleY(1.0f);
                org.telegram.ui.Components.k81 k81Var = photoViewer.f32035q3;
                if (k81Var.f26278y != 0.0f) {
                    k81Var.f26278y = 0.0f;
                    k81Var.v.invalidate();
                }
            }
            a(this.f39224a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39228n.f16160a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f39230s;
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        if (i81Var != null) {
            f7 = ((float) i81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f32035q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f39230s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f32018o3.getLayoutParams();
        if (this.e > this.f39227f) {
            if (photoViewer.f32027p3.getVisibility() != 0) {
                photoViewer.f32027p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f32027p3.getVisibility() != 4) {
                photoViewer.f32027p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        long j10 = 0;
        if (i81Var != null) {
            long p5 = i81Var.p();
            if (p5 != -9223372036854775807L) {
                j10 = p5;
            }
        } else {
            ou0 ou0Var = photoViewer.f31937f0;
            if (ou0Var != null && ou0Var.f28531x) {
                j10 = ou0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f32018o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f39229r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f39228n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f16160a != f7) {
                kVar.f16161u.f16167i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.k81 k81Var = photoViewer.f32035q3;
        int measuredHeight = getMeasuredHeight();
        k81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        k81Var.f26263i = measuredHeight;
        View view = k81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f16160a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39224a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f39230s;
        if (photoViewer.f32035q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f32044r3.invalidate();
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
