package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f45374a;

    public k(l lVar) {
        this.f45374a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f45374a;
        if (!lVar.e.f45380c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.e.f45381f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.e.f45381f.getRight() || lVar.e.f45381f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.e.f45381f.getBottom())) {
            lVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
