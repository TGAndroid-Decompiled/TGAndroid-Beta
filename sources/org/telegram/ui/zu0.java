package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class zu0 extends FrameLayout {
    public float f46365a;
    public boolean f46366b;
    public boolean f46367c;
    public boolean d;
    public int e;
    public int f46368f;
    public int h;
    public final ac.a f46369n;
    public final o1.j f46370r;
    public final PhotoViewer f46371s;

    public zu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f46371s = photoViewer;
        this.f46365a = 1.0f;
        this.f46367c = true;
        ac.a aVar = new ac.a(0.0f);
        this.f46369n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18968u = d3.l(0.0f, 750.0f, 1.0f);
        jVar.b(new cd0(this, 3));
        this.f46370r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f46371s;
        photoViewer.f35760o3.setAlpha(f7);
        photoViewer.f35769p3.setAlpha(f7);
        if (this.f46366b) {
            org.telegram.ui.ActionBar.b6 b6Var = photoViewer.f35760o3;
            b6Var.setPivotX(b6Var.getWidth());
            org.telegram.ui.ActionBar.b6 b6Var2 = photoViewer.f35760o3;
            b6Var2.setPivotY(b6Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f35760o3.setScaleX(f11);
            photoViewer.f35760o3.setScaleY(f11);
            org.telegram.ui.Components.v81 v81Var = photoViewer.f35778q3;
            if (v81Var.f33628y != f10) {
                v81Var.f33628y = f10;
                v81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f46367c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f35787r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f46365a != f7) {
            this.f46365a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f46366b != z10) {
            this.f46366b = z10;
            PhotoViewer photoViewer = this.f46371s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f35787r3.setAlpha(1.0f);
            } else {
                photoViewer.f35760o3.setScaleX(1.0f);
                photoViewer.f35760o3.setScaleY(1.0f);
                org.telegram.ui.Components.v81 v81Var = photoViewer.f35778q3;
                if (v81Var.f33628y != 0.0f) {
                    v81Var.f33628y = 0.0f;
                    v81Var.v.invalidate();
                }
            }
            a(this.f46365a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46369n.f1236a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f46371s;
        org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
        if (t81Var != null) {
            f7 = ((float) t81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f35778q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f46371s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f35760o3.getLayoutParams();
        if (this.e > this.f46368f) {
            if (photoViewer.f35769p3.getVisibility() != 0) {
                photoViewer.f35769p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f35769p3.getVisibility() != 4) {
                photoViewer.f35769p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
        long j10 = 0;
        if (t81Var != null) {
            long p10 = t81Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            xt0 xt0Var = photoViewer.f35680f0;
            if (xt0Var != null && xt0Var.f30914x) {
                j10 = xt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f35760o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f46370r;
        jVar.c();
        int i13 = this.h;
        ac.a aVar = this.f46369n;
        if (i13 != 0) {
            float f7 = ceil;
            if (aVar.f1236a != f7) {
                jVar.f18968u.f18974i = f7;
                jVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.v81 v81Var = photoViewer.f35778q3;
        int measuredHeight = getMeasuredHeight();
        v81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        v81Var.f33613i = measuredHeight;
        View view = v81Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f1236a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46365a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f46371s;
        if (photoViewer.f35778q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f35787r3.invalidate();
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
