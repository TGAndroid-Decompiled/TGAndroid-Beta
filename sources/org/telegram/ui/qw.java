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
    public final qy f36987a;

    public qw(qy qyVar) {
        this.f36987a = qyVar;
    }

    @Override
    public final void b(int i10) {
        zx zxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.f36987a;
        ArrayList arrayList3 = qyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (zxVar = qyVar.C0) != null) {
            HashMap hashMap = zxVar.f26167z0;
            qy qyVar2 = zxVar.J0;
            if (i10 == 202) {
                if (qyVar2 != null && qyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar2.getParentActivity());
                    alertDialog$Builder.f18647a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f18647a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.fa0(16));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(15, zxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (zxVar.N()) {
                    qyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) qyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    zxVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                qy qyVar3 = new qy(org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true));
                qyVar3.C2 = new org.telegram.ui.Components.nv(zxVar, 18);
                qyVar2.presentFragment(qyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            kx kxVar = qyVar.F3;
            if (kxVar != null && kxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (kVar2.s()) {
                    zx zxVar2 = qyVar.C0;
                    if (zxVar2 != null && zxVar2.getVisibility() == 0) {
                        zx zxVar3 = qyVar.C0;
                        if (zxVar3.f26166y0) {
                            zxVar3.Q(false);
                            return;
                        }
                    }
                    qyVar.b4(true);
                    return;
                }
                qyVar.F3.a();
                zx zxVar4 = qyVar.C0;
                if (zxVar4 != null) {
                    zxVar4.R();
                    return;
                }
                return;
            }
            nw nwVar = qyVar.f37125z0;
            if (nwVar == null || !nwVar.f25943n) {
                kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (kVar.s()) {
                    zx zxVar5 = qyVar.C0;
                    if (zxVar5 != null && zxVar5.getVisibility() == 0) {
                        zx zxVar6 = qyVar.C0;
                        if (zxVar6.f26166y0) {
                            zxVar6.Q(false);
                            return;
                        }
                    }
                    qyVar.b4(true);
                    return;
                } else if (qyVar.f37057l2 || qyVar.V2 != 0 || qyVar.X2 != 0) {
                    qyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            nwVar.setIsEditing(false);
            qyVar.I4(false);
        } else if (i10 == 1) {
            if (qyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                qyVar.f37027f0.getLocationInWindow(iArr);
                ((LaunchActivity) qyVar.getParentActivity()).G0(false, true, (qyVar.f37027f0.getMeasuredWidth() / 2) + iArr[0], (qyVar.f37027f0.getMeasuredHeight() / 2) + iArr[1], new aj(this, 24));
                qyVar.getNotificationsController().showNotifications();
                qyVar.y3();
            }
        } else if (i10 == 3) {
            qyVar.O4(true, true, true, false);
            qyVar.Y.b(true);
        } else if (i10 == 11) {
            qyVar.p4(qyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(qyVar, arrayList3);
            o00Var.f26859r = new du(this, 4);
            qyVar.showDialog(o00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = qyVar.getMessagesController().getDialogFilters().get(qyVar.f37021e0[0].h);
            ArrayList I = org.telegram.ui.Components.o00.I(qyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                qyVar.showDialog(org.telegram.ui.Components.e5.N(qyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f18647a);
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
                b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, qyVar, null);
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
            UndoView Y3 = qyVar.Y3();
            if (Y3 != null) {
                Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            qyVar.b4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            qyVar.r4(qyVar.I2, i10, true, false, null);
        }
    }
}
