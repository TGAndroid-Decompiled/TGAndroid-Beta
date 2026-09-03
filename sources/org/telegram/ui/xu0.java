package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class xu0 extends FrameLayout {
    public float f43454a;
    public boolean f43455b;
    public boolean f43456c;
    public boolean d;
    public int f43457e;
    public int f43458f;
    public int h;
    public final kb.a f43459n;
    public final o1.j f43460r;
    public final PhotoViewer f43461s;

    public xu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43461s = photoViewer;
        this.f43454a = 1.0f;
        this.f43456c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f43459n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16338u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new md0(this, 3));
        this.f43460r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f43461s;
        photoViewer.f34323l3.setAlpha(f10);
        photoViewer.f34331m3.setAlpha(f10);
        if (this.f43455b) {
            org.telegram.ui.ActionBar.l5 l5Var = photoViewer.f34323l3;
            l5Var.setPivotX(l5Var.getWidth());
            org.telegram.ui.ActionBar.l5 l5Var2 = photoViewer.f34323l3;
            l5Var2.setPivotY(l5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f34323l3.setScaleX(f12);
            photoViewer.f34323l3.setScaleY(f12);
            org.telegram.ui.Components.l71 l71Var = photoViewer.f34341n3;
            if (l71Var.f28677y != f11) {
                l71Var.f28677y = f11;
                l71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f43456c) {
            setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f34350o3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f43454a != f10) {
            this.f43454a = f10;
            a(f10);
        }
    }

    public final void c(boolean z4) {
        if (this.f43455b != z4) {
            this.f43455b = z4;
            PhotoViewer photoViewer = this.f43461s;
            if (z4) {
                setTranslationY(0.0f);
                photoViewer.f34350o3.setAlpha(1.0f);
            } else {
                photoViewer.f34323l3.setScaleX(1.0f);
                photoViewer.f34323l3.setScaleY(1.0f);
                org.telegram.ui.Components.l71 l71Var = photoViewer.f34341n3;
                if (l71Var.f28677y != 0.0f) {
                    l71Var.f28677y = 0.0f;
                    l71Var.v.invalidate();
                }
            }
            a(this.f43454a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43459n.f11044a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f43461s;
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        if (j71Var != null) {
            f10 = ((float) j71Var.n()) / ((float) photoViewer.C2.p());
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
        PhotoViewer photoViewer = this.f43461s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f34323l3.getLayoutParams();
        if (this.f43457e > this.f43458f) {
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
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        long j10 = 0;
        if (j71Var != null) {
            long p10 = j71Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            ut0 ut0Var = photoViewer.f34240c0;
            if (ut0Var != null && ut0Var.f33062x) {
                j10 = ut0Var.getVideoDuration();
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
        o1.j jVar = this.f43460r;
        jVar.c();
        int i13 = this.h;
        kb.a aVar = this.f43459n;
        if (i13 != 0) {
            float f10 = ceil;
            if (aVar.f11044a != f10) {
                jVar.f16338u.f16345i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.l71 l71Var = photoViewer.f34341n3;
        int measuredHeight = getMeasuredHeight();
        l71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        l71Var.f28662i = measuredHeight;
        View view = l71Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f11044a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43454a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f43461s;
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
