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
import org.telegram.ui.Components.y90;
import w7.z5;
public final class x0 extends LinearLayout {
    public int f46934a;
    public final TextView f46935b;
    public final y90 f46936c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f46937f;
    public boolean h;
    public final y0 f46938n;

    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        g6 g6Var;
        g6 g6Var2;
        this.f46938n = y0Var;
        setOrientation(1);
        ViewGroup C = y0Var.C(context, i10);
        this.f46937f = C;
        addView(C);
        this.e = (l0) C;
        TextView textView = new TextView(context);
        this.f46935b = textView;
        textView.setGravity(1);
        int i11 = k6.f21289j5;
        g6Var = ((h3) y0Var).resourcesProvider;
        r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        y90 y90Var = new y90(context, null);
        this.f46936c = y90Var;
        y90Var.setGravity(1);
        y90Var.setTextSize(1, 15.0f);
        g6Var2 = ((h3) y0Var).resourcesProvider;
        r6.W(y90Var, i11, g6Var2);
        if (!y0Var.E) {
            y90Var.setLines(2);
        }
        addView(y90Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f46937f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f46938n.L);
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
        TextView textView = this.f46935b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f46937f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.f46938n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.f46952s;
        y90 y90Var = this.f46936c;
        y90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            y90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
