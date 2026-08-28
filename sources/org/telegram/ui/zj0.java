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
public final class zj0 extends wf.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity f45168e;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f45168e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f45168e.E.size();
    }

    @Override
    public final int j(int i9) {
        if (i9 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45168e;
            if (i9 < notificationsCustomSettingsActivity.E.size()) {
                return ((yj0) notificationsCustomSettingsActivity.E.get(i9)).f48814a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        float f10;
        ArrayList arrayList = this.f45168e.E;
        if (i9 >= 0 && i9 < arrayList.size()) {
            yj0 yj0Var = (yj0) arrayList.get(i9);
            boolean z11 = true;
            int i10 = i9 + 1;
            if (i10 < arrayList.size() && ((yj0) arrayList.get(i10)).f48814a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = q1Var.f5505f;
            View view = q1Var.f5501a;
            switch (i11) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(yj0Var.f44887e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.t8) view).f("" + ((Object) yj0Var.f44887e), yj0Var.f44890i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.va) view).g(yj0Var.f44889g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.v8) view).b(yj0Var.h, "" + ((Object) yj0Var.f44887e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    if (yj0Var.f44887e == null) {
                        b9Var.setFixedSize(12);
                        b9Var.setText(null);
                        return;
                    }
                    b9Var.setFixedSize(0);
                    b9Var.setText(yj0Var.f44887e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ba) view).c(yj0Var.f44887e, yj0Var.f44888f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(yj0Var.f44890i);
                    j5Var.b(yj0Var.f44887e, yj0Var.f44888f, yj0Var.d, yj0Var.f44890i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (yj0Var.d == 0) {
                        p8Var.e(-1, org.telegram.ui.ActionBar.f6.f23212p7);
                        p8Var.i("" + ((Object) yj0Var.f44887e), z10);
                        return;
                    }
                    p8Var.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                    p8Var.m(yj0Var.d, "" + ((Object) yj0Var.f44887e), z10);
                    return;
                case 8:
                    xj0 xj0Var = (xj0) view;
                    xj0Var.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                    CharSequence charSequence = yj0Var.f44887e;
                    if (yj0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = xj0Var.M.animate();
                    if (z11) {
                        f10 = 0.0f;
                    } else {
                        f10 = 180.0f;
                    }
                    org.telegram.messenger.ll.r(animate.rotation(f10), org.telegram.ui.Components.gr.h, 340L);
                    xj0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45168e;
        Context context = this.d;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.va(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.v8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 6:
                b6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, b6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                ?? p8Var = new org.telegram.ui.Cells.p8(context);
                ImageView imageView = new ImageView(context);
                p8Var.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23319v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                p8Var.addView(imageView, g7.e6.d(24, 24.0f, i10 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = p8Var;
                break;
        }
        return new f2.q1(m4Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean isGlobalNotificationsEnabled;
        yj0 yj0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45168e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.E;
        int i9 = notificationsCustomSettingsActivity.f35550s;
        if (i9 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f35551w) != null && arrayList2.isEmpty())) {
            if (i9 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f35548n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f35551w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i9);
            }
            int b10 = q1Var.b();
            View view = q1Var.f5501a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                yj0Var = (yj0) arrayList3.get(b10);
            } else {
                yj0Var = null;
            }
            if (yj0Var == null || yj0Var.f44886c != 102) {
                int i10 = q1Var.f5505f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ba) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.v8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.t8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}
