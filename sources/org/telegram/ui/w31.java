package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w31 extends FrameLayout {
    public float f44963a;
    public final boolean f44964b;
    public final boolean f44965c;
    public boolean d;
    public int e;
    public final ac.a f44966f;
    public final o1.j h;
    public final s0 f44967n;
    public final SecretMediaViewer f44968r;

    public w31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f44968r = secretMediaViewer;
        this.f44963a = 1.0f;
        this.f44964b = true;
        this.f44965c = true;
        ac.a aVar = new ac.a(0.0f);
        this.f44966f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18969u = d3.l(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 5));
        this.h = jVar;
        this.f44967n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44966f.f1236a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f44968r;
        u31 u31Var = secretMediaViewer.f36202y;
        if (u31Var != null) {
            f7 = ((float) u31Var.n()) / ((float) secretMediaViewer.f36202y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44963a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f44968r;
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
