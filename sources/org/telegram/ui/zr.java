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

public final class zr implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qk0, zx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.ku0, org.telegram.ui.Components.rk0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {

    public final int f45240a;

    public final Object f45241b;

    public final Object f45242c;

    public zr(int i10, Object obj, Object obj2) {
        this.f45240a = i10;
        this.f45241b = obj;
        this.f45242c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        tc0 tc0Var = (tc0) this.f45241b;
        Context context = (Context) this.f45242c;
        if (tc0Var.C0 == 2) {
            Object objJ = tc0Var.P.J(i10);
            if (objJ instanceof nc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, tc0Var.getParentActivity(), tc0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new u70(4, tc0Var, (nc0) objJ));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                lc0 lc0Var = new lc0(tc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                tc0Var.E0 = lc0Var;
                lc0Var.setOutsideTouchable(true);
                tc0Var.E0.setClippingEnabled(true);
                tc0Var.E0.setInputMethodMode(2);
                tc0Var.E0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                tc0Var.E0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                tc0Var.E0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f45240a) {
            case 3:
                DataSettingsActivity.U((DataSettingsActivity) this.f45241b, (Context) this.f45242c, view, i10, f10);
                break;
            case 6:
                gy.e0((gy) this.f45241b, (fy) this.f45242c, view, i10);
                break;
            case 9:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f45241b, (Context) this.f45242c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f45241b, (Context) this.f45242c, view, i10, f10, f11);
                break;
        }
    }

    @Override
    public void c0(View view, float f10, float f11) {
        int i10 = this.f45240a;
    }

    @Override
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f45241b;
        int[] iArr = (int[]) this.f45242c;
        Pattern pattern = LaunchActivity.f35496x1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        tc0 tc0Var = new tc0(2);
        tc0Var.u0(sharingLocationInfo.messageObject);
        tc0Var.B0 = new d3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(tc0Var);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmapG0;
        tc0 tc0Var = (tc0) this.f45241b;
        nc0 nc0Var = (nc0) this.f45242c;
        tc0Var.getClass();
        if (!z10 || z11 || nc0Var.f40732e == null || (bitmapG0 = tc0Var.g0(nc0Var)) == null) {
            return;
        }
        nc0Var.f40732e.setIcon(bitmapG0);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f45240a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f45242c;
        Object obj2 = this.f45241b;
        switch (i11) {
            case 0:
                js jsVar = (js) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                jsVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                jsVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                jsVar.finishFragment();
                break;
            case 1:
                ContactsActivity.X((ContactsActivity) obj2, (String) obj);
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                us usVar = contactsActivity.S;
                if (usVar != null) {
                    usVar.a(user2);
                    contactsActivity.S = null;
                }
                break;
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
                mf0.o((mf0) obj2, (Context) obj);
                break;
            case 4:
                ev.U((ev) obj2, (TLRPC.User) obj);
                break;
            case 5:
                ((gy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f22527id);
                break;
            case 8:
                gw gwVar = (gw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                gwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22503id = dialogFilter.f19622id;
                gy gyVar = gwVar.f38485b;
                gyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                gyVar.getMessagesController().removeFilter(dialogFilter);
                gyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 10:
                o10 o10Var = (o10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = o10Var.f40974e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f22747c0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f22503id = dialogFilter2.f19622id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(o10Var, b2Var2, dialogFilter2, 10));
                break;
            case 11:
                s50 s50Var = (s50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = s50Var.d;
                if (!s50Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.i1(), (TLRPC.User) null, chat, false, false);
                        s50Var.k1().k(0L, 32, chat, null, null, null);
                    } else {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.i1(), user3);
                        s50Var.k1().k(0L, 32, user3, null, null, null);
                    }
                    break;
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user4 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user4.f22527id);
                        s50Var.W0.addKickedUser(user4.f22527id);
                        s50Var.k1().k(0L, 102, user4, null, null, null);
                        break;
                    }
                }
                break;
            case 12:
                o60 o60Var = (o60) obj2;
                o60Var.f41018x.i((TLRPC.User) obj);
                if (o60Var.f41002f.f31468r.length() > 0) {
                    o60Var.f41002f.f31468r.setText((CharSequence) null);
                }
                break;
            case 13:
                o60 o60Var2 = (o60) obj2;
                o60Var2.getClass();
                org.telegram.ui.Cells.y1 y1Var = ((org.telegram.ui.Cells.y1[]) obj)[0];
                if (y1Var != null && y1Var.b()) {
                    i12 = 100;
                }
                o60Var2.m0(i12);
                break;
            case 15:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 16:
                Pattern pattern = LaunchActivity.f35496x1;
                ((LaunchActivity) obj2).p0((ig0) obj);
                break;
            case 17:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.f35496x1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.K);
                launchActivity.u0(true);
                break;
            case 25:
                ((yd0) obj2).A.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 26:
                be0 be0Var = (be0) obj2;
                be0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", be0Var.f36799r);
                bundle.putString("requestPhone", be0Var.f36800s);
                bundle.putString("phoneHash", be0Var.v);
                bundle.putString("phoneCode", be0Var.f36801w);
                be0Var.f36803y.u1(7, true, bundle, false);
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f45240a) {
            case 3:
                break;
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f45240a) {
            case 24:
                sd0 sd0Var = (sd0) this.f45241b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f45242c;
                ig0 ig0Var = sd0Var.S;
                if (ig0Var.getParentActivity() != null) {
                    ig0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                xe0 xe0Var = (xe0) this.f45241b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f45242c;
                ig0 ig0Var2 = xe0Var.A;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing()) {
                    ig0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override
    public void onResult(boolean z10) throws Throwable {
        LaunchActivity launchActivity = (LaunchActivity) this.f45241b;
        Intent intent = (Intent) this.f45242c;
        Pattern pattern = LaunchActivity.f35496x1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        y70 y70Var = (y70) this.f45241b;
        gy gyVar2 = (gy) this.f45242c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = y70Var.f44720b0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        y70Var.W.saveKeepMediaExceptions(y70Var.V, y70Var.f44720b0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", y70Var.V);
        v70 v70Var = new v70(bundle, gyVar2);
        v70Var.d = y70Var.f44720b0;
        v70Var.U();
        y70Var.f44721c0.presentFragment(v70Var);
        AndroidUtilities.runOnUIThread(new a30(5, v70Var, keepMediaException), 150L);
        return true;
    }

    public zr(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f45240a = 2;
        this.f45241b = contactsActivity;
        this.f45242c = user;
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }

    private final void h(View view, float f10, float f11) {
    }
}
