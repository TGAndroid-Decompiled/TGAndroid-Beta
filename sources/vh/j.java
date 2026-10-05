package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f48439a;
    public final List f48440b;
    public final k f48441c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f48439a = view;
        this.f48440b = list;
        this.f48441c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f48439a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f48444c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f48440b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f48443b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f48443b) {
            View view = this.f48439a;
            view.playSoundEffect(0);
            lVar.f48443b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f48444c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f48440b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f48441c.b(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
