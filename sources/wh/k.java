package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49134a;

    public k(l lVar) {
        this.f49134a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49134a;
        if (!lVar.f49138e.f49141c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49138e.f49143f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49138e.f49143f.getRight() || lVar.f49138e.f49143f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49138e.f49143f.getBottom())) {
            lVar.f49138e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
