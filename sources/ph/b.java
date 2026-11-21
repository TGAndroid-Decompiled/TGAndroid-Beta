package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.t;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.nr;
public final class b extends FrameLayout implements te.b, b6 {
    public ShapeDrawable f55670a;
    public final h6 f55671b;
    public final a8 f55672c;
    public final TextView d;
    public final te.a f55673e;

    public b(Context context, h6 h6Var) {
        super(context);
        this.f55673e = new te.a(0, this, nr.h, 380L, false);
        this.f55671b = h6Var;
        a8 a8Var = new a8(context, h6Var, false);
        this.f55672c = a8Var;
        addView(a8Var, ma.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, ma.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ShapeDrawable shapeDrawable = this.f55670a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f55670a == null) {
            this.f55670a = m6.d0(g0.L(10.0f), i0.a.o(m6.w0(m6.Nl, this.f55671b), 25));
        }
        te.a aVar = this.f55673e;
        if (aVar.f57697f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Nl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f55670a;
        if (shapeDrawable != null) {
            te.a aVar = this.f55673e;
            if (aVar.f57696e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                t.b(canvas, this.f55670a, g0.T1(0.9f, 1.0f, aVar.f57696e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f55673e.f57697f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f55672c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f55670a;
        h6 h6Var = this.f55671b;
        if (shapeDrawable != null) {
            m6.C1(i0.a.o(m6.w0(m6.Nl, h6Var), 25), shapeDrawable);
            this.f55670a.setAlpha((int) (this.f55673e.f57696e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(m6.w0(m6.Nl, h6Var), 229));
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
