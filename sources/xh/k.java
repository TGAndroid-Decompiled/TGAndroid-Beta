package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49426a;

    public k(l lVar) {
        this.f49426a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49426a;
        if (!lVar.f49430e.f49433c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49430e.f49435f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49430e.f49435f.getRight() || lVar.f49430e.f49435f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49430e.f49435f.getBottom())) {
            lVar.f49430e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
