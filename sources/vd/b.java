package vd;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import rh.o2;

public final class b {

    public final a f48875a;

    public o2 f48876b;

    public int f48877c;
    public float d;

    public float f48878e;

    public float f48879f;

    public float f48880g;

    public b(a aVar) {
        this.f48875a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f48875a;
        if (action == 0) {
            b(view, x8, y10);
            if (aVar.needClickAt(view, x8, y10)) {
                this.f48877c |= 1;
                this.d = x8;
                this.f48878e = y10;
                aVar.onClickTouchDown(view, x8, y10);
                if (aVar.needLongPress(x8, y10) && view != null) {
                    if (this.f48876b != null) {
                        throw new AssertionError();
                    }
                    this.f48877c |= 2;
                    o2 o2Var = new o2(5, this, view);
                    this.f48876b = o2Var;
                    view.postDelayed(o2Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.f48877c;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.onLongPressFinish(view, x8, y10);
                    this.f48877c &= -5;
                } else {
                    aVar.onClickAt(view, x8, y10);
                    if ((this.f48877c & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x8, y10);
                return true;
            }
        } else {
            if (action == 2) {
                if ((this.f48877c & 1) != 0) {
                    aVar.onClickTouchMove(view, x8, y10);
                    if ((this.f48877c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x8, y10, this.f48879f, this.f48880g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x8), Math.abs(this.f48878e - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x8, y10);
                        return true;
                    }
                }
            }
            if (action == 3 && (this.f48877c & 1) != 0) {
                b(view, x8, y10);
                return true;
            }
        }
        return (this.f48877c & 1) != 0;
    }

    public final void b(View view, float f10, float f11) {
        int i10 = this.f48877c;
        if ((i10 & 2) != 0) {
            this.f48877c = i10 & (-3);
            o2 o2Var = this.f48876b;
            if (o2Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(o2Var);
            this.f48876b = null;
        }
        int i11 = this.f48877c;
        int i12 = i11 & 8;
        a aVar = this.f48875a;
        if (i12 != 0) {
            this.f48877c = i11 & (-9);
            aVar.onLongPressCancelled(view, f10, f11);
        }
        if ((this.f48877c & 4) != 0) {
            aVar.onLongPressFinish(view, f10, f11);
            this.f48877c &= -5;
        }
        if ((this.f48877c & 1) != 0) {
            aVar.onClickTouchUp(view, f10, f11);
            this.f48877c &= -2;
        }
    }
}
