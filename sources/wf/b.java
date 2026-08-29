package wf;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yf0;
public final class b {
    public final ScaleGestureDetector f49891a;
    public n f49892b;
    public float f49893c;
    public float d;
    public final float f49895f;
    public VelocityTracker f49896g;
    public boolean h;
    public long f49899k;
    public boolean f49900l;
    public final float f49894e = AndroidUtilities.dp(1.0f);
    public int f49897i = -1;
    public int f49898j = 0;

    public b(Context context) {
        this.f49895f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f49891a = new ScaleGestureDetector(context, new yf0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x4;
        float y8;
        float x10;
        float y10;
        float x11;
        float y11;
        m mVar;
        int i10;
        this.f49891a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f49897i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f49897i = motionEvent.getPointerId(i10);
                        this.f49893c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f49899k < 800 && (mVar = this.f49892b.I) != null) {
                    mVar.R();
                }
                this.f49897i = -1;
            }
        } else {
            this.f49897i = motionEvent.getPointerId(0);
            this.f49899k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f49897i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f49898j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f49896g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f49896g = null;
                        }
                        this.f49900l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f49896g != null) {
                        try {
                            x11 = motionEvent.getX(this.f49898j);
                        } catch (Exception unused) {
                            x11 = motionEvent.getX();
                        }
                        this.f49893c = x11;
                        try {
                            y11 = motionEvent.getY(this.f49898j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f49896g.addMovement(motionEvent);
                        this.f49896g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f49896g.getXVelocity()), Math.abs(this.f49896g.getYVelocity())) >= this.f49895f) {
                            this.f49892b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f49896g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f49896g = null;
                }
                this.f49900l = false;
                return;
            }
        }
        if (!this.f49900l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f49896g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x10 = motionEvent.getX(this.f49898j);
            } catch (Exception unused3) {
                x10 = motionEvent.getX();
            }
            this.f49893c = x10;
            try {
                y10 = motionEvent.getY(this.f49898j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f49900l = true;
            return;
        }
        try {
            x4 = motionEvent.getX(this.f49898j);
        } catch (Exception unused5) {
            x4 = motionEvent.getX();
        }
        try {
            y8 = motionEvent.getY(this.f49898j);
        } catch (Exception unused6) {
            y8 = motionEvent.getY();
        }
        float f9 = x4 - this.f49893c;
        float f10 = y8 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f9 * f9))) < this.f49894e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            n nVar = this.f49892b;
            if (!nVar.B) {
                l.f(nVar.H, f9, f10);
                nVar.r(false);
            }
            this.f49893c = x4;
            this.d = y8;
            VelocityTracker velocityTracker3 = this.f49896g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
