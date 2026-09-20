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
public final class t50 {
    public final org.telegram.ui.Components.u01 d;
    public final org.telegram.ui.Components.u01 e;
    public final org.telegram.ui.Components.u01 f37626f;
    public s50 f37627g;
    public int f37629j;
    public final Paint f37623a = new Paint(1);
    public final Paint f37624b = new Paint(1);
    public final v50[] f37625c = new v50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.d6 f37628i = new org.telegram.ui.Components.d6(new g10(this, 7), 320, org.telegram.ui.Components.qr.h, 0);
    public final RectF f37630k = new RectF();
    public final RectF f37631l = new RectF();
    public final Path f37632m = new Path();

    public t50() {
        int i10 = 0;
        while (true) {
            v50[] v50VarArr = this.f37625c;
            if (i10 < v50VarArr.length) {
                v50VarArr[i10] = new v50(i10);
                i10++;
            } else {
                this.f37623a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19398tg, false));
                this.d = new org.telegram.ui.Components.u01(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.u01 u01Var = new org.telegram.ui.Components.u01(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                u01Var.n(99);
                u01Var.q(AndroidUtilities.dp(200.0f));
                u01Var.m(AndroidUtilities.dp(2.66f));
                this.e = u01Var;
                this.f37626f = new org.telegram.ui.Components.u01(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.u01 u01Var = this.d;
        u01Var.f28503p = f7 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.f37629j, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19398tg, false));
        Paint paint = this.f37623a;
        paint.setColor(d);
        float e = this.f37628i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l4 = u01Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j3 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp4, f10);
        float lerp2 = AndroidUtilities.lerp(dp3, j3, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f37632m;
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
        RectF rectF2 = this.f37630k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + dp9 + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp10) + f15);
        float f17 = dp6 / 2.0f;
        RectF rectF3 = this.f37631l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        v50[] v50VarArr = this.f37625c;
        boolean b10 = v50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp10) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = true;
        if (v50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.u01 u01Var2 = this.d;
        u01Var2.c(f14 - (u01Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp10 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (v50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp10 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (!v50VarArr[3].b(canvas, rectF3, f10)) {
            z11 = z10;
        }
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.f37624b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j3 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j3 - AndroidUtilities.dp(40.0f)), paint2);
            this.f37626f.c(rectF.centerX() - (this.f37626f.l() / 2.0f), j3 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
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
            v50 v50Var = this.f37625c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            u50 u50Var = v50Var.f38412k;
            boolean z12 = v50Var.f38408f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            v50Var.f38408f = z11;
            if (str != null && (v50Var.d == null || !TextUtils.equals(v50Var.f38413l, str))) {
                org.telegram.ui.Components.p5 p5Var = v50Var.d;
                if (p5Var != null) {
                    p5Var.p(u50Var);
                }
                v50Var.f38407c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f27163l = 1.0f;
                drawable.f27165n = null;
                drawable.f27166o = null;
                drawable.f27159g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.p5.x();
                v50Var.d = drawable;
                v50Var.f38413l = str;
                drawable.r(str);
                v50Var.c();
                if (v50Var.f38411j) {
                    v50Var.d.b(u50Var);
                }
            }
            if (v50Var.f38408f && !z12) {
                v50Var.e = false;
            }
        }
        s50 s50Var = this.f37627g;
        if (s50Var != null) {
            s50Var.invalidate();
        }
    }
}
