package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l90;
import w7.y5;
public final class w0 extends LinearLayout {
    public int f42782a;
    public final TextView f42783b;
    public final l90 f42784c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f42785f;
    public boolean h;
    public final x0 f42786n;

    public w0(x0 x0Var, Context context, int i10) {
        super(context);
        this.f42786n = x0Var;
        setOrientation(1);
        ViewGroup z10 = x0Var.z(context, i10);
        this.f42785f = z10;
        addView(z10);
        this.e = (l0) z10;
        TextView textView = new TextView(context);
        this.f42783b = textView;
        textView.setGravity(1);
        int i11 = j6.f19169j5;
        textView.setTextColor(x0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, y5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l90 l90Var = new l90(context, null);
        this.f42784c = l90Var;
        l90Var.setGravity(1);
        l90Var.setTextSize(1, 15.0f);
        l90Var.setTextColor(x0Var.getThemedColor(i11));
        if (!x0Var.E) {
            l90Var.setLines(2);
        }
        addView(l90Var, y5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f42785f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f42786n.L);
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
        TextView textView = this.f42783b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f42785f;
        boolean z10 = viewGroup instanceof b;
        x0 x0Var = this.f42786n;
        if (z10) {
            ((b) viewGroup).setTopOffset(x0Var.L);
        }
        viewGroup.getLayoutParams().height = x0Var.f42796s;
        l90 l90Var = this.f42784c;
        l90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            l90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
