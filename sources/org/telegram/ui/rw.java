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
public final class rw implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.fm0, ny, ContactsLoadingObserver.Callback, org.telegram.ui.Components.ew0, org.telegram.ui.Components.gm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, yt, FileLoader.FileResolver {
    public final int f41527a;
    public final Object f41528b;
    public final Object f41529c;

    public rw(int i10, Object obj, Object obj2) {
        this.f41527a = i10;
        this.f41528b = obj;
        this.f41529c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void U0(ut utVar) {
        nn0 nn0Var = (nn0) this.f41528b;
        int intValue = ((Integer) ((View) this.f41529c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = nn0Var.Y[intValue];
        if (intValue == 5) {
            nn0Var.f40281s = utVar.d;
        } else {
            nn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.f42549a);
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f41527a) {
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41528b;
        int[] iArr = (int[]) this.f41529c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        hd0 hd0Var = new hd0(2);
        hd0Var.t0(sharingLocationInfo.messageObject);
        hd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(hd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f41527a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f41528b, (Context) this.f41529c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f41528b, (Context) this.f41529c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        hd0 hd0Var = (hd0) this.f41528b;
        Context context = (Context) this.f41529c;
        if (hd0Var.G0 == 2) {
            Object J = hd0Var.T.J(i10);
            if (J instanceof bd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, hd0Var.getParentActivity(), hd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new rv(16, hd0Var, (bd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                zc0 zc0Var = new zc0(hd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                hd0Var.I0 = zc0Var;
                zc0Var.setOutsideTouchable(true);
                hd0Var.I0.setClippingEnabled(true);
                hd0Var.I0.setInputMethodMode(2);
                hd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                hd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                hd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        hd0 hd0Var = (hd0) this.f41528b;
        bd0 bd0Var = (bd0) this.f41529c;
        hd0Var.getClass();
        if (z10 && !z11 && bd0Var.f36285e != null && (f02 = hd0Var.f0(bd0Var)) != null) {
            bd0Var.f36285e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f41527a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f41529c;
        Object obj2 = this.f41528b;
        switch (i11) {
            case 0:
                sw swVar = (sw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                swVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20161id = dialogFilter.f17252id;
                ty tyVar = swVar.f41780b;
                tyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                tyVar.getMessagesController().removeFilter(dialogFilter);
                tyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
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
                PhotoViewer.D(((ss0) obj2).f41767b, (ArrayList) obj);
                return;
            case 2:
                c20 c20Var = (c20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = c20Var.f36501e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f20420g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20161id = dialogFilter2.f17252id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ba(c20Var, b2Var2, dialogFilter2, 10));
                return;
            case 3:
                g60 g60Var = (g60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = g60Var.d;
                if (g60Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f20185id);
                        g60Var.f37789a1.addKickedUser(user.f20185id);
                        g60Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), user2);
                    g60Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), (TLRPC.User) null, chat, false, false);
                    g60Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 4:
                c70 c70Var = (c70) obj2;
                c70Var.f36571x.i((TLRPC.User) obj);
                if (c70Var.f36551f.f30614r.length() > 0) {
                    c70Var.f36551f.f30614r.setText((CharSequence) null);
                    return;
                }
                return;
            case 5:
                c70 c70Var2 = (c70) obj2;
                c70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                c70Var2.m0(i12);
                return;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((wg0) obj);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 17:
                ((le0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 18:
                oe0 oe0Var = (oe0) obj2;
                oe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", oe0Var.f40512r);
                bundle.putString("requestPhone", oe0Var.f40513s);
                bundle.putString("phoneHash", oe0Var.v);
                bundle.putString("phoneCode", oe0Var.f40514w);
                oe0Var.f40516y.u1(7, true, bundle, false);
                return;
            case 20:
                zf0.o((zf0) obj2, (Context) obj);
                return;
            case 22:
                nn0 nn0Var = (nn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!nn0Var.f40288v0) {
                    nn0Var.f40283s1.clear();
                }
                nn0Var.f40285t1.clear();
                qm0 qm0Var = (qm0) nn0Var.B1;
                qm0Var.d.i1(nn0Var.E, nn0Var.F, nn0Var.G, zArr[0], null, null, qm0Var.f41150b);
                nn0Var.finishFragment();
                return;
            case 23:
                int[] iArr = ((nn0) obj2).f40293x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 25:
                nn0.U((nn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 26:
                vo0 vo0Var = (vo0) obj2;
                vo0Var.f42917b0 = true;
                vo0Var.f42914a0.email_unconfirmed_pattern = (String) obj;
                vo0Var.J0();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f41527a) {
            case 27:
                return FileLoader.getInstance(((PhotoViewer) this.f41528b).T).getPathToAttach((TLObject) this.f41529c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f41528b).T).getPathToMessage((TLRPC.Message) this.f41529c);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f41527a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f41527a) {
            case 16:
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.f41529c;
                wg0 wg0Var = ((fe0) this.f41528b).W;
                if (wg0Var.getParentActivity() != null) {
                    wg0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.f41529c;
                wg0 wg0Var2 = ((kf0) this.f41528b).E;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing()) {
                    wg0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41528b;
        Intent intent = (Intent) this.f41529c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        p80 p80Var = (p80) this.f41528b;
        ty tyVar2 = (ty) this.f41529c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f40701f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.f40699d0.saveKeepMediaExceptions(p80Var.f40698c0, p80Var.f40701f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", p80Var.f40698c0);
        m80 m80Var = new m80(bundle, tyVar2);
        m80Var.d = p80Var.f40701f0;
        m80Var.U();
        p80Var.f40702g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new m70(4, m80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
