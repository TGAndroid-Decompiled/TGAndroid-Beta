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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.nw0;
import ph.z8;
public final class r0 extends FrameLayout implements org.telegram.ui.ActionBar.a6, k9 {
    public final f6 f46175a;
    public final nw0 f46176b;
    public final AnimatedArrowDrawable f46177c;
    public final e1 d;
    public final Paint e;
    public a f46178f;
    public a3 h;
    public boolean f46179n;

    public r0(Context context, f6 f6Var) {
        super(context);
        this.e = new Paint();
        this.f46175a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j6.v0(j6.Dk, f6Var));
        this.f46177c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 10));
        nw0 nw0Var = new nw0(this, context, 12);
        this.f46176b = nw0Var;
        nw0Var.setOnClickListener(new oh.n(this, 27));
        addView(nw0Var, b6.e(53, -1, 51));
        e1 e1Var = new e1(context, f6Var);
        this.d = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setTextSize(1, SharedConfig.fontSize);
        e1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        e1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        e1Var.setListener(new o0(this));
        e1Var.setDelegate(new z8(this, 12));
        addView(e1Var, b6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l9 l9Var;
        a3 a3Var = this.h;
        if (a3Var != null) {
            l9Var = a3Var.f45875a.getTextSelectionHelper();
        } else {
            l9Var = null;
        }
        if (l9Var != null) {
            e1 e1Var = this.d;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                l9Var.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = j6.Dk;
        f6 f6Var = this.f46175a;
        int v02 = j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f46177c;
        animatedArrowDrawable.f22686a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(j6.v0(j6.Fk, f6Var));
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
        return this.f46178f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f46178f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
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
