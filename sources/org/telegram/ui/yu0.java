package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
public final class yu0 implements Utilities.Callback {
    public final int f44971a;
    public final Object f44972b;
    public final Object f44973c;

    public yu0(int i10, Object obj, Object obj2) {
        this.f44971a = i10;
        this.f44972b = obj;
        this.f44973c = obj2;
    }

    @Override
    public final void run(Object obj) {
        float f9;
        float f10;
        f2.n1 K;
        String str;
        th.r a2;
        int i10 = this.f44971a;
        int i11 = 0;
        Object obj2 = this.f44973c;
        Object obj3 = this.f44972b;
        switch (i10) {
            case 0:
                iv0 iv0Var = (iv0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                iv0Var.getClass();
                Bundle bundle = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle.putLong("user_id", l10.longValue());
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags = 1 | updatebirthday.flags;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new jr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 2:
                k01 k01Var = (k01) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k9 = d61.k(str2, tL_messages_stickerSet);
                if (k9 == null) {
                    StringBuilder s10 = a4.w.s("couldn't find ", str2, " sticker in EmojiAnimations");
                    String[] strArr = n01.f40667s;
                    FileLog.e(s10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                k01Var.f39720c = imageReceiver;
                k01Var.f39721e.add(imageReceiver);
                int f11 = ry.f();
                k01Var.f39720c.setAutoRepeat(0);
                m01 m01Var = k01Var.f39720c;
                String str3 = f11 + "_" + f11 + "_precache";
                ky0 ky0Var = new ky0(k01Var, 5);
                m01Var.getClass();
                m01Var.setDelegate(new l01(new Runnable[]{ky0Var}));
                m01Var.setImage(ImageLocation.getForDocument(k9), str3, null, null, tL_messages_stickerSet, 0);
                k01Var.f39720c.onAttachedToWindow();
                k01Var.f39723g[1] = true;
                k01Var.a();
                return;
            case 3:
                Runnable runnable = (Runnable) obj;
                ((eg.h) obj3).run((HashSet) obj2);
                return;
            case 4:
                f41 f41Var = (f41) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    f41Var.getClass();
                    view.setVisibility(0);
                }
                f41Var.f37992f = bitmap;
                Paint paint = new Paint(1);
                f41Var.f37993n = paint;
                Bitmap bitmap2 = f41Var.f37992f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                f41Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = 0.05f;
                } else {
                    f9 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f9);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                f41Var.f37993n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                f41Var.f37994r = new Matrix();
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.J0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.jl0 jl0Var = themeActivity.f36292b;
                    if (jl0Var != null && jl0Var.C && (K = jl0Var.K(themeActivity.I)) != null) {
                        themeActivity.f36290a.v(K, themeActivity.I);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                t31 t31Var = (t31) obj2;
                if (((Boolean) obj).booleanValue()) {
                    t31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.tc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 7:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj3;
                String str4 = (String) obj2;
                Boolean bool = (Boolean) obj;
                z0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool.booleanValue()) {
                        if (TextUtils.isEmpty(str4)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    z0Var.v("biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 8:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj3;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                w1Var.getClass();
                ((org.telegram.ui.web.d1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = w1Var.f44236e;
                if (callback != null) {
                    w1Var.finishFragment();
                    callback.run(a1Var);
                    return;
                }
                ye.d.s(w1Var.getParentActivity(), a1Var.f43977c);
                return;
            case 9:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj3;
                f2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0(f2Var, (org.telegram.ui.web.e2) obj2, (Bitmap) obj, 15));
                return;
            case 10:
                ph.q0 q0Var = (ph.q0) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                int[] iArr = (int[]) obj;
                q0Var.getClass();
                boolean z10 = false;
                while (i11 < iArr.length) {
                    if (iArr[i11] == 0) {
                        z10 = true;
                    }
                    i11++;
                }
                q0Var.d = true;
                q0Var.f46000e = true;
                q0Var.l();
                Iterator it = q0Var.f46001f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z10));
                return;
            case 11:
                ph.q0 q0Var2 = (ph.q0) obj3;
                Runnable runnable2 = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                q0Var2.getClass();
                boolean z11 = false;
                while (i11 < iArr2.length) {
                    if (iArr2[i11] == 0) {
                        z11 = true;
                    }
                    i11++;
                }
                q0Var2.d = z11;
                q0Var2.f46000e = z11;
                q0Var2.l();
                Iterator it2 = q0Var2.f46001f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 12:
                ((File[]) obj3)[0] = (File) obj;
                ((org.telegram.ui.Components.m70) obj2).run();
                return;
            case 13:
                ((ph.k2) obj3).d.f45987x.C((String) obj2, (String) obj, false);
                return;
            case 14:
                qh.g gVar = (qh.g) obj3;
                gVar.getClass();
                gVar.W(((TLRPC.Chat) obj2).f22392id, ((Boolean) obj).booleanValue());
                return;
            case 15:
                qh.g gVar2 = (qh.g) obj3;
                gVar2.getClass();
                gVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 16:
                qh.i0 i0Var = (qh.i0) obj3;
                i0Var.V((TLRPC.Chat) obj2, i0Var.f46715e, ((Boolean) obj).booleanValue());
                return;
            case 17:
                View view2 = (View) obj3;
                sf.o oVar = (sf.o) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (view2 != null) {
                    view2.requestFocus();
                }
                AndroidUtilities.hideKeyboard(oVar);
                AndroidUtilities.runOnUIThread(runnable3, 80L);
                return;
            case 18:
                sf.r1 r1Var = (sf.r1) obj2;
                Long l11 = (Long) obj;
                sf.s1 f12 = sf.s1.f(UserConfig.selectedAccount);
                org.telegram.ui.Components.ni niVar = ((sf.d0) obj3).f28403b;
                long n12 = niVar.n1();
                int i12 = f12.f47948a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i12).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = r1Var.f47935a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new lx0(f12, messagesStorage, r1Var, tL_messages_sendQuickReplyMessages, 24));
                }
                niVar.dismiss();
                return;
            case 19:
                sf.x0.W((sf.x0) obj3, (View) obj2, (String) obj);
                return;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                th.p3 p3Var = ((th.p) obj3).f48623r;
                if (pageblockmath != null) {
                    pageblockmath.source = str5;
                    p3Var.U2.N(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str5;
                p3Var.R1(pageblockmath2);
                return;
            case 21:
                th.d1 d1Var = (th.d1) obj3;
                th.r rVar = (th.r) obj2;
                String str6 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str6)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = th.r.a(str6, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z12 = d1Var.v;
                        if (z12) {
                            d1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, d1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, d1Var.length())), spannableString);
                        d1Var.setSelection(Math.min(max + 1, d1Var.length()));
                        if (z12) {
                            d1Var.setLocked(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                th.x1 x1Var = (th.x1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                x1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str7;
                    x1Var.L.U2.N(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str7;
                x1Var.L.R1(pageblockmath4);
                return;
            default:
                th.p3 p3Var2 = (th.p3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.equals(str8, pageblockmath5.source)) {
                    th.b2 b2Var = p3Var2.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockmath5.source = str8;
                    p3Var2.U2.N(false);
                    th.b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    p3Var2.f48638d3.onContentChanged();
                    return;
                }
                return;
        }
    }
}
