package tg;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import ei.c7;
import org.telegram.ui.tf1;
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final int f47063a;
    public final View f47064b;

    public e(int i10, View view) {
        this.f47063a = i10;
        this.f47064b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f47063a) {
            case 0:
                f fVar = (f) this.f47064b;
                fVar.f47069n = true;
                fVar.b();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f47063a) {
            case 0:
                g gVar = ((f) this.f47064b).f47065a;
                gVar.d -= f7 * 0.5f;
                gVar.f47080i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f47063a;
        View view = this.f47064b;
        switch (i10) {
            case 0:
                f fVar = (f) view;
                g gVar = fVar.f47065a;
                if (Math.abs(gVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, fVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    fVar.b();
                    float f7 = gVar.d;
                    float f10 = gVar.f47080i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    fVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    fVar.d.addUpdateListener(new c7(this, f7, x10, f10, y3, 2));
                    fVar.d.addListener(new tf1(this, 17));
                    fVar.d.start();
                    return true;
                }
                return true;
            default:
                xh.i iVar = (xh.i) view;
                if (!iVar.e.f49859c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (iVar.e.f49860f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= iVar.e.f49860f.getRight() || iVar.e.f49860f.getTop() >= motionEvent.getY() || motionEvent.getY() >= iVar.e.f49860f.getBottom())) {
                    iVar.e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
