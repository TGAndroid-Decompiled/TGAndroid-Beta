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
public final class w31 extends bg.c {
    public final SaveToGallerySettingsActivity d;

    public w31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32222s.size();
    }

    @Override
    public final int j(int i10) {
        return ((x31) this.d.f32222s.get(i10)).f1808a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        int i11;
        View view = l1Var.f5785a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f32222s;
        boolean z4 = false;
        if (((x31) arrayList.get(i10)).f1808a == 1) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z4 = true;
            }
            o8Var.setNeedDivider(z4);
        } else if (((x31) arrayList.get(i10)).f1808a == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                s8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                s8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            s8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            s8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.ij), R.drawable.msg_filled_data_videos);
        } else if (((x31) arrayList.get(i10)).f1808a == 7) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f32218c != null) {
                    a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f32216a;
                if (i12 == 1) {
                    a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            a9Var.setText(((x31) arrayList.get(i10)).d);
        } else if (((x31) arrayList.get(i10)).f1808a == 5) {
            ((org.telegram.ui.Cells.m4) view).setText(((x31) arrayList.get(i10)).d);
        } else if (((x31) arrayList.get(i10)).f1808a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((x31) arrayList.get(i10)).f39852c;
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
            vaVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
            vaVar.d(userOrChat, str, dialogException.createDescription(i11), (i10 == arrayList.size() - 1 || ((x31) arrayList.get(i10 + 1)).f1808a == 2) ? true : true);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f10;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.ua uaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                o8Var.e(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                view = o8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                linearLayout = vaVar;
                view = linearLayout;
                break;
            case 3:
                uaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                view = uaVar;
                break;
            case 4:
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                o8Var2.e(-1, org.telegram.ui.ActionBar.j6.f20122p7);
                o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                uaVar = o8Var2;
                view = uaVar;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                uaVar = m4Var;
                view = uaVar;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                uaVar = s8Var;
                view = uaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                y31 y31Var = new y31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                y31Var.setTextSize(AndroidUtilities.dp(13.0f));
                y31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(y31Var, k7.b6.e(-2, -2, 83));
                y31 y31Var2 = new y31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                y31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(y31Var2, k7.b6.e(-2, -2, 81));
                y31 y31Var3 = new y31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                y31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                y31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(y31Var3, k7.b6.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, k7.b6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(ko0Var, k7.b6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                ko0Var.setReportChanges(true);
                ko0Var.setDelegate(new v31(this, ko0Var, y31Var, y31Var2, y31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f10 = vh.v2.c((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                ko0Var.setProgress(f10);
                ko0Var.f26332w.Y(ko0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar2 = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f32217b)) {
                    i12 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f32217b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f32217b));
                }
                uaVar2.a(chat, null);
                uaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                uaVar = uaVar2;
                view = uaVar;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19871b7, saveToGallerySettingsActivity.getResourceProvider())));
                uaVar = z6Var;
                view = uaVar;
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
