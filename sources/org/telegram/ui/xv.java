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
public final class xv implements View.OnClickListener {
    public final int f39720a;
    public final wy f39721b;

    public xv(wy wyVar, int i10) {
        this.f39720a = i10;
        this.f39721b = wyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        nx nxVar;
        nx nxVar2;
        switch (this.f39720a) {
            case 0:
                wy wyVar = this.f39721b;
                if (wyVar.a4() && (arrayList = wyVar.D2) != null && !arrayList.isEmpty() && wyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) wyVar.D2.get(0);
                    gx gxVar = wyVar.B1;
                    if (gxVar != null) {
                        charSequence = gxVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = wyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().J2(null, wyVar, wyVar.getResourceProvider());
                    PhotoViewer.t1().f31055p7 = true;
                    PhotoViewer.t1().f31063q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(wyVar.D2);
                    boolean[] zArr = new boolean[wyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new dy(wyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f30967f4 = true;
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
                wy wyVar2 = this.f39721b;
                wyVar2.O4(true, false, true, false);
                wyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new rv(wyVar2, 3), 100L);
                return;
            case 2:
                wy wyVar3 = this.f39721b;
                if (wyVar3.G0 && (nxVar = wyVar3.E0) != null && !nxVar.g()) {
                    wyVar3.x4(true, true);
                    return;
                } else {
                    wyVar3.P4();
                    return;
                }
            case 3:
                wy wyVar4 = this.f39721b;
                if (wyVar4.G0 && (nxVar2 = wyVar4.E0) != null && !nxVar2.g()) {
                    wyVar4.x4(true, true);
                    return;
                } else {
                    wyVar4.P4();
                    return;
                }
            case 4:
                wy wyVar5 = this.f39721b;
                wyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", wyVar5.X2);
                wyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                wy wyVar6 = this.f39721b;
                ArrayList arrayList4 = wyVar6.I2;
                if (wyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    wyVar6.C2.u(wyVar6, arrayList5, wyVar6.B1.getFieldText(), false, wyVar6.J2, wyVar6.K2, wyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f39721b.b4(true);
                return;
            case 7:
                this.f39721b.finishPreviewFragment();
                return;
            case 8:
                wy wyVar7 = this.f39721b;
                wyVar7.f39325z0.setIsEditing(false);
                wyVar7.I4(false);
                return;
            case 9:
                wy wyVar8 = this.f39721b;
                wyVar8.getClass();
                wyVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) wyVar8, 2, true));
                return;
            case 10:
                wy wyVar9 = this.f39721b;
                wyVar9.getContactsController().loadGlobalPrivacySetting();
                wyVar9.K4();
                return;
            case 11:
                this.f39721b.p4(view);
                return;
            case 12:
                wy.t0(this.f39721b);
                return;
            case 13:
                wy.J0(this.f39721b);
                return;
            case 14:
                wy.v0(this.f39721b);
                return;
            case 15:
                wy wyVar10 = this.f39721b;
                wyVar10.showDialog(org.telegram.ui.Components.c5.m(wyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new aw(wyVar10, 1), new rv(wyVar10, 17), false, false, wyVar10.getResourceProvider()).f18471a);
                return;
            case 16:
                wy.C0(this.f39721b);
                return;
            case 17:
                wy.A0(this.f39721b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31185j0 = true;
                wy wyVar11 = this.f39721b;
                wyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new rv(wyVar11, 21), 250L);
                return;
            case 19:
                wy.a0(this.f39721b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31185j0 = true;
                wy wyVar12 = this.f39721b;
                wyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new rv(wyVar12, 15), 250L);
                return;
            case 21:
                a7 a7Var = new a7();
                wy wyVar13 = this.f39721b;
                wyVar13.presentFragment(a7Var);
                AndroidUtilities.runOnUIThread(new kw(wyVar13, 10), 250L);
                return;
            case 22:
                wy.D0(this.f39721b);
                return;
            case 23:
                wy.Z(this.f39721b);
                return;
            case 24:
                wy.m0(this.f39721b);
                return;
            case 25:
                wy wyVar14 = this.f39721b;
                nf.f.s(wyVar14.getParentActivity(), wyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                wy.l0(this.f39721b);
                return;
            case 27:
                wy.z0(this.f39721b);
                return;
            default:
                wy.Y(this.f39721b);
                return;
        }
    }
}
