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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.xq;
public final class b extends FrameLayout implements te.b, a6 {
    public ShapeDrawable f53519a;
    public final f6 f53520b;
    public final z7 f53521c;
    public final TextView d;
    public final te.a f53522e;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f53522e = new te.a(0, this, xq.h, 380L, false);
        this.f53520b = f6Var;
        z7 z7Var = new z7(context, f6Var, false);
        this.f53521c = z7Var;
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
        ShapeDrawable shapeDrawable = this.f53519a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 && this.f53519a == null) {
            this.f53519a = k6.d0(g0.L(10.0f), i0.a.o(k6.w0(k6.Kl, this.f53520b), 25));
        }
        te.a aVar = this.f53522e;
        if (aVar.f55371f == z9 && !z10) {
            return;
        }
        aVar.a(z9, z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Kl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f53519a;
        if (shapeDrawable != null) {
            te.a aVar = this.f53522e;
            if (aVar.f55370e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.f53519a, g0.T1(0.9f, 1.0f, aVar.f55370e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.f53522e.f55371f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f53521c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f53519a;
        f6 f6Var = this.f53520b;
        if (shapeDrawable != null) {
            k6.C1(i0.a.o(k6.w0(k6.Kl, f6Var), 25), shapeDrawable);
            this.f53519a.setAlpha((int) (this.f53522e.f55370e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(k6.w0(k6.Kl, f6Var), 229));
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
