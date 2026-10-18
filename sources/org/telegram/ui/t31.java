package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t31 extends FrameLayout {
    public float f41571a;
    public final boolean f41572b;
    public final boolean f41573c;
    public boolean d;
    public int e;
    public final o1.j f41574f;
    public final o1.k h;
    public final v0 f41575n;
    public final SecretMediaViewer f41576r;

    public t31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f41576r = secretMediaViewer;
        this.f41571a = 1.0f;
        this.f41572b = true;
        this.f41573c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f41574f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17558u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new ad0(this, 5));
        this.h = kVar;
        this.f41575n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41574f.f17557a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f41576r;
        r31 r31Var = secretMediaViewer.f33823y;
        if (r31Var != null) {
            f7 = ((float) r31Var.n()) / ((float) secretMediaViewer.f33823y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41571a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f41576r;
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
