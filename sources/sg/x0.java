package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w90;
import w7.z5;
public final class x0 extends LinearLayout {
    public int f46933a;
    public final TextView f46934b;
    public final w90 f46935c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f46936f;
    public boolean h;
    public final y0 f46937n;

    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        g6 g6Var;
        g6 g6Var2;
        this.f46937n = y0Var;
        setOrientation(1);
        ViewGroup C = y0Var.C(context, i10);
        this.f46936f = C;
        addView(C);
        this.e = (l0) C;
        TextView textView = new TextView(context);
        this.f46934b = textView;
        textView.setGravity(1);
        int i11 = k6.f21290j5;
        g6Var = ((h3) y0Var).resourcesProvider;
        r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        w90 w90Var = new w90(context, null);
        this.f46935c = w90Var;
        w90Var.setGravity(1);
        w90Var.setTextSize(1, 15.0f);
        g6Var2 = ((h3) y0Var).resourcesProvider;
        r6.W(w90Var, i11, g6Var2);
        if (!y0Var.E) {
            w90Var.setLines(2);
        }
        addView(w90Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f46936f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f46937n.L);
            }
            if (z10) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f46934b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f46936f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.f46937n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.f46951s;
        w90 w90Var = this.f46935c;
        w90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            w90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
