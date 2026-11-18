package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
public final class vm0 implements View.OnClickListener {
    public final int f52805a;
    public final int f52806b;
    public final Object f52807c;

    public vm0(int i7, org.telegram.messenger.fj fjVar) {
        this.f52805a = 1;
        this.f52806b = i7;
        this.f52807c = fjVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        org.telegram.ui.Components.gc j3;
        int i10 = this.f52805a;
        int i11 = this.f52806b;
        Object obj = this.f52807c;
        switch (i10) {
            case 0:
                cn0 cn0Var = (cn0) obj;
                org.telegram.ui.ActionBar.h1 h1Var = cn0Var.f46555n0;
                if (h1Var != null && h1Var.isShowing()) {
                    cn0Var.f46555n0.d(true);
                }
                if (i11 == 0) {
                    org.telegram.ui.Components.b5.I(cn0Var.getParentActivity(), cn0Var.V.a(), new um0(cn0Var, 1));
                    return;
                } else {
                    cn0Var.j0(0, true);
                    return;
                }
            case 1:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                int i12 = PopupNotificationActivity.f43406c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.ek(org.telegram.messenger.zy.C(i11), org.telegram.messenger.fj.B0(fjVar.f23965k), fjVar.e1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    vv0 vv0Var = profileActivity.O;
                    if (!vv0Var.F1) {
                        if (org.telegram.ui.Components.gt0.J0(vv0Var.getClosestTab())) {
                            vv0 vv0Var2 = profileActivity.O;
                            profileActivity.O.a1(vv0Var2.w1(vv0Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            return;
                        } else if (!profileActivity.getMessagesController().i5()) {
                            profileActivity.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                            hi.ta D = hi.ta.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f15498y = new uv0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.gt0.J0(profileActivity.O.getClosestTab())) {
                    long a10 = profileActivity.a();
                    vv0 vv0Var3 = profileActivity.O;
                    int w12 = vv0Var3.w1(vv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().R1().w(w12, a10);
                    ai.l2 l2Var = profileActivity.D5;
                    if (l2Var != null) {
                        l2Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.gc.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.fj> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i13 = 0; i13 < actionModeSelected.size(); i13++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i13).f23970l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList.isEmpty()) {
                        bi.q3 q3Var = new bi.q3(profileActivity, a10, w12, arrayList, 5);
                        profileActivity.getMessagesController().R1().f0(w12, a10, arrayList);
                        org.telegram.ui.Components.lc.b0(profileActivity).K(2131623980, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.gd.M0(2131743648, null), q3Var).j();
                        return;
                    }
                    return;
                }
                long e10 = profileActivity.getUserConfig().e();
                ai.l2 l2Var2 = profileActivity.D5;
                if (l2Var2 != null) {
                    l2Var2.run();
                    profileActivity.D5 = null;
                }
                org.telegram.ui.Components.gc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<org.telegram.messenger.fj> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < actionModeSelected2.size(); i15++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i15).f23970l;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i14++;
                        }
                    }
                    i7 = i14;
                } else {
                    i7 = 0;
                }
                profileActivity.O.V(false);
                if (z10) {
                    profileActivity.O.k1(8);
                }
                if (!arrayList2.isEmpty()) {
                    boolean[] zArr = new boolean[arrayList2.size()];
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i16);
                        zArr[i16] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().R1().q0(e10, arrayList2, false);
                    boolean[] zArr2 = {false};
                    boolean z11 = z10;
                    profileActivity.D5 = new ai.l2(profileActivity, e10, arrayList2, z10, 3);
                    bi.k2 k2Var = new bi.k2(profileActivity, zArr2, arrayList2, zArr, e10, 15);
                    if (z11) {
                        j3 = org.telegram.ui.Components.lc.b0(profileActivity).L(2131623990, org.telegram.messenger.gd.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743648, null), k2Var).j();
                    } else {
                        j3 = org.telegram.ui.Components.lc.b0(profileActivity).J(2131623980, org.telegram.messenger.gd.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743648, null), 5000, false, k2Var).j();
                    }
                    j3.v = new tr0(14, profileActivity, zArr2);
                    return;
                }
                return;
            case 3:
                c51 c51Var = (c51) obj;
                c51Var.f46409i0.A(i11);
                c51Var.p0(i11, true);
                return;
            default:
                org.telegram.ui.Wallet.db dbVar = (org.telegram.ui.Wallet.db) obj;
                EditText editText = dbVar.f44084a;
                TextView[] textViewArr = dbVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    dbVar.a();
                    dbVar.a();
                    Runnable runnable = dbVar.f44090r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vm0(Object obj, int i7, int i10) {
        this.f52805a = i10;
        this.f52807c = obj;
        this.f52806b = i7;
    }
}
