package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.yi0;
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 f46621a;
    public final yi0 f46622b;
    public final AnimatedArrowDrawable f46623c;
    public final d1 d;
    public final Paint f46624e;
    public a f46625f;
    public w2 h;
    public boolean f46626n;

    public q0(Context context, b6 b6Var) {
        super(context);
        this.f46624e = new Paint();
        this.f46621a = b6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f6.v0(f6.Dk, b6Var));
        this.f46623c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new eg.a(this, 10));
        yi0 yi0Var = new yi0(this, context, 11);
        this.f46622b = yi0Var;
        yi0Var.setOnClickListener(new x8(this, 21));
        addView(yi0Var, e6.e(53, -1, 51));
        d1 d1Var = new d1(context, b6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new kh.p(this, 21));
        addView(d1Var, e6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        this.d.t();
        int i9 = f6.Dk;
        b6 b6Var = this.f46621a;
        int v02 = f6.v0(i9, b6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f46623c;
        animatedArrowDrawable.f26056a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.f46624e.setColor(f6.v0(f6.Fk, b6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        w2 w2Var = this.h;
        if (w2Var != null) {
            n9Var = w2Var.f46773a.getTextSelectionHelper();
        } else {
            n9Var = null;
        }
        if (n9Var != null) {
            d1 d1Var = this.d;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                n9Var.a0(canvas, this, 0);
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
        return this.f46625f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f46625f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f46624e);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
