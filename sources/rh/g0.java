package rh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.gr;
public final class g0 extends View implements vs {
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
    public final int f46935a;
    public final long f46936b;
    public final View f46937c;
    public boolean d;
    public float e;
    public float f46938f;
    public boolean h;
    public float f46939n;
    public float f46940r;
    public float f46941s;
    public float f46942w;
    public float f46943x;
    public float f46944y;

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
        this.f46935a = i10;
        this.f46936b = j10;
        this.f46937c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: rh.g0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.G3 && ((Long) objArr[0]).longValue() == this.f46936b) {
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
        at.f(this.f46935a).c(this, at.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f46900j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f46935a).n(this, at.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).f46900j.n(this);
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
                if (((f0) arrayList.get(i10)).f46902l.contains(x10, y3)) {
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
                f0Var.f46903m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f0 f0Var4 = this.M;
            if (f0Var4 != f0Var && f0Var4 != null) {
                f0Var4.f46903m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                gf.f.r(getContext(), "https://t.me/nft/" + f0Var3.e);
                this.M.f46903m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f0Var2 = this.M) != null) {
            f0Var2.f46903m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f46939n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f46943x = f7;
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
