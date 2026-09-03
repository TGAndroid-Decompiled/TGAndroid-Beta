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
    public final int f41317a;
    public final py f41318b;

    public sv(py pyVar, int i10) {
        this.f41317a = i10;
        this.f41318b = pyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        hx hxVar;
        hx hxVar2;
        switch (this.f41317a) {
            case 0:
                py pyVar = this.f41318b;
                if (pyVar.a4() && (arrayList = pyVar.A2) != null && !arrayList.isEmpty() && pyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) pyVar.A2.get(0);
                    ax axVar = pyVar.f40273y1;
                    if (axVar != null) {
                        charSequence = axVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = pyVar.A2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, pyVar, pyVar.getResourceProvider());
                    PhotoViewer.t1().f34335m7 = true;
                    PhotoViewer.t1().f34345n7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(pyVar.A2);
                    boolean[] zArr = new boolean[pyVar.A2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new vx(pyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f34243c4 = true;
                    CheckBox checkBox = t12.K0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.L0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                py pyVar2 = this.f41318b;
                pyVar2.O4(true, false, true, false);
                pyVar2.V.b(true);
                AndroidUtilities.runOnUIThread(new nv(pyVar2, 3), 100L);
                return;
            case 2:
                py pyVar3 = this.f41318b;
                if (pyVar3.D0 && (hxVar = pyVar3.B0) != null && !hxVar.g()) {
                    pyVar3.x4(true, true);
                    return;
                } else {
                    pyVar3.P4();
                    return;
                }
            case 3:
                py pyVar4 = this.f41318b;
                if (pyVar4.D0 && (hxVar2 = pyVar4.B0) != null && !hxVar2.g()) {
                    pyVar4.x4(true, true);
                    return;
                } else {
                    pyVar4.P4();
                    return;
                }
            case 4:
                py pyVar5 = this.f41318b;
                pyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", pyVar5.U2);
                pyVar5.presentFragment(new th.q(bundle));
                return;
            case 5:
                py pyVar6 = this.f41318b;
                ArrayList arrayList4 = pyVar6.F2;
                if (pyVar6.f40278z2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    pyVar6.f40278z2.v(pyVar6, arrayList5, pyVar6.f40273y1.getFieldText(), false, pyVar6.G2, pyVar6.H2, pyVar6.I2, null);
                    return;
                }
                return;
            case 6:
                this.f41318b.b4(true);
                return;
            case 7:
                this.f41318b.finishPreviewFragment();
                return;
            case 8:
                py pyVar7 = this.f41318b;
                pyVar7.f40262w0.setIsEditing(false);
                pyVar7.I4(false);
                return;
            case 9:
                py pyVar8 = this.f41318b;
                pyVar8.getClass();
                pyVar8.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) pyVar8, 2, true));
                return;
            case 10:
                py pyVar9 = this.f41318b;
                pyVar9.getContactsController().loadGlobalPrivacySetting();
                pyVar9.K4();
                return;
            case 11:
                this.f41318b.p4(view);
                return;
            case 12:
                py.s0(this.f41318b);
                return;
            case 13:
                py.J0(this.f41318b);
                return;
            case 14:
                py.u0(this.f41318b);
                return;
            case 15:
                py pyVar10 = this.f41318b;
                pyVar10.showDialog(org.telegram.ui.Components.z4.m(pyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new vv(pyVar10, 1), new nv(pyVar10, 17), false, false, pyVar10.getResourceProvider()).f21209a);
                return;
            case 16:
                py.C0(this.f41318b);
                return;
            case 17:
                py.z0(this.f41318b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f34491g0 = true;
                py pyVar11 = this.f41318b;
                pyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new nv(pyVar11, 21), 250L);
                return;
            case 19:
                py.Z(this.f41318b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f34491g0 = true;
                py pyVar12 = this.f41318b;
                pyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new nv(pyVar12, 15), 250L);
                return;
            case 21:
                b7 b7Var = new b7();
                py pyVar13 = this.f41318b;
                pyVar13.presentFragment(b7Var);
                AndroidUtilities.runOnUIThread(new ew(pyVar13, 10), 250L);
                return;
            case 22:
                py.D0(this.f41318b);
                return;
            case 23:
                py.Y(this.f41318b);
                return;
            case 24:
                py.l0(this.f41318b);
                return;
            case 25:
                py pyVar14 = this.f41318b;
                af.g.s(pyVar14.getParentActivity(), pyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                py.k0(this.f41318b);
                return;
            case 27:
                py.y0(this.f41318b);
                return;
            default:
                py.X(this.f41318b);
                return;
        }
    }
}
