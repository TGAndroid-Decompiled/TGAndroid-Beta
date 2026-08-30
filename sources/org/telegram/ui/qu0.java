package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class qu0 extends FrameLayout {
    public float f37844a;
    public boolean f37845b;
    public boolean f37846c;
    public boolean d;
    public int e;
    public int f37847f;
    public int h;
    public final kb.a f37848n;
    public final o1.j f37849r;
    public final PhotoViewer f37850s;

    public qu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37850s = photoViewer;
        this.f37844a = 1.0f;
        this.f37846c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f37848n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16198u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new ld0(this, 3));
        this.f37849r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f37850s;
        photoViewer.f31797l3.setAlpha(f10);
        photoViewer.f31805m3.setAlpha(f10);
        if (this.f37845b) {
            org.telegram.ui.ActionBar.k5 k5Var = photoViewer.f31797l3;
            k5Var.setPivotX(k5Var.getWidth());
            org.telegram.ui.ActionBar.k5 k5Var2 = photoViewer.f31797l3;
            k5Var2.setPivotY(k5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f31797l3.setScaleX(f12);
            photoViewer.f31797l3.setScaleY(f12);
            org.telegram.ui.Components.k71 k71Var = photoViewer.f31815n3;
            if (k71Var.f26199y != f11) {
                k71Var.f26199y = f11;
                k71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f37846c) {
            setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31824o3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f37844a != f10) {
            this.f37844a = f10;
            a(f10);
        }
    }

    public final void c(boolean z4) {
        if (this.f37845b != z4) {
            this.f37845b = z4;
            PhotoViewer photoViewer = this.f37850s;
            if (z4) {
                setTranslationY(0.0f);
                photoViewer.f31824o3.setAlpha(1.0f);
            } else {
                photoViewer.f31797l3.setScaleX(1.0f);
                photoViewer.f31797l3.setScaleY(1.0f);
                org.telegram.ui.Components.k71 k71Var = photoViewer.f31815n3;
                if (k71Var.f26199y != 0.0f) {
                    k71Var.f26199y = 0.0f;
                    k71Var.v.invalidate();
                }
            }
            a(this.f37844a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37848n.f10279a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f37850s;
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var != null) {
            f10 = ((float) i71Var.n()) / ((float) photoViewer.C2.p());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.T2) {
            photoViewer.f31815n3.h(f10, false);
        }
        photoViewer.O7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f37850s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31797l3.getLayoutParams();
        if (this.e > this.f37847f) {
            if (photoViewer.f31805m3.getVisibility() != 0) {
                photoViewer.f31805m3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31805m3.getVisibility() != 4) {
                photoViewer.f31805m3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        long j10 = 0;
        if (i71Var != null) {
            long p10 = i71Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            nt0 nt0Var = photoViewer.f31715c0;
            if (nt0Var != null && nt0Var.f29456x) {
                j10 = nt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f31797l3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f37849r;
        jVar.c();
        int i13 = this.h;
        kb.a aVar = this.f37848n;
        if (i13 != 0) {
            float f10 = ceil;
            if (aVar.f10279a != f10) {
                jVar.f16198u.f16204i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.k71 k71Var = photoViewer.f31815n3;
        int measuredHeight = getMeasuredHeight();
        k71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        k71Var.f26184i = measuredHeight;
        View view = k71Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f10279a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37844a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f37850s;
        if (photoViewer.f31815n3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31824o3.invalidate();
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
