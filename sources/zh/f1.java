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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d61;
public final class f1 extends FrameLayout implements b6 {
    public final d61 f60321a;
    public int f60322b;
    public final w5 f60323c;
    public final ArrayList d;
    public final RectF f60324e;
    public final RectF f60325f;
    public final RectF h;
    public final Paint f60326n;
    public int f60327r;

    public f1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f60324e = new RectF();
        this.f60325f = new RectF();
        this.h = new RectF();
        this.f60326n = new Paint(1);
        this.f60327r = Integer.MIN_VALUE;
        d61 d61Var = new d61(25, context, this);
        this.f60321a = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.setClipChildren(false);
        d61Var.setOrientation(0);
        d61Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(d61Var, ha.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f60323c = new w5(d61Var, 0L, 320L, xq.h);
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
                ((TextView) arrayList.get(i7)).setTextColor(l6.w(l6.x0(null, l6.f27828b6, false), l6.x0(null, l6.f27847c6, false)));
                i7++;
            } else {
                this.f60321a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
