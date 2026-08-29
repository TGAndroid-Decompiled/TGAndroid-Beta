package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class z6 implements org.telegram.ui.Components.cl0, org.telegram.ui.Components.nj0, org.telegram.ui.Components.b5, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.al0, MessagesController.NewMessageCallback, yx, pf1, org.telegram.ui.Components.voip.k3, OnSuccessListener {
    public final int f45085a;
    public final Object f45086b;
    public final Object f45087c;
    public final Object d;

    public z6(Object obj, Object obj2, Object obj3, int i10) {
        this.f45085a = i10;
        this.f45086b = obj;
        this.f45087c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        switch (this.f45085a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f45085a) {
            case 2:
                tn tnVar = (tn) this.f45086b;
                tnVar.getClass();
                tnVar.cb((TLRPC.BotInlineResult) this.f45087c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                tn tnVar2 = (tn) this.f45086b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f45087c;
                MessageObject messageObject = (MessageObject) this.d;
                tnVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(kf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        tnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                tn.a0((tn) this.f45086b, (MessageObject.GroupedMessages) this.f45087c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(fy fyVar) {
        switch (this.f45085a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.pj0 pj0Var, int i10) {
        int i11;
        View view = (View) this.f45086b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45087c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(pj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.x3.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        r50.n((r50) this.f45086b, (Activity) this.f45087c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(d5 d5Var) {
        switch (this.f45085a) {
            case 6:
                fn fnVar = (fn) this.f45086b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f45087c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = d5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                fnVar.f38212a.ma(user);
                                return;
                            }
                            return;
                        }
                        fnVar.d(user);
                        return;
                    }
                    fnVar.q(s1Var, user);
                    return;
                }
                fnVar.v(user, false);
                return;
            default:
                fn fnVar2 = (fn) this.f45086b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45087c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int ordinal2 = d5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                fnVar2.f38212a.ka(chat);
                                return;
                            }
                            return;
                        }
                        fnVar2.b(chat);
                        return;
                    }
                    fnVar2.m(s1Var2, chat, 0, false);
                    return;
                }
                fnVar2.r(chat);
                return;
        }
    }

    @Override
    public void d(org.telegram.ui.Components.voip.l3 l3Var) {
        String string;
        oh1 oh1Var = (oh1) this.f45086b;
        VoIPService voIPService = (VoIPService) this.f45087c;
        org.telegram.ui.Components.voip.m3 m3Var = (org.telegram.ui.Components.voip.m3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
            oh1Var.N0 = false;
            if (oh1Var.f41170s0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                l3Var.announceForAccessibility(string);
            }
            m3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f45085a;
        Object obj = this.d;
        Object obj2 = this.f45087c;
        Object obj3 = this.f45086b;
        switch (i12) {
            case 8:
                vo voVar = (vo) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                yo yoVar = voVar.f43692a.W2;
                if (tL_username.editable) {
                    if (yoVar.f44934o0 == null) {
                        yoVar.f44934o0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = yoVar.T;
                    tL_inputChannel.channel_id = chat.f22392id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    yoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new nh.q1(voVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    yoVar.L.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                yoVar.V();
                return;
            case 9:
                kp kpVar = (kp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                kpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    kpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f22392id, false);
                }
                kpVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                ya1 ya1Var = (ya1) obj3;
                if (org.telegram.ui.ActionBar.g6.j0(((ab1) obj2).d, (org.telegram.ui.ActionBar.e6) obj, true)) {
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (ya1Var.f44825e.f36299f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.g6.I, Boolean.valueOf(z10), null, -1);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditText editText = (EditText) obj;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.n0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.f35526n);
                ImageLoader.getInstance().checkMediaPaths(new zt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f22714a.H0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f22714a.H0.run();
                nz nzVar = ((lz) obj3).A.f40653c;
                nzVar.d.title = editTextBoldCursor.getText().toString();
                nzVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (nzVar.B != 0) {
                    nzVar.getConnectionsManager().cancelRequest(nzVar.B, true);
                    nzVar.B = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = nzVar.f40931c.f19620id;
                tL_chatlists_editExportedInvite.slug = nzVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                nzVar.B = nzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(nzVar, 0));
                Utilities.Callback callback = nzVar.f40939y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((u40) obj3).f43179b.W0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f22714a.H0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                k71 k71Var = (k71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.o2) k71Var.f39783a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new u80(23, k71Var, tL_authorization));
                ((y61) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((n61) this.f45086b).T((TLRPC.User) this.f45087c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        bo0 bo0Var = (bo0) this.f45086b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.f45087c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == bo0Var.f36852h0.f22539id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new n20(bo0Var, b5Var, activity, message, 19));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        a5.j jVar = (a5.j) this.f45086b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) jVar.f213c));
        ((nh.d) this.f45087c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) jVar.f214e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    c6Var = U.getResourceProvider();
                } else {
                    c6Var = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = ei1.f37846c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    ei1.f37846c = null;
                }
                org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
                FrameLayout frameLayout = new FrameLayout(context);
                q6.customView = frameLayout;
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                frameLayout.addView(g10, i7.f6.e(-1, -1, 119));
                TextView b10 = i7.j6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.f23169j5, true, c6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                g10.addView(b10, i7.f6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var))));
                    if (i11 == 0) {
                        f9 = 0.0f;
                    } else {
                        f9 = 5.0f;
                    }
                    linearLayout.addView(imageView, i7.f6.k(f9, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                g10.addView(linearLayout, i7.f6.t(-2, -2, 49, 32, 12, 32, 12));
                nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
                o10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                g10.addView(o10, i7.f6.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.g6.f23009a7;
                q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                q6.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                ei1.f37846c = q6;
                q6.show();
                o10.setOnClickListener(new bg.p2(o10, i10, q6, 20));
            }
        }
    }

    @Override
    public void run(long j10) {
        dq.a0((dq) this.f45086b, (TLRPC.InputCheckPasswordSRP) this.f45087c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f45085a;
        Object obj = this.d;
        Object obj2 = this.f45087c;
        Object obj3 = this.f45086b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                tn tnVar = (tn) obj;
                PhotoViewer photoViewer = ((or0) obj3).f41216b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.P).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j11 = topicKey.dialogId;
                    Bundle i14 = a4.w.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j11)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                    } else if (DialogObject.isUserDialog(j11)) {
                        i14.putLong("user_id", j11);
                    } else {
                        i14.putLong("chat_id", -j11);
                    }
                    tn tnVar2 = new tn(i14);
                    if (topicKey.topicId != 0) {
                        yf.d.a(tnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f35864y).q0(tnVar2, true, false)) {
                        tnVar2.Ab(arrayList2);
                    } else {
                        fyVar.finishFragment();
                    }
                } else {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        long j12 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
                        if (charSequence != null) {
                            j10 = j12;
                            SendMessagesHelper.getInstance(photoViewer.P).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        SendMessagesHelper.getInstance(photoViewer.P).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    fyVar.finishFragment();
                    if (tnVar != null) {
                        tnVar.Q7();
                        UndoView undoView = tnVar.f42989u3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                dz0 dz0Var = (dz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                fy fyVar2 = (fy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = dz0Var.f37655b;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new d9.a(dz0Var, j13, fyVar2, 10));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36129v0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new b9.d(dz0Var, j13, fyVar, user));
                    profileActivity.showDialog(c2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, final View view) {
        final c7 c7Var = (c7) this.f45086b;
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) this.f45087c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        q7 q7Var = c7Var.d;
        d7 d7Var = (d7) jl0Var.getAdapter();
        final k7 k7Var = (k7) d7Var.f37378e.get(i10);
        if (!(view instanceof i7) && !(view instanceof org.telegram.ui.Cells.p7)) {
            g7 g7Var = q7Var.v;
            if (g7Var != null) {
                g7Var.O0(k7Var.f39771c, k7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(q7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new lh.b0(c7Var, k7Var, d7Var, jl0Var, view, 4));
        } else if (((i7) view).f39137b.getChildAt(0) instanceof org.telegram.ui.Cells.f7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = c7Var2.f37009a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = c7Var3.f37009a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = c7Var2.f37009a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = c7Var3.f37009a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        kh.a aVar = k7Var.d;
        if (aVar.f13890b != 0 && aVar.f13894g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new c0(c7Var, k7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!q7Var.f41551f.f13902j.contains(k7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new nh.r7(14, c7Var, k7Var));
        c7Var.f37009a = org.telegram.ui.Components.c5.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f9, (int) f10);
        q7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        tn tnVar = (tn) this.f45086b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f45087c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !b31.Y().contains(str))) {
            h0Var.setOnClickListener(new lh.b0(tnVar, str, language, charSequence, h0Var, 6));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void r(float f9) {
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
