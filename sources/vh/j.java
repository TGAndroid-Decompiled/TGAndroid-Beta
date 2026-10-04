package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f48423a;
    public final List f48424b;
    public final k f48425c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f48423a = view;
        this.f48424b = list;
        this.f48425c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f48423a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f48428c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f48424b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f48427b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f48427b) {
            View view = this.f48423a;
            view.playSoundEffect(0);
            lVar.f48427b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f48428c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f48424b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f48425c.b(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
