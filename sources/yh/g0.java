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
public final class g0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public k5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public f0 M;
    public final int f51329a;
    public final long f51330b;
    public final View f51331c;
    public boolean d;
    public float f51332e;
    public float f51333f;
    public boolean h;
    public float f51334n;
    public float f51335r;
    public float f51336s;
    public float v;
    public float f51337w;
    public float f51338x;
    public final org.telegram.ui.Components.e6 f51339y;

    public g0(Context context, int i10, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.f51339y = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f51329a = i10;
        this.f51330b = j3;
        this.f51331c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: yh.g0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f51330b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: yh.g0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f51329a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f51263j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51329a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f51263j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((f0) arrayList.get(i10)).f51265l.contains(x10, y3)) {
                    f0Var = (f0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                f0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = f0Var;
            if (f0Var != null) {
                f0Var.f51266m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f0 f0Var4 = this.M;
            if (f0Var4 != f0Var && f0Var4 != null) {
                f0Var4.f51266m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                nf.f.s(getContext(), "https://t.me/nft/" + f0Var3.f51259e);
                this.M.f51266m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f0Var2 = this.M) != null) {
            f0Var2.f51266m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f51334n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f51337w = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.f51332e != f7) {
            this.f51332e = f7;
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
