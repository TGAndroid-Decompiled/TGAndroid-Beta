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
public final class wj0 extends zf.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity f44312e;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f44312e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44312e.E.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44312e;
            if (i10 < notificationsCustomSettingsActivity.E.size()) {
                return ((vj0) notificationsCustomSettingsActivity.E.get(i10)).f50845a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        float f9;
        ArrayList arrayList = this.f44312e.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            vj0 vj0Var = (vj0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((vj0) arrayList.get(i11)).f50845a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = n1Var.f6436f;
            View view = n1Var.f6432a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.k4) view).setText(vj0Var.f43611e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.q8) view).f("" + ((Object) vj0Var.f43611e), vj0Var.f43614i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.sa) view).g(vj0Var.f43613g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.s8) view).b(vj0Var.h, "" + ((Object) vj0Var.f43611e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    if (vj0Var.f43611e == null) {
                        y8Var.setFixedSize(12);
                        y8Var.setText(null);
                        return;
                    }
                    y8Var.setFixedSize(0);
                    y8Var.setText(vj0Var.f43611e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.y9) view).c(vj0Var.f43611e, vj0Var.f43612f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                    h5Var.setDrawLine(true);
                    h5Var.setChecked(vj0Var.f43614i);
                    h5Var.b(vj0Var.f43611e, vj0Var.f43612f, vj0Var.d, vj0Var.f43614i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (vj0Var.d == 0) {
                        m8Var.e(-1, org.telegram.ui.ActionBar.g6.f23279p7);
                        m8Var.i("" + ((Object) vj0Var.f43611e), z10);
                        return;
                    }
                    m8Var.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                    m8Var.m(vj0Var.d, "" + ((Object) vj0Var.f43611e), z10);
                    return;
                case 8:
                    uj0 uj0Var = (uj0) view;
                    uj0Var.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                    CharSequence charSequence = vj0Var.f43611e;
                    if (vj0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = uj0Var.M.animate();
                    if (z11) {
                        f9 = 0.0f;
                    } else {
                        f9 = 180.0f;
                    }
                    b.q(animate.rotation(f9), org.telegram.ui.Components.jr.h, 340L);
                    uj0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44312e;
        Context context = this.d;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 1:
                k4Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.s8(context, null);
                break;
            case 4:
                k4Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 5:
                k4Var = new org.telegram.ui.Cells.y9(context);
                break;
            case 6:
                c6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                k4Var = new org.telegram.ui.Cells.h5(21, 64, this.d, c6Var, true);
                break;
            case 7:
            default:
                k4Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 8:
                ?? m8Var = new org.telegram.ui.Cells.m8(context);
                ImageView imageView = new ImageView(context);
                m8Var.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23383v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                m8Var.addView(imageView, i7.f6.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                k4Var = m8Var;
                break;
        }
        return new f2.n1(k4Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean isGlobalNotificationsEnabled;
        vj0 vj0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44312e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.E;
        int i10 = notificationsCustomSettingsActivity.f35617s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f35618w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f35615n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f35618w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = n1Var.b();
            View view = n1Var.f6432a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                vj0Var = (vj0) arrayList3.get(b10);
            } else {
                vj0Var = null;
            }
            if (vj0Var == null || vj0Var.f43610c != 102) {
                int i11 = n1Var.f6436f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.y9) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.s8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.q8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.k4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}
