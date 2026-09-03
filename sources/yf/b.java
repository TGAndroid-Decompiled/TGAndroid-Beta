package yf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ig0;
public final class b {
    public final ScaleGestureDetector f47255a;
    public n f47256b;
    public float f47257c;
    public float d;
    public final float f47258f;
    public VelocityTracker f47259g;
    public boolean h;
    public long f47262k;
    public boolean f47263l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int f47260i = -1;
    public int f47261j = 0;

    public b(Context context) {
        this.f47258f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f47255a = new ScaleGestureDetector(context, new ig0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y10;
        float x11;
        float y11;
        float x12;
        float y12;
        m mVar;
        int i10;
        this.f47255a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z4 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f47260i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f47260i = motionEvent.getPointerId(i10);
                        this.f47257c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f47262k < 800 && (mVar = this.f47256b.J) != null) {
                    mVar.d2();
                }
                this.f47260i = -1;
            }
        } else {
            this.f47260i = motionEvent.getPointerId(0);
            this.f47262k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f47260i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f47261j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f47259g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f47259g = null;
                        }
                        this.f47263l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f47259g != null) {
                        try {
                            x12 = motionEvent.getX(this.f47261j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f47257c = x12;
                        try {
                            y12 = motionEvent.getY(this.f47261j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f47259g.addMovement(motionEvent);
                        this.f47259g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f47259g.getXVelocity()), Math.abs(this.f47259g.getYVelocity())) >= this.f47258f) {
                            this.f47256b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f47259g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f47259g = null;
                }
                this.f47263l = false;
                return;
            }
        }
        if (!this.f47263l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f47259g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f47261j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f47257c = x11;
            try {
                y11 = motionEvent.getY(this.f47261j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f47263l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f47261j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f47261j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f47257c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.e) {
                z4 = false;
            }
            this.h = z4;
        }
        if (this.h) {
            n nVar = this.f47256b;
            if (!nVar.C) {
                l.f(nVar.I, f10, f11);
                nVar.r(false);
            }
            this.f47257c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f47259g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
