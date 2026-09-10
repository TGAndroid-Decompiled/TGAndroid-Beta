package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w50 {
    public final int f37715a;
    public Emoji.EmojiDrawable f37717c;
    public org.telegram.ui.Components.p5 d;
    public boolean e;
    public boolean f37718f;
    public long f37719g;
    public String f37723l;
    public final Drawable[] f37716b = new Drawable[6];
    public final m20 h = new m20();
    public final HashSet f37720i = new HashSet();
    public boolean f37721j = false;
    public final v50 f37722k = new v50(this, 0);
    public final RectF f37724m = new RectF();

    public w50(int i10) {
        int i11 = 0;
        this.f37715a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37716b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(j60.A0());
                i11++;
            } else {
                this.f37719g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f37720i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f37721j != z10) {
            this.f37721j = z10;
            v50 v50Var = this.f37722k;
            if (!isEmpty) {
                org.telegram.ui.Components.p5 p5Var = this.d;
                if (p5Var != null) {
                    p5Var.b(v50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = this.d;
            if (p5Var2 != null) {
                p5Var2.p(v50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j3;
        float f10;
        float f11;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37724m;
        rectF2.set(rectF);
        float f12 = -dp;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f37715a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f37719g;
        float f13 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f37718f;
        Drawable[] drawableArr = this.f37716b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f37717c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 255.0f;
                f11 = 0.0f;
                j3 = j10;
                this.f37717c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37717c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f37717c.draw(canvas);
                this.f37717c.setAlpha(255);
                canvas.restore();
            } else {
                j3 = j10;
                f10 = 255.0f;
                f11 = 0.0f;
            }
            if (f7 > f11) {
                canvas.save();
                rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f7 * f10));
                this.d.draw(canvas);
                this.d.setAlpha(255);
                canvas.restore();
            }
        } else {
            j3 = j10;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + dp) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + dp) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f13 >= 1.0f) {
            if (this.f37718f && this.e) {
                z11 = true;
            } else {
                this.f37719g = currentTimeMillis - (j3 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(j60.A0());
                if (this.f37718f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + dp);
        m20 m20Var = this.h;
        m20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - dp, rectF2.right, f18);
        m20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f37723l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new u3(this, 6));
            if (stickerSet != null) {
                String replace = this.f37723l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    document = null;
                    if (i10 >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document3, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.p5 p5Var = this.d;
                    p5Var.e = document;
                    p5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f37723l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
