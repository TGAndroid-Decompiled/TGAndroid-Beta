package wh;

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
import java.util.ArrayList;
import k7.c6;
import k7.m8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
public final class k4 extends z implements b6, l9 {
    public final int[] B;
    public final g6 f49865n;
    public final Paint f49866r;
    public final HorizontalScrollView f49867s;
    public final ImageView v;
    public Bitmap f49868w;
    public int f49869x;
    public w2 f49870y;

    public k4(Context context, g6 g6Var) {
        super(context);
        this.f49866r = new Paint(1);
        this.f49869x = 0;
        this.B = new int[4];
        this.f49865n = g6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f49867s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, c6.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f50211a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = k6.f21972uf;
        g6 g6Var = this.f49865n;
        this.f49866r.setColor(k6.v0(i10, g6Var));
        this.f49869x = k6.v0(k6.G6, g6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f49869x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.B;
        i(iArr);
        arrayList.add(m8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f50211a;
    }

    public final void h(a aVar, w2 w2Var) {
        r a2;
        this.f50211a = aVar;
        this.f49870y = w2Var;
        c(aVar);
        this.f49868w = null;
        this.f49867s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = r.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f49868w = a2.f49994a;
        }
        this.v.setImageBitmap(this.f49868w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f49868w != null && this.v.getWidth() > this.f49867s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f49868w;
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
        w2 w2Var;
        m9 textSelectionHelper;
        if (this.f49869x != k6.v0(k6.G6, this.f49865n)) {
            e();
        }
        if (this.f49868w != null && (w2Var = this.f49870y) != null && (textSelectionHelper = w2Var.f50167a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f23177u0 && R <= textSelectionHelper.f23180x0) {
                int[] iArr = this.B;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f49866r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
