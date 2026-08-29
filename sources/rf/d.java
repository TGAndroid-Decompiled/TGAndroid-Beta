package rf;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class d extends FrameLayout {
    public final int f47187a;
    public final Object f47188b;
    public final Object f47189c;

    public d(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f47187a = i10;
        this.f47189c = obj;
        this.f47188b = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f47187a) {
            case 2:
                jf.b0 b0Var = (jf.b0) this.f47189c;
                b0Var.b(g6.l1(0.65f, g6.v0(g6.f23062d6, (c6) this.f47188b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47187a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f47187a) {
            case 1:
                super.invalidate();
                ((xf.j) this.f47189c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int dp;
        switch (this.f47187a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f47188b;
                e eVar = (e) this.f47189c;
                if (eVar.G && eVar.F) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i12 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.A && !eVar.f47204w) {
                    dp += dp2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f47187a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                jf.b0 b0Var = (jf.b0) this.f47189c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f9;
        switch (this.f47187a) {
            case 1:
                xf.j jVar = (xf.j) this.f47189c;
                xf.d dVar = jVar.f50147r;
                boolean onTouchEvent = ((GestureDetector) ((o4.g) this.f47188b).f19159b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    if (!jVar.h) {
                        o1.l lVar = jVar.f50143c.f19045u;
                        if (((float) lVar.f19052i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f9 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f9 = -2.1474836E9f;
                        }
                        lVar.f19052i = xf.j.a(displayMetrics, f9);
                        jVar.d.f19045u.f19052i = xf.j.b(getResources().getDisplayMetrics(), (float) jVar.d.f19045u.f19052i);
                        jVar.f50143c.f();
                        jVar.d.f();
                    }
                    jVar.f50146n = false;
                    jVar.f50145f = false;
                    jVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f9) {
        switch (this.f47187a) {
            case 1:
                super.setTranslationX(f9);
                ((xf.j) this.f47189c).invalidate();
                return;
            default:
                super.setTranslationX(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f47187a) {
            case 1:
                super.setTranslationY(f9);
                ((xf.j) this.f47189c).invalidate();
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public d(Context context, c6 c6Var) {
        super(context);
        this.f47187a = 2;
        this.f47189c = new jf.b0(8);
        this.f47188b = c6Var;
    }
}
