package uf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf0;

public final class b {

    public final ScaleGestureDetector f48564a;

    public n f48565b;

    public float f48566c;
    public float d;

    public final float f48568f;

    public VelocityTracker f48569g;
    public boolean h;

    public long f48572k;

    public boolean f48573l;

    public final float f48567e = AndroidUtilities.dp(1.0f);

    public int f48570i = -1;

    public int f48571j = 0;

    public b(Context context) {
        this.f48568f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f48564a = new ScaleGestureDetector(context, new pf0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x8;
        float y10;
        float x10;
        float y11;
        float x11;
        float y12;
        m mVar;
        this.f48564a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f48570i = motionEvent.getPointerId(0);
            this.f48572k = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.h && SystemClock.elapsedRealtime() - this.f48572k < 800 && (mVar = this.f48565b.I) != null) {
                mVar.H();
            }
            this.f48570i = -1;
        } else if (action == 6) {
            int action2 = (65280 & motionEvent.getAction()) >> 8;
            if (motionEvent.getPointerId(action2) == this.f48570i) {
                int i10 = action2 == 0 ? 1 : 0;
                this.f48570i = motionEvent.getPointerId(i10);
                this.f48566c = motionEvent.getX(i10);
                this.d = motionEvent.getY(i10);
            }
        }
        int i11 = this.f48570i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f48571j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 == 1) {
                if (this.h) {
                    if (this.f48569g != null) {
                        try {
                            x11 = motionEvent.getX(this.f48571j);
                        } catch (Exception unused) {
                            x11 = motionEvent.getX();
                        }
                        this.f48566c = x11;
                        try {
                            y12 = motionEvent.getY(this.f48571j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f48569g.addMovement(motionEvent);
                        this.f48569g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f48569g.getXVelocity()), Math.abs(this.f48569g.getYVelocity())) >= this.f48568f) {
                            this.f48565b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker = this.f48569g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f48569g = null;
                }
                this.f48573l = false;
                return;
            }
            if (action3 != 2) {
                if (action3 != 3) {
                    return;
                }
                VelocityTracker velocityTracker2 = this.f48569g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f48569g = null;
                }
                this.f48573l = false;
                this.h = false;
                return;
            }
        }
        if (!this.f48573l) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f48569g = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x10 = motionEvent.getX(this.f48571j);
            } catch (Exception unused3) {
                x10 = motionEvent.getX();
            }
            this.f48566c = x10;
            try {
                y11 = motionEvent.getY(this.f48571j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f48573l = true;
            return;
        }
        try {
            x8 = motionEvent.getX(this.f48571j);
        } catch (Exception unused5) {
            x8 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f48571j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x8 - this.f48566c;
        float f11 = y10 - this.d;
        if (!this.h) {
            this.h = ((float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)))) >= this.f48567e;
        }
        if (this.h) {
            n nVar = this.f48565b;
            if (!nVar.B) {
                l.f(nVar.H, f10, f11);
                nVar.r(false);
            }
            this.f48566c = x8;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f48569g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
