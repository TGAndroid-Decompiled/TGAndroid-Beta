package sg;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import ci.m7;
import org.telegram.ui.Wallet.w4;
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final int f48025a;
    public final View f48026b;

    public e(int i10, View view) {
        this.f48025a = i10;
        this.f48026b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f48025a) {
            case 0:
                f fVar = (f) this.f48026b;
                fVar.f48032n = true;
                fVar.b();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f48025a) {
            case 0:
                g gVar = ((f) this.f48026b).f48027a;
                gVar.d -= f7 * 0.5f;
                gVar.f48044i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f48025a;
        View view = this.f48026b;
        switch (i10) {
            case 0:
                f fVar = (f) view;
                g gVar = fVar.f48027a;
                if (Math.abs(gVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, fVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    fVar.b();
                    float f7 = gVar.d;
                    float f10 = gVar.f48044i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    fVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    fVar.d.addUpdateListener(new m7(this, f7, x10, f10, y3, 2));
                    fVar.d.addListener(new w4(this, 12));
                    fVar.d.start();
                    return true;
                }
                return true;
            default:
                wh.j jVar = (wh.j) view;
                if (!jVar.f50414e.f50417c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (jVar.f50414e.f50419f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= jVar.f50414e.f50419f.getRight() || jVar.f50414e.f50419f.getTop() >= motionEvent.getY() || motionEvent.getY() >= jVar.f50414e.f50419f.getBottom())) {
                    jVar.f50414e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
