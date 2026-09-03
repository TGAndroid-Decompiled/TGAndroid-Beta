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
    public final ScaleGestureDetector f51139a;
    public n f51140b;
    public float f51141c;
    public float d;
    public final float f51143f;
    public VelocityTracker f51144g;
    public boolean h;
    public long f51147k;
    public boolean f51148l;
    public final float f51142e = AndroidUtilities.dp(1.0f);
    public int f51145i = -1;
    public int f51146j = 0;

    public b(Context context) {
        this.f51143f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f51139a = new ScaleGestureDetector(context, new jg0(this, 2));
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
        this.f51139a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z4 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f51145i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f51145i = motionEvent.getPointerId(i10);
                        this.f51141c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f51147k < 800 && (mVar = this.f51140b.J) != null) {
                    mVar.S();
                }
                this.f51145i = -1;
            }
        } else {
            this.f51145i = motionEvent.getPointerId(0);
            this.f51147k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f51145i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f51146j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f51144g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f51144g = null;
                        }
                        this.f51148l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f51144g != null) {
                        try {
                            x12 = motionEvent.getX(this.f51146j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f51141c = x12;
                        try {
                            y12 = motionEvent.getY(this.f51146j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f51144g.addMovement(motionEvent);
                        this.f51144g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f51144g.getXVelocity()), Math.abs(this.f51144g.getYVelocity())) >= this.f51143f) {
                            this.f51140b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f51144g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f51144g = null;
                }
                this.f51148l = false;
                return;
            }
        }
        if (!this.f51148l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f51144g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f51146j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f51141c = x11;
            try {
                y11 = motionEvent.getY(this.f51146j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f51148l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f51146j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f51146j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f51141c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f51142e) {
                z4 = false;
            }
            this.h = z4;
        }
        if (this.h) {
            n nVar = this.f51140b;
            if (!nVar.C) {
                l.f(nVar.I, f10, f11);
                nVar.r(false);
            }
            this.f51141c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f51144g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
