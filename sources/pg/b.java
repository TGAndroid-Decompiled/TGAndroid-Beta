package pg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ee0;
public final class b {
    public final ScaleGestureDetector f53450a;
    public m f53451b;
    public float f53452c;
    public float d;
    public final float f53454f;
    public VelocityTracker f53455g;
    public boolean h;
    public long f53458k;
    public boolean f53459l;
    public final float f53453e = g0.L(1.0f);
    public int f53456i = -1;
    public int f53457j = 0;

    public b(Context context) {
        this.f53454f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f53450a = new ScaleGestureDetector(context, new ee0(this, 2));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y9;
        float x11;
        float y10;
        float x12;
        float y11;
        l lVar;
        int i3;
        this.f53450a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f53456i) {
                        if (action2 == 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        this.f53456i = motionEvent.getPointerId(i3);
                        this.f53452c = motionEvent.getX(i3);
                        this.d = motionEvent.getY(i3);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f53458k < 800 && (lVar = this.f53451b.N) != null) {
                    lVar.S();
                }
                this.f53456i = -1;
            }
        } else {
            this.f53456i = motionEvent.getPointerId(0);
            this.f53458k = SystemClock.elapsedRealtime();
        }
        int i10 = this.f53456i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f53457j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f53455g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f53455g = null;
                        }
                        this.f53459l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f53455g != null) {
                        try {
                            x12 = motionEvent.getX(this.f53457j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f53452c = x12;
                        try {
                            y11 = motionEvent.getY(this.f53457j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f53455g.addMovement(motionEvent);
                        this.f53455g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f53455g.getXVelocity()), Math.abs(this.f53455g.getYVelocity())) >= this.f53454f) {
                            this.f53451b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f53455g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f53455g = null;
                }
                this.f53459l = false;
                return;
            }
        }
        if (!this.f53459l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f53455g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f53457j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f53452c = x11;
            try {
                y10 = motionEvent.getY(this.f53457j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f53459l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f53457j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y9 = motionEvent.getY(this.f53457j);
        } catch (Exception unused6) {
            y9 = motionEvent.getY();
        }
        float f10 = x10 - this.f53452c;
        float f11 = y9 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f53453e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            m mVar = this.f53451b;
            if (!mVar.G) {
                k.f(mVar.M, f10, f11);
                mVar.r(false);
            }
            this.f53452c = x10;
            this.d = y9;
            VelocityTracker velocityTracker3 = this.f53455g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
