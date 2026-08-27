package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import gf.c0;
import m5.o;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;
import zf.k0;

public final class g extends FrameLayout {

    public final int f48897a = 1;

    public final Object f48898b;

    public final Object f48899c;

    public g(Context context, c6 c6Var) {
        super(context);
        this.f48899c = new c0(8);
        this.f48898b = c6Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48897a) {
            case 1:
                c0 c0Var = (c0) this.f48899c;
                c0Var.b(g6.l1(0.65f, g6.v0(g6.f23053d6, (c6) this.f48898b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f48897a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.f48897a) {
            case 2:
                Path path = (Path) this.f48898b;
                k0 k0Var = (k0) this.f48899c;
                if (k0Var.h == null || (!((z10 = k0Var.f50480f) && view == k0Var.d) && (z10 || view != k0Var.f50478c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? k0Var.f50479e : 1.0f - k0Var.f50479e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f48897a) {
            case 0:
                super.invalidate();
                ((i) this.f48899c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f48897a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                c0 c0Var = (c0) this.f48899c;
                c0Var.setBounds(0, 0, i10, i11);
                c0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.f48897a) {
            case 0:
                i iVar = (i) this.f48899c;
                c cVar = iVar.f48912r;
                boolean zOnTouchEvent = ((GestureDetector) ((o) this.f48898b).f17823b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!iVar.h) {
                        k kVar = iVar.f48908c.f19147u;
                        if (((float) kVar.f19154i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        kVar.f19154i = i.a(displayMetrics, f10);
                        iVar.d.f19147u.f19154i = i.b(getResources().getDisplayMetrics(), (float) iVar.d.f19147u.f19154i);
                        iVar.f48908c.f();
                        iVar.d.f();
                    }
                    iVar.f48911n = false;
                    iVar.f48910f = false;
                    iVar.h = false;
                }
                return zOnTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f48897a) {
            case 0:
                super.setTranslationX(f10);
                ((i) this.f48899c).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f48897a) {
            case 0:
                super.setTranslationY(f10);
                ((i) this.f48899c).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public g(i iVar, LaunchActivity launchActivity, o oVar) {
        super(launchActivity);
        this.f48899c = iVar;
        this.f48898b = oVar;
    }

    public g(k0 k0Var, Context context) {
        super(context);
        this.f48899c = k0Var;
        this.f48898b = new Path();
    }
}
