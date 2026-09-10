package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class s41 implements org.telegram.ui.Components.kl0, org.telegram.ui.Components.ml0, qy {
    public final SaveToGallerySettingsActivity f36547a;

    public s41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f36547a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36547a;
        ArrayList arrayList = saveToGallerySettingsActivity.f30546s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f30543f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((v41) arrayList.get(i10)).f14046a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f30540a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            wy wyVar = new wy(bundle);
            wyVar.C2 = new s41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(wyVar);
        } else if (((v41) arrayList.get(i10)).f14046a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((v41) arrayList.get(i10)).f37409c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f30540a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((v41) arrayList.get(i10)).f14046a == 4) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new k01(saveToGallerySettingsActivity, 9), null).f17528a;
            d2Var.show();
            d2Var.h();
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36547a;
        bundle.putInt("type", saveToGallerySettingsActivity.f30540a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36547a;
        ArrayList arrayList = saveToGallerySettingsActivity.f30546s;
        if (((v41) arrayList.get(i10)).f14046a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((v41) arrayList.get(i10)).f37409c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.j6.f18144p7;
            c11.c(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.d5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new org.telegram.ui.Cells.wa(saveToGallerySettingsActivity, Q, i10, 14));
            c11.setOnClickListener(new a0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
