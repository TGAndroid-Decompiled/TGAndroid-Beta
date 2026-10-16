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
public final class y41 extends pg.b {
    public final SaveToGallerySettingsActivity d;

    public y41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32427s.size();
    }

    @Override
    public final int j(int i10) {
        return ((z41) this.d.f32427s.get(i10)).f42904a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.f44838a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f32427s;
        boolean z10 = false;
        if (((z41) arrayList.get(i10)).f42904a == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            r8Var.setNeedDivider(z10);
        } else if (((z41) arrayList.get(i10)).f42904a == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            w8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
        } else if (((z41) arrayList.get(i10)).f42904a == 7) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f32423c != null) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f32421a;
                if (i12 == 1) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            e9Var.setText(((z41) arrayList.get(i10)).d);
        } else if (((z41) arrayList.get(i10)).f42904a == 5) {
            ((org.telegram.ui.Cells.m4) view).setText(((z41) arrayList.get(i10)).d);
        } else if (((z41) arrayList.get(i10)).f42904a == 2) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((z41) arrayList.get(i10)).f42152c;
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
            xaVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
            CharSequence createDescription = dialogException.createDescription(i11);
            if (i10 == arrayList.size() - 1 || ((z41) arrayList.get(i10 + 1)).f42904a == 2) {
                z10 = true;
            }
            xaVar.e(userOrChat, str, createDescription, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.wa waVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                r8Var.e(org.telegram.ui.ActionBar.g6.f19933v6, org.telegram.ui.ActionBar.g6.f19916u6);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                view = r8Var;
                break;
            case 2:
                View xaVar = new org.telegram.ui.Cells.xa(4, 0, viewGroup.getContext(), null, false, false);
                xaVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                linearLayout = xaVar;
                view = linearLayout;
                break;
            case 3:
                waVar = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                view = waVar;
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var2.e(-1, org.telegram.ui.ActionBar.g6.f19822p7);
                r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                waVar = r8Var2;
                view = waVar;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                waVar = m4Var;
                view = waVar;
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(viewGroup.getContext());
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                waVar = w8Var;
                view = waVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.e9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                a51 a51Var = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var.setTextSize(AndroidUtilities.dp(13.0f));
                a51Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(a51Var, w7.z5.e(-2, -2, 83));
                a51 a51Var2 = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(a51Var2, w7.z5.e(-2, -2, 81));
                a51 a51Var3 = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var3.setTextSize(AndroidUtilities.dp(13.0f));
                a51Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(a51Var3, w7.z5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(gp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                gp0Var.setReportChanges(true);
                gp0Var.setDelegate(new x41(this, gp0Var, a51Var, a51Var2, a51Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.d((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                gp0Var.setProgress(f7);
                gp0Var.f25081w.X(gp0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.wa waVar2 = new org.telegram.ui.Cells.wa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f32422b)) {
                    i12 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f32422b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f32422b));
                }
                waVar2.a(chat, null);
                waVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                waVar = waVar2;
                view = waVar;
                break;
            case 10:
                View a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                a7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19563b7, saveToGallerySettingsActivity.getResourceProvider())));
                waVar = a7Var;
                view = waVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
