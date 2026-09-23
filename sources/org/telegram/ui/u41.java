package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u41 extends FrameLayout {
    public float f37901a;
    public final boolean f37902b;
    public final boolean f37903c;
    public boolean d;
    public int e;
    public final o1.j f37904f;
    public final o1.k h;
    public final t0 f37905n;
    public final SecretMediaViewer f37906r;

    public u41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f37906r = secretMediaViewer;
        this.f37901a = 1.0f;
        this.f37902b = true;
        this.f37903c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f37904f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        kVar.b(new od0(this, 5));
        this.h = kVar;
        this.f37905n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37904f.f15325a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f37906r;
        s41 s41Var = secretMediaViewer.f31461y;
        if (s41Var != null) {
            f7 = ((float) s41Var.n()) / ((float) secretMediaViewer.f31461y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37901a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f37906r;
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
