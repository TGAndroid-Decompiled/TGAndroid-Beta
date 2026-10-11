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
public final class sw extends org.telegram.ui.ActionBar.j {
    public final sy f41867a;

    public sw(sy syVar) {
        this.f41867a = syVar;
    }

    @Override
    public final void b(int i10) {
        cy cyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sy syVar = this.f41867a;
        ArrayList arrayList3 = syVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (cyVar = syVar.C0) != null) {
            HashMap hashMap = cyVar.f26460z0;
            sy syVar2 = cyVar.J0;
            if (i10 == 202) {
                if (syVar2 != null && syVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar2.getParentActivity());
                    alertDialog$Builder.f20368a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20368a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ae0(10));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(16, cyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (cyVar.N()) {
                    syVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) syVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    cyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                sy syVar3 = new sy(org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true));
                syVar3.C2 = new org.telegram.ui.Components.cw(cyVar, 18);
                syVar2.presentFragment(syVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            mx mxVar = syVar.F3;
            if (mxVar != null && mxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                if (kVar2.t()) {
                    cy cyVar2 = syVar.C0;
                    if (cyVar2 != null && cyVar2.getVisibility() == 0) {
                        cy cyVar3 = syVar.C0;
                        if (cyVar3.f26459y0) {
                            cyVar3.Q(false);
                            return;
                        }
                    }
                    syVar.Y3(true);
                    return;
                }
                syVar.F3.a();
                cy cyVar4 = syVar.C0;
                if (cyVar4 != null) {
                    cyVar4.R();
                    return;
                }
                return;
            }
            qw qwVar = syVar.f42011z0;
            if (qwVar == null || !qwVar.f24761n) {
                kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                if (kVar.t()) {
                    cy cyVar5 = syVar.C0;
                    if (cyVar5 != null && cyVar5.getVisibility() == 0) {
                        cy cyVar6 = syVar.C0;
                        if (cyVar6.f26459y0) {
                            cyVar6.Q(false);
                            return;
                        }
                    }
                    syVar.Y3(true);
                    return;
                } else if (syVar.f41943l2 || syVar.V2 != 0 || syVar.X2 != 0) {
                    syVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            qwVar.setIsEditing(false);
            syVar.F4(false);
        } else if (i10 == 1) {
            if (syVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                syVar.f41913f0.getLocationInWindow(iArr);
                ((LaunchActivity) syVar.getParentActivity()).G0(false, true, (syVar.f41913f0.getMeasuredWidth() / 2) + iArr[0], (syVar.f41913f0.getMeasuredHeight() / 2) + iArr[1], new cj(this, 25));
                syVar.getNotificationsController().showNotifications();
                syVar.v3();
            }
        } else if (i10 == 3) {
            syVar.L4(true, true, true, false);
            syVar.Y.b(true);
        } else if (i10 == 11) {
            syVar.m4(syVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.e10 e10Var = new org.telegram.ui.Components.e10(syVar, arrayList3);
            e10Var.f25797r = new fu(this, 4);
            syVar.showDialog(e10Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = syVar.getMessagesController().getDialogFilters().get(syVar.f41907e0[0].h);
            ArrayList J = org.telegram.ui.Components.e10.J(syVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                syVar.showDialog(org.telegram.ui.Components.g5.M(syVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20368a);
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
                e10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, syVar, null);
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
            UndoView V3 = syVar.V3();
            if (V3 != null) {
                V3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            syVar.Y3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            syVar.o4(syVar.I2, i10, true, false, null);
        }
    }
}
