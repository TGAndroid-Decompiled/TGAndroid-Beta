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
public final class ww extends org.telegram.ui.ActionBar.j {
    public final wy f39179a;

    public ww(wy wyVar) {
        this.f39179a = wyVar;
    }

    @Override
    public final void b(int i10) {
        gy gyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wy wyVar = this.f39179a;
        ArrayList arrayList3 = wyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (gyVar = wyVar.C0) != null) {
            HashMap hashMap = gyVar.A0;
            wy wyVar2 = gyVar.K0;
            if (i10 == 202) {
                if (wyVar2 != null && wyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar2.getParentActivity());
                    alertDialog$Builder.f18446a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f18446a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.bn0(1));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(13, gyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (gyVar.O()) {
                    wyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) wyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    gyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                wy wyVar3 = new wy(org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true));
                wyVar3.C2 = new org.telegram.ui.Components.lv(gyVar, 17);
                wyVar2.presentFragment(wyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            qx qxVar = wyVar.F3;
            if (qxVar != null && qxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                if (kVar2.s()) {
                    gy gyVar2 = wyVar.C0;
                    if (gyVar2 != null && gyVar2.getVisibility() == 0) {
                        gy gyVar3 = wyVar.C0;
                        if (gyVar3.f30570z0) {
                            gyVar3.R(false);
                            return;
                        }
                    }
                    wyVar.b4(true);
                    return;
                }
                wyVar.F3.a();
                gy gyVar4 = wyVar.C0;
                if (gyVar4 != null) {
                    gyVar4.S();
                    return;
                }
                return;
            }
            uw uwVar = wyVar.f39320z0;
            if (uwVar == null || !uwVar.f25492n) {
                kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                if (kVar.s()) {
                    gy gyVar5 = wyVar.C0;
                    if (gyVar5 != null && gyVar5.getVisibility() == 0) {
                        gy gyVar6 = wyVar.C0;
                        if (gyVar6.f30570z0) {
                            gyVar6.R(false);
                            return;
                        }
                    }
                    wyVar.b4(true);
                    return;
                } else if (wyVar.f39251l2 || wyVar.V2 != 0 || wyVar.X2 != 0) {
                    wyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            uwVar.setIsEditing(false);
            wyVar.I4(false);
        } else if (i10 == 1) {
            if (wyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                wyVar.f39221f0.getLocationInWindow(iArr);
                ((LaunchActivity) wyVar.getParentActivity()).G0(false, true, (wyVar.f39221f0.getMeasuredWidth() / 2) + iArr[0], (wyVar.f39221f0.getMeasuredHeight() / 2) + iArr[1], new ej(this, 24));
                wyVar.getNotificationsController().showNotifications();
                wyVar.y3();
            }
        } else if (i10 == 3) {
            wyVar.O4(true, true, true, false);
            wyVar.Y.b(true);
        } else if (i10 == 11) {
            wyVar.p4(wyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(wyVar, arrayList3);
            n00Var.f26296r = new gu(this, 5);
            wyVar.showDialog(n00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = wyVar.getMessagesController().getDialogFilters().get(wyVar.f39215e0[0].h);
            ArrayList I = org.telegram.ui.Components.n00.I(wyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                wyVar.showDialog(org.telegram.ui.Components.c5.N(wyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f18446a);
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
                h10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, wyVar, null);
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
            UndoView Y3 = wyVar.Y3();
            if (Y3 != null) {
                Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            wyVar.b4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            wyVar.r4(wyVar.I2, i10, true, false, null);
        }
    }
}
