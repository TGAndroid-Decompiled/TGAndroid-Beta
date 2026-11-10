package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class qy0 implements View.OnClickListener {
    public final int f49177a;
    public final Object f49178b;

    public qy0(Object obj, int i7) {
        this.f49177a = i7;
        this.f49178b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f10;
        switch (this.f49177a) {
            case 0:
                oy0 oy0Var = (oy0) ((bi.m5) this.f49178b).f4328e;
                if (oy0Var != null) {
                    oy0Var.run();
                    return;
                }
                return;
            case 1:
                ((wy0) this.f49178b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f49178b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41885a);
                    org.telegram.messenger.qv qvVar = saveToGallerySettingsActivity.f41887c;
                    m10.put(qvVar.d, qvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41885a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.m20) this.f49178b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f49178b;
                org.telegram.messenger.ij ijVar = secretMediaViewer.f41910f0;
                if (ijVar != null) {
                    TLRPC.Message message = ijVar.f23266k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.m3 m3Var = secretMediaViewer.f41932r;
                        if (m3Var.V) {
                            m3Var.f(true);
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
                d21 d21Var = (d21) this.f49178b;
                if (d21Var.V1 instanceof TLRPC.User) {
                    fi.d dVar = d21Var.f44887c2;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        d21Var.e1((TLRPC.User) d21Var.V1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((c31) this.f49178b).f44214f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    s9.j0(sessionsActivity.getParentActivity(), 2, new a31(sessionsActivity));
                    return;
                }
                return;
            case 7:
                i61 i61Var = (i61) this.f49178b;
                org.telegram.messenger.iz.H0 = !org.telegram.messenger.iz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.iz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.m6.k(false, false);
                i61Var.f46516c.setChecked(org.telegram.messenger.iz.H0);
                org.telegram.ui.Cells.z9 z9Var = i61Var.f46514a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.qs.e().k(276, new Object[0]);
                return;
            case 8:
                ((i81) this.f49178b).c(true);
                return;
            case 9:
                ((i81) ((bi.g5) this.f49178b).f3938c).c(true);
                return;
            case 10:
                p81 p81Var = (p81) this.f49178b;
                ArrayList arrayList = p81Var.f48718f;
                HashSet hashSet = p81Var.f48723x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = p81Var.getMessagesController().a2(Long.valueOf(p81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f26960id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        p81Var.getMessagesController().Q3(chat, false);
                        p81Var.getMessagesController().f0(chat.f26960id, a22);
                    }
                    p81Var.finishFragment();
                    return;
                }
                return;
            default:
                ad1 ad1Var = (ad1) this.f49178b;
                ad1Var.f43651a.c(!c2Var.b(), true);
                ad1Var.f43653c.setEnabled(ad1Var.f43651a.b());
                ViewPropertyAnimator animate = ad1Var.f43653c.animate();
                if (ad1Var.f43651a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
