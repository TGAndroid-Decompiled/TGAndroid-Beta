package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ea0;
import w7.x5;
public final class x0 extends LinearLayout {
    public int f47508a;
    public final TextView f47509b;
    public final ea0 f47510c;
    public LinearLayout d;
    public final l0 f47511e;
    public final ViewGroup f47512f;
    public boolean h;
    public final y0 f47513n;

    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        this.f47513n = y0Var;
        setOrientation(1);
        ViewGroup C = y0Var.C(context, i10);
        this.f47512f = C;
        addView(C);
        this.f47511e = (l0) C;
        TextView textView = new TextView(context);
        this.f47509b = textView;
        textView.setGravity(1);
        int i11 = i6.f20905j5;
        textView.setTextColor(y0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, x5.a(-2.0f, 21.0f, 20.0f, 21.0f, 0.0f, -1, 0));
        ea0 ea0Var = new ea0(context, null);
        this.f47510c = ea0Var;
        ea0Var.setGravity(1);
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setTextColor(y0Var.getThemedColor(i11));
        if (!y0Var.E) {
            ea0Var.setLines(2);
        }
        addView(ea0Var, x5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f47512f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f47513n.L);
            }
            if (z10) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f47509b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f47512f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.f47513n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.f47525s;
        ea0 ea0Var = this.f47510c;
        ea0Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            ea0Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
