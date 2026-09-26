package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f44722a;
    public final List f44723b;
    public final k f44724c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f44722a = view;
        this.f44723b = list;
        this.f44724c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44722a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f44727c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f44723b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f44726b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f44726b) {
            View view = this.f44722a;
            view.playSoundEffect(0);
            lVar.f44726b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f44727c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f44723b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f44724c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
