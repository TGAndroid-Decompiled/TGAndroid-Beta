package ud;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.ai1;
public final class b {
    public final a f48190a;
    public ai1 f48191b;
    public int f48192c;
    public float d;
    public float f48193e;
    public float f48194f;
    public float f48195g;

    public b(a aVar) {
        this.f48190a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f48190a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f48192c & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f48192c & 1) != 0) {
                    aVar.onClickTouchMove(view, x10, y10);
                    if ((this.f48192c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x10, y10, this.f48194f, this.f48195g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.f48193e - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i9 = this.f48192c;
                if ((i9 & 1) != 0) {
                    if ((i9 & 4) != 0) {
                        aVar.onLongPressFinish(view, x10, y10);
                        this.f48192c &= -5;
                    } else {
                        aVar.onClickAt(view, x10, y10);
                        if ((this.f48192c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f48192c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.needClickAt(view, x10, y10)) {
            this.f48192c |= 1;
            this.d = x10;
            this.f48193e = y10;
            aVar.onClickTouchDown(view, x10, y10);
            if (aVar.needLongPress(x10, y10) && view != null) {
                if (this.f48191b == null) {
                    this.f48192c |= 2;
                    ai1 ai1Var = new ai1(29, this, view);
                    this.f48191b = ai1Var;
                    view.postDelayed(ai1Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f10, float f11) {
        int i9 = this.f48192c;
        if ((i9 & 2) != 0) {
            this.f48192c = i9 & (-3);
            ai1 ai1Var = this.f48191b;
            if (ai1Var != null) {
                view.removeCallbacks(ai1Var);
                this.f48191b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f48192c;
        int i11 = i10 & 8;
        a aVar = this.f48190a;
        if (i11 != 0) {
            this.f48192c = i10 & (-9);
            aVar.onLongPressCancelled(view, f10, f11);
        }
        if ((this.f48192c & 4) != 0) {
            aVar.onLongPressFinish(view, f10, f11);
            this.f48192c &= -5;
        }
        if ((this.f48192c & 1) != 0) {
            aVar.onClickTouchUp(view, f10, f11);
            this.f48192c &= -2;
        }
    }
}
