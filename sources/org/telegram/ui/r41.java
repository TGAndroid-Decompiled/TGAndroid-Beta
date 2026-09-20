package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r41 extends og.b {
    public final SaveToGallerySettingsActivity d;

    public r41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31718s.size();
    }

    @Override
    public final int j(int i10) {
        return ((s41) this.d.f31718s.get(i10)).f15704a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11;
        View view = c1Var.f42974a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f31718s;
        boolean z10 = false;
        if (((s41) arrayList.get(i10)).f15704a == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            s8Var.setNeedDivider(z10);
        } else if (((s41) arrayList.get(i10)).f15704a == 6) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                x8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                x8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            x8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            x8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.ij), R.drawable.msg_filled_data_videos);
        } else if (((s41) arrayList.get(i10)).f15704a == 7) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f31714c != null) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f31712a;
                if (i12 == 1) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            f9Var.setText(((s41) arrayList.get(i10)).d);
        } else if (((s41) arrayList.get(i10)).f15704a == 5) {
            ((org.telegram.ui.Cells.n4) view).setText(((s41) arrayList.get(i10)).d);
        } else if (((s41) arrayList.get(i10)).f15704a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((s41) arrayList.get(i10)).f37295c;
            TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                if (user.self) {
                    str = LocaleController.getString(R.string.SavedMessages);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
            } else if (userOrChat instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) userOrChat).title;
            } else {
                str = null;
            }
            abVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
            abVar.d(userOrChat, str, dialogException.createDescription(i11), (i10 == arrayList.size() - 1 || ((s41) arrayList.get(i10 + 1)).f15704a == 2) ? true : true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.za zaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                s8Var.e(org.telegram.ui.ActionBar.j6.f19425v6, org.telegram.ui.ActionBar.j6.f19407u6);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                view = s8Var;
                break;
            case 2:
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                linearLayout = abVar;
                view = linearLayout;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                view = zaVar;
                break;
            case 4:
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                s8Var2.e(-1, org.telegram.ui.ActionBar.j6.f19315p7);
                s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                zaVar = s8Var2;
                view = zaVar;
                break;
            case 5:
                View n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext());
                n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                zaVar = n4Var;
                view = zaVar;
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext());
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                zaVar = x8Var;
                view = zaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.f9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                t41 t41Var = new t41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                t41Var.setTextSize(AndroidUtilities.dp(13.0f));
                t41Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(t41Var, w7.y5.e(-2, -2, 83));
                t41 t41Var2 = new t41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                t41Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(t41Var2, w7.y5.e(-2, -2, 81));
                t41 t41Var3 = new t41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                t41Var3.setTextSize(AndroidUtilities.dp(13.0f));
                t41Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(t41Var3, w7.y5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.y5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(so0Var, w7.y5.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                so0Var.setReportChanges(true);
                so0Var.setDelegate(new q41(this, so0Var, t41Var, t41Var2, t41Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f7 = a4.a.e((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                so0Var.setProgress(f7);
                so0Var.f28188w.X(so0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f31713b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f31713b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f31713b));
                }
                zaVar2.a(chat, null);
                zaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                zaVar = zaVar2;
                view = zaVar;
                break;
            case 10:
                View c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                c7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19058b7, saveToGallerySettingsActivity.getResourceProvider())));
                zaVar = c7Var;
                view = zaVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
