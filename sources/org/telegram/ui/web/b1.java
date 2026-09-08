package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import di.c6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import rg.v2;
import yh.e4;
import yh.g4;
import yh.x3;
import yh.x4;
import zh.s5;
public final class b1 implements Utilities.Callback {
    public final int f42038a;
    public final Object f42039b;

    public b1(Object obj, int i10) {
        this.f42038a = i10;
        this.f42039b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        v51 v51Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f42038a;
        float f11 = 0.08f;
        Object obj2 = this.f42039b;
        switch (i11) {
            case 0:
                z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).f42017b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                z0Var.d(sb2.toString());
                return;
            case 1:
                i1 i1Var = (i1) obj2;
                i1Var.f42149e = (ArrayList) obj;
                x51 x51Var = i1Var.f32876a;
                if (x51Var.G) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                a2 a2Var = (a2) obj2;
                a2Var.f42030n = ((ArrayList) obj).size();
                x51 x51Var2 = a2Var.f32876a;
                if (x51Var2 != null && (v51Var = x51Var2.Y2) != null && x51Var2.G) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 3:
                qg.d0 d0Var = (qg.d0) obj2;
                qg.f1 f1Var = (qg.f1) obj;
                qg.c1 c1Var = d0Var.f44426a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f44459f = currentWeight;
                    double d = d0Var.f44439p;
                    if (d > 0.0d) {
                        f1Var.f44459f = (float) ((d / d0Var.f44440q) * currentWeight);
                    }
                    if (f1Var.f44455a.o() == 4) {
                        f1Var.f44463k *= f1Var.f44459f;
                    }
                }
                qg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f44550f.f(new qg.m0(painting, f1Var, 1));
                    return;
                }
                return;
            case 4:
                qh.i iVar = (qh.i) obj2;
                if (((qh.b) obj) == qh.b.d && ((i10 = iVar.f44684s) == 2 || i10 == 3)) {
                    iVar.f44684s = 1;
                }
                iVar.h.run();
                return;
            case 5:
                c6 c6Var = (c6) obj2;
                TextureView textureView = (TextureView) obj;
                c6Var.f45223w0 = textureView;
                if (textureView != null) {
                    c6Var.f45217q0.addView(textureView, 0);
                    return;
                }
                return;
            case 6:
                v2 v2Var = (v2) obj2;
                v2Var.f45557n = (Bitmap) obj;
                Paint paint = new Paint(1);
                v2Var.f45559s = paint;
                Bitmap bitmap = v2Var.f45557n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v2Var.f45558r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!j6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (j6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                v2Var.f45559s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v2Var.v = new Matrix();
                return;
            case 7:
                rh.c cVar = (rh.c) obj2;
                rh.e eVar = (rh.e) obj;
                cVar.h = eVar;
                cVar.f45633c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new b(cVar, 23), 200L);
                return;
            case 8:
                ((sg.k0) obj2).E1((HashMap) obj);
                return;
            case 9:
                sg.z1 z1Var = (sg.z1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (z1Var.d != isEnabled) {
                    z1Var.d = isEnabled;
                    z1Var.invalidate();
                    return;
                }
                return;
            case 10:
                MessageObject messageObject = (MessageObject) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j3 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = ug.j.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb ybVar = new yb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ybVar.f32903b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ybVar.c(R.raw.forward, 30, 30, new String[0]);
                            ybVar.f32903b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ybVar.f32903b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ybVar.f32903b.setSingleLine(false);
                    ybVar.f32903b.setMaxLines(2);
                    oc ocVar = new oc(R.getParentActivity(), R.getResourceProvider(), true);
                    ocVar.e(LocaleController.getString(R.string.LearnMore));
                    ocVar.f29056a = new di.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    return;
                }
                return;
            case 11:
                ug.t0 t0Var = (ug.t0) obj2;
                t0Var.f47237a0.setLoading(false);
                ug.j.j(t0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 12:
                uh.f.P((uh.f) obj2, (Pair) obj);
                return;
            case 13:
                HashMap hashMap = ((vg.b) obj2).f47827w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 14:
                ((vg.e) obj2).F((TLObject) obj);
                return;
            case 15:
                HashMap hashMap2 = ((vg.g) obj2).f47854r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 16:
                vh.h hVar = (vh.h) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = hVar.K;
                if (hVar.T) {
                    hVar.I.recycle();
                    return;
                }
                hVar.I = bitmap2;
                Bitmap bitmap3 = hVar.I;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                hVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                hVar.L = paint2;
                paint2.setShader(hVar.J);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!j6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (j6.I.q()) {
                    f10 = 0.02f;
                } else {
                    f10 = -0.15f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                hVar.J.setLocalMatrix(matrix);
                return;
            case 17:
                Boolean bool2 = (Boolean) obj;
                ((yh.m1) obj2).a();
                return;
            case 18:
                ((g4) obj2).e0(((Boolean) obj).booleanValue());
                return;
            case 19:
                ((Boolean) obj).getClass();
                x3 x3Var = ((e4) obj2).d;
                if (x3Var != null) {
                    x3Var.run();
                    return;
                }
                return;
            case 20:
                ug.j.j(((x4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 21:
                zh.a0 a0Var = (zh.a0) obj2;
                int i12 = zh.a0.f51676w0[((Integer) obj).intValue()];
                if (a0Var.f51689n0 != i12) {
                    a0Var.f51689n0 = i12;
                    a0Var.f51682f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                a0Var.T(true);
                return;
            case 22:
                zh.s0 s0Var = (zh.s0) obj2;
                Integer num = (Integer) obj;
                s0Var.f52569i0.g();
                s0Var.f52571k0.N(true);
                return;
            case 23:
                zh.i2 i2Var = (zh.i2) obj2;
                i2Var.getClass();
                i2Var.f52059s = new Matrix();
                i2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                i2Var.f52058r = bitmapShader2;
                Paint paint3 = i2Var.f52054c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 24:
                s5.a((s5) obj2, (TL_stars.StarGifts) obj);
                return;
            case 25:
                ((f3) obj2).dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str2 = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str2 = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str2);
                        return;
                    }
                    int i13 = starGift.availability_remains;
                    if (i13 <= 0) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ','));
                    }
                    textView.setText(formatPluralStringComma);
                    return;
                }
                return;
        }
    }
}
