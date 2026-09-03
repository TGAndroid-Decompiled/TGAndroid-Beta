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
public final class tv implements View.OnClickListener {
    public final int f38593a;
    public final qy f38594b;

    public tv(qy qyVar, int i10) {
        this.f38593a = i10;
        this.f38594b = qyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        ix ixVar;
        ix ixVar2;
        switch (this.f38593a) {
            case 0:
                qy qyVar = this.f38594b;
                if (qyVar.a4() && (arrayList = qyVar.A2) != null && !arrayList.isEmpty() && qyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) qyVar.A2.get(0);
                    bx bxVar = qyVar.f37644y1;
                    if (bxVar != null) {
                        charSequence = bxVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = qyVar.A2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, qyVar, qyVar.getResourceProvider());
                    PhotoViewer.t1().f31783m7 = true;
                    PhotoViewer.t1().f31793n7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(qyVar.A2);
                    boolean[] zArr = new boolean[qyVar.A2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new wx(qyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f31692c4 = true;
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
                qy qyVar2 = this.f38594b;
                qyVar2.O4(true, false, true, false);
                qyVar2.V.b(true);
                AndroidUtilities.runOnUIThread(new ov(qyVar2, 3), 100L);
                return;
            case 2:
                qy qyVar3 = this.f38594b;
                if (qyVar3.D0 && (ixVar = qyVar3.B0) != null && !ixVar.g()) {
                    qyVar3.x4(true, true);
                    return;
                } else {
                    qyVar3.P4();
                    return;
                }
            case 3:
                qy qyVar4 = this.f38594b;
                if (qyVar4.D0 && (ixVar2 = qyVar4.B0) != null && !ixVar2.g()) {
                    qyVar4.x4(true, true);
                    return;
                } else {
                    qyVar4.P4();
                    return;
                }
            case 4:
                qy qyVar5 = this.f38594b;
                qyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", qyVar5.U2);
                qyVar5.presentFragment(new sh.q(bundle));
                return;
            case 5:
                qy qyVar6 = this.f38594b;
                ArrayList arrayList4 = qyVar6.F2;
                if (qyVar6.f37649z2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    qyVar6.f37649z2.w(qyVar6, arrayList5, qyVar6.f37644y1.getFieldText(), false, qyVar6.G2, qyVar6.H2, qyVar6.I2, null);
                    return;
                }
                return;
            case 6:
                this.f38594b.b4(true);
                return;
            case 7:
                this.f38594b.finishPreviewFragment();
                return;
            case 8:
                qy qyVar7 = this.f38594b;
                qyVar7.f37633w0.setIsEditing(false);
                qyVar7.I4(false);
                return;
            case 9:
                qy qyVar8 = this.f38594b;
                qyVar8.getClass();
                qyVar8.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) qyVar8, 2, true));
                return;
            case 10:
                qy qyVar9 = this.f38594b;
                qyVar9.getContactsController().loadGlobalPrivacySetting();
                qyVar9.K4();
                return;
            case 11:
                this.f38594b.p4(view);
                return;
            case 12:
                qy.s0(this.f38594b);
                return;
            case 13:
                qy.J0(this.f38594b);
                return;
            case 14:
                qy.u0(this.f38594b);
                return;
            case 15:
                qy qyVar10 = this.f38594b;
                qyVar10.showDialog(org.telegram.ui.Components.z4.m(qyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new wv(qyVar10, 1), new ov(qyVar10, 17), false, false, qyVar10.getResourceProvider()).f19500a);
                return;
            case 16:
                qy.C0(this.f38594b);
                return;
            case 17:
                qy.z0(this.f38594b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31935g0 = true;
                qy qyVar11 = this.f38594b;
                qyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ov(qyVar11, 21), 250L);
                return;
            case 19:
                qy.Z(this.f38594b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31935g0 = true;
                qy qyVar12 = this.f38594b;
                qyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ov(qyVar12, 15), 250L);
                return;
            case 21:
                d7 d7Var = new d7();
                qy qyVar13 = this.f38594b;
                qyVar13.presentFragment(d7Var);
                AndroidUtilities.runOnUIThread(new fw(qyVar13, 10), 250L);
                return;
            case 22:
                qy.D0(this.f38594b);
                return;
            case 23:
                qy.Y(this.f38594b);
                return;
            case 24:
                qy.l0(this.f38594b);
                return;
            case 25:
                qy qyVar14 = this.f38594b;
                ze.d.s(qyVar14.getParentActivity(), qyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                qy.k0(this.f38594b);
                return;
            case 27:
                qy.y0(this.f38594b);
                return;
            default:
                qy.X(this.f38594b);
                return;
        }
    }
}
