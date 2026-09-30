package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f44725a;
    public final List f44726b;
    public final k f44727c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f44725a = view;
        this.f44726b = list;
        this.f44727c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44725a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f44730c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f44726b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f44729b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f44729b) {
            View view = this.f44725a;
            view.playSoundEffect(0);
            lVar.f44729b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f44730c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f44726b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f44727c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
