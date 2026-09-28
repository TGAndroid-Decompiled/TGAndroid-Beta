package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f45375a;

    public k(l lVar) {
        this.f45375a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f45375a;
        if (!lVar.e.f45381c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.e.f45382f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.e.f45382f.getRight() || lVar.e.f45382f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.e.f45382f.getBottom())) {
            lVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
