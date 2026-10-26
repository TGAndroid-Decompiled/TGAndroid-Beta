package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
public final class zv0 implements View.OnClickListener {
    public final int f46372a;
    public final int f46373b;
    public final Object f46374c;

    public zv0(Object obj, int i10, int i11) {
        this.f46372a = i11;
        this.f46374c = obj;
        this.f46373b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        org.telegram.ui.Components.qc j10;
        int i11 = this.f46372a;
        int i12 = this.f46373b;
        Object obj = this.f46374c;
        switch (i11) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                int i13 = PopupNotificationActivity.f35853b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    vz0 vz0Var = profileActivity.N;
                    if (!vz0Var.E1) {
                        if (org.telegram.ui.Components.aw0.E0(vz0Var.getClosestTab())) {
                            vz0 vz0Var2 = profileActivity.N;
                            profileActivity.N.U0(profileActivity, profileActivity.a(), vz0Var2.q1(vz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            fi.sb D = fi.sb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f11679x = new uz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.aw0.E0(profileActivity.N.getClosestTab())) {
                    long a2 = profileActivity.a();
                    vz0 vz0Var3 = profileActivity.N;
                    int q12 = vz0Var3.q1(vz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(q12, a2);
                    org.telegram.messenger.u8 u8Var = profileActivity.D5;
                    if (u8Var != null) {
                        u8Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i14 = 0; i14 < actionModeSelected.size(); i14++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i14).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.N.S(false);
                    if (!arrayList.isEmpty()) {
                        bi.da daVar = new bi.da(profileActivity, a2, q12, arrayList, 16);
                        profileActivity.getMessagesController().getStoriesController().c0(q12, a2, arrayList);
                        org.telegram.ui.Components.wc.b0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), daVar).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.u8 u8Var2 = profileActivity.D5;
                if (u8Var2 != null) {
                    u8Var2.run();
                    profileActivity.D5 = null;
                }
                org.telegram.ui.Components.qc.e();
                if (profileActivity.N.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < actionModeSelected2.size(); i16++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i16).storyItem;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i15++;
                        }
                    }
                    i10 = i15;
                } else {
                    i10 = 0;
                }
                profileActivity.N.S(false);
                if (z10) {
                    profileActivity.N.e1(8);
                }
                if (!arrayList2.isEmpty()) {
                    boolean[] zArr = new boolean[arrayList2.size()];
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i17);
                        zArr[i17] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList2, false);
                    boolean[] zArr2 = {false};
                    boolean z11 = z10;
                    profileActivity.D5 = new org.telegram.messenger.u8(profileActivity, clientUserId, arrayList2, z10, 9);
                    bi.a0 a0Var = new bi.a0(profileActivity, zArr2, arrayList2, zArr, clientUserId, 15);
                    if (z11) {
                        j10 = org.telegram.ui.Components.wc.b0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), a0Var).j();
                    } else {
                        j10 = org.telegram.ui.Components.wc.b0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, a0Var).j();
                    }
                    j10.f31901w = new fy0(4, profileActivity, zArr2);
                    return;
                }
                return;
            case 2:
                w91 w91Var = (w91) obj;
                w91Var.f45031h0.E(i12);
                w91Var.l0(i12, true);
                return;
            default:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                EditText editText = haVar.f36651a;
                TextView[] textViewArr = haVar.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    haVar.a();
                    haVar.a();
                    Runnable runnable = haVar.f36656r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zv0(MessageObject messageObject, int i10) {
        this.f46372a = 0;
        this.f46373b = i10;
        this.f46374c = messageObject;
    }
}
