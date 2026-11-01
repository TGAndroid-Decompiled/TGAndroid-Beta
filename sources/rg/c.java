package rg;

import android.content.Context;
import android.graphics.Canvas;
import mg.k0;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.r8;
public final class c extends pa {
    public final a f46605b0;
    public TL_stories.PrepaidGiveaway f46606c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f46605b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f46606c0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.S) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = i0.L(70.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = i0.L(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, t6.f21053k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f46606c0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        r8 r8Var = this.E;
        if (z10) {
            r8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f46605b0;
            aVar.f46598f = valueOf;
            aVar.e = aVar.f46595a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            r8Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                r8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                r8Var.i(-10703110, -12481584);
            } else {
                r8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(k0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f46605b0;
            aVar2.f46598f = valueOf2;
            aVar2.e = aVar2.f46595a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f22471b.i(this.f46605b0);
    }
}
