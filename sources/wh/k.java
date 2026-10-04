package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49127a;

    public k(l lVar) {
        this.f49127a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49127a;
        if (!lVar.f49131e.f49134c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49131e.f49136f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49131e.f49136f.getRight() || lVar.f49131e.f49136f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49131e.f49136f.getBottom())) {
            lVar.f49131e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
