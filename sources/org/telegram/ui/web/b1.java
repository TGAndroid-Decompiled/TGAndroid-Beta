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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import qg.t2;
import xh.g4;
import xh.i4;
import xh.z3;
import xh.z4;
import yh.u5;
public final class b1 implements Utilities.Callback {
    public final int f38855a;
    public final Object f38856b;

    public b1(Object obj, int i10) {
        this.f38855a = i10;
        this.f38856b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        m61 m61Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f38855a;
        float f11 = 0.08f;
        Object obj2 = this.f38856b;
        switch (i11) {
            case 0:
                z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).f38833b;
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
                i1Var.f38955f = (ArrayList) obj;
                o61 o61Var = i1Var.f27268a;
                if (o61Var.G) {
                    o61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                a2 a2Var = (a2) obj2;
                a2Var.f38847r = ((ArrayList) obj).size();
                o61 o61Var2 = a2Var.f27268a;
                if (o61Var2 != null && (m61Var = o61Var2.Y2) != null && o61Var2.G) {
                    m61Var.N(true);
                    return;
                }
                return;
            case 3:
                pg.e0 e0Var = (pg.e0) obj2;
                pg.i1 i1Var2 = (pg.i1) obj;
                pg.f1 f1Var = e0Var.f41148a;
                if (i1Var2 != null) {
                    float currentWeight = f1Var.getCurrentWeight();
                    i1Var2.f41192f = currentWeight;
                    double d = e0Var.f41160p;
                    if (d > 0.0d) {
                        i1Var2.f41192f = (float) ((d / e0Var.f41161q) * currentWeight);
                    }
                    if (i1Var2.f41189a.o() == 4) {
                        i1Var2.f41196k *= i1Var2.f41192f;
                    }
                }
                pg.s0 painting = f1Var.getPainting();
                if (painting.L == null) {
                    painting.f41273f.f(new pg.o0(painting, i1Var2, 1));
                    return;
                }
                return;
            case 4:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.f41394s) == 2 || i10 == 3)) {
                    iVar.f41394s = 1;
                }
                iVar.h.run();
                return;
            case 5:
                c6 c6Var = (c6) obj2;
                TextureView textureView = (TextureView) obj;
                c6Var.f41670w0 = textureView;
                if (textureView != null) {
                    c6Var.f41664q0.addView(textureView, 0);
                    return;
                }
                return;
            case 6:
                t2 t2Var = (t2) obj2;
                t2Var.f41977n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f41979s = paint;
                Bitmap bitmap = t2Var.f41977n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f41978r = bitmapShader;
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
                t2Var.f41979s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                return;
            case 7:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.f42074c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new r0(cVar, 19), 200L);
                return;
            case 8:
                ((rg.j0) obj2).E1((HashMap) obj);
                return;
            case 9:
                rg.w1 w1Var = (rg.w1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
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
                    String b10 = tg.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xb xbVar = new xb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        xbVar.f30299b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            xbVar.c(R.raw.forward, 30, 30, new String[0]);
                            xbVar.f30299b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            xbVar.f30299b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    xbVar.f30299b.setSingleLine(false);
                    xbVar.f30299b.setMaxLines(2);
                    nc ncVar = new nc(R.getParentActivity(), R.getResourceProvider(), true);
                    ncVar.e(LocaleController.getString(R.string.LearnMore));
                    ncVar.f26720a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    xbVar.setButton(ncVar);
                    pc.g(R, xbVar, 2750).j();
                    return;
                }
                return;
            case 11:
                tg.s0 s0Var = (tg.s0) obj2;
                s0Var.f43521a0.setLoading(false);
                tg.i.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 12:
                th.f.P((th.f) obj2, (Pair) obj);
                return;
            case 13:
                HashMap hashMap = ((ug.b) obj2).f44037w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 14:
                ((ug.e) obj2).F((TLObject) obj);
                return;
            case 15:
                HashMap hashMap2 = ((ug.g) obj2).f44061r;
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
                ((xh.o1) obj2).a();
                return;
            case 18:
                ((i4) obj2).e0(((Boolean) obj).booleanValue());
                return;
            case 19:
                ((Boolean) obj).getClass();
                z3 z3Var = ((g4) obj2).d;
                if (z3Var != null) {
                    z3Var.run();
                    return;
                }
                return;
            case 20:
                tg.i.j(((z4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 21:
                yh.a0 a0Var = (yh.a0) obj2;
                int i12 = yh.a0.f47219w0[((Integer) obj).intValue()];
                if (a0Var.f47232n0 != i12) {
                    a0Var.f47232n0 = i12;
                    a0Var.f47225f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                a0Var.T(true);
                return;
            case 22:
                yh.s0 s0Var2 = (yh.s0) obj2;
                Integer num = (Integer) obj;
                s0Var2.f48036i0.g();
                s0Var2.f48038k0.N(true);
                return;
            case 23:
                yh.j2 j2Var = (yh.j2) obj2;
                j2Var.getClass();
                j2Var.f47617s = new Matrix();
                j2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                j2Var.f47616r = bitmapShader2;
                Paint paint3 = j2Var.f47613c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 24:
                u5.a((u5) obj2, (TL_stars.StarGifts) obj);
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
