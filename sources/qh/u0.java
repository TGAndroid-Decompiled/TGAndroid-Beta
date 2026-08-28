package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g7.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
public final class u0 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 f46733n;
    public final Paint f46734r;
    public final Paint f46735s;
    public l2 v;
    public boolean f46736w;

    public u0(Context context, b6 b6Var) {
        super(context);
        this.f46734r = new Paint(1);
        this.f46735s = new Paint(1);
        this.f46733n = b6Var;
        setWillNotDraw(false);
        d();
    }

    @Override
    public final void d() {
        int i9 = f6.vk;
        b6 b6Var = this.f46733n;
        this.f46734r.setColor(f6.v0(i9, b6Var));
        this.f46735s.setColor(f6.v0(f6.f23312uf, b6Var));
    }

    @Override
    public final void f(int i9) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i9;
        if (this.f46736w) {
            i9 = 0;
        } else {
            i9 = this.f46836c;
        }
        int h = (h() - i9) / 4;
        arrayList.add(w6.a((i9 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46834a;
    }

    public final int h() {
        int i9;
        int measuredWidth = getMeasuredWidth();
        if (this.f46736w) {
            i9 = this.f46836c;
        } else {
            i9 = 0;
        }
        return measuredWidth - i9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        Canvas canvas2;
        n9 textSelectionHelper;
        if (this.f46736w) {
            i9 = 0;
        } else {
            i9 = this.f46836c;
        }
        int h = (h() - i9) / 4;
        int i10 = i9 + h;
        int h10 = h() - h;
        l2 l2Var = this.v;
        if (l2Var != null && (textSelectionHelper = l2Var.f46498a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f46735s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i10, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f46734r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i10, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f46734r);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(12.0f));
    }
}
