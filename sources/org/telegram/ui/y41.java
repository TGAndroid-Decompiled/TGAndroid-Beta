package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y41 extends FrameLayout {
    public float f43055a;
    public final boolean f43056b;
    public final boolean f43057c;
    public boolean d;
    public int f43058e;
    public final o1.j f43059f;
    public final o1.k h;
    public final t0 f43060n;
    public final SecretMediaViewer f43061r;

    public y41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f43061r = secretMediaViewer;
        this.f43055a = 1.0f;
        this.f43056b = true;
        this.f43057c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f43059f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16984u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new rd0(this, 5));
        this.h = kVar;
        this.f43060n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43059f.f16983a = 0.0f;
        this.f43058e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f43061r;
        w41 w41Var = secretMediaViewer.f34458y;
        if (w41Var != null) {
            f7 = ((float) w41Var.n()) / ((float) secretMediaViewer.f34458y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43055a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f43061r;
        if (secretMediaViewer.Q.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.R.invalidate();
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
