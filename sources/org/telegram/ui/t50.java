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
public final class t50 {
    public final int f42101a;
    public Emoji.EmojiDrawable f42103c;
    public org.telegram.ui.Components.s5 d;
    public boolean f42104e;
    public boolean f42105f;
    public long f42106g;
    public String f42110l;
    public final Drawable[] f42102b = new Drawable[6];
    public final i20 h = new i20();
    public final HashSet f42107i = new HashSet();
    public boolean f42108j = false;
    public final s50 f42109k = new s50(this, 0);
    public final RectF f42111m = new RectF();

    public t50(int i10) {
        int i11 = 0;
        this.f42101a = i10;
        while (true) {
            Drawable[] drawableArr = this.f42102b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(g60.B0());
                i11++;
            } else {
                this.f42106g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f42107i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f42108j != z10) {
            this.f42108j = z10;
            s50 s50Var = this.f42109k;
            if (!isEmpty) {
                org.telegram.ui.Components.s5 s5Var = this.d;
                if (s5Var != null) {
                    s5Var.b(s50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.s5 s5Var2 = this.d;
            if (s5Var2 != null) {
                s5Var2.p(s50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j3;
        float f10;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f42111m;
        rectF2.set(rectF);
        float f11 = -dp;
        rectF2.inset(f11, f11);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f42101a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f42106g;
        float f12 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f12);
        boolean z10 = this.f42105f;
        Drawable[] drawableArr = this.f42102b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f42103c != null && this.f42104e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 0.0f;
                j3 = j10;
                this.f42103c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f42103c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f42103c.draw(canvas);
                this.f42103c.setAlpha(255);
                canvas.restore();
            } else {
                j3 = j10;
                f10 = 0.0f;
            }
            if (f7 > f10) {
                canvas.save();
                rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f7 * 255.0f));
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
        if (f12 >= 1.0f) {
            if (this.f42105f && this.f42104e) {
                z11 = true;
            } else {
                this.f42106g = currentTimeMillis - (j3 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(g60.B0());
                if (this.f42105f) {
                    this.f42104e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f13 = (int) f11;
        rectF2.inset(f13, f13);
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        rectF2.set(f14, f15, rectF2.right, f15 + dp);
        i20 i20Var = this.h;
        i20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f13, f13);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        rectF2.set(f16, f17 - dp, rectF2.right, f17);
        i20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f42110l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new s3(this, 7));
            if (stickerSet != null) {
                String replace = this.f42110l.replace("️", "");
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
                    org.telegram.ui.Components.s5 s5Var = this.d;
                    s5Var.f30734e = document;
                    s5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f42110l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
