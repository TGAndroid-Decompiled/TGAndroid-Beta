package yf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hg0;
public final class b {
    public final ScaleGestureDetector f47191a;
    public n f47192b;
    public float f47193c;
    public float d;
    public final float f47194f;
    public VelocityTracker f47195g;
    public boolean h;
    public long f47198k;
    public boolean f47199l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int f47196i = -1;
    public int f47197j = 0;

    public b(Context context) {
        this.f47194f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f47191a = new ScaleGestureDetector(context, new hg0(this, 2));
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
        this.f47191a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z4 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f47196i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f47196i = motionEvent.getPointerId(i10);
                        this.f47193c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f47198k < 800 && (mVar = this.f47192b.J) != null) {
                    mVar.c0();
                }
                this.f47196i = -1;
            }
        } else {
            this.f47196i = motionEvent.getPointerId(0);
            this.f47198k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f47196i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f47197j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f47195g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f47195g = null;
                        }
                        this.f47199l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f47195g != null) {
                        try {
                            x12 = motionEvent.getX(this.f47197j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f47193c = x12;
                        try {
                            y12 = motionEvent.getY(this.f47197j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f47195g.addMovement(motionEvent);
                        this.f47195g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f47195g.getXVelocity()), Math.abs(this.f47195g.getYVelocity())) >= this.f47194f) {
                            this.f47192b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f47195g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f47195g = null;
                }
                this.f47199l = false;
                return;
            }
        }
        if (!this.f47199l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f47195g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f47197j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f47193c = x11;
            try {
                y11 = motionEvent.getY(this.f47197j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f47199l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f47197j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f47197j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f47193c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.e) {
                z4 = false;
            }
            this.h = z4;
        }
        if (this.h) {
            n nVar = this.f47192b;
            if (!nVar.C) {
                l.f(nVar.I, f10, f11);
                nVar.r(false);
            }
            this.f47193c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f47195g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
