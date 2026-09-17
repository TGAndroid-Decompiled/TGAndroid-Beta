package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49427a;

    public k(l lVar) {
        this.f49427a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49427a;
        if (!lVar.f49431e.f49434c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49431e.f49436f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49431e.f49436f.getRight() || lVar.f49431e.f49436f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49431e.f49436f.getBottom())) {
            lVar.f49431e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
