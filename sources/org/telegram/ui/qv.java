package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qv implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.ik0, tx, org.telegram.ui.Components.du0, org.telegram.ui.Components.jk0, org.telegram.messenger.nc, OnCompleteListener, pt {
    public final int f40909a;
    public final Object f40910b;
    public final Object f40911c;

    public qv(int i10, Object obj, Object obj2) {
        this.f40909a = i10;
        this.f40910b = obj;
        this.f40911c = obj2;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        switch (this.f40909a) {
            case 2:
                zx.g0((zx) this.f40910b, (yx) this.f40911c, view, i10);
                return;
            case 3:
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f40910b, (Context) this.f40911c, view, i10, f7, f10);
                return;
            case 4:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.f40910b, (Context) this.f40911c, view, i10);
                return;
        }
    }

    @Override
    public void c(mt mtVar) {
        jl0 jl0Var = (jl0) this.f40910b;
        int intValue = ((Integer) ((View) this.f40911c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = jl0Var.Y[intValue];
        if (intValue == 5) {
            jl0Var.f38449s = mtVar.d;
        } else {
            jl0Var.f38458w = mtVar.d;
        }
        editTextBoldCursor.setText(mtVar.f39611a);
    }

    @Override
    public void d(org.telegram.messenger.nd ndVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40910b;
        int[] iArr = (int[]) this.f40911c;
        Pattern pattern = LaunchActivity.D1;
        int i10 = ndVar.h.I1;
        iArr[0] = i10;
        launchActivity.O0(i10);
        xb0 xb0Var = new xb0(2);
        xb0Var.I0(ndVar.h);
        xb0Var.N0 = new m4.x0(iArr, org.telegram.messenger.kj.B0(ndVar.h.f16690k), 8);
        launchActivity.t0(xb0Var);
    }

    @Override
    public boolean f(int i10, View view) {
        xb0 xb0Var = (xb0) this.f40910b;
        Context context = (Context) this.f40911c;
        if (xb0Var.O0 == 2) {
            Object J = xb0Var.R.J(i10);
            if (J instanceof rb0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, xb0Var.getParentActivity(), xb0Var.getResourceProvider(), true, true);
                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                b1Var.j(org.telegram.messenger.dd.L0(2131750482, null), 2131231104, null);
                b1Var.setOnClickListener(new vu(16, xb0Var, (rb0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                qb0 qb0Var = new qb0(xb0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                xb0Var.Q0 = qb0Var;
                qb0Var.setOutsideTouchable(true);
                xb0Var.Q0.setClippingEnabled(true);
                xb0Var.Q0.setInputMethodMode(2);
                xb0Var.Q0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                xb0Var.Q0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.i0.L(52.0f));
                xb0Var.Q0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f40909a;
        org.telegram.ui.ActionBar.x1 x1Var2 = null;
        int i12 = 0;
        Object obj = this.f40911c;
        Object obj2 = this.f40910b;
        switch (i11) {
            case 1:
                org.telegram.messenger.vi mediaDataController = ((zx) obj2).getMediaDataController();
                long j10 = ((TLRPC.User) obj).f19943id;
                for (int i13 = 0; i13 < mediaDataController.l1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i13)).peer.user_id == j10) {
                        mediaDataController.l1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().i1(j10);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ag.c3(6));
                        mediaDataController.getMessagesStorage().f16331a.c(new org.telegram.messenger.ed(mediaDataController, j10, 2, 2));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 2:
            case 4:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 27:
            default:
                qm0 qm0Var = (qm0) obj2;
                qm0Var.f40816b0 = true;
                qm0Var.f40813a0.email_unconfirmed_pattern = (String) obj;
                qm0Var.P0();
                return;
            case 3:
                org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19919id = bpVar.f15000a;
                zx zxVar = ((qx) obj2).f40919b;
                zxVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                zxVar.getMessagesController().e4(bpVar);
                org.telegram.messenger.is messagesStorage = zxVar.getMessagesStorage();
                messagesStorage.f16331a.c(new org.telegram.messenger.pi(29, messagesStorage, bpVar));
                return;
            case 5:
                e10 e10Var = (e10) obj2;
                org.telegram.messenger.bp bpVar2 = (org.telegram.messenger.bp) obj;
                FiltersSetupActivity filtersSetupActivity = e10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, filtersSetupActivity.getParentActivity(), null);
                    x1Var3.f21489i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19919id = bpVar2.f15000a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(e10Var, x1Var2, bpVar2, 10));
                return;
            case 6:
                a50 a50Var = (a50) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = a50Var.f35620k1;
                if (a50Var.q1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f19943id);
                        org.telegram.messenger.u3 u3Var = a50Var.R2;
                        long j11 = user.f19943id;
                        ArrayList arrayList = u3Var.f18371o;
                        if (!arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                            u3Var.z();
                            org.telegram.messenger.at.f(u3Var.C.f15043a).k(166, Long.valueOf(u3Var.f18362c), Long.valueOf(u3Var.f18361b.f19804id), Boolean.FALSE);
                        }
                        a50Var.m1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.wp.r1(cVar.f15043a).f0(a50Var.k1(), user2);
                    a50Var.m1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.wp.r1(cVar.f15043a).g0(a50Var.k1(), null, chat, false, false);
                    a50Var.m1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 7:
                u50 u50Var = (u50) obj2;
                u50Var.f41829y.e((TLRPC.User) obj);
                if (u50Var.f41808f.f26635r.length() > 0) {
                    u50Var.f41808f.f26635r.setText((CharSequence) null);
                    return;
                }
                return;
            case 8:
                u50 u50Var2 = (u50) obj2;
                u50Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i12 = 100;
                }
                u50Var2.r0(i12);
                return;
            case 10:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.ad) obj);
                return;
            case 11:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).t0((gf0) obj);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.dd.D0().d(((org.telegram.messenger.ad[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                return;
            case 20:
                ((ad0) obj2).G.x1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 21:
                dd0 dd0Var = (dd0) obj2;
                dd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", dd0Var.f36566r);
                bundle.putString("requestPhone", dd0Var.f36567s);
                bundle.putString("phoneHash", dd0Var.f36568w);
                bundle.putString("phoneCode", dd0Var.f36569x);
                dd0Var.D.D1(7, true, bundle, false);
                return;
            case 23:
                le0.n((le0) obj2, (Context) obj);
                return;
            case 25:
                jl0 jl0Var = (jl0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!jl0Var.f38456v0) {
                    jl0Var.f38451s1.clear();
                }
                jl0Var.f38453t1.clear();
                nk0 nk0Var = (nk0) jl0Var.B1;
                nk0Var.d.n1(jl0Var.E, jl0Var.F, jl0Var.G, zArr[0], null, null, nk0Var.f39922b);
                jl0Var.finishFragment();
                return;
            case 26:
                int[] iArr = ((jl0) obj2).f38464y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.dd.L0(2131747510, null));
                return;
            case 28:
                jl0.Z((jl0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f40909a) {
            case 2:
                return false;
            case 3:
            default:
                return false;
            case 4:
                return false;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f40909a) {
            case 19:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f40911c;
                gf0 gf0Var = ((vc0) this.f40910b).W;
                if (gf0Var.getParentActivity() != null) {
                    gf0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f40911c;
                gf0 gf0Var2 = ((yd0) this.f40910b).E;
                if (gf0Var2.getParentActivity() != null && !gf0Var2.getParentActivity().isFinishing()) {
                    gf0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap o02;
        xb0 xb0Var = (xb0) this.f40910b;
        rb0 rb0Var = (rb0) this.f40911c;
        if (z10 && !z11 && rb0Var.e != null && (o02 = xb0Var.o0(rb0Var)) != null) {
            rb0Var.e.f15874a.a(v7.n8.a(o02));
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f40909a;
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        d70 d70Var = (d70) this.f40911c;
        zx zxVar2 = (zx) this.f40910b;
        org.telegram.messenger.w2 w2Var = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = d70Var.f36517f0;
            org.telegram.messenger.w2 w2Var2 = new org.telegram.messenger.w2(((org.telegram.messenger.hs) arrayList.get(i12)).f16109a, 3);
            arrayList2.add(w2Var2);
            i12++;
            w2Var = w2Var2;
        }
        d70Var.f36515d0.h(d70Var.f36514c0, d70Var.f36517f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", d70Var.f36514c0);
        z60 z60Var = new z60(bundle, zxVar2);
        z60Var.d = d70Var.f36517f0;
        z60Var.Z();
        d70Var.f36518g0.presentFragment(z60Var);
        org.telegram.messenger.i0.h3(new y60(0, z60Var, w2Var), 150L);
        return true;
    }

    public qv(d70 d70Var, zx zxVar) {
        this.f40909a = 9;
        this.f40911c = d70Var;
        this.f40910b = zxVar;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
