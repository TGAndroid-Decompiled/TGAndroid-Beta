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
public final class tl0 implements org.telegram.ui.ActionBar.c2, xt, FileLoader.FileResolver, org.telegram.ui.Components.y4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0, ev0, MessagesStorage.BooleanCallback, d11, OnSuccessListener {
    public final int f38686a;
    public final Object f38687b;
    public final Object f38688c;

    public tl0(int i10, Object obj, Object obj2) {
        this.f38686a = i10;
        this.f38687b = obj;
        this.f38688c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f38686a) {
            case 8:
                fv0 fv0Var = ((xu0) this.f38687b).f40312a;
                fv0Var.f34375b0.a((TLRPC.TL_messageMediaToDo) this.f38688c);
                fv0Var.finishFragment();
                return;
            default:
                fv0 fv0Var2 = ((xu0) this.f38687b).f40312a;
                fv0Var2.f34375b0.a((TLRPC.TL_messageMediaPoll) this.f38688c);
                fv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        rd1 rd1Var = (rd1) this.f38687b;
        xn xnVar = (xn) this.f38688c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = rd1Var.D.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        rd1Var.D.messageOwner.media = messageMedia;
        xnVar.getSendMessagesHelper().editMessage(rd1Var.D, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b1(st stVar) {
        dn0 dn0Var = (dn0) this.f38687b;
        int intValue = ((Integer) ((View) this.f38688c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = dn0Var.V[intValue];
        if (intValue == 5) {
            dn0Var.f33722s = stVar.d;
        } else {
            dn0Var.v = stVar.d;
        }
        editTextBoldCursor.setText(stVar.f38435a);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f38687b, (Context) this.f38688c, view, i10, f10);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        final lb1 lb1Var = (lb1) this.f38687b;
        final nb1 nb1Var = (nb1) this.f38688c;
        ThemeActivity themeActivity = lb1Var.e;
        if (i10 >= 0 && i10 < nb1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) nb1Var.e.get(i10);
            if (h6Var.f19761a >= 100 && !h6Var.f19782z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f19775r;
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
                        lb1 lb1Var2 = lb1.this;
                        ThemeActivity themeActivity2 = lb1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.z4.W(themeActivity2, i12, h6Var2.f19762b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f19775r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f19762b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f19762b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f19775r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.lq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new hd1(h6Var2.f19762b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f19503a;
                                d2Var.O = string3;
                                d2Var.Q = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new d7(lb1Var2, nb1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.M = charSequenceArr;
                d2Var.N = iArr;
                d2Var.J = onClickListener;
                themeActivity.showDialog(d2Var);
                d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public File getFile() {
        switch (this.f38686a) {
            case 4:
                return FileLoader.getInstance(((PhotoViewer) this.f38687b).Q).getPathToAttach((TLObject) this.f38688c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f38687b).Q).getPathToMessage((TLRPC.Message) this.f38688c);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z4;
        boolean z10;
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.f38686a) {
            case 0:
                int[] iArr = ((dn0) this.f38687b).f33734x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) this.f38688c).setText(LocaleController.getString(R.string.PassportNoExpireDate));
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
                ((h5.d) this.f38687b).accept(Boolean.TRUE);
                ((boolean[]) this.f38688c)[0] = true;
                d2Var.dismiss();
                return;
            case 2:
                dn0.U((dn0) this.f38687b, (TLRPC.TL_auth_passwordRecovery) this.f38688c);
                return;
            case 3:
                jo0 jo0Var = (jo0) this.f38687b;
                jo0Var.Y = true;
                jo0Var.X.email_unconfirmed_pattern = (String) this.f38688c;
                jo0Var.J0();
                return;
            case 6:
                PhotoViewer.C(((wr0) this.f38687b).f39788b, (ArrayList) this.f38688c);
                return;
            case 7:
                boolean[] zArr = (boolean[]) this.f38688c;
                PhotoViewer photoViewer = ((wr0) this.f38687b).f39788b;
                hu0 hu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.X6;
                ArrayList arrayList3 = photoViewer.f31702a7;
                ArrayList arrayList4 = photoViewer.V6;
                ArrayList arrayList5 = photoViewer.f31712b7;
                ArrayList arrayList6 = photoViewer.f31721c7;
                if (!hu0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f19205id));
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31899w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.Q).changeChatAvatar(-photoViewer.f31899w5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.M4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19203id = photo.f19208id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31899w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.Q).clearUserPhoto(photoViewer.f31899w5, photo.f19208id);
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
                ((PrivacyControlActivity) this.f38687b).t0();
                ((SharedPreferences) this.f38688c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f38687b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.W;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new sb0(14, privacySettingsActivity, (org.telegram.ui.Cells.s8) this.f38688c));
                return;
            case 13:
                ProfileActivity.c0((ProfileActivity) this.f38687b, (org.telegram.ui.Cells.z1[]) this.f38688c);
                return;
            case 14:
                oz0 oz0Var = (oz0) this.f38687b;
                TLRPC.User user = (TLRPC.User) this.f38688c;
                oz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = oz0Var.f37135b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 17:
                b71 b71Var = (b71) this.f38687b;
                TLRPC.User user2 = (TLRPC.User) this.f38688c;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    b71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    d7 d7Var = new d7(b71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.W = 0;
                    twoStepVerificationActivity.Y = d7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                oa1.m((oa1) this.f38687b, (oy) this.f38688c);
                return;
            case 19:
                ThemeActivity.X((ThemeActivity) this.f38687b, (l01) this.f38688c);
                return;
            case 22:
                lb1 lb1Var = (lb1) this.f38687b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f38688c;
                lb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.B);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                messagesController.saveTheme(i6Var, null, z4, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f19807b == null) {
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
                    hashMap.remove(i6Var.f19805a);
                    org.telegram.ui.ActionBar.c6 c6Var = i6Var.f19814f0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f19807b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z10) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) lb1Var.e).parentLayout;
                    ((ActionBarLayout) e5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 26:
                og1.W((og1) this.f38687b, (byte[]) this.f38688c);
                return;
            case 27:
                ai1 ai1Var = (ai1) this.f38687b;
                ai1Var.getClass();
                ((boolean[]) this.f38688c)[0] = true;
                ai1Var.m0 = 17;
                Intent intent = new Intent(ai1Var.f32601b, VoIPService.class);
                intent.putExtra("user_id", ai1Var.d.f19331id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ai1Var.f32598a);
                try {
                    ai1Var.f32601b.startService(intent);
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
        FileLog.d("wear-auth: /token delivered to " + ((String) ((c5.j) this.f38687b).f2131c));
        ((ph.d) this.f38688c).setLoading(false);
        ri1.d = null;
        org.telegram.ui.ActionBar.g3 g3Var = ri1.f38063c;
        if (g3Var != null) {
            g3Var.dismiss();
            ri1.f38063c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        mw0 mw0Var = (mw0) this.f38688c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((nw0) this.f38687b).d.f36994n;
        premiumPreviewFragment.f31965k0.d(0, 0.0f, 0, mw0Var.getMeasuredWidth(), -mw0Var.getTier().h, premiumPreviewFragment.L);
        return premiumPreviewFragment.f31965k0.f5457f;
    }

    @Override
    public void run(boolean z4) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f38688c;
        kf1 kf1Var = ((ue1) this.f38687b).f38924b;
        NotificationCenter notificationCenter = kf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(kf1Var, i10);
        kf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        kf1Var.finishFragment();
        kf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f19184id), null, chat, Boolean.valueOf(z4));
    }

    @Override
    public void v(jk0 jk0Var) {
        qf1 qf1Var = ((nf1) this.f38687b).f36618a;
        qf1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f38688c).f19236id));
        qf1Var.V();
    }

    public tl0(xu0 xu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f38686a = 9;
        this.f38687b = xu0Var;
        this.f38688c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f38687b;
        Runnable runnable = (Runnable) this.f38688c;
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
    public void o0(View view, float f10, float f11) {
    }
}
