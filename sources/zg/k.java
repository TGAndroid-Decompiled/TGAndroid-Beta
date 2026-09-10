package zg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.z;
public final class k implements ah.a {
    public final ViewGroup f48144c;
    public final j d;
    public final ViewGroup e;
    public boolean h;
    public final RectF f48142a = new RectF();
    public final PointF f48143b = new PointF();
    public final RectF f48145f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.f48144c = viewGroup;
        this.d = jVar;
        this.e = viewGroup2;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.f48144c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48143b;
        if (!gh.k.b(viewGroup, viewGroup2, pointF)) {
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(pointF.x, pointF.y);
        if ((viewGroup instanceof ah.a) && !this.h) {
            RectF rectF2 = this.f48145f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ah.a) viewGroup).e(canvas, rectF);
            rectF.set(rectF2);
        } else {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                RectF rectF3 = this.f48142a;
                if (gh.k.c(childAt, viewGroup2, rectF3) && rectF3.intersect(rectF)) {
                    this.d.a(canvas, childAt, uptimeMillis);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void g(z zVar, RectF rectF) {
        ViewGroup viewGroup = this.f48144c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.f48143b;
        if (!gh.k.b(viewGroup, viewGroup2, pointF)) {
            zVar.f8456b = true;
        } else if ((viewGroup instanceof ah.a) && !this.h) {
            zVar.c(pointF.x);
            zVar.c(pointF.y);
            RectF rectF2 = this.f48145f;
            rectF2.set(rectF);
            rectF.offset(-pointF.x, -pointF.y);
            ((ah.a) viewGroup).g(zVar, rectF);
            rectF.set(rectF2);
        } else {
            zVar.f8456b = true;
        }
    }
}
