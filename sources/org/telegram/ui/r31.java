package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r31 extends FrameLayout {
    public float f41043a;
    public final boolean f41044b;
    public final boolean f41045c;
    public boolean d;
    public int e;
    public final o1.j f41046f;
    public final o1.k h;
    public final v0 f41047n;
    public final SecretMediaViewer f41048r;

    public r31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f41048r = secretMediaViewer;
        this.f41043a = 1.0f;
        this.f41044b = true;
        this.f41045c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f41046f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17559u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new yc0(this, 5));
        this.h = kVar;
        this.f41047n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41046f.f17558a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f41048r;
        p31 p31Var = secretMediaViewer.f33831y;
        if (p31Var != null) {
            f7 = ((float) p31Var.n()) / ((float) secretMediaViewer.f33831y.p());
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
        if (this.f41043a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f41048r;
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
