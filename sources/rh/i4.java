package rh;

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
import h7.a7;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;

public final class i4 extends y implements org.telegram.ui.ActionBar.x5, i9 {
    public final int[] A;

    public final c6 f47192n;

    public final Paint f47193r;

    public final HorizontalScrollView f47194s;
    public final ImageView v;

    public Bitmap f47195w;

    public int f47196x;

    public u2 f47197y;

    public i4(Context context, c6 c6Var) {
        super(context);
        this.f47193r = new Paint(1);
        this.f47196x = 0;
        this.A = new int[4];
        this.f47192n = c6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f47194s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, z5.e(-1, -2, 16));
        d();
    }

    private String getSource() {
        a aVar = this.f47594a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return ((TL_iv.pageBlockMath) pageBlock).source;
        }
        return null;
    }

    @Override
    public final void d() {
        int i10 = g6.f23366uf;
        c6 c6Var = this.f47192n;
        this.f47193r.setColor(g6.v0(i10, c6Var));
        this.f47196x = g6.v0(g6.G6, c6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f47196x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.A;
        i(iArr);
        arrayList.add(a7.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f47594a;
    }

    public final void h(a aVar, u2 u2Var) {
        q qVarA;
        this.f47594a = aVar;
        this.f47197y = u2Var;
        c(aVar);
        this.f47195w = null;
        this.f47194s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (qVarA = q.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f47195w = qVarA.f47381a;
        }
        this.v.setImageBitmap(this.f47195w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f47195w != null && this.v.getWidth() > this.f47194s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f47195w;
        int width = bitmap != null ? bitmap.getWidth() : Math.max(1, getWidth() / 2);
        int width2 = (getWidth() - width) / 2;
        iArr[0] = width2 - AndroidUtilities.dp(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = AndroidUtilities.dp(4.0f) + width2 + width;
        iArr[3] = height;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u2 u2Var;
        j9 textSelectionHelper;
        if (this.f47196x != g6.v0(g6.G6, this.f47192n)) {
            d();
        }
        if (this.f47195w == null || (u2Var = this.f47197y) == null || (textSelectionHelper = u2Var.f47497a.getTextSelectionHelper()) == null || !textSelectionHelper.y() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int iR = RecyclerView.R(this);
        if (iR >= 0 && iR >= textSelectionHelper.f24540u0 && iR <= textSelectionHelper.f24543x0) {
            int[] iArr = this.A;
            i(iArr);
            canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f47193r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
