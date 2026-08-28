package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ff.s;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.gr;
public final class d extends FrameLayout implements td.b, w5 {
    public ShapeDrawable f48408a;
    public final b6 f48409b;
    public final d8 f48410c;
    public final TextView d;
    public final td.a f48411e;

    public d(Context context, b6 b6Var) {
        super(context);
        this.f48411e = new td.a(0, this, gr.h, 380L, false);
        this.f48409b = b6Var;
        d8 d8Var = new d8(context, b6Var, false);
        this.f48410c = d8Var;
        addView(d8Var, e6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, e6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        d();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ShapeDrawable shapeDrawable = this.f48408a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f48408a == null) {
            this.f48408a = f6.b0(AndroidUtilities.dp(10.0f), i0.a.k(f6.v0(f6.Wk, this.f48409b), 25));
        }
        td.a aVar = this.f48411e;
        if (aVar.f47776f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void d() {
        ShapeDrawable shapeDrawable = this.f48408a;
        b6 b6Var = this.f48409b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = f6.b0(AndroidUtilities.dp(10.0f), i0.a.k(f6.v0(f6.Wk, b6Var), 25));
            this.f48408a = b02;
            b02.setAlpha((int) (this.f48411e.f47775e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(f6.v0(f6.Wk, b6Var), 229));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f48408a;
        if (shapeDrawable != null) {
            td.a aVar = this.f48411e;
            if (aVar.f47775e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.f48408a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.f47775e));
            }
        }
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f48411e.f47776f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f48410c.d(document, null, null, null, false, false);
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
