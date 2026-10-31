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
public final class rv implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hk0, ux, org.telegram.ui.Components.cu0, org.telegram.ui.Components.ik0, org.telegram.messenger.mc, OnCompleteListener, qt {
    public final int f41297a;
    public final Object f41298b;
    public final Object f41299c;

    public rv(int i10, Object obj, Object obj2) {
        this.f41297a = i10;
        this.f41298b = obj;
        this.f41299c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        switch (this.f41297a) {
            case 2:
                ay.f0((ay) this.f41298b, (zx) this.f41299c, view, i10);
                return;
            case 3:
            default:
                NotificationsCustomSettingsActivity.Y((NotificationsCustomSettingsActivity) this.f41298b, (Context) this.f41299c, view, i10, f7, f10);
                return;
            case 4:
                FiltersSetupActivity.Y((FiltersSetupActivity) this.f41298b, (Context) this.f41299c, view, i10);
                return;
        }
    }

    @Override
    public void c(nt ntVar) {
        ll0 ll0Var = (ll0) this.f41298b;
        int intValue = ((Integer) ((View) this.f41299c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = ll0Var.Y[intValue];
        if (intValue == 5) {
            ll0Var.f39297s = ntVar.d;
        } else {
            ll0Var.f39306w = ntVar.d;
        }
        editTextBoldCursor.setText(ntVar.f40047a);
    }

    @Override
    public void d(org.telegram.messenger.md mdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41298b;
        int[] iArr = (int[]) this.f41299c;
        Pattern pattern = LaunchActivity.D1;
        int i10 = mdVar.h.I1;
        iArr[0] = i10;
        launchActivity.O0(i10);
        yb0 yb0Var = new yb0(2);
        yb0Var.H0(mdVar.h);
        yb0Var.N0 = new m4.x0(iArr, org.telegram.messenger.jj.B0(mdVar.h.f16337k), 8);
        launchActivity.t0(yb0Var);
    }

    @Override
    public boolean f(int i10, View view) {
        yb0 yb0Var = (yb0) this.f41298b;
        Context context = (Context) this.f41299c;
        if (yb0Var.O0 == 2) {
            Object J = yb0Var.R.J(i10);
            if (J instanceof sb0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, yb0Var.getParentActivity(), yb0Var.getResourceProvider(), true, true);
                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                b1Var.j(org.telegram.messenger.cd.L0(2131750482, null), 2131231104, null);
                b1Var.setOnClickListener(new wu(16, yb0Var, (sb0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                rb0 rb0Var = new rb0(yb0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                yb0Var.Q0 = rb0Var;
                rb0Var.setOutsideTouchable(true);
                yb0Var.Q0.setClippingEnabled(true);
                yb0Var.Q0.setInputMethodMode(2);
                yb0Var.Q0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                yb0Var.Q0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.i0.L(52.0f));
                yb0Var.Q0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f41297a;
        org.telegram.ui.ActionBar.x1 x1Var2 = null;
        int i12 = 0;
        Object obj = this.f41299c;
        Object obj2 = this.f41298b;
        switch (i11) {
            case 1:
                org.telegram.messenger.ui mediaDataController = ((ay) obj2).getMediaDataController();
                long j10 = ((TLRPC.User) obj).f19942id;
                for (int i13 = 0; i13 < mediaDataController.l1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i13)).peer.user_id == j10) {
                        mediaDataController.l1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().i1(j10);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ag.c3(6));
                        mediaDataController.getMessagesStorage().f15938a.c(new org.telegram.messenger.dd(mediaDataController, j10, 2, 2));
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
                sm0 sm0Var = (sm0) obj2;
                sm0Var.f41550b0 = true;
                sm0Var.f41547a0.email_unconfirmed_pattern = (String) obj;
                sm0Var.O0();
                return;
            case 3:
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19918id = apVar.f14645a;
                ay ayVar = ((rx) obj2).f41307b;
                ayVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ayVar.getMessagesController().e4(apVar);
                org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                messagesStorage.f15938a.c(new org.telegram.messenger.oi(29, messagesStorage, apVar));
                return;
            case 5:
                f10 f10Var = (f10) obj2;
                org.telegram.messenger.ap apVar2 = (org.telegram.messenger.ap) obj;
                FiltersSetupActivity filtersSetupActivity = f10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, filtersSetupActivity.getParentActivity(), null);
                    x1Var3.f21488i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f19918id = apVar2.f14645a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(f10Var, x1Var2, apVar2, 10));
                return;
            case 6:
                b50 b50Var = (b50) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = b50Var.f36036k1;
                if (b50Var.q1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f19942id);
                        org.telegram.messenger.u3 u3Var = b50Var.R2;
                        long j11 = user.f19942id;
                        ArrayList arrayList = u3Var.f18238o;
                        if (!arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                            u3Var.z();
                            org.telegram.messenger.zs.f(u3Var.C.f14863a).k(166, Long.valueOf(u3Var.f18229c), Long.valueOf(u3Var.f18228b.f19803id), Boolean.FALSE);
                        }
                        b50Var.m1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.vp.r1(cVar.f14863a).f0(b50Var.k1(), user2);
                    b50Var.m1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.vp.r1(cVar.f14863a).g0(b50Var.k1(), null, chat, false, false);
                    b50Var.m1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 7:
                v50 v50Var = (v50) obj2;
                v50Var.f42634y.e((TLRPC.User) obj);
                if (v50Var.f42613f.f26588r.length() > 0) {
                    v50Var.f42613f.f26588r.setText((CharSequence) null);
                    return;
                }
                return;
            case 8:
                v50 v50Var2 = (v50) obj2;
                v50Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i12 = 100;
                }
                v50Var2.q0(i12);
                return;
            case 10:
                LanguageSelectActivity.b0((LanguageSelectActivity) obj2, (org.telegram.messenger.zc) obj);
                return;
            case 11:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).t0((hf0) obj);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.cd.D0().d(((org.telegram.messenger.zc[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                return;
            case 20:
                ((bd0) obj2).G.w1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 21:
                ed0 ed0Var = (ed0) obj2;
                ed0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ed0Var.f37028r);
                bundle.putString("requestPhone", ed0Var.f37029s);
                bundle.putString("phoneHash", ed0Var.f37030w);
                bundle.putString("phoneCode", ed0Var.f37031x);
                ed0Var.D.C1(7, true, bundle, false);
                return;
            case 23:
                me0.n((me0) obj2, (Context) obj);
                return;
            case 25:
                ll0 ll0Var = (ll0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!ll0Var.f39304v0) {
                    ll0Var.f39299s1.clear();
                }
                ll0Var.f39301t1.clear();
                pk0 pk0Var = (pk0) ll0Var.B1;
                pk0Var.d.m1(ll0Var.E, ll0Var.F, ll0Var.G, zArr[0], null, null, pk0Var.f40681b);
                ll0Var.finishFragment();
                return;
            case 26:
                int[] iArr = ((ll0) obj2).f39312y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.cd.L0(2131747510, null));
                return;
            case 28:
                ll0.Y((ll0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f41297a) {
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
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        yb0 yb0Var = (yb0) this.f41298b;
        sb0 sb0Var = (sb0) this.f41299c;
        if (z10 && !z11 && sb0Var.e != null && (n02 = yb0Var.n0(sb0Var)) != null) {
            sb0Var.e.f15533a.a(v7.n8.a(n02));
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f41297a) {
            case 19:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f41299c;
                hf0 hf0Var = ((wc0) this.f41298b).W;
                if (hf0Var.getParentActivity() != null) {
                    hf0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f41299c;
                hf0 hf0Var2 = ((zd0) this.f41298b).E;
                if (hf0Var2.getParentActivity() != null && !hf0Var2.getParentActivity().isFinishing()) {
                    hf0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f41297a;
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        d70 d70Var = (d70) this.f41299c;
        ay ayVar2 = (ay) this.f41298b;
        org.telegram.messenger.w2 w2Var = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = d70Var.f36639f0;
            org.telegram.messenger.w2 w2Var2 = new org.telegram.messenger.w2(((org.telegram.messenger.gs) arrayList.get(i12)).f15760a, 3);
            arrayList2.add(w2Var2);
            i12++;
            w2Var = w2Var2;
        }
        d70Var.f36637d0.h(d70Var.f36636c0, d70Var.f36639f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", d70Var.f36636c0);
        z60 z60Var = new z60(bundle, ayVar2);
        z60Var.d = d70Var.f36639f0;
        z60Var.Y();
        d70Var.f36640g0.presentFragment(z60Var);
        org.telegram.messenger.i0.h3(new xs(29, z60Var, w2Var), 150L);
        return true;
    }

    public rv(d70 d70Var, ay ayVar) {
        this.f41297a = 9;
        this.f41299c = d70Var;
        this.f41298b = ayVar;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
