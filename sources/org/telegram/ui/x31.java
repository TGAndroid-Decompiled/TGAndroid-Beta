package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x31 extends FrameLayout {
    public float f44355a;
    public final boolean f44356b;
    public final boolean f44357c;
    public boolean d;
    public int f44358e;
    public final gb.a f44359f;
    public final o1.j h;
    public final v0 f44360n;
    public final SecretMediaViewer f44361r;

    public x31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f44361r = secretMediaViewer;
        this.f44355a = 1.0f;
        this.f44356b = true;
        this.f44357c = true;
        gb.a aVar = new gb.a(0.0f);
        this.f44359f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 5));
        this.h = jVar;
        this.f44360n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44359f.f7689a = 0.0f;
        this.f44358e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i9, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f44361r;
        v31 v31Var = secretMediaViewer.f36167y;
        if (v31Var != null) {
            f10 = ((float) v31Var.o()) / ((float) secretMediaViewer.f36167y.q());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.M.h(f10, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x31.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44355a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f44361r;
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
