package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class qu0 implements View.OnClickListener {
    public final int f49195a;
    public final int f49196b;
    public final Object f49197c;

    public qu0(Object obj, int i7, int i10) {
        this.f49195a = i10;
        this.f49197c = obj;
        this.f49196b = i7;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        org.telegram.ui.Components.cc j3;
        int i10 = this.f49195a;
        int i11 = this.f49196b;
        Object obj = this.f49197c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    xv0 xv0Var = profileActivity.N;
                    if (!xv0Var.E1) {
                        if (org.telegram.ui.Components.zs0.J0(xv0Var.getClosestTab())) {
                            xv0 xv0Var2 = profileActivity.N;
                            profileActivity.N.a1(profileActivity, profileActivity.a(), xv0Var2.w1(xv0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().W4()) {
                            profileActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().f24774e7.edit().putBoolean("story_keep", true).apply();
                            fi.va D = fi.va.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f13012y = new wv0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.zs0.J0(profileActivity.N.getClosestTab())) {
                    long a10 = profileActivity.a();
                    xv0 xv0Var3 = profileActivity.N;
                    int w12 = xv0Var3.w1(xv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(w12, a10);
                    org.telegram.messenger.video.n nVar = profileActivity.f41881z5;
                    if (nVar != null) {
                        nVar.run();
                        profileActivity.f41881z5 = null;
                    }
                    org.telegram.ui.Components.cc.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.ij> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i12 = 0; i12 < actionModeSelected.size(); i12++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i12).f23266l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.N.V(false);
                    if (!arrayList.isEmpty()) {
                        bi.f9 f9Var = new bi.f9(profileActivity, a10, w12, arrayList);
                        profileActivity.getMessagesController().P1().f0(w12, a10, arrayList);
                        org.telegram.ui.Components.hc.a0(profileActivity).K(2131623979, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.id.M0(2131743885, null), f9Var).j();
                        return;
                    }
                    return;
                }
                long e10 = profileActivity.getUserConfig().e();
                org.telegram.messenger.video.n nVar2 = profileActivity.f41881z5;
                if (nVar2 != null) {
                    nVar2.run();
                    profileActivity.f41881z5 = null;
                }
                org.telegram.ui.Components.cc.e();
                if (profileActivity.N.getClosestTab() == 9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<org.telegram.messenger.ij> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < actionModeSelected2.size(); i14++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i14).f23266l;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i13++;
                        }
                    }
                    i7 = i13;
                } else {
                    i7 = 0;
                }
                profileActivity.N.V(false);
                if (z9) {
                    profileActivity.N.k1(8);
                }
                if (!arrayList2.isEmpty()) {
                    boolean[] zArr = new boolean[arrayList2.size()];
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i15);
                        zArr[i15] = storyItem3.pinned;
                        storyItem3.pinned = z9;
                    }
                    profileActivity.getMessagesController().P1().q0(e10, arrayList2, false);
                    boolean[] zArr2 = {false};
                    boolean z10 = z9;
                    profileActivity.f41881z5 = new org.telegram.messenger.video.n(profileActivity, e10, arrayList2, z9);
                    bi.i0 i0Var = new bi.i0(profileActivity, zArr2, arrayList2, zArr, e10, 15);
                    if (z10) {
                        j3 = org.telegram.ui.Components.hc.a0(profileActivity).L(2131623989, org.telegram.messenger.id.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743885, null), i0Var).j();
                    } else {
                        j3 = org.telegram.ui.Components.hc.a0(profileActivity).J(2131623979, org.telegram.messenger.id.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743885, null), 5000, false, i0Var).j();
                    }
                    j3.v = new sn0(23, profileActivity, zArr2);
                    return;
                }
                return;
            case 1:
                d51 d51Var = (d51) obj;
                d51Var.f44837h0.E(i11);
                d51Var.p0(i11, true);
                return;
            default:
                org.telegram.ui.Wallet.ma maVar = (org.telegram.ui.Wallet.ma) obj;
                EditText editText = maVar.f42829a;
                TextView[] textViewArr = maVar.N;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    maVar.a();
                    maVar.a();
                    Runnable runnable = maVar.f42835r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
