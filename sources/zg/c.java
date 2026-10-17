package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.h9;
import ug.q;
public final class c extends va {
    public final a f51648a0;
    public TL_stories.PrepaidGiveaway f51649b0;

    public c(Context context) {
        super(0, 0, context, false);
        this.f51648a0 = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f51649b0;
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, h6.f21107k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f51649b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        h9 h9Var = this.E;
        if (z10) {
            h9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f51648a0;
            aVar.f51641f = valueOf;
            aVar.e = aVar.f51638a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            h9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                h9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                h9Var.i(-10703110, -12481584);
            } else {
                h9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f51648a0;
            aVar2.f51641f = valueOf2;
            aVar2.e = aVar2.f51638a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f23659b.i(this.f51648a0);
    }
}
