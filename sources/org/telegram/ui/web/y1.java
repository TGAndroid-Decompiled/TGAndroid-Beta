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
import bi.b7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import pg.t2;
import wh.f4;
import wh.h4;
import wh.y3;
import wh.y4;
import xh.v5;
import zh.a3;
import zh.a5;
import zh.i5;
import zh.u7;
public final class y1 implements Utilities.Callback {
    public final int f38162a;
    public final Object f38163b;

    public y1(Object obj, int i10) {
        this.f38162a = i10;
        this.f38163b = obj;
    }

    @Override
    public final void run(Object obj) {
        j61 j61Var;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str;
        float f11 = 0.08f;
        switch (this.f38162a) {
            case 0:
                b2 b2Var = (b2) this.f38163b;
                b2Var.f37870n = ((ArrayList) obj).size();
                l61 l61Var = b2Var.f25171a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 1:
                b7 b7Var = (b7) this.f38163b;
                TextureView textureView = (TextureView) obj;
                b7Var.f39988w0 = textureView;
                if (textureView != null) {
                    b7Var.f39982q0.addView(textureView, 0);
                    return;
                }
                return;
            case 2:
                t2 t2Var = (t2) this.f38163b;
                t2Var.f40306n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f40308s = paint;
                Bitmap bitmap = t2Var.f40306n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f40307r = bitmapShader;
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
                t2Var.f40308s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                return;
            case 3:
                ph.c cVar = (ph.c) this.f38163b;
                ph.e eVar = (ph.e) obj;
                cVar.h = eVar;
                cVar.f40397c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(cVar, 25), 200L);
                return;
            case 4:
                ((qg.k0) this.f38163b).E1((HashMap) obj);
                return;
            case 5:
                qg.x1 x1Var = (qg.x1) this.f38163b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (x1Var.d != isEnabled) {
                    x1Var.d = isEnabled;
                    x1Var.invalidate();
                    return;
                }
                return;
            case 6:
                MessageObject messageObject = (MessageObject) this.f38163b;
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
                long j3 = 1000 * messageObject.messageOwner.date;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = sg.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xb xbVar = new xb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        xbVar.f29000b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            xbVar.c(R.raw.forward, 30, 30, new String[0]);
                            xbVar.f29000b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            xbVar.f29000b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    xbVar.f29000b.setSingleLine(false);
                    xbVar.f29000b.setMaxLines(2);
                    nc ncVar = new nc(R.getParentActivity(), R.getResourceProvider(), true);
                    ncVar.e(LocaleController.getString(R.string.LearnMore));
                    ncVar.f25483a = new bi.e2(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    xbVar.setButton(ncVar);
                    pc.g(R, xbVar, 2750).j();
                    return;
                }
                return;
            case 7:
                sg.u0 u0Var = (sg.u0) this.f38163b;
                u0Var.f42010a0.setLoading(false);
                sg.i.j(u0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 8:
                sh.f.P((sh.f) this.f38163b, (Pair) obj);
                return;
            case 9:
                HashMap hashMap = ((tg.b) this.f38163b).f42149w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 10:
                ((tg.e) this.f38163b).F((TLObject) obj);
                return;
            case 11:
                HashMap hashMap2 = ((tg.g) this.f38163b).f42173r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 12:
                th.i iVar = (th.i) this.f38163b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = iVar.K;
                if (iVar.T) {
                    iVar.I.recycle();
                    return;
                }
                iVar.I = bitmap2;
                Bitmap bitmap3 = iVar.I;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                iVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                iVar.L = paint2;
                paint2.setShader(iVar.J);
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
                iVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                iVar.J.setLocalMatrix(matrix);
                return;
            case 13:
                Boolean bool2 = (Boolean) obj;
                ((wh.m1) this.f38163b).a();
                return;
            case 14:
                ((h4) this.f38163b).e0(((Boolean) obj).booleanValue());
                return;
            case 15:
                ((Boolean) obj).getClass();
                y3 y3Var = ((f4) this.f38163b).d;
                if (y3Var != null) {
                    y3Var.run();
                    return;
                }
                return;
            case 16:
                sg.i.j(((y4) this.f38163b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 17:
                xh.a0 a0Var = (xh.a0) this.f38163b;
                int i10 = xh.a0.f45211w0[((Integer) obj).intValue()];
                if (a0Var.f45224n0 != i10) {
                    a0Var.f45224n0 = i10;
                    a0Var.f45217f0.setText(LocaleController.formatPluralString("GiftOfferHours", i10 / 3600, new Object[0]));
                }
                a0Var.T(true);
                return;
            case 18:
                xh.s0 s0Var = (xh.s0) this.f38163b;
                Integer num = (Integer) obj;
                s0Var.f46008i0.g();
                s0Var.f46010k0.N(true);
                return;
            case 19:
                xh.j2 j2Var = (xh.j2) this.f38163b;
                j2Var.getClass();
                j2Var.f45574s = new Matrix();
                j2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                j2Var.f45573r = bitmapShader2;
                Paint paint3 = j2Var.f45570c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 20:
                v5.a((v5) this.f38163b, (TL_stars.StarGifts) obj);
                return;
            case 21:
                ((h3) this.f38163b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 22:
                TextView textView = (TextView) this.f38163b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i11 = starGift.availability_remains;
                    if (i11 <= 0) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i11, LocaleController.formatNumber(starGift.availability_total, ','));
                    }
                    textView.setText(formatPluralStringComma);
                    return;
                }
                return;
            case 23:
                zh.t0 t0Var = (zh.t0) this.f38163b;
                if (((Boolean) obj).booleanValue() && !t0Var.f48885w) {
                    t0Var.f48882n = true;
                    t0Var.I = true;
                    t0Var.u(false);
                    zh.t0.W = t0Var;
                    t0Var.J = NativeInstance.createVideoCapturer(t0Var.H, t0Var.I ? 1 : 0);
                    if (t0Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = t0Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance, 3));
                        t0Var.M.clear();
                        t0Var.E = null;
                    }
                    t0Var.c();
                    t0Var.k();
                    NotificationCenter.getInstance(t0Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0Var.f48881f.f17212id));
                    return;
                }
                return;
            case 24:
                a3 a3Var = (a3) this.f38163b;
                a3Var.L3 = ((Long) obj).longValue();
                zh.t1 t1Var = a3Var.f48157b2;
                if (t1Var != null) {
                    t1Var.K(true);
                    a3Var.f48157b2.R1();
                }
                a3Var.r0(true);
                return;
            case 25:
                u7 u7Var = (u7) this.f38163b;
                Boolean bool3 = (Boolean) obj;
                u7Var.f48943k1 = false;
                u7Var.P();
                return;
            default:
                i5 i5Var = (i5) this.f38163b;
                a5 a5Var = (a5) obj;
                HashMap hashMap3 = i5Var.H;
                int i12 = a5Var.e;
                int i13 = a5Var.f48238f;
                long j10 = a5Var.d;
                if (i12 == 0 && i13 > 0) {
                    HashMap hashMap4 = (HashMap) hashMap3.get(Long.valueOf(j10));
                    if (hashMap4 != null) {
                        hashMap4.remove(Integer.valueOf(i13));
                        if (hashMap4.isEmpty()) {
                            hashMap3.remove(Long.valueOf(j10));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap5 = i5Var.G[i12];
                if (hashMap5 != null) {
                    hashMap5.remove(Long.valueOf(j10));
                    return;
                }
                return;
        }
    }
}
