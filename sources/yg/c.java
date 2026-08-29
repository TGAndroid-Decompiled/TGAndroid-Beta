package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Components.jr;
public final class c extends FrameLayout implements vd.b, x5 {
    public ShapeDrawable f50541a;
    public final c6 f50542b;
    public final b8 f50543c;
    public final TextView d;
    public final vd.a f50544e;

    public c(Context context, c6 c6Var) {
        super(context);
        this.f50544e = new vd.a(0, this, jr.h, 380L, false);
        this.f50542b = c6Var;
        b8 b8Var = new b8(context, c6Var, false);
        this.f50543c = b8Var;
        addView(b8Var, f6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, f6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        ShapeDrawable shapeDrawable = this.f50541a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f9 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f50541a == null) {
            this.f50541a = g6.b0(AndroidUtilities.dp(10.0f), i0.a.k(g6.v0(g6.Wk, this.f50542b), 25));
        }
        vd.a aVar = this.f50544e;
        if (aVar.f49506f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f50541a;
        if (shapeDrawable != null) {
            vd.a aVar = this.f50544e;
            if (aVar.f49505e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.f50541a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.f49505e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f50541a;
        c6 c6Var = this.f50542b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = g6.b0(AndroidUtilities.dp(10.0f), i0.a.k(g6.v0(g6.Wk, c6Var), 25));
            this.f50541a = b02;
            b02.setAlpha((int) (this.f50544e.f49505e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(g6.v0(g6.Wk, c6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f50544e.f49506f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f50543c.d(document, null, null, null, false, false);
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
