package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.c61;
public final class f1 extends FrameLayout implements a6 {
    public final c61 f60311a;
    public int f60312b;
    public final w5 f60313c;
    public final ArrayList d;
    public final RectF f60314e;
    public final RectF f60315f;
    public final RectF h;
    public final Paint f60316n;
    public int f60317r;

    public f1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f60314e = new RectF();
        this.f60315f = new RectF();
        this.h = new RectF();
        this.f60316n = new Paint(1);
        this.f60317r = Integer.MIN_VALUE;
        c61 c61Var = new c61(25, context, this);
        this.f60311a = c61Var;
        c61Var.setClipToPadding(false);
        c61Var.setClipChildren(false);
        c61Var.setOrientation(0);
        c61Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(c61Var, ha.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f60313c = new w5(c61Var, 0L, 320L, xq.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((TextView) arrayList.get(i7)).setTextColor(k6.w(k6.x0(null, k6.f27815b6, false), k6.x0(null, k6.f27834c6, false)));
                i7++;
            } else {
                this.f60311a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
