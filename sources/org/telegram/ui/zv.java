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
public final class zv implements View.OnClickListener {
    public final int f42719a;
    public final yy f42720b;

    public zv(yy yyVar, int i10) {
        this.f42719a = i10;
        this.f42720b = yyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        px pxVar;
        px pxVar2;
        switch (this.f42719a) {
            case 0:
                yy yyVar = this.f42720b;
                if (yyVar.X3() && (arrayList = yyVar.D2) != null && !arrayList.isEmpty() && yyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) yyVar.D2.get(0);
                    ix ixVar = yyVar.B1;
                    if (ixVar != null) {
                        charSequence = ixVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = yyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, yyVar, yyVar.getResourceProvider());
                    PhotoViewer.t1().f32328p7 = true;
                    PhotoViewer.t1().f32336q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(yyVar.D2);
                    boolean[] zArr = new boolean[yyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new fy(yyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f32239f4 = true;
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
                yy yyVar2 = this.f42720b;
                yyVar2.L4(true, false, true, false);
                yyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new uv(yyVar2, 3), 100L);
                return;
            case 2:
                yy yyVar3 = this.f42720b;
                if (yyVar3.G0 && (pxVar = yyVar3.E0) != null && !pxVar.g()) {
                    yyVar3.u4(true, true);
                    return;
                } else {
                    yyVar3.M4();
                    return;
                }
            case 3:
                yy yyVar4 = this.f42720b;
                if (yyVar4.G0 && (pxVar2 = yyVar4.E0) != null && !pxVar2.g()) {
                    yyVar4.u4(true, true);
                    return;
                } else {
                    yyVar4.M4();
                    return;
                }
            case 4:
                yy yyVar5 = this.f42720b;
                yyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", yyVar5.X2);
                yyVar5.presentFragment(new gi.s(bundle));
                return;
            case 5:
                yy yyVar6 = this.f42720b;
                ArrayList arrayList4 = yyVar6.I2;
                if (yyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    yyVar6.C2.w(yyVar6, arrayList5, yyVar6.B1.getFieldText(), false, yyVar6.J2, yyVar6.K2, yyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f42720b.Y3(true);
                return;
            case 7:
                this.f42720b.finishPreviewFragment();
                return;
            case 8:
                yy yyVar7 = this.f42720b;
                yyVar7.f42430z0.setIsEditing(false);
                yyVar7.F4(false);
                return;
            case 9:
                yy yyVar8 = this.f42720b;
                yyVar8.getClass();
                yyVar8.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar8, 2, true));
                return;
            case 10:
                yy yyVar9 = this.f42720b;
                yyVar9.getContactsController().loadGlobalPrivacySetting();
                yyVar9.H4();
                return;
            case 11:
                this.f42720b.m4(view);
                return;
            case 12:
                yy.s0(this.f42720b);
                return;
            case 13:
                yy.G0(this.f42720b);
                return;
            case 14:
                yy.u0(this.f42720b);
                return;
            case 15:
                yy yyVar10 = this.f42720b;
                yyVar10.showDialog(org.telegram.ui.Components.g5.l(yyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new bw(yyVar10, 1), new uv(yyVar10, 18), false, false, yyVar10.getResourceProvider()).f20838a);
                return;
            case 16:
                yy.y0(this.f42720b);
                return;
            case 17:
                yy.x0(this.f42720b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f32458j0 = true;
                yy yyVar11 = this.f42720b;
                yyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new uv(yyVar11, 22), 250L);
                return;
            case 19:
                yy.Y(this.f42720b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f32458j0 = true;
                yy yyVar12 = this.f42720b;
                yyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new uv(yyVar12, 16), 250L);
                return;
            case 21:
                d7 d7Var = new d7();
                yy yyVar13 = this.f42720b;
                yyVar13.presentFragment(d7Var);
                AndroidUtilities.runOnUIThread(new nw(yyVar13, 11), 250L);
                return;
            case 22:
                yy.z0(this.f42720b);
                return;
            case 23:
                yy.X(this.f42720b);
                return;
            case 24:
                yy.k0(this.f42720b);
                return;
            case 25:
                yy yyVar14 = this.f42720b;
                pf.d.s(yyVar14.getParentActivity(), yyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                yy.j0(this.f42720b);
                return;
            case 27:
                yy.w0(this.f42720b);
                return;
            default:
                yy.W(this.f42720b);
                return;
        }
    }
}
