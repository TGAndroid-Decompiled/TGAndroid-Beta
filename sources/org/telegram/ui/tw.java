package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class tw extends org.telegram.ui.ActionBar.j {
    public final ty f42132a;

    public tw(ty tyVar) {
        this.f42132a = tyVar;
    }

    @Override
    public final void b(int i10) {
        dy dyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ty tyVar = this.f42132a;
        ArrayList arrayList3 = tyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (dyVar = tyVar.C0) != null) {
            HashMap hashMap = dyVar.f25789z0;
            ty tyVar2 = dyVar.J0;
            if (i10 == 202) {
                if (tyVar2 != null && tyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar2.getParentActivity());
                    alertDialog$Builder.f20374a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20374a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.fe0(8));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(15, dyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (dyVar.N()) {
                    tyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) tyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    dyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                ty tyVar3 = new ty(org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true));
                tyVar3.C2 = new org.telegram.ui.Components.bw(dyVar, 18);
                tyVar2.presentFragment(tyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            nx nxVar = tyVar.F3;
            if (nxVar != null && nxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (kVar2.t()) {
                    dy dyVar2 = tyVar.C0;
                    if (dyVar2 != null && dyVar2.getVisibility() == 0) {
                        dy dyVar3 = tyVar.C0;
                        if (dyVar3.f25788y0) {
                            dyVar3.Q(false);
                            return;
                        }
                    }
                    tyVar.Y3(true);
                    return;
                }
                tyVar.F3.a();
                dy dyVar4 = tyVar.C0;
                if (dyVar4 != null) {
                    dyVar4.R();
                    return;
                }
                return;
            }
            qw qwVar = tyVar.f42276z0;
            if (qwVar == null || !qwVar.f24515n) {
                kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (kVar.t()) {
                    dy dyVar5 = tyVar.C0;
                    if (dyVar5 != null && dyVar5.getVisibility() == 0) {
                        dy dyVar6 = tyVar.C0;
                        if (dyVar6.f25788y0) {
                            dyVar6.Q(false);
                            return;
                        }
                    }
                    tyVar.Y3(true);
                    return;
                } else if (tyVar.f42208l2 || tyVar.V2 != 0 || tyVar.X2 != 0) {
                    tyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            qwVar.setIsEditing(false);
            tyVar.F4(false);
        } else if (i10 == 1) {
            if (tyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                tyVar.f42178f0.getLocationInWindow(iArr);
                ((LaunchActivity) tyVar.getParentActivity()).G0(false, true, (tyVar.f42178f0.getMeasuredWidth() / 2) + iArr[0], (tyVar.f42178f0.getMeasuredHeight() / 2) + iArr[1], new cj(this, 25));
                tyVar.getNotificationsController().showNotifications();
                tyVar.v3();
            }
        } else if (i10 == 3) {
            tyVar.L4(true, true, true, false);
            tyVar.Y.b(true);
        } else if (i10 == 11) {
            tyVar.m4(tyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.d10 d10Var = new org.telegram.ui.Components.d10(tyVar, arrayList3);
            d10Var.f25550r = new gu(this, 4);
            tyVar.showDialog(d10Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = tyVar.getMessagesController().getDialogFilters().get(tyVar.f42172e0[0].h);
            ArrayList J = org.telegram.ui.Components.d10.J(tyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                tyVar.showDialog(org.telegram.ui.Components.g5.M(tyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20374a);
                return;
            }
            if (!J.isEmpty()) {
                dialogFilter2.neverShow.addAll(J);
                for (int i13 = 0; i13 < J.size(); i13++) {
                    Long l4 = (Long) J.get(i13);
                    dialogFilter2.alwaysShow.remove(l4);
                    dialogFilter2.pinnedDialogs.delete(l4.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = J;
                i12 = 1;
                f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, tyVar, null);
            } else {
                arrayList = J;
                dialogFilter = dialogFilter2;
                i12 = 1;
            }
            if (arrayList.size() == i12) {
                arrayList2 = arrayList;
                z10 = false;
                j3 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z10 = false;
            }
            long j10 = j3;
            UndoView V3 = tyVar.V3();
            if (V3 != null) {
                V3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            tyVar.Y3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            tyVar.o4(tyVar.I2, i10, true, false, null);
        }
    }
}
