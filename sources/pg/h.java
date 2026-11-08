package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.c0;
import c8.ha;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.vy;
import tg.f0;
import ug.w0;
import ug.y0;
public final class h extends FrameLayout {
    public final int f53615a;
    public final Object f53616b;
    public final Object f53617c;

    public h(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f53615a = i7;
        this.f53617c = obj;
        this.f53616b = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f53615a) {
            case 1:
                c0 c0Var = (c0) this.f53617c;
                c0Var.b(k6.r1(0.65f, k6.w0(k6.f27852d6, (f6) this.f53616b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 2:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                ((y0) this.f53616b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = g0.P;
                rectF.set(0.0f, g0.L(2.0f), getMeasuredWidth(), g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                y0 y0Var = (y0) this.f53616b;
                y0Var.f56869f.setAlpha(((w0) this.f53617c).B1);
                canvas.drawRoundRect(rectF, g0.L(24.0f) - 1, g0.L(24.0f) - 1, y0Var.f56869f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f53615a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        float f10;
        switch (this.f53615a) {
            case 2:
                Path path = (Path) this.f53616b;
                f0 f0Var = (f0) this.f53617c;
                if (f0Var.h != null && (((z9 = f0Var.f55656f) && view == f0Var.d) || (!z9 && view == f0Var.f55654c))) {
                    if (z9) {
                        f10 = f0Var.f55655e;
                    } else {
                        f10 = 1.0f - f0Var.f55655e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f53615a) {
            case 0:
                super.invalidate();
                ((j) this.f53617c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f53615a) {
            case 3:
                super.onMeasure(i7, q.B(2.0f, ((w0) this.f53617c).f56850q1, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f53615a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                c0 c0Var = (c0) this.f53617c;
                c0Var.setBounds(0, 0, i7, i10);
                c0Var.c(0, g0.L(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.f53615a) {
            case 0:
                j jVar = (j) this.f53617c;
                d dVar = jVar.f53630r;
                boolean onTouchEvent = ((GestureDetector) ((vy) this.f53616b).f39747b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    g0.i3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    g0.r(dVar);
                    if (!jVar.h) {
                        r1.h hVar = jVar.f53626c.f54268m;
                        if (((float) hVar.f54276i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.f54276i = j.a(displayMetrics, f10);
                        jVar.d.f54268m.f54276i = j.b(getResources().getDisplayMetrics(), (float) jVar.d.f54268m.f54276i);
                        jVar.f53626c.h();
                        jVar.d.h();
                    }
                    jVar.f53629n = false;
                    jVar.f53628f = false;
                    jVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f53615a) {
            case 0:
                super.setTranslationX(f10);
                ((j) this.f53617c).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f53615a) {
            case 0:
                super.setTranslationY(f10);
                ((j) this.f53617c).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public h(int i7, Context context, f6 f6Var) {
        super(context);
        this.f53615a = i7;
        switch (i7) {
            case 4:
                super(context);
                LinearLayout f10 = k5.f(context, 1);
                j6 j6Var = new j6(context, false, false, false);
                this.f53616b = j6Var;
                int i10 = k6.G6;
                r6.Z(j6Var, i10, f6Var);
                j6Var.setTextSize(g0.L(17.0f));
                j6Var.setTypeface(g0.o());
                f10.addView(j6Var, ha.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f53617c = textView;
                textView.setTextSize(1, 11.0f);
                r6.V(textView, i10, f6Var);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, ha.r(-2, -2, 1));
                addView(f10, ha.e(-2, -2, 17));
                return;
            default:
                this.f53617c = new c0(8);
                this.f53616b = f6Var;
                return;
        }
    }

    public h(f0 f0Var, Context context) {
        super(context);
        this.f53615a = 2;
        this.f53617c = f0Var;
        this.f53616b = new Path();
    }
}
