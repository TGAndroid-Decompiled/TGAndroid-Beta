package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class u implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2, ly, w4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.pj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mg1 {
    public final int f37823a;
    public final Object f37824b;
    public final Object f37825c;

    public u(int i10, Object obj, Object obj2) {
        this.f37823a = i10;
        this.f37824b = obj;
        this.f37825c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f37823a) {
            case 6:
                xn xnVar = (xn) this.f37824b;
                xnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), null, (Uri) this.f37825c, xnVar.T5, xnVar.f39475n5, xnVar.X3, xnVar.f39449l5, null, null, null, null, 0, xnVar.p5, z10, i10, xnVar.R3, xnVar.C8());
                return;
            case 7:
            default:
                jn jnVar = (jn) this.f37824b;
                MessageObject messageObject = (MessageObject) this.f37825c;
                if (z10) {
                    jnVar.f34487a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18104id, i10);
                    return;
                } else {
                    jnVar.getClass();
                    return;
                }
            case 8:
                xn xnVar2 = (xn) this.f37824b;
                xnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f37825c, xnVar2.T5, xnVar2.f39475n5, xnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f37825c;
        xn xnVar = ((ei) this.f37824b).f32938p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", xnVar.T5);
        xnVar.presentFragment(new ProfileActivity(bundle, null));
        xnVar.A7(true);
    }

    @Override
    public void b(e5 e5Var) {
        lb lbVar = (lb) this.f37824b;
        TLRPC.User user = (TLRPC.User) this.f37825c;
        int ordinal = e5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                qb qbVar = lbVar.f34906a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18230id);
                    org.telegram.ui.ActionBar.n2 n2Var = qbVar.f36380n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new xn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        lbVar.a(user);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        i4 i4Var = (i4) this.f37824b;
        m3 m3Var = (m3) this.f37825c;
        if (i4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
            if (r9Var != null) {
                if (r9Var.y()) {
                    i4Var.O0.f(false);
                    return;
                }
                i4Var.O0.f(false);
            }
            g4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (i4Var.G0 == 0) {
                    if ((!p3Var.f36017c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.f18236id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f18236id;
                        i4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.ce(i4Var, i11, j3));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = i4.z(pageBlock);
                if (z10 instanceof w3) {
                    z10 = ((w3) z10).f38526b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                    i4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    i4Var.Q(c4Var.f32251a.articles.get(c4Var.f32252b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = i4.y(view);
                    if (y3 instanceof m1) {
                        i4Var.d = null;
                        i4Var.f36712f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            m1 m1Var = (m1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = m1Var.f35121f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            m1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.s(i10 + 1, abs);
                                } else {
                                    adapter.t(i10 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((lq) this.f37824b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f37825c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f37823a) {
            case 1:
                q4 q4Var = (q4) this.f37824b;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.W((View) this.f37825c, true);
                return;
            case 3:
                nf.f.o(((ub) this.f37824b).getParentActivity(), (String) this.f37825c, true);
                return;
            case 5:
                ld.V((ld) this.f37824b, (TLRPC.Chat) this.f37825c);
                return;
            case 15:
                gp gpVar = (gp) this.f37824b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f37825c);
                tL_channels_updateUsername.username = "";
                gpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new to(gpVar, 0), 64);
                return;
            case 19:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f37824b, (TL_aicompose.TL_aiComposeTone) this.f37825c, b2Var);
                return;
            case 20:
                ((AtomicBoolean) this.f37824b).set(true);
                ((q0.a) this.f37825c).accept(Boolean.FALSE);
                return;
            case 21:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f37825c;
                int i12 = ((int[]) this.f37824b)[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else if (i12 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            case 22:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f37824b;
                LaunchActivity launchActivity = (LaunchActivity) this.f37825c;
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
            case 23:
                b2Var.dismiss();
                ((oc) this.f37824b).run(((EditText) this.f37825c).getText().toString());
                return;
            case 24:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f37824b;
                Utilities.Callback callback = (Utilities.Callback) this.f37825c;
                String trim = f4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.e5.f23567a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(f4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
            case 25:
                String str2 = (String) this.f37824b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37825c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f37824b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.tc0) this.f37825c).getValue();
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
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 27:
                ((da) this.f37824b).run(((boolean[]) this.f37825c)[0]);
                return;
            case 28:
                Runnable runnable = (Runnable) this.f37825c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f37824b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ((MessagesStorage.BooleanCallback) this.f37824b).run(((boolean[]) this.f37825c)[0]);
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.f37824b;
        org.telegram.ui.Components.bc0 bc0Var = (org.telegram.ui.Components.bc0) this.f37825c;
        Pair pair = (Pair) obj;
        vnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.c4 c4Var = vnVar.f38428f;
            if (c4Var != null && longValue == c4Var.i(vnVar.G ? 1 : 0) && bitmap != null) {
                bc0Var.f22698x = bitmap;
                bc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        xn.h0((xn) this.f37824b, (Context) this.f37825c, tL_error);
        return false;
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        b6 b6Var = (b6) this.f37824b;
        ArrayList arrayList2 = b6Var.f31971c;
        ((ry) this.f37825c).finishFragment();
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
                    if (((a6) arrayList2.get(i16)).f31681c != null && ((a6) arrayList2.get(i16)).f31681c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.f31970b.u0(i12);
            AndroidUtilities.runOnUIThread(new m4(2, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public u(lb lbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.f37823a = 4;
        this.f37824b = lbVar;
        this.f37825c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f37823a) {
            case 14:
                so soVar = (so) this.f37824b;
                soVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f37825c).dismiss();
                soVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                soVar.f37372w0 = j3;
                TLRPC.Chat chat = soVar.getMessagesController().getChat(Long.valueOf(j3));
                soVar.f37374x0 = chat;
                TLRPC.ChatFull chatFull = soVar.f37376y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != soVar.H0;
                soVar.getMessagesController().toggleChannelForum(soVar.f37372w0, soVar.F0, soVar.H0);
                TLRPC.Chat chat2 = soVar.f37374x0;
                chat2.forum = soVar.F0;
                chat2.forum_tabs = soVar.H0;
                if (z10) {
                    soVar.q0();
                    return;
                }
                return;
            case 15:
            default:
                op opVar = (op) this.f37824b;
                Runnable runnable = (Runnable) this.f37825c;
                if (j3 != 0) {
                    sp spVar = opVar.f35917x.d;
                    if (spVar.f37386s) {
                        spVar.v.set(0, spVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        spVar.E = j3;
                        spVar.f37383f = spVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                opVar.getClass();
                return;
            case 16:
                sp spVar2 = (sp) this.f37824b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37825c;
                if (j3 != 0) {
                    spVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    spVar2.Y(spVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    return;
                }
                spVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f37825c).f18230id;
        xn xnVar = ((kj) this.f37824b).f34737b;
        long j10 = xnVar.f39352d4;
        if (j3 != j10) {
            return;
        }
        xnVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f37825c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f37824b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
