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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.w9;
import ph.z8;
public final class b5 extends z implements org.telegram.ui.ActionBar.a6, k9 {
    public final f6 f45900n;
    public final e1 f45901r;
    public z4 f45902s;
    public final ArrayList v;
    public boolean f45903w;

    public b5(Context context, f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.f45900n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e1 e1Var = new e1(context, f6Var);
        this.f45901r = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        e1Var.setTextColorKey(j6.Oh);
        e1Var.setAccentHint(true);
        e1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        e1Var.setListener(new o2.i(this, 28));
        e1Var.setDelegate(new z8(this, 17));
        addView(e1Var, b6.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l9 l9Var;
        z4 z4Var = this.f45902s;
        if (z4Var != null) {
            l9Var = ((y2) z4Var).f46409a.getTextSelectionHelper();
        } else {
            l9Var = null;
        }
        if (l9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                w9 w9Var = (w9) arrayList.get(i10);
                canvas.save();
                canvas.translate(w9Var.getX(), w9Var.getY());
                l9Var.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        e1 e1Var = this.f45901r;
        e1Var.t();
        int i10 = j6.Oh;
        f6 f6Var = this.f45900n;
        e1Var.setTextColor(j6.v0(i10, f6Var));
        e1Var.setHintTextColor(j6.l1(0.5f, j6.v0(i10, f6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var = this.f45901r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new y4(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46414a;
    }

    public final void h() {
        a aVar;
        z4 z4Var = this.f45902s;
        if (z4Var != null && (aVar = this.f46414a) != null) {
            long j10 = aVar.f45868t;
            TL_iv.RichText f10 = y5.f(this.f45901r.getText());
            s3 s3Var = ((y2) z4Var).f46409a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                s3Var.f46219j3.put(Long.valueOf(j10), f10);
            } else {
                s3Var.f46219j3.remove(Long.valueOf(j10));
            }
        }
    }
}
