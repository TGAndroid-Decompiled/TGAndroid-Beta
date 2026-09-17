package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49456a;

    public k(l lVar) {
        this.f49456a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49456a;
        if (!lVar.f49460e.f49463c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49460e.f49465f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49460e.f49465f.getRight() || lVar.f49460e.f49465f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49460e.f49465f.getBottom())) {
            lVar.f49460e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
