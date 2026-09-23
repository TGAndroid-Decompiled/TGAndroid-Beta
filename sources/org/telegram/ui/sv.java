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
public final class sv implements View.OnClickListener {
    public final int f37449a;
    public final ry f37450b;

    public sv(ry ryVar, int i10) {
        this.f37449a = i10;
        this.f37450b = ryVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        ix ixVar;
        ix ixVar2;
        switch (this.f37449a) {
            case 0:
                ry ryVar = this.f37450b;
                if (ryVar.a4() && (arrayList = ryVar.D2) != null && !arrayList.isEmpty() && ryVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ryVar.D2.get(0);
                    bx bxVar = ryVar.B1;
                    if (bxVar != null) {
                        charSequence = bxVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = ryVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().J2(null, ryVar, ryVar.getResourceProvider());
                    PhotoViewer.t1().f31009p7 = true;
                    PhotoViewer.t1().f31017q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(ryVar.D2);
                    boolean[] zArr = new boolean[ryVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new xx(ryVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f30921f4 = true;
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
                ry ryVar2 = this.f37450b;
                ryVar2.O4(true, false, true, false);
                ryVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new mv(ryVar2, 3), 100L);
                return;
            case 2:
                ry ryVar3 = this.f37450b;
                if (ryVar3.G0 && (ixVar = ryVar3.E0) != null && !ixVar.g()) {
                    ryVar3.x4(true, true);
                    return;
                } else {
                    ryVar3.P4();
                    return;
                }
            case 3:
                ry ryVar4 = this.f37450b;
                if (ryVar4.G0 && (ixVar2 = ryVar4.E0) != null && !ixVar2.g()) {
                    ryVar4.x4(true, true);
                    return;
                } else {
                    ryVar4.P4();
                    return;
                }
            case 4:
                ry ryVar5 = this.f37450b;
                ryVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ryVar5.X2);
                ryVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                ry ryVar6 = this.f37450b;
                ArrayList arrayList4 = ryVar6.I2;
                if (ryVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    ryVar6.C2.u(ryVar6, arrayList5, ryVar6.B1.getFieldText(), false, ryVar6.J2, ryVar6.K2, ryVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f37450b.b4(true);
                return;
            case 7:
                this.f37450b.finishPreviewFragment();
                return;
            case 8:
                ry ryVar7 = this.f37450b;
                ryVar7.f37082z0.setIsEditing(false);
                ryVar7.I4(false);
                return;
            case 9:
                ry ryVar8 = this.f37450b;
                ryVar8.getClass();
                ryVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) ryVar8, 2, true));
                return;
            case 10:
                ry ryVar9 = this.f37450b;
                ryVar9.getContactsController().loadGlobalPrivacySetting();
                ryVar9.K4();
                return;
            case 11:
                this.f37450b.p4(view);
                return;
            case 12:
                ry.t0(this.f37450b);
                return;
            case 13:
                ry.J0(this.f37450b);
                return;
            case 14:
                ry.v0(this.f37450b);
                return;
            case 15:
                ry ryVar10 = this.f37450b;
                ryVar10.showDialog(org.telegram.ui.Components.e5.m(ryVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new vv(ryVar10, 1), new mv(ryVar10, 17), false, false, ryVar10.getResourceProvider()).f18414a);
                return;
            case 16:
                ry.C0(this.f37450b);
                return;
            case 17:
                ry.A0(this.f37450b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31139j0 = true;
                ry ryVar11 = this.f37450b;
                ryVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new mv(ryVar11, 21), 250L);
                return;
            case 19:
                ry.Z(this.f37450b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31139j0 = true;
                ry ryVar12 = this.f37450b;
                ryVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new mv(ryVar12, 15), 250L);
                return;
            case 21:
                z6 z6Var = new z6();
                ry ryVar13 = this.f37450b;
                ryVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new fw(ryVar13, 10), 250L);
                return;
            case 22:
                ry.D0(this.f37450b);
                return;
            case 23:
                ry.Y(this.f37450b);
                return;
            case 24:
                ry.m0(this.f37450b);
                return;
            case 25:
                ry ryVar14 = this.f37450b;
                nf.f.s(ryVar14.getParentActivity(), ryVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                ry.l0(this.f37450b);
                return;
            case 27:
                ry.z0(this.f37450b);
                return;
            default:
                ry.X(this.f37450b);
                return;
        }
    }
}
