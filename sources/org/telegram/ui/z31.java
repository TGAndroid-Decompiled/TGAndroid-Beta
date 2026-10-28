package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z31 extends FrameLayout {
    public float f46150a;
    public final boolean f46151b;
    public final boolean f46152c;
    public boolean d;
    public int e;
    public final ac.a f46153f;
    public final o1.j h;
    public final s0 f46154n;
    public final SecretMediaViewer f46155r;

    public z31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f46155r = secretMediaViewer;
        this.f46150a = 1.0f;
        this.f46151b = true;
        this.f46152c = true;
        ac.a aVar = new ac.a(0.0f);
        this.f46153f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18968u = d3.l(0.0f, 750.0f, 1.0f);
        jVar.b(new cd0(this, 5));
        this.h = jVar;
        this.f46154n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46153f.f1236a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f46155r;
        x31 x31Var = secretMediaViewer.f36229y;
        if (x31Var != null) {
            f7 = ((float) x31Var.n()) / ((float) secretMediaViewer.f36229y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46150a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f46155r;
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
