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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.vy;
import tg.f0;
import ug.w0;
import ug.y0;
public final class h extends FrameLayout {
    public final int f53627a;
    public final Object f53628b;
    public final Object f53629c;

    public h(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f53627a = i7;
        this.f53629c = obj;
        this.f53628b = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f53627a) {
            case 1:
                c0 c0Var = (c0) this.f53629c;
                c0Var.b(l6.r1(0.65f, l6.w0(l6.f27865d6, (g6) this.f53628b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 2:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                ((y0) this.f53628b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = g0.P;
                rectF.set(0.0f, g0.L(2.0f), getMeasuredWidth(), g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                y0 y0Var = (y0) this.f53628b;
                y0Var.f56881f.setAlpha(((w0) this.f53629c).B1);
                canvas.drawRoundRect(rectF, g0.L(24.0f) - 1, g0.L(24.0f) - 1, y0Var.f56881f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f53627a) {
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
        switch (this.f53627a) {
            case 2:
                Path path = (Path) this.f53628b;
                f0 f0Var = (f0) this.f53629c;
                if (f0Var.h != null && (((z9 = f0Var.f55668f) && view == f0Var.d) || (!z9 && view == f0Var.f55666c))) {
                    if (z9) {
                        f10 = f0Var.f55667e;
                    } else {
                        f10 = 1.0f - f0Var.f55667e;
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
        switch (this.f53627a) {
            case 0:
                super.invalidate();
                ((j) this.f53629c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f53627a) {
            case 3:
                super.onMeasure(i7, q.B(2.0f, ((w0) this.f53629c).f56862q1, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f53627a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                c0 c0Var = (c0) this.f53629c;
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
        switch (this.f53627a) {
            case 0:
                j jVar = (j) this.f53629c;
                d dVar = jVar.f53642r;
                boolean onTouchEvent = ((GestureDetector) ((vy) this.f53628b).f39835b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    g0.i3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    g0.r(dVar);
                    if (!jVar.h) {
                        r1.h hVar = jVar.f53638c.f54280m;
                        if (((float) hVar.f54288i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.f54288i = j.a(displayMetrics, f10);
                        jVar.d.f54280m.f54288i = j.b(getResources().getDisplayMetrics(), (float) jVar.d.f54280m.f54288i);
                        jVar.f53638c.h();
                        jVar.d.h();
                    }
                    jVar.f53641n = false;
                    jVar.f53640f = false;
                    jVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f53627a) {
            case 0:
                super.setTranslationX(f10);
                ((j) this.f53629c).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f53627a) {
            case 0:
                super.setTranslationY(f10);
                ((j) this.f53629c).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public h(int i7, Context context, g6 g6Var) {
        super(context);
        this.f53627a = i7;
        switch (i7) {
            case 4:
                super(context);
                LinearLayout f10 = k5.f(context, 1);
                j6 j6Var = new j6(context, false, false, false);
                this.f53628b = j6Var;
                int i10 = l6.G6;
                s6.Y(j6Var, i10, g6Var);
                j6Var.setTextSize(g0.L(17.0f));
                j6Var.setTypeface(g0.o());
                f10.addView(j6Var, ha.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f53629c = textView;
                textView.setTextSize(1, 11.0f);
                s6.U(textView, i10, g6Var);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, ha.r(-2, -2, 1));
                addView(f10, ha.e(-2, -2, 17));
                return;
            default:
                this.f53629c = new c0(8);
                this.f53628b = g6Var;
                return;
        }
    }

    public h(f0 f0Var, Context context) {
        super(context);
        this.f53627a = 2;
        this.f53629c = f0Var;
        this.f53628b = new Path();
    }
}
