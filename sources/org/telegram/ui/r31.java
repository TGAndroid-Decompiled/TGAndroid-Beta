package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r31 extends FrameLayout {
    public float f41051a;
    public final boolean f41052b;
    public final boolean f41053c;
    public boolean d;
    public int e;
    public final o1.j f41054f;
    public final o1.k h;
    public final v0 f41055n;
    public final SecretMediaViewer f41056r;

    public r31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f41056r = secretMediaViewer;
        this.f41051a = 1.0f;
        this.f41052b = true;
        this.f41053c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f41054f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17561u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new yc0(this, 5));
        this.h = kVar;
        this.f41055n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41054f.f17560a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f41056r;
        p31 p31Var = secretMediaViewer.f33829y;
        if (p31Var != null) {
            f7 = ((float) p31Var.n()) / ((float) secretMediaViewer.f33829y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41051a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f41056r;
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
