package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m90;
import w7.a6;
public final class z0 extends LinearLayout {
    public int f40995a;
    public final TextView f40996b;
    public final m90 f40997c;
    public LinearLayout d;
    public final n0 e;
    public final ViewGroup f40998f;
    public boolean h;
    public final a1 f40999n;

    public z0(a1 a1Var, Context context, int i10) {
        super(context);
        this.f40999n = a1Var;
        setOrientation(1);
        ViewGroup z10 = a1Var.z(context, i10);
        this.f40998f = z10;
        addView(z10);
        this.e = (n0) z10;
        TextView textView = new TextView(context);
        this.f40996b = textView;
        textView.setGravity(1);
        int i11 = j6.f18034j5;
        textView.setTextColor(a1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, a6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        m90 m90Var = new m90(context, null);
        this.f40997c = m90Var;
        m90Var.setGravity(1);
        m90Var.setTextSize(1, 15.0f);
        m90Var.setTextColor(a1Var.getThemedColor(i11));
        if (!a1Var.E) {
            m90Var.setLines(2);
        }
        addView(m90Var, a6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f40998f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f40999n.L);
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
        TextView textView = this.f40996b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f40998f;
        boolean z10 = viewGroup instanceof b;
        a1 a1Var = this.f40999n;
        if (z10) {
            ((b) viewGroup).setTopOffset(a1Var.L);
        }
        viewGroup.getLayoutParams().height = a1Var.f40665s;
        m90 m90Var = this.f40997c;
        m90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            m90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
