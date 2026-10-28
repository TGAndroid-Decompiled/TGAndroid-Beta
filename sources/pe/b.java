package pe;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.Wallet.a6;
public final class b {
    public final a f46871a;
    public a6 f46872b;
    public int f46873c;
    public float d;
    public float e;
    public float f46874f;
    public float f46875g;

    public b(a aVar) {
        this.f46871a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f46871a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f46873c & 1) != 0) {
                        b(view, x9, y3);
                        return true;
                    }
                } else if ((this.f46873c & 1) != 0) {
                    aVar.onClickTouchMove(view, x9, y3);
                    if ((this.f46873c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x9, y3, this.f46874f, this.f46875g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x9), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x9, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f46873c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x9, y3);
                        this.f46873c &= -5;
                    } else {
                        aVar.onClickAt(view, x9, y3);
                        if ((this.f46873c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x9, y3);
                    return true;
                }
            }
            if ((this.f46873c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x9, y3);
        if (aVar.needClickAt(view, x9, y3)) {
            this.f46873c |= 1;
            this.d = x9;
            this.e = y3;
            aVar.onClickTouchDown(view, x9, y3);
            if (aVar.needLongPress(x9, y3) && view != null) {
                if (this.f46872b == null) {
                    this.f46873c |= 2;
                    a6 a6Var = new a6(22, this, view);
                    this.f46872b = a6Var;
                    view.postDelayed(a6Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f46873c;
        if ((i10 & 2) != 0) {
            this.f46873c = i10 & (-3);
            a6 a6Var = this.f46872b;
            if (a6Var != null) {
                view.removeCallbacks(a6Var);
                this.f46872b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f46873c;
        int i12 = i11 & 8;
        a aVar = this.f46871a;
        if (i12 != 0) {
            this.f46873c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f46873c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f46873c &= -5;
        }
        if ((this.f46873c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f46873c &= -2;
        }
    }
}
