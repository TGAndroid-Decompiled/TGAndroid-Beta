package vh;

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
import k7.b6;
import k7.j8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
public final class k4 extends y implements a6, l9 {
    public final int[] B;
    public final f6 f45979n;
    public final Paint f45980r;
    public final HorizontalScrollView f45981s;
    public final ImageView v;
    public Bitmap f45982w;
    public int f45983x;
    public w2 f45984y;

    public k4(Context context, f6 f6Var) {
        super(context);
        this.f45980r = new Paint(1);
        this.f45983x = 0;
        this.B = new int[4];
        this.f45979n = f6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f45981s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, b6.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f46283a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = j6.f20216uf;
        f6 f6Var = this.f45979n;
        this.f45980r.setColor(j6.v0(i10, f6Var));
        this.f45983x = j6.v0(j6.G6, f6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f45983x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.B;
        i(iArr);
        arrayList.add(j8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46283a;
    }

    public final void h(a aVar, w2 w2Var) {
        q a2;
        this.f46283a = aVar;
        this.f45984y = w2Var;
        c(aVar);
        this.f45982w = null;
        this.f45981s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = q.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f45982w = a2.f46075a;
        }
        this.v.setImageBitmap(this.f45982w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f45982w != null && this.v.getWidth() > this.f45981s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f45982w;
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
        if (this.f45983x != j6.v0(j6.G6, this.f45979n)) {
            e();
        }
        if (this.f45982w != null && (w2Var = this.f45984y) != null && (textSelectionHelper = w2Var.f46259a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f21401u0 && R <= textSelectionHelper.f21404x0) {
                int[] iArr = this.B;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f45980r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
