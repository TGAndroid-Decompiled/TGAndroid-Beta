package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.m8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
public final class v0 extends z implements b6, l9 {
    public final g6 f50126n;
    public final Paint f50127r;
    public final Paint f50128s;
    public n2 v;
    public boolean f50129w;

    public v0(Context context, g6 g6Var) {
        super(context);
        this.f50127r = new Paint(1);
        this.f50128s = new Paint(1);
        this.f50126n = g6Var;
        setWillNotDraw(false);
        e();
    }

    @Override
    public final void e() {
        int i10 = k6.vk;
        g6 g6Var = this.f50126n;
        this.f50127r.setColor(k6.v0(i10, g6Var));
        this.f50128s.setColor(k6.v0(k6.f21972uf, g6Var));
    }

    @Override
    public final void f(int i10) {
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10;
        if (this.f50129w) {
            i10 = 0;
        } else {
            i10 = this.f50213c;
        }
        int h = (h() - i10) / 4;
        arrayList.add(m8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f50211a;
    }

    public final int h() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f50129w) {
            i10 = this.f50213c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        m9 textSelectionHelper;
        if (this.f50129w) {
            i10 = 0;
        } else {
            i10 = this.f50213c;
        }
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h9 = h() - h;
        n2 n2Var = this.v;
        if (n2Var != null && (textSelectionHelper = n2Var.f49925a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f23177u0 && R <= textSelectionHelper.f23180x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h9, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f50128s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h9, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f50127r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h9, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.f50127r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
