package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49455a;

    public k(l lVar) {
        this.f49455a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49455a;
        if (!lVar.f49459e.f49462c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49459e.f49464f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49459e.f49464f.getRight() || lVar.f49459e.f49464f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49459e.f49464f.getBottom())) {
            lVar.f49459e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
