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
import org.telegram.ui.Cells.m9;
public final class h0 {
    public final d1 f45909a;
    public final f6 f45910b;
    public final g0 f45911c;
    public boolean d;

    public h0(Context context, f6 f6Var, g0 g0Var) {
        this.f45910b = f6Var;
        this.f45911c = g0Var;
        d1 d1Var = new d1(context, f6Var);
        this.f45909a = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setHint(LocaleController.getString(R.string.AddCaption));
        d1Var.setListener(new q5.g0(this, g0Var, false, 13));
        d1Var.setDelegate(new org.telegram.ui.web.m(12, this, g0Var));
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
        d1 d1Var = this.f45909a;
        d1Var.t();
        int v02 = j6.v0(j6.G6, this.f45910b);
        d1Var.setTextColor(j6.l1(0.5f, v02));
        d1Var.setHintTextColor(j6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a E = this.f45911c.E();
        if (E != null && (pageBlock = E.f45775b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = E.f45775b.caption.text;
            String l10 = x5.l(richText);
            d1 d1Var = this.f45909a;
            if (!String.valueOf(d1Var.getText()).equals(l10)) {
                d1Var.setTextSilently(x5.r(richText, null, true));
                d1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        g0 g0Var = this.f45911c;
        m9 u10 = g0Var.u();
        if (u10 != null) {
            d1 d1Var = this.f45909a;
            if (d1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop());
                u10.a0(canvas, g0Var.z(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        d1 d1Var = this.f45909a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f0(this, layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        d1 d1Var = this.f45909a;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (d1Var.getPaddingLeft() + d1Var.getLeft());
        int paddingTop = i11 - (d1Var.getPaddingTop() + d1Var.getTop());
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
        d1 d1Var = this.f45909a;
        d1Var.layout(dp, i13, max, d1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f45909a;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return d1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a E = this.f45911c.E();
        if (E != null && (pageBlock = E.f45775b) != null) {
            d(pageBlock);
            E.f45775b.caption.text = x5.f(this.f45909a.getText());
        }
    }
}
