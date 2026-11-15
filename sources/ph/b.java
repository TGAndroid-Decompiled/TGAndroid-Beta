package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.s;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.er;
public final class b extends FrameLayout implements te.b, z5 {
    public ShapeDrawable f55053a;
    public final e6 f55054b;
    public final y7 f55055c;
    public final TextView d;
    public final te.a f55056e;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f55056e = new te.a(0, this, er.h, 380L, false);
        this.f55054b = e6Var;
        y7 y7Var = new y7(context, e6Var, false);
        this.f55055c = y7Var;
        addView(y7Var, ja.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, ja.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ShapeDrawable shapeDrawable = this.f55053a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f55053a == null) {
            this.f55053a = j6.d0(g0.L(10.0f), i0.a.o(j6.w0(j6.Nl, this.f55054b), 25));
        }
        te.a aVar = this.f55056e;
        if (aVar.f57082f == z10 && !z11) {
            return;
        }
        aVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Nl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f55053a;
        if (shapeDrawable != null) {
            te.a aVar = this.f55056e;
            if (aVar.f57081e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.f55053a, g0.T1(0.9f, 1.0f, aVar.f57081e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f55056e.f57082f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f55055c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f55053a;
        e6 e6Var = this.f55054b;
        if (shapeDrawable != null) {
            j6.C1(i0.a.o(j6.w0(j6.Nl, e6Var), 25), shapeDrawable);
            this.f55053a.setAlpha((int) (this.f55056e.f57081e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(j6.w0(j6.Nl, e6Var), 229));
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
