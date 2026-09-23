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
public final class w10 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2, ly, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.cl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, wt, FileLoader.FileResolver {
    public final int f38508a;
    public final Object f38509b;
    public final Object f38510c;

    public w10(int i10, Object obj, Object obj2) {
        this.f38508a = i10;
        this.f38509b = obj;
        this.f38510c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void a1(st stVar) {
        in0 in0Var = (in0) this.f38509b;
        int intValue = ((Integer) ((View) this.f38510c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = in0Var.Y[intValue];
        if (intValue == 5) {
            in0Var.f34202s = stVar.d;
        } else {
            in0Var.v = stVar.d;
        }
        editTextBoldCursor.setText(stVar.f37415a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f38509b;
        int[] iArr = (int[]) this.f38510c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        dd0 dd0Var = new dd0(2);
        dd0Var.u0(sharingLocationInfo.messageObject);
        dd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(dd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f38508a) {
            case 0:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f38509b, (Context) this.f38510c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f38509b, (Context) this.f38510c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        dd0 dd0Var = (dd0) this.f38509b;
        Context context = (Context) this.f38510c;
        if (dd0Var.G0 == 2) {
            Object J = dd0Var.T.J(i10);
            if (J instanceof xc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, dd0Var.getParentActivity(), dd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new pv(16, dd0Var, (xc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                vc0 vc0Var = new vc0(dd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                dd0Var.I0 = vc0Var;
                vc0Var.setOutsideTouchable(true);
                dd0Var.I0.setClippingEnabled(true);
                dd0Var.I0.setInputMethodMode(2);
                dd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                dd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                dd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f38508a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        dd0 dd0Var = (dd0) this.f38509b;
        xc0 xc0Var = (xc0) this.f38510c;
        dd0Var.getClass();
        if (z10 && !z11 && xc0Var.e != null && (g02 = dd0Var.g0(xc0Var)) != null) {
            xc0Var.e.setIcon(g02);
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
        int i11 = this.f38508a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f38510c;
        Object obj2 = this.f38509b;
        switch (i11) {
            case 1:
                b20 b20Var = (b20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f18459g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18206id = dialogFilter.f15577id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new aa(b20Var, b2Var2, dialogFilter, 10));
                return;
            case 2:
                f60 f60Var = (f60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = f60Var.d;
                if (f60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18230id);
                        f60Var.f33099a1.addKickedUser(user.f18230id);
                        f60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(f60Var.i1(), user2);
                    f60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(f60Var.i1(), (TLRPC.User) null, chat, false, false);
                    f60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 3:
                b70 b70Var = (b70) obj2;
                b70Var.f32011x.i((TLRPC.User) obj);
                if (b70Var.f31991f.f22890r.length() > 0) {
                    b70Var.f31991f.f22890r.setText((CharSequence) null);
                    return;
                }
                return;
            case 4:
                b70 b70Var2 = (b70) obj2;
                b70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                b70Var2.m0(i12);
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
                PhotoViewer photoViewer = ((ls0) obj2).f35085b;
                uu0 uu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f30877a7;
                ArrayList arrayList3 = photoViewer.f30906d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!uu0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f18104id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31100z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f31100z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18102id = photo.f18107id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31100z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f31100z5, photo.f18107id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f30897c7.remove(photoViewer.P4);
                            photoViewer.f30887b7.remove(photoViewer.P4);
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
                ((LaunchActivity) obj2).p0((rg0) obj);
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 16:
                ((he0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 17:
                ke0 ke0Var = (ke0) obj2;
                ke0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ke0Var.f34693r);
                bundle.putString("requestPhone", ke0Var.f34694s);
                bundle.putString("phoneHash", ke0Var.v);
                bundle.putString("phoneCode", ke0Var.f34695w);
                ke0Var.f34697y.u1(7, true, bundle, false);
                return;
            case 19:
                uf0.o((uf0) obj2, (Context) obj);
                return;
            case 21:
                in0 in0Var = (in0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!in0Var.f34209v0) {
                    in0Var.f34204s1.clear();
                }
                in0Var.f34206t1.clear();
                lm0 lm0Var = (lm0) in0Var.B1;
                lm0Var.d.j1(in0Var.E, in0Var.F, in0Var.G, zArr2[0], null, null, lm0Var.f35024b);
                in0Var.finishFragment();
                return;
            case 22:
                int[] iArr = ((in0) obj2).f34214x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 24:
                in0.U((in0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 25:
                qo0 qo0Var = (qo0) obj2;
                qo0Var.f36487b0 = true;
                qo0Var.f36484a0.email_unconfirmed_pattern = (String) obj;
                qo0Var.J0();
                return;
            case 28:
                PhotoViewer.B(((ls0) obj2).f35085b, (ArrayList) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f38508a) {
            case 26:
                return FileLoader.getInstance(((PhotoViewer) this.f38509b).T).getPathToAttach((TLObject) this.f38510c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f38509b).T).getPathToMessage((TLRPC.Message) this.f38510c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f38508a) {
            case 15:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f38510c;
                rg0 rg0Var = ((be0) this.f38509b).W;
                if (rg0Var.getParentActivity() != null) {
                    rg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f38510c;
                rg0 rg0Var2 = ((gf0) this.f38509b).E;
                if (rg0Var2.getParentActivity() != null && !rg0Var2.getParentActivity().isFinishing()) {
                    rg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f38509b;
        Intent intent = (Intent) this.f38510c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f38508a;
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        m80 m80Var = (m80) this.f38509b;
        ry ryVar2 = (ry) this.f38510c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = m80Var.f35178f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        m80Var.f35176d0.saveKeepMediaExceptions(m80Var.f35175c0, m80Var.f35178f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", m80Var.f35175c0);
        j80 j80Var = new j80(bundle, ryVar2);
        j80Var.d = m80Var.f35178f0;
        j80Var.U();
        m80Var.f35179g0.presentFragment(j80Var);
        AndroidUtilities.runOnUIThread(new hw(23, j80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
