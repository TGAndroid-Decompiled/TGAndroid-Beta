package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
public final class i0 {
    public final e1 f46006a;
    public final f6 f46007b;
    public final h0 f46008c;
    public boolean d;

    public i0(Context context, f6 f6Var, h0 h0Var) {
        this.f46007b = f6Var;
        this.f46008c = h0Var;
        e1 e1Var = new e1(context, f6Var);
        this.f46006a = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setHint(LocaleController.getString(R.string.AddCaption));
        e1Var.setListener(new q5.c0(this, h0Var, false, 14));
        e1Var.setDelegate(new org.telegram.ui.web.m(12, this, h0Var));
        a();
    }

    public static void d(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.caption == null) {
                pageBlock.caption = new TL_iv.PageCaption();
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption.text == null) {
                pageCaption.text = new TL_iv.textEmpty();
            }
            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
            if (pageCaption2.credit == null) {
                pageCaption2.credit = new TL_iv.textEmpty();
            }
        }
    }

    public final void a() {
        e1 e1Var = this.f46006a;
        e1Var.t();
        int v02 = j6.v0(j6.G6, this.f46007b);
        e1Var.setTextColor(j6.l1(0.5f, v02));
        e1Var.setHintTextColor(j6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a T0 = this.f46008c.T0();
        if (T0 != null && (pageBlock = T0.f45853b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = T0.f45853b.caption.text;
            String l10 = y5.l(richText);
            e1 e1Var = this.f46006a;
            if (!String.valueOf(e1Var.getText()).equals(l10)) {
                e1Var.setTextSilently(y5.r(richText, null, true));
                e1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        h0 h0Var = this.f46008c;
        l9 J0 = h0Var.J0();
        if (J0 != null) {
            e1 e1Var = this.f46006a;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                J0.a0(canvas, h0Var.O0(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        e1 e1Var = this.f46006a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new g0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        e1 e1Var = this.f46006a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (e1Var.getPaddingLeft() + e1Var.getLeft());
        int paddingTop = i11 - (e1Var.getPaddingTop() + e1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f10 = paddingLeft;
            if (f10 >= layout.getLineLeft(lineForVertical) && f10 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(16.0f) + i10;
        int max = Math.max(dp, (i12 - i11) - AndroidUtilities.dp(16.0f));
        e1 e1Var = this.f46006a;
        e1Var.layout(dp, i13, max, e1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f46006a;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return e1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a T0 = this.f46008c.T0();
        if (T0 != null && (pageBlock = T0.f45853b) != null) {
            d(pageBlock);
            T0.f45853b.caption.text = y5.f(this.f46006a.getText());
        }
    }
}
