package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.es;
public final class f0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public f5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public e0 M;
    public final int f50481a;
    public final long f50482b;
    public final View f50483c;
    public boolean d;
    public float e;
    public float f50484f;
    public boolean h;
    public float f50485n;
    public float f50486r;
    public float f50487s;
    public float v;
    public float f50488w;
    public float f50489x;
    public final org.telegram.ui.Components.g6 f50490y;

    public f0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.f50490y = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f50481a = i10;
        this.f50482b = j10;
        this.f50483c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: zh.f0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f50482b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f50481a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e0) obj).f50404j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50481a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e0) obj).f50404j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((e0) arrayList.get(i10)).f50406l.contains(x10, y3)) {
                    e0Var = (e0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                e0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = e0Var;
            if (e0Var != null) {
                e0Var.f50407m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            e0 e0Var4 = this.M;
            if (e0Var4 != e0Var && e0Var4 != null) {
                e0Var4.f50407m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                pf.d.s(getContext(), "https://t.me/nft/" + e0Var3.e);
                this.M.f50407m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (e0Var2 = this.M) != null) {
            e0Var2.f50407m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f50485n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f50488w = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.e != f7) {
            this.e = f7;
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
