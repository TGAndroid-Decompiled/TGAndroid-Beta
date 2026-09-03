package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
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
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ai;
public final class a5 extends z implements b6, l9 {
    public final g6 f49680n;
    public final e1 f49681r;
    public y4 f49682s;
    public final ArrayList v;
    public boolean f49683w;

    public a5(Context context, g6 g6Var) {
        super(context);
        this.v = new ArrayList();
        this.f49680n = g6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e1 e1Var = new e1(context, g6Var);
        this.f49681r = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        e1Var.setTextColorKey(k6.Oh);
        e1Var.setAccentHint(true);
        e1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        e1Var.setListener(new ai(this, 22));
        e1Var.setDelegate(new sf.h(this, 18));
        addView(e1Var, c6.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var;
        y4 y4Var = this.f49682s;
        if (y4Var != null) {
            m9Var = ((x2) y4Var).f50190a.getTextSelectionHelper();
        } else {
            m9Var = null;
        }
        if (m9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                x9 x9Var = (x9) arrayList.get(i10);
                canvas.save();
                canvas.translate(x9Var.getX(), x9Var.getY());
                m9Var.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        e1 e1Var = this.f49681r;
        e1Var.t();
        int i10 = k6.Oh;
        g6 g6Var = this.f49680n;
        e1Var.setTextColor(k6.v0(i10, g6Var));
        e1Var.setHintTextColor(k6.l1(0.5f, k6.v0(i10, g6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var = this.f49681r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new x4(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f50211a;
    }

    public final void h() {
        a aVar;
        y4 y4Var = this.f49682s;
        if (y4Var != null && (aVar = this.f50211a) != null) {
            long j10 = aVar.f49669t;
            TL_iv.RichText f10 = x5.f(this.f49681r.getText());
            r3 r3Var = ((x2) y4Var).f50190a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                r3Var.f50026j3.put(Long.valueOf(j10), f10);
            } else {
                r3Var.f50026j3.remove(Long.valueOf(j10));
            }
        }
    }
}
