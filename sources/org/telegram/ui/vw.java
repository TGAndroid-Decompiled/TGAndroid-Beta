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
public final class vw extends org.telegram.ui.ActionBar.j {
    public final vy f42865a;

    public vw(vy vyVar) {
        this.f42865a = vyVar;
    }

    @Override
    public final void b(int i10) {
        fy fyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        vy vyVar = this.f42865a;
        ArrayList arrayList3 = vyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (fyVar = vyVar.C0) != null) {
            HashMap hashMap = fyVar.f27621z0;
            vy vyVar2 = fyVar.J0;
            if (i10 == 202) {
                if (vyVar2 != null && vyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vyVar2.getParentActivity());
                    alertDialog$Builder.f20142a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20142a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.je0(8));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(15, fyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (fyVar.N()) {
                    vyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) vyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    fyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                vy vyVar3 = new vy(org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true));
                vyVar3.C2 = new org.telegram.ui.Components.ew(fyVar, 18);
                vyVar2.presentFragment(vyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            px pxVar = vyVar.F3;
            if (pxVar != null && pxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                if (kVar2.u()) {
                    fy fyVar2 = vyVar.C0;
                    if (fyVar2 != null && fyVar2.getVisibility() == 0) {
                        fy fyVar3 = vyVar.C0;
                        if (fyVar3.f27620y0) {
                            fyVar3.Q(false);
                            return;
                        }
                    }
                    vyVar.Y3(true);
                    return;
                }
                vyVar.F3.a();
                fy fyVar4 = vyVar.C0;
                if (fyVar4 != null) {
                    fyVar4.R();
                    return;
                }
                return;
            }
            sw swVar = vyVar.f43009z0;
            if (swVar == null || !swVar.f25172n) {
                kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                if (kVar.u()) {
                    fy fyVar5 = vyVar.C0;
                    if (fyVar5 != null && fyVar5.getVisibility() == 0) {
                        fy fyVar6 = vyVar.C0;
                        if (fyVar6.f27620y0) {
                            fyVar6.Q(false);
                            return;
                        }
                    }
                    vyVar.Y3(true);
                    return;
                } else if (vyVar.f42941l2 || vyVar.V2 != 0 || vyVar.X2 != 0) {
                    vyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            swVar.setIsEditing(false);
            vyVar.F4(false);
        } else if (i10 == 1) {
            if (vyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                vyVar.f42911f0.getLocationInWindow(iArr);
                ((LaunchActivity) vyVar.getParentActivity()).G0(false, true, (vyVar.f42911f0.getMeasuredWidth() / 2) + iArr[0], (vyVar.f42911f0.getMeasuredHeight() / 2) + iArr[1], new gj(this, 25));
                vyVar.getNotificationsController().showNotifications();
                vyVar.v3();
            }
        } else if (i10 == 3) {
            vyVar.L4(true, true, true, false);
            vyVar.Y.b(true);
        } else if (i10 == 11) {
            vyVar.m4(vyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.g10 g10Var = new org.telegram.ui.Components.g10(vyVar, arrayList3);
            g10Var.f26216r = new ju(this, 4);
            vyVar.showDialog(g10Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = vyVar.getMessagesController().getDialogFilters().get(vyVar.f42905e0[0].h);
            ArrayList J = org.telegram.ui.Components.g10.J(vyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                vyVar.showDialog(org.telegram.ui.Components.g5.M(vyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20142a);
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
                h10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, vyVar, null);
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
            UndoView V3 = vyVar.V3();
            if (V3 != null) {
                V3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            vyVar.Y3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            vyVar.o4(vyVar.I2, i10, true, false, null);
        }
    }
}
