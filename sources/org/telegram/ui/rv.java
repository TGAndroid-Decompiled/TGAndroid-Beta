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
public final class rv implements View.OnClickListener {
    public final int f37493a;
    public final qy f37494b;

    public rv(qy qyVar, int i10) {
        this.f37493a = i10;
        this.f37494b = qyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        hx hxVar;
        hx hxVar2;
        switch (this.f37493a) {
            case 0:
                qy qyVar = this.f37494b;
                if (qyVar.a4() && (arrayList = qyVar.D2) != null && !arrayList.isEmpty() && qyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) qyVar.D2.get(0);
                    ax axVar = qyVar.B1;
                    if (axVar != null) {
                        charSequence = axVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = qyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().J2(null, qyVar, qyVar.getResourceProvider());
                    PhotoViewer.t1().f31323p7 = true;
                    PhotoViewer.t1().f31331q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(qyVar.D2);
                    boolean[] zArr = new boolean[qyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new wx(qyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f31235f4 = true;
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
                qy qyVar2 = this.f37494b;
                qyVar2.O4(true, false, true, false);
                qyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new lv(qyVar2, 3), 100L);
                return;
            case 2:
                qy qyVar3 = this.f37494b;
                if (qyVar3.G0 && (hxVar = qyVar3.E0) != null && !hxVar.g()) {
                    qyVar3.x4(true, true);
                    return;
                } else {
                    qyVar3.P4();
                    return;
                }
            case 3:
                qy qyVar4 = this.f37494b;
                if (qyVar4.G0 && (hxVar2 = qyVar4.E0) != null && !hxVar2.g()) {
                    qyVar4.x4(true, true);
                    return;
                } else {
                    qyVar4.P4();
                    return;
                }
            case 4:
                qy qyVar5 = this.f37494b;
                qyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", qyVar5.X2);
                qyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                qy qyVar6 = this.f37494b;
                ArrayList arrayList4 = qyVar6.I2;
                if (qyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    qyVar6.C2.u(qyVar6, arrayList5, qyVar6.B1.getFieldText(), false, qyVar6.J2, qyVar6.K2, qyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f37494b.b4(true);
                return;
            case 7:
                this.f37494b.finishPreviewFragment();
                return;
            case 8:
                qy qyVar7 = this.f37494b;
                qyVar7.f37136z0.setIsEditing(false);
                qyVar7.I4(false);
                return;
            case 9:
                qy qyVar8 = this.f37494b;
                qyVar8.getClass();
                qyVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) qyVar8, 2, true));
                return;
            case 10:
                qy qyVar9 = this.f37494b;
                qyVar9.getContactsController().loadGlobalPrivacySetting();
                qyVar9.K4();
                return;
            case 11:
                this.f37494b.p4(view);
                return;
            case 12:
                qy.t0(this.f37494b);
                return;
            case 13:
                qy.J0(this.f37494b);
                return;
            case 14:
                qy.v0(this.f37494b);
                return;
            case 15:
                qy qyVar10 = this.f37494b;
                qyVar10.showDialog(org.telegram.ui.Components.e5.m(qyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new uv(qyVar10, 1), new lv(qyVar10, 17), false, false, qyVar10.getResourceProvider()).f19949a);
                return;
            case 16:
                qy.C0(this.f37494b);
                return;
            case 17:
                qy.A0(this.f37494b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31453j0 = true;
                qy qyVar11 = this.f37494b;
                qyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new lv(qyVar11, 21), 250L);
                return;
            case 19:
                qy.Z(this.f37494b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31453j0 = true;
                qy qyVar12 = this.f37494b;
                qyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new lv(qyVar12, 15), 250L);
                return;
            case 21:
                z6 z6Var = new z6();
                qy qyVar13 = this.f37494b;
                qyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new ew(qyVar13, 10), 250L);
                return;
            case 22:
                qy.D0(this.f37494b);
                return;
            case 23:
                qy.Y(this.f37494b);
                return;
            case 24:
                qy.m0(this.f37494b);
                return;
            case 25:
                qy qyVar14 = this.f37494b;
                nf.f.s(qyVar14.getParentActivity(), qyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                qy.l0(this.f37494b);
                return;
            case 27:
                qy.z0(this.f37494b);
                return;
            default:
                qy.X(this.f37494b);
                return;
        }
    }
}
