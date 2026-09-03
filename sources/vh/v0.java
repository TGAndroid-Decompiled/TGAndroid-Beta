package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.j8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
public final class v0 extends z implements org.telegram.ui.ActionBar.a6, k9 {
    public final f6 f46290n;
    public final Paint f46291r;
    public final Paint f46292s;
    public n2 v;
    public boolean f46293w;

    public v0(Context context, f6 f6Var) {
        super(context);
        this.f46291r = new Paint(1);
        this.f46292s = new Paint(1);
        this.f46290n = f6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = j6.vk;
        f6 f6Var = this.f46290n;
        this.f46291r.setColor(j6.v0(i10, f6Var));
        this.f46292s.setColor(j6.v0(j6.f20191uf, f6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f46293w) {
            i10 = 0;
        } else {
            i10 = this.f46416c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(j8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46414a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f46293w) {
            i10 = this.f46416c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        l9 textSelectionHelper;
        if (this.f46293w) {
            i10 = 0;
        } else {
            i10 = this.f46416c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h9 = h() - h;
        n2 n2Var = this.v;
        if (n2Var != null && (textSelectionHelper = n2Var.f46110a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f21331u0 && R <= textSelectionHelper.f21334x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h9, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f46292s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h9, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f46291r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h9, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f46291r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
