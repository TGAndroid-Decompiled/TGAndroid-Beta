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
    public final py f40703a;

    public qw(py pyVar) {
        this.f40703a = pyVar;
    }

    @Override
    public final void b(int i10) {
        yx yxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        py pyVar = this.f40703a;
        ArrayList arrayList3 = pyVar.F2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (yxVar = pyVar.f40276z0) != null) {
            HashMap hashMap = yxVar.f26341w0;
            py pyVar2 = yxVar.G0;
            if (i10 == 202) {
                if (pyVar2 != null && pyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar2.getParentActivity());
                    alertDialog$Builder.f21168a.O = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f21168a.Q = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.mh0(2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(22, yxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (yxVar.N()) {
                    pyVar2.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) pyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    yxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                py pyVar3 = new py(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
                pyVar3.f40278z2 = new org.telegram.ui.Components.hv(yxVar, 17);
                pyVar2.presentFragment(pyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            kx kxVar = pyVar.C3;
            if (kxVar != null && kxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (kVar2.s()) {
                    yx yxVar2 = pyVar.f40276z0;
                    if (yxVar2 != null && yxVar2.getVisibility() == 0) {
                        yx yxVar3 = pyVar.f40276z0;
                        if (yxVar3.f26340v0) {
                            yxVar3.Q(false);
                            return;
                        }
                    }
                    pyVar.b4(true);
                    return;
                }
                pyVar.C3.a();
                yx yxVar4 = pyVar.f40276z0;
                if (yxVar4 != null) {
                    yxVar4.R();
                    return;
                }
                return;
            }
            ow owVar = pyVar.f40262w0;
            if (owVar == null || !owVar.f28552n) {
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (kVar.s()) {
                    yx yxVar5 = pyVar.f40276z0;
                    if (yxVar5 != null && yxVar5.getVisibility() == 0) {
                        yx yxVar6 = pyVar.f40276z0;
                        if (yxVar6.f26340v0) {
                            yxVar6.Q(false);
                            return;
                        }
                    }
                    pyVar.b4(true);
                    return;
                } else if (pyVar.f40194i2 || pyVar.S2 != 0 || pyVar.U2 != 0) {
                    pyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            owVar.setIsEditing(false);
            pyVar.I4(false);
        } else if (i10 == 1) {
            if (pyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                pyVar.f40161c0.getLocationInWindow(iArr);
                ((LaunchActivity) pyVar.getParentActivity()).G0(false, true, (pyVar.f40161c0.getMeasuredWidth() / 2) + iArr[0], (pyVar.f40161c0.getMeasuredHeight() / 2) + iArr[1], new zi(this, 24));
                pyVar.getNotificationsController().showNotifications();
                pyVar.y3();
            }
        } else if (i10 == 3) {
            pyVar.O4(true, true, true, false);
            pyVar.V.b(true);
        } else if (i10 == 11) {
            pyVar.p4(pyVar.A1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(arrayList3, pyVar);
            o00Var.f29627r = new gu(this, 4);
            pyVar.showDialog(o00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = pyVar.getMessagesController().getDialogFilters().get(pyVar.f40155b0[0].h);
            ArrayList H = org.telegram.ui.Components.o00.H(pyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (H.size() + i11 > 100) {
                pyVar.showDialog(org.telegram.ui.Components.z4.N(pyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f21168a);
                return;
            }
            if (!H.isEmpty()) {
                dialogFilter2.neverShow.addAll(H);
                for (int i13 = 0; i13 < H.size(); i13++) {
                    Long l10 = (Long) H.get(i13);
                    dialogFilter2.alwaysShow.remove(l10);
                    dialogFilter2.pinnedDialogs.delete(l10.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = H;
                i12 = 1;
                b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, pyVar, null);
            } else {
                arrayList = H;
                dialogFilter = dialogFilter2;
                i12 = 1;
            }
            if (arrayList.size() == i12) {
                arrayList2 = arrayList;
                z4 = false;
                j10 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z4 = false;
            }
            long j11 = j10;
            UndoView Y3 = pyVar.Y3();
            if (Y3 != null) {
                Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            pyVar.b4(z4);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            pyVar.r4(pyVar.F2, i10, true, false, null);
        }
    }
}
