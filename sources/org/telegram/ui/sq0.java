package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class sq0 extends FrameLayout {
    public float f49592a;
    public boolean f49593b;
    public boolean f49594c;
    public boolean d;
    public int f49595e;
    public int f49596f;
    public int h;
    public final q1.f f49597n;
    public final q1.g f49598r;
    public final PhotoViewer f49599s;

    public sq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f49599s = photoViewer;
        this.f49592a = 1.0f;
        this.f49594c = true;
        q1.f fVar = new q1.f(0.0f);
        this.f49597n = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
        gVar.b(new wa0(this, 3));
        this.f49598r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f49599s;
        photoViewer.f41507p3.setAlpha(f10);
        photoViewer.f41516q3.setAlpha(f10);
        if (this.f49593b) {
            org.telegram.ui.ActionBar.k5 k5Var = photoViewer.f41507p3;
            k5Var.setPivotX(k5Var.getWidth());
            org.telegram.ui.ActionBar.k5 k5Var2 = photoViewer.f41507p3;
            k5Var2.setPivotY(k5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f41507p3.setScaleX(f12);
            photoViewer.f41507p3.setScaleY(f12);
            org.telegram.ui.Components.o51 o51Var = photoViewer.f41526r3;
            if (o51Var.f36740y != f11) {
                o51Var.f36740y = f11;
                o51Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f49594c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f41535s3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f49592a != f10) {
            this.f49592a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f49593b != z10) {
            this.f49593b = z10;
            PhotoViewer photoViewer = this.f49599s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f41535s3.setAlpha(1.0f);
            } else {
                photoViewer.f41507p3.setScaleX(1.0f);
                photoViewer.f41507p3.setScaleY(1.0f);
                org.telegram.ui.Components.o51 o51Var = photoViewer.f41526r3;
                if (o51Var.f36740y != 0.0f) {
                    o51Var.f36740y = 0.0f;
                    o51Var.v.invalidate();
                }
            }
            a(this.f49592a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49597n.f53635a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i3, i10, i11, i12);
        PhotoViewer photoViewer = this.f49599s;
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        if (m51Var != null) {
            f10 = ((float) m51Var.S()) / ((float) photoViewer.G2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.X2) {
            photoViewer.f41526r3.h(false, f10);
        }
        photoViewer.T7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f49599s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f41507p3.getLayoutParams();
        if (this.f49595e > this.f49596f) {
            if (photoViewer.f41516q3.getVisibility() != 0) {
                photoViewer.f41516q3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f41516q3.getVisibility() != 4) {
                photoViewer.f41516q3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i3, i10);
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        long j10 = 0;
        if (m51Var != null) {
            long U = m51Var.U();
            if (U != -9223372036854775807L) {
                j10 = U;
            }
        } else {
            tp0 tp0Var = photoViewer.f41429g0;
            if (tp0Var != null && tp0Var.f38729y) {
                j10 = tp0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f41507p3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        q1.g gVar = this.f49598r;
        gVar.d();
        int i12 = this.h;
        q1.f fVar = this.f49597n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f53635a != f10) {
                gVar.f53653m.f53661i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.o51 o51Var = photoViewer.f41526r3;
        int measuredHeight = getMeasuredHeight();
        o51Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        o51Var.f36725i = measuredHeight;
        View view = o51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f53635a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49592a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f49599s;
        if (photoViewer.f41526r3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f41535s3.invalidate();
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
