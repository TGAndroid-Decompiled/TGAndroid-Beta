package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49094a;
    public final List f49095b;
    public final k f49096c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49094a = view;
        this.f49095b = list;
        this.f49096c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49094a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49099c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49095b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49098b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49098b) {
            View view = this.f49094a;
            view.playSoundEffect(0);
            lVar.f49098b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49099c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49095b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49096c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
