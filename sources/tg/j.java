package tg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.y;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m50;
import org.telegram.ui.nb1;
public final class j implements ug.a {
    public final ViewGroup f48762c;
    public final m50 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f48760a = new RectF();
    public final PointF f48761b = new PointF();
    public final RectF f48763f = new RectF();

    public j(ViewGroup viewGroup, ViewGroup viewGroup2, m50 m50Var) {
        this.f48762c = viewGroup;
        this.d = m50Var;
        this.e = viewGroup2;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f48762c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48761b;
        if (!zg.h.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof ug.a) && !this.h) {
            RectF rectF2 = this.f48763f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ug.a) viewGroup).d(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f48760a;
                if (zg.h.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    m50 m50Var = this.d;
                    int i11 = m50Var.f39475a;
                    Object obj = m50Var.f39476b;
                    switch (i11) {
                        case 0:
                            ((tk0) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                        case 1:
                            ProfileActivity profileActivity = (ProfileActivity) obj;
                            if (childAt == profileActivity.N) {
                                break;
                            } else {
                                profileActivity.f33772a.drawChild(canvas, childAt, uptimeMillis);
                                continue;
                            }
                        default:
                            ((nb1) obj).drawChild(canvas, childAt, uptimeMillis);
                            continue;
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(y yVar, RectF rectF) {
        ViewGroup viewGroup = this.f48762c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48761b;
        if (!zg.h.b(viewGroup, viewGroup2, pointF)) {
            yVar.f7258b = true;
        } else if ((viewGroup instanceof ug.a) && !this.h) {
            yVar.c(pointF.x);
            yVar.c(pointF.y);
            RectF rectF2 = this.f48763f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ug.a) viewGroup).g(yVar, rectF);
            rectF.set(rectF2);
        } else {
            yVar.f7258b = true;
        }
    }
}
