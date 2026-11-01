package rh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sl0;
public final class i2 extends ClickableSpan {
    public final boolean[] f47093a;
    public final int f47094b;
    public final Context f47095c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final long e;
    public final String f47096f;
    public final String h;

    public i2(boolean[] zArr, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, String str2) {
        this.f47093a = zArr;
        this.f47094b = i10;
        this.f47095c = context;
        this.d = p6Var;
        this.e = j10;
        this.f47096f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f47093a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = this.f47094b;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(zArr, i10, this.f47095c, this.d, 7);
        long j10 = this.e;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        String str = this.f47096f;
        if (i11 != 0) {
            f0Var.a(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new sl0(28, f0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
