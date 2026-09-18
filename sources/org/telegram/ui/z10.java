package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z10 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.a2, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.nv0, org.telegram.ui.Components.ml0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, zt, FileLoader.FileResolver {
    public final int f39946a;
    public final Object f39947b;
    public final Object f39948c;

    public z10(int i10, Object obj, Object obj2) {
        this.f39946a = i10;
        this.f39947b = obj;
        this.f39948c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a1(vt vtVar) {
        pn0 pn0Var = (pn0) this.f39947b;
        int intValue = ((Integer) ((View) this.f39948c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = pn0Var.Y[intValue];
        if (intValue == 5) {
            pn0Var.f36561s = vtVar.d;
        } else {
            pn0Var.v = vtVar.d;
        }
        editTextBoldCursor.setText(vtVar.f38617a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39947b;
        int[] iArr = (int[]) this.f39948c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        jd0 jd0Var = new jd0(2);
        jd0Var.u0(sharingLocationInfo.messageObject);
        jd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(jd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f39946a) {
            case 0:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f39947b, (Context) this.f39948c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f39947b, (Context) this.f39948c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        jd0 jd0Var = (jd0) this.f39947b;
        Context context = (Context) this.f39948c;
        if (jd0Var.G0 == 2) {
            Object J = jd0Var.T.J(i10);
            if (J instanceof dd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, jd0Var.getParentActivity(), jd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new tv(16, jd0Var, (dd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                bd0 bd0Var = new bd0(jd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                jd0Var.I0 = bd0Var;
                bd0Var.setOutsideTouchable(true);
                jd0Var.I0.setClippingEnabled(true);
                jd0Var.I0.setInputMethodMode(2);
                jd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                jd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                jd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39946a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        jd0 jd0Var = (jd0) this.f39947b;
        dd0 dd0Var = (dd0) this.f39948c;
        jd0Var.getClass();
        if (z10 && !z11 && dd0Var.e != null && (g02 = jd0Var.g0(dd0Var)) != null) {
            dd0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.f39946a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f39948c;
        Object obj2 = this.f39947b;
        switch (i11) {
            case 1:
                e20 e20Var = (e20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f18658g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18419id = dialogFilter.f15790id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ba(e20Var, b2Var2, dialogFilter, 10));
                return;
            case 2:
                i60 i60Var = (i60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = i60Var.d;
                if (i60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18443id);
                        i60Var.f34329a1.addKickedUser(user.f18443id);
                        i60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), user2);
                    i60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), (TLRPC.User) null, chat, false, false);
                    i60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 3:
                e70 e70Var = (e70) obj2;
                e70Var.f33218x.g((TLRPC.User) obj);
                if (e70Var.f33198f.f22787r.length() > 0) {
                    e70Var.f33198f.f22787r.setText((CharSequence) null);
                    return;
                }
                return;
            case 4:
                e70 e70Var2 = (e70) obj2;
                e70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                e70Var2.m0(i12);
                return;
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 20:
            case 23:
            case 26:
            case 27:
            default:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ss0) obj2).f37466b;
                bv0 bv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f31150a7;
                ArrayList arrayList3 = photoViewer.f31179d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!bv0Var.M()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.v;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                arrayList = arrayList8;
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f18317id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31373z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f31373z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18315id = photo.f18320id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31373z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f31373z5, photo.f18320id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f31170c7.remove(photoViewer.P4);
                            photoViewer.f31160b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i16 = photoViewer.P4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.A2(i16);
                            }
                            if (message == null) {
                                NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.G0(false, false);
                        return;
                    }
                    int i17 = photoViewer.P4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.A2(i17);
                    return;
                } else {
                    return;
                }
            case 6:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((xg0) obj);
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 16:
                ((ne0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 17:
                qe0 qe0Var = (qe0) obj2;
                qe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", qe0Var.f36804r);
                bundle.putString("requestPhone", qe0Var.f36805s);
                bundle.putString("phoneHash", qe0Var.v);
                bundle.putString("phoneCode", qe0Var.f36806w);
                qe0Var.f36808y.u1(7, true, bundle, false);
                return;
            case 19:
                ag0.o((ag0) obj2, (Context) obj);
                return;
            case 21:
                pn0 pn0Var = (pn0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!pn0Var.f36568v0) {
                    pn0Var.f36563s1.clear();
                }
                pn0Var.f36565t1.clear();
                sm0 sm0Var = (sm0) pn0Var.B1;
                sm0Var.d.j1(pn0Var.E, pn0Var.F, pn0Var.G, zArr2[0], null, null, sm0Var.f37373b);
                pn0Var.finishFragment();
                return;
            case 22:
                int[] iArr = ((pn0) obj2).f36573x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 24:
                pn0.U((pn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 25:
                xo0 xo0Var = (xo0) obj2;
                xo0Var.f39542b0 = true;
                xo0Var.f39539a0.email_unconfirmed_pattern = (String) obj;
                xo0Var.J0();
                return;
            case 28:
                PhotoViewer.B(((ss0) obj2).f37466b, (ArrayList) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f39946a) {
            case 26:
                return FileLoader.getInstance(((PhotoViewer) this.f39947b).T).getPathToAttach((TLObject) this.f39948c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f39947b).T).getPathToMessage((TLRPC.Message) this.f39948c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f39946a) {
            case 15:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f39948c;
                xg0 xg0Var = ((he0) this.f39947b).W;
                if (xg0Var.getParentActivity() != null) {
                    xg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f39948c;
                xg0 xg0Var2 = ((mf0) this.f39947b).E;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing()) {
                    xg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39947b;
        Intent intent = (Intent) this.f39948c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39946a;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
        p80 p80Var = (p80) this.f39947b;
        uy uyVar2 = (uy) this.f39948c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f36381f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.f36379d0.saveKeepMediaExceptions(p80Var.f36378c0, p80Var.f36381f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", p80Var.f36378c0);
        m80 m80Var = new m80(bundle, uyVar2);
        m80Var.d = p80Var.f36381f0;
        m80Var.U();
        p80Var.f36382g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new cu(27, m80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
