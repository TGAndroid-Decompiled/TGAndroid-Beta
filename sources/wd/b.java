package wd;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import sf.o1;
public final class b {
    public final a f49850a;
    public o1 f49851b;
    public int f49852c;
    public float d;
    public float f49853e;
    public float f49854f;
    public float f49855g;

    public b(a aVar) {
        this.f49850a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f49850a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f49852c & 1) != 0) {
                        b(view, x4, y8);
                        return true;
                    }
                } else if ((this.f49852c & 1) != 0) {
                    aVar.onClickTouchMove(view, x4, y8);
                    if ((this.f49852c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x4, y8, this.f49854f, this.f49855g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x4), Math.abs(this.f49853e - y8)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x4, y8);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f49852c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x4, y8);
                        this.f49852c &= -5;
                    } else {
                        aVar.onClickAt(view, x4, y8);
                        if ((this.f49852c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x4, y8);
                    return true;
                }
            }
            if ((this.f49852c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x4, y8);
        if (aVar.needClickAt(view, x4, y8)) {
            this.f49852c |= 1;
            this.d = x4;
            this.f49853e = y8;
            aVar.onClickTouchDown(view, x4, y8);
            if (aVar.needLongPress(x4, y8) && view != null) {
                if (this.f49851b == null) {
                    this.f49852c |= 2;
                    o1 o1Var = new o1(12, this, view);
                    this.f49851b = o1Var;
                    view.postDelayed(o1Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f9, float f10) {
        int i10 = this.f49852c;
        if ((i10 & 2) != 0) {
            this.f49852c = i10 & (-3);
            o1 o1Var = this.f49851b;
            if (o1Var != null) {
                view.removeCallbacks(o1Var);
                this.f49851b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f49852c;
        int i12 = i11 & 8;
        a aVar = this.f49850a;
        if (i12 != 0) {
            this.f49852c = i11 & (-9);
            aVar.onLongPressCancelled(view, f9, f10);
        }
        if ((this.f49852c & 4) != 0) {
            aVar.onLongPressFinish(view, f9, f10);
            this.f49852c &= -5;
        }
        if ((this.f49852c & 1) != 0) {
            aVar.onClickTouchUp(view, f9, f10);
            this.f49852c &= -2;
        }
    }
}
