package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z31 extends FrameLayout {
    public float f45056a;
    public final boolean f45057b;
    public final boolean f45058c;
    public boolean d;
    public int f45059e;
    public final ib.a f45060f;
    public final o1.k h;
    public final w0 f45061n;
    public final SecretMediaViewer f45062r;

    public z31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f45062r = secretMediaViewer;
        this.f45056a = 1.0f;
        this.f45057b = true;
        this.f45058c = true;
        ib.a aVar = new ib.a(0.0f);
        this.f45060f = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.f19045u = th.l(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 5));
        this.h = kVar;
        this.f45061n = new w0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45060f.f8824a = 0.0f;
        this.f45059e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f45062r;
        x31 x31Var = secretMediaViewer.f36232y;
        if (x31Var != null) {
            f9 = ((float) x31Var.o()) / ((float) secretMediaViewer.f36232y.q());
        } else {
            f9 = 0.0f;
        }
        secretMediaViewer.M.h(f9, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45056a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f45062r;
        if (secretMediaViewer.M.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.N.invalidate();
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
