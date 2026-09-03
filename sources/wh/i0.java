package wh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m9;
public final class i0 {
    public final e1 f49814a;
    public final g6 f49815b;
    public final h0 f49816c;
    public boolean d;

    public i0(Context context, g6 g6Var, h0 h0Var) {
        this.f49815b = g6Var;
        this.f49816c = h0Var;
        e1 e1Var = new e1(context, g6Var);
        this.f49814a = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setHint(LocaleController.getString(R.string.AddCaption));
        e1Var.setListener(new q5.c0(this, h0Var, false, 15));
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
        e1 e1Var = this.f49814a;
        e1Var.t();
        int v02 = k6.v0(k6.G6, this.f49815b);
        e1Var.setTextColor(k6.l1(0.5f, v02));
        e1Var.setHintTextColor(k6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a G = this.f49816c.G();
        if (G != null && (pageBlock = G.f49653b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = G.f49653b.caption.text;
            String l10 = x5.l(richText);
            e1 e1Var = this.f49814a;
            if (!String.valueOf(e1Var.getText()).equals(l10)) {
                e1Var.setTextSilently(x5.r(richText, null, true));
                e1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        h0 h0Var = this.f49816c;
        m9 z4 = h0Var.z();
        if (z4 != null) {
            e1 e1Var = this.f49814a;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                z4.a0(canvas, h0Var.E(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        e1 e1Var = this.f49814a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new g0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        e1 e1Var = this.f49814a;
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
        e1 e1Var = this.f49814a;
        e1Var.layout(dp, i13, max, e1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f49814a;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return e1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a G = this.f49816c.G();
        if (G != null && (pageBlock = G.f49653b) != null) {
            d(pageBlock);
            G.f49653b.caption.text = x5.f(this.f49814a.getText());
        }
    }
}
