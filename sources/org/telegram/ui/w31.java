package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w31 implements org.telegram.ui.Components.kl0, org.telegram.ui.Components.ml0, jy {
    public final SaveToGallerySettingsActivity f42370a;

    public w31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f42370a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f42370a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34757s;
        if (i10 == saveToGallerySettingsActivity.f34753e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f34754f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((z31) arrayList.get(i10)).f2505a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f34750a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            py pyVar = new py(bundle);
            pyVar.f40308z2 = new w31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(pyVar);
        } else if (((z31) arrayList.get(i10)).f2505a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((z31) arrayList.get(i10)).f43805c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f34750a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((z31) arrayList.get(i10)).f2505a == 4) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new xy0(saveToGallerySettingsActivity, 10), null).f21166a;
            d2Var.show();
            d2Var.h();
        }
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f42370a;
        bundle.putInt("type", saveToGallerySettingsActivity.f34750a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f42370a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34757s;
        if (((z31) arrayList.get(i10)).f2505a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((z31) arrayList.get(i10)).f43805c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.k6.f21876p7;
            c10.c(org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.z4.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c3.setOnClickListener(new eg.k2(saveToGallerySettingsActivity, Q, i10, 18));
            c10.setOnClickListener(new b0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
