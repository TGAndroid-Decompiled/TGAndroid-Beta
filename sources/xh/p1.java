package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
import org.telegram.ui.fc1;
import w7.w5;
public final class p1 extends FrameLayout {
    public final fc1 f51682a;
    public int f51683b;
    public final g6 f51684c;
    public final ArrayList d;
    public final RectF f51685e;
    public final RectF f51686f;
    public final RectF h;
    public final Paint f51687n;
    public int f51688r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f51685e = new RectF();
        this.f51686f = new RectF();
        this.h = new RectF();
        this.f51687n = new Paint(1);
        this.f51688r = Integer.MIN_VALUE;
        fc1 fc1Var = new fc1(this, context, 18);
        this.f51682a = fc1Var;
        fc1Var.setClipToPadding(false);
        fc1Var.setClipChildren(false);
        fc1Var.setOrientation(0);
        fc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(fc1Var, w5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f51684c = new g6(fc1Var, 0L, 320L, js.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
