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
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xu implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, vx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.wv0, org.telegram.ui.Components.yl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, nt {
    public final int f43262a;
    public final Object f43263b;
    public final Object f43264c;

    public xu(int i10, Object obj, Object obj2) {
        this.f43262a = i10;
        this.f43264c = obj;
        this.f43263b = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public void L0(ht htVar) {
        vm0 vm0Var = (vm0) this.f43264c;
        int intValue = ((Integer) ((View) this.f43263b).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = vm0Var.Y[intValue];
        if (intValue == 5) {
            vm0Var.f42314s = htVar.d;
        } else {
            vm0Var.v = htVar.d;
        }
        editTextBoldCursor.setText(htVar.f37806a);
    }

    @Override
    public boolean P0(View view) {
        switch (this.f43262a) {
            case 2:
                return false;
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        nc0 nc0Var = (nc0) this.f43264c;
        Context context = (Context) this.f43263b;
        if (nc0Var.G0 == 2) {
            Object J = nc0Var.T.J(i10);
            if (J instanceof hc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, nc0Var.getParentActivity(), nc0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new org.telegram.ui.Components.h51(26, nc0Var, (hc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                fc0 fc0Var = new fc0(nc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                nc0Var.I0 = fc0Var;
                fc0Var.setOutsideTouchable(true);
                nc0Var.I0.setClippingEnabled(true);
                nc0Var.I0.setInputMethodMode(2);
                nc0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                nc0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                nc0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f43262a;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f43264c;
        int[] iArr = (int[]) this.f43263b;
        Pattern pattern = LaunchActivity.C1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.O0(i10);
        nc0 nc0Var = new nc0(2);
        nc0Var.t0(sharingLocationInfo.messageObject);
        nc0Var.F0 = new ci.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.t0(nc0Var);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f43262a) {
            case 2:
                cy.f0((cy) this.f43264c, (ay) this.f43263b, view, i10);
                return;
            case 5:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f43264c, (Context) this.f43263b, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f43264c, (Context) this.f43263b, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        nc0 nc0Var = (nc0) this.f43264c;
        hc0 hc0Var = (hc0) this.f43263b;
        nc0Var.getClass();
        if (z10 && !z11 && hc0Var.e != null && (f02 = nc0Var.f0(hc0Var)) != null) {
            hc0Var.e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f43262a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f43263b;
        Object obj2 = this.f43264c;
        switch (i11) {
            case 0:
                av.U((av) obj2, (TLRPC.User) obj);
                return;
            case 1:
                ((cy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f20422id);
                return;
            case 2:
            case 3:
            case 5:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            case 25:
            default:
                vm0.U((vm0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 4:
                bw bwVar = (bw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                bwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20398id = dialogFilter.f17801id;
                cy cyVar = bwVar.f35748b;
                cyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cyVar.getMessagesController().removeFilter(dialogFilter);
                cyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 6:
                l10 l10Var = (l10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = l10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f20664g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20398id = dialogFilter2.f17801id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ca(l10Var, b2Var2, dialogFilter2, 10));
                return;
            case 7:
                q50 q50Var = (q50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = q50Var.d;
                if (q50Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f20422id);
                        q50Var.f40375a1.addKickedUser(user.f20422id);
                        q50Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(q50Var.j1(), user2);
                    q50Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(q50Var.j1(), (TLRPC.User) null, chat, false, false);
                    q50Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 8:
                l60 l60Var = (l60) obj2;
                l60Var.f38824x.h((TLRPC.User) obj);
                if (l60Var.f38804f.f27688r.length() > 0) {
                    l60Var.f38804f.f27688r.setText((CharSequence) null);
                    return;
                }
                return;
            case 9:
                l60 l60Var2 = (l60) obj2;
                l60Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                l60Var2.m0(i12);
                return;
            case 11:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 12:
                Pattern pattern = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((cg0) obj);
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.C1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                return;
            case 21:
                ((sd0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 22:
                vd0 vd0Var = (vd0) obj2;
                vd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", vd0Var.f42208r);
                bundle.putString("requestPhone", vd0Var.f42209s);
                bundle.putString("phoneHash", vd0Var.v);
                bundle.putString("phoneCode", vd0Var.f42210w);
                vd0Var.f42212y.u1(7, true, bundle, false);
                return;
            case 24:
                gf0.o((gf0) obj2, (Context) obj);
                return;
            case 26:
                vm0 vm0Var = (vm0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!vm0Var.f42321v0) {
                    vm0Var.f42316s1.clear();
                }
                vm0Var.f42318t1.clear();
                zl0 zl0Var = (zl0) vm0Var.B1;
                zl0Var.d.i1(vm0Var.E, vm0Var.F, vm0Var.G, zArr[0], null, null, zl0Var.f43768b);
                vm0Var.finishFragment();
                return;
            case 27:
                int[] iArr = ((vm0) obj2).f42326x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f43262a) {
            case 20:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f43263b;
                cg0 cg0Var = ((md0) this.f43264c).W;
                if (cg0Var.getParentActivity() != null) {
                    cg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f43263b;
                cg0 cg0Var2 = ((re0) this.f43264c).E;
                if (cg0Var2.getParentActivity() != null && !cg0Var2.getParentActivity().isFinishing()) {
                    cg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f43264c;
        Intent intent = (Intent) this.f43263b;
        Pattern pattern = LaunchActivity.C1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        v70 v70Var = (v70) this.f43264c;
        cy cyVar2 = (cy) this.f43263b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = v70Var.f42130f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        v70Var.f42128d0.saveKeepMediaExceptions(v70Var.f42127c0, v70Var.f42130f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", v70Var.f42127c0);
        s70 s70Var = new s70(bundle, cyVar2);
        s70Var.d = v70Var.f42130f0;
        s70Var.U();
        v70Var.f42131g0.presentFragment(s70Var);
        AndroidUtilities.runOnUIThread(new lt(28, s70Var, keepMediaException), 150L);
        return true;
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
