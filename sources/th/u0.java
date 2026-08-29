package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i7.y7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class u0 extends y implements org.telegram.ui.ActionBar.x5, j9 {
    public final c6 f48788n;
    public final Paint f48789r;
    public final Paint f48790s;
    public l2 v;
    public boolean f48791w;

    public u0(Context context, c6 c6Var) {
        super(context);
        this.f48789r = new Paint(1);
        this.f48790s = new Paint(1);
        this.f48788n = c6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = g6.vk;
        c6 c6Var = this.f48788n;
        this.f48789r.setColor(g6.v0(i10, c6Var));
        this.f48790s.setColor(g6.v0(g6.f23374uf, c6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f48791w) {
            i10 = 0;
        } else {
            i10 = this.f48894c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(y7.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f48892a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f48791w) {
            i10 = this.f48894c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        k9 textSelectionHelper;
        if (this.f48791w) {
            i10 = 0;
        } else {
            i10 = this.f48894c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        l2 l2Var = this.v;
        if (l2Var != null && (textSelectionHelper = l2Var.f48558a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f48790s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f48789r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f48789r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
