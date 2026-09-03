package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ss implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.il0, ky, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.jl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f38302a;
    public final Object f38303b;
    public final Object f38304c;

    public ss(int i10, Object obj, Object obj2) {
        this.f38302a = i10;
        this.f38303b = obj;
        this.f38304c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(qy qyVar) {
        return false;
    }

    @Override
    public boolean Z0(View view) {
        switch (this.f38302a) {
            case 2:
                return false;
            case 5:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f38303b;
        int[] iArr = (int[]) this.f38304c;
        Pattern pattern = LaunchActivity.f31586y1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        cd0 cd0Var = new cd0(2);
        cd0Var.u0(sharingLocationInfo.messageObject);
        cd0Var.C0 = new f3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 9);
        launchActivity.p0(cd0Var);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f38302a) {
            case 2:
                DataSettingsActivity.U((DataSettingsActivity) this.f38303b, (Context) this.f38304c, view, i10, f10);
                return;
            case 5:
                qy.e0((qy) this.f38303b, (py) this.f38304c, view, i10);
                return;
            case 8:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f38303b, (Context) this.f38304c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f38303b, (Context) this.f38304c, view, i10, f10, f11);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        cd0 cd0Var = (cd0) this.f38303b;
        Context context = (Context) this.f38304c;
        if (cd0Var.D0 == 2) {
            Object J = cd0Var.Q.J(i10);
            if (J instanceof wc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, cd0Var.getParentActivity(), cd0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new ib0(1, cd0Var, (wc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                uc0 uc0Var = new uc0(cd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                cd0Var.F0 = uc0Var;
                uc0Var.setOutsideTouchable(true);
                cd0Var.F0.setClippingEnabled(true);
                cd0Var.F0.setInputMethodMode(2);
                cd0Var.F0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                cd0Var.F0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                cd0Var.F0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        Bitmap g02;
        cd0 cd0Var = (cd0) this.f38303b;
        wc0 wc0Var = (wc0) this.f38304c;
        cd0Var.getClass();
        if (z4 && !z10 && wc0Var.e != null && (g02 = cd0Var.g0(wc0Var)) != null) {
            wc0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f38302a;
        org.telegram.ui.ActionBar.d2 d2Var2 = null;
        int i12 = 0;
        Object obj = this.f38304c;
        Object obj2 = this.f38303b;
        switch (i11) {
            case 0:
                ContactsActivity.X((ContactsActivity) obj2, (String) obj);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                bt btVar = contactsActivity.T;
                if (btVar != null) {
                    btVar.b(user);
                    contactsActivity.T = null;
                    return;
                }
                return;
            case 2:
            case 5:
            case 6:
            case 8:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 26:
            default:
                fn0 fn0Var = (fn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!fn0Var.f34151s0) {
                    fn0Var.f34144p1.clear();
                }
                fn0Var.f34146q1.clear();
                im0 im0Var = (im0) fn0Var.f34167y1;
                im0Var.d.j1(fn0Var.B, fn0Var.C, fn0Var.D, zArr[0], null, null, im0Var.f35000b);
                fn0Var.finishFragment();
                return;
            case 3:
                mv.U((mv) obj2, (TLRPC.User) obj);
                return;
            case 4:
                ((qy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f19306id);
                return;
            case 7:
                qw qwVar = (qw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                qwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19282id = dialogFilter.f16649id;
                qy qyVar = qwVar.f37510b;
                qyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                qyVar.getMessagesController().removeFilter(dialogFilter);
                qyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 9:
                b20 b20Var = (b20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.f19565d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19282id = dialogFilter2.f16649id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new da(b20Var, d2Var2, dialogFilter2, 10));
                return;
            case 10:
                e60 e60Var = (e60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = e60Var.d;
                if (e60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.f19306id);
                        e60Var.X0.addKickedUser(user2.f19306id);
                        e60Var.k1().k(0L, 102, user2, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(e60Var.i1(), user3);
                    e60Var.k1().k(0L, 32, user3, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(e60Var.i1(), (TLRPC.User) null, chat, false, false);
                    e60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 11:
                a70 a70Var = (a70) obj2;
                a70Var.f32508x.h((TLRPC.User) obj);
                if (a70Var.f32491f.f24117r.length() > 0) {
                    a70Var.f32491f.f24117r.setText((CharSequence) null);
                    return;
                }
                return;
            case 12:
                a70 a70Var2 = (a70) obj2;
                a70Var2.getClass();
                org.telegram.ui.Cells.y1 y1Var = ((org.telegram.ui.Cells.y1[]) obj)[0];
                if (y1Var != null && y1Var.b()) {
                    i12 = 100;
                }
                a70Var2.m0(i12);
                return;
            case 14:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 15:
                Pattern pattern = LaunchActivity.f31586y1;
                ((LaunchActivity) obj2).p0((pg0) obj);
                return;
            case 16:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.f31586y1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.L);
                launchActivity.u0(true);
                return;
            case 24:
                ((fe0) obj2).B.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 25:
                je0 je0Var = (je0) obj2;
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", je0Var.f35257r);
                bundle.putString("requestPhone", je0Var.f35258s);
                bundle.putString("phoneHash", je0Var.v);
                bundle.putString("phoneCode", je0Var.f35259w);
                je0Var.f35261y.u1(7, true, bundle, false);
                return;
            case 27:
                tf0.o((tf0) obj2, (Context) obj);
                return;
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
        int i10 = this.f38302a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f38302a) {
            case 23:
                a8.e eVar = (a8.e) this.f38304c;
                pg0 pg0Var = ((ae0) this.f38303b).T;
                if (pg0Var.getParentActivity() != null) {
                    pg0Var.getParentActivity().startActivityForResult(eVar.f(), 200);
                    return;
                }
                return;
            default:
                a8.e eVar2 = (a8.e) this.f38304c;
                pg0 pg0Var2 = ((ff0) this.f38303b).B;
                if (pg0Var2.getParentActivity() != null && !pg0Var2.getParentActivity().isFinishing()) {
                    pg0Var2.getParentActivity().startActivityForResult(eVar2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z4) {
        LaunchActivity launchActivity = (LaunchActivity) this.f38303b;
        Intent intent = (Intent) this.f38304c;
        Pattern pattern = LaunchActivity.f31586y1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        i80 i80Var = (i80) this.f38303b;
        qy qyVar2 = (qy) this.f38304c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = i80Var.f34839c0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        i80Var.f34837a0.saveKeepMediaExceptions(i80Var.W, i80Var.f34839c0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", i80Var.W);
        f80 f80Var = new f80(bundle, qyVar2);
        f80Var.d = i80Var.f34839c0;
        f80Var.U();
        i80Var.f34840d0.presentFragment(f80Var);
        AndroidUtilities.runOnUIThread(new w10(10, f80Var, keepMediaException), 150L);
        return true;
    }

    public ss(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f38302a = 1;
        this.f38303b = contactsActivity;
        this.f38304c = user;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void f(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
