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
public final class vl0 implements org.telegram.ui.ActionBar.c2, zt, FileLoader.FileResolver, org.telegram.ui.Components.y4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0, lv0, MessagesStorage.BooleanCallback, k11, OnSuccessListener {
    public final int f39132a;
    public final Object f39133b;
    public final Object f39134c;

    public vl0(int i10, Object obj, Object obj2) {
        this.f39132a = i10;
        this.f39133b = obj;
        this.f39134c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f39132a) {
            case 8:
                mv0 mv0Var = ((ev0) this.f39133b).f33866a;
                mv0Var.f36232b0.a((TLRPC.TL_messageMediaToDo) this.f39134c);
                mv0Var.finishFragment();
                return;
            default:
                mv0 mv0Var2 = ((ev0) this.f39133b).f33866a;
                mv0Var2.f36232b0.a((TLRPC.TL_messageMediaPoll) this.f39134c);
                mv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void Y0(ut utVar) {
        fn0 fn0Var = (fn0) this.f39133b;
        int intValue = ((Integer) ((View) this.f39134c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = fn0Var.V[intValue];
        if (intValue == 5) {
            fn0Var.f34150s = utVar.d;
        } else {
            fn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.f38913a);
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        yd1 yd1Var = (yd1) this.f39133b;
        zn znVar = (zn) this.f39134c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = yd1Var.D.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        yd1Var.D.messageOwner.media = messageMedia;
        znVar.getSendMessagesHelper().editMessage(yd1Var.D, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f39133b, (Context) this.f39134c, view, i10, f10);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final tb1 tb1Var = (tb1) this.f39133b;
        final vb1 vb1Var = (vb1) this.f39134c;
        ThemeActivity themeActivity = tb1Var.e;
        if (i10 >= 0 && i10 < vb1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) vb1Var.e.get(i10);
            if (h6Var.f19736a >= 100 && !h6Var.f19757z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f19750r;
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
                        tb1 tb1Var2 = tb1.this;
                        ThemeActivity themeActivity2 = tb1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.z4.W(themeActivity2, i12, h6Var2.f19737b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f19750r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f19737b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f19737b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f19750r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.lq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new od1(h6Var2.f19737b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f19478a;
                                d2Var.O = string3;
                                d2Var.Q = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new f7(tb1Var2, vb1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.M = charSequenceArr;
                d2Var.N = iArr;
                d2Var.J = onClickListener;
                themeActivity.showDialog(d2Var);
                d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public File getFile() {
        switch (this.f39132a) {
            case 4:
                return FileLoader.getInstance(((PhotoViewer) this.f39133b).Q).getPathToAttach((TLObject) this.f39134c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f39133b).Q).getPathToMessage((TLRPC.Message) this.f39134c);
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z4;
        boolean z10;
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.f39132a) {
            case 0:
                int[] iArr = ((fn0) this.f39133b).f34162x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) this.f39134c).setText(LocaleController.getString(R.string.PassportNoExpireDate));
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
                ((h5.d) this.f39133b).accept(Boolean.TRUE);
                ((boolean[]) this.f39134c)[0] = true;
                d2Var.dismiss();
                return;
            case 2:
                fn0.U((fn0) this.f39133b, (TLRPC.TL_auth_passwordRecovery) this.f39134c);
                return;
            case 3:
                lo0 lo0Var = (lo0) this.f39133b;
                lo0Var.Y = true;
                lo0Var.X.email_unconfirmed_pattern = (String) this.f39134c;
                lo0Var.J0();
                return;
            case 6:
                PhotoViewer.C(((ds0) this.f39133b).f33528b, (ArrayList) this.f39134c);
                return;
            case 7:
                boolean[] zArr = (boolean[]) this.f39134c;
                PhotoViewer photoViewer = ((ds0) this.f39133b).f33528b;
                ou0 ou0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.X6;
                ArrayList arrayList3 = photoViewer.f31676a7;
                ArrayList arrayList4 = photoViewer.V6;
                ArrayList arrayList5 = photoViewer.f31686b7;
                ArrayList arrayList6 = photoViewer.f31695c7;
                if (!ou0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f19180id));
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31873w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.Q).changeChatAvatar(-photoViewer.f31873w5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.M4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19178id = photo.f19183id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31873w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.Q).clearUserPhoto(photoViewer.f31873w5, photo.f19183id);
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
                ((PrivacyControlActivity) this.f39133b).t0();
                ((SharedPreferences) this.f39134c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39133b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.W;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ub0(14, privacySettingsActivity, (org.telegram.ui.Cells.r8) this.f39134c));
                return;
            case 13:
                ProfileActivity.c0((ProfileActivity) this.f39133b, (org.telegram.ui.Cells.y1[]) this.f39134c);
                return;
            case 14:
                vz0 vz0Var = (vz0) this.f39133b;
                TLRPC.User user = (TLRPC.User) this.f39134c;
                vz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = vz0Var.f39224b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 17:
                i71 i71Var = (i71) this.f39133b;
                TLRPC.User user2 = (TLRPC.User) this.f39134c;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    i71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    f7 f7Var = new f7(i71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.W = 0;
                    twoStepVerificationActivity.Y = f7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                wa1.m((wa1) this.f39133b, (qy) this.f39134c);
                return;
            case 19:
                ThemeActivity.X((ThemeActivity) this.f39133b, (b11) this.f39134c);
                return;
            case 22:
                tb1 tb1Var = (tb1) this.f39133b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f39134c;
                tb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.B);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                messagesController.saveTheme(i6Var, null, z4, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f19782b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.t(org.telegram.ui.ActionBar.j6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.f19780a);
                    org.telegram.ui.ActionBar.c6 c6Var = i6Var.f19789f0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f19782b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z10) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) tb1Var.e).parentLayout;
                    ((ActionBarLayout) e5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 26:
                wg1.W((wg1) this.f39133b, (byte[]) this.f39134c);
                return;
            case 27:
                ii1 ii1Var = (ii1) this.f39133b;
                ii1Var.getClass();
                ((boolean[]) this.f39134c)[0] = true;
                ii1Var.m0 = 17;
                Intent intent = new Intent(ii1Var.f34947b, VoIPService.class);
                intent.putExtra("user_id", ii1Var.d.f19306id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ii1Var.f34944a);
                try {
                    ii1Var.f34947b.startService(intent);
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
        FileLog.d("wear-auth: /token delivered to " + ((String) ((c5.j) this.f39133b).f2154c));
        ((ph.d) this.f39134c).setLoading(false);
        zi1.d = null;
        org.telegram.ui.ActionBar.g3 g3Var = zi1.f40491c;
        if (g3Var != null) {
            g3Var.dismiss();
            zi1.f40491c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        tw0 tw0Var = (tw0) this.f39134c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((uw0) this.f39133b).d.f39214n;
        premiumPreviewFragment.f31939k0.d(0, 0.0f, 0, tw0Var.getMeasuredWidth(), -tw0Var.getTier().h, premiumPreviewFragment.L);
        return premiumPreviewFragment.f31939k0.f5446f;
    }

    @Override
    public void run(boolean z4) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39134c;
        sf1 sf1Var = ((cf1) this.f39133b).f33137b;
        NotificationCenter notificationCenter = sf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(sf1Var, i10);
        sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        sf1Var.finishFragment();
        sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f19159id), null, chat, Boolean.valueOf(z4));
    }

    @Override
    public void v(lk0 lk0Var) {
        yf1 yf1Var = ((vf1) this.f39133b).f39087a;
        yf1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f39134c).f19211id));
        yf1Var.V();
    }

    public vl0(ev0 ev0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f39132a = 9;
        this.f39133b = ev0Var;
        this.f39134c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f39133b;
        Runnable runnable = (Runnable) this.f39134c;
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
    public void b0() {
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
