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
public final class rw extends org.telegram.ui.ActionBar.j {
    public final ry f36944a;

    public rw(ry ryVar) {
        this.f36944a = ryVar;
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ry ryVar = this.f36944a;
        ArrayList arrayList3 = ryVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (ayVar = ryVar.C0) != null) {
            HashMap hashMap = ayVar.f30358z0;
            ry ryVar2 = ayVar.J0;
            if (i10 == 202) {
                if (ryVar2 != null && ryVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar2.getParentActivity());
                    alertDialog$Builder.f18409a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f18409a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.xc0(14));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(14, ayVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (ayVar.N()) {
                    ryVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) ryVar2, 2, true));
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
                ry ryVar3 = new ry(org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true));
                ryVar3.C2 = new org.telegram.ui.Components.mv(ayVar, 17);
                ryVar2.presentFragment(ryVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            lx lxVar = ryVar.F3;
            if (lxVar != null && lxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (kVar2.s()) {
                    ay ayVar2 = ryVar.C0;
                    if (ayVar2 != null && ayVar2.getVisibility() == 0) {
                        ay ayVar3 = ryVar.C0;
                        if (ayVar3.f30357y0) {
                            ayVar3.Q(false);
                            return;
                        }
                    }
                    ryVar.b4(true);
                    return;
                }
                ryVar.F3.a();
                ay ayVar4 = ryVar.C0;
                if (ayVar4 != null) {
                    ayVar4.R();
                    return;
                }
                return;
            }
            pw pwVar = ryVar.f37082z0;
            if (pwVar == null || !pwVar.f25749n) {
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (kVar.s()) {
                    ay ayVar5 = ryVar.C0;
                    if (ayVar5 != null && ayVar5.getVisibility() == 0) {
                        ay ayVar6 = ryVar.C0;
                        if (ayVar6.f30357y0) {
                            ayVar6.Q(false);
                            return;
                        }
                    }
                    ryVar.b4(true);
                    return;
                } else if (ryVar.f37014l2 || ryVar.V2 != 0 || ryVar.X2 != 0) {
                    ryVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            pwVar.setIsEditing(false);
            ryVar.I4(false);
        } else if (i10 == 1) {
            if (ryVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                ryVar.f36984f0.getLocationInWindow(iArr);
                ((LaunchActivity) ryVar.getParentActivity()).G0(false, true, (ryVar.f36984f0.getMeasuredWidth() / 2) + iArr[0], (ryVar.f36984f0.getMeasuredHeight() / 2) + iArr[1], new aj(this, 24));
                ryVar.getNotificationsController().showNotifications();
                ryVar.y3();
            }
        } else if (i10 == 3) {
            ryVar.O4(true, true, true, false);
            ryVar.Y.b(true);
        } else if (i10 == 11) {
            ryVar.p4(ryVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(ryVar, arrayList3);
            o00Var.f26558r = new eu(this, 4);
            ryVar.showDialog(o00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = ryVar.getMessagesController().getDialogFilters().get(ryVar.f36978e0[0].h);
            ArrayList I = org.telegram.ui.Components.o00.I(ryVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (I.size() + i11 > 100) {
                ryVar.showDialog(org.telegram.ui.Components.e5.N(ryVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f18409a);
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
                c10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, ryVar, null);
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
            UndoView Y3 = ryVar.Y3();
            if (Y3 != null) {
                Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            ryVar.b4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            ryVar.r4(ryVar.I2, i10, true, false, null);
        }
    }
}
