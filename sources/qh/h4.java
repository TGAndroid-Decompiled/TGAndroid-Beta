package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import g7.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
public final class h4 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public final int[] A;
    public final b6 f46420n;
    public final Paint f46421r;
    public final HorizontalScrollView f46422s;
    public final ImageView v;
    public Bitmap f46423w;
    public int f46424x;
    public t2 f46425y;

    public h4(Context context, b6 b6Var) {
        super(context);
        this.f46421r = new Paint(1);
        this.f46424x = 0;
        this.A = new int[4];
        this.f46420n = b6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f46422s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, e6.e(-1, -2, 16));
        d();
    }

    private String getSource() {
        a aVar = this.f46834a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d() {
        int i9 = f6.f23312uf;
        b6 b6Var = this.f46420n;
        this.f46421r.setColor(f6.v0(i9, b6Var));
        this.f46424x = f6.v0(f6.G6, b6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f46424x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.A;
        i(iArr);
        arrayList.add(w6.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46834a;
    }

    public final void h(a aVar, t2 t2Var) {
        q a2;
        this.f46834a = aVar;
        this.f46425y = t2Var;
        c(aVar);
        this.f46423w = null;
        this.f46422s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = q.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f46423w = a2.f46618a;
        }
        this.v.setImageBitmap(this.f46423w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f46423w != null && this.v.getWidth() > this.f46422s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f46423w;
        if (bitmap != null) {
            max = bitmap.getWidth();
        } else {
            max = Math.max(1, getWidth() / 2);
        }
        int width = (getWidth() - max) / 2;
        iArr[0] = width - AndroidUtilities.dp(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = AndroidUtilities.dp(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t2 t2Var;
        n9 textSelectionHelper;
        if (this.f46424x != f6.v0(f6.G6, this.f46420n)) {
            d();
        }
        if (this.f46423w != null && (t2Var = this.f46425y) != null && (textSelectionHelper = t2Var.f46722a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                int[] iArr = this.A;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f46421r);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}
