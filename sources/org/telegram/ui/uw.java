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
public final class uw extends org.telegram.ui.ActionBar.j {
    public final uy f38221a;

    public uw(uy uyVar) {
        this.f38221a = uyVar;
    }

    @Override
    public final void b(int i10) {
        ey eyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.f38221a;
        ArrayList arrayList3 = uyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (eyVar = uyVar.C0) != null) {
            HashMap hashMap = eyVar.A0;
            uy uyVar2 = eyVar.K0;
            if (i10 == 202) {
                if (uyVar2 != null && uyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar2.getParentActivity());
                    alertDialog$Builder.f18654a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f18654a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ig0(5));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.a3(14, eyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (eyVar.O()) {
                    uyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) uyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    eyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                uy uyVar3 = new uy(org.telegram.messenger.rk.e(3, "onlySelect", "dialogsType", true));
                uyVar3.C2 = new org.telegram.ui.Components.mv(eyVar, 18);
                uyVar2.presentFragment(uyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            ox oxVar = uyVar.F3;
            if (oxVar != null && oxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar2.s()) {
                    ey eyVar2 = uyVar.C0;
                    if (eyVar2 != null && eyVar2.getVisibility() == 0) {
                        ey eyVar3 = uyVar.C0;
                        if (eyVar3.f26218z0) {
                            eyVar3.R(false);
                            return;
                        }
                    }
                    uyVar.b4(true);
                    return;
                }
                uyVar.F3.a();
                ey eyVar4 = uyVar.C0;
                if (eyVar4 != null) {
                    eyVar4.S();
                    return;
                }
                return;
            }
            sw swVar = uyVar.f38360z0;
            if (swVar == null || !swVar.f25586n) {
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar.s()) {
                    ey eyVar5 = uyVar.C0;
                    if (eyVar5 != null && eyVar5.getVisibility() == 0) {
                        ey eyVar6 = uyVar.C0;
                        if (eyVar6.f26218z0) {
                            eyVar6.R(false);
                            return;
                        }
                    }
                    uyVar.b4(true);
                    return;
                } else if (uyVar.f38292l2 || uyVar.V2 != 0 || uyVar.X2 != 0) {
                    uyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            swVar.setIsEditing(false);
            uyVar.I4(false);
        } else if (i10 == 1) {
            if (uyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                uyVar.f38262f0.getLocationInWindow(iArr);
                ((LaunchActivity) uyVar.getParentActivity()).G0(false, true, (uyVar.f38262f0.getMeasuredWidth() / 2) + iArr[0], (uyVar.f38262f0.getMeasuredHeight() / 2) + iArr[1], new cj(this, 24));
                uyVar.getNotificationsController().showNotifications();
                uyVar.y3();
            }
        } else if (i10 == 3) {
            uyVar.O4(true, true, true, false);
            uyVar.Y.b(true);
        } else if (i10 == 11) {
            uyVar.p4(uyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(uyVar, arrayList3);
            n00Var.f26525r = new fu(this, 5);
            uyVar.showDialog(n00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = uyVar.getMessagesController().getDialogFilters().get(uyVar.f38256e0[0].h);
            ArrayList I = org.telegram.ui.Components.n00.I(uyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                uyVar.showDialog(org.telegram.ui.Components.d5.N(uyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f18654a);
                return;
            }
            if (!I.isEmpty()) {
                dialogFilter2.neverShow.addAll(I);
                for (int i13 = 0; i13 < I.size(); i13++) {
                    Long l4 = (Long) I.get(i13);
                    dialogFilter2.alwaysShow.remove(l4);
                    dialogFilter2.pinnedDialogs.delete(l4.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = I;
                i12 = 1;
                f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, uyVar, null);
            } else {
                arrayList = I;
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
            UndoView Y3 = uyVar.Y3();
            if (Y3 != null) {
                Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            uyVar.b4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            uyVar.r4(uyVar.I2, i10, true, false, null);
        }
    }
}
