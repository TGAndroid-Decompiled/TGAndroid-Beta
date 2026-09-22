package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rk0 extends og.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public rk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.I.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
            if (i10 < notificationsCustomSettingsActivity.I.size()) {
                return ((qk0) notificationsCustomSettingsActivity.I.get(i10)).f15719a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            qk0 qk0Var = (qk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((qk0) arrayList.get(i11)).f15719a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = c1Var.f42998f;
            View view = c1Var.f42995a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.n4) view).setText(qk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.x8) view).f("" + ((Object) qk0Var.e), qk0Var.f36953i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.ab) view).g(qk0Var.f36952g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.z8) view).b(qk0Var.h, "" + ((Object) qk0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    if (qk0Var.e == null) {
                        f9Var.setFixedSize(12);
                        f9Var.setText(null);
                        return;
                    }
                    f9Var.setFixedSize(0);
                    f9Var.setText(qk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.fa) view).c(qk0Var.e, qk0Var.f36951f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                    k5Var.setDrawLine(true);
                    k5Var.setChecked(qk0Var.f36953i);
                    k5Var.b(qk0Var.e, qk0Var.f36951f, qk0Var.d, qk0Var.f36953i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (qk0Var.d == 0) {
                        s8Var.e(-1, org.telegram.ui.ActionBar.j6.f19330p7);
                        s8Var.i("" + ((Object) qk0Var.e), z10);
                        return;
                    }
                    s8Var.e(org.telegram.ui.ActionBar.j6.f19440v6, org.telegram.ui.ActionBar.j6.f19422u6);
                    s8Var.m(qk0Var.d, "" + ((Object) qk0Var.e), z10);
                    return;
                case 8:
                    pk0 pk0Var = (pk0) view;
                    pk0Var.e(org.telegram.ui.ActionBar.j6.f19440v6, org.telegram.ui.ActionBar.j6.f19422u6);
                    CharSequence charSequence = qk0Var.e;
                    if (qk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = pk0Var.Q.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.rk.s(animate.rotation(f7), org.telegram.ui.Components.qr.h, 340L);
                    pk0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View n4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.ab(context, 6, 0, false);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.z8(context, null);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.fa(context);
                break;
            case 6:
                f6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                n4Var = new org.telegram.ui.Cells.k5(21, 64, this.d, f6Var, true);
                break;
            case 7:
            default:
                n4Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                ?? s8Var = new org.telegram.ui.Cells.s8(context);
                ImageView imageView = new ImageView(context);
                s8Var.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19440v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                s8Var.addView(imageView, w7.y5.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                n4Var = s8Var;
                break;
        }
        return new s4.c1(n4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean isGlobalNotificationsEnabled;
        qk0 qk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f31175s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f31176w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f31173n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f31176w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = c1Var.b();
            View view = c1Var.f42995a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                qk0Var = (qk0) arrayList3.get(b10);
            } else {
                qk0Var = null;
            }
            if (qk0Var == null || qk0Var.f36950c != 102) {
                int i11 = c1Var.f42998f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.fa) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.z8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.x8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}
