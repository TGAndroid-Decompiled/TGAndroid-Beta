package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class x5 implements qy, org.telegram.ui.ActionBar.b2, v4, org.telegram.ui.Components.b5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.pj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, vg1 {
    public final int f39380a;
    public final Object f39381b;
    public final Object f39382c;

    public x5(int i10, Object obj, Object obj2) {
        this.f39380a = i10;
        this.f39381b = obj;
        this.f39382c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39380a) {
            case 4:
                bo boVar = (bo) this.f39381b;
                boVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), null, (Uri) this.f39382c, boVar.T5, boVar.f32385n5, boVar.X3, boVar.f32359l5, null, null, null, null, 0, boVar.p5, z10, i10, boVar.R3, boVar.C8());
                return;
            case 5:
            default:
                nn nnVar = (nn) this.f39381b;
                MessageObject messageObject = (MessageObject) this.f39382c;
                if (z10) {
                    nnVar.f36139a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18142id, i10);
                    return;
                } else {
                    nnVar.getClass();
                    return;
                }
            case 6:
                bo boVar2 = (bo) this.f39381b;
                boVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f39382c, boVar2.T5, boVar2.f32385n5, boVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                boVar2.Y.setFieldText("");
                boVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f39382c;
        bo boVar = ((ii) this.f39381b).f34606p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", boVar.T5);
        boVar.presentFragment(new ProfileActivity(bundle, null));
        boVar.A7(true);
    }

    @Override
    public void b(d5 d5Var) {
        nb nbVar = (nb) this.f39381b;
        TLRPC.User user = (TLRPC.User) this.f39382c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                sb sbVar = nbVar.f36013a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18268id);
                    org.telegram.ui.ActionBar.o2 o2Var = sbVar.f37452n;
                    if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                        o2Var.presentFragment(new bo(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        nbVar.a(user);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((pq) this.f39381b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f39382c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f39380a) {
            case 1:
                nf.f.o(((wb) this.f39381b).getParentActivity(), (String) this.f39382c, true);
                return;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            default:
                org.telegram.ui.Components.mf mfVar = (org.telegram.ui.Components.mf) this.f39381b;
                boolean[] zArr = (boolean[]) this.f39382c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                wy wyVar = (wy) mfVar.f26142b;
                ArrayList arrayList = (ArrayList) mfVar.f26143c;
                wyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        wyVar.getMessagesController().reportSpam(longValue, wyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        wyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    wyVar.getMessagesController().blockPeer(longValue);
                }
                wyVar.b4(false);
                return;
            case 3:
                nd.V((nd) this.f39381b, (TLRPC.Chat) this.f39382c);
                return;
            case 13:
                kp kpVar = (kp) this.f39381b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f39382c);
                tL_channels_updateUsername.username = "";
                kpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new xo(kpVar, 0), 64);
                return;
            case 17:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f39381b, (TL_aicompose.TL_aiComposeTone) this.f39382c, c2Var);
                return;
            case 18:
                ((AtomicBoolean) this.f39381b).set(true);
                ((q0.a) this.f39382c).accept(Boolean.FALSE);
                return;
            case 19:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f39382c;
                int i13 = ((int[]) this.f39381b)[0];
                if (i13 == 0) {
                    i11 = 900;
                } else if (i13 == 1) {
                    i11 = 3600;
                } else if (i13 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            case 20:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f39381b;
                LaunchActivity launchActivity = (LaunchActivity) this.f39382c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                return;
            case 21:
                c2Var.dismiss();
                ((pf) this.f39381b).run(((EditText) this.f39382c).getText().toString());
                return;
            case 22:
                org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.f39381b;
                Utilities.Callback callback = (Utilities.Callback) this.f39382c;
                String trim = d4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.c5.f22934a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(d4Var);
                    return;
                }
                callback.run(trim);
                c2Var.dismiss();
                return;
            case 23:
                String str2 = (String) this.f39381b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f39382c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f39381b;
                int i14 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.uc0) this.f39382c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i14 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 25:
                ((fa) this.f39381b).run(((boolean[]) this.f39382c)[0]);
                return;
            case 26:
                Runnable runnable = (Runnable) this.f39382c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f39381b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                ((MessagesStorage.BooleanCallback) this.f39381b).run(((boolean[]) this.f39382c)[0]);
                return;
            case 28:
                ((Utilities.Callback) this.f39381b).run(Boolean.valueOf(((boolean[]) this.f39382c)[0]));
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        zn znVar = (zn) this.f39381b;
        org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) this.f39382c;
        Pair pair = (Pair) obj;
        znVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.e4 e4Var = znVar.f40285f;
            if (e4Var != null && longValue == e4Var.i(znVar.G ? 1 : 0) && bitmap != null) {
                cc0Var.f23021x = bitmap;
                cc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        bo.g0((bo) this.f39381b, (Context) this.f39382c, tL_error);
        return false;
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        b6 b6Var = (b6) this.f39381b;
        ArrayList arrayList2 = b6Var.f32059c;
        ((wy) this.f39382c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < b6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) b6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) b6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (b6Var.getMessagesController().getCacheByChatsController().getKeepMedia(b6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = b6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
        b6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((a6) arrayList2.get(i16)).f31729c != null && ((a6) arrayList2.get(i16)).f31729c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.f32058b.v0(i12);
            AndroidUtilities.runOnUIThread(new l4(2, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public x5(nb nbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.f39380a = 2;
        this.f39381b = nbVar;
        this.f39382c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f39380a) {
            case 12:
                wo woVar = (wo) this.f39381b;
                woVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f39382c).dismiss();
                woVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                woVar.f39116w0 = j3;
                TLRPC.Chat chat = woVar.getMessagesController().getChat(Long.valueOf(j3));
                woVar.f39118x0 = chat;
                TLRPC.ChatFull chatFull = woVar.f39120y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != woVar.H0;
                woVar.getMessagesController().toggleChannelForum(woVar.f39116w0, woVar.F0, woVar.H0);
                TLRPC.Chat chat2 = woVar.f39118x0;
                chat2.forum = woVar.F0;
                chat2.forum_tabs = woVar.H0;
                if (z10) {
                    woVar.q0();
                    return;
                }
                return;
            case 13:
            default:
                sp spVar = (sp) this.f39381b;
                Runnable runnable = (Runnable) this.f39382c;
                if (j3 != 0) {
                    wp wpVar = spVar.f37543x.d;
                    if (wpVar.f39128s) {
                        wpVar.v.set(0, wpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        wpVar.E = j3;
                        wpVar.f39125f = wpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                spVar.getClass();
                return;
            case 14:
                wp wpVar2 = (wp) this.f39381b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f39382c;
                if (j3 != 0) {
                    wpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    wpVar2.Y(wpVar2.getMessagesController().getChat(Long.valueOf(j3)), o2Var);
                    return;
                }
                wpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f39382c).f18268id;
        bo boVar = ((oj) this.f39381b).f36367b;
        long j10 = boVar.f32261d4;
        if (j3 != j10) {
            return;
        }
        boVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f39382c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f39381b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
