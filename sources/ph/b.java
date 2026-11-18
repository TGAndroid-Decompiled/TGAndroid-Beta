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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.lr;
public final class b extends FrameLayout implements te.b, c6 {
    public ShapeDrawable f55629a;
    public final i6 f55630b;
    public final a8 f55631c;
    public final TextView d;
    public final te.a f55632e;

    public b(Context context, i6 i6Var) {
        super(context);
        this.f55632e = new te.a(0, this, lr.h, 380L, false);
        this.f55630b = i6Var;
        a8 a8Var = new a8(context, i6Var, false);
        this.f55631c = a8Var;
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
        ShapeDrawable shapeDrawable = this.f55629a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f55629a == null) {
            this.f55629a = n6.d0(g0.L(10.0f), i0.a.o(n6.w0(n6.Nl, this.f55630b), 25));
        }
        te.a aVar = this.f55632e;
        if (aVar.f57658f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Nl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f55629a;
        if (shapeDrawable != null) {
            te.a aVar = this.f55632e;
            if (aVar.f57657e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                t.b(canvas, this.f55629a, g0.T1(0.9f, 1.0f, aVar.f57657e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f55632e.f57658f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f55631c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f55629a;
        i6 i6Var = this.f55630b;
        if (shapeDrawable != null) {
            n6.C1(i0.a.o(n6.w0(n6.Nl, i6Var), 25), shapeDrawable);
            this.f55629a.setAlpha((int) (this.f55632e.f57657e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(n6.w0(n6.Nl, i6Var), 229));
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
