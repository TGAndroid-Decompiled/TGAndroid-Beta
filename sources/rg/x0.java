package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ia0;
import w7.w5;
public final class x0 extends LinearLayout {
    public int f47724a;
    public final TextView f47725b;
    public final ia0 f47726c;
    public LinearLayout d;
    public final l0 f47727e;
    public final ViewGroup f47728f;
    public boolean h;
    public final y0 f47729n;

    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        this.f47729n = y0Var;
        setOrientation(1);
        ViewGroup B = y0Var.B(context, i10);
        this.f47728f = B;
        addView(B);
        this.f47727e = (l0) B;
        TextView textView = new TextView(context);
        this.f47725b = textView;
        textView.setGravity(1);
        int i11 = h6.f20667j5;
        textView.setTextColor(y0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w5.a(-2.0f, 21.0f, 20.0f, 21.0f, 0.0f, -1, 0));
        ia0 ia0Var = new ia0(context, null);
        this.f47726c = ia0Var;
        ia0Var.setGravity(1);
        ia0Var.setTextSize(1, 15.0f);
        ia0Var.setTextColor(y0Var.getThemedColor(i11));
        if (!y0Var.E) {
            ia0Var.setLines(2);
        }
        addView(ia0Var, w5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f47728f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f47729n.L);
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
        TextView textView = this.f47725b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f47728f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.f47729n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.f47741s;
        ia0 ia0Var = this.f47726c;
        ia0Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            ia0Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
