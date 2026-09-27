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
public final class r50 {
    public final org.telegram.ui.Components.v01 d;
    public final org.telegram.ui.Components.v01 e;
    public final org.telegram.ui.Components.v01 f36997f;
    public q50 f36998g;
    public int f37000j;
    public final Paint f36994a = new Paint(1);
    public final Paint f36995b = new Paint(1);
    public final t50[] f36996c = new t50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.e6 f36999i = new org.telegram.ui.Components.e6(new f10(this, 7), 320, org.telegram.ui.Components.sr.h, 0);
    public final RectF f37001k = new RectF();
    public final RectF f37002l = new RectF();
    public final Path f37003m = new Path();

    public r50() {
        int i10 = 0;
        while (true) {
            t50[] t50VarArr = this.f36996c;
            if (i10 < t50VarArr.length) {
                t50VarArr[i10] = new t50(i10);
                i10++;
            } else {
                this.f36994a.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19363tg, false));
                this.d = new org.telegram.ui.Components.v01(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.v01 v01Var = new org.telegram.ui.Components.v01(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                v01Var.n(99);
                v01Var.q(AndroidUtilities.dp(200.0f));
                v01Var.m(AndroidUtilities.dp(2.66f));
                this.e = v01Var;
                this.f36997f = new org.telegram.ui.Components.v01(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.v01 v01Var = this.d;
        v01Var.f28997p = f7 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.f37000j, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19363tg, false));
        Paint paint = this.f36994a;
        paint.setColor(d);
        float e = this.f36999i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l4 = v01Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j3 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp4, f10);
        float lerp2 = AndroidUtilities.lerp(dp3, j3, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f37003m;
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
        RectF rectF2 = this.f37001k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + dp9 + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp10) + f15);
        float f17 = dp6 / 2.0f;
        RectF rectF3 = this.f37002l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        t50[] t50VarArr = this.f36996c;
        boolean b10 = t50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp10) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = true;
        if (t50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.v01 v01Var2 = this.d;
        v01Var2.c(f14 - (v01Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp10 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (t50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp10 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (!t50VarArr[3].b(canvas, rectF3, f10)) {
            z11 = z10;
        }
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.f36995b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j3 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j3 - AndroidUtilities.dp(40.0f)), paint2);
            this.f36997f.c(rectF.centerX() - (this.f36997f.l() / 2.0f), j3 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
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
            t50 t50Var = this.f36996c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            s50 s50Var = t50Var.f37657k;
            boolean z12 = t50Var.f37653f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            t50Var.f37653f = z11;
            if (str != null && (t50Var.d == null || !TextUtils.equals(t50Var.f37658l, str))) {
                org.telegram.ui.Components.q5 q5Var = t50Var.d;
                if (q5Var != null) {
                    q5Var.p(s50Var);
                }
                t50Var.f37652c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f27596l = 1.0f;
                drawable.f27598n = null;
                drawable.f27599o = null;
                drawable.f27592g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.q5.x();
                t50Var.d = drawable;
                t50Var.f37658l = str;
                drawable.r(str);
                t50Var.c();
                if (t50Var.f37656j) {
                    t50Var.d.b(s50Var);
                }
            }
            if (t50Var.f37653f && !z12) {
                t50Var.e = false;
            }
        }
        q50 q50Var = this.f36998g;
        if (q50Var != null) {
            q50Var.invalidate();
        }
    }
}
