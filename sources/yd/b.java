package yd;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import vf.d0;
public final class b {
    public final a f50850a;
    public d0 f50851b;
    public int f50852c;
    public float d;
    public float f50853e;
    public float f50854f;
    public float f50855g;

    public b(a aVar) {
        this.f50850a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f50850a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f50852c & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f50852c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y10);
                    if ((this.f50852c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y10, this.f50854f, this.f50855g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.f50853e - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f50852c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y10);
                        this.f50852c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y10);
                        if ((this.f50852c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f50852c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.needClickAt(view, x10, y10)) {
            this.f50852c |= 1;
            this.d = x10;
            this.f50853e = y10;
            aVar.onClickTouchDown(view, x10, y10);
            if (aVar.needLongPress(x10, y10) && view != null) {
                if (this.f50851b == null) {
                    this.f50852c |= 2;
                    d0 d0Var = new d0(15, this, view);
                    this.f50851b = d0Var;
                    view.postDelayed(d0Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f10, float f11) {
        int i10 = this.f50852c;
        if ((i10 & 2) != 0) {
            this.f50852c = i10 & (-3);
            d0 d0Var = this.f50851b;
            if (d0Var != null) {
                view.removeCallbacks(d0Var);
                this.f50851b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f50852c;
        int i12 = i11 & 8;
        a aVar = this.f50850a;
        if (i12 != 0) {
            this.f50852c = i11 & (-9);
            aVar.onLongPressCancelled(view, f10, f11);
        }
        if ((this.f50852c & 4) != 0) {
            aVar.onLongPressFinish(view, f10, f11);
            this.f50852c &= -5;
        }
        if ((this.f50852c & 1) != 0) {
            aVar.onClickTouchUp(view, f10, f11);
            this.f50852c &= -2;
        }
    }
}
