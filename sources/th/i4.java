package th;

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
import i7.f6;
import i7.y7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class i4 extends y implements org.telegram.ui.ActionBar.x5, j9 {
    public final int[] A;
    public final c6 f48492n;
    public final Paint f48493r;
    public final HorizontalScrollView f48494s;
    public final ImageView v;
    public Bitmap f48495w;
    public int f48496x;
    public u2 f48497y;

    public i4(Context context, c6 c6Var) {
        super(context);
        this.f48493r = new Paint(1);
        this.f48496x = 0;
        this.A = new int[4];
        this.f48492n = c6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f48494s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, f6.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f48892a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = g6.f23374uf;
        c6 c6Var = this.f48492n;
        this.f48493r.setColor(g6.v0(i10, c6Var));
        this.f48496x = g6.v0(g6.G6, c6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f48496x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.A;
        i(iArr);
        arrayList.add(y7.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f48892a;
    }

    public final void h(a aVar, u2 u2Var) {
        q a2;
        this.f48892a = aVar;
        this.f48497y = u2Var;
        c(aVar);
        this.f48495w = null;
        this.f48494s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = q.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f48495w = a2.f48679a;
        }
        this.v.setImageBitmap(this.f48495w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f48495w != null && this.v.getWidth() > this.f48494s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f48495w;
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
        u2 u2Var;
        k9 textSelectionHelper;
        if (this.f48496x != g6.v0(g6.G6, this.f48492n)) {
            e();
        }
        if (this.f48495w != null && (u2Var = this.f48497y) != null && (textSelectionHelper = u2Var.f48795a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                int[] iArr = this.A;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f48493r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
