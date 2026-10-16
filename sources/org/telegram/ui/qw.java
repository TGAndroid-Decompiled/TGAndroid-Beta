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
public final class qw implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1, sy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.aw0, org.telegram.ui.Components.cm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, eu, FileLoader.FileResolver {
    public final int f39231a;
    public final Object f39232b;
    public final Object f39233c;

    public qw(int i10, Object obj, Object obj2) {
        this.f39231a = i10;
        this.f39232b = obj;
        this.f39233c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void Z0(au auVar) {
        sn0 sn0Var = (sn0) this.f39232b;
        int intValue = ((Integer) ((View) this.f39233c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = sn0Var.Y[intValue];
        if (intValue == 5) {
            sn0Var.f39894s = auVar.d;
        } else {
            sn0Var.v = auVar.d;
        }
        editTextBoldCursor.setText(auVar.f34084a);
    }

    @Override
    public boolean a(int i10, View view) {
        ld0 ld0Var = (ld0) this.f39232b;
        Context context = (Context) this.f39233c;
        if (ld0Var.G0 == 2) {
            Object J = ld0Var.T.J(i10);
            if (J instanceof fd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, ld0Var.getParentActivity(), ld0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new xv(16, ld0Var, (fd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                dd0 dd0Var = new dd0(ld0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ld0Var.I0 = dd0Var;
                dd0Var.setOutsideTouchable(true);
                ld0Var.I0.setClippingEnabled(true);
                ld0Var.I0.setInputMethodMode(2);
                ld0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                ld0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                ld0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39232b;
        int[] iArr = (int[]) this.f39233c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        ld0 ld0Var = new ld0(2);
        ld0Var.t0(sharingLocationInfo.messageObject);
        ld0Var.F0 = new bi.p1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(ld0Var);
    }

    @Override
    public boolean c1(View view) {
        switch (this.f39231a) {
            case 0:
                return false;
            case 3:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f39231a) {
            case 0:
                yy.f0((yy) this.f39232b, (xy) this.f39233c, view, i10);
                return;
            case 3:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f39232b, (Context) this.f39233c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f39232b, (Context) this.f39233c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        ld0 ld0Var = (ld0) this.f39232b;
        fd0 fd0Var = (fd0) this.f39233c;
        ld0Var.getClass();
        if (z10 && !z11 && fd0Var.e != null && (f02 = ld0Var.f0(fd0Var)) != null) {
            fd0Var.e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f39231a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.f39233c;
        Object obj2 = this.f39232b;
        switch (i11) {
            case 2:
                xw xwVar = (xw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                xwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19039id = dialogFilter.f16400id;
                yy yyVar = xwVar.f41671b;
                yyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                yyVar.getMessagesController().removeFilter(dialogFilter);
                yyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 3:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 23:
            case 26:
            default:
                ap0 ap0Var = (ap0) obj2;
                ap0Var.f34011b0 = true;
                ap0Var.f34008a0.email_unconfirmed_pattern = (String) obj;
                ap0Var.J0();
                return;
            case 4:
                i20 i20Var = (i20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = i20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.f19269g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19039id = dialogFilter2.f16400id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new fa(i20Var, a2Var2, dialogFilter2, 10));
                return;
            case 5:
                n60 n60Var = (n60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = n60Var.d;
                if (n60Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f19063id);
                        n60Var.f38157a1.addKickedUser(user.f19063id);
                        n60Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(n60Var.j1(), user2);
                    n60Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(n60Var.j1(), (TLRPC.User) null, chat, false, false);
                    n60Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 6:
                j70 j70Var = (j70) obj2;
                j70Var.f36967x.h((TLRPC.User) obj);
                if (j70Var.f36947f.f27510r.length() > 0) {
                    j70Var.f36947f.f27510r.setText((CharSequence) null);
                    return;
                }
                return;
            case 7:
                j70 j70Var2 = (j70) obj2;
                j70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                j70Var2.m0(i12);
                return;
            case 9:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 10:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ah0) obj);
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 19:
                ((pe0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 20:
                te0 te0Var = (te0) obj2;
                te0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", te0Var.f40091r);
                bundle.putString("requestPhone", te0Var.f40092s);
                bundle.putString("phoneHash", te0Var.v);
                bundle.putString("phoneCode", te0Var.f40093w);
                te0Var.f40095y.u1(7, true, bundle, false);
                return;
            case 22:
                dg0.o((dg0) obj2, (Context) obj);
                return;
            case 24:
                sn0 sn0Var = (sn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!sn0Var.f39901v0) {
                    sn0Var.f39896s1.clear();
                }
                sn0Var.f39898t1.clear();
                vm0 vm0Var = (vm0) sn0Var.B1;
                vm0Var.d.i1(sn0Var.E, sn0Var.F, sn0Var.G, zArr[0], null, null, vm0Var.f40733b);
                sn0Var.finishFragment();
                return;
            case 25:
                int[] iArr = ((sn0) obj2).f39906x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 27:
                sn0.U((sn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        return FileLoader.getInstance(((PhotoViewer) this.f39232b).T).getPathToAttach((TLObject) this.f39233c, true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f39231a) {
            case 18:
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.f39233c;
                ah0 ah0Var = ((je0) this.f39232b).W;
                if (ah0Var.getParentActivity() != null) {
                    ah0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.f39233c;
                ah0 ah0Var2 = ((pf0) this.f39232b).E;
                if (ah0Var2.getParentActivity() != null && !ah0Var2.getParentActivity().isFinishing()) {
                    ah0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39232b;
        Intent intent = (Intent) this.f39233c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f39231a;
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        t80 t80Var = (t80) this.f39233c;
        yy yyVar2 = (yy) this.f39232b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = t80Var.f40026f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        t80Var.f40024d0.saveKeepMediaExceptions(t80Var.f40023c0, t80Var.f40026f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", t80Var.f40023c0);
        q80 q80Var = new q80(bundle, yyVar2);
        q80Var.d = t80Var.f40026f0;
        q80Var.U();
        t80Var.f40027g0.presentFragment(q80Var);
        AndroidUtilities.runOnUIThread(new d20(10, q80Var, keepMediaException), 150L);
        return true;
    }

    public qw(t80 t80Var, yy yyVar) {
        this.f39231a = 8;
        this.f39233c = t80Var;
        this.f39232b = yyVar;
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
