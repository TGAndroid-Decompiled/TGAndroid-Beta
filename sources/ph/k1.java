package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.u71;
import w7.b6;
public final class k1 extends FrameLayout implements k6 {
    public final u71 f45161a;
    public int f45162b;
    public final t5 f45163c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f45164f;
    public final RectF h;
    public final Paint f45165n;
    public int f45166r;

    public k1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f45164f = new RectF();
        this.h = new RectF();
        this.f45165n = new Paint(1);
        this.f45166r = Integer.MIN_VALUE;
        u71 u71Var = new u71(this, context, 20);
        this.f45161a = u71Var;
        u71Var.setClipToPadding(false);
        u71Var.setClipChildren(false);
        u71Var.setOrientation(0);
        u71Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(u71Var, b6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f45163c = new t5(u71Var, 0L, 320L, gr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((TextView) arrayList.get(i10)).setTextColor(t6.w(t6.x0(null, t6.f20891b6, false), t6.x0(null, t6.f20910c6, false)));
                i10++;
            } else {
                this.f45161a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
