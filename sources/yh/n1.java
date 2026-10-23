package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.va1;
import w7.z5;
public final class n1 extends FrameLayout implements b6 {
    public final va1 f50874a;
    public int f50875b;
    public final f6 f50876c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50877f;
    public final RectF h;
    public final Paint f50878n;
    public int f50879r;

    public n1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50877f = new RectF();
        this.h = new RectF();
        this.f50878n = new Paint(1);
        this.f50879r = Integer.MIN_VALUE;
        va1 va1Var = new va1(this, context, 21);
        this.f50874a = va1Var;
        va1Var.setClipToPadding(false);
        va1Var.setClipChildren(false);
        va1Var.setOrientation(0);
        va1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(va1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50876c = new f6(va1Var, 0L, 320L, bs.h);
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
                ((TextView) arrayList.get(i10)).setTextColor(k6.v(k6.x0(null, k6.f21144b6, false), k6.x0(null, k6.f21164c6, false)));
                i10++;
            } else {
                this.f50874a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
