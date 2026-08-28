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
public final class z40 {
    public final org.telegram.ui.Components.nz0 d;
    public final org.telegram.ui.Components.nz0 f45025e;
    public final org.telegram.ui.Components.nz0 f45026f;
    public fh.l2 f45027g;
    public int f45029j;
    public final Paint f45022a = new Paint(1);
    public final Paint f45023b = new Paint(1);
    public final b50[] f45024c = new b50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.y5 f45028i = new org.telegram.ui.Components.y5(new o00(this, 7), 320, org.telegram.ui.Components.gr.h, 0);
    public final RectF f45030k = new RectF();
    public final RectF f45031l = new RectF();
    public final Path f45032m = new Path();

    public z40() {
        int i9 = 0;
        while (true) {
            b50[] b50VarArr = this.f45024c;
            if (i9 < b50VarArr.length) {
                b50VarArr[i9] = new b50(i9);
                i9++;
            } else {
                this.f45022a.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23295tg, false));
                this.d = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                nz0Var.n(99);
                nz0Var.q(AndroidUtilities.dp(200.0f));
                nz0Var.m(AndroidUtilities.dp(2.66f));
                this.f45025e = nz0Var;
                this.f45026f = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f10, float f11) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.nz0 nz0Var = this.d;
        nz0Var.f31234p = f10 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f11, this.f45029j, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23295tg, false));
        Paint paint = this.f45022a;
        paint.setColor(d);
        float e10 = this.f45028i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l10 = nz0Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j10 = this.f45025e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp4, f11);
        float lerp2 = AndroidUtilities.lerp(dp3, j10, f11);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f11);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f10 - lerp) / 2.0f, 0.0f, (f10 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f45032m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp5 = AndroidUtilities.dp(18.0f);
        int dp6 = AndroidUtilities.dp(30.0f);
        int i9 = dp5 / 2;
        int centerY = ((int) rectF.centerY()) - i9;
        int centerY2 = ((int) rectF.centerY()) + i9;
        int dp7 = AndroidUtilities.dp(7.0f);
        int dp8 = AndroidUtilities.dp(10.0f);
        float f12 = dp5 / 2.0f;
        float f13 = centerY;
        int dp9 = AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f14 = centerY2;
        RectF rectF2 = this.f45030k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + dp9 + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp10) + f16);
        float f18 = dp6 / 2.0f;
        RectF rectF3 = this.f45031l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        b50[] b50VarArr = this.f45024c;
        boolean b10 = b50VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp10) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        boolean z11 = true;
        if (b50VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        org.telegram.ui.Components.nz0 nz0Var2 = this.d;
        nz0Var2.c(f15 - (nz0Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e10) * (1.0f - f11), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp10 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (b50VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp10 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (!b50VarArr[3].b(canvas, rectF3, f11)) {
            z11 = z10;
        }
        if (f11 > 0.0f) {
            this.f45025e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f11, -1, canvas);
            Paint paint2 = this.f45023b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f45026f.c(rectF.centerX() - (this.f45026f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f11, -1, canvas);
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
        for (int i9 = 0; i9 < 4; i9++) {
            b50 b50Var = this.f45024c[i9];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i9];
            }
            a50 a50Var = b50Var.f36653k;
            boolean z12 = b50Var.f36649f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            b50Var.f36649f = z11;
            if (str != null && (b50Var.d == null || !TextUtils.equals(b50Var.f36654l, str))) {
                org.telegram.ui.Components.k5 k5Var = b50Var.d;
                if (k5Var != null) {
                    k5Var.p(a50Var);
                }
                b50Var.f36647c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f29952l = 1.0f;
                drawable.f29954n = null;
                drawable.f29955o = null;
                drawable.f29948g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.k5.x();
                b50Var.d = drawable;
                b50Var.f36654l = str;
                drawable.r(str);
                b50Var.c();
                if (b50Var.f36652j) {
                    b50Var.d.b(a50Var);
                }
            }
            if (b50Var.f36649f && !z12) {
                b50Var.f36648e = false;
            }
        }
        fh.l2 l2Var = this.f45027g;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }
}
