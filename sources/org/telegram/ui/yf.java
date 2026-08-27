package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class yf implements Runnable {

    public final int f44799a;

    public final Object f44800b;

    public final Object f44801c;
    public final Object d;

    public final Object f44802e;

    public yf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44799a = i10;
        this.f44800b = obj;
        this.f44801c = obj2;
        this.d = obj3;
        this.f44802e = obj4;
    }

    @Override
    public final void run() {
        TLRPC.TL_webPage tL_webPageF;
        boolean z10;
        int i10;
        lr lrVar;
        long peerId;
        int i11;
        String[] strArr;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        ?? r10;
        ?? r11;
        cg.q qVar;
        ?? r12;
        ?? r13;
        int i12 = this.f44799a;
        int i13 = 4;
        int i14 = -1;
        int i15 = 5;
        int i16 = 17;
        Object user = null;
        int i17 = 0;
        Object obj = this.f44802e;
        Object obj2 = this.d;
        Object obj3 = this.f44801c;
        Object obj4 = this.f44800b;
        switch (i12) {
            case 0:
                rn rnVar = (rn) obj4;
                ?? r14 = (org.telegram.ui.ActionBar.n2) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj;
                if (r14 instanceof NotificationCenter.NotificationCenterDelegate) {
                    rnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r14, NotificationCenter.closeChats);
                }
                rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new rn(bundle));
                r14.finishFragment();
                break;
            case 1:
                rn rnVar2 = (rn) obj4;
                TLObject tLObject = (TLObject) obj2;
                hh.i2 i2Var = (hh.i2) obj;
                ((we.d) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    rnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    rnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = rnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    }
                }
                i2Var.run(user);
                break;
            case 2:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                org.telegram.ui.Components.dr drVar = (org.telegram.ui.Components.dr) imageView.getDrawable();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new g3(drVar, 5));
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
                valueAnimatorOfFloat.start();
                break;
            case 3:
                rn rnVar3 = (rn) obj4;
                MessageObject messageObject2 = (MessageObject) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPageF = org.telegram.ui.Components.d90.f(messageObject2);
                } catch (Throwable th) {
                    FileLog.e(th);
                    tL_webPageF = null;
                    user = th;
                }
                AndroidUtilities.runOnUIThread(new h3.p1(rnVar3, b2Var, zArr, user == null && tL_webPageF != null, messageObject2, tL_webPageF, 8));
                break;
            case 4:
                rn rnVar4 = (rn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        rnVar4.f42070h6 = messages_messages.count;
                        z10 = false;
                    } else {
                        z10 = false;
                        rnVar4.f42070h6 = 0;
                    }
                    messagesStorage.resetMentionsCount(rnVar4.P5, rnVar4.b(), rnVar4.f42070h6);
                    int i18 = rnVar4.f42070h6;
                    if (i18 == 0) {
                        rnVar4.f42083i6 = true;
                        rnVar4.Kb(z10);
                    } else {
                        rnVar4.f42041f1.c(2, i18, true);
                        rnVar4.H9();
                    }
                } else {
                    int i19 = messages_messages.messages.get(0).f22401id;
                    MessageObject messageObject3 = (MessageObject) rnVar4.f42109k6[0].get(i19);
                    messagesStorage.markMessageAsMention(rnVar4.P5, i19);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    rnVar4.j(i19, 0, false, 0, true, 0);
                }
                break;
            case 5:
                rn.n0((rn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (m6) obj);
                break;
            case 6:
                jp.W((jp) obj4, (org.telegram.ui.ActionBar.b2[]) obj2, (TLRPC.Chat) obj, (org.telegram.ui.ActionBar.n2) obj3);
                break;
            case 7:
                dq dqVar = (dq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                dqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    dqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                }
                break;
            case 8:
                lr lrVar2 = (lr) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                nq nqVar = (nq) obj;
                if ((tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar2.getParentActivity());
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
                    b2Var2.N = string;
                    b2Var2.P = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new c1(nqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    lrVar2.showDialog(b2Var2);
                } else {
                    nqVar.run(1);
                }
                break;
            case 9:
                kr krVar = (kr) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                lr lrVar3 = krVar.f39845y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new cg.k0(krVar, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 29));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i20 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i20];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    ArrayList arrayList4 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i21 = 0;
                        while (i21 < size) {
                            TLObject tLObject4 = (TLObject) arrayList.get(i21);
                            if (tLObject4 instanceof TLRPC.ChatParticipant) {
                                i10 = size;
                                peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                            } else {
                                i10 = size;
                                if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                                } else {
                                    lrVar = lrVar3;
                                }
                                krVar = krVar;
                                strArr = strArr3;
                                i11 = i21;
                                i21 = i11 + 1;
                                size = i10;
                                lrVar3 = lrVar;
                                krVar = krVar;
                                strArr3 = strArr;
                            }
                            if (peerId > 0) {
                                lrVar = lrVar3;
                                TLRPC.User user3 = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                                if (user3.f22527id == lrVar.getUserConfig().getClientUserId()) {
                                    krVar = krVar;
                                    strArr = strArr3;
                                    i11 = i21;
                                } else {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str = user3.first_name;
                                    str2 = user3.last_name;
                                }
                                i21 = i11 + 1;
                                size = i10;
                                lrVar3 = lrVar;
                                krVar = krVar;
                                strArr3 = strArr;
                            } else {
                                lrVar = lrVar3;
                                TLRPC.Chat chat = lrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                str2 = null;
                            }
                            strArr = strArr3;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i11 = i21;
                            int i22 = 0;
                            char c10 = 0;
                            while (i22 < i20) {
                                int i23 = i22;
                                String str3 = strArr[i23];
                                char c11 = (lowerCase.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, lowerCase) || (translitString2 != null && (translitString2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, translitString2)))) ? (char) 1 : (publicUsername == null || !publicUsername.startsWith(str3)) ? c10 : (char) 2;
                                if (c11 != 0) {
                                    if (c11 == 1) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str, str2, str3));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), null, "@" + str3));
                                    }
                                    arrayList5.add(tLObject4);
                                }
                                i22 = i23 + 1;
                                c10 = c11;
                                translitString2 = translitString2;
                                lowerCase = lowerCase;
                                break;
                            }
                            i21 = i11 + 1;
                            size = i10;
                            lrVar3 = lrVar;
                            krVar = krVar;
                            strArr3 = strArr;
                        }
                    }
                    lr lrVar4 = lrVar3;
                    kr krVar2 = krVar;
                    String[] strArr4 = strArr3;
                    if (arrayList2 != null) {
                        for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                            TLRPC.User user4 = lrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i24)).user_id));
                            if (user4.f22527id != lrVar4.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                char c12 = 0;
                                for (int i25 = 0; i25 < i20; i25++) {
                                    String str4 = strArr4[i25];
                                    if (lowerCase3.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, translitString3)))) {
                                        c12 = 1;
                                    } else {
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str4)) {
                                            c12 = 2;
                                        }
                                    }
                                    if (c12 != 0) {
                                        if (c12 == 1) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str4));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str4));
                                        }
                                        arrayList3.add(user4);
                                        hVar.k(user4, user4.f22527id);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new cg.k0(krVar2, arrayList3, hVar, arrayList4, arrayList5, 29));
                }
                break;
            case 10:
                String str5 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.e0) obj4, (Context) obj2, str5, str5, (org.telegram.ui.ActionBar.c6) obj).show();
                break;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                hh.o6 o6Var = (hh.o6) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                View view = (View) obj;
                String strTrim = editTextBoldCursor.getText().toString().trim();
                Uri uri = Uri.parse(strTrim);
                if (uri == null || uri.getHost() == null) {
                    uri = Uri.parse("https://" + strTrim);
                }
                if (uri == null || uri.getHost() == null) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    String lowerCase4 = uri.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    o6Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                    if (b2Var3 != null) {
                        b2Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                break;
            case 12:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                ?? r15 = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                for (int i26 = 0; i26 < iArr.length; i26++) {
                    if (iArr2[0] == iArr[i26]) {
                        spannableStringBuilder.append((CharSequence) strArr5[i26]);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " v");
                        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.arrows_select, 0);
                            cqVar.spaceScaleX = 0.7f;
                            cqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                            cqVar.setAlpha(0.75f);
                            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        } else {
                            org.telegram.ui.Components.cq cqVar2 = new org.telegram.ui.Components.cq(R.drawable.mini_switch_lock, 0);
                            cqVar2.spaceScaleX = 0.7f;
                            cqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                            cqVar2.setAlpha(0.75f);
                            spannableStringBuilder.setSpan(cqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        }
                        r15.setText(spannableStringBuilder);
                    }
                    break;
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.cq cqVar3 = new org.telegram.ui.Components.cq(R.drawable.arrows_select, 0);
                    cqVar3.spaceScaleX = 0.7f;
                    cqVar3.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    cqVar3.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(cqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.cq cqVar4 = new org.telegram.ui.Components.cq(R.drawable.mini_switch_lock, 0);
                    cqVar4.spaceScaleX = 0.7f;
                    cqVar4.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    cqVar4.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(cqVar4, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r15.setText(spannableStringBuilder);
                break;
            case 13:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.pu0) obj3, (int[]) obj2, (org.telegram.ui.Components.eo0) obj);
                break;
            case 14:
                org.telegram.ui.Components.in inVar = (org.telegram.ui.Components.in) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                long j10 = inVar.R;
                final org.telegram.ui.Components.g1 g1Var = new org.telegram.ui.Components.g1(16, inVar, (View) obj2);
                org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(i15);
                int i27 = org.telegram.ui.ActionBar.g6.f23161j5;
                int iQ0 = c6Var != null ? c6Var.q0(i27) : org.telegram.ui.ActionBar.g6.w0(null, i27, false);
                int i28 = org.telegram.ui.ActionBar.g6.f23124h5;
                int iQ1 = c6Var != null ? c6Var.q0(i28) : org.telegram.ui.ActionBar.g6.w0(null, i28, false);
                int i29 = org.telegram.ui.ActionBar.g6.Ji;
                if (c6Var != null) {
                    c6Var.q0(i29);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.g6.Ni;
                if (c6Var != null) {
                    c6Var.q0(i30);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.g6.E8;
                if (c6Var != null) {
                    c6Var.q0(i31);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.g6.G8;
                if (c6Var != null) {
                    c6Var.q0(i32);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.g6.f23144i6;
                if (c6Var != null) {
                    c6Var.q0(i33);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.g6.Sh;
                int iQ2 = c6Var != null ? c6Var.q0(i34) : org.telegram.ui.ActionBar.g6.w0(null, i34, false);
                int i35 = org.telegram.ui.ActionBar.g6.Oh;
                int iQ3 = c6Var != null ? c6Var.q0(i35) : org.telegram.ui.ActionBar.g6.w0(null, i35, false);
                if (c6Var != null) {
                    c6Var.q0(org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                if (context != null) {
                    final int i36 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
                    z2Var.a();
                    final org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, c6Var);
                    fc0Var.setTextColor(iQ0);
                    fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    fc0Var.setItemCount(5);
                    final org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(context, c6Var);
                    x3Var.setWrapSelectorWheel(true);
                    x3Var.setAllItemsCount(24);
                    x3Var.setItemCount(5);
                    x3Var.setTextColor(iQ0);
                    x3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, c6Var);
                    y3Var.setWrapSelectorWheel(true);
                    y3Var.setAllItemsCount(60);
                    y3Var.setItemCount(5);
                    y3Var.setTextColor(iQ0);
                    y3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context);
                    ?? r3Var = new org.telegram.ui.Components.r3(context, fc0Var, x3Var, y3Var, 2);
                    r3Var.setOrientation(1);
                    frameLayout.addView(r3Var, h7.z5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    r3Var.addView(frameLayout2, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(iQ0);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new kh.e(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, c6Var));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    cg.q qVar2 = new cg.q(context, 17);
                    qVar2.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    h7.b6.b(qVar2, 0.02f, 1.2f);
                    linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                    fc0Var.setMinValue(0);
                    fc0Var.setMaxValue(365);
                    fc0Var.setWrapSelectorWheel(false);
                    fc0Var.setFormatter(new fr(29));
                    gh.u2 u2Var = new gh.u2(i36, fc0Var, x3Var, y3Var, textView2);
                    fc0Var.setOnValueChangedListener(u2Var);
                    x3Var.setMinValue(0);
                    x3Var.setMaxValue(23);
                    int i37 = iQ1;
                    linearLayout.addView(x3Var, h7.z5.l(0.2f, 0, 270));
                    x3Var.setFormatter(new org.telegram.ui.Components.c2(0));
                    x3Var.setOnValueChangedListener(u2Var);
                    y3Var.setMinValue(0);
                    y3Var.setMaxValue(59);
                    y3Var.setValue(0);
                    y3Var.setFormatter(new org.telegram.ui.Components.c2(1));
                    linearLayout.addView(y3Var, h7.z5.l(0.3f, 0, 270));
                    y3Var.setOnValueChangedListener(u2Var);
                    if (j10 <= 0 || j10 == 2147483646) {
                        r10 = frameLayout;
                        r11 = r3Var;
                        qVar = qVar2;
                    } else {
                        r12 = frameLayout;
                        long j11 = j10 * 1000;
                        r13 = r3Var;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        qVar = qVar2;
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            r10 = r12;
                            r11 = r13;
                            y3Var.setValue(calendar.get(12));
                            x3Var.setValue(calendar.get(11));
                            fc0Var.setValue(timeInMillis);
                            r10 = r12;
                            r11 = r13;
                        }
                    }
                    r10 = r12;
                    r11 = r13;
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.y4.g(null, null, 0L, i36, 3, fc0Var, x3Var, y3Var);
                    org.telegram.ui.Components.y4.e(textView2, fc0Var, x3Var, y3Var);
                    qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    qVar.setGravity(17);
                    qVar.setTextColor(iQ2);
                    qVar.setTextSize(1, 14.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, iQ3));
                    r11.addView(qVar, h7.z5.t(-1, 48, 83, 14, 15, 14, 16));
                    qVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            long j12 = i36;
                            fc0 fc0Var2 = fc0Var;
                            x3 x3Var2 = x3Var;
                            y3 y3Var2 = y3Var;
                            boolean zG = y4.g(null, null, 0L, j12, 3, fc0Var2, x3Var2, y3Var2);
                            y4.e(textView2, fc0Var2, x3Var2, y3Var2);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(jCurrentTimeMillis);
                            calendar2.add(6, fc0Var2.getValue());
                            calendar2.set(11, x3Var2.getValue());
                            calendar2.set(12, y3Var2.getValue());
                            if (zG) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            g1Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            z2Var.f23994a.dismissRunnable.run();
                        }
                    });
                    r11.addView(textView2, h7.z5.t(-1, -2, 83, 14, 0, 14, 16));
                    z2Var.b(r10);
                    org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
                    e3Var.show();
                    e3Var.setOnDismissListener(new org.telegram.ui.Components.e2(0, gcVar, zArr2));
                    e3Var.setBackgroundColor(i37);
                    e3Var.fixNavigationBar(i37);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.sx sxVar = (org.telegram.ui.Components.sx) obj4;
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj;
                sxVar.getClass();
                try {
                    b2VarArr2[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                b2VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    we.e.s(sxVar.f32597c.f32904a.B.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    z2Var2.f23994a.dismissRunnable.run();
                }
                break;
            case 16:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList6 = ryVar.f32276s;
                org.telegram.ui.Components.ty tyVar = ryVar.f32277w;
                if (tyVar.I == ryVar.f32270b) {
                    tyVar.H = 0;
                    if (tL_messages_getStickers.emoticon.equals(ryVar.f32269a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                            int size2 = arrayList6.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i17 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i17);
                                if (ryVar.v.indexOfKey(document.f22386id) < 0) {
                                    arrayList6.add(document);
                                }
                                i17++;
                            }
                            if (size2 != arrayList6.size()) {
                                ryVar.f32273f.put(arrayList6, tyVar.J);
                                if (size2 == 0) {
                                    ryVar.h.add(arrayList6);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.q00 q00Var = (org.telegram.ui.Components.q00) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                q00Var.f31742v0 = -1;
                org.telegram.ui.ActionBar.n2 n2Var = q00Var.f31855n;
                q00.r0((TLRPC.TL_error) obj3, n2Var, org.telegram.ui.Components.mc.a0(n2Var));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                        if (arrayList7.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f22634id;
                            }
                        } else {
                            while (i17 < arrayList7.size()) {
                                if (arrayList7.get(i17) instanceof TL_update.TL_updateDialogFilter) {
                                    i14 = ((TL_update.TL_updateDialogFilter) arrayList7.get(i17)).f22634id;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    if (q00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        n2Var.getMessagesController().loadRemoteFilters(true, new gh.q2(q00Var, callback, i14, i13));
                    } else {
                        if (q00Var.W != null) {
                            n2Var.getMessagesController().checkChatlistFolderUpdate(q00Var.U, true);
                        }
                        q00Var.f31743w0 = true;
                        q00Var.dismiss();
                        callback.run(Integer.valueOf(i14));
                    }
                } else {
                    q00Var.f31729h0.a(false);
                }
                break;
            case 18:
                ((gy) obj4).w4(((Integer) obj2).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xq(i16, (df) obj, (org.telegram.ui.ActionBar.n2) obj3), 200L);
                break;
            case 19:
                org.telegram.ui.Components.g30.N((org.telegram.ui.Components.g30) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                break;
            case 20:
                org.telegram.ui.Components.t70.n((org.telegram.ui.Components.t70) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                break;
            case 21:
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj;
                i80Var.f29279y = false;
                i80Var.G = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject8;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i17 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i17++;
                    }
                    i80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                }
                break;
            case 22:
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) obj4;
                ArrayList arrayList8 = (ArrayList) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(o90Var.Q);
                for (int i38 = 0; i38 < arrayList8.size(); i38++) {
                    ((TL_stories.StoryItem) arrayList8.get(i38)).pinned = zArr3[i38];
                }
                o90Var.getMessagesController().getStoriesController().n0(o90Var.f31239e, arrayList8, false);
                break;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                lh.d dVar = (lh.d) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.mc.X().d0(tL_error3, false);
                } else {
                    dVar.setLoading(false);
                    e3Var2.dismiss();
                    org.telegram.ui.Components.mc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable2.run();
                }
                break;
            case 24:
                gy gyVar = (gy) obj3;
                gyVar.showDialog(new m31((Context) obj2, gyVar.getResourceProvider(), new org.telegram.ui.Components.lg0(7, (org.telegram.ui.Components.cn0) obj4, gyVar)));
                ((org.telegram.ui.Components.b70) obj).u();
                break;
            case 25:
                gy gyVar2 = (gy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.c6 resourceProvider = gyVar2.getResourceProvider();
                org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(6, (org.telegram.ui.Components.cn0) obj4, tL_sponsoredPeer);
                int i39 = x21.v;
                int currentAccount = gyVar2.getCurrentAccount();
                Activity parentActivity = gyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.di(parentActivity, resourceProvider, bArr, gyVar2, lg0Var, currentAccount));
                }
                b70Var.u();
                break;
            case 26:
                org.telegram.ui.Components.sp0.m((org.telegram.ui.Components.sp0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.yo0) obj2, (TLRPC.Dialog) obj);
                break;
            case 27:
                org.telegram.ui.Components.ex0.F((org.telegram.ui.Components.ex0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                break;
            case 28:
                org.telegram.ui.Components.ex0.p((pr0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            default:
                org.telegram.ui.Components.oz0 oz0Var = (org.telegram.ui.Components.oz0) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(oz0Var.d).performLogout(0);
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder sbF = s3.c.f(string2, "\n");
                        sbF.append(tL_error4.text);
                        string2 = sbF.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oz0Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder2.f22702a;
                    b2Var4.N = string3;
                    b2Var4.P = string2;
                    i0.a.C(R.string.OK, alertDialog$Builder2, null);
                }
                break;
        }
    }

    public yf(org.telegram.ui.ActionBar.n2 n2Var, Serializable serializable, Object obj, org.telegram.ui.ActionBar.n2 n2Var2, int i10) {
        this.f44799a = i10;
        this.f44800b = n2Var;
        this.d = serializable;
        this.f44802e = obj;
        this.f44801c = n2Var2;
    }

    public yf(rn rnVar, MessageObject messageObject, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr) {
        this.f44799a = 3;
        this.f44800b = rnVar;
        this.d = messageObject;
        this.f44801c = b2Var;
        this.f44802e = zArr;
    }
}
