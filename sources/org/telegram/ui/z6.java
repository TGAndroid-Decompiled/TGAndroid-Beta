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
public final class z6 implements org.telegram.ui.Components.im0, org.telegram.ui.Components.tk0, org.telegram.ui.Components.f5, LanguageDetector.StringCallback, u4, org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, org.telegram.ui.Components.gm0, MessagesController.NewMessageCallback, my, ug1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final int f44623a;
    public final Object f44624b;
    public final Object f44625c;
    public final Object d;

    public z6(Object obj, Object obj2, Object obj3, int i10) {
        this.f44623a = i10;
        this.f44624b = obj;
        this.f44625c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        switch (this.f44623a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f44623a) {
            case 2:
                zn znVar = (zn) this.f44624b;
                znVar.getClass();
                znVar.gb((TLRPC.BotInlineResult) this.f44625c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                zn znVar2 = (zn) this.f44624b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f44625c;
                MessageObject messageObject = (MessageObject) this.d;
                znVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(zf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        znVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                zn.M0((zn) this.f44624b, (MessageObject.GroupedMessages) this.f44625c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(sy syVar) {
        switch (this.f44623a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(org.telegram.ui.Components.vk0 vk0Var, int i10) {
        int i11;
        View view = (View) this.f44624b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44625c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(vk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.q.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(c5 c5Var) {
        switch (this.f44623a) {
            case 6:
                ln lnVar = (ln) this.f44624b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f44625c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                lnVar.f39735a.ra(user);
                                return;
                            }
                            return;
                        }
                        lnVar.b(user);
                        return;
                    }
                    lnVar.q(u1Var, user);
                    return;
                }
                lnVar.x(user, false);
                return;
            default:
                ln lnVar2 = (ln) this.f44624b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44625c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                lnVar2.f39735a.pa(chat);
                                return;
                            }
                            return;
                        }
                        lnVar2.a(chat);
                        return;
                    }
                    lnVar2.m(u1Var2, chat, 0, false);
                    return;
                }
                lnVar2.v(chat);
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g60.p((g60) this.f44624b, (Activity) this.f44625c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t71) this.f44624b).U((TLRPC.User) this.f44625c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f44623a;
        Object obj = this.d;
        Object obj2 = this.f44625c;
        Object obj3 = this.f44624b;
        switch (i12) {
            case 8:
                fp fpVar = (fp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                ip ipVar = fpVar.f37762a.Y2;
                if (tL_username.editable) {
                    if (ipVar.f38794s0 == null) {
                        ipVar.f38794s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = ipVar.X;
                    tL_inputChannel.channel_id = chat.f20068id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    ipVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.s1(fpVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    ipVar.P.add(tL_username.username);
                    ((na) view).setLoading(true);
                }
                ipVar.V();
                return;
            case 9:
                up upVar = (up) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                upVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    upVar.getMessagesController().toggleChannelInvitesHistory(chat2.f20068id, false);
                }
                upVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                gc1 gc1Var = (gc1) obj3;
                if (org.telegram.ui.ActionBar.h6.k0(((ic1) obj2).d, (org.telegram.ui.ActionBar.f6) obj, true)) {
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (gc1Var.f38045e.f34600f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.h6.I, Boolean.valueOf(z10), null, -1);
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
                dataSettingsActivity.n0(dataSettingsActivity.f33805n);
                ImageLoader.getInstance().checkMediaPaths(new hu(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f20404a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f20404a.L0.run();
                b00 b00Var = ((zz) obj3).E.f35861c;
                b00Var.d.title = editTextBoldCursor.getText().toString();
                b00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = b00Var.d;
                if (b00Var.F != 0) {
                    b00Var.getConnectionsManager().cancelRequest(b00Var.F, true);
                    b00Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = b00Var.f36253c.f17287id;
                tL_chatlists_editExportedInvite.slug = b00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                b00Var.F = b00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new pz(b00Var, 0));
                Utilities.Callback callback = b00Var.f36261y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((j50) obj3).f38874b.f37903a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f20404a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                q81 q81Var = (q81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.m2) q81Var.f41101a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new zb0(20, q81Var, tL_authorization));
                ((e81) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        String string;
        ui1 ui1Var = (ui1) this.f44624b;
        VoIPService voIPService = (VoIPService) this.f44625c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
            ui1Var.R0 = false;
            if (ui1Var.f42653w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                k3Var.announceForAccessibility(string);
            }
            l3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        uo0 uo0Var = (uo0) this.f44624b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.f44625c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == uo0Var.f42748l0.f20215id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.po0(uo0Var, b5Var, activity, message, 26));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        ci.u5 u5Var = (ci.u5) this.f44624b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) u5Var.f6066c));
        ((ci.d) this.f44625c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) u5Var.f6067e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    d6Var = U.getResourceProvider();
                } else {
                    d6Var = null;
                }
                org.telegram.ui.ActionBar.e3 e3Var = lj1.f39726c;
                if (e3Var != null) {
                    e3Var.dismiss();
                    lj1.f39726c = null;
                }
                org.telegram.ui.ActionBar.e3 i11 = org.telegram.messenger.ai.i(1, context, d6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                i11.customView = frameLayout;
                LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
                frameLayout.addView(e7, w7.x5.e(-1, -1, 119));
                TextView b10 = w7.b6.b(context, 20.0f, org.telegram.ui.ActionBar.h6.f20930j5, true, d6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                e7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i12));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                    if (i12 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.x5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                e7.addView(linearLayout, w7.x5.t(-2, -2, 49, 32, 12, 32, 12));
                ci.d f10 = org.telegram.messenger.ai.f(24, context, d6Var, true);
                f10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                e7.addView(f10, w7.x5.t(-1, 48, 7, 12, 12, 12, 8));
                int i13 = org.telegram.ui.ActionBar.h6.f20766a7;
                i11.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                i11.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                lj1.f39726c = i11;
                i11.show();
                f10.setOnClickListener(new org.telegram.ui.Cells.sa(f10, i10, i11, 18));
            }
        }
    }

    @Override
    public void run(long j3) {
        nq.a0((nq) this.f44624b, (TLRPC.InputCheckPasswordSRP) this.f44625c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f44623a;
        Object obj = this.d;
        Object obj2 = this.f44625c;
        Object obj3 = this.f44624b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                zn znVar = (zn) obj;
                PhotoViewer photoViewer = ((rs0) obj3).f41542b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.T).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j10 = topicKey.dialogId;
                    Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                    } else if (DialogObject.isUserDialog(j10)) {
                        i14.putLong("user_id", j10);
                    } else {
                        i14.putLong("chat_id", -j10);
                    }
                    zn znVar2 = new zn(i14);
                    if (topicKey.topicId != 0) {
                        ng.d.a(znVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f34144y).q0(znVar2, true, false)) {
                        znVar2.Eb(arrayList2);
                    } else {
                        syVar.finishFragment();
                    }
                } else {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
                        if (charSequence != null) {
                            j3 = j11;
                            SendMessagesHelper.getInstance(photoViewer.T).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.T).sendMessage(arrayList2, j3, false, false, true, 0, 0L);
                    }
                    syVar.finishFragment();
                    if (znVar != null) {
                        znVar.T7();
                        UndoView undoView = znVar.y3;
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
                f01 f01Var = (f01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                sy syVar2 = (sy) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = f01Var.f37533b;
                i12 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ci.q9(f01Var, j12, syVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34448z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                    a2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ci.y6(f01Var, j12, syVar, user));
                    profileActivity.showDialog(a2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, final View view) {
        final c7 c7Var = (c7) this.f44624b;
        org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) this.f44625c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        q7 q7Var = c7Var.d;
        d7 d7Var = (d7) rm0Var.getAdapter();
        final k7 k7Var = (k7) d7Var.f36962e.get(i10);
        if (!(view instanceof i7) && !(view instanceof org.telegram.ui.Cells.t7)) {
            g7 g7Var = q7Var.v;
            if (g7Var != null) {
                g7Var.y0(k7Var.f39250c, k7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(q7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ai.s0(c7Var, k7Var, d7Var, rm0Var, view, 5));
        } else if (((i7) view).f38632b.getChildAt(0) instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = c7Var2.f36615a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = c7Var3.f36615a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            q7.b(c7Var2.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = c7Var2.f36615a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            q7.b(c7Var3.d, k7Var.d, (i7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = c7Var3.f36615a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        zh.a aVar = k7Var.d;
        if (aVar.f54816b != 0 && aVar.f54820g != 0) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(c7Var, k7Var, m2Var, 1));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!q7Var.f41090f.f54828j.contains(k7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ai.f2(26, c7Var, k7Var));
        c7Var.f36615a = org.telegram.ui.Components.g5.P(m2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        q7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        zn znVar = (zn) this.f44624b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f44625c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !e41.Y().contains(str))) {
            h0Var.setOnClickListener(new ai.s0(znVar, str, language, charSequence, h0Var, 7));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
