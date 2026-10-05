package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.q90;
import w7.z5;
public final class x0 extends LinearLayout {
    public int f46366a;
    public final TextView f46367b;
    public final q90 f46368c;
    public LinearLayout d;
    public final m0 f46369e;
    public final ViewGroup f46370f;
    public boolean h;
    public final y0 f46371n;

    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        this.f46371n = y0Var;
        setOrientation(1);
        ViewGroup z10 = y0Var.z(context, i10);
        this.f46370f = z10;
        addView(z10);
        this.f46369e = (m0) z10;
        TextView textView = new TextView(context);
        this.f46367b = textView;
        textView.setGravity(1);
        int i11 = i6.f20935j5;
        textView.setTextColor(y0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        q90 q90Var = new q90(context, null);
        this.f46368c = q90Var;
        q90Var.setGravity(1);
        q90Var.setTextSize(1, 15.0f);
        q90Var.setTextColor(y0Var.getThemedColor(i11));
        if (!y0Var.E) {
            q90Var.setLines(2);
        }
        addView(q90Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f46370f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f46371n.L);
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
        TextView textView = this.f46367b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f46370f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.f46371n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.f46403s;
        q90 q90Var = this.f46368c;
        q90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            q90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
