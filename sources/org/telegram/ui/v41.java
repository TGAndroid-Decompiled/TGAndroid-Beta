package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends FrameLayout {
    public float f38614a;
    public final boolean f38615b;
    public final boolean f38616c;
    public boolean d;
    public int e;
    public final o1.j f38617f;
    public final o1.k h;
    public final t0 f38618n;
    public final SecretMediaViewer f38619r;

    public v41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f38619r = secretMediaViewer;
        this.f38614a = 1.0f;
        this.f38615b = true;
        this.f38616c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f38617f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15518u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new nd0(this, 5));
        this.h = kVar;
        this.f38618n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38617f.f15517a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f38619r;
        t41 t41Var = secretMediaViewer.f31762y;
        if (t41Var != null) {
            f7 = ((float) t41Var.n()) / ((float) secretMediaViewer.f31762y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38614a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f38619r;
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
