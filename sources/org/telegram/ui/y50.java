package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class y50 {
    public final org.telegram.ui.Components.h11 d;
    public final org.telegram.ui.Components.h11 e;
    public final org.telegram.ui.Components.h11 f42035f;
    public x50 f42036g;
    public int f42038j;
    public final Paint f42032a = new Paint(1);
    public final Paint f42033b = new Paint(1);
    public final a60[] f42034c = new a60[4];
    public boolean h = true;
    public final org.telegram.ui.Components.g6 f42037i = new org.telegram.ui.Components.g6(new zz(this, 8), 320, org.telegram.ui.Components.es.h, 0);
    public final RectF f42039k = new RectF();
    public final RectF f42040l = new RectF();
    public final Path f42041m = new Path();

    public y50() {
        int i10 = 0;
        while (true) {
            a60[] a60VarArr = this.f42034c;
            if (i10 < a60VarArr.length) {
                a60VarArr[i10] = new a60(i10);
                i10++;
            } else {
                this.f42032a.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20207tg, false));
                this.d = new org.telegram.ui.Components.h11(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.h11 h11Var = new org.telegram.ui.Components.h11(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                h11Var.n(99);
                h11Var.q(AndroidUtilities.dp(200.0f));
                h11Var.m(AndroidUtilities.dp(2.66f));
                this.e = h11Var;
                this.f42035f = new org.telegram.ui.Components.h11(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.h11 h11Var = this.d;
        h11Var.f25483p = f7 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.f42038j, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20207tg, false));
        Paint paint = this.f42032a;
        paint.setColor(d);
        float e = this.f42037i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l4 = h11Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp4, f10);
        float lerp2 = AndroidUtilities.lerp(dp3, j10, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f42041m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp5 = AndroidUtilities.dp(18.0f);
        int dp6 = AndroidUtilities.dp(30.0f);
        int i10 = dp5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        int dp7 = AndroidUtilities.dp(7.0f);
        int dp8 = AndroidUtilities.dp(10.0f);
        float f11 = dp5 / 2.0f;
        float f12 = centerY;
        int dp9 = AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f13 = centerY2;
        RectF rectF2 = this.f42039k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + dp9 + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp10) + f15);
        float f17 = dp6 / 2.0f;
        RectF rectF3 = this.f42040l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        a60[] a60VarArr = this.f42034c;
        boolean b10 = a60VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp10) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = true;
        if (a60VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.h11 h11Var2 = this.d;
        h11Var2.c(f14 - (h11Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp10 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (a60VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp10 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (!a60VarArr[3].b(canvas, rectF3, f10)) {
            z11 = z10;
        }
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.f42033b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f42035f.c(rectF.centerX() - (this.f42035f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        boolean z10;
        String str;
        boolean z11;
        if (strArr == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        for (int i10 = 0; i10 < 4; i10++) {
            a60 a60Var = this.f42034c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            z50 z50Var = a60Var.f34053k;
            boolean z12 = a60Var.f34049f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            a60Var.f34049f = z11;
            if (str != null && (a60Var.d == null || !TextUtils.equals(a60Var.f34054l, str))) {
                org.telegram.ui.Components.s5 s5Var = a60Var.d;
                if (s5Var != null) {
                    s5Var.p(z50Var);
                }
                a60Var.f34048c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f29032l = 1.0f;
                drawable.f29034n = null;
                drawable.f29035o = null;
                drawable.f29028g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.s5.x();
                a60Var.d = drawable;
                a60Var.f34054l = str;
                drawable.r(str);
                a60Var.c();
                if (a60Var.f34052j) {
                    a60Var.d.b(z50Var);
                }
            }
            if (a60Var.f34049f && !z12) {
                a60Var.e = false;
            }
        }
        x50 x50Var = this.f42036g;
        if (x50Var != null) {
            x50Var.invalidate();
        }
    }
}
