package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.h9;
import ug.q;
public final class c extends wa {
    public final a f52099b0;
    public TL_stories.PrepaidGiveaway f52100c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f52099b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f52100c0;
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, k6.f21304k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f52100c0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        h9 h9Var = this.E;
        if (z10) {
            h9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f52099b0;
            aVar.f52092f = valueOf;
            aVar.e = aVar.f52089a.measureText(valueOf);
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
            a aVar2 = this.f52099b0;
            aVar2.f52092f = valueOf2;
            aVar2.e = aVar2.f52089a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f23926b.i(this.f52099b0);
    }
}
