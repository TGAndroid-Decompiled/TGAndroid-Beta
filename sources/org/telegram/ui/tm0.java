package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
public final class tm0 implements View.OnClickListener {
    public final int f52427a;
    public final int f52428b;
    public final Object f52429c;

    public tm0(int i7, org.telegram.messenger.fj fjVar) {
        this.f52427a = 1;
        this.f52428b = i7;
        this.f52429c = fjVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        org.telegram.ui.Components.fc j3;
        int i10 = this.f52427a;
        int i11 = this.f52428b;
        Object obj = this.f52429c;
        switch (i10) {
            case 0:
                an0 an0Var = (an0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = an0Var.f45761n0;
                if (g1Var != null && g1Var.isShowing()) {
                    an0Var.f45761n0.d(true);
                }
                if (i11 == 0) {
                    org.telegram.ui.Components.b5.I(an0Var.getParentActivity(), an0Var.V.a(), new sm0(an0Var, 1));
                    return;
                } else {
                    an0Var.j0(0, true);
                    return;
                }
            case 1:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                int i12 = PopupNotificationActivity.f43532c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.ek(org.telegram.messenger.zy.C(i11), org.telegram.messenger.fj.B0(fjVar.f24073k), fjVar.e1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    uv0 uv0Var = profileActivity.O;
                    if (!uv0Var.F1) {
                        if (org.telegram.ui.Components.it0.J0(uv0Var.getClosestTab())) {
                            uv0 uv0Var2 = profileActivity.O;
                            profileActivity.O.a1(uv0Var2.w1(uv0Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            return;
                        } else if (!profileActivity.getMessagesController().i5()) {
                            profileActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                            hi.nb D = hi.nb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f15132y = new tv0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.it0.J0(profileActivity.O.getClosestTab())) {
                    long a10 = profileActivity.a();
                    uv0 uv0Var3 = profileActivity.O;
                    int w12 = uv0Var3.w1(uv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().R1().w(w12, a10);
                    ai.f2 f2Var = profileActivity.D5;
                    if (f2Var != null) {
                        f2Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.fc.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.fj> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i13 = 0; i13 < actionModeSelected.size(); i13++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i13).f24078l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList.isEmpty()) {
                        bi.w3 w3Var = new bi.w3(profileActivity, a10, w12, arrayList, 5);
                        profileActivity.getMessagesController().R1().f0(w12, a10, arrayList);
                        org.telegram.ui.Components.kc.b0(profileActivity).K(2131623980, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.gd.N0(2131743638, null), w3Var).j();
                        return;
                    }
                    return;
                }
                long e10 = profileActivity.getUserConfig().e();
                ai.f2 f2Var2 = profileActivity.D5;
                if (f2Var2 != null) {
                    f2Var2.run();
                    profileActivity.D5 = null;
                }
                org.telegram.ui.Components.fc.e();
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
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i15).f24078l;
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
                    profileActivity.D5 = new ai.f2(profileActivity, e10, arrayList2, z10, 3);
                    bi.q2 q2Var = new bi.q2(profileActivity, zArr2, arrayList2, zArr, e10, 15);
                    if (z11) {
                        j3 = org.telegram.ui.Components.kc.b0(profileActivity).L(2131623990, org.telegram.messenger.gd.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743638, null), q2Var).j();
                    } else {
                        j3 = org.telegram.ui.Components.kc.b0(profileActivity).J(2131623980, org.telegram.messenger.gd.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743638, null), 5000, false, q2Var).j();
                    }
                    j3.v = new mp0(20, profileActivity, zArr2);
                    return;
                }
                return;
            case 3:
                b51 b51Var = (b51) obj;
                b51Var.f45937i0.C(i11);
                b51Var.p0(i11, true);
                return;
            default:
                org.telegram.ui.Wallet.eb ebVar = (org.telegram.ui.Wallet.eb) obj;
                EditText editText = ebVar.f44256a;
                TextView[] textViewArr = ebVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    ebVar.a();
                    ebVar.a();
                    Runnable runnable = ebVar.f44262r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public tm0(Object obj, int i7, int i10) {
        this.f52427a = i10;
        this.f52429c = obj;
        this.f52428b = i7;
    }
}
