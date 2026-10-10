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
public final class uv implements View.OnClickListener {
    public final int f42612a;
    public final ty f42613b;

    public uv(ty tyVar, int i10) {
        this.f42612a = i10;
        this.f42613b = tyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        kx kxVar;
        kx kxVar2;
        switch (this.f42612a) {
            case 0:
                ty tyVar = this.f42613b;
                if (tyVar.X3() && (arrayList = tyVar.D2) != null && !arrayList.isEmpty() && tyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) tyVar.D2.get(0);
                    dx dxVar = tyVar.B1;
                    if (dxVar != null) {
                        charSequence = dxVar.getFieldText();
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
                    PhotoViewer.t1().K2(null, tyVar, tyVar.getResourceProvider());
                    PhotoViewer.t1().f34043p7 = true;
                    PhotoViewer.t1().f34051q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(tyVar.D2);
                    boolean[] zArr = new boolean[tyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new zx(tyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f33955f4 = true;
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
                ty tyVar2 = this.f42613b;
                tyVar2.L4(true, false, true, false);
                tyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new ov(tyVar2, 3), 100L);
                return;
            case 2:
                ty tyVar3 = this.f42613b;
                if (tyVar3.G0 && (kxVar = tyVar3.E0) != null && !kxVar.g()) {
                    tyVar3.u4(true, true);
                    return;
                } else {
                    tyVar3.M4();
                    return;
                }
            case 3:
                ty tyVar4 = this.f42613b;
                if (tyVar4.G0 && (kxVar2 = tyVar4.E0) != null && !kxVar2.g()) {
                    tyVar4.u4(true, true);
                    return;
                } else {
                    tyVar4.M4();
                    return;
                }
            case 4:
                ty tyVar5 = this.f42613b;
                tyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", tyVar5.X2);
                tyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                ty tyVar6 = this.f42613b;
                ArrayList arrayList4 = tyVar6.I2;
                if (tyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    tyVar6.C2.w(tyVar6, arrayList5, tyVar6.B1.getFieldText(), false, tyVar6.J2, tyVar6.K2, tyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f42613b.Y3(true);
                return;
            case 7:
                this.f42613b.finishPreviewFragment();
                return;
            case 8:
                ty tyVar7 = this.f42613b;
                tyVar7.f42322z0.setIsEditing(false);
                tyVar7.F4(false);
                return;
            case 9:
                ty tyVar8 = this.f42613b;
                tyVar8.getClass();
                tyVar8.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) tyVar8, 2, true));
                return;
            case 10:
                ty tyVar9 = this.f42613b;
                tyVar9.getContactsController().loadGlobalPrivacySetting();
                tyVar9.H4();
                return;
            case 11:
                this.f42613b.m4(view);
                return;
            case 12:
                ty.s0(this.f42613b);
                return;
            case 13:
                ty.G0(this.f42613b);
                return;
            case 14:
                ty.u0(this.f42613b);
                return;
            case 15:
                ty tyVar10 = this.f42613b;
                tyVar10.showDialog(org.telegram.ui.Components.g5.l(tyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new wv(tyVar10, 1), new ov(tyVar10, 18), false, false, tyVar10.getResourceProvider()).f20384a);
                return;
            case 16:
                ty.y0(this.f42613b);
                return;
            case 17:
                ty.x0(this.f42613b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f34177j0 = true;
                ty tyVar11 = this.f42613b;
                tyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ov(tyVar11, 22), 250L);
                return;
            case 19:
                ty.Y(this.f42613b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f34177j0 = true;
                ty tyVar12 = this.f42613b;
                tyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ov(tyVar12, 16), 250L);
                return;
            case 21:
                y6 y6Var = new y6();
                ty tyVar13 = this.f42613b;
                tyVar13.presentFragment(y6Var);
                AndroidUtilities.runOnUIThread(new hw(tyVar13, 11), 250L);
                return;
            case 22:
                ty.z0(this.f42613b);
                return;
            case 23:
                ty.X(this.f42613b);
                return;
            case 24:
                ty.k0(this.f42613b);
                return;
            case 25:
                ty tyVar14 = this.f42613b;
                of.f.s(tyVar14.getParentActivity(), tyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                ty.j0(this.f42613b);
                return;
            case 27:
                ty.w0(this.f42613b);
                return;
            default:
                ty.W(this.f42613b);
                return;
        }
    }
}
