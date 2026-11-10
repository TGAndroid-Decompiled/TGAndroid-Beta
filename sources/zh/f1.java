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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.e61;
public final class f1 extends FrameLayout implements c6 {
    public final e61 f60323a;
    public int f60324b;
    public final v5 f60325c;
    public final ArrayList d;
    public final RectF f60326e;
    public final RectF f60327f;
    public final RectF h;
    public final Paint f60328n;
    public int f60329r;

    public f1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f60326e = new RectF();
        this.f60327f = new RectF();
        this.h = new RectF();
        this.f60328n = new Paint(1);
        this.f60329r = Integer.MIN_VALUE;
        e61 e61Var = new e61(25, context, this);
        this.f60323a = e61Var;
        e61Var.setClipToPadding(false);
        e61Var.setClipChildren(false);
        e61Var.setOrientation(0);
        e61Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(e61Var, ha.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f60325c = new v5(e61Var, 0L, 320L, wq.h);
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
                ((TextView) arrayList.get(i7)).setTextColor(m6.w(m6.x0(null, m6.f27853b6, false), m6.x0(null, m6.f27872c6, false)));
                i7++;
            } else {
                this.f60323a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
