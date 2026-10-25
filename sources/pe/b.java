package pe;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.Wallet.q6;
public final class b {
    public final a f46833a;
    public q6 f46834b;
    public int f46835c;
    public float d;
    public float e;
    public float f46836f;
    public float f46837g;

    public b(a aVar) {
        this.f46833a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.f46833a;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f46835c & 1) != 0) {
                        b(view, x9, y3);
                        return true;
                    }
                } else if ((this.f46835c & 1) != 0) {
                    aVar.onClickTouchMove(view, x9, y3);
                    if ((this.f46835c & 4) != 0) {
                        aVar.onLongPressMove(view, motionEvent, x9, y3, this.f46836f, this.f46837g);
                        return true;
                    }
                    if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x9), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x9, y3);
                        return true;
                    }
                    return true;
                }
            } else {
                int i10 = this.f46835c;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        aVar.onLongPressFinish(view, x9, y3);
                        this.f46835c &= -5;
                    } else {
                        aVar.onClickAt(view, x9, y3);
                        if ((this.f46835c & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x9, y3);
                    return true;
                }
            }
            if ((this.f46835c & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x9, y3);
        if (aVar.needClickAt(view, x9, y3)) {
            this.f46835c |= 1;
            this.d = x9;
            this.e = y3;
            aVar.onClickTouchDown(view, x9, y3);
            if (aVar.needLongPress(x9, y3) && view != null) {
                if (this.f46834b == null) {
                    this.f46835c |= 2;
                    q6 q6Var = new q6(21, this, view);
                    this.f46834b = q6Var;
                    view.postDelayed(q6Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.f46835c;
        if ((i10 & 2) != 0) {
            this.f46835c = i10 & (-3);
            q6 q6Var = this.f46834b;
            if (q6Var != null) {
                view.removeCallbacks(q6Var);
                this.f46834b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f46835c;
        int i12 = i11 & 8;
        a aVar = this.f46833a;
        if (i12 != 0) {
            this.f46835c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.f46835c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.f46835c &= -5;
        }
        if ((this.f46835c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.f46835c &= -2;
        }
    }
}
