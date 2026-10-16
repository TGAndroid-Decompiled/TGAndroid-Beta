package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.k9;
import ug.s;
public final class c extends xa {
    public final a f50245a0;
    public TL_stories.PrepaidGiveaway f50246b0;

    public c(Context context) {
        super(0, 0, context, false);
        this.f50245a0 = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f50246b0;
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g6.f19722k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f50246b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        k9 k9Var = this.E;
        if (z10) {
            k9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f50245a0;
            aVar.f50238f = valueOf;
            aVar.e = aVar.f50235a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            k9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                k9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                k9Var.i(-10703110, -12481584);
            } else {
                k9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f50245a0;
            aVar2.f50238f = valueOf2;
            aVar2.e = aVar2.f50235a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f22448b.i(this.f50245a0);
    }
}
