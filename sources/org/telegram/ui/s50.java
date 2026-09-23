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
public final class s50 {
    public final int f37117a;
    public Emoji.EmojiDrawable f37119c;
    public org.telegram.ui.Components.q5 d;
    public boolean e;
    public boolean f37120f;
    public long f37121g;
    public String f37125l;
    public final Drawable[] f37118b = new Drawable[6];
    public final i20 h = new i20();
    public final HashSet f37122i = new HashSet();
    public boolean f37123j = false;
    public final r50 f37124k = new r50(this, 0);
    public final RectF f37126m = new RectF();

    public s50(int i10) {
        int i11 = 0;
        this.f37117a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37118b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(f60.A0());
                i11++;
            } else {
                this.f37121g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f37122i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f37123j != z10) {
            this.f37123j = z10;
            r50 r50Var = this.f37124k;
            if (!isEmpty) {
                org.telegram.ui.Components.q5 q5Var = this.d;
                if (q5Var != null) {
                    q5Var.b(r50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.q5 q5Var2 = this.d;
            if (q5Var2 != null) {
                q5Var2.p(r50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j3;
        float f10;
        float f11;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37126m;
        rectF2.set(rectF);
        float f12 = -dp;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f37117a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f37121g;
        float f13 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f37120f;
        Drawable[] drawableArr = this.f37118b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f37119c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 255.0f;
                f11 = 0.0f;
                j3 = j10;
                this.f37119c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37119c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f37119c.draw(canvas);
                this.f37119c.setAlpha(255);
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
            if (this.f37120f && this.e) {
                z11 = true;
            } else {
                this.f37121g = currentTimeMillis - (j3 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(f60.A0());
                if (this.f37120f) {
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
        i20 i20Var = this.h;
        i20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - dp, rectF2.right, f18);
        i20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f37125l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new t3(this, 7));
            if (stickerSet != null) {
                String replace = this.f37125l.replace("️", "");
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
                    q5Var.e = document;
                    q5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f37125l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
