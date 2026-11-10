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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.wq;
public final class b extends FrameLayout implements te.b, c6 {
    public ShapeDrawable f53648a;
    public final h6 f53649b;
    public final z7 f53650c;
    public final TextView d;
    public final te.a f53651e;

    public b(Context context, h6 h6Var) {
        super(context);
        this.f53651e = new te.a(0, this, wq.h, 380L, false);
        this.f53649b = h6Var;
        z7 z7Var = new z7(context, h6Var, false);
        this.f53650c = z7Var;
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
        ShapeDrawable shapeDrawable = this.f53648a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 && this.f53648a == null) {
            this.f53648a = m6.d0(g0.L(10.0f), i0.a.o(m6.w0(m6.Kl, this.f53649b), 25));
        }
        te.a aVar = this.f53651e;
        if (aVar.f55499f == z9 && !z10) {
            return;
        }
        aVar.a(z9, z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Kl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f53648a;
        if (shapeDrawable != null) {
            te.a aVar = this.f53651e;
            if (aVar.f55498e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.f53648a, g0.T1(0.9f, 1.0f, aVar.f55498e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f53651e.f55499f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f53650c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f53648a;
        h6 h6Var = this.f53649b;
        if (shapeDrawable != null) {
            m6.C1(i0.a.o(m6.w0(m6.Kl, h6Var), 25), shapeDrawable);
            this.f53648a.setAlpha((int) (this.f53651e.f55498e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(m6.w0(m6.Kl, h6Var), 229));
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
