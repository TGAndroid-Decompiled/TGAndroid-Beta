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
import ci.c6;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import qg.v2;
import xh.f4;
import xh.h4;
import xh.y3;
import xh.y4;
import yh.v5;
public final class b1 implements Utilities.Callback {
    public final int f38880a;
    public final Object f38881b;

    public b1(Object obj, int i10) {
        this.f38880a = i10;
        this.f38881b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        w51 w51Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f38880a;
        float f11 = 0.08f;
        Object obj2 = this.f38881b;
        switch (i11) {
            case 0:
                z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).f38857b;
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
                h1 h1Var = (h1) obj2;
                h1Var.f38967f = (ArrayList) obj;
                y51 y51Var = h1Var.f30485a;
                if (y51Var.G) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                z1 z1Var = (z1) obj2;
                z1Var.f39178r = ((ArrayList) obj).size();
                y51 y51Var2 = z1Var.f30485a;
                if (y51Var2 != null && (w51Var = y51Var2.Y2) != null && y51Var2.G) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 3:
                pg.d0 d0Var = (pg.d0) obj2;
                pg.f1 f1Var = (pg.f1) obj;
                pg.c1 c1Var = d0Var.f40834a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f40865f = currentWeight;
                    double d = d0Var.f40846p;
                    if (d > 0.0d) {
                        f1Var.f40865f = (float) ((d / d0Var.f40847q) * currentWeight);
                    }
                    if (f1Var.f40862a.o() == 4) {
                        f1Var.f40869k *= f1Var.f40865f;
                    }
                }
                pg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f40951f.f(new pg.m0(painting, f1Var, 1));
                    return;
                }
                return;
            case 4:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.f41071s) == 2 || i10 == 3)) {
                    iVar.f41071s = 1;
                }
                iVar.h.run();
                return;
            case 5:
                c6 c6Var = (c6) obj2;
                TextureView textureView = (TextureView) obj;
                c6Var.f41376w0 = textureView;
                if (textureView != null) {
                    c6Var.f41370q0.addView(textureView, 0);
                    return;
                }
                return;
            case 6:
                v2 v2Var = (v2) obj2;
                v2Var.f41688n = (Bitmap) obj;
                Paint paint = new Paint(1);
                v2Var.f41690s = paint;
                Bitmap bitmap = v2Var.f41688n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v2Var.f41689r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!i6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (i6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                v2Var.f41690s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v2Var.v = new Matrix();
                return;
            case 7:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.f41754c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new u0(cVar, 18), 200L);
                return;
            case 8:
                ((rg.j0) obj2).E1((HashMap) obj);
                return;
            case 9:
                rg.v1 v1Var = (rg.v1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (v1Var.d != isEnabled) {
                    v1Var.d = isEnabled;
                    v1Var.invalidate();
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
                    String b10 = tg.k.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wb wbVar = new wb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        wbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        wbVar.f29682b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            wbVar.c(R.raw.forward, 30, 30, new String[0]);
                            wbVar.f29682b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            wbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            wbVar.f29682b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    wbVar.f29682b.setSingleLine(false);
                    wbVar.f29682b.setMaxLines(2);
                    mc mcVar = new mc(R.getParentActivity(), R.getResourceProvider(), true);
                    mcVar.e(LocaleController.getString(R.string.LearnMore));
                    mcVar.f26137a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    wbVar.setButton(mcVar);
                    oc.g(R, wbVar, 2750).j();
                    return;
                }
                return;
            case 11:
                tg.t0 t0Var = (tg.t0) obj2;
                t0Var.f43222a0.setLoading(false);
                tg.k.j(t0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 12:
                th.f.P((th.f) obj2, (Pair) obj);
                return;
            case 13:
                HashMap hashMap = ((ug.b) obj2).f43714w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 14:
                ((ug.e) obj2).F((TLObject) obj);
                return;
            case 15:
                HashMap hashMap2 = ((ug.g) obj2).f43738r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 16:
                uh.h hVar = (uh.h) obj2;
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
                if (!i6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (i6.I.q()) {
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
                ((xh.n1) obj2).a();
                return;
            case 18:
                ((h4) obj2).e0(((Boolean) obj).booleanValue());
                return;
            case 19:
                ((Boolean) obj).getClass();
                y3 y3Var = ((f4) obj2).d;
                if (y3Var != null) {
                    y3Var.run();
                    return;
                }
                return;
            case 20:
                tg.k.j(((y4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 21:
                yh.a0 a0Var = (yh.a0) obj2;
                int i12 = yh.a0.f46896w0[((Integer) obj).intValue()];
                if (a0Var.f46909n0 != i12) {
                    a0Var.f46909n0 = i12;
                    a0Var.f46902f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                a0Var.T(true);
                return;
            case 22:
                yh.s0 s0Var = (yh.s0) obj2;
                Integer num = (Integer) obj;
                s0Var.f47745i0.g();
                s0Var.f47747k0.N(true);
                return;
            case 23:
                yh.l2 l2Var = (yh.l2) obj2;
                l2Var.getClass();
                l2Var.f47405s = new Matrix();
                l2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                l2Var.f47404r = bitmapShader2;
                Paint paint3 = l2Var.f47401c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 24:
                v5.a((v5) obj2, (TL_stars.StarGifts) obj);
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
