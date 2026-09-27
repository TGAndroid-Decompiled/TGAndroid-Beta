package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y41 extends FrameLayout {
    public float f40130a;
    public final boolean f40131b;
    public final boolean f40132c;
    public boolean d;
    public int e;
    public final o1.j f40133f;
    public final o1.k h;
    public final u0 f40134n;
    public final SecretMediaViewer f40135r;

    public y41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f40135r = secretMediaViewer;
        this.f40130a = 1.0f;
        this.f40131b = true;
        this.f40132c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f40133f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15572u = org.telegram.ui.Cells.c1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new qd0(this, 5));
        this.h = kVar;
        this.f40134n = new u0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40133f.f15571a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f40135r;
        w41 w41Var = secretMediaViewer.f31778y;
        if (w41Var != null) {
            f7 = ((float) w41Var.n()) / ((float) secretMediaViewer.f31778y.p());
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
        if (this.f40130a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f40135r;
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
