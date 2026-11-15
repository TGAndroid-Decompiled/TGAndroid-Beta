package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tr implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.hj0, sw, org.telegram.ui.Components.at0, org.telegram.ui.Components.ij0, org.telegram.messenger.kc, OnCompleteListener {
    public final int f51653a;
    public final Object f51654b;
    public final Object f51655c;

    public tr(int i7, Object obj, Object obj2) {
        this.f51653a = i7;
        this.f51654b = obj;
        this.f51655c = obj2;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        pa0 pa0Var = (pa0) this.f51654b;
        la0 la0Var = (la0) this.f51655c;
        if (z10 && !z11 && la0Var.f48920e != null && (n02 = pa0Var.n0(la0Var)) != null) {
            la0Var.f48920e.f23061a.a(c8.p9.a(n02));
        }
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public boolean b(int i7, View view) {
        pa0 pa0Var = (pa0) this.f51654b;
        Context context = (Context) this.f51655c;
        if (pa0Var.I0 == 2) {
            Object I = pa0Var.Q.I(i7);
            if (I instanceof la0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, pa0Var.getParentActivity(), pa0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.hd.M0(2131750473, null), 2131231104, null);
                z0Var.setOnClickListener(new a90(1, pa0Var, (la0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                ka0 ka0Var = new ka0(pa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pa0Var.K0 = ka0Var;
                ka0Var.setOutsideTouchable(true);
                pa0Var.K0.setClippingEnabled(true);
                pa0Var.K0.setInputMethodMode(2);
                pa0Var.K0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pa0Var.K0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                pa0Var.K0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(org.telegram.messenger.qd qdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f51654b;
        int[] iArr = (int[]) this.f51655c;
        String str = LaunchActivity.C1;
        int i7 = qdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        pa0 pa0Var = new pa0(2);
        pa0Var.G0(qdVar.h);
        pa0Var.H0 = new ai.d0(iArr, org.telegram.messenger.gj.B0(qdVar.h.f23819k), 10);
        launchActivity.t0(pa0Var);
    }

    @Override
    public boolean c1(View view) {
        switch (this.f51653a) {
            case 1:
                return false;
            case 5:
                return false;
            case 7:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f51653a) {
            case 1:
                DataSettingsActivity.Z((DataSettingsActivity) this.f51654b, (Context) this.f51655c, view, i7, f10);
                return;
            case 5:
                yw.g0((yw) this.f51654b, (xw) this.f51655c, view, i7);
                return;
            case 7:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.f51654b, (Context) this.f51655c, view, i7);
                return;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f51654b, (Context) this.f51655c, view, i7, f10, f11);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.f51653a;
        org.telegram.ui.ActionBar.t1 t1Var2 = null;
        int i12 = 0;
        Object obj = this.f51655c;
        Object obj2 = this.f51654b;
        switch (i11) {
            case 0:
                ContactsActivity.Z((ContactsActivity) obj2, (String) obj);
                return;
            case 1:
            case 3:
            case 5:
            case 7:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                be0 be0Var = (be0) obj2;
                ((boolean[]) obj)[0] = true;
                if (be0Var.o()) {
                    d3.b bVar = new d3.b(1);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    be0Var.f45684b0 = cancellationTokenSource;
                    Context context = be0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.e2) be0Var.f45693h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    jd0 jd0Var = new jd0(2, be0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 3);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, 4));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.r2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.r2.f26209e;
                    ArrayList<Long> arrayList = new ArrayList<>();
                    int i13 = 0;
                    for (int i14 = 4; i13 < i14; i14 = 4) {
                        org.telegram.messenger.m10 i15 = org.telegram.messenger.m10.i(i13);
                        if (i15.p()) {
                            arrayList.add(Long.valueOf(i15.e()));
                        }
                        i13++;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList;
                    runnableArr[0] = new org.telegram.messenger.f9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(1), new org.telegram.messenger.e9(token, taskCompletionSource, runnableArr, nVar, context, jd0Var, i10), 8), 0);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new tr(28, be0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new wd0(be0Var)).addOnFailureListener(bVar, new wd0(be0Var));
                    return;
                }
                return;
            case 2:
                cu.Z((cu) obj2, (TLRPC.User) obj);
                return;
            case 4:
                org.telegram.messenger.si mediaDataController = ((yw) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).f28200id;
                for (int i16 = 0; i16 < mediaDataController.f26496m1.size(); i16++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.f26496m1.get(i16)).peer.user_id == j3) {
                        mediaDataController.f26496m1.remove(i16);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.m5(11));
                        mediaDataController.getMessagesStorage().f27219a.c(new di.y8(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 6:
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28176id = soVar.f26552a;
                yw ywVar = ((pw) obj2).f50376b;
                ywVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ywVar.getMessagesController().h4(soVar);
                org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.f27219a.c(new org.telegram.messenger.pq(2, messagesStorage, soVar));
                return;
            case 8:
                g00 g00Var = (g00) obj2;
                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) obj;
                FiltersSetupActivity filtersSetupActivity = g00Var.f47254e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, filtersSetupActivity.getParentActivity(), null);
                    t1Var3.f29637j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f28176id = soVar2.f26552a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(g00Var, t1Var2, soVar2, 10));
                return;
            case 9:
                c40 c40Var = (c40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = c40Var.f45940o1;
                if (c40Var.r1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f28200id);
                        org.telegram.messenger.r3 r3Var = c40Var.V2;
                        long j10 = user.f28200id;
                        ArrayList arrayList2 = r3Var.f26227o;
                        if (!arrayList2.contains(Long.valueOf(j10))) {
                            arrayList2.add(Long.valueOf(j10));
                            r3Var.z();
                            org.telegram.messenger.ns.f(r3Var.C.f22782a).k(166, Long.valueOf(r3Var.f26217c), Long.valueOf(r3Var.f26216b.f28061id), Boolean.FALSE);
                        }
                        c40Var.n1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.s1(cVar.f22782a).f0(c40Var.l1(), user2);
                    c40Var.n1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.np.s1(cVar.f22782a).g0(c40Var.l1(), null, chat, false, false);
                    c40Var.n1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 10:
                w40 w40Var = (w40) obj2;
                w40Var.f52432y.f((TLRPC.User) obj);
                if (w40Var.f52410f.f40202r.length() > 0) {
                    w40Var.f52410f.f40202r.setText((CharSequence) null);
                    return;
                }
                return;
            case 11:
                w40 w40Var2 = (w40) obj2;
                w40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i12 = 100;
                }
                w40Var2.r0(i12);
                return;
            case 13:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.dd) obj);
                return;
            case 14:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((ce0) obj);
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.hd.E0().d(((org.telegram.messenger.dd[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                return;
            case 23:
                ((tb0) obj2).H.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 24:
                wb0 wb0Var = (wb0) obj2;
                wb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", wb0Var.f52536r);
                bundle.putString("requestPhone", wb0Var.f52537s);
                bundle.putString("phoneHash", wb0Var.f52538w);
                bundle.putString("phoneCode", wb0Var.f52539x);
                wb0Var.E.M1(7, true, bundle, false);
                return;
            case 26:
                ed0.n((ed0) obj2, (Context) obj);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f51653a) {
            case 22:
                b9.k0 k0Var = (b9.k0) this.f51655c;
                ce0 ce0Var = ((ob0) this.f51654b).f49881a0;
                if (ce0Var.getParentActivity() != null) {
                    ce0Var.getParentActivity().startActivityForResult(k0Var.f(), 200);
                    return;
                }
                return;
            case 25:
                b9.k0 k0Var2 = (b9.k0) this.f51655c;
                ce0 ce0Var2 = ((rc0) this.f51654b).F;
                if (ce0Var2.getParentActivity() != null && !ce0Var2.getParentActivity().isFinishing()) {
                    ce0Var2.getParentActivity().startActivityForResult(k0Var2.f(), 200);
                    return;
                }
                return;
            default:
                be0 be0Var = (be0) this.f51654b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f51655c;
                org.telegram.ui.ActionBar.t1 t1Var = be0Var.f45686c0;
                if (t1Var != null) {
                    t1Var.dismiss();
                    be0Var.f45686c0 = null;
                }
                if (be0Var.f45684b0 == cancellationTokenSource) {
                    be0Var.f45684b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f51653a;
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        d60 d60Var = (d60) this.f51654b;
        yw ywVar2 = (yw) this.f51655c;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = d60Var.f46284g0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.ur) arrayList.get(i11)).f26861a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        d60Var.f46282e0.h(d60Var.f46281d0, d60Var.f46284g0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", d60Var.f46281d0);
        z50 z50Var = new z50(bundle, ywVar2);
        z50Var.d = d60Var.f46284g0;
        z50Var.Z();
        d60Var.f46285h0.presentFragment(z50Var);
        org.telegram.messenger.g0.i3(new g50(2, z50Var, s2Var), 150L);
        return true;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
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
