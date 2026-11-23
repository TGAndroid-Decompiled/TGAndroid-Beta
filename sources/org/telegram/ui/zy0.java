package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zy0 implements org.telegram.ui.Components.rj0, org.telegram.ui.Components.tj0, vw {
    public final SaveToGallerySettingsActivity f54751a;

    public zy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f54751a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f54751a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43837s;
        if (i7 == saveToGallerySettingsActivity.f43833e) {
            org.telegram.messenger.lv c02 = saveToGallerySettingsActivity.c0();
            c02.f25559a = !c02.f25559a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f43834f) {
            org.telegram.messenger.lv c03 = saveToGallerySettingsActivity.c0();
            c03.f25560b = !c03.f25560b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((bz0) arrayList.get(i7)).f56712a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f43830a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            bx bxVar = new bx(bundle);
            bxVar.E2 = new zy0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(bxVar);
        } else if (((bz0) arrayList.get(i7)).f56712a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((bz0) arrayList.get(i7)).f46674c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f43830a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((bz0) arrayList.get(i7)).f56712a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131747719, null), org.telegram.messenger.gd.N0(2131747720, null), org.telegram.messenger.gd.N0(2131751586, null), new qu0(saveToGallerySettingsActivity, 11), null).f28835a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.sr) arrayList.get(0)).f26946a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f54751a;
        bundle.putInt("type", saveToGallerySettingsActivity.f43830a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void l(float f10) {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f54751a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43837s;
        if (((bz0) arrayList.get(i7)).f56712a == 2) {
            org.telegram.messenger.kv kvVar = ((bz0) arrayList.get(i7)).f46674c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232111, org.telegram.messenger.gd.N0(2131751268, null), false, null);
            org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232113, org.telegram.messenger.gd.N0(2131751530, null), false, null);
            int i10 = org.telegram.ui.ActionBar.n6.f29672p7;
            c11.d(org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.b5.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c10.setOnClickListener(new bi.k5(saveToGallerySettingsActivity, N, i7, 20));
            c11.setOnClickListener(new y(saveToGallerySettingsActivity, N, kvVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
