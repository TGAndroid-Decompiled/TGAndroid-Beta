package rh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
public final class g0 extends View implements us {
    public final org.telegram.ui.Components.t5 D;
    public float E;
    public v5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public f0 M;
    public final int f46921a;
    public final long f46922b;
    public final View f46923c;
    public boolean d;
    public float e;
    public float f46924f;
    public boolean h;
    public float f46925n;
    public float f46926r;
    public float f46927s;
    public float f46928w;
    public float f46929x;
    public float f46930y;

    public g0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.D = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f46921a = i10;
        this.f46922b = j10;
        this.f46923c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: rh.g0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.G3 && ((Long) objArr[0]).longValue() == this.f46922b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f46921a).c(this, zs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f46886j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f46921a).n(this, zs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f46886j.n(this);
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
                if (((f0) arrayList.get(i10)).f46888l.contains(x10, y3)) {
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
                f0Var.f46889m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f0 f0Var4 = this.M;
            if (f0Var4 != f0Var && f0Var4 != null) {
                f0Var4.f46889m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                gf.f.r(getContext(), "https://t.me/nft/" + f0Var3.e);
                this.M.f46889m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f0Var2 = this.M) != null) {
            f0Var2.f46889m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f46925n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f46929x = f7;
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
