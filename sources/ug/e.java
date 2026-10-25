package ug;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import fi.z6;
import org.telegram.ui.fc1;
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final int f49764a;
    public final View f49765b;

    public e(int i10, View view) {
        this.f49764a = i10;
        this.f49765b = view;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f49764a) {
            case 0:
                f fVar = (f) this.f49765b;
                fVar.f49770n = true;
                fVar.b();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.f49764a) {
            case 0:
                g gVar = ((f) this.f49765b).f49766a;
                gVar.d -= f7 * 0.5f;
                gVar.f49781i -= f10 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f49764a;
        View view = this.f49765b;
        switch (i10) {
            case 0:
                f fVar = (f) view;
                g gVar = fVar.f49766a;
                if (Math.abs(gVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, fVar.getWidth() / 2.0f);
                    float x9 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y3 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    fVar.b();
                    float f7 = gVar.d;
                    float f10 = gVar.f49781i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    fVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    fVar.d.addUpdateListener(new z6(this, f7, x9, f10, y3, 2));
                    fVar.d.addListener(new fc1(this, 20));
                    fVar.d.start();
                    return true;
                }
                return true;
            default:
                yh.i iVar = (yh.i) view;
                if (!iVar.e.f52599c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (iVar.e.f52600f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= iVar.e.f52600f.getRight() || iVar.e.f52600f.getTop() >= motionEvent.getY() || motionEvent.getY() >= iVar.e.f52600f.getBottom())) {
                    iVar.e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
