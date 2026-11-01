package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class zz0 implements View.OnClickListener {
    public final int f44264a;
    public final Object f44265b;

    public zz0(Object obj, int i10) {
        this.f44264a = i10;
        this.f44265b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f7;
        switch (this.f44264a) {
            case 0:
                xz0 xz0Var = (xz0) ((jg.b1) this.f44265b).e;
                if (xz0Var != null) {
                    xz0Var.run();
                    return;
                }
                return;
            case 1:
                ((g01) this.f44265b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f44265b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f33974a);
                    org.telegram.messenger.cw cwVar = saveToGallerySettingsActivity.f33976c;
                    m10.put(cwVar.d, cwVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f33974a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.e30) this.f44265b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44265b;
                org.telegram.messenger.kj kjVar = secretMediaViewer.f33997f0;
                if (kjVar != null) {
                    TLRPC.Message message = kjVar.f16690k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        vh.p2 p2Var = secretMediaViewer.f34020r;
                        if (p2Var.V) {
                            p2Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.m();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                q31 q31Var = (q31) this.f44265b;
                if (q31Var.S1 instanceof TLRPC.User) {
                    vh.d dVar = q31Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        q31Var.e1((TLRPC.User) q31Var.S1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((o41) this.f44265b).f40043f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    u9.j0(sessionsActivity.getParentActivity(), 2, new m41(sessionsActivity));
                    return;
                }
                return;
            case 7:
                w71 w71Var = (w71) this.f44265b;
                org.telegram.messenger.uz.H0 = !org.telegram.messenger.uz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.uz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.t6.k(false, false);
                w71Var.f42718c.setChecked(org.telegram.messenger.uz.H0);
                org.telegram.ui.Cells.z9 z9Var = w71Var.f42716a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.E1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.at.e().k(276, new Object[0]);
                return;
            case 8:
                ((v91) this.f44265b).c(true);
                return;
            case 9:
                ((v91) ((mg.s) this.f44265b).f13228c).c(true);
                return;
            case 10:
                ca1 ca1Var = (ca1) this.f44265b;
                ArrayList arrayList = ca1Var.f36273f;
                HashSet hashSet = ca1Var.f36278x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User Z1 = ca1Var.getMessagesController().Z1(Long.valueOf(ca1Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19794id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ca1Var.getMessagesController().N3(chat, false);
                        ca1Var.getMessagesController().f0(chat.f19794id, Z1);
                    }
                    ca1Var.finishFragment();
                    return;
                }
                return;
            default:
                re1 re1Var = (re1) this.f44265b;
                re1Var.f41075a.c(!c2Var.b(), true);
                re1Var.f41077c.setEnabled(re1Var.f41075a.b());
                ViewPropertyAnimator animate = re1Var.f41077c.animate();
                if (re1Var.f41075a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
