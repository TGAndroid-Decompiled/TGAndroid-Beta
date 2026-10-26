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
public final class zv extends org.telegram.ui.ActionBar.j {
    public final cy f46371a;

    public zv(cy cyVar) {
        this.f46371a = cyVar;
    }

    @Override
    public final void b(int i10) {
        jx jxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.f46371a;
        ArrayList arrayList3 = cyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (jxVar = cyVar.C0) != null) {
            HashMap hashMap = jxVar.B0;
            cy cyVar2 = jxVar.L0;
            if (i10 == 202) {
                if (cyVar2 != null && cyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar2.getParentActivity());
                    alertDialog$Builder.f22368a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f22368a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.qd0(13));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.p1(24, jxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.p().d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (jxVar.O()) {
                    cyVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) cyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    jxVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                cy cyVar3 = new cy(org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true));
                cyVar3.C2 = new org.telegram.ui.Components.tv(jxVar, 20);
                cyVar2.presentFragment(cyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            tw twVar = cyVar.G3;
            if (twVar != null && twVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (kVar2.q()) {
                    jx jxVar2 = cyVar.C0;
                    if (jxVar2 != null && jxVar2.getVisibility() == 0) {
                        jx jxVar3 = cyVar.C0;
                        if (jxVar3.A0) {
                            jxVar3.R(false);
                            return;
                        }
                    }
                    cyVar.j4(true);
                    return;
                }
                cyVar.G3.a();
                jx jxVar4 = cyVar.C0;
                if (jxVar4 != null) {
                    jxVar4.S();
                    return;
                }
                return;
            }
            qx qxVar = cyVar.f38693z0;
            if (qxVar == null || !qxVar.f32377n) {
                kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (kVar.q()) {
                    jx jxVar5 = cyVar.C0;
                    if (jxVar5 != null && jxVar5.getVisibility() == 0) {
                        jx jxVar6 = cyVar.C0;
                        if (jxVar6.A0) {
                            jxVar6.R(false);
                            return;
                        }
                    }
                    cyVar.j4(true);
                    return;
                } else if (cyVar.f38623l2 || cyVar.W2 != 0 || cyVar.Y2 != 0) {
                    cyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            qxVar.setIsEditing(false);
            cyVar.Q4(false);
        } else if (i10 == 1) {
            if (cyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                cyVar.f38592f0.getLocationInWindow(iArr);
                ((LaunchActivity) cyVar.getParentActivity()).L0(false, true, (cyVar.f38592f0.getMeasuredWidth() / 2) + iArr[0], (cyVar.f38592f0.getMeasuredHeight() / 2) + iArr[1], new ui(this, 22));
                cyVar.getNotificationsController().showNotifications();
                cyVar.G3();
            }
        } else if (i10 == 3) {
            cyVar.W4(true, true, true, false);
            cyVar.Y.b(true);
        } else if (i10 == 11) {
            cyVar.x4(cyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(cyVar, arrayList3);
            v00Var.f33525s = new qt(this, 6);
            cyVar.showDialog(v00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = cyVar.getMessagesController().getDialogFilters().get(cyVar.f38586e0[0].h);
            ArrayList I = org.telegram.ui.Components.v00.I(cyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                cyVar.showDialog(org.telegram.ui.Components.g5.M(cyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f22368a);
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
                o00.v0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, cyVar, null);
            } else {
                arrayList = I;
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
            UndoView g42 = cyVar.g4();
            if (g42 != null) {
                g42.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            cyVar.j4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            cyVar.z4(cyVar.I2, i10, true, false, null);
        }
    }
}
