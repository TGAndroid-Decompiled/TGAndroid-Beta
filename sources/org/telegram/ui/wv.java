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
public final class wv implements View.OnClickListener {
    public final int f43679a;
    public final vy f43680b;

    public wv(vy vyVar, int i10) {
        this.f43679a = i10;
        this.f43680b = vyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        mx mxVar;
        mx mxVar2;
        switch (this.f43679a) {
            case 0:
                vy vyVar = this.f43680b;
                if (vyVar.X3() && (arrayList = vyVar.D2) != null && !arrayList.isEmpty() && vyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) vyVar.D2.get(0);
                    fx fxVar = vyVar.B1;
                    if (fxVar != null) {
                        charSequence = fxVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = vyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, vyVar, vyVar.getResourceProvider());
                    PhotoViewer.t1().f33842p7 = true;
                    PhotoViewer.t1().f33850q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(vyVar.D2);
                    boolean[] zArr = new boolean[vyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new cy(vyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f33754f4 = true;
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
                vy vyVar2 = this.f43680b;
                vyVar2.L4(true, false, true, false);
                vyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new rv(vyVar2, 3), 100L);
                return;
            case 2:
                vy vyVar3 = this.f43680b;
                if (vyVar3.G0 && (mxVar = vyVar3.E0) != null && !mxVar.g()) {
                    vyVar3.u4(true, true);
                    return;
                } else {
                    vyVar3.M4();
                    return;
                }
            case 3:
                vy vyVar4 = this.f43680b;
                if (vyVar4.G0 && (mxVar2 = vyVar4.E0) != null && !mxVar2.g()) {
                    vyVar4.u4(true, true);
                    return;
                } else {
                    vyVar4.M4();
                    return;
                }
            case 4:
                vy vyVar5 = this.f43680b;
                vyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", vyVar5.X2);
                vyVar5.presentFragment(new fi.s(bundle));
                return;
            case 5:
                vy vyVar6 = this.f43680b;
                ArrayList arrayList4 = vyVar6.I2;
                if (vyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    vyVar6.C2.w(vyVar6, arrayList5, vyVar6.B1.getFieldText(), false, vyVar6.J2, vyVar6.K2, vyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f43680b.Y3(true);
                return;
            case 7:
                this.f43680b.finishPreviewFragment();
                return;
            case 8:
                vy vyVar7 = this.f43680b;
                vyVar7.f43007z0.setIsEditing(false);
                vyVar7.F4(false);
                return;
            case 9:
                vy vyVar8 = this.f43680b;
                vyVar8.getClass();
                vyVar8.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) vyVar8, 2, true));
                return;
            case 10:
                vy vyVar9 = this.f43680b;
                vyVar9.getContactsController().loadGlobalPrivacySetting();
                vyVar9.H4();
                return;
            case 11:
                this.f43680b.m4(view);
                return;
            case 12:
                vy.s0(this.f43680b);
                return;
            case 13:
                vy.G0(this.f43680b);
                return;
            case 14:
                vy.u0(this.f43680b);
                return;
            case 15:
                vy vyVar10 = this.f43680b;
                vyVar10.showDialog(org.telegram.ui.Components.g5.l(vyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new yv(vyVar10, 1), new rv(vyVar10, 18), false, false, vyVar10.getResourceProvider()).f21484a);
                return;
            case 16:
                vy.y0(this.f43680b);
                return;
            case 17:
                vy.x0(this.f43680b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f33976j0 = true;
                vy vyVar11 = this.f43680b;
                vyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new rv(vyVar11, 22), 250L);
                return;
            case 19:
                vy.Y(this.f43680b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f33976j0 = true;
                vy vyVar12 = this.f43680b;
                vyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new rv(vyVar12, 16), 250L);
                return;
            case 21:
                b7 b7Var = new b7();
                vy vyVar13 = this.f43680b;
                vyVar13.presentFragment(b7Var);
                AndroidUtilities.runOnUIThread(new jw(vyVar13, 11), 250L);
                return;
            case 22:
                vy.z0(this.f43680b);
                return;
            case 23:
                vy.X(this.f43680b);
                return;
            case 24:
                vy.k0(this.f43680b);
                return;
            case 25:
                vy vyVar14 = this.f43680b;
                of.f.s(vyVar14.getParentActivity(), vyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                vy.j0(this.f43680b);
                return;
            case 27:
                vy.w0(this.f43680b);
                return;
            default:
                vy.W(this.f43680b);
                return;
        }
    }
}
