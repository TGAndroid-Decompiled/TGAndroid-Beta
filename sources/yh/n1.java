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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ua1;
import w7.z5;
public final class n1 extends FrameLayout implements b6 {
    public final ua1 f50873a;
    public int f50874b;
    public final d6 f50875c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50876f;
    public final RectF h;
    public final Paint f50877n;
    public int f50878r;

    public n1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50876f = new RectF();
        this.h = new RectF();
        this.f50877n = new Paint(1);
        this.f50878r = Integer.MIN_VALUE;
        ua1 ua1Var = new ua1(this, context, 21);
        this.f50873a = ua1Var;
        ua1Var.setClipToPadding(false);
        ua1Var.setClipChildren(false);
        ua1Var.setOrientation(0);
        ua1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(ua1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50875c = new d6(ua1Var, 0L, 320L, zr.h);
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
                ((TextView) arrayList.get(i10)).setTextColor(k6.v(k6.x0(null, k6.f21145b6, false), k6.x0(null, k6.f21165c6, false)));
                i10++;
            } else {
                this.f50873a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
