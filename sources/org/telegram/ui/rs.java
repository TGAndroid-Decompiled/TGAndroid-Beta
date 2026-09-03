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
public final class rs implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.jl0, jy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.kl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f40931a;
    public final Object f40932b;
    public final Object f40933c;

    public rs(int i10, Object obj, Object obj2) {
        this.f40931a = i10;
        this.f40932b = obj;
        this.f40933c = obj2;
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
        switch (this.f40931a) {
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
        LaunchActivity launchActivity = (LaunchActivity) this.f40932b;
        int[] iArr = (int[]) this.f40933c;
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
        switch (this.f40931a) {
            case 2:
                DataSettingsActivity.U((DataSettingsActivity) this.f40932b, (Context) this.f40933c, view, i10, f10);
                return;
            case 5:
                py.e0((py) this.f40932b, (oy) this.f40933c, view, i10);
                return;
            case 8:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f40932b, (Context) this.f40933c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f40932b, (Context) this.f40933c, view, i10, f10, f11);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        Bitmap g02;
        bd0 bd0Var = (bd0) this.f40932b;
        vc0 vc0Var = (vc0) this.f40933c;
        bd0Var.getClass();
        if (z4 && !z10 && vc0Var.f42086e != null && (g02 = bd0Var.g0(vc0Var)) != null) {
            vc0Var.f42086e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f(int i10, View view) {
        bd0 bd0Var = (bd0) this.f40932b;
        Context context = (Context) this.f40933c;
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
        int i11 = this.f40931a;
        org.telegram.ui.ActionBar.d2 d2Var2 = null;
        int i12 = 0;
        Object obj = this.f40933c;
        Object obj2 = this.f40932b;
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
                if (!fn0Var.f36862s0) {
                    fn0Var.f36855p1.clear();
                }
                fn0Var.f36857q1.clear();
                im0 im0Var = (im0) fn0Var.f36878y1;
                im0Var.d.j1(fn0Var.B, fn0Var.C, fn0Var.D, zArr[0], null, null, im0Var.f37745b);
                fn0Var.finishFragment();
                return;
            case 3:
                lv.U((lv) obj2, (TLRPC.User) obj);
                return;
            case 4:
                ((py) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f20992id);
                return;
            case 7:
                pw pwVar = (pw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                pwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20968id = dialogFilter.f18057id;
                py pyVar = pwVar.f40138b;
                pyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                pyVar.getMessagesController().removeFilter(dialogFilter);
                pyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 9:
                a20 a20Var = (a20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = a20Var.f35001e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.f21243d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20968id = dialogFilter2.f18057id;
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
                        conferenceCall.kick(user2.f20992id);
                        d60Var.X0.addKickedUser(user2.f20992id);
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
                z60Var.f43837x.h((TLRPC.User) obj);
                if (z60Var.f43820f.f26132r.length() > 0) {
                    z60Var.f43820f.f26132r.setText((CharSequence) null);
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
                he0 he0Var = (he0) obj2;
                he0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", he0Var.f37349r);
                bundle.putString("requestPhone", he0Var.f37350s);
                bundle.putString("phoneHash", he0Var.v);
                bundle.putString("phoneCode", he0Var.f37351w);
                he0Var.f37353y.u1(7, true, bundle, false);
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
        switch (this.f40931a) {
            case 23:
                a8.e eVar = (a8.e) this.f40933c;
                og0 og0Var = ((zd0) this.f40932b).T;
                if (og0Var.getParentActivity() != null) {
                    og0Var.getParentActivity().startActivityForResult(eVar.f(), 200);
                    return;
                }
                return;
            default:
                a8.e eVar2 = (a8.e) this.f40933c;
                og0 og0Var2 = ((ef0) this.f40932b).B;
                if (og0Var2.getParentActivity() != null && !og0Var2.getParentActivity().isFinishing()) {
                    og0Var2.getParentActivity().startActivityForResult(eVar2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z4) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40932b;
        Intent intent = (Intent) this.f40933c;
        Pattern pattern = LaunchActivity.f34134y1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f40931a;
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        h80 h80Var = (h80) this.f40932b;
        py pyVar2 = (py) this.f40933c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = h80Var.f37263c0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        h80Var.f37261a0.saveKeepMediaExceptions(h80Var.W, h80Var.f37263c0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", h80Var.W);
        e80 e80Var = new e80(bundle, pyVar2);
        e80Var.d = h80Var.f37263c0;
        e80Var.U();
        h80Var.f37264d0.presentFragment(e80Var);
        AndroidUtilities.runOnUIThread(new z10(9, e80Var, keepMediaException), 150L);
        return true;
    }

    public rs(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f40931a = 1;
        this.f40932b = contactsActivity;
        this.f40933c = user;
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
