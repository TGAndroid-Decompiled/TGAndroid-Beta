package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import cg.r;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.xq;
public final class b extends FrameLayout implements qe.b, z5 {
    public ShapeDrawable f53943a;
    public final e6 f53944b;
    public final y7 f53945c;
    public final TextView d;
    public final qe.a f53946e;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f53946e = new qe.a(0, this, xq.h, 380L, false);
        this.f53944b = e6Var;
        y7 y7Var = new y7(context, e6Var, false);
        this.f53945c = y7Var;
        addView(y7Var, mf.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, mf.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        ShapeDrawable shapeDrawable = this.f53943a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f53943a == null) {
            this.f53943a = k6.d0(g0.L(10.0f), i0.a.o(k6.w0(k6.Kl, this.f53944b), 25));
        }
        qe.a aVar = this.f53946e;
        if (aVar.f53841f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Kl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f53943a;
        if (shapeDrawable != null) {
            qe.a aVar = this.f53946e;
            if (aVar.f53840e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.f53943a, g0.T1(0.9f, 1.0f, aVar.f53840e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f53946e.f53841f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f53945c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f53943a;
        e6 e6Var = this.f53944b;
        if (shapeDrawable != null) {
            k6.C1(i0.a.o(k6.w0(k6.Kl, e6Var), 25), shapeDrawable);
            this.f53943a.setAlpha((int) (this.f53946e.f53840e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(k6.w0(k6.Kl, e6Var), 229));
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
