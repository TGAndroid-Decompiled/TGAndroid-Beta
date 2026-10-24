package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u31 extends FrameLayout {
    public float f42198a;
    public final boolean f42199b;
    public final boolean f42200c;
    public boolean d;
    public int e;
    public final o1.j f42201f;
    public final o1.k h;
    public final u0 f42202n;
    public final SecretMediaViewer f42203r;

    public u31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f42203r = secretMediaViewer;
        this.f42198a = 1.0f;
        this.f42199b = true;
        this.f42200c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f42201f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 5));
        this.h = kVar;
        this.f42202n = new u0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42201f.f17621a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f42203r;
        s31 s31Var = secretMediaViewer.f34141y;
        if (s31Var != null) {
            f7 = ((float) s31Var.n()) / ((float) secretMediaViewer.f34141y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42198a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f42203r;
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
