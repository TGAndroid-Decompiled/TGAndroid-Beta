package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class vv implements View.OnClickListener {
    public final int f38714a;
    public final ty f38715b;

    public vv(ty tyVar, int i10) {
        this.f38714a = i10;
        this.f38715b = tyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        hx hxVar;
        hx hxVar2;
        switch (this.f38714a) {
            case 0:
                ty tyVar = this.f38715b;
                if (tyVar.j4() && (arrayList = tyVar.D2) != null && !arrayList.isEmpty() && tyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) tyVar.D2.get(0);
                    ax axVar = tyVar.B1;
                    if (axVar != null) {
                        charSequence = axVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = tyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().J2(null, tyVar, tyVar.getResourceProvider());
                    PhotoViewer.t1().f31326p7 = true;
                    PhotoViewer.t1().f31334q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(tyVar.D2);
                    boolean[] zArr = new boolean[tyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new vx(tyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f31238f4 = true;
                    CheckBox checkBox = t12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ty tyVar2 = this.f38715b;
                tyVar2.X4(true, false, true, false);
                tyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new nv(tyVar2, 21), 100L);
                return;
            case 2:
                ty tyVar3 = this.f38715b;
                if (tyVar3.G0 && (hxVar = tyVar3.E0) != null && !hxVar.g()) {
                    tyVar3.G4(true, true);
                    return;
                } else {
                    tyVar3.Y4();
                    return;
                }
            case 3:
                ty tyVar4 = this.f38715b;
                if (tyVar4.G0 && (hxVar2 = tyVar4.E0) != null && !hxVar2.g()) {
                    tyVar4.G4(true, true);
                    return;
                } else {
                    tyVar4.Y4();
                    return;
                }
            case 4:
                ty tyVar5 = this.f38715b;
                tyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", tyVar5.X2);
                tyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                ty tyVar6 = this.f38715b;
                ArrayList arrayList4 = tyVar6.I2;
                if (tyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    tyVar6.C2.u(tyVar6, arrayList5, tyVar6.B1.getFieldText(), false, tyVar6.J2, tyVar6.K2, tyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f38715b.k4(true);
                return;
            case 7:
                this.f38715b.finishPreviewFragment();
                return;
            case 8:
                ty tyVar7 = this.f38715b;
                tyVar7.f38079z0.setIsEditing(false);
                tyVar7.R4(false);
                return;
            case 9:
                ty tyVar8 = this.f38715b;
                tyVar8.getClass();
                tyVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) tyVar8, 2, true));
                return;
            case 10:
                ty tyVar9 = this.f38715b;
                tyVar9.getContactsController().loadGlobalPrivacySetting();
                tyVar9.T4();
                return;
            case 11:
                this.f38715b.y4(view);
                return;
            case 12:
                ty.t0(this.f38715b);
                return;
            case 13:
                ty.K0(this.f38715b);
                return;
            case 14:
                ty.v0(this.f38715b);
                return;
            case 15:
                ty tyVar10 = this.f38715b;
                tyVar10.showDialog(org.telegram.ui.Components.e5.m(tyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new qv(tyVar10, 1), new nv(tyVar10, 15), false, false, tyVar10.getResourceProvider()).f18683a);
                return;
            case 16:
                ty.D0(this.f38715b);
                return;
            case 17:
                ty.A0(this.f38715b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31456j0 = true;
                ty tyVar11 = this.f38715b;
                tyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new nv(tyVar11, 19), 250L);
                return;
            case 19:
                ty.Z(this.f38715b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31456j0 = true;
                ty tyVar12 = this.f38715b;
                tyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new nv(tyVar12, 13), 250L);
                return;
            case 21:
                b7 b7Var = new b7();
                ty tyVar13 = this.f38715b;
                tyVar13.presentFragment(b7Var);
                AndroidUtilities.runOnUIThread(new nv(tyVar13, 0), 250L);
                return;
            case 22:
                ty.E0(this.f38715b);
                return;
            case 23:
                ty.Y(this.f38715b);
                return;
            case 24:
                ty.z0(this.f38715b);
                return;
            case 25:
                ty.m0(this.f38715b);
                return;
            case 26:
                ty tyVar14 = this.f38715b;
                nf.f.s(tyVar14.getParentActivity(), tyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 27:
                ty.l0(this.f38715b);
                return;
            default:
                ty.X(this.f38715b);
                return;
        }
    }
}
