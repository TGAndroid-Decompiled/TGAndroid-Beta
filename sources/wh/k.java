package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f45120a;

    public k(l lVar) {
        this.f45120a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f45120a;
        if (!lVar.e.f45126c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.e.f45127f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.e.f45127f.getRight() || lVar.e.f45127f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.e.f45127f.getBottom())) {
            lVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
