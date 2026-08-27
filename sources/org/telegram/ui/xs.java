package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class xs implements Runnable {

    public final int f44603a;

    public final int f44604b;

    public final Object f44605c;
    public final Object d;

    public final Object f44606e;

    public xs(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f44603a = 9;
        this.f44604b = i10;
        this.d = tL_error;
        this.f44606e = n2Var;
        this.f44605c = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i10 = 2;
        ?? r10 = 0;
        e8.c cVarA = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.f44603a) {
            case 0:
                ?? r11 = (kt) this.d;
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) this.f44606e;
                int i11 = this.f44604b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f44605c;
                if (r11.f39866j == null) {
                    return;
                }
                zk0Var.setOnItemClickListener((org.telegram.ui.Components.pk0) null);
                zk0Var.requestDisallowInterceptTouchEvent(true);
                r11.f39866j = null;
                r11.w(AndroidUtilities.findActivity(zk0Var.getContext()));
                r11.f39865i = false;
                View view = r11.h;
                if (view instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                    TLRPC.Document sticker = a8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(r11.f39874r));
                    ht htVar = r11.f39868l;
                    r11.t(sticker, stickerPath, strFindAnimatedEmojiEmoticon, htVar != null ? htVar.F(false) : null, null, i11, a8Var.f24079y, a8Var.getParentObject(), r11.f39859c0, 0);
                    a8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    TLRPC.Document sticker2 = y7Var.getSticker();
                    ht htVar2 = r11.f39868l;
                    r11.t(sticker2, null, null, htVar2 != null ? htVar2.F(false) : null, null, i11, false, y7Var.getParentObject(), c6Var, 0);
                    y7Var.setScaled(true);
                    r11.f39865i = y7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    TLRPC.Document document2 = d2Var.getDocument();
                    ht htVar3 = r11.f39868l;
                    r11.t(document2, null, null, htVar3 != null ? htVar3.F(true) : 0, d2Var.getBotInlineResult(), i11, false, d2Var.getBotInlineResult() != null ? d2Var.getInlineBot() : d2Var.getParentObject(), c6Var, 0);
                    if (i11 != 1 || r11.f39869m) {
                        d2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.tu) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.tu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r11.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r11.f39874r)), null, null, i11, false, null, c6Var, 0);
                    }
                } else if (view instanceof org.telegram.ui.Components.gy) {
                    org.telegram.ui.Components.t5 span = ((org.telegram.ui.Components.gy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document documentF = span.document;
                        if (documentF == null) {
                            documentF = org.telegram.ui.Components.k5.f(r11.f39874r, span.getDocumentId());
                        }
                        document = documentF;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r11.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r11.f39874r)), null, null, i11, false, null, c6Var, 0);
                    }
                } else {
                    if (!(view instanceof org.telegram.ui.Components.vx0)) {
                        return;
                    }
                    Drawable drawable = ((org.telegram.ui.Components.vx0) view).f34064b;
                    TLRPC.Document document4 = drawable instanceof org.telegram.ui.Components.k5 ? ((org.telegram.ui.Components.k5) drawable).f29956e : null;
                    if (document4 == null) {
                        return;
                    } else {
                        r11.t(document4, null, MessageObject.findAnimatedEmojiEmoticon(document4, null, Integer.valueOf(r11.f39874r)), null, null, i11, false, null, c6Var, 0);
                    }
                }
                try {
                    r11.h.performHapticFeedback(0, 2);
                    break;
                } catch (Exception unused) {
                }
                ht htVar4 = r11.f39868l;
                if (htVar4 != null) {
                    htVar4.s();
                    return;
                }
                return;
            case 1:
                String str = (String) this.d;
                int i12 = this.f44604b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f44606e;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.f44605c;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    org.telegram.messenger.rl.m(R.string.PhoneCopied, new org.telegram.ui.Components.mc(e3Var.getContainer(), c6Var2));
                    return;
                } else {
                    new org.telegram.ui.Components.mc(e3Var.getContainer(), c6Var2).k(false).j();
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i13 = this.f44604b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44606e;
                gy gyVar = (gy) this.f44605c;
                Pattern pattern = LaunchActivity.f35496x1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.f22380id);
                if (MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, gyVar)) {
                    launchActivity.q0(new rn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                ob0 ob0Var = (ob0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f44606e;
                int i14 = this.f44604b;
                String str2 = (String) this.f44605c;
                ob0Var.a();
                if (i14 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i14 != 0) {
                        if (i14 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i14 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.f35562n;
                        } else {
                            arrayList = notificationsSettingsActivity.f35561f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.C = true;
                        notificationsCustomSettingsActivity.l0(false);
                        ob0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            ob0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            ob0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            ob0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            ob0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            ob0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            ob0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            ob0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            ob0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            ob0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            ob0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            ob0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            ob0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            ob0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            ob0Var.o("priorityRow");
                            return;
                        }
                        return;
                    }
                    arrayList = notificationsSettingsActivity.f35560e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.C = true;
                notificationsCustomSettingsActivity2.l0(false);
                ob0Var.n(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str2)) {
                    ob0Var.o("showRow");
                }
                if ("new".equalsIgnoreCase(str2)) {
                    ob0Var.o("newRow");
                }
                if ("important".equalsIgnoreCase(str2)) {
                    ob0Var.o("importantRow");
                }
                if ("messages".equalsIgnoreCase(str2)) {
                    ob0Var.o("messagesRow");
                }
                if ("stories".equalsIgnoreCase(str2)) {
                    ob0Var.o("storiesRow");
                }
                if ("preview".equalsIgnoreCase(str2)) {
                    ob0Var.o("previewRow");
                }
                if ("show-sender".equalsIgnoreCase(str2)) {
                    ob0Var.o("showSenderRow");
                }
                if ("sound".equalsIgnoreCase(str2)) {
                    ob0Var.o("soundRow");
                }
                if ("add-exception".equalsIgnoreCase(str2)) {
                    ob0Var.o("addExceptionRow");
                }
                if ("delete-exceptions".equalsIgnoreCase(str2)) {
                    ob0Var.o("deleteExceptionsRow");
                }
                if ("light-color".equalsIgnoreCase(str2)) {
                    ob0Var.o("lightColorRow");
                }
                if ("vibrate".equalsIgnoreCase(str2)) {
                    ob0Var.o("vibrateRow");
                }
                if ("popup".equalsIgnoreCase(str2)) {
                    ob0Var.o("popupRow");
                }
                if ("priority".equalsIgnoreCase(str2)) {
                    ob0Var.o("priorityRow");
                    return;
                }
                return;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.d;
                View view2 = (View) this.f44606e;
                String str3 = (String) this.f44605c;
                int i15 = this.f44604b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.E;
                int[] iArr = notificationsCustomSettingsActivity3.f35556y;
                if (!(view2 instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    ((zj0) arrayList4.get(i15)).f45192f = string;
                }
                ((org.telegram.ui.Cells.x9) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f44606e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f44605c;
                int i16 = this.f44604b;
                tk0.f42959a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (z0Var != null) {
                    boolean z11 = org.telegram.ui.web.z0.I0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    z0Var.v("oauth_result_failed", jSONObject);
                    break;
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 6:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.d;
                TL_account.Passkey passkey = (TL_account.Passkey) this.f44606e;
                String str4 = (String) this.f44605c;
                int i17 = this.f44604b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cg.a0(passkeysActivity, passkey, str4, i17, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.f44606e;
                int i18 = this.f44604b;
                String str5 = (String) this.f44605c;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    try {
                        e8.b bVar = new e8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.f5353c = false;
                        cVarA = bVar.a();
                        if (cVarA.f5355c.k()) {
                            a5.n nVar = new a5.n(5);
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            nVar.d = bitmap;
                            b8.b bVar2 = (b8.b) nVar.f100b;
                            bVar2.f2041a = width;
                            bVar2.f2042b = height;
                            bVar2.f2043c = i18;
                            if (cVarA.Q(nVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new op0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new bf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVarA.N();
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        r10.N();
                    }
                    throw th;
                }
            case 8:
                es0 es0Var = (es0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.f44606e;
                a0.h hVar = (a0.h) this.f44605c;
                org.telegram.ui.Components.mc.v(es0Var.Z0.f35800y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).f22384id : 0L, this.f44604b, -115203550, -1, 1500, false, null).j();
                return;
            case 9:
                org.telegram.ui.Components.y4.f0(this.f44604b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.f44606e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f44605c, new Object[0]);
                return;
            case 10:
                dd1 dd1Var = (dd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.f44606e;
                int i19 = this.f44604b;
                rn rnVar = (rn) this.f44605c;
                dd1Var.getClass();
                int i20 = 0;
                while (i20 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i20).f22525id == i19) {
                        tL_messageMediaToDo.todo.list.remove(i20);
                        i20--;
                    }
                    i20++;
                }
                int i21 = 0;
                while (i21 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i21).f22524id == i19) {
                        tL_messageMediaToDo.completions.remove(i21);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i21--;
                    }
                    i21++;
                }
                dd1Var.C.messageOwner.media = tL_messageMediaToDo;
                rnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
                rnVar.Wc(false);
                dd1Var.c(false);
                return;
            case 11:
                kd1 kd1Var = (kd1) this.d;
                int i22 = this.f44604b;
                ArrayList arrayList5 = (ArrayList) this.f44606e;
                ArrayList arrayList6 = (ArrayList) this.f44605c;
                ld1 ld1Var = kd1Var.h;
                ArrayList arrayList7 = kd1Var.d;
                ArrayList arrayList8 = kd1Var.f39701c;
                if (i22 != kd1Var.f39703f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                kd1Var.l();
                if (arrayList8.isEmpty()) {
                    ld1Var.f40061r.setVisibility(0);
                    return;
                } else {
                    ld1Var.f40061r.setVisibility(8);
                    return;
                }
            case 12:
                pf.z zVar = (pf.z) this.d;
                ArrayList arrayList9 = (ArrayList) this.f44606e;
                int i23 = this.f44604b;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) this.f44605c;
                ArrayList arrayList10 = zVar.G;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - zVar.f45991j0 < 300) {
                    return;
                }
                zVar.f45991j0 = jElapsedRealtime;
                int size = arrayList10.size();
                int size2 = arrayList9.size();
                int i24 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size2 + size;
                int iMin = Math.min(3, size2) + size;
                int iH = zVar.h();
                boolean z12 = zVar.C0;
                boolean z13 = iH > ((z12 ? iMin : i24) + i23) + 1;
                f2.l lVar = zVar.f45985e0;
                if (lVar != null) {
                    lVar.f5842c = z13 ? 45L : 200L;
                    lVar.d = z13 ? 80L : 200L;
                    lVar.f5849l = z13 ? 270L : 0L;
                }
                zVar.C0 = !z12;
                s3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(zVar.C0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = zVar.C0;
                org.telegram.ui.Cells.r3 r3Var = s3Var.f25628b;
                r3Var.c(string2, true, z14);
                r3Var.setVisibility(0);
                zVar.f45992k0 = null;
                View view3 = (View) s3Var.getParent();
                if (view3 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view3;
                    int i25 = (!zVar.C0 ? i23 + iMin : i24 + i23) + 1;
                    for (int i26 = 0; i26 < recyclerView.getChildCount(); i26++) {
                        View childAt = recyclerView.getChildAt(i26);
                        if (RecyclerView.R(childAt) == i25) {
                            zVar.f45992k0 = childAt;
                        }
                    }
                }
                int i27 = i23 + iMin;
                int i28 = i27 + 1;
                int iMax = Math.max(0, size2 - 3);
                if (zVar.C0) {
                    zVar.t(i28, iMax);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(zVar, i27, 26), 350L);
                    } else {
                        zVar.m(i27);
                    }
                } else {
                    zVar.m(i27);
                    zVar.s(i28, iMax);
                }
                zh1 zh1Var = zVar.f45993l0;
                if (zh1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(zh1Var);
                }
                if (!z13) {
                    zVar.f45990i0 = false;
                    return;
                }
                zVar.f45990i0 = true;
                zh1 zh1Var2 = new zh1(14, zVar, view3);
                zVar.f45993l0 = zh1Var2;
                AndroidUtilities.runOnUIThread(zh1Var2, 400L);
                return;
            case 13:
                pf.z zVar2 = (pf.z) this.d;
                int i29 = this.f44604b;
                TLObject tLObject = (TLObject) this.f44606e;
                String str6 = (String) this.f44605c;
                int i30 = zVar2.f45996o0;
                if (i29 == zVar2.Z && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zVar2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    zVar2.f46006w = messages_messages.next_rate;
                    zVar2.f46010y = str6;
                    MessagesController.getInstance(i30).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i30).putChats(messages_messages.chats, false);
                    for (int i31 = 0; i31 < messages_messages.messages.size(); i31++) {
                        zVar2.f46008x.add(new MessageObject(i30, messages_messages.messages.get(i31), false, true));
                    }
                    rx rxVar = zVar2.Q;
                    if (rxVar != null) {
                        rxVar.d(zVar2.f46012z0 > 0, true);
                    }
                    zVar2.l();
                    return;
                }
                return;
            case 14:
                qf.q1 q1Var = (qf.q1) this.d;
                ArrayList arrayList11 = q1Var.f46434b;
                TLRPC.Message message = (TLRPC.Message) this.f44606e;
                String str7 = (String) this.f44605c;
                int i32 = this.f44604b;
                int i33 = q1Var.f46433a;
                if ((message.flags & 1073741824) != 0) {
                    qf.p1 p1VarC = q1Var.c(message.quick_reply_shortcut_id);
                    if (p1VarC == null) {
                        qf.p1 p1Var = new qf.p1();
                        p1Var.f46418a = message.quick_reply_shortcut_id;
                        p1Var.d = message.f22401id;
                        MessageObject messageObject = new MessageObject(i33, message, false, true);
                        p1Var.f46421e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str7 != null) {
                            p1Var.f46419b = str7;
                            q1Var.a(str7);
                        }
                        p1Var.f46421e.applyQuickReply(str7, i32);
                        p1Var.f46422f = 1;
                        arrayList11.add(p1Var);
                        for (int i34 = 0; i34 < arrayList11.size(); i34++) {
                            ((qf.p1) arrayList11.get(i34)).f46420c = i34;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i33);
                        messagesStorage.getStorageQueue().postRunnable(new zh1(22, messagesStorage, p1Var));
                        NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i35 = p1VarC.d;
                        int i36 = message.f22401id;
                        if (i35 == i36) {
                            p1VarC.d = i36;
                            MessageObject messageObject2 = new MessageObject(i33, message, false, true);
                            p1VarC.f46421e = messageObject2;
                            messageObject2.generateThumbs(false);
                            q1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            p1VarC.f46422f++;
                            q1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i32 == 0) {
                    ArrayList<TLRPC.Message> arrayList12 = new ArrayList<>();
                    arrayList12.add(message);
                    MessagesStorage.getInstance(i33).putMessages(arrayList12, true, true, false, DownloadController.getInstance(i33).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i33).getClientUserId();
                    ArrayList<MessageObject> arrayList13 = new ArrayList<>();
                    arrayList13.add(new MessageObject(i33, message, true, true));
                    MessagesController.getInstance(i33).updateInterfaceWithMessages(clientUserId, arrayList13, 5);
                    return;
                }
                return;
            case 15:
                yf.j1 j1Var = (yf.j1) this.d;
                yf.e1 e1Var = (yf.e1) this.f44606e;
                int i37 = this.f44604b;
                ArrayList arrayList14 = (ArrayList) this.f44605c;
                ArrayList arrayList15 = j1Var.f49961c;
                boolean z15 = e1Var != null;
                j1Var.d = z15;
                if (!z15 || i37 < 0 || i37 >= arrayList15.size()) {
                    j1Var.f49965i = arrayList14;
                } else {
                    j1Var.f49959a++;
                    ((yf.i1) arrayList15.get(i37)).f49953c++;
                    j1Var.f49964g.edit().putInt(i0.a.k(i37, "score"), ((yf.i1) arrayList15.get(i37)).f49953c).putInt("scoreall", j1Var.f49959a).apply();
                    j1Var.f49965i = null;
                }
                j1Var.f49962e.run(e1Var);
                return;
            default:
                zf.n2 n2Var = (zf.n2) this.d;
                n2Var.m((Bitmap) this.f44606e, this.f44604b, n2Var.P, n2Var.Q, (nq0) this.f44605c);
                return;
        }
    }

    public xs(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f44603a = i11;
        this.d = obj;
        this.f44604b = i10;
        this.f44606e = obj2;
        this.f44605c = obj3;
    }

    public xs(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f44603a = i11;
        this.d = obj;
        this.f44606e = obj2;
        this.f44604b = i10;
        this.f44605c = obj3;
    }

    public xs(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f44603a = i11;
        this.d = obj;
        this.f44606e = obj2;
        this.f44605c = obj3;
        this.f44604b = i10;
    }
}
