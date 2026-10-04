package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final l f49119a;

    public k(l lVar) {
        this.f49119a = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f49119a;
        if (!lVar.f49123e.f49126c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.f49123e.f49128f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.f49123e.f49128f.getRight() || lVar.f49123e.f49128f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.f49123e.f49128f.getBottom())) {
            lVar.f49123e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
