package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;

public final class y4 extends y implements org.telegram.ui.ActionBar.x5, i9 {

    public final c6 f47608n;

    public final d1 f47609r;

    public w4 f47610s;
    public final ArrayList v;

    public boolean f47611w;

    public y4(Context context, c6 c6Var) {
        super(context);
        this.v = new ArrayList();
        this.f47608n = c6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, c6Var);
        this.f47609r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        d1Var.setTextColorKey(g6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new n2.b0(this, 20));
        d1Var.setDelegate(new lh.p(this, 26));
        addView(d1Var, z5.e(-1, -2, 51));
        d();
    }

    @Override
    public final void d() {
        d1 d1Var = this.f47609r;
        d1Var.t();
        int i10 = g6.Oh;
        c6 c6Var = this.f47608n;
        d1Var.setTextColor(g6.v0(i10, c6Var));
        d1Var.setHintTextColor(g6.l1(0.5f, g6.v0(i10, c6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w4 w4Var = this.f47610s;
        j9 textSelectionHelper = w4Var != null ? ((v2) w4Var).f47519a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u9 u9Var = (u9) arrayList.get(i10);
                canvas.save();
                canvas.translate(u9Var.getX(), u9Var.getY());
                textSelectionHelper.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.f47609r;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new v4(layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f47594a;
    }

    public final void h() {
        a aVar;
        w4 w4Var = this.f47610s;
        if (w4Var == null || (aVar = this.f47594a) == null) {
            return;
        }
        long j10 = aVar.f47044t;
        TL_iv.RichText richTextF = v5.f(this.f47609r.getText());
        p3 p3Var = ((v2) w4Var).f47519a;
        if (richTextF == null || (richTextF instanceof TL_iv.textEmpty)) {
            p3Var.f47350i3.remove(Long.valueOf(j10));
        } else {
            p3Var.f47350i3.put(Long.valueOf(j10), richTextF);
        }
    }
}
