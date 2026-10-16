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
public final class yw extends org.telegram.ui.ActionBar.j {
    public final yy f41968a;

    public yw(yy yyVar) {
        this.f41968a = yyVar;
    }

    @Override
    public final void b(int i10) {
        iy iyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yy yyVar = this.f41968a;
        ArrayList arrayList3 = yyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (iyVar = yyVar.C0) != null) {
            HashMap hashMap = iyVar.f31641z0;
            yy yyVar2 = iyVar.J0;
            if (i10 == 202) {
                if (yyVar2 != null && yyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar2.getParentActivity());
                    alertDialog$Builder.f19248a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f19248a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.co0(1));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.u2(17, iyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (iyVar.N()) {
                    yyVar2.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    iyVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                yy yyVar3 = new yy(org.telegram.messenger.sk.d(3, "onlySelect", "dialogsType", true));
                yyVar3.C2 = new org.telegram.ui.Components.xv(iyVar, 18);
                yyVar2.presentFragment(yyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            sx sxVar = yyVar.G3;
            if (sxVar != null && sxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (kVar2.t()) {
                    iy iyVar2 = yyVar.C0;
                    if (iyVar2 != null && iyVar2.getVisibility() == 0) {
                        iy iyVar3 = yyVar.C0;
                        if (iyVar3.f31640y0) {
                            iyVar3.Q(false);
                            return;
                        }
                    }
                    yyVar.Z3(true);
                    return;
                }
                yyVar.G3.a();
                iy iyVar4 = yyVar.C0;
                if (iyVar4 != null) {
                    iyVar4.R();
                    return;
                }
                return;
            }
            ww wwVar = yyVar.f42110z0;
            if (wwVar == null || !wwVar.f30377n) {
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (kVar.t()) {
                    iy iyVar5 = yyVar.C0;
                    if (iyVar5 != null && iyVar5.getVisibility() == 0) {
                        iy iyVar6 = yyVar.C0;
                        if (iyVar6.f31640y0) {
                            iyVar6.Q(false);
                            return;
                        }
                    }
                    yyVar.Z3(true);
                    return;
                } else if (yyVar.f42041l2 || yyVar.W2 != 0 || yyVar.Y2 != 0) {
                    yyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            wwVar.setIsEditing(false);
            yyVar.G4(false);
        } else if (i10 == 1) {
            if (yyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                yyVar.f42010f0.getLocationInWindow(iArr);
                ((LaunchActivity) yyVar.getParentActivity()).G0(false, true, (yyVar.f42010f0.getMeasuredWidth() / 2) + iArr[0], (yyVar.f42010f0.getMeasuredHeight() / 2) + iArr[1], new gj(this, 25));
                yyVar.getNotificationsController().showNotifications();
                yyVar.w3();
            }
        } else if (i10 == 3) {
            yyVar.M4(true, true, true, false);
            yyVar.Y.b(true);
        } else if (i10 == 11) {
            yyVar.n4(yyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(yyVar, arrayList3);
            z00Var.f31413r = new mu(this, 4);
            yyVar.showDialog(z00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = yyVar.getMessagesController().getDialogFilters().get(yyVar.f42004e0[0].h);
            ArrayList J = org.telegram.ui.Components.z00.J(yyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                yyVar.showDialog(org.telegram.ui.Components.g5.M(yyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f19248a);
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
                k10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, yyVar, null);
            } else {
                arrayList = J;
                dialogFilter = dialogFilter2;
                i12 = 1;
            }
            if (arrayList.size() == i12) {
                arrayList2 = arrayList;
                z10 = false;
                j10 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z10 = false;
            }
            long j11 = j10;
            UndoView W3 = yyVar.W3();
            if (W3 != null) {
                W3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            yyVar.Z3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            yyVar.p4(yyVar.I2, i10, true, false, null);
        }
    }
}
