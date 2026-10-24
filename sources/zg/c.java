package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.f9;
import ug.q;
public final class c extends wa {
    public final a f52098b0;
    public TL_stories.PrepaidGiveaway f52099c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f52098b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f52099c0;
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, k6.f21305k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f52099c0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        f9 f9Var = this.E;
        if (z10) {
            f9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f52098b0;
            aVar.f52091f = valueOf;
            aVar.e = aVar.f52088a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            f9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                f9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                f9Var.i(-10703110, -12481584);
            } else {
                f9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f52098b0;
            aVar2.f52091f = valueOf2;
            aVar2.e = aVar2.f52088a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f23927b.i(this.f52098b0);
    }
}
