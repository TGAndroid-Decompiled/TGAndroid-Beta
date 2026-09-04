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
    public final int f41763a;
    public Emoji.EmojiDrawable f41765c;
    public org.telegram.ui.Components.q5 d;
    public boolean f41766e;
    public boolean f41767f;
    public long f41768g;
    public String f41772l;
    public final Drawable[] f41764b = new Drawable[6];
    public final l20 h = new l20();
    public final HashSet f41769i = new HashSet();
    public boolean f41770j = false;
    public final v50 f41771k = new v50(this, 0);
    public final RectF f41773m = new RectF();

    public w50(int i10) {
        int i11 = 0;
        this.f41763a = i10;
        while (true) {
            Drawable[] drawableArr = this.f41764b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(j60.A0());
                i11++;
            } else {
                this.f41768g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f41769i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f41770j != z10) {
            this.f41770j = z10;
            v50 v50Var = this.f41771k;
            if (!isEmpty) {
                org.telegram.ui.Components.q5 q5Var = this.d;
                if (q5Var != null) {
                    q5Var.b(v50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.q5 q5Var2 = this.d;
            if (q5Var2 != null) {
                q5Var2.p(v50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j3;
        float f10;
        float f11;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f41773m;
        rectF2.set(rectF);
        float f12 = -dp;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f41763a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f41768g;
        float f13 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f41767f;
        Drawable[] drawableArr = this.f41764b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f41765c != null && this.f41766e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 255.0f;
                f11 = 0.0f;
                j3 = j10;
                this.f41765c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f41765c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f41765c.draw(canvas);
                this.f41765c.setAlpha(255);
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
            if (this.f41767f && this.f41766e) {
                z11 = true;
            } else {
                this.f41768g = currentTimeMillis - (j3 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(j60.A0());
                if (this.f41767f) {
                    this.f41766e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + dp);
        l20 l20Var = this.h;
        l20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - dp, rectF2.right, f18);
        l20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f41772l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new t3(this, 6));
            if (stickerSet != null) {
                String replace = this.f41772l.replace("️", "");
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
                    org.telegram.ui.Components.q5 q5Var = this.d;
                    q5Var.f29579e = document;
                    q5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f41772l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
