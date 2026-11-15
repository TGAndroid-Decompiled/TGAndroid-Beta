package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wy0 implements org.telegram.ui.Components.hj0, org.telegram.ui.Components.jj0, sw {
    public final SaveToGallerySettingsActivity f53029a;

    public wy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f53029a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f53029a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43265s;
        if (i7 == saveToGallerySettingsActivity.f43261e) {
            org.telegram.messenger.pv c02 = saveToGallerySettingsActivity.c0();
            c02.f25992a = !c02.f25992a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f43262f) {
            org.telegram.messenger.pv c03 = saveToGallerySettingsActivity.c0();
            c03.f25993b = !c03.f25993b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((yy0) arrayList.get(i7)).f56015a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f43258a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            yw ywVar = new yw(bundle);
            ywVar.E2 = new wy0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(ywVar);
        } else if (((yy0) arrayList.get(i7)).f56015a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((yy0) arrayList.get(i7)).f53784c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f43258a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((yy0) arrayList.get(i7)).f56015a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131747914, null), org.telegram.messenger.hd.M0(2131751598, null), new pu0(saveToGallerySettingsActivity, 11), null).f28392a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.ur) arrayList.get(0)).f26860a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f53029a;
        bundle.putInt("type", saveToGallerySettingsActivity.f43258a);
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
    public boolean mo0f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f53029a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43265s;
        if (((yy0) arrayList.get(i7)).f56015a == 2) {
            org.telegram.messenger.ov ovVar = ((yy0) arrayList.get(i7)).f53784c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232107, org.telegram.messenger.hd.M0(2131751280, null), false, null);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232109, org.telegram.messenger.hd.M0(2131751542, null), false, null);
            int i10 = org.telegram.ui.ActionBar.j6.f29070p7;
            c11.d(org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.t4.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c10.setOnClickListener(new bi.x2(saveToGallerySettingsActivity, N, i7, 20));
            c11.setOnClickListener(new y(saveToGallerySettingsActivity, N, ovVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
