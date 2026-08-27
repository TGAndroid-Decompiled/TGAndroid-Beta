package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.aj0;

public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.x5, i9 {

    public final c6 f47384a;

    public final aj0 f47385b;

    public final AnimatedArrowDrawable f47386c;
    public final d1 d;

    public final Paint f47387e;

    public a f47388f;
    public x2 h;

    public boolean f47389n;

    public q0(Context context, c6 c6Var) {
        super(context);
        this.f47387e = new Paint();
        this.f47384a = c6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g6.v0(g6.Dk, c6Var));
        this.f47386c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new fg.a(this, 10));
        aj0 aj0Var = new aj0(this, context, 12);
        this.f47385b = aj0Var;
        aj0Var.setOnClickListener(new lh.c5(this, 23));
        addView(aj0Var, z5.e(53, -1, 51));
        d1 d1Var = new d1(context, c6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new lh.p(this, 21));
        addView(d1Var, z5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        this.d.t();
        int i10 = g6.Dk;
        c6 c6Var = this.f47384a;
        int iV0 = g6.v0(i10, c6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f47386c;
        animatedArrowDrawable.f26052a.setColor(iV0);
        animatedArrowDrawable.invalidateSelf();
        this.f47387e.setColor(g6.v0(g6.Fk, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x2 x2Var = this.h;
        j9 textSelectionHelper = x2Var != null ? x2Var.f47583a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            d1 d1Var = this.d;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                textSelectionHelper.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.d;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o0(this, layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop()));
    }

    public int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f47388f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f47388f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f47387e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
