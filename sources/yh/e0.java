package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.is;
public final class e0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public f5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public d0 M;
    public final int f52499a;
    public final long f52500b;
    public final View f52501c;
    public boolean d;
    public float f52502e;
    public float f52503f;
    public boolean h;
    public float f52504n;
    public float f52505r;
    public float f52506s;
    public float v;
    public float f52507w;
    public float f52508x;
    public final org.telegram.ui.Components.g6 f52509y;

    public e0(Context context, int i10, long j3, org.telegram.ui.j0 j0Var) {
        super(context);
        this.d = true;
        this.f52509y = new org.telegram.ui.Components.g6(this, 0L, 350L, is.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f52499a = i10;
        this.f52500b = j3;
        this.f52501c = j0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: yh.e0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f52500b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f52499a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).f52461j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f52499a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).f52461j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f52463l.contains(x10, y3)) {
                    d0Var = (d0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                d0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = d0Var;
            if (d0Var != null) {
                d0Var.f52464m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            d0 d0Var4 = this.M;
            if (d0Var4 != d0Var && d0Var4 != null) {
                d0Var4.f52464m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                of.f.s(getContext(), "https://t.me/nft/" + d0Var3.f52457e);
                this.M.f52464m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (d0Var2 = this.M) != null) {
            d0Var2.f52464m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f52504n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f52507w = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.f52502e != f7) {
            this.f52502e = f7;
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
