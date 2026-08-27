package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h7.a7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;

public final class u0 extends y implements org.telegram.ui.ActionBar.x5, i9 {

    public final c6 f47490n;

    public final Paint f47491r;

    public final Paint f47492s;
    public l2 v;

    public boolean f47493w;

    public u0(Context context, c6 c6Var) {
        super(context);
        this.f47491r = new Paint(1);
        this.f47492s = new Paint(1);
        this.f47490n = c6Var;
        setWillNotDraw(false);
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.vk;
        c6 c6Var = this.f47490n;
        this.f47491r.setColor(g6.v0(i10, c6Var));
        this.f47492s.setColor(g6.v0(g6.f23366uf, c6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10 = this.f47493w ? 0 : this.f47596c;
        int iH = (h() - i10) / 4;
        arrayList.add(a7.a((i10 + iH) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - iH), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f47594a;
    }

    public final int h() {
        return getMeasuredWidth() - (this.f47493w ? this.f47596c : 0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        j9 textSelectionHelper;
        int i10 = this.f47493w ? 0 : this.f47596c;
        int iH = (h() - i10) / 4;
        int i11 = i10 + iH;
        int iH2 = h() - iH;
        l2 l2Var = this.v;
        if (l2Var != null && (textSelectionHelper = l2Var.f47258a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int iR = RecyclerView.R(this);
            if (iR >= 0 && iR >= textSelectionHelper.f24540u0 && iR <= textSelectionHelper.f24543x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + iH2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f47492s);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        float fDp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i11, fDp, iH2, AndroidUtilities.dp(1.0f) + fDp);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f47491r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
