package ph;

import ag.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i8;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class c extends FrameLayout implements oe.d, p6 {
    public ShapeDrawable f46858a;
    public final u6 f46859b;
    public final i8 f46860c;
    public final TextView d;
    public final oe.b e;

    public c(Context context, u6 u6Var) {
        super(context);
        this.e = new oe.b(0, this, ds.h, 380L, false);
        this.f46859b = u6Var;
        i8 i8Var = new i8(context, u6Var, false);
        this.f46860c = i8Var;
        addView(i8Var, gb1.h(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, gb1.h(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f46858a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f46858a == null) {
            this.f46858a = y6.c0(AndroidUtilities.dp(10.0f), i0.a.o(y6.w0(y6.Wk, this.f46859b), 25));
        }
        oe.b bVar = this.e;
        if (bVar.f19327f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Wk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f46858a;
        if (shapeDrawable != null) {
            oe.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                v.b(canvas, this.f46858a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.e.f19327f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f46860c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f46858a;
        u6 u6Var = this.f46859b;
        if (shapeDrawable != null) {
            y6.z1(i0.a.o(y6.w0(y6.Wk, u6Var), 25), shapeDrawable);
            this.f46858a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(y6.w0(y6.Wk, u6Var), 229));
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
