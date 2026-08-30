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
    public final int f38115a;
    public final oy f38116b;

    public rv(oy oyVar, int i10) {
        this.f38115a = i10;
        this.f38116b = oyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        gx gxVar;
        gx gxVar2;
        switch (this.f38115a) {
            case 0:
                oy oyVar = this.f38116b;
                if (oyVar.a4() && (arrayList = oyVar.A2) != null && !arrayList.isEmpty() && oyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) oyVar.A2.get(0);
                    zw zwVar = oyVar.f37126y1;
                    if (zwVar != null) {
                        charSequence = zwVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = oyVar.A2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, oyVar, oyVar.getResourceProvider());
                    PhotoViewer.t1().f31809m7 = true;
                    PhotoViewer.t1().f31819n7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(oyVar.A2);
                    boolean[] zArr = new boolean[oyVar.A2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new ux(oyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f31718c4 = true;
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
                oy oyVar2 = this.f38116b;
                oyVar2.O4(true, false, true, false);
                oyVar2.V.b(true);
                AndroidUtilities.runOnUIThread(new mv(oyVar2, 3), 100L);
                return;
            case 2:
                oy oyVar3 = this.f38116b;
                if (oyVar3.D0 && (gxVar = oyVar3.B0) != null && !gxVar.g()) {
                    oyVar3.x4(true, true);
                    return;
                } else {
                    oyVar3.P4();
                    return;
                }
            case 3:
                oy oyVar4 = this.f38116b;
                if (oyVar4.D0 && (gxVar2 = oyVar4.B0) != null && !gxVar2.g()) {
                    oyVar4.x4(true, true);
                    return;
                } else {
                    oyVar4.P4();
                    return;
                }
            case 4:
                oy oyVar5 = this.f38116b;
                oyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", oyVar5.U2);
                oyVar5.presentFragment(new sh.q(bundle));
                return;
            case 5:
                oy oyVar6 = this.f38116b;
                ArrayList arrayList4 = oyVar6.F2;
                if (oyVar6.f37131z2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    oyVar6.f37131z2.w(oyVar6, arrayList5, oyVar6.f37126y1.getFieldText(), false, oyVar6.G2, oyVar6.H2, oyVar6.I2, null);
                    return;
                }
                return;
            case 6:
                this.f38116b.b4(true);
                return;
            case 7:
                this.f38116b.finishPreviewFragment();
                return;
            case 8:
                oy oyVar7 = this.f38116b;
                oyVar7.f37115w0.setIsEditing(false);
                oyVar7.I4(false);
                return;
            case 9:
                oy oyVar8 = this.f38116b;
                oyVar8.getClass();
                oyVar8.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) oyVar8, 2, true));
                return;
            case 10:
                oy oyVar9 = this.f38116b;
                oyVar9.getContactsController().loadGlobalPrivacySetting();
                oyVar9.K4();
                return;
            case 11:
                this.f38116b.p4(view);
                return;
            case 12:
                oy.s0(this.f38116b);
                return;
            case 13:
                oy.J0(this.f38116b);
                return;
            case 14:
                oy.u0(this.f38116b);
                return;
            case 15:
                oy oyVar10 = this.f38116b;
                oyVar10.showDialog(org.telegram.ui.Components.z4.m(oyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new uv(oyVar10, 1), new mv(oyVar10, 17), false, false, oyVar10.getResourceProvider()).f19525a);
                return;
            case 16:
                oy.C0(this.f38116b);
                return;
            case 17:
                oy.z0(this.f38116b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f31961g0 = true;
                oy oyVar11 = this.f38116b;
                oyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new mv(oyVar11, 21), 250L);
                return;
            case 19:
                oy.Z(this.f38116b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f31961g0 = true;
                oy oyVar12 = this.f38116b;
                oyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new mv(oyVar12, 15), 250L);
                return;
            case 21:
                b7 b7Var = new b7();
                oy oyVar13 = this.f38116b;
                oyVar13.presentFragment(b7Var);
                AndroidUtilities.runOnUIThread(new dw(oyVar13, 10), 250L);
                return;
            case 22:
                oy.D0(this.f38116b);
                return;
            case 23:
                oy.Y(this.f38116b);
                return;
            case 24:
                oy.l0(this.f38116b);
                return;
            case 25:
                oy oyVar14 = this.f38116b;
                af.g.s(oyVar14.getParentActivity(), oyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                oy.k0(this.f38116b);
                return;
            case 27:
                oy.y0(this.f38116b);
                return;
            default:
                oy.X(this.f38116b);
                return;
        }
    }
}
