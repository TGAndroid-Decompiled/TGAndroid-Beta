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
import org.telegram.ui.s71;
import w7.b6;
public final class k1 extends FrameLayout implements k6 {
    public final s71 f45172a;
    public int f45173b;
    public final t5 f45174c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f45175f;
    public final RectF h;
    public final Paint f45176n;
    public int f45177r;

    public k1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f45175f = new RectF();
        this.h = new RectF();
        this.f45176n = new Paint(1);
        this.f45177r = Integer.MIN_VALUE;
        s71 s71Var = new s71(this, context, 20);
        this.f45172a = s71Var;
        s71Var.setClipToPadding(false);
        s71Var.setClipChildren(false);
        s71Var.setOrientation(0);
        s71Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(s71Var, b6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f45174c = new t5(s71Var, 0L, 320L, gr.h);
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
                ((TextView) arrayList.get(i10)).setTextColor(t6.w(t6.x0(null, t6.f20892b6, false), t6.x0(null, t6.f20911c6, false)));
                i10++;
            } else {
                this.f45172a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
