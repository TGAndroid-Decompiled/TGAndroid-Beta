package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rw0 implements Runnable {
    public final int f49584a;
    public final Object f49585b;
    public final Object f49586c;

    public rw0(int i7, Object obj, Object obj2) {
        this.f49584a = i7;
        this.f49585b = obj;
        this.f49586c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xi0 xi0Var;
        int i7 = this.f49584a;
        int i10 = 0;
        Object obj = this.f49586c;
        Object obj2 = this.f49585b;
        switch (i7) {
            case 0:
                yw0 yw0Var = (yw0) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yw0Var.d.addAll(arrayList);
                int i11 = yw0Var.f52138f;
                org.telegram.messenger.qp.s1(i11).f24867p2 = arrayList;
                org.telegram.messenger.qp.s1(i11).f24876q2 = yw0Var.E;
                if (!yw0Var.f52143x) {
                    yw0Var.f();
                    return;
                }
                return;
            case 1:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.f44828f.add((ex0) obj);
                cx0Var.a();
                return;
            case 2:
                ry0 ry0Var = (ry0) ((View[]) obj2)[0];
                ry0Var.f49596b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                ry0Var.f49597c = null;
                ry0Var.d = null;
                ry0Var.f49599f.f37496f3.O(false);
                return;
            case 3:
                ((ry0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 4:
                ry0 ry0Var2 = (ry0) ((View[]) obj2)[0];
                ry0Var2.f49596b = null;
                ry0Var2.f49597c = (TLRPC.TL_reportResultChooseOption) obj;
                ry0Var2.d = null;
                ry0Var2.f49599f.f37496f3.O(false);
                return;
            case 5:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.gc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 6:
                org.telegram.ui.Components.gc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.r80) obj);
                return;
            case 7:
                ((SecretMediaViewer) obj2).K = false;
                ((zq0) obj).f52503a.O0(false, true);
                return;
            case 8:
                ((SecretMediaViewer) ((j2.n) obj2).f16457c).i((File) obj);
                return;
            case 9:
                t11 t11Var = (t11) obj2;
                t11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, t11Var.L0));
                Runnable runnable = t11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.gc.a0((o31) obj2).k(false).j();
                return;
            case 11:
                o31.b0((o31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new v31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                return;
            case 13:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                return;
            case 14:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    return;
                }
                return;
            case 15:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.m6.f28237w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.m6.f28237w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.m6.f28256x), Double.valueOf(org.telegram.ui.ActionBar.m6.f28275y));
                }
                org.telegram.ui.ActionBar.m6.w1();
                org.telegram.ui.Components.pj0 pj0Var = themeActivity2.f42011b;
                if (pj0Var != null && (xi0Var = (org.telegram.ui.Components.xi0) pj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = xi0Var.f57052a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.m6.f28237w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x71 x71Var = (x71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (x71Var.f51600n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    x71Var.B0.c(x71Var.L0[0]);
                    return;
                }
                return;
            case 17:
                a81.c0((a81) obj2, (String) obj);
                return;
            case 18:
                a81.a0((a81) obj2, (TLRPC.TL_theme) obj);
                return;
            case 19:
                i81 i81Var = (i81) obj2;
                i81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                i81Var.c(true);
                return;
            case 20:
                i81 i81Var2 = (i81) obj2;
                i81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                i81Var2.c(true);
                return;
            case 21:
                g91 g91Var = (g91) obj2;
                g91Var.getClass();
                Bundle bundle = new Bundle();
                z91 z91Var = g91Var.f46052b;
                bundle.putLong("dialog_id", -z91Var.f52343a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f27012id);
                z91Var.presentFragment(new lx0(bundle, null));
                return;
            case 22:
                v91 v91Var = (v91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = v91Var.f50666e0;
                z91 z91Var2 = v91Var.f50682v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList4 = z91Var2.f52346b;
                    if (i12 < arrayList4.size()) {
                        if (((r91) arrayList4.get(i12)).f49322c != null && ((r91) arrayList4.get(i12)).f49322c.title.toLowerCase().contains(lowerCase)) {
                            arrayList3.add(((r91) arrayList4.get(i12)).f49322c);
                            ((r91) arrayList4.get(i12)).f49322c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList3);
                        v91Var.N();
                        if (!arrayList2.isEmpty()) {
                            v91Var.f50674n0 = false;
                            v91Var.f50677q0.b(0);
                        }
                        v91Var.L(str2);
                        return;
                    }
                }
                break;
            case 23:
                ca1 ca1Var = ((ba1) obj2).f43996b;
                ca1Var.f44287a.f45672e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f27012id));
                ca1Var.f44287a.a0();
                return;
            case 24:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 25:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 26:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 27:
                cb1.l0((cb1) obj2, (String) obj);
                return;
            case 28:
                Runnable runnable2 = (Runnable) obj;
                er[] erVarArr = ((cb1) obj2).f44311x.f44118f;
                int length = erVarArr.length;
                while (i10 < length) {
                    erVarArr[i10].C(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            default:
                hb1 hb1Var = (hb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = hb1Var.f46295f;
                ArrayList arrayList6 = hb1Var.f46294e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(hb1Var.f46291a).S3(arrayList6, false);
                hb1Var.d = false;
                hb1Var.f46293c = true;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj3 = arrayList5.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList5.clear();
                return;
        }
    }
}
