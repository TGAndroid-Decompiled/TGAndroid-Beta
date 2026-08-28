package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
public final class x4 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 f46830n;
    public final d1 f46831r;
    public v4 f46832s;
    public final ArrayList v;
    public boolean f46833w;

    public x4(Context context, b6 b6Var) {
        super(context);
        this.v = new ArrayList();
        this.f46830n = b6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, b6Var);
        this.f46831r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        d1Var.setTextColorKey(f6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new n2.p(this, 18));
        d1Var.setDelegate(new kh.p(this, 26));
        addView(d1Var, e6.e(-1, -2, 51));
        d();
    }

    @Override
    public final void d() {
        d1 d1Var = this.f46831r;
        d1Var.t();
        int i9 = f6.Oh;
        b6 b6Var = this.f46830n;
        d1Var.setTextColor(f6.v0(i9, b6Var));
        d1Var.setHintTextColor(f6.l1(0.5f, f6.v0(i9, b6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        v4 v4Var = this.f46832s;
        if (v4Var != null) {
            n9Var = ((u2) v4Var).f46740a.getTextSelectionHelper();
        } else {
            n9Var = null;
        }
        if (n9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                y9 y9Var = (y9) arrayList.get(i9);
                canvas.save();
                canvas.translate(y9Var.getX(), y9Var.getY());
                n9Var.a0(canvas, this, i9);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.f46831r;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new u4(layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46834a;
    }

    public final void h() {
        a aVar;
        v4 v4Var = this.f46832s;
        if (v4Var != null && (aVar = this.f46834a) != null) {
            long j10 = aVar.f46285t;
            TL_iv.RichText f10 = u5.f(this.f46831r.getText());
            o3 o3Var = ((u2) v4Var).f46740a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                o3Var.f46575i3.put(Long.valueOf(j10), f10);
            } else {
                o3Var.f46575i3.remove(Long.valueOf(j10));
            }
        }
    }
}
