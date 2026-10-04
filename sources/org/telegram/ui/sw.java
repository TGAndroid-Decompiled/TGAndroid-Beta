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
    public final uy f40622a;

    public sw(uy uyVar) {
        this.f40622a = uyVar;
    }

    @Override
    public final void b(int i10) {
        dy dyVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.f40622a;
        ArrayList arrayList3 = uyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (dyVar = uyVar.C0) != null) {
            HashMap hashMap = dyVar.A0;
            uy uyVar2 = dyVar.K0;
            if (i10 == 202) {
                if (uyVar2 != null && uyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar2.getParentActivity());
                    alertDialog$Builder.f20368a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20368a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ru(18));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(16, dyVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21059q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (dyVar.P()) {
                    uyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) uyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    dyVar.d((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                uy uyVar3 = new uy(org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true));
                uyVar3.C2 = new org.telegram.ui.Components.pv(dyVar, 18);
                uyVar2.presentFragment(uyVar3);
                return;
            } else {
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            mx mxVar = uyVar.F3;
            if (mxVar != null && mxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar2.s()) {
                    dy dyVar2 = uyVar.C0;
                    if (dyVar2 != null && dyVar2.getVisibility() == 0) {
                        dy dyVar3 = uyVar.C0;
                        if (dyVar3.f30140z0) {
                            dyVar3.S(false);
                            return;
                        }
                    }
                    uyVar.k4(true);
                    return;
                }
                uyVar.F3.a();
                dy dyVar4 = uyVar.C0;
                if (dyVar4 != null) {
                    dyVar4.T();
                    return;
                }
                return;
            }
            ky kyVar = uyVar.f41496z0;
            if (kyVar == null || !kyVar.f28781n) {
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar.s()) {
                    dy dyVar5 = uyVar.C0;
                    if (dyVar5 != null && dyVar5.getVisibility() == 0) {
                        dy dyVar6 = uyVar.C0;
                        if (dyVar6.f30140z0) {
                            dyVar6.S(false);
                            return;
                        }
                    }
                    uyVar.k4(true);
                    return;
                } else if (uyVar.f41429l2 || uyVar.V2 != 0 || uyVar.X2 != 0) {
                    uyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            kyVar.setIsEditing(false);
            uyVar.R4(false);
        } else if (i10 == 1) {
            if (uyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                uyVar.f41399f0.getLocationInWindow(iArr);
                ((LaunchActivity) uyVar.getParentActivity()).G0(false, true, (uyVar.f41399f0.getMeasuredWidth() / 2) + iArr[0], (uyVar.f41399f0.getMeasuredHeight() / 2) + iArr[1], new bj(this, 22));
                uyVar.getNotificationsController().showNotifications();
                uyVar.H3();
            }
        } else if (i10 == 3) {
            uyVar.X4(true, true, true, false);
            uyVar.Y.b(true);
        } else if (i10 == 11) {
            uyVar.y4(uyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(uyVar, arrayList3);
            q00Var.f29854r = new bu(this, 6);
            uyVar.showDialog(q00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = uyVar.getMessagesController().getDialogFilters().get(uyVar.f41393e0[0].h);
            ArrayList G = org.telegram.ui.Components.q00.G(uyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (G.size() + i11 > 100) {
                uyVar.showDialog(org.telegram.ui.Components.e5.N(uyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20368a);
                return;
            }
            if (!G.isEmpty()) {
                dialogFilter2.neverShow.addAll(G);
                for (int i13 = 0; i13 < G.size(); i13++) {
                    Long l4 = (Long) G.get(i13);
                    dialogFilter2.alwaysShow.remove(l4);
                    dialogFilter2.pinnedDialogs.delete(l4.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = G;
                i12 = 1;
                f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, uyVar, null);
            } else {
                arrayList = G;
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
            UndoView h42 = uyVar.h4();
            if (h42 != null) {
                h42.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            uyVar.k4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            uyVar.A4(uyVar.I2, i10, true, false, null);
        }
    }
}
