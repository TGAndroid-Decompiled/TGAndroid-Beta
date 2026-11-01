package tg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.y;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l50;
import org.telegram.ui.lb1;
public final class j implements ug.a {
    public final ViewGroup f48776c;
    public final l50 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f48774a = new RectF();
    public final PointF f48775b = new PointF();
    public final RectF f48777f = new RectF();

    public j(ViewGroup viewGroup, ViewGroup viewGroup2, l50 l50Var) {
        this.f48776c = viewGroup;
        this.d = l50Var;
        this.e = viewGroup2;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f48776c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48775b;
        if (!zg.h.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof ug.a) && !this.h) {
            RectF rectF2 = this.f48777f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ug.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f48774a;
                if (zg.h.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    l50 l50Var = this.d;
                    int i11 = l50Var.f39081a;
                    Object obj = l50Var.f39082b;
                    switch (i11) {
                        case 0:
                            ((uk0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.N) {
                                break;
                            } else {
                                profileActivity.f33779a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((lb1) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(y yVar, RectF rectF) {
        ViewGroup viewGroup = this.f48776c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48775b;
        if (!zg.h.b(viewGroup, viewGroup2, pointF)) {
            yVar.f7259b = true;
        } else if ((viewGroup instanceof ug.a) && !this.h) {
            yVar.c(pointF.x);
            yVar.c(pointF.y);
            RectF rectF2 = this.f48777f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ug.a) viewGroup).g(yVar, rectF);
            rectF.set(rectF2);
        } else {
            yVar.f7259b = true;
        }
    }
}
