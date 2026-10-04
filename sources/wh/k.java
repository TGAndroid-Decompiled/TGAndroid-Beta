package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49118a;

    public k(l lVar) {
        this.f49118a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49118a;
        if (!lVar.f49122e.f49125c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49122e.f49127f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49122e.f49127f.getRight() || lVar.f49122e.f49127f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49122e.f49127f.getBottom())) {
            lVar.f49122e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
