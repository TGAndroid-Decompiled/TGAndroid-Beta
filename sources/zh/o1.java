package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.za1;
public final class o1 extends FrameLayout implements p6 {
    public final za1 f53229a;
    public int f53230b;
    public final h6 f53231c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f53232f;
    public final RectF h;
    public final Paint f53233n;
    public int f53234r;

    public o1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f53232f = new RectF();
        this.h = new RectF();
        this.f53233n = new Paint(1);
        this.f53234r = Integer.MIN_VALUE;
        za1 za1Var = new za1(this, context, 22);
        this.f53229a = za1Var;
        za1Var.setClipToPadding(false);
        za1Var.setClipChildren(false);
        za1Var.setOrientation(0);
        za1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(za1Var, kb1.i(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f53231c = new h6(za1Var, 0L, 320L, ds.h);
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
                ((TextView) arrayList.get(i10)).setTextColor(y6.v(y6.x0(null, y6.f23318b6, false), y6.x0(null, y6.f23338c6, false)));
                i10++;
            } else {
                this.f53229a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
