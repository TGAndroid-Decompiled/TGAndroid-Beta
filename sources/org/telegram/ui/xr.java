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
public final class xr implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.al0, yx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.tu0, org.telegram.ui.Components.bl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f44644a;
    public final Object f44645b;
    public final Object f44646c;

    public xr(int i10, Object obj, Object obj2) {
        this.f44644a = i10;
        this.f44645b = obj;
        this.f44646c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        switch (this.f44644a) {
            case 3:
                DataSettingsActivity.U((DataSettingsActivity) this.f44645b, (Context) this.f44646c, view, i10, f9);
                return;
            case 6:
                fy.e0((fy) this.f44645b, (ey) this.f44646c, view, i10);
                return;
            case 9:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f44645b, (Context) this.f44646c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f44645b, (Context) this.f44646c, view, i10, f9, f10);
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f44644a) {
            case 3:
                return false;
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        rc0 rc0Var = (rc0) this.f44645b;
        Context context = (Context) this.f44646c;
        if (rc0Var.C0 == 2) {
            Object J = rc0Var.P.J(i10);
            if (J instanceof lc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, rc0Var.getParentActivity(), rc0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new t70(4, rc0Var, (lc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                jc0 jc0Var = new jc0(rc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                rc0Var.E0 = jc0Var;
                jc0Var.setOutsideTouchable(true);
                rc0Var.E0.setClippingEnabled(true);
                rc0Var.E0.setInputMethodMode(2);
                rc0Var.E0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                rc0Var.E0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                rc0Var.E0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f44645b;
        int[] iArr = (int[]) this.f44646c;
        Pattern pattern = LaunchActivity.f35560x1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        rc0 rc0Var = new rc0(2);
        rc0Var.u0(sharingLocationInfo.messageObject);
        rc0Var.B0 = new f3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(rc0Var);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        rc0 rc0Var = (rc0) this.f44645b;
        lc0 lc0Var = (lc0) this.f44646c;
        rc0Var.getClass();
        if (z10 && !z11 && lc0Var.f40167e != null && (g02 = rc0Var.g0(lc0Var)) != null) {
            lc0Var.f40167e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f44644a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.f44646c;
        Object obj2 = this.f44645b;
        switch (i11) {
            case 0:
                hs hsVar = (hs) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                hsVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                hsVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                hsVar.finishFragment();
                return;
            case 1:
                ContactsActivity.X((ContactsActivity) obj2, (String) obj);
                return;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ss ssVar = contactsActivity.S;
                if (ssVar != null) {
                    ssVar.d(user2);
                    contactsActivity.S = null;
                    return;
                }
                return;
            case 3:
            case 6:
            case 7:
            case 9:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                if0.o((if0) obj2, (Context) obj);
                return;
            case 4:
                cv.U((cv) obj2, (TLRPC.User) obj);
                return;
            case 5:
                ((fy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f22539id);
                return;
            case 8:
                fw fwVar = (fw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                fwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22515id = dialogFilter.f19620id;
                fy fyVar = fwVar.f38242b;
                fyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                fyVar.getMessagesController().removeFilter(dialogFilter);
                fyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 10:
                n10 n10Var = (n10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = n10Var.f40685e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.f22783c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f22515id = dialogFilter2.f19620id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new x9(n10Var, c2Var2, dialogFilter2, 10));
                return;
            case 11:
                r50 r50Var = (r50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = r50Var.d;
                if (r50Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user3.f22539id);
                        r50Var.W0.addKickedUser(user3.f22539id);
                        r50Var.k1().k(0L, 102, user3, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user4 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(r50Var.i1(), user4);
                    r50Var.k1().k(0L, 32, user4, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(r50Var.i1(), (TLRPC.User) null, chat, false, false);
                    r50Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 12:
                m60 m60Var = (m60) obj2;
                m60Var.f40466x.i((TLRPC.User) obj);
                if (m60Var.f40450f.f34546r.length() > 0) {
                    m60Var.f40450f.f34546r.setText((CharSequence) null);
                    return;
                }
                return;
            case 13:
                m60 m60Var2 = (m60) obj2;
                m60Var2.getClass();
                org.telegram.ui.Cells.y1 y1Var = ((org.telegram.ui.Cells.y1[]) obj)[0];
                if (y1Var != null && y1Var.b()) {
                    i12 = 100;
                }
                m60Var2.m0(i12);
                return;
            case 15:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 16:
                Pattern pattern = LaunchActivity.f35560x1;
                ((LaunchActivity) obj2).p0((fg0) obj);
                return;
            case 17:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.f35560x1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.K);
                launchActivity.u0(true);
                return;
            case 25:
                ((ud0) obj2).A.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 26:
                xd0 xd0Var = (xd0) obj2;
                xd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xd0Var.f44564r);
                bundle.putString("requestPhone", xd0Var.f44565s);
                bundle.putString("phoneHash", xd0Var.v);
                bundle.putString("phoneCode", xd0Var.f44566w);
                xd0Var.f44568y.u1(7, true, bundle, false);
                return;
        }
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f44644a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f44644a) {
            case 24:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f44646c;
                fg0 fg0Var = ((pd0) this.f44645b).S;
                if (fg0Var.getParentActivity() != null) {
                    fg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f44646c;
                fg0 fg0Var2 = ((te0) this.f44645b).A;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing()) {
                    fg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f44645b;
        Intent intent = (Intent) this.f44646c;
        Pattern pattern = LaunchActivity.f35560x1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        x70 x70Var = (x70) this.f44645b;
        fy fyVar2 = (fy) this.f44646c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = x70Var.f44510b0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        x70Var.W.saveKeepMediaExceptions(x70Var.V, x70Var.f44510b0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", x70Var.V);
        u70 u70Var = new u70(bundle, fyVar2);
        u70Var.d = x70Var.f44510b0;
        u70Var.U();
        x70Var.f44511c0.presentFragment(u70Var);
        AndroidUtilities.runOnUIThread(new x60(2, u70Var, keepMediaException), 150L);
        return true;
    }

    public xr(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f44644a = 2;
        this.f44645b = contactsActivity;
        this.f44646c = user;
    }

    private final void a(View view, float f9, float f10) {
    }

    private final void e(View view, float f9, float f10) {
    }

    private final void f(View view, float f9, float f10) {
    }

    private final void h(View view, float f9, float f10) {
    }
}
