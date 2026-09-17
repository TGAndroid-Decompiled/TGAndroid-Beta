package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f44466a;
    public final List f44467b;
    public final l f44468c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f44466a = view;
        this.f44467b = list;
        this.f44468c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44466a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f44471c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f44467b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f44470b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f44470b) {
            View view = this.f44466a;
            view.playSoundEffect(0);
            mVar.f44470b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f44471c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f44467b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f44468c.j(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
