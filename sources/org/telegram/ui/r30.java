package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class r30 {
    public final int f51599a;
    public org.telegram.messenger.f6 f51601c;
    public org.telegram.ui.Components.o5 d;
    public boolean f51602e;
    public boolean f51603f;
    public long f51604g;
    public String f51608l;
    public final Drawable[] f51600b = new Drawable[6];
    public final org.telegram.ui.Components.i61 h = new org.telegram.ui.Components.i61(1);
    public final HashSet f51605i = new HashSet();
    public boolean f51606j = false;
    public final q30 f51607k = new q30(this, 0);
    public final RectF f51609m = new RectF();

    public r30(int i7) {
        int i10 = 0;
        this.f51599a = i7;
        while (true) {
            Drawable[] drawableArr = this.f51600b;
            if (i10 < drawableArr.length) {
                drawableArr[i10] = org.telegram.messenger.j6.g(e40.M0());
                i10++;
            } else {
                this.f51604g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f51605i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f51606j != z10) {
            this.f51606j = z10;
            q30 q30Var = this.f51607k;
            if (!isEmpty) {
                org.telegram.ui.Components.o5 o5Var = this.d;
                if (o5Var != null) {
                    o5Var.b(q30Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.o5 o5Var2 = this.d;
            if (o5Var2 != null) {
                o5Var2.o(q30Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j3;
        float f11;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF2 = this.f51609m;
        rectF2.set(rectF);
        float f12 = -L;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f51599a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f51604g;
        float f13 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f51603f;
        Drawable[] drawableArr = this.f51600b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f51601c != null && this.f51602e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 0.0f;
                j3 = j10;
                this.f51601c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f51601c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f51601c.draw(canvas);
                this.f51601c.setAlpha(255);
                canvas.restore();
            } else {
                j3 = j10;
                f11 = 0.0f;
            }
            if (f10 > f11) {
                canvas.save();
                rectF2.inset(org.telegram.messenger.g0.L(-4.0f), org.telegram.messenger.g0.L(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f10 * 255.0f));
                this.d.draw(canvas);
                this.d.setAlpha(255);
                canvas.restore();
            }
        } else {
            j3 = j10;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + L) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + L) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f13 >= 1.0f) {
            if (this.f51603f && this.f51602e) {
                z11 = true;
            } else {
                this.f51604g = currentTimeMillis - (j3 % 180);
                int i7 = 0;
                while (i7 < drawableArr.length - 1) {
                    int i10 = i7 + 1;
                    drawableArr[i7] = drawableArr[i10];
                    i7 = i10;
                }
                drawableArr[drawableArr.length - 1] = org.telegram.messenger.j6.g(e40.M0());
                if (this.f51603f) {
                    this.f51602e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + L);
        org.telegram.ui.Components.i61 i61Var = this.h;
        i61Var.u(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - L, rectF2.right, f18);
        i61Var.u(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f51608l != null) {
            int l10 = org.telegram.messenger.i10.l();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(l10).n0(tL_inputStickerSetShortName, 0, false, true, new r3(this, 8));
            if (n02 != null) {
                String replace = this.f51608l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = n02.documents;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    document = null;
                    if (i7 >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(org.telegram.messenger.fj.V(document3, null, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.o5 o5Var = this.d;
                    o5Var.f38023e = document;
                    o5Var.i(false);
                    return;
                }
                org.telegram.messenger.a8.d("emoji \"" + this.f51608l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
