package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u41 implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.dm0, sy {
    public final SaveToGallerySettingsActivity f40263a;

    public u41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f40263a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40263a;
        ArrayList arrayList = saveToGallerySettingsActivity.f32427s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f32424f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((z41) arrayList.get(i10)).f42904a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f32421a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            yy yyVar = new yy(bundle);
            yyVar.C2 = new u41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(yyVar);
        } else if (((z41) arrayList.get(i10)).f42904a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((z41) arrayList.get(i10)).f42152c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f32421a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((z41) arrayList.get(i10)).f42904a == 4) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new tz0(saveToGallerySettingsActivity, 10), null).f19248a;
            a2Var.show();
            a2Var.h();
        }
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40263a;
        bundle.putInt("type", saveToGallerySettingsActivity.f32421a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40263a;
        ArrayList arrayList = saveToGallerySettingsActivity.f32427s;
        if (((z41) arrayList.get(i10)).f42904a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((z41) arrayList.get(i10)).f42152c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.g6.f19822p7;
            c11.c(org.telegram.ui.ActionBar.g6.x0(null, i11, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.g5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new org.telegram.ui.Cells.sa(saveToGallerySettingsActivity, P, i10, 15));
            c11.setOnClickListener(new a0(saveToGallerySettingsActivity, P, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
