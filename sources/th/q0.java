package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.op0;
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.x5, j9 {
    public final c6 f48682a;
    public final op0 f48683b;
    public final AnimatedArrowDrawable f48684c;
    public final d1 d;
    public final Paint f48685e;
    public a f48686f;
    public x2 h;
    public boolean f48687n;

    public q0(Context context, c6 c6Var) {
        super(context);
        this.f48685e = new Paint();
        this.f48682a = c6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g6.v0(g6.Dk, c6Var));
        this.f48684c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new hg.a(this, 10));
        op0 op0Var = new op0(this, context, 12);
        this.f48683b = op0Var;
        op0Var.setOnClickListener(new mh.n(this, 27));
        addView(op0Var, f6.e(53, -1, 51));
        d1 d1Var = new d1(context, c6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new sf.f1(this, 4));
        addView(d1Var, f6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        x2 x2Var = this.h;
        if (x2Var != null) {
            k9Var = x2Var.f48881a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            d1 d1Var = this.d;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                k9Var.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = g6.Dk;
        c6 c6Var = this.f48682a;
        int v02 = g6.v0(i10, c6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f48684c;
        animatedArrowDrawable.f26067a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.f48685e.setColor(g6.v0(g6.Fk, c6Var));
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
        return this.f48686f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f48686f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f48685e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
