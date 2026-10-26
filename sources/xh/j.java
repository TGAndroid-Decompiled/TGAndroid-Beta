package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f51899a;
    public final List f51900b;
    public final k f51901c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f51899a = view;
        this.f51900b = list;
        this.f51901c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f51899a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x9 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x9 - lVar.f51904c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f51900b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f51903b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f51903b) {
            View view = this.f51899a;
            view.playSoundEffect(0);
            lVar.f51903b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x9 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x9 - lVar.f51904c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f51900b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f51901c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
