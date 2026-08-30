package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.gw0;
public final class q0 extends FrameLayout implements a6, l9 {
    public final f6 f46078a;
    public final gw0 f46079b;
    public final AnimatedArrowDrawable f46080c;
    public final d1 d;
    public final Paint e;
    public a f46081f;
    public z2 h;
    public boolean f46082n;

    public q0(Context context, f6 f6Var) {
        super(context);
        this.e = new Paint();
        this.f46078a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j6.v0(j6.Dk, f6Var));
        this.f46080c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 10));
        gw0 gw0Var = new gw0(this, context, 12);
        this.f46079b = gw0Var;
        gw0Var.setOnClickListener(new oh.n(this, 27));
        addView(gw0Var, b6.e(53, -1, 51));
        d1 d1Var = new d1(context, f6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new rh.e(this, 9));
        addView(d1Var, b6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var;
        z2 z2Var = this.h;
        if (z2Var != null) {
            m9Var = z2Var.f46334a.getTextSelectionHelper();
        } else {
            m9Var = null;
        }
        if (m9Var != null) {
            d1 d1Var = this.d;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                m9Var.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = j6.Dk;
        f6 f6Var = this.f46078a;
        int v02 = j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f46080c;
        animatedArrowDrawable.f22713a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(j6.v0(j6.Fk, f6Var));
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
        return this.f46081f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f46081f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z4) {
        this.d.setLocked(z4);
    }
}
