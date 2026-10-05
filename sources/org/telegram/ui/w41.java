package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends FrameLayout {
    public float f41914a;
    public final boolean f41915b;
    public final boolean f41916c;
    public boolean d;
    public int f41917e;
    public final o1.j f41918f;
    public final o1.k h;
    public final t0 f41919n;
    public final SecretMediaViewer f41920r;

    public w41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f41920r = secretMediaViewer;
        this.f41914a = 1.0f;
        this.f41915b = true;
        this.f41916c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f41918f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16993u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new rd0(this, 5));
        this.h = kVar;
        this.f41919n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41918f.f16992a = 0.0f;
        this.f41917e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f41920r;
        u41 u41Var = secretMediaViewer.f34477y;
        if (u41Var != null) {
            f7 = ((float) u41Var.n()) / ((float) secretMediaViewer.f34477y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41914a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f41920r;
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
