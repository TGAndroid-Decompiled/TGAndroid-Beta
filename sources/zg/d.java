package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

public final class d extends View {

    public final Drawable f50815a;

    public final ud.a f50816b;

    public final int f50817c;
    public e d;

    public d(Context context, int i10) {
        super(context);
        this.f50816b = new ud.a(this, er.h, 380L);
        this.f50817c = i10;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.f50815a = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23252o7, false), PorterDuff.Mode.SRC_IN));
    }

    public final void a(e eVar, boolean z10) {
        e eVar2;
        e eVar3;
        this.f50816b.a(eVar != null, z10);
        if (isAttachedToWindow() && (eVar3 = this.d) != null) {
            eVar3.b();
        }
        this.d = eVar;
        if (!isAttachedToWindow() || (eVar2 = this.d) == null) {
            return;
        }
        eVar2.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.d;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.d;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f50816b.f48497e;
        if (f10 < 1.0f) {
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.scale(f11, f11, width, height);
            this.f50815a.draw(canvas);
            canvas.restore();
        }
        if (f10 > 0.0f) {
            float f12 = this.f50817c;
            int iDp = AndroidUtilities.dp(f12);
            int width2 = (getWidth() - iDp) / 2;
            int height2 = (getHeight() - iDp) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f10, f10, AndroidUtilities.dp(f12) / 2.0f, AndroidUtilities.dp(f12) / 2.0f);
            e eVar = this.d;
            if (eVar != null) {
                eVar.c(canvas, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(24.0f);
        int i14 = (i10 - iDp) / 2;
        int i15 = (i11 - iDp) / 2;
        this.f50815a.setBounds(i14, i15, i14 + iDp, iDp + i15);
    }
}
