package th;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
public final class y4 extends y implements org.telegram.ui.ActionBar.x5, j9 {
    public final c6 f48906n;
    public final d1 f48907r;
    public w4 f48908s;
    public final ArrayList v;
    public boolean f48909w;

    public y4(Context context, c6 c6Var) {
        super(context);
        this.v = new ArrayList();
        this.f48906n = c6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, c6Var);
        this.f48907r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        d1Var.setTextColorKey(g6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new o4.g(this, 18));
        d1Var.setDelegate(new sf.f1(this, 9));
        addView(d1Var, f6.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        w4 w4Var = this.f48908s;
        if (w4Var != null) {
            k9Var = ((v2) w4Var).f48817a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                v9 v9Var = (v9) arrayList.get(i10);
                canvas.save();
                canvas.translate(v9Var.getX(), v9Var.getY());
                k9Var.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        d1 d1Var = this.f48907r;
        d1Var.t();
        int i10 = g6.Oh;
        c6 c6Var = this.f48906n;
        d1Var.setTextColor(g6.v0(i10, c6Var));
        d1Var.setHintTextColor(g6.l1(0.5f, g6.v0(i10, c6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.f48907r;
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
        return this.f48892a;
    }

    public final void h() {
        a aVar;
        w4 w4Var = this.f48908s;
        if (w4Var != null && (aVar = this.f48892a) != null) {
            long j10 = aVar.f48344t;
            TL_iv.RichText f9 = v5.f(this.f48907r.getText());
            p3 p3Var = ((v2) w4Var).f48817a;
            if (f9 != null && !(f9 instanceof TL_iv.textEmpty)) {
                p3Var.f48648i3.put(Long.valueOf(j10), f9);
            } else {
                p3Var.f48648i3.remove(Long.valueOf(j10));
            }
        }
    }
}
