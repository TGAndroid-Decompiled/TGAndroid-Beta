package yg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.j9;
import tg.s;
public final class c extends xa {
    public final a f52230a0;
    public TL_stories.PrepaidGiveaway f52231b0;

    public c(Context context) {
        super(0, 0, context, false);
        this.f52230a0 = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f52231b0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.S) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, i6.f20919k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f52231b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        j9 j9Var = this.E;
        if (z10) {
            j9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f52230a0;
            aVar.f52223f = valueOf;
            aVar.f52222e = aVar.f52219a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            j9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                j9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                j9Var.i(-10703110, -12481584);
            } else {
                j9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f52230a0;
            aVar2.f52223f = valueOf2;
            aVar2.f52222e = aVar2.f52219a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f23737b.i(this.f52230a0);
    }
}
