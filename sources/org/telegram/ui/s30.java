package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class s30 {
    public final int f51907a;
    public org.telegram.messenger.f6 f51909c;
    public org.telegram.ui.Components.p5 d;
    public boolean f51910e;
    public boolean f51911f;
    public long f51912g;
    public String f51916l;
    public final Drawable[] f51908b = new Drawable[6];
    public final h6.m h = new h6.m(29);
    public final HashSet f51913i = new HashSet();
    public boolean f51914j = false;
    public final r30 f51915k = new r30(this, 0);
    public final RectF f51917m = new RectF();

    public s30(int i7) {
        int i10 = 0;
        this.f51907a = i7;
        while (true) {
            Drawable[] drawableArr = this.f51908b;
            if (i10 < drawableArr.length) {
                drawableArr[i10] = org.telegram.messenger.j6.g(f40.M0());
                i10++;
            } else {
                this.f51912g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f51913i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f51914j != z10) {
            this.f51914j = z10;
            r30 r30Var = this.f51915k;
            if (!isEmpty) {
                org.telegram.ui.Components.p5 p5Var = this.d;
                if (p5Var != null) {
                    p5Var.b(r30Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = this.d;
            if (p5Var2 != null) {
                p5Var2.o(r30Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j3;
        float f11;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF2 = this.f51917m;
        rectF2.set(rectF);
        float f12 = -L;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f51907a * 45) + System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f51912g;
        float f13 = ((float) j10) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f51911f;
        Drawable[] drawableArr = this.f51908b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f51909c != null && this.f51910e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 0.0f;
                j3 = j10;
                this.f51909c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f51909c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f51909c.draw(canvas);
                this.f51909c.setAlpha(255);
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
            if (this.f51911f && this.f51910e) {
                z11 = true;
            } else {
                this.f51912g = currentTimeMillis - (j3 % 180);
                int i7 = 0;
                while (i7 < drawableArr.length - 1) {
                    int i10 = i7 + 1;
                    drawableArr[i7] = drawableArr[i10];
                    i7 = i10;
                }
                drawableArr[drawableArr.length - 1] = org.telegram.messenger.j6.g(f40.M0());
                if (this.f51911f) {
                    this.f51910e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + L);
        h6.m mVar = this.h;
        mVar.n(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - L, rectF2.right, f18);
        mVar.n(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f51916l != null) {
            int l10 = org.telegram.messenger.k10.l();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(l10).n0(tL_inputStickerSetShortName, 0, false, true, new r3(this, 8));
            if (n02 != null) {
                String replace = this.f51916l.replace("️", "");
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
                    if (TextUtils.equals(org.telegram.messenger.gj.V(document3, null, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.p5 p5Var = this.d;
                    p5Var.f38495e = document;
                    p5Var.i(false);
                    return;
                }
                org.telegram.messenger.a8.d("emoji \"" + this.f51916l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}
