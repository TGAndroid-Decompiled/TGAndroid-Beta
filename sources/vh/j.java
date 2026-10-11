package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49808a;
    public final List f49809b;
    public final k f49810c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49808a = view;
        this.f49809b = list;
        this.f49810c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49808a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49813c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49809b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49812b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49812b) {
            View view = this.f49808a;
            view.playSoundEffect(0);
            lVar.f49812b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49813c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49809b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49810c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
