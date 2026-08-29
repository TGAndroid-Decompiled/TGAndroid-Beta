package th;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.fi1;
public final class h0 {
    public final d1 f48471a;
    public final c6 f48472b;
    public final g0 f48473c;
    public boolean d;

    public h0(Context context, c6 c6Var, g0 g0Var) {
        this.f48472b = c6Var;
        this.f48473c = g0Var;
        d1 d1Var = new d1(context, c6Var);
        this.f48471a = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setHint(LocaleController.getString(R.string.AddCaption));
        d1Var.setListener(new oc.i(this, g0Var, false, 27));
        d1Var.setDelegate(new fi1(11, this, g0Var));
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
        d1 d1Var = this.f48471a;
        d1Var.t();
        int v02 = g6.v0(g6.G6, this.f48472b);
        d1Var.setTextColor(g6.l1(0.5f, v02));
        d1Var.setHintTextColor(g6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a G = this.f48473c.G();
        if (G != null && (pageBlock = G.f48328b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = G.f48328b.caption.text;
            String l10 = v5.l(richText);
            d1 d1Var = this.f48471a;
            if (!String.valueOf(d1Var.getText()).equals(l10)) {
                d1Var.setTextSilently(v5.r(richText, null, true));
                d1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        g0 g0Var = this.f48473c;
        k9 x4 = g0Var.x();
        if (x4 != null) {
            d1 d1Var = this.f48471a;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                x4.a0(canvas, g0Var.D(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        d1 d1Var = this.f48471a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f0(this, layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        d1 d1Var = this.f48471a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (d1Var.getPaddingLeft() + d1Var.getLeft());
        int paddingTop = i11 - (d1Var.getPaddingTop() + d1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f9 = paddingLeft;
            if (f9 >= layout.getLineLeft(lineForVertical) && f9 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(16.0f) + i10;
        int max = Math.max(dp, (i12 - i11) - AndroidUtilities.dp(16.0f));
        d1 d1Var = this.f48471a;
        d1Var.layout(dp, i13, max, d1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f48471a;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return d1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a G = this.f48473c.G();
        if (G != null && (pageBlock = G.f48328b) != null) {
            d(pageBlock);
            G.f48328b.caption.text = v5.f(this.f48471a.getText());
        }
    }
}
