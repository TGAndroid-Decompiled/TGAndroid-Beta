package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public final class w31 extends FrameLayout {

    public float f43591a;

    public final boolean f43592b;

    public final boolean f43593c;
    public boolean d;

    public int f43594e;

    public final hb.a f43595f;
    public final o1.j h;

    public final w0 f43596n;

    public final SecretMediaViewer f43597r;

    public w31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f43597r = secretMediaViewer;
        this.f43591a = 1.0f;
        this.f43592b = true;
        this.f43593c = true;
        hb.a aVar = new hb.a(0.0f);
        this.f43595f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 750.0f, 1.0f);
        jVar.b(new ed0(this, 5));
        this.h = jVar;
        this.f43596n = new w0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43595f.f8860a = 0.0f;
        this.f43594e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f43597r;
        u31 u31Var = secretMediaViewer.f36170y;
        secretMediaViewer.M.h(u31Var != null ? u31Var.o() / secretMediaViewer.f36170y.q() : 0.0f, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.f43597r;
        ((FrameLayout.LayoutParams) secretMediaViewer.O.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        this.d = false;
        super.onMeasure(i10, i11);
        u31 u31Var = secretMediaViewer.f36170y;
        long j10 = 0;
        if (u31Var != null) {
            long jQ = u31Var.q();
            if (jQ != -9223372036854775807L) {
                j10 = jQ;
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        int iCeil = (int) Math.ceil(secretMediaViewer.O.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", j12 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60)))));
        o1.j jVar = this.h;
        jVar.c();
        int i12 = this.f43594e;
        hb.a aVar = this.f43595f;
        if (i12 != 0) {
            float f10 = iCeil;
            if (aVar.f8860a != f10) {
                jVar.f19147u.f19154i = f10;
                jVar.f();
            } else {
                org.telegram.ui.Components.o61 o61Var = secretMediaViewer.M;
                int iB = org.telegram.messenger.y1.B(16.0f, getMeasuredWidth(), iCeil);
                int measuredHeight = getMeasuredHeight();
                o61Var.h = iB;
                o61Var.f31183i = measuredHeight;
                view = o61Var.v;
                if (view != null) {
                    view.invalidate();
                }
                aVar.f8860a = iCeil;
            }
        } else {
            org.telegram.ui.Components.o61 o61Var2 = secretMediaViewer.M;
            int iB2 = org.telegram.messenger.y1.B(16.0f, getMeasuredWidth(), iCeil);
            int measuredHeight2 = getMeasuredHeight();
            o61Var2.h = iB2;
            o61Var2.f31183i = measuredHeight2;
            view = o61Var2.v;
            if (view != null) {
                view.invalidate();
            }
            aVar.f8860a = iCeil;
        }
        this.f43594e = iCeil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43591a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f43597r;
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
