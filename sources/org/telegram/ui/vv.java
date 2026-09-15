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
    public final int f38700a;
    public final uy f38701b;

    public vv(uy uyVar, int i10) {
        this.f38700a = i10;
        this.f38701b = uyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        lx lxVar;
        lx lxVar2;
        switch (this.f38700a) {
            case 0:
                uy uyVar = this.f38701b;
                if (uyVar.a4() && (arrayList = uyVar.D2) != null && !arrayList.isEmpty() && uyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) uyVar.D2.get(0);
                    ex exVar = uyVar.B1;
                    if (exVar != null) {
                        charSequence = exVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = uyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, uyVar, uyVar.getResourceProvider());
                    PhotoViewer.t1().f31037p7 = true;
                    PhotoViewer.t1().f31045q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(uyVar.D2);
                    boolean[] zArr = new boolean[uyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new ay(uyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f30949f4 = true;
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
                uy uyVar2 = this.f38701b;
                uyVar2.O4(true, false, true, false);
                uyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new pv(uyVar2, 3), 100L);
                return;
            case 2:
                uy uyVar3 = this.f38701b;
                if (uyVar3.G0 && (lxVar = uyVar3.E0) != null && !lxVar.g()) {
                    uyVar3.x4(true, true);
                    return;
                } else {
                    uyVar3.P4();
                    return;
                }
            case 3:
                uy uyVar4 = this.f38701b;
                if (uyVar4.G0 && (lxVar2 = uyVar4.E0) != null && !lxVar2.g()) {
                    uyVar4.x4(true, true);
                    return;
                } else {
                    uyVar4.P4();
                    return;
                }
            case 4:
                uy uyVar5 = this.f38701b;
                uyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uyVar5.X2);
                uyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                uy uyVar6 = this.f38701b;
                ArrayList arrayList4 = uyVar6.I2;
                if (uyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    uyVar6.C2.u(uyVar6, arrayList5, uyVar6.B1.getFieldText(), false, uyVar6.J2, uyVar6.K2, uyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f38701b.b4(true);
                return;
            case 7:
                this.f38701b.finishPreviewFragment();
                return;
            case 8:
                uy uyVar7 = this.f38701b;
                uyVar7.f38312z0.setIsEditing(false);
                uyVar7.I4(false);
                return;
            case 9:
                uy uyVar8 = this.f38701b;
                uyVar8.getClass();
                uyVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) uyVar8, 2, true));
                return;
            case 10:
                uy uyVar9 = this.f38701b;
                uyVar9.getContactsController().loadGlobalPrivacySetting();
                uyVar9.K4();
                return;
            case 11:
                this.f38701b.p4(view);
                return;
            case 12:
                uy.t0(this.f38701b);
                return;
            case 13:
                uy.J0(this.f38701b);
                return;
            case 14:
                uy.v0(this.f38701b);
                return;
            case 15:
                uy uyVar10 = this.f38701b;
                uyVar10.showDialog(org.telegram.ui.Components.c5.m(uyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new yv(uyVar10, 1), new pv(uyVar10, 17), false, false, uyVar10.getResourceProvider()).f18442a);
                return;
            case 16:
                uy.C0(this.f38701b);
                return;
            case 17:
                uy.A0(this.f38701b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31167j0 = true;
                uy uyVar11 = this.f38701b;
                uyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new pv(uyVar11, 21), 250L);
                return;
            case 19:
                uy.a0(this.f38701b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31167j0 = true;
                uy uyVar12 = this.f38701b;
                uyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new pv(uyVar12, 15), 250L);
                return;
            case 21:
                z6 z6Var = new z6();
                uy uyVar13 = this.f38701b;
                uyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new iw(uyVar13, 10), 250L);
                return;
            case 22:
                uy.D0(this.f38701b);
                return;
            case 23:
                uy.Z(this.f38701b);
                return;
            case 24:
                uy.m0(this.f38701b);
                return;
            case 25:
                uy uyVar14 = this.f38701b;
                nf.f.s(uyVar14.getParentActivity(), uyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                uy.l0(this.f38701b);
                return;
            case 27:
                uy.z0(this.f38701b);
                return;
            default:
                uy.Y(this.f38701b);
                return;
        }
    }
}
