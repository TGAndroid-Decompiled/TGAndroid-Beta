package tg;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import di.l7;
import org.telegram.ui.fi1;
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final int f45691a;
    public final View f45692b;

    public e(int i10, View view) {
        this.f45691a = i10;
        this.f45692b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f45691a) {
            case 0:
                f fVar = (f) this.f45692b;
                fVar.f45697n = true;
                fVar.b();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f45691a) {
            case 0:
                g gVar = ((f) this.f45692b).f45693a;
                gVar.d -= f7 * 0.5f;
                gVar.f45708i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f45691a;
        View view = this.f45692b;
        switch (i10) {
            case 0:
                f fVar = (f) view;
                g gVar = fVar.f45693a;
                if (Math.abs(gVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, fVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    fVar.b();
                    float f7 = gVar.d;
                    float f10 = gVar.f45708i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    fVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    fVar.d.addUpdateListener(new l7(this, f7, x10, f10, y3, 2));
                    fVar.d.addListener(new fi1(this, 15));
                    fVar.d.start();
                    return true;
                }
                return true;
            default:
                xh.j jVar = (xh.j) view;
                if (!jVar.e.f48466c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (jVar.e.f48467f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= jVar.e.f48467f.getRight() || jVar.e.f48467f.getTop() >= motionEvent.getY() || motionEvent.getY() >= jVar.e.f48467f.getBottom())) {
                    jVar.e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
