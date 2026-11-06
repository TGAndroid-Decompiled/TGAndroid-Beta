package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yy0 implements org.telegram.ui.Components.cj0, org.telegram.ui.Components.ej0, qw {
    public final SaveToGallerySettingsActivity f52371a;

    public yy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f52371a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f52371a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41866s;
        if (i7 == saveToGallerySettingsActivity.f41862e) {
            org.telegram.messenger.rv c02 = saveToGallerySettingsActivity.c0();
            c02.f25342a = !c02.f25342a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f41863f) {
            org.telegram.messenger.rv c03 = saveToGallerySettingsActivity.c0();
            c03.f25343b = !c03.f25343b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((az0) arrayList.get(i7)).f54415a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f41859a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ww wwVar = new ww(bundle);
            wwVar.C2 = new yy0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(wwVar);
        } else if (((az0) arrayList.get(i7)).f54415a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((az0) arrayList.get(i7)).f44118c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f41859a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((az0) arrayList.get(i7)).f54415a == 4) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131747912, null), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131751599, null), new qu0(saveToGallerySettingsActivity, 11), null).f27292a;
            u1Var.show();
            u1Var.i();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.xr) arrayList.get(0)).f26505a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f52371a;
        bundle.putInt("type", saveToGallerySettingsActivity.f41859a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f52371a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41866s;
        if (((az0) arrayList.get(i7)).f54415a == 2) {
            org.telegram.messenger.qv qvVar = ((az0) arrayList.get(i7)).f44118c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232106, org.telegram.messenger.hd.M0(2131751281, null), false, null);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232108, org.telegram.messenger.hd.M0(2131751543, null), false, null);
            int i10 = org.telegram.ui.ActionBar.k6.f28069p7;
            c11.d(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.v4.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c10.setOnClickListener(new bi.la(saveToGallerySettingsActivity, N, i7, 17));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, N, qvVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
