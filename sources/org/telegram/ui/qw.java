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
public final class qw extends org.telegram.ui.ActionBar.j {
    public final ty f36915a;

    public qw(ty tyVar) {
        this.f36915a = tyVar;
    }

    @Override
    public final void b(int i10) {
        ay ayVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ty tyVar = this.f36915a;
        ArrayList arrayList3 = tyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (ayVar = tyVar.C0) != null) {
            HashMap hashMap = ayVar.A0;
            ty tyVar2 = ayVar.K0;
            if (i10 == 202) {
                if (tyVar2 != null && tyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar2.getParentActivity());
                    alertDialog$Builder.f18655a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f18655a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.iw(17));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(15, ayVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (ayVar.O()) {
                    tyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) tyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    ayVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                ty tyVar3 = new ty(org.telegram.messenger.qk.e(3, "onlySelect", "dialogsType", true));
                tyVar3.C2 = new org.telegram.ui.Components.nv(ayVar, 18);
                tyVar2.presentFragment(tyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            kx kxVar = tyVar.F3;
            if (kxVar != null && kxVar.c()) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                if (lVar2.t()) {
                    ay ayVar2 = tyVar.C0;
                    if (ayVar2 != null && ayVar2.getVisibility() == 0) {
                        ay ayVar3 = tyVar.C0;
                        if (ayVar3.f26518z0) {
                            ayVar3.R(false);
                            return;
                        }
                    }
                    tyVar.k4(true);
                    return;
                }
                tyVar.F3.a();
                ay ayVar4 = tyVar.C0;
                if (ayVar4 != null) {
                    ayVar4.S();
                    return;
                }
                return;
            }
            iy iyVar = tyVar.f38079z0;
            if (iyVar == null || !iyVar.f26257n) {
                lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                if (lVar.t()) {
                    ay ayVar5 = tyVar.C0;
                    if (ayVar5 != null && ayVar5.getVisibility() == 0) {
                        ay ayVar6 = tyVar.C0;
                        if (ayVar6.f26518z0) {
                            ayVar6.R(false);
                            return;
                        }
                    }
                    tyVar.k4(true);
                    return;
                } else if (tyVar.f38012l2 || tyVar.V2 != 0 || tyVar.X2 != 0) {
                    tyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            iyVar.setIsEditing(false);
            tyVar.R4(false);
        } else if (i10 == 1) {
            if (tyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                tyVar.f37982f0.getLocationInWindow(iArr);
                ((LaunchActivity) tyVar.getParentActivity()).G0(false, true, (tyVar.f37982f0.getMeasuredWidth() / 2) + iArr[0], (tyVar.f37982f0.getMeasuredHeight() / 2) + iArr[1], new cj(this, 22));
                tyVar.getNotificationsController().showNotifications();
                tyVar.H3();
            }
        } else if (i10 == 3) {
            tyVar.X4(true, true, true, false);
            tyVar.Y.b(true);
        } else if (i10 == 11) {
            tyVar.y4(tyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(tyVar, arrayList3);
            p00Var.f27236r = new au(this, 6);
            tyVar.showDialog(p00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = tyVar.getMessagesController().getDialogFilters().get(tyVar.f37976e0[0].h);
            ArrayList I = org.telegram.ui.Components.p00.I(tyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                tyVar.showDialog(org.telegram.ui.Components.e5.N(tyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f18655a);
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
                e10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, tyVar, null);
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
            UndoView h42 = tyVar.h4();
            if (h42 != null) {
                h42.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            tyVar.k4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            tyVar.A4(tyVar.I2, i10, true, false, null);
        }
    }
}
