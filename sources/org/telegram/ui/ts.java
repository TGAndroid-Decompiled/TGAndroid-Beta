package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;
public final class ts extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public rs E;
    public org.telegram.ui.Cells.s8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ss O;
    public final org.telegram.ui.Components.e50 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.r61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.w0 f37000a;
    public org.telegram.ui.Cells.i3 f37001b;
    public org.telegram.ui.Cells.i3 f37002c;
    public org.telegram.ui.Cells.i3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f37003f;
    public TextView h;
    public org.telegram.ui.Components.g9 f37004n;
    public final org.telegram.ui.ActionBar.f6 f37005r;
    public RadialProgressView f37006s;
    public bi.s7 v;
    public AnimatorSet f37007w;
    public org.telegram.ui.Cells.s8 f37008x;
    public org.telegram.ui.Cells.s8 f37009y;

    public ts(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }

    public static void U(ts tsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f17337id = tsVar.getMessagesController().getInputUser(tsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(tsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(tsVar, 5));
    }

    public static void V(ts tsVar, TLRPC.User user) {
        tsVar.Q = null;
        tsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(tsVar.currentAccount).getUserFull(tsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            tsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = tsVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.f17219id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        tsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        tsVar.g0();
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(ts tsVar) {
        TLRPC.User user;
        if (tsVar.e != null && (user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H))) != null) {
            tsVar.f37004n.m(tsVar.currentAccount, user);
            tsVar.e.invalidate();
        }
    }

    public static void X(ts tsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.e50 e50Var = tsVar.P;
        if (e50Var.T) {
            return;
        }
        int i10 = tsVar.S;
        if (i10 == 2) {
            tsVar.Q = photoSize.location;
        } else if (i10 == 1 && tsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.f5 parentLayout = tsVar.getParentLayout();
            org.telegram.ui.ActionBar.p2 lastFragment = tsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if (p2Var instanceof eo) {
                    eo eoVar = (eo) p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var2 = lastFragment;
                    if (eoVar.a() == tsVar.H && eoVar.R3 == 0) {
                        eoVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            if (arrayList.get(size2) != p2Var3) {
                                ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            p2Var2 = p2Var3;
                        }
                        p2Var2.finishFragment();
                    } else {
                        lastFragment = p2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.p2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            tsVar.e.h(ImageLocation.getForLocal(tsVar.Q), "50_50", tsVar.f37004n, tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H)));
            if (tsVar.S == 2) {
                tsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(tsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = tsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = tsVar.getUserConfig().getNewMessageId();
                tL_messageService.f17216id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = tsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = tsVar.H;
                tL_messageService.date = tsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(tsVar.currentAccount, tL_messageService, false, false);
                tsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(tsVar.currentAccount).updateInterfaceWithMessages(tsVar.H, arrayList2, 0);
                tsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, e50Var);
            }
        } else {
            TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
            if (tsVar.Z == null && user != null) {
                if (inputFile2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                tsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            tsVar.d0(tsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, tsVar.S);
            tsVar.e0(false, true);
        }
        tsVar.g0();
    }

    public static void Y(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (tsVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                TLRPC.UserFull userFull = MessagesController.getInstance(tsVar.currentAccount).getUserFull(tsVar.H);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    tsVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(tsVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    xf.e0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    tsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    tsVar.getMessagesController().getDialogPhotos(tsVar.H).addPhotoAtStart(tL_photos_photo.photo);
                    tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (tsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.wc.a0(tsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.wc.a0(tsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                tsVar.Q = null;
                tsVar.g0();
            }
        }
    }

    public static void Z(ts tsVar) {
        if (tsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(tsVar.Z.getId()));
            NotificationCenter.getInstance(tsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.f37006s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f37006s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new ls(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ts.X(ts.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.L;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        int i15;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.j6.f17965f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37005r;
        lVar.A(org.telegram.ui.ActionBar.j6.v0(i16, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ps(this));
        this.f37000a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.j6.f17872a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.j6.f17928d6;
        frameLayout2.setBackgroundColor(getThemedColor(i18));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.w9 w9Var2 = this.e;
        int i19 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(w9Var2, w7.a6.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        bi.s7 s7Var = new bi.s7(this, context, paint, 8);
        this.v = s7Var;
        FrameLayout frameLayout4 = this.V;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(s7Var, w7.a6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37006s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f37006s.setProgressColor(-1);
        this.f37006s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f37006s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, w7.a6.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f37003f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.f37003f.setTextSize(1, 18.0f);
        this.f37003f.setLines(1);
        this.f37003f.setMaxLines(1);
        this.f37003f.setSingleLine(true);
        TextView textView2 = this.f37003f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f37003f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f37003f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f37003f;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 94.0f;
        }
        if (z10) {
            f10 = 94.0f;
        } else {
            f10 = 0.0f;
        }
        TextView f13 = org.telegram.ui.Cells.r6.f(frameLayout6, textView4, w7.a6.d(-2, -2.0f, i20, f7, 25.66f, f10, 0.0f), context);
        this.h = f13;
        f13.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i19 = 5;
        }
        int i21 = i19 | 48;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 94.0f;
        }
        if (z11) {
            f12 = 94.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout7.addView(textView6, w7.a6.d(-2, -2.0f, i21, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f37005r);
        this.f37001b = i3Var;
        i3Var.f19293b.setImeOptions(5);
        this.f37001b.setBackgroundColor(getThemedColor(i18));
        this.f37001b.setDivider(true);
        this.f37001b.f19293b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ts f35333b;

            {
                this.f35333b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ts tsVar = this.f35333b;
                            tsVar.f37002c.f19293b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.f37002c.f19293b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ts tsVar2 = this.f35333b;
                        if (i22 == 6) {
                            tsVar2.f37000a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            tsVar2.d.f19293b.requestFocus();
                            tsVar2.d.f19293b.setSelection(tsVar2.f37002c.f19293b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35333b.f37000a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37001b.f19293b.setOnFocusChangeListener(new Object());
        this.f37001b.setText(this.M);
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f37005r);
        this.f37002c = i3Var2;
        i3Var2.f19293b.setImeOptions(5);
        this.f37002c.setBackgroundColor(getThemedColor(i18));
        this.f37002c.f19293b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ts f35333b;

            {
                this.f35333b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ts tsVar = this.f35333b;
                            tsVar.f37002c.f19293b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.f37002c.f19293b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ts tsVar2 = this.f35333b;
                        if (i22 == 6) {
                            tsVar2.f37000a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            tsVar2.d.f19293b.requestFocus();
                            tsVar2.d.f19293b.setSelection(tsVar2.f37002c.f19293b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35333b.f37000a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37002c.setText(this.N);
        org.telegram.ui.Cells.i3 i3Var3 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f37005r);
        this.d = i3Var3;
        i3Var3.f19293b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        this.d.f19293b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f19293b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ts f35333b;

            {
                this.f35333b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ts tsVar = this.f35333b;
                            tsVar.f37002c.f19293b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.f37002c.f19293b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ts tsVar2 = this.f35333b;
                        if (i22 == 6) {
                            tsVar2.f37000a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            tsVar2.d.f19293b.requestFocus();
                            tsVar2.d.f19293b.setSelection(tsVar2.f37002c.f19293b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35333b.f37000a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, f6Var);
            this.f37008x = s8Var;
            s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f37008x.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            org.telegram.ui.Cells.s8 s8Var2 = this.f37008x;
            int i22 = org.telegram.ui.ActionBar.j6.f18254v6;
            int i23 = org.telegram.ui.ActionBar.j6.f18236u6;
            s8Var2.e(i22, i23);
            final org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37008x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37008x.e.setAnimation(hj0Var);
            this.f37008x.setOnClickListener(new View.OnClickListener(this) {
                public final ts f35591b;

                {
                    this.f35591b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ts tsVar = this.f35591b;
                            boolean z13 = true;
                            tsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = tsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            bi.f0 f0Var = new bi.f0(13);
                            final org.telegram.ui.Components.hj0 hj0Var2 = hj0Var;
                            e50Var.o(z13, f0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ts tsVar2 = tsVar;
                                            boolean h = tsVar2.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                                            if (!h) {
                                                hj0Var3.P(86);
                                                tsVar2.f37009y.e.d();
                                                return;
                                            }
                                            hj0Var3.N(0, false, false);
                                            return;
                                        default:
                                            ts tsVar3 = tsVar;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var2;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.f37008x.e.d();
                                                return;
                                            }
                                            hj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            hj0Var2.M(0);
                            hj0Var2.P(43);
                            tsVar.f37008x.e.d();
                            return;
                        default:
                            final ts tsVar2 = this.f35591b;
                            tsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = tsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bi.f0 f0Var2 = new bi.f0(13);
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var;
                            e50Var2.o(z12, f0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ts tsVar22 = tsVar2;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.f37009y.e.d();
                                                return;
                                            }
                                            hj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ts tsVar3 = tsVar2;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.f37008x.e.d();
                                                return;
                                            }
                                            hj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            hj0Var3.M(0);
                            hj0Var3.P(43);
                            tsVar2.f37009y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(context, f6Var);
            this.f37009y = s8Var3;
            s8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f37009y.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.f37009y.e(i22, i23);
            final org.telegram.ui.Components.hj0 hj0Var2 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37009y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37009y.e.setAnimation(hj0Var2);
            this.f37009y.setOnClickListener(new View.OnClickListener(this) {
                public final ts f35591b;

                {
                    this.f35591b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ts tsVar = this.f35591b;
                            boolean z13 = true;
                            tsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = tsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            bi.f0 f0Var = new bi.f0(13);
                            final org.telegram.ui.Components.hj0 hj0Var22 = hj0Var2;
                            e50Var.o(z13, f0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ts tsVar22 = tsVar;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var22;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.f37009y.e.d();
                                                return;
                                            }
                                            hj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ts tsVar3 = tsVar;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var22;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.f37008x.e.d();
                                                return;
                                            }
                                            hj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            hj0Var22.M(0);
                            hj0Var22.P(43);
                            tsVar.f37008x.e.d();
                            return;
                        default:
                            final ts tsVar2 = this.f35591b;
                            tsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = tsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bi.f0 f0Var2 = new bi.f0(13);
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                            e50Var2.o(z12, f0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ts tsVar22 = tsVar2;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.f37009y.e.d();
                                                return;
                                            }
                                            hj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ts tsVar3 = tsVar2;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.f37008x.e.d();
                                                return;
                                            }
                                            hj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            hj0Var3.M(0);
                            hj0Var3.P(43);
                            tsVar2.f37009y.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new rs(this, context, f6Var);
            if (this.f37004n == null) {
                this.f37004n = new org.telegram.ui.Components.g9(0, user);
            }
            this.U.e(user.photo, this.f37004n);
            this.E.addView(this.U, w7.a6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.E.e(i22, i23);
            this.E.setOnClickListener(new a0(this, context, user, 10));
            org.telegram.ui.Cells.s8 s8Var4 = new org.telegram.ui.Cells.s8(context, f6Var);
            this.F = s8Var4;
            s8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.F.e(i22, i23);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.u10(24, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 7), new a1(this, 26), null);
        this.W = r61Var;
        r61Var.o1();
        this.W.setOnScrollListener(new hi.p3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.W, w7.a6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Y2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.H);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new fg.e1(this, fileLocation, inputFile2, fileLocation2, i10));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                f0();
            }
        } else if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.S != 1) {
            return true;
        }
        return false;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f37006s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f37007w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37007w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37007w = animatorSet2;
            if (z10) {
                this.f37006s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f37007w;
                RadialProgressView radialProgressView = this.f37006s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f37006s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f37007w.setDuration(180L);
            this.f37007w.addListener(new org.telegram.ui.Components.yo(22, this, z10));
            this.f37007w.start();
        } else if (z10) {
            this.f37006s.setAlpha(1.0f);
            this.f37006s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f37006s.setAlpha(0.0f);
            this.f37006s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f37003f != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f37003f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f37003f;
                gf.b c10 = gf.b.c();
                textView.setText(c10.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.Q == null) {
                org.telegram.ui.Components.w9 w9Var = this.e;
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(0, user);
                this.f37004n = g9Var;
                w9Var.e(user, g9Var);
            }
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.T), "50_50", this.f37004n, null);
        }
        if (this.f37004n == null) {
            this.f37004n = new org.telegram.ui.Components.g9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.f37004n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f37004n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f37005r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        TextView textView = this.f37003f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37001b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.i3 i3Var = this.f37001b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.i3 i3Var2 = this.f37001b;
        int i12 = org.telegram.ui.ActionBar.j6.f18055k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.i3 i3Var3 = this.f37001b;
        int i13 = org.telegram.ui.ActionBar.j6.f18073l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37002c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37002c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37002c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37002c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f18174r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.K = notificationsSettings.getBoolean("dialog_bar_exception" + this.H, false);
        if (this.H != 0) {
            user = getMessagesController().getUser(Long.valueOf(this.H));
        } else {
            user = null;
        }
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.f22552a = this;
            e50Var.f22553b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P.j();
    }

    @Override
    public final void onResume() {
        super.onResume();
        f0();
        this.P.l();
    }

    @Override
    public final boolean t() {
        return false;
    }

    public ts(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f37005r = f6Var;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }
}
