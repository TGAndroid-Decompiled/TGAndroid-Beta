package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49842a;
    public final List f49843b;
    public final k f49844c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49842a = view;
        this.f49843b = list;
        this.f49844c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49842a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49847c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49843b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49846b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49846b) {
            View view = this.f49842a;
            view.playSoundEffect(0);
            lVar.f49846b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49847c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49843b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49844c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
