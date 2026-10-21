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
public final class yj0 extends pg.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
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
                return ((xj0) notificationsCustomSettingsActivity.I.get(i10)).f44296a;
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
            xj0 xj0Var = (xj0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((xj0) arrayList.get(i11)).f44296a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = b1Var.f45920f;
            View view = b1Var.f45917a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.l4) view).setText(xj0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.v8) view).f("" + ((Object) xj0Var.e), xj0Var.f43226i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.va) view).g(xj0Var.f43225g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.x8) view).b(xj0Var.h, "" + ((Object) xj0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    if (xj0Var.e == null) {
                        d9Var.setFixedSize(12);
                        d9Var.setText(null);
                        return;
                    }
                    d9Var.setFixedSize(0);
                    d9Var.setText(xj0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ba) view).c(xj0Var.e, xj0Var.f43224f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i5Var.setDrawLine(true);
                    i5Var.setChecked(xj0Var.f43226i);
                    i5Var.b(xj0Var.e, xj0Var.f43224f, xj0Var.d, xj0Var.f43226i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (xj0Var.d == 0) {
                        q8Var.e(-1, org.telegram.ui.ActionBar.h6.f21211p7);
                        q8Var.i("" + ((Object) xj0Var.e), z10);
                        return;
                    }
                    q8Var.e(org.telegram.ui.ActionBar.h6.f21323v6, org.telegram.ui.ActionBar.h6.f21306u6);
                    q8Var.m(xj0Var.d, "" + ((Object) xj0Var.e), z10);
                    return;
                case 8:
                    wj0 wj0Var = (wj0) view;
                    wj0Var.e(org.telegram.ui.ActionBar.h6.f21323v6, org.telegram.ui.ActionBar.h6.f21306u6);
                    CharSequence charSequence = xj0Var.e;
                    if (xj0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = wj0Var.R.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.mk.t(animate.rotation(f7), org.telegram.ui.Components.bs.h, 340L);
                    wj0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.va(context, 6, 0, false);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.x8(context, null);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 6:
                d6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.d, d6Var, true);
                break;
            case 7:
            default:
                l4Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                ?? q8Var = new org.telegram.ui.Cells.q8(context);
                ImageView imageView = new ImageView(context);
                q8Var.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21323v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                q8Var.addView(imageView, w7.z5.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                l4Var = q8Var;
                break;
        }
        return new s4.b1(l4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean isGlobalNotificationsEnabled;
        xj0 xj0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33212s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33213w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33210n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33213w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = b1Var.b();
            View view = b1Var.f45917a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                xj0Var = (xj0) arrayList3.get(b10);
            } else {
                xj0Var = null;
            }
            if (xj0Var == null || xj0Var.f43223c != 102) {
                int i11 = b1Var.f45920f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ba) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.x8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.v8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.l4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}
