package tf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mf0;
public final class b {
    public final ScaleGestureDetector f47842a;
    public n f47843b;
    public float f47844c;
    public float d;
    public final float f47846f;
    public VelocityTracker f47847g;
    public boolean h;
    public long f47850k;
    public boolean f47851l;
    public final float f47845e = AndroidUtilities.dp(1.0f);
    public int f47848i = -1;
    public int f47849j = 0;

    public b(Context context) {
        this.f47846f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f47842a = new ScaleGestureDetector(context, new mf0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y10;
        float x11;
        float y11;
        float x12;
        float y12;
        m mVar;
        int i9;
        this.f47842a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f47848i) {
                        if (action2 == 0) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        this.f47848i = motionEvent.getPointerId(i9);
                        this.f47844c = motionEvent.getX(i9);
                        this.d = motionEvent.getY(i9);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f47850k < 800 && (mVar = this.f47843b.I) != null) {
                    mVar.F();
                }
                this.f47848i = -1;
            }
        } else {
            this.f47848i = motionEvent.getPointerId(0);
            this.f47850k = SystemClock.elapsedRealtime();
        }
        int i10 = this.f47848i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f47849j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f47847g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f47847g = null;
                        }
                        this.f47851l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f47847g != null) {
                        try {
                            x12 = motionEvent.getX(this.f47849j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f47844c = x12;
                        try {
                            y12 = motionEvent.getY(this.f47849j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f47847g.addMovement(motionEvent);
                        this.f47847g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f47847g.getXVelocity()), Math.abs(this.f47847g.getYVelocity())) >= this.f47846f) {
                            this.f47843b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f47847g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f47847g = null;
                }
                this.f47851l = false;
                return;
            }
        }
        if (!this.f47851l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f47847g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f47849j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f47844c = x11;
            try {
                y11 = motionEvent.getY(this.f47849j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f47851l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f47849j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f47849j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f47844c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f47845e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            n nVar = this.f47843b;
            if (!nVar.B) {
                l.f(nVar.H, f10, f11);
                nVar.r(false);
            }
            this.f47844c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f47847g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
