package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vl0 implements org.telegram.ui.ActionBar.c2, yt, FileLoader.FileResolver, org.telegram.ui.Components.y4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0, gv0, MessagesStorage.BooleanCallback, f11, OnSuccessListener {
    public final int f42252a;
    public final Object f42253b;
    public final Object f42254c;

    public vl0(int i10, Object obj, Object obj2) {
        this.f42252a = i10;
        this.f42253b = obj;
        this.f42254c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f42252a) {
            case 8:
                hv0 hv0Var = ((zu0) this.f42253b).f43999a;
                hv0Var.f37643b0.a((TLRPC.TL_messageMediaToDo) this.f42254c);
                hv0Var.finishFragment();
                return;
            default:
                hv0 hv0Var2 = ((zu0) this.f42253b).f43999a;
                hv0Var2.f37643b0.a((TLRPC.TL_messageMediaPoll) this.f42254c);
                hv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void V0(tt ttVar) {
        fn0 fn0Var = (fn0) this.f42253b;
        int intValue = ((Integer) ((View) this.f42254c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = fn0Var.V[intValue];
        if (intValue == 5) {
            fn0Var.f36958s = ttVar.d;
        } else {
            fn0Var.v = ttVar.d;
        }
        editTextBoldCursor.setText(ttVar.f41703a);
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        ud1 ud1Var = (ud1) this.f42253b;
        xn xnVar = (xn) this.f42254c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ud1Var.D.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ud1Var.D.messageOwner.media = messageMedia;
        xnVar.getSendMessagesHelper().editMessage(ud1Var.D, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f42253b, (Context) this.f42254c, view, i10, f10);
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        final mb1 mb1Var = (mb1) this.f42253b;
        final ob1 ob1Var = (ob1) this.f42254c;
        ThemeActivity themeActivity = mb1Var.f39073e;
        if (i10 >= 0 && i10 < ob1Var.f39715e.size()) {
            final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ob1Var.f39715e.get(i10);
            if (i6Var.f21467a >= 100 && !i6Var.f21489z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = i6Var.f21482r;
                if (tL_theme != null && tL_theme.creator) {
                    str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {string, string2, str, LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        mb1 mb1Var2 = mb1.this;
                        ThemeActivity themeActivity2 = mb1Var2.f39073e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.z4.W(themeActivity2, i12, i6Var2.f21468b, i6Var2);
                            } else if (i11 == 1) {
                                if (i6Var2.f21482r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(i6Var2.f21468b, i6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var2.f21468b, i6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + i6Var2.f21482r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.mq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new jd1(i6Var2.f21468b, i6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f21166a;
                                d2Var.O = string3;
                                d2Var.Q = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new d7(mb1Var2, ob1Var, i6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.M = charSequenceArr;
                d2Var.N = iArr;
                d2Var.J = onClickListener;
                themeActivity.showDialog(d2Var);
                d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public File getFile() {
        switch (this.f42252a) {
            case 4:
                return FileLoader.getInstance(((PhotoViewer) this.f42253b).Q).getPathToAttach((TLObject) this.f42254c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f42253b).Q).getPathToMessage((TLRPC.Message) this.f42254c);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z4;
        boolean z10;
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.f42252a) {
            case 0:
                int[] iArr = ((fn0) this.f42253b).f36970x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) this.f42254c).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                ((h5.d) this.f42253b).accept(Boolean.TRUE);
                ((boolean[]) this.f42254c)[0] = true;
                d2Var.dismiss();
                return;
            case 2:
                fn0.U((fn0) this.f42253b, (TLRPC.TL_auth_passwordRecovery) this.f42254c);
                return;
            case 3:
                lo0 lo0Var = (lo0) this.f42253b;
                lo0Var.Y = true;
                lo0Var.X.email_unconfirmed_pattern = (String) this.f42254c;
                lo0Var.J0();
                return;
            case 6:
                PhotoViewer.C(((yr0) this.f42253b).f43699b, (ArrayList) this.f42254c);
                return;
            case 7:
                boolean[] zArr = (boolean[]) this.f42254c;
                PhotoViewer photoViewer = ((yr0) this.f42253b).f43699b;
                ju0 ju0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.X6;
                ArrayList arrayList3 = photoViewer.f34227a7;
                ArrayList arrayList4 = photoViewer.V6;
                ArrayList arrayList5 = photoViewer.f34237b7;
                ArrayList arrayList6 = photoViewer.f34246c7;
                if (!ju0Var.M()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.M4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.M4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i12 = photoViewer.v;
                            if (i12 != 0) {
                                arrayList7.add(Integer.valueOf(i12));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.Q).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.M4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.M4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f20864id));
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f34425w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.Q).changeChatAvatar(-photoViewer.f34425w5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.M4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20862id = photo.f20867id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f34425w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.Q).clearUserPhoto(photoViewer.f34425w5, photo.f20867id);
                            arrayList2.remove(photoViewer.M4);
                            photoViewer.Z6.remove(photoViewer.M4);
                            photoViewer.Y6.remove(photoViewer.M4);
                            arrayList3.remove(photoViewer.M4);
                            arrayList6.remove(photoViewer.M4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i14 = photoViewer.M4;
                                if (i14 >= arrayList6.size()) {
                                    i14 = arrayList6.size() - 1;
                                }
                                photoViewer.M4 = -1;
                                photoViewer.B2(i14);
                            }
                            if (message == null) {
                                NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.M4);
                    photoViewer.d.B(photoViewer.M4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.G0(false, false);
                        return;
                    }
                    int i15 = photoViewer.M4;
                    if (i15 >= arrayList5.size()) {
                        i15 = arrayList5.size() - 1;
                    }
                    photoViewer.M4 = -1;
                    photoViewer.B2(i15);
                    return;
                } else {
                    return;
                }
            case 11:
                ((PrivacyControlActivity) this.f42253b).t0();
                ((SharedPreferences) this.f42254c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f42253b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.W;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new tb0(14, privacySettingsActivity, (org.telegram.ui.Cells.s8) this.f42254c));
                return;
            case 13:
                ProfileActivity.c0((ProfileActivity) this.f42253b, (org.telegram.ui.Cells.z1[]) this.f42254c);
                return;
            case 14:
                qz0 qz0Var = (qz0) this.f42253b;
                TLRPC.User user = (TLRPC.User) this.f42254c;
                qz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = qz0Var.f40724b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 17:
                c71 c71Var = (c71) this.f42253b;
                TLRPC.User user2 = (TLRPC.User) this.f42254c;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    c71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    d7 d7Var = new d7(c71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.W = 0;
                    twoStepVerificationActivity.Y = d7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                pa1.m((pa1) this.f42253b, (py) this.f42254c);
                return;
            case 19:
                ThemeActivity.X((ThemeActivity) this.f42253b, (w01) this.f42254c);
                return;
            case 22:
                mb1 mb1Var = (mb1) this.f42253b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f42254c;
                mb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(j6Var.B);
                if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                messagesController.saveTheme(j6Var, null, z4, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.f21505b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.t(org.telegram.ui.ActionBar.k6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.f21503a);
                    org.telegram.ui.ActionBar.d6 d6Var = j6Var.f21513f0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.f21505b).delete();
                    org.telegram.ui.ActionBar.k6.s1(true, false);
                }
                if (z10) {
                    f5Var = ((org.telegram.ui.ActionBar.p2) mb1Var.f39073e).parentLayout;
                    ((ActionBarLayout) f5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 26:
                qg1.W((qg1) this.f42253b, (byte[]) this.f42254c);
                return;
            case 27:
                ci1 ci1Var = (ci1) this.f42253b;
                ci1Var.getClass();
                ((boolean[]) this.f42254c)[0] = true;
                ci1Var.m0 = 17;
                Intent intent = new Intent(ci1Var.f35821b, VoIPService.class);
                intent.putExtra("user_id", ci1Var.d.f20990id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ci1Var.f35818a);
                try {
                    ci1Var.f35821b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((c5.j) this.f42253b).f2317c));
        ((qh.d) this.f42254c).setLoading(false);
        ui1.d = null;
        org.telegram.ui.ActionBar.h3 h3Var = ui1.f41950c;
        if (h3Var != null) {
            h3Var.dismiss();
            ui1.f41950c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        ow0 ow0Var = (ow0) this.f42254c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((pw0) this.f42253b).d.f40712n;
        premiumPreviewFragment.f34495k0.d(0, 0.0f, 0, ow0Var.getMeasuredWidth(), -ow0Var.getTier().h, premiumPreviewFragment.L);
        return premiumPreviewFragment.f34495k0.f6490f;
    }

    @Override
    public void run(boolean z4) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f42254c;
        mf1 mf1Var = ((we1) this.f42253b).f42454b;
        NotificationCenter notificationCenter = mf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(mf1Var, i10);
        mf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        mf1Var.finishFragment();
        mf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20843id), null, chat, Boolean.valueOf(z4));
    }

    @Override
    public void u(lk0 lk0Var) {
        sf1 sf1Var = ((pf1) this.f42253b).f40030a;
        sf1Var.f41280e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f42254c).f20895id));
        sf1Var.V();
    }

    public vl0(zu0 zu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f42252a = 9;
        this.f42253b = zu0Var;
        this.f42254c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f42253b;
        Runnable runnable = (Runnable) this.f42254c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void d0() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
