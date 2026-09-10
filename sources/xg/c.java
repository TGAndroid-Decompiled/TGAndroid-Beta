package xg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.g9;
import sg.s;
public final class c extends bb {
    public final a f45205a0;
    public TL_stories.PrepaidGiveaway f45206b0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f45205a0 = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f45206b0;
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
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, j6.f18049k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f45206b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        g9 g9Var = this.E;
        if (z10) {
            g9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f45205a0;
            aVar.f45198f = valueOf;
            aVar.e = aVar.f45195a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            g9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                g9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                g9Var.i(-10703110, -12481584);
            } else {
                g9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f45205a0;
            aVar2.f45198f = valueOf2;
            aVar2.e = aVar2.f45195a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f18941b.i(this.f45205a0);
    }
}
