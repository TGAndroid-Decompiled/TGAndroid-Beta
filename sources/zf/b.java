package zf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jg0;
public final class b {
    public final ScaleGestureDetector f51104a;
    public n f51105b;
    public float f51106c;
    public float d;
    public final float f51108f;
    public VelocityTracker f51109g;
    public boolean h;
    public long f51112k;
    public boolean f51113l;
    public final float f51107e = AndroidUtilities.dp(1.0f);
    public int f51110i = -1;
    public int f51111j = 0;

    public b(Context context) {
        this.f51108f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f51104a = new ScaleGestureDetector(context, new jg0(this, 2));
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
        this.f51104a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z4 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f51110i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f51110i = motionEvent.getPointerId(i10);
                        this.f51106c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f51112k < 800 && (mVar = this.f51105b.J) != null) {
                    mVar.S();
                }
                this.f51110i = -1;
            }
        } else {
            this.f51110i = motionEvent.getPointerId(0);
            this.f51112k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f51110i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f51111j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f51109g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f51109g = null;
                        }
                        this.f51113l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f51109g != null) {
                        try {
                            x12 = motionEvent.getX(this.f51111j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f51106c = x12;
                        try {
                            y12 = motionEvent.getY(this.f51111j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f51109g.addMovement(motionEvent);
                        this.f51109g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f51109g.getXVelocity()), Math.abs(this.f51109g.getYVelocity())) >= this.f51108f) {
                            this.f51105b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f51109g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f51109g = null;
                }
                this.f51113l = false;
                return;
            }
        }
        if (!this.f51113l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f51109g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f51111j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f51106c = x11;
            try {
                y11 = motionEvent.getY(this.f51111j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f51113l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f51111j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f51111j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f51106c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f51107e) {
                z4 = false;
            }
            this.h = z4;
        }
        if (this.h) {
            n nVar = this.f51105b;
            if (!nVar.C) {
                l.f(nVar.I, f10, f11);
                nVar.r(false);
            }
            this.f51106c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f51109g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
