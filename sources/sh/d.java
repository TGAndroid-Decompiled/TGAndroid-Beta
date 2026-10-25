package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
public final class d extends View {
    public final Drawable f48625a;
    public final oe.b f48626b;
    public final int f48627c;
    public e d;

    public d(Context context, int i10) {
        super(context);
        this.f48626b = new oe.b(this, ds.h, 380L);
        this.f48627c = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.f48625a = mutate;
        f7.y(this, mutate, y6.f23559o7, null, PorterDuff.Mode.SRC_IN);
    }

    public final void a(e eVar, boolean z10) {
        boolean z11;
        e eVar2;
        e eVar3;
        if (eVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48626b.a(z11, z10);
        if (isAttachedToWindow() && (eVar3 = this.d) != null) {
            eVar3.b();
        }
        this.d = eVar;
        if (isAttachedToWindow() && (eVar2 = this.d) != null) {
            eVar2.a(this);
        }
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
        float f7 = this.f48626b.e;
        if (f7 < 1.0f) {
            canvas.save();
            float f10 = 1.0f - f7;
            canvas.scale(f10, f10, width, height);
            this.f48625a.draw(canvas);
            canvas.restore();
        }
        if (f7 > 0.0f) {
            float f11 = this.f48627c;
            int dp = AndroidUtilities.dp(f11);
            canvas.save();
            canvas.translate((getWidth() - dp) / 2, (getHeight() - dp) / 2);
            canvas.scale(f7, f7, AndroidUtilities.dp(f11) / 2.0f, AndroidUtilities.dp(f11) / 2.0f);
            e eVar = this.d;
            if (eVar != null) {
                eVar.c(canvas, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(24.0f);
        int i14 = (i10 - dp) / 2;
        int i15 = (i11 - dp) / 2;
        this.f48625a.setBounds(i14, i15, i14 + dp, dp + i15);
    }
}
