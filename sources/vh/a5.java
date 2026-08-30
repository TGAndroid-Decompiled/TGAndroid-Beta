package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
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
import org.telegram.ui.Cells.x9;
public final class a5 extends y implements a6, l9 {
    public final f6 f45804n;
    public final d1 f45805r;
    public y4 f45806s;
    public final ArrayList v;
    public boolean f45807w;

    public a5(Context context, f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.f45804n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, f6Var);
        this.f45805r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        d1Var.setTextColorKey(j6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new ph.j5(this, 16));
        d1Var.setDelegate(new rh.e(this, 14));
        addView(d1Var, b6.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var;
        y4 y4Var = this.f45806s;
        if (y4Var != null) {
            m9Var = ((x2) y4Var).f46278a.getTextSelectionHelper();
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
        d1 d1Var = this.f45805r;
        d1Var.t();
        int i10 = j6.Oh;
        f6 f6Var = this.f45804n;
        d1Var.setTextColor(j6.v0(i10, f6Var));
        d1Var.setHintTextColor(j6.l1(0.5f, j6.v0(i10, f6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.f45805r;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new x4(layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46283a;
    }

    public final void h() {
        a aVar;
        y4 y4Var = this.f45806s;
        if (y4Var != null && (aVar = this.f46283a) != null) {
            long j10 = aVar.f45790t;
            TL_iv.RichText f10 = x5.f(this.f45805r.getText());
            r3 r3Var = ((x2) y4Var).f46278a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                r3Var.f46122j3.put(Long.valueOf(j10), f10);
            } else {
                r3Var.f46122j3.remove(Long.valueOf(j10));
            }
        }
    }
}
