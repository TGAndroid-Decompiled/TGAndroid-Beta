package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class xu0 extends FrameLayout {
    public float f45858a;
    public boolean f45859b;
    public boolean f45860c;
    public boolean d;
    public int e;
    public int f45861f;
    public int h;
    public final ac.a f45862n;
    public final o1.j f45863r;
    public final PhotoViewer f45864s;

    public xu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f45864s = photoViewer;
        this.f45858a = 1.0f;
        this.f45860c = true;
        ac.a aVar = new ac.a(0.0f);
        this.f45862n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18969u = d3.l(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 3));
        this.f45863r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f45864s;
        photoViewer.f35733o3.setAlpha(f7);
        photoViewer.f35742p3.setAlpha(f7);
        if (this.f45859b) {
            org.telegram.ui.ActionBar.b6 b6Var = photoViewer.f35733o3;
            b6Var.setPivotX(b6Var.getWidth());
            org.telegram.ui.ActionBar.b6 b6Var2 = photoViewer.f35733o3;
            b6Var2.setPivotY(b6Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f35733o3.setScaleX(f11);
            photoViewer.f35733o3.setScaleY(f11);
            org.telegram.ui.Components.u81 u81Var = photoViewer.f35751q3;
            if (u81Var.f33310y != f10) {
                u81Var.f33310y = f10;
                u81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f45860c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f35760r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f45858a != f7) {
            this.f45858a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f45859b != z10) {
            this.f45859b = z10;
            PhotoViewer photoViewer = this.f45864s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f35760r3.setAlpha(1.0f);
            } else {
                photoViewer.f35733o3.setScaleX(1.0f);
                photoViewer.f35733o3.setScaleY(1.0f);
                org.telegram.ui.Components.u81 u81Var = photoViewer.f35751q3;
                if (u81Var.f33310y != 0.0f) {
                    u81Var.f33310y = 0.0f;
                    u81Var.v.invalidate();
                }
            }
            a(this.f45858a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45862n.f1236a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f45864s;
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        if (s81Var != null) {
            f7 = ((float) s81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f35751q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f45864s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f35733o3.getLayoutParams();
        if (this.e > this.f45861f) {
            if (photoViewer.f35742p3.getVisibility() != 0) {
                photoViewer.f35742p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f35742p3.getVisibility() != 4) {
                photoViewer.f35742p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        long j10 = 0;
        if (s81Var != null) {
            long p10 = s81Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            vt0 vt0Var = photoViewer.f35653f0;
            if (vt0Var != null && vt0Var.f30580x) {
                j10 = vt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f35733o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f45863r;
        jVar.c();
        int i13 = this.h;
        ac.a aVar = this.f45862n;
        if (i13 != 0) {
            float f7 = ceil;
            if (aVar.f1236a != f7) {
                jVar.f18969u.f18975i = f7;
                jVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.u81 u81Var = photoViewer.f35751q3;
        int measuredHeight = getMeasuredHeight();
        u81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        u81Var.f33295i = measuredHeight;
        View view = u81Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f1236a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45858a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f45864s;
        if (photoViewer.f35751q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f35760r3.invalidate();
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
