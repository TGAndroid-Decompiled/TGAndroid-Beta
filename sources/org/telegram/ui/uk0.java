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
public final class uk0 extends pg.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public uk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
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
                return ((tk0) notificationsCustomSettingsActivity.I.get(i10)).f43203a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            tk0 tk0Var = (tk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((tk0) arrayList.get(i11)).f43203a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = b1Var.f44841f;
            View view = b1Var.f44838a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(tk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) tk0Var.e), tk0Var.f40407i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.xa) view).g(tk0Var.f40406g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(tk0Var.h, "" + ((Object) tk0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (tk0Var.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(tk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ca) view).c(tk0Var.e, tk0Var.f40405f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(tk0Var.f40407i);
                    j5Var.b(tk0Var.e, tk0Var.f40405f, tk0Var.d, tk0Var.f40407i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (tk0Var.d == 0) {
                        r8Var.e(-1, org.telegram.ui.ActionBar.g6.f20122p7);
                        r8Var.i("" + ((Object) tk0Var.e), z10);
                        return;
                    }
                    r8Var.e(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
                    r8Var.m(tk0Var.d, "" + ((Object) tk0Var.e), z10);
                    return;
                case 8:
                    sk0 sk0Var = (sk0) view;
                    sk0Var.e(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
                    CharSequence charSequence = tk0Var.e;
                    if (tk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = sk0Var.R.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.yh.s(animate.rotation(f7), org.telegram.ui.Components.es.h, 340L);
                    sk0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.xa(6, 0, context, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 6:
                c6Var = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, c6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                ?? r8Var = new org.telegram.ui.Cells.r8(context);
                ImageView imageView = new ImageView(context);
                r8Var.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f20233v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                r8Var.addView(imageView, w7.a6.a(24.0f, 17.0f, 0.0f, 17.0f, 0.0f, 24, i11 | 16));
                m4Var = r8Var;
                break;
        }
        return new s4.b1(m4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean isGlobalNotificationsEnabled;
        tk0 tk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f32159s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f32160w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f32157n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f32160w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = b1Var.b();
            View view = b1Var.f44838a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                tk0Var = (tk0) arrayList3.get(b10);
            } else {
                tk0Var = null;
            }
            if (tk0Var == null || tk0Var.f40404c != 102) {
                int i11 = b1Var.f44841f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ca) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.y8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.w8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}
