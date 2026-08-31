package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.iw0;
public final class r0 extends FrameLayout implements b6, l9 {
    public final g6 f49960a;
    public final iw0 f49961b;
    public final AnimatedArrowDrawable f49962c;
    public final e1 d;
    public final Paint f49963e;
    public a f49964f;
    public z2 h;
    public boolean f49965n;

    public r0(Context context, g6 g6Var) {
        super(context);
        this.f49963e = new Paint();
        this.f49960a = g6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(k6.v0(k6.Dk, g6Var));
        this.f49962c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 10));
        iw0 iw0Var = new iw0(this, context, 12);
        this.f49961b = iw0Var;
        iw0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        addView(iw0Var, c6.e(53, -1, 51));
        e1 e1Var = new e1(context, g6Var);
        this.d = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setTextSize(1, SharedConfig.fontSize);
        e1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        e1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        e1Var.setListener(new o0(this));
        e1Var.setDelegate(new sf.g(this, 13));
        addView(e1Var, c6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var;
        z2 z2Var = this.h;
        if (z2Var != null) {
            m9Var = z2Var.f50217a.getTextSelectionHelper();
        } else {
            m9Var = null;
        }
        if (m9Var != null) {
            e1 e1Var = this.d;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                m9Var.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = k6.Dk;
        g6 g6Var = this.f49960a;
        int v02 = k6.v0(i10, g6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f49962c;
        animatedArrowDrawable.f24550a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.f49963e.setColor(k6.v0(k6.Fk, g6Var));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var = this.d;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new p0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    public int[] getColorKeys() {
        return null;
    }

    public e1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f49964f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f49964f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49616b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f49963e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z4) {
        this.d.setLocked(z4);
    }
}
