package qh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.ei1;
public final class h0 {
    public final d1 f46409a;
    public final b6 f46410b;
    public final g0 f46411c;
    public boolean d;

    public h0(Context context, b6 b6Var, g0 g0Var) {
        this.f46410b = b6Var;
        this.f46411c = g0Var;
        d1 d1Var = new d1(context, b6Var);
        this.f46409a = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setHint(LocaleController.getString(R.string.AddCaption));
        d1Var.setListener(new org.telegram.ui.Cells.e3(19, this, g0Var));
        d1Var.setDelegate(new ei1(8, this, g0Var));
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
        d1 d1Var = this.f46409a;
        d1Var.t();
        int v02 = f6.v0(f6.G6, this.f46410b);
        d1Var.setTextColor(f6.l1(0.5f, v02));
        d1Var.setHintTextColor(f6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a I = this.f46411c.I();
        if (I != null && (pageBlock = I.f46269b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = I.f46269b.caption.text;
            String l10 = u5.l(richText);
            d1 d1Var = this.f46409a;
            if (!String.valueOf(d1Var.getText()).equals(l10)) {
                d1Var.setTextSilently(u5.r(richText, null, true));
                d1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        g0 g0Var = this.f46411c;
        n9 D = g0Var.D();
        if (D != null) {
            d1 d1Var = this.f46409a;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                D.a0(canvas, g0Var.H(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        d1 d1Var = this.f46409a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f0(this, layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop()));
    }

    public final boolean f(int i9, int i10) {
        int lineForVertical;
        d1 d1Var = this.f46409a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i9 - (d1Var.getPaddingLeft() + d1Var.getLeft());
        int paddingTop = i10 - (d1Var.getPaddingTop() + d1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f10 = paddingLeft;
            if (f10 >= layout.getLineLeft(lineForVertical) && f10 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i9, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(16.0f) + i9;
        int max = Math.max(dp, (i11 - i10) - AndroidUtilities.dp(16.0f));
        d1 d1Var = this.f46409a;
        d1Var.layout(dp, i12, max, d1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i9, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i9) - i10) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f46409a;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return d1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a I = this.f46411c.I();
        if (I != null && (pageBlock = I.f46269b) != null) {
            d(pageBlock);
            I.f46269b.caption.text = u5.f(this.f46409a.getText());
        }
    }
}
