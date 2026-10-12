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
import org.telegram.messenger.FileLoader;
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
public final class tw implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.lm0, py, ContactsLoadingObserver.Callback, org.telegram.ui.Components.kw0, org.telegram.ui.Components.mm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, bu, FileLoader.FileResolver {
    public final int f42302a;
    public final Object f42303b;
    public final Object f42304c;

    public tw(int i10, Object obj, Object obj2) {
        this.f42302a = i10;
        this.f42303b = obj;
        this.f42304c = obj2;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(vy vyVar) {
        return false;
    }

    @Override
    public void V0(xt xtVar) {
        pn0 pn0Var = (pn0) this.f42303b;
        int intValue = ((Integer) ((View) this.f42304c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = pn0Var.Y[intValue];
        if (intValue == 5) {
            pn0Var.f41042s = xtVar.d;
        } else {
            pn0Var.v = xtVar.d;
        }
        editTextBoldCursor.setText(xtVar.f44161a);
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f42302a) {
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f42303b;
        int[] iArr = (int[]) this.f42304c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        id0 id0Var = new id0(2);
        id0Var.t0(sharingLocationInfo.messageObject);
        id0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(id0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f42302a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f42303b, (Context) this.f42304c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f42303b, (Context) this.f42304c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        id0 id0Var = (id0) this.f42303b;
        Context context = (Context) this.f42304c;
        if (id0Var.G0 == 2) {
            Object J = id0Var.T.J(i10);
            if (J instanceof cd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, id0Var.getParentActivity(), id0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new uv(16, id0Var, (cd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                ad0 ad0Var = new ad0(id0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                id0Var.I0 = ad0Var;
                ad0Var.setOutsideTouchable(true);
                id0Var.I0.setClippingEnabled(true);
                id0Var.I0.setInputMethodMode(2);
                id0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                id0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                id0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        id0 id0Var = (id0) this.f42303b;
        cd0 cd0Var = (cd0) this.f42304c;
        id0Var.getClass();
        if (z10 && !z11 && cd0Var.f36403e != null && (f02 = id0Var.f0(cd0Var)) != null) {
            cd0Var.f36403e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f42302a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.f42304c;
        Object obj2 = this.f42303b;
        switch (i11) {
            case 0:
                uw uwVar = (uw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                uwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19926id = dialogFilter.f17004id;
                vy vyVar = uwVar.f42603b;
                vyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                vyVar.getMessagesController().removeFilter(dialogFilter);
                vyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 1:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 24:
            default:
                PhotoViewer.D(((us0) obj2).f42563b, (ArrayList) obj);
                return;
            case 2:
                e20 e20Var = (e20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = e20Var.f36964e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.f20164g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19926id = dialogFilter2.f17004id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ea(e20Var, a2Var2, dialogFilter2, 10));
                return;
            case 3:
                i60 i60Var = (i60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = i60Var.d;
                if (i60Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f19950id);
                        i60Var.f38681a1.addKickedUser(user.f19950id);
                        i60Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.j1(), user2);
                    i60Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.j1(), (TLRPC.User) null, chat, false, false);
                    i60Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 4:
                e70 e70Var = (e70) obj2;
                e70Var.f37024x.i((TLRPC.User) obj);
                if (e70Var.f37004f.f31362r.length() > 0) {
                    e70Var.f37004f.f31362r.setText((CharSequence) null);
                    return;
                }
                return;
            case 5:
                e70 e70Var2 = (e70) obj2;
                e70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                e70Var2.m0(i12);
                return;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((xg0) obj);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 17:
                ((me0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 18:
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", pe0Var.f40942r);
                bundle.putString("requestPhone", pe0Var.f40943s);
                bundle.putString("phoneHash", pe0Var.v);
                bundle.putString("phoneCode", pe0Var.f40944w);
                pe0Var.f40946y.u1(7, true, bundle, false);
                return;
            case 20:
                zf0.o((zf0) obj2, (Context) obj);
                return;
            case 22:
                pn0 pn0Var = (pn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!pn0Var.f41049v0) {
                    pn0Var.f41044s1.clear();
                }
                pn0Var.f41046t1.clear();
                sm0 sm0Var = (sm0) pn0Var.B1;
                sm0Var.d.i1(pn0Var.E, pn0Var.F, pn0Var.G, zArr[0], null, null, sm0Var.f41961b);
                pn0Var.finishFragment();
                return;
            case 23:
                int[] iArr = ((pn0) obj2).f41054x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 25:
                pn0.U((pn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 26:
                xo0 xo0Var = (xo0) obj2;
                xo0Var.f44094b0 = true;
                xo0Var.f44091a0.email_unconfirmed_pattern = (String) obj;
                xo0Var.J0();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f42302a) {
            case 27:
                return FileLoader.getInstance(((PhotoViewer) this.f42303b).T).getPathToAttach((TLObject) this.f42304c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f42303b).T).getPathToMessage((TLRPC.Message) this.f42304c);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f42302a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f42302a) {
            case 16:
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.f42304c;
                xg0 xg0Var = ((ge0) this.f42303b).W;
                if (xg0Var.getParentActivity() != null) {
                    xg0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.f42304c;
                xg0 xg0Var2 = ((lf0) this.f42303b).E;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing()) {
                    xg0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f42303b;
        Intent intent = (Intent) this.f42304c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        r80 r80Var = (r80) this.f42303b;
        vy vyVar2 = (vy) this.f42304c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = r80Var.f41532f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        r80Var.f41530d0.saveKeepMediaExceptions(r80Var.f41529c0, r80Var.f41532f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", r80Var.f41529c0);
        o80 o80Var = new o80(bundle, vyVar2);
        o80Var.d = r80Var.f41532f0;
        o80Var.U();
        r80Var.f41533g0.presentFragment(o80Var);
        AndroidUtilities.runOnUIThread(new q70(2, o80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
