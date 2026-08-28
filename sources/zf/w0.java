package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
public final class w0 extends LinearLayout {
    public int f50758a;
    public final TextView f50759b;
    public final l80 f50760c;
    public LinearLayout d;
    public final l0 f50761e;
    public final ViewGroup f50762f;
    public boolean h;
    public final x0 f50763n;

    public w0(x0 x0Var, Context context, int i9) {
        super(context);
        this.f50763n = x0Var;
        setOrientation(1);
        ViewGroup z10 = x0Var.z(context, i9);
        this.f50762f = z10;
        addView(z10);
        this.f50761e = (l0) z10;
        TextView textView = new TextView(context);
        this.f50759b = textView;
        textView.setGravity(1);
        int i10 = f6.f23108j5;
        textView.setTextColor(x0Var.getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, e6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l80 l80Var = new l80(context, null);
        this.f50760c = l80Var;
        l80Var.setGravity(1);
        l80Var.setTextSize(1, 15.0f);
        l80Var.setTextColor(x0Var.getThemedColor(i10));
        if (!x0Var.A) {
            l80Var.setLines(2);
        }
        addView(l80Var, e6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f50762f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f50763n.H);
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
    public final void onMeasure(int i9, int i10) {
        TextView textView = this.f50759b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f50762f;
        boolean z10 = viewGroup instanceof b;
        x0 x0Var = this.f50763n;
        if (z10) {
            ((b) viewGroup).setTopOffset(x0Var.H);
        }
        viewGroup.getLayoutParams().height = x0Var.f50778s;
        l80 l80Var = this.f50760c;
        l80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i9, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            l80Var.setVisibility(8);
            super.onMeasure(i9, i10);
        }
    }
}
