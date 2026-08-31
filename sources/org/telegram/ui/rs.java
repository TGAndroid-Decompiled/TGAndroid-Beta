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
public final class rs implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0, jy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.cv0, org.telegram.ui.Components.ll0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f41045a;
    public final Object f41046b;
    public final Object f41047c;

    public rs(int i10, Object obj, Object obj2) {
        this.f41045a = i10;
        this.f41046b = obj;
        this.f41047c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f41045a) {
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
        LaunchActivity launchActivity = (LaunchActivity) this.f41046b;
        int[] iArr = (int[]) this.f41047c;
        Pattern pattern = LaunchActivity.f34134y1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        bd0 bd0Var = new bd0(2);
        bd0Var.u0(sharingLocationInfo.messageObject);
        bd0Var.C0 = new f3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 9);
        launchActivity.p0(bd0Var);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f41045a) {
            case 2:
                DataSettingsActivity.U((DataSettingsActivity) this.f41046b, (Context) this.f41047c, view, i10, f10);
                return;
            case 5:
                py.e0((py) this.f41046b, (oy) this.f41047c, view, i10);
                return;
            case 8:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f41046b, (Context) this.f41047c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f41046b, (Context) this.f41047c, view, i10, f10, f11);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        Bitmap g02;
        bd0 bd0Var = (bd0) this.f41046b;
        vc0 vc0Var = (vc0) this.f41047c;
        bd0Var.getClass();
        if (z4 && !z10 && vc0Var.f42203e != null && (g02 = bd0Var.g0(vc0Var)) != null) {
            vc0Var.f42203e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f(int i10, View view) {
        bd0 bd0Var = (bd0) this.f41046b;
        Context context = (Context) this.f41047c;
        if (bd0Var.D0 == 2) {
            Object J = bd0Var.Q.J(i10);
            if (J instanceof vc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, bd0Var.getParentActivity(), bd0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new hb0(1, bd0Var, (vc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                tc0 tc0Var = new tc0(bd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                bd0Var.F0 = tc0Var;
                tc0Var.setOutsideTouchable(true);
                bd0Var.F0.setClippingEnabled(true);
                bd0Var.F0.setInputMethodMode(2);
                bd0Var.F0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                bd0Var.F0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                bd0Var.F0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f41045a;
        org.telegram.ui.ActionBar.d2 d2Var2 = null;
        int i12 = 0;
        Object obj = this.f41047c;
        Object obj2 = this.f41046b;
        switch (i11) {
            case 0:
                ContactsActivity.X((ContactsActivity) obj2, (String) obj);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                at atVar = contactsActivity.T;
                if (atVar != null) {
                    atVar.b(user);
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
                if (!fn0Var.f36959s0) {
                    fn0Var.f36952p1.clear();
                }
                fn0Var.f36954q1.clear();
                im0 im0Var = (im0) fn0Var.f36975y1;
                im0Var.d.j1(fn0Var.B, fn0Var.C, fn0Var.D, zArr[0], null, null, im0Var.f37896b);
                fn0Var.finishFragment();
                return;
            case 3:
                lv.U((lv) obj2, (TLRPC.User) obj);
                return;
            case 4:
                ((py) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f20990id);
                return;
            case 7:
                pw pwVar = (pw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                pwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20966id = dialogFilter.f18055id;
                py pyVar = pwVar.f40168b;
                pyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                pyVar.getMessagesController().removeFilter(dialogFilter);
                pyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 9:
                a20 a20Var = (a20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = a20Var.f34996e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.f21241d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20966id = dialogFilter2.f18055id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ba(a20Var, d2Var2, dialogFilter2, 10));
                return;
            case 10:
                d60 d60Var = (d60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = d60Var.d;
                if (d60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.f20990id);
                        d60Var.X0.addKickedUser(user2.f20990id);
                        d60Var.k1().k(0L, 102, user2, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), user3);
                    d60Var.k1().k(0L, 32, user3, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), (TLRPC.User) null, chat, false, false);
                    d60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 11:
                z60 z60Var = (z60) obj2;
                z60Var.f43850x.h((TLRPC.User) obj);
                if (z60Var.f43833f.f26172r.length() > 0) {
                    z60Var.f43833f.f26172r.setText((CharSequence) null);
                    return;
                }
                return;
            case 12:
                z60 z60Var2 = (z60) obj2;
                z60Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                z60Var2.m0(i12);
                return;
            case 14:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 15:
                Pattern pattern = LaunchActivity.f34134y1;
                ((LaunchActivity) obj2).p0((og0) obj);
                return;
            case 16:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.f34134y1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.L);
                launchActivity.u0(true);
                return;
            case 24:
                ((ee0) obj2).B.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 25:
                ie0 ie0Var = (ie0) obj2;
                ie0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ie0Var.f37815r);
                bundle.putString("requestPhone", ie0Var.f37816s);
                bundle.putString("phoneHash", ie0Var.v);
                bundle.putString("phoneCode", ie0Var.f37817w);
                ie0Var.f37819y.u1(7, true, bundle, false);
                return;
            case 27:
                sf0.o((sf0) obj2, (Context) obj);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f41045a) {
            case 23:
                a8.e eVar = (a8.e) this.f41047c;
                og0 og0Var = ((zd0) this.f41046b).T;
                if (og0Var.getParentActivity() != null) {
                    og0Var.getParentActivity().startActivityForResult(eVar.f(), 200);
                    return;
                }
                return;
            default:
                a8.e eVar2 = (a8.e) this.f41047c;
                og0 og0Var2 = ((ef0) this.f41046b).B;
                if (og0Var2.getParentActivity() != null && !og0Var2.getParentActivity().isFinishing()) {
                    og0Var2.getParentActivity().startActivityForResult(eVar2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z4) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41046b;
        Intent intent = (Intent) this.f41047c;
        Pattern pattern = LaunchActivity.f34134y1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f41045a;
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        h80 h80Var = (h80) this.f41046b;
        py pyVar2 = (py) this.f41047c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = h80Var.f37365c0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        h80Var.f37363a0.saveKeepMediaExceptions(h80Var.W, h80Var.f37365c0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", h80Var.W);
        e80 e80Var = new e80(bundle, pyVar2);
        e80Var.d = h80Var.f37365c0;
        e80Var.U();
        h80Var.f37366d0.presentFragment(e80Var);
        AndroidUtilities.runOnUIThread(new v10(10, e80Var, keepMediaException), 150L);
        return true;
    }

    public rs(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f41045a = 1;
        this.f41046b = contactsActivity;
        this.f41047c = user;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
