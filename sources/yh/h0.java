package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tr;
public final class h0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public l5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public g0 M;
    public final int f51396a;
    public final long f51397b;
    public final View f51398c;
    public boolean d;
    public float f51399e;
    public float f51400f;
    public boolean h;
    public float f51401n;
    public float f51402r;
    public float f51403s;
    public float v;
    public float f51404w;
    public float f51405x;
    public final org.telegram.ui.Components.e6 f51406y;

    public h0(Context context, int i10, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.f51406y = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f51396a = i10;
        this.f51397b = j3;
        this.f51398c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: yh.h0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f51397b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: yh.h0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f51396a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).f51324j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51396a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).f51324j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((g0) arrayList.get(i10)).f51326l.contains(x10, y3)) {
                    g0Var = (g0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                g0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = g0Var;
            if (g0Var != null) {
                g0Var.f51327m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            g0 g0Var4 = this.M;
            if (g0Var4 != g0Var && g0Var4 != null) {
                g0Var4.f51327m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                nf.f.s(getContext(), "https://t.me/nft/" + g0Var3.f51320e);
                this.M.f51327m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (g0Var2 = this.M) != null) {
            g0Var2.f51327m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f51401n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f51404w = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.f51399e != f7) {
            this.f51399e = f7;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f7) {
        if (this.E == f7) {
            return;
        }
        this.E = f7;
        invalidate();
    }
}
