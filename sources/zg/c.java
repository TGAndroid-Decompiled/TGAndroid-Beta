package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.i9;
import ug.t;
public final class c extends za {
    public final a f51638a0;
    public TL_stories.PrepaidGiveaway f51639b0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.f51638a0 = new a(context);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.f51639b0;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, j6.f20785k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f51639b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        i9 i9Var = this.E;
        if (z10) {
            i9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.f51638a0;
            aVar.f51631f = valueOf;
            aVar.f51630e = aVar.f51627a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            i9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                i9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                i9Var.i(-10703110, -12481584);
            } else {
                i9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(t.g() * prepaidGiveaway.quantity);
            a aVar2 = this.f51638a0;
            aVar2.f51631f = valueOf2;
            aVar2.f51630e = aVar2.f51627a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.f23633b.i(this.f51638a0);
    }
}
