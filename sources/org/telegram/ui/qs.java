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
public final class qs implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.jl0, iy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.kl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f37834a;
    public final Object f37835b;
    public final Object f37836c;

    public qs(int i10, Object obj, Object obj2) {
        this.f37834a = i10;
        this.f37835b = obj;
        this.f37836c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f37835b;
        int[] iArr = (int[]) this.f37836c;
        Pattern pattern = LaunchActivity.f31612y1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        ad0 ad0Var = new ad0(2);
        ad0Var.u0(sharingLocationInfo.messageObject);
        ad0Var.C0 = new f3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 9);
        launchActivity.p0(ad0Var);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f37834a) {
            case 2:
                DataSettingsActivity.U((DataSettingsActivity) this.f37835b, (Context) this.f37836c, view, i10, f10);
                return;
            case 5:
                oy.e0((oy) this.f37835b, (ny) this.f37836c, view, i10);
                return;
            case 8:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f37835b, (Context) this.f37836c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f37835b, (Context) this.f37836c, view, i10, f10, f11);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        Bitmap g02;
        ad0 ad0Var = (ad0) this.f37835b;
        uc0 uc0Var = (uc0) this.f37836c;
        ad0Var.getClass();
        if (z4 && !z10 && uc0Var.e != null && (g02 = ad0Var.g0(uc0Var)) != null) {
            uc0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean e1(View view) {
        switch (this.f37834a) {
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
    public boolean f(int i10, View view) {
        ad0 ad0Var = (ad0) this.f37835b;
        Context context = (Context) this.f37836c;
        if (ad0Var.D0 == 2) {
            Object J = ad0Var.Q.J(i10);
            if (J instanceof uc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ad0Var.getParentActivity(), ad0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new gb0(1, ad0Var, (uc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                sc0 sc0Var = new sc0(ad0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ad0Var.F0 = sc0Var;
                sc0Var.setOutsideTouchable(true);
                ad0Var.F0.setClippingEnabled(true);
                ad0Var.F0.setInputMethodMode(2);
                ad0Var.F0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                ad0Var.F0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                ad0Var.F0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f37834a;
        org.telegram.ui.ActionBar.d2 d2Var2 = null;
        int i12 = 0;
        Object obj = this.f37836c;
        Object obj2 = this.f37835b;
        switch (i11) {
            case 0:
                ContactsActivity.X((ContactsActivity) obj2, (String) obj);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                zs zsVar = contactsActivity.T;
                if (zsVar != null) {
                    zsVar.b(user);
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
                dn0 dn0Var = (dn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!dn0Var.f33723s0) {
                    dn0Var.f33716p1.clear();
                }
                dn0Var.f33718q1.clear();
                gm0 gm0Var = (gm0) dn0Var.f33739y1;
                gm0Var.d.j1(dn0Var.B, dn0Var.C, dn0Var.D, zArr[0], null, null, gm0Var.f34643b);
                dn0Var.finishFragment();
                return;
            case 3:
                kv.U((kv) obj2, (TLRPC.User) obj);
                return;
            case 4:
                ((oy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f19331id);
                return;
            case 7:
                ow owVar = (ow) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                owVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19307id = dialogFilter.f16669id;
                oy oyVar = owVar.f36989b;
                oyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                oyVar.getMessagesController().removeFilter(dialogFilter);
                oyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 9:
                z10 z10Var = (z10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.f19590d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19307id = dialogFilter2.f16669id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ba(z10Var, d2Var2, dialogFilter2, 10));
                return;
            case 10:
                c60 c60Var = (c60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = c60Var.d;
                if (c60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.f19331id);
                        c60Var.X0.addKickedUser(user2.f19331id);
                        c60Var.k1().k(0L, 102, user2, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(c60Var.i1(), user3);
                    c60Var.k1().k(0L, 32, user3, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(c60Var.i1(), (TLRPC.User) null, chat, false, false);
                    c60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 11:
                y60 y60Var = (y60) obj2;
                y60Var.f40436x.h((TLRPC.User) obj);
                if (y60Var.f40419f.f23815r.length() > 0) {
                    y60Var.f40419f.f23815r.setText((CharSequence) null);
                    return;
                }
                return;
            case 12:
                y60 y60Var2 = (y60) obj2;
                y60Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                y60Var2.m0(i12);
                return;
            case 14:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 15:
                Pattern pattern = LaunchActivity.f31612y1;
                ((LaunchActivity) obj2).p0((ng0) obj);
                return;
            case 16:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.f31612y1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.L);
                launchActivity.u0(true);
                return;
            case 24:
                ((de0) obj2).B.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 25:
                he0 he0Var = (he0) obj2;
                he0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", he0Var.f34840r);
                bundle.putString("requestPhone", he0Var.f34841s);
                bundle.putString("phoneHash", he0Var.v);
                bundle.putString("phoneCode", he0Var.f34842w);
                he0Var.f34844y.u1(7, true, bundle, false);
                return;
            case 27:
                rf0.o((rf0) obj2, (Context) obj);
                return;
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
        int i10 = this.f37834a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f37834a) {
            case 23:
                a8.e eVar = (a8.e) this.f37836c;
                ng0 ng0Var = ((yd0) this.f37835b).T;
                if (ng0Var.getParentActivity() != null) {
                    ng0Var.getParentActivity().startActivityForResult(eVar.f(), 200);
                    return;
                }
                return;
            default:
                a8.e eVar2 = (a8.e) this.f37836c;
                ng0 ng0Var2 = ((df0) this.f37835b).B;
                if (ng0Var2.getParentActivity() != null && !ng0Var2.getParentActivity().isFinishing()) {
                    ng0Var2.getParentActivity().startActivityForResult(eVar2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z4) {
        LaunchActivity launchActivity = (LaunchActivity) this.f37835b;
        Intent intent = (Intent) this.f37836c;
        Pattern pattern = LaunchActivity.f31612y1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        g80 g80Var = (g80) this.f37835b;
        oy oyVar2 = (oy) this.f37836c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = g80Var.f34481c0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        g80Var.f34479a0.saveKeepMediaExceptions(g80Var.W, g80Var.f34481c0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", g80Var.W);
        d80 d80Var = new d80(bundle, oyVar2);
        d80Var.d = g80Var.f34481c0;
        d80Var.U();
        g80Var.f34482d0.presentFragment(d80Var);
        AndroidUtilities.runOnUIThread(new g00(11, d80Var, keepMediaException), 150L);
        return true;
    }

    public qs(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f37834a = 1;
        this.f37835b = contactsActivity;
        this.f37836c = user;
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
