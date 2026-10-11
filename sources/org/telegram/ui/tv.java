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
    public final int f42278a;
    public final sy f42279b;

    public tv(sy syVar, int i10) {
        this.f42278a = i10;
        this.f42279b = syVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        jx jxVar;
        jx jxVar2;
        switch (this.f42278a) {
            case 0:
                sy syVar = this.f42279b;
                if (syVar.X3() && (arrayList = syVar.D2) != null && !arrayList.isEmpty() && syVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) syVar.D2.get(0);
                    cx cxVar = syVar.B1;
                    if (cxVar != null) {
                        charSequence = cxVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = syVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, syVar, syVar.getResourceProvider());
                    PhotoViewer.t1().f34033p7 = true;
                    PhotoViewer.t1().f34041q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(syVar.D2);
                    boolean[] zArr = new boolean[syVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new yx(syVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f33945f4 = true;
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
                sy syVar2 = this.f42279b;
                syVar2.L4(true, false, true, false);
                syVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new nv(syVar2, 3), 100L);
                return;
            case 2:
                sy syVar3 = this.f42279b;
                if (syVar3.G0 && (jxVar = syVar3.E0) != null && !jxVar.g()) {
                    syVar3.u4(true, true);
                    return;
                } else {
                    syVar3.M4();
                    return;
                }
            case 3:
                sy syVar4 = this.f42279b;
                if (syVar4.G0 && (jxVar2 = syVar4.E0) != null && !jxVar2.g()) {
                    syVar4.u4(true, true);
                    return;
                } else {
                    syVar4.M4();
                    return;
                }
            case 4:
                sy syVar5 = this.f42279b;
                syVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", syVar5.X2);
                syVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                sy syVar6 = this.f42279b;
                ArrayList arrayList4 = syVar6.I2;
                if (syVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    syVar6.C2.w(syVar6, arrayList5, syVar6.B1.getFieldText(), false, syVar6.J2, syVar6.K2, syVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f42279b.Y3(true);
                return;
            case 7:
                this.f42279b.finishPreviewFragment();
                return;
            case 8:
                sy syVar7 = this.f42279b;
                syVar7.f42011z0.setIsEditing(false);
                syVar7.F4(false);
                return;
            case 9:
                sy syVar8 = this.f42279b;
                syVar8.getClass();
                syVar8.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) syVar8, 2, true));
                return;
            case 10:
                sy syVar9 = this.f42279b;
                syVar9.getContactsController().loadGlobalPrivacySetting();
                syVar9.H4();
                return;
            case 11:
                this.f42279b.m4(view);
                return;
            case 12:
                sy.s0(this.f42279b);
                return;
            case 13:
                sy.G0(this.f42279b);
                return;
            case 14:
                sy.u0(this.f42279b);
                return;
            case 15:
                sy syVar10 = this.f42279b;
                syVar10.showDialog(org.telegram.ui.Components.g5.l(syVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new vv(syVar10, 1), new nv(syVar10, 18), false, false, syVar10.getResourceProvider()).f21710a);
                return;
            case 16:
                sy.y0(this.f42279b);
                return;
            case 17:
                sy.x0(this.f42279b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f34167j0 = true;
                sy syVar11 = this.f42279b;
                syVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new nv(syVar11, 22), 250L);
                return;
            case 19:
                sy.Y(this.f42279b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f34167j0 = true;
                sy syVar12 = this.f42279b;
                syVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new nv(syVar12, 16), 250L);
                return;
            case 21:
                x6 x6Var = new x6();
                sy syVar13 = this.f42279b;
                syVar13.presentFragment(x6Var);
                AndroidUtilities.runOnUIThread(new gw(syVar13, 11), 250L);
                return;
            case 22:
                sy.z0(this.f42279b);
                return;
            case 23:
                sy.X(this.f42279b);
                return;
            case 24:
                sy.k0(this.f42279b);
                return;
            case 25:
                sy syVar14 = this.f42279b;
                of.f.s(syVar14.getParentActivity(), syVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                sy.j0(this.f42279b);
                return;
            case 27:
                sy.w0(this.f42279b);
                return;
            default:
                sy.W(this.f42279b);
                return;
        }
    }
}
