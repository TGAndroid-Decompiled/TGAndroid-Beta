package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.s;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.xq;
public final class b extends FrameLayout implements te.b, b6 {
    public ShapeDrawable f53649a;
    public final g6 f53650b;
    public final z7 f53651c;
    public final TextView d;
    public final te.a f53652e;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f53652e = new te.a(0, this, xq.h, 380L, false);
        this.f53650b = g6Var;
        z7 z7Var = new z7(context, g6Var, false);
        this.f53651c = z7Var;
        addView(z7Var, ha.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        ShapeDrawable shapeDrawable = this.f53649a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 && this.f53649a == null) {
            this.f53649a = l6.d0(g0.L(10.0f), i0.a.o(l6.w0(l6.Kl, this.f53650b), 25));
        }
        te.a aVar = this.f53652e;
        if (aVar.f55500f == z9 && !z10) {
            return;
        }
        aVar.a(z9, z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Kl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f53649a;
        if (shapeDrawable != null) {
            te.a aVar = this.f53652e;
            if (aVar.f55499e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.f53649a, g0.T1(0.9f, 1.0f, aVar.f55499e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f53652e.f55500f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f53651c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f53649a;
        g6 g6Var = this.f53650b;
        if (shapeDrawable != null) {
            l6.C1(i0.a.o(l6.w0(l6.Kl, g6Var), 25), shapeDrawable);
            this.f53649a.setAlpha((int) (this.f53652e.f55499e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(l6.w0(l6.Kl, g6Var), 229));
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
