package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class su0 extends FrameLayout {
    public float f41369a;
    public boolean f41370b;
    public boolean f41371c;
    public boolean d;
    public int f41372e;
    public int f41373f;
    public int h;
    public final kb.a f41374n;
    public final o1.j f41375r;
    public final PhotoViewer f41376s;

    public su0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f41376s = photoViewer;
        this.f41369a = 1.0f;
        this.f41371c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f41374n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16336u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new md0(this, 3));
        this.f41375r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f41376s;
        photoViewer.f34323l3.setAlpha(f10);
        photoViewer.f34331m3.setAlpha(f10);
        if (this.f41370b) {
            org.telegram.ui.ActionBar.l5 l5Var = photoViewer.f34323l3;
            l5Var.setPivotX(l5Var.getWidth());
            org.telegram.ui.ActionBar.l5 l5Var2 = photoViewer.f34323l3;
            l5Var2.setPivotY(l5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f34323l3.setScaleX(f12);
            photoViewer.f34323l3.setScaleY(f12);
            org.telegram.ui.Components.m71 m71Var = photoViewer.f34341n3;
            if (m71Var.f28978y != f11) {
                m71Var.f28978y = f11;
                m71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f41371c) {
            setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f34350o3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f41369a != f10) {
            this.f41369a = f10;
            a(f10);
        }
    }

    public final void c(boolean z4) {
        if (this.f41370b != z4) {
            this.f41370b = z4;
            PhotoViewer photoViewer = this.f41376s;
            if (z4) {
                setTranslationY(0.0f);
                photoViewer.f34350o3.setAlpha(1.0f);
            } else {
                photoViewer.f34323l3.setScaleX(1.0f);
                photoViewer.f34323l3.setScaleY(1.0f);
                org.telegram.ui.Components.m71 m71Var = photoViewer.f34341n3;
                if (m71Var.f28978y != 0.0f) {
                    m71Var.f28978y = 0.0f;
                    m71Var.v.invalidate();
                }
            }
            a(this.f41369a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41374n.f11044a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f41376s;
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        if (k71Var != null) {
            f10 = ((float) k71Var.n()) / ((float) photoViewer.C2.p());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.T2) {
            photoViewer.f34341n3.h(f10, false);
        }
        photoViewer.O7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f41376s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f34323l3.getLayoutParams();
        if (this.f41372e > this.f41373f) {
            if (photoViewer.f34331m3.getVisibility() != 0) {
                photoViewer.f34331m3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f34331m3.getVisibility() != 4) {
                photoViewer.f34331m3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        long j10 = 0;
        if (k71Var != null) {
            long p10 = k71Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            pt0 pt0Var = photoViewer.f34240c0;
            if (pt0Var != null && pt0Var.f33068x) {
                j10 = pt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f34323l3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f41375r;
        jVar.c();
        int i13 = this.h;
        kb.a aVar = this.f41374n;
        if (i13 != 0) {
            float f10 = ceil;
            if (aVar.f11044a != f10) {
                jVar.f16336u.f16343i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.m71 m71Var = photoViewer.f34341n3;
        int measuredHeight = getMeasuredHeight();
        m71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        m71Var.f28963i = measuredHeight;
        View view = m71Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f11044a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41369a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f41376s;
        if (photoViewer.f34341n3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f34350o3.invalidate();
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
