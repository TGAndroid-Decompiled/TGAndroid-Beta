package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz;
public final class z4 extends FrameLayout {
    public final int f42695a;
    public final Object f42696b;
    public final Object f42697c;

    public z4(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f42695a = i10;
        this.f42697c = obj;
        this.f42696b = obj2;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        float f10;
        switch (this.f42695a) {
            case 0:
                Path path = (Path) this.f42696b;
                a5 a5Var = (a5) this.f42697c;
                if (a5Var.h != null && (((z4 = a5Var.f41302f) && view == a5Var.d) || (!z4 && view == a5Var.f41301c))) {
                    if (z4) {
                        f10 = a5Var.e;
                    } else {
                        f10 = 1.0f - a5Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f42695a) {
            case 2:
                super.invalidate();
                ((zf.h) this.f42697c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int dp;
        switch (this.f42695a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f42696b;
                tf.d dVar = (tf.d) this.f42697c;
                if (dVar.H && dVar.G) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i12 = 0;
                if (dVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!dVar.B && !dVar.f44751w) {
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.f42695a) {
            case 2:
                zf.h hVar = (zf.h) this.f42697c;
                zf.c cVar = hVar.f47499r;
                boolean onTouchEvent = ((GestureDetector) ((zz) this.f42696b).f31508b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!hVar.h) {
                        o1.k kVar = hVar.f47496c.f16178u;
                        if (((float) kVar.f16184i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        kVar.f16184i = zf.h.a(displayMetrics, f10);
                        hVar.d.f16178u.f16184i = zf.h.b(getResources().getDisplayMetrics(), (float) hVar.d.f16178u.f16184i);
                        hVar.f47496c.f();
                        hVar.d.f();
                    }
                    hVar.f47498n = false;
                    hVar.f47497f = false;
                    hVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f42695a) {
            case 2:
                super.setTranslationX(f10);
                ((zf.h) this.f42697c).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f42695a) {
            case 2:
                super.setTranslationY(f10);
                ((zf.h) this.f42697c).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public z4(a5 a5Var, Context context) {
        super(context);
        this.f42695a = 0;
        this.f42697c = a5Var;
        this.f42696b = new Path();
    }
}
