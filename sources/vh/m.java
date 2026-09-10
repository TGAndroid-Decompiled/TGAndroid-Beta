package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class m extends GestureDetector.SimpleOnGestureListener {
    public final n f43384a;

    public m(n nVar) {
        this.f43384a = nVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n nVar = this.f43384a;
        if (!nVar.e.f43390c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (nVar.e.f43391f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= nVar.e.f43391f.getRight() || nVar.e.f43391f.getTop() >= motionEvent.getY() || motionEvent.getY() >= nVar.e.f43391f.getBottom())) {
            nVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
