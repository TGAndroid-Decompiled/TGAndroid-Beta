package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class qr0 extends org.telegram.ui.ActionBar.j {

    public final org.telegram.ui.ActionBar.c6 f41738a;

    public final PhotoViewer f41739b;

    public qr0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41739b = photoViewer;
        this.f41738a = c6Var;
    }

    @Override
    public final boolean a() {
        PhotoViewer photoViewer = this.f41739b;
        if (photoViewer.P4 != null || photoViewer.X4 != null) {
            return true;
        }
        if (photoViewer.W4 == null) {
            return photoViewer.f35637f7 != null;
        }
        FileLoader fileLoader = FileLoader.getInstance(photoViewer.P);
        ImageLocation imageLocation = photoViewer.W4;
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.q1(imageLocation), photoViewer.f35777v5 != 0 || photoViewer.f35797x5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.P);
        ImageLocation imageLocation2 = photoViewer.W4;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.q1(imageLocation2), false).exists();
    }

    @Override
    public final void b(int i10) {
        TLObject tLObject;
        View viewFindViewWithTag;
        boolean zIsChannel;
        TLRPC.Chat chat;
        TLRPC.User user;
        boolean zIsChannelAndNotMegaGroup;
        boolean z10;
        String absolutePath;
        File pathToMessage;
        int i11;
        MessageObject.GroupedMessages groupedMessagesY8;
        File fileB;
        ?? r14;
        boolean zA;
        boolean z11;
        File pathToAttach;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.c6 c6Var = this.f41738a;
        boolean z12 = true;
        z12 = true;
        z12 = true;
        Integer num = 1;
        PhotoViewer photoViewer = this.f41739b;
        if (i10 == -1) {
            ys0 ys0Var = photoViewer.H1;
            if (ys0Var == null || !ys0Var.o0()) {
                if (photoViewer.H1()) {
                    photoViewer.E0(false);
                    return;
                } else {
                    photoViewer.G0(true, false);
                    return;
                }
            }
            return;
        }
        if (i10 == 2) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && photoViewer.f35800y.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                photoViewer.f35800y.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            final ArrayList arrayList = new ArrayList(1);
            if (photoViewer.f35652h4 != null) {
                i11 = 4;
                groupedMessagesY8 = photoViewer.f35652h4.y8(photoViewer.P4.getGroupId());
            } else {
                i11 = 4;
                groupedMessagesY8 = null;
            }
            if (groupedMessagesY8 != null) {
                arrayList.addAll(groupedMessagesY8.messages);
            } else {
                arrayList.add(photoViewer.P4);
            }
            if (arrayList.size() > 1) {
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.isLivePhoto()) {
                        z15 = true;
                    } else if (messageObject.isVideo()) {
                        z13 = true;
                    } else {
                        z14 = true;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35800y, c6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
                String string = (photoViewer.P4 == null || !photoViewer.P4.isVideo() || photoViewer.P4.isLivePhoto()) ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia);
                final int i14 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2(this) {

                    public final qr0 f39157b;

                    {
                        this.f39157b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                qr0 qr0Var = this.f39157b;
                                qr0Var.getClass();
                                ArrayList arrayList2 = new ArrayList(1);
                                PhotoViewer photoViewer2 = qr0Var.f41739b;
                                arrayList2.add(photoViewer2.P4);
                                PhotoViewer.D(photoViewer2, arrayList2);
                                break;
                            default:
                                qr0 qr0Var2 = this.f39157b;
                                PhotoViewer photoViewer3 = qr0Var2.f41739b;
                                MessageObject messageObject2 = photoViewer3.P4;
                                if (messageObject2 != null) {
                                    File pathToAttach2 = null;
                                    File pathToAttach3 = ((MessageObject.getMedia(messageObject2.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.P4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.P).getPathToAttach(photoViewer3.p1(photoViewer3.L4, null), true) : FileLoader.getInstance(photoViewer3.P).getPathToMessage(photoViewer3.P4.messageOwner);
                                    boolean zIsVideo = photoViewer3.P4.isVideo();
                                    boolean zIsLivePhoto = photoViewer3.P4.isLivePhoto();
                                    if (zIsLivePhoto) {
                                        TLRPC.Document document2 = MessageObject.getMedia(photoViewer3.P4.messageOwner) != null ? MessageObject.getMedia(photoViewer3.P4.messageOwner).document : null;
                                        if (document2 != null && ((pathToAttach2 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, false)) == null || !pathToAttach2.exists())) {
                                            pathToAttach2 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, true);
                                        }
                                    }
                                    if (!zIsLivePhoto) {
                                        if (pathToAttach3 != null && pathToAttach3.exists()) {
                                            MediaController.saveFile(pathToAttach3.toString(), photoViewer3.f35800y, zIsVideo ? 1 : 0, null, null, new kr0(qr0Var2, zIsVideo, 0));
                                        } else {
                                            photoViewer3.U2();
                                        }
                                    } else if (pathToAttach3 != null && pathToAttach3.exists() && pathToAttach2 != null && pathToAttach2.exists()) {
                                        MediaController.saveFile(pathToAttach3.toString(), pathToAttach2.toString(), photoViewer3.f35800y, new hr0(qr0Var2, 1));
                                    } else {
                                        photoViewer3.U2();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                String pluralString = (z13 || z15) ? LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]);
                final boolean z16 = z13;
                final boolean z17 = z14;
                final boolean z18 = z15;
                alertDialog$Builder.k(pluralString, new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        qr0 qr0Var = this.f40907a;
                        PhotoViewer photoViewer2 = qr0Var.f41739b;
                        int[] iArr = new int[1];
                        final rq0 rq0Var = new rq0(qr0Var, new int[1], iArr, z16, z17, z18);
                        int i16 = 0;
                        while (true) {
                            ArrayList arrayList2 = arrayList;
                            if (i16 >= arrayList2.size()) {
                                return;
                            }
                            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
                            if (messageObject2 != null) {
                                File pathToAttach2 = null;
                                File pathToAttach3 = ((MessageObject.getMedia(messageObject2.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject2.messageOwner).webpage != null && MessageObject.getMedia(messageObject2.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer2.P).getPathToAttach(photoViewer2.p1(photoViewer2.L4, null), true) : FileLoader.getInstance(photoViewer2.P).getPathToMessage(messageObject2.messageOwner);
                                boolean zIsVideo = messageObject2.isVideo();
                                boolean zIsLivePhoto = messageObject2.isLivePhoto();
                                if (zIsLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(messageObject2.messageOwner) != null ? MessageObject.getMedia(messageObject2.messageOwner).document : null;
                                    if (document2 != null && ((pathToAttach2 = FileLoader.getInstance(photoViewer2.P).getPathToAttach(document2, false)) == null || !pathToAttach2.exists())) {
                                        pathToAttach2 = FileLoader.getInstance(photoViewer2.P).getPathToAttach(document2, true);
                                    }
                                }
                                if (zIsLivePhoto && pathToAttach3 != null && pathToAttach3.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (pathToAttach2 == null || !pathToAttach2.exists()) {
                                        final int i17 = 1;
                                        MediaController.saveFile(pathToAttach3.toString(), photoViewer2.f35800y, 0, null, null, new Utilities.Callback() {
                                            @Override
                                            public final void run(Object obj) {
                                                switch (i17) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i18 = 0;
                                        MediaController.saveFile(pathToAttach3.toString(), pathToAttach2.toString(), photoViewer2.f35800y, new Utilities.Callback() {
                                            @Override
                                            public final void run(Object obj) {
                                                switch (i18) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(rq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!zIsLivePhoto && pathToAttach3 != null && pathToAttach3.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i19 = 2;
                                    MediaController.saveFile(pathToAttach3.toString(), photoViewer2.f35800y, zIsVideo ? 1 : 0, null, null, new Utilities.Callback() {
                                        @Override
                                        public final void run(Object obj) {
                                            switch (i19) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(rq0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(rq0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(rq0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i16++;
                        }
                    }
                });
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new j70(8));
                org.telegram.ui.ActionBar.b2 b2VarA = alertDialog$Builder.a();
                b2VarA.i(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23367ug));
                b2VarA.show();
                View viewD = b2VarA.d(-3);
                if (viewD instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.g6.f23284q7;
                    ((TextView) viewD).setTextColor(photoViewer.z1(i15));
                    viewD.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), photoViewer.z1(i15)));
                    ViewGroup viewGroup = b2VarA.f22762p0;
                    if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                        viewD.bringToFront();
                    }
                }
                b2VarA.o(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23135hg));
                return;
            }
            if (photoViewer.P4 == null) {
                if (photoViewer.W4 != null) {
                    String strQ1 = PhotoViewer.q1(photoViewer.W4);
                    FileLoader fileLoader = FileLoader.getInstance(photoViewer.P);
                    ImageLocation imageLocation = photoViewer.W4;
                    File pathToAttach2 = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, strQ1, photoViewer.f35777v5 != 0 || photoViewer.f35797x5);
                    if (pathToAttach2 != null && !pathToAttach2.exists()) {
                        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.P);
                        ImageLocation imageLocation2 = photoViewer.W4;
                        pathToAttach2 = fileLoader2.getPathToAttach(imageLocation2 == null ? null : imageLocation2.location, strQ1, false);
                    }
                    if (strQ1 != null) {
                        strQ1 = strQ1.toLowerCase();
                    }
                    r14 = strQ1 != null && (strQ1.equals("webm") || strQ1.equals("mp4") || strQ1.equals("gif"));
                    fileB = pathToAttach2;
                } else if (photoViewer.f35637f7 != null) {
                    fileB = photoViewer.f35637f7.b(photoViewer.L4);
                    zA = photoViewer.f35637f7.a(photoViewer.L4);
                } else {
                    fileB = null;
                    r14 = 0;
                }
                if (fileB != null && !fileB.exists()) {
                    fileB = new File(FileLoader.getDirectory(i11), fileB.getName());
                }
                if (photoViewer.P4 == null && photoViewer.P4.isLivePhoto()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (MessageObject.getMedia(photoViewer.P4.messageOwner) != null) {
                        document = MessageObject.getMedia(photoViewer.P4.messageOwner).document;
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, false);
                        if (pathToAttach != null || !pathToAttach.exists()) {
                            pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, true);
                        }
                    } else {
                        pathToAttach = null;
                    }
                } else {
                    pathToAttach = null;
                }
                if (!z11) {
                    if (fileB == null && fileB.exists()) {
                        MediaController.saveFile(fileB.toString(), photoViewer.f35800y, r14, null, null, new kr0(this, r14, true ? 1 : 0));
                        return;
                    } else {
                        photoViewer.U2();
                        return;
                    }
                }
                if (fileB == null && fileB.exists() && pathToAttach != null && pathToAttach.exists()) {
                    MediaController.saveFile(fileB.toString(), pathToAttach.toString(), photoViewer.f35800y, new hr0(this, 0));
                    return;
                } else {
                    photoViewer.U2();
                    return;
                }
            }
            if ((MessageObject.getMedia(photoViewer.P4.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer.P4.messageOwner).webpage.document == null) {
                fileB = FileLoader.getInstance(photoViewer.P).getPathToAttach(photoViewer.p1(photoViewer.L4, null), true);
                if (!fileB.exists()) {
                    fileB = new File(FileLoader.getDirectory(i11), fileB.getName());
                }
            } else {
                fileB = FileLoader.getInstance(photoViewer.P).getPathToMessage(photoViewer.P4.messageOwner);
            }
            zA = photoViewer.P4.isVideo();
            r14 = zA;
            if (fileB != null) {
                fileB = new File(FileLoader.getDirectory(i11), fileB.getName());
            }
            if (photoViewer.P4 == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                pathToAttach = null;
            } else {
                if (MessageObject.getMedia(photoViewer.P4.messageOwner) != null) {
                    document = MessageObject.getMedia(photoViewer.P4.messageOwner).document;
                } else {
                    document = null;
                }
                if (document != null) {
                    pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, false);
                    if (pathToAttach != null) {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, true);
                    } else {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, true);
                    }
                } else {
                    pathToAttach = null;
                }
            }
            if (!z11) {
                if (fileB == null) {
                }
                photoViewer.U2();
                return;
            } else {
                if (fileB == null) {
                }
                photoViewer.U2();
                return;
            }
        }
        if (i10 == 24) {
            xe.b.D().P(photoViewer.m1());
            photoViewer.C0.performClick();
            return;
        }
        if (i10 == 3) {
            if (photoViewer.A5 != 0) {
                photoViewer.f35714o4 = true;
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", photoViewer.A5);
                org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(bundle, null);
                if (photoViewer.f35652h4 != null) {
                    o90Var.X(photoViewer.f35652h4.v8());
                }
                photoViewer.G0(false, false);
                if (photoViewer.f35800y instanceof LaunchActivity) {
                    ((LaunchActivity) photoViewer.f35800y).q0(o90Var, false, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 5 || i10 == 21) {
            if (photoViewer.P4 == null) {
                return;
            }
            Bundle bundle2 = new Bundle();
            long dialogId = photoViewer.A5;
            if (photoViewer.P4 != null) {
                dialogId = photoViewer.P4.getDialogId();
            }
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle2.putLong("user_id", dialogId);
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId));
                if (chat2 != null && chat2.migrated_to != null) {
                    bundle2.putLong("migrated_to", dialogId);
                    dialogId = -chat2.migrated_to.channel_id;
                }
                bundle2.putLong("chat_id", -dialogId);
            }
            bundle2.putInt("message_id", photoViewer.P4.getId());
            if (i10 == 21) {
                bundle2.putInt("reply_to", photoViewer.P4.getId());
            }
            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            if (photoViewer.f35800y instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) photoViewer.f35800y;
                launchActivity.q0(new rn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
            }
            photoViewer.G0(false, false);
            photoViewer.P4 = null;
            VideoAds videoAds = photoViewer.Q4;
            if (videoAds != null) {
                videoAds.stop();
                photoViewer.Q4 = null;
                return;
            }
            return;
        }
        if (i10 == 25) {
            if (photoViewer.f35661i4 == null || photoViewer.d == null || photoViewer.P4 == null || photoViewer.P4.messageOwner == null) {
                return;
            }
            if (TextUtils.isEmpty(photoViewer.P4.messageOwner.attachPath)) {
                absolutePath = null;
            } else {
                absolutePath = photoViewer.P4.messageOwner.attachPath;
                if (TextUtils.isEmpty(absolutePath) || !com.google.android.recaptcha.internal.a.v(absolutePath)) {
                    absolutePath = null;
                }
            }
            if (TextUtils.isEmpty(absolutePath) && (pathToMessage = FileLoader.getInstance(photoViewer.P).getPathToMessage(photoViewer.P4.messageOwner, true)) != null && pathToMessage.exists()) {
                absolutePath = pathToMessage.getAbsolutePath();
            }
            String str = absolutePath;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            rn rnVar = photoViewer.f35652h4;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, str, 0, false, 0, 0, 0L));
            this.f41739b.f2(arrayList2, 0, 11, false, new or0(), rnVar);
            photoViewer.X0(null, null, false, null);
            photoViewer.l2();
            kt.q().x();
            return;
        }
        if (i10 == 4) {
            if (photoViewer.P4 == null || !(photoViewer.f35800y instanceof LaunchActivity)) {
                return;
            }
            if (photoViewer.P4.scheduled) {
                zIsChannelAndNotMegaGroup = false;
            } else {
                long dialogId2 = photoViewer.P4.getDialogId();
                if (DialogObject.isChatDialog(dialogId2)) {
                    zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId2)));
                } else {
                    zIsChannelAndNotMegaGroup = false;
                }
            }
            ((LaunchActivity) photoViewer.f35800y).K0(photoViewer.P4.currentAccount);
            ArrayList arrayList3 = new ArrayList(1);
            MessageObject.GroupedMessages groupedMessagesY9 = photoViewer.f35652h4 != null ? photoViewer.f35652h4.y8(photoViewer.P4.getGroupId()) : null;
            if (groupedMessagesY9 != null) {
                arrayList3.addAll(groupedMessagesY9.messages);
            } else {
                arrayList3.add(photoViewer.P4);
            }
            if (zIsChannelAndNotMegaGroup && arrayList3.size() <= 1) {
                PhotoViewer.D(photoViewer, arrayList3);
                return;
            }
            if (arrayList3.size() <= 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("onlySelect", true);
                bundle3.putBoolean("canSelectTopics", true);
                bundle3.putInt("dialogsType", 3);
                gy gyVar = new gy(bundle3);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(photoViewer.P4);
                gyVar.f38621y2 = new b7(this, arrayList4, photoViewer.f35652h4, 18);
                ((LaunchActivity) photoViewer.f35800y).q0(gyVar, false, true);
                photoViewer.G0(false, false);
                return;
            }
            int i16 = 0;
            while (true) {
                if (i16 >= arrayList3.size()) {
                    z10 = true;
                    break;
                } else {
                    if (!((MessageObject) arrayList3.get(i16)).isPhoto() || ((MessageObject) arrayList3.get(i16)).isVideo()) {
                        z10 = false;
                        break;
                    }
                    i16++;
                }
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(photoViewer.f35800y, c6Var);
            alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
            alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
            alertDialog$Builder2.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
            final int i17 = 0;
            alertDialog$Builder2.h(z10 ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.a2(this) {

                public final qr0 f39157b;

                {
                    this.f39157b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                    switch (i17) {
                        case 0:
                            qr0 qr0Var = this.f39157b;
                            qr0Var.getClass();
                            ArrayList arrayList5 = new ArrayList(1);
                            PhotoViewer photoViewer2 = qr0Var.f41739b;
                            arrayList5.add(photoViewer2.P4);
                            PhotoViewer.D(photoViewer2, arrayList5);
                            break;
                        default:
                            qr0 qr0Var2 = this.f39157b;
                            PhotoViewer photoViewer3 = qr0Var2.f41739b;
                            MessageObject messageObject2 = photoViewer3.P4;
                            if (messageObject2 != null) {
                                File pathToAttach3 = null;
                                File pathToAttach4 = ((MessageObject.getMedia(messageObject2.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.P4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.P).getPathToAttach(photoViewer3.p1(photoViewer3.L4, null), true) : FileLoader.getInstance(photoViewer3.P).getPathToMessage(photoViewer3.P4.messageOwner);
                                boolean zIsVideo = photoViewer3.P4.isVideo();
                                boolean zIsLivePhoto = photoViewer3.P4.isLivePhoto();
                                if (zIsLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(photoViewer3.P4.messageOwner) != null ? MessageObject.getMedia(photoViewer3.P4.messageOwner).document : null;
                                    if (document2 != null && ((pathToAttach3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, false)) == null || !pathToAttach3.exists())) {
                                        pathToAttach3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, true);
                                    }
                                }
                                if (!zIsLivePhoto) {
                                    if (pathToAttach4 != null && pathToAttach4.exists()) {
                                        MediaController.saveFile(pathToAttach4.toString(), photoViewer3.f35800y, zIsVideo ? 1 : 0, null, null, new kr0(qr0Var2, zIsVideo, 0));
                                    } else {
                                        photoViewer3.U2();
                                    }
                                } else if (pathToAttach4 != null && pathToAttach4.exists() && pathToAttach3 != null && pathToAttach3.exists()) {
                                    MediaController.saveFile(pathToAttach4.toString(), pathToAttach3.toString(), photoViewer3.f35800y, new hr0(qr0Var2, 1));
                                } else {
                                    photoViewer3.U2();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.k(z10 ? LocaleController.formatPluralString("AllNPhotos", arrayList3.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList3.size(), new Object[0]), new nl0(7, this, arrayList3));
            alertDialog$Builder2.i(LocaleController.getString("Cancel", R.string.Cancel), new j70(9));
            org.telegram.ui.ActionBar.b2 b2VarA2 = alertDialog$Builder2.a();
            b2VarA2.i(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23367ug));
            b2VarA2.show();
            View viewD2 = b2VarA2.d(-3);
            if (viewD2 instanceof TextView) {
                int i18 = org.telegram.ui.ActionBar.g6.f23284q7;
                ((TextView) viewD2).setTextColor(photoViewer.z1(i18));
                viewD2.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), photoViewer.z1(i18)));
                ViewGroup viewGroup2 = b2VarA2.f22762p0;
                if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                    viewD2.bringToFront();
                }
            }
            b2VarA2.o(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23135hg));
            return;
        }
        if (i10 == 18) {
            PhotoViewer.E(photoViewer);
            return;
        }
        if (i10 == 26) {
            if (photoViewer.f35800y == null || photoViewer.d == null) {
                return;
            }
            photoViewer.d.I();
            photoViewer.G0(true, false);
            return;
        }
        if (i10 == 7) {
            if (photoViewer.f35800y == null || photoViewer.d == null) {
                return;
            }
            if (photoViewer.P4 == null || photoViewer.P4.scheduled) {
                zIsChannel = false;
            } else {
                long dialogId3 = photoViewer.P4.getDialogId();
                if (DialogObject.isChatDialog(dialogId3)) {
                    zIsChannel = ChatObject.isChannel(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId3)));
                } else {
                    zIsChannel = false;
                }
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(photoViewer.f35800y);
            CharSequence charSequenceA0 = photoViewer.d.a0();
            if (charSequenceA0 != null) {
                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                alertDialog$Builder3.g(charSequenceA0);
            } else if (photoViewer.f35723p4 || (!(photoViewer.W4 == null || photoViewer.W4 == photoViewer.V4) || (photoViewer.P4 != null && photoViewer.P4.isVideo()))) {
                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteVideoTitle", R.string.AreYouSureDeleteVideoTitle));
                if (zIsChannel) {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideoEveryone", R.string.AreYouSureDeleteVideoEveryone, new Object[0]));
                } else {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideo", R.string.AreYouSureDeleteVideo, new Object[0]));
                }
            } else if (photoViewer.P4 == null || !photoViewer.P4.isGif()) {
                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                if (zIsChannel) {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhotoEveryone", R.string.AreYouSureDeletePhotoEveryone, new Object[0]));
                } else {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhoto", R.string.AreYouSureDeletePhoto, new Object[0]));
                }
            } else {
                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteGIFTitle", R.string.AreYouSureDeleteGIFTitle));
                if (zIsChannel) {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIFEveryone", R.string.AreYouSureDeleteGIFEveryone, new Object[0]));
                } else {
                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIF", R.string.AreYouSureDeleteGIF, new Object[0]));
                }
            }
            boolean[] zArr = new boolean[1];
            if (photoViewer.P4 != null && !photoViewer.P4.scheduled) {
                long dialogId4 = photoViewer.P4.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId4)) {
                    if (DialogObject.isUserDialog(dialogId4)) {
                        user = MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(dialogId4));
                        chat = null;
                    } else {
                        chat = MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId4));
                        user = null;
                    }
                    if (user != null || !ChatObject.isChannel(chat)) {
                        int currentTime = ConnectionsManager.getInstance(photoViewer.P).getCurrentTime();
                        int i19 = user != null ? MessagesController.getInstance(photoViewer.P).revokeTimePmLimit : MessagesController.getInstance(photoViewer.P).revokeTimeLimit;
                        if ((user != null && user.f22527id != UserConfig.getInstance(photoViewer.P).getClientUserId()) || chat != null) {
                            boolean z19 = user != null && MessagesController.getInstance(photoViewer.P).canRevokePmInbox;
                            if ((photoViewer.P4.messageOwner.action == null || (photoViewer.P4.messageOwner.action instanceof TLRPC.TL_messageActionEmpty)) && ((photoViewer.P4.isOut() || z19 || ChatObject.hasAdminRights(chat)) && currentTime - photoViewer.P4.messageOwner.date <= i19)) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.f35800y);
                                TLRPC.Chat chat3 = chat;
                                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(photoViewer.f35800y, 1, c6Var);
                                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                                if (chat3 != null) {
                                    y1Var.e(LocaleController.getString("DeleteForAll", R.string.DeleteForAll), "", false, false, false);
                                } else {
                                    y1Var.e(LocaleController.formatString("DeleteForUser", R.string.DeleteForUser, UserObject.getFirstName(user)), "", false, false, false);
                                }
                                y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                                frameLayout.addView(y1Var, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                y1Var.setOnClickListener(new m8(5, zArr));
                                alertDialog$Builder3.n(frameLayout);
                                alertDialog$Builder3.f22702a.C = 9;
                            }
                        }
                    }
                }
            }
            alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new nl0(8, this, zArr));
            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2VarA3 = alertDialog$Builder3.a();
            photoViewer.S2(alertDialog$Builder3);
            TextView textView = (TextView) b2VarA3.d(-1);
            if (textView != null) {
                textView.setTextColor(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23284q7));
                return;
            }
            return;
        }
        TLRPC.Photo photo = null;
        String absolutePath2 = null;
        photo = null;
        if (i10 == 9 || i10 == 16) {
            PhotoViewer.G(photoViewer);
            return;
        }
        if (i10 == 10) {
            try {
                if (photoViewer.f35723p4) {
                    we.e.s(photoViewer.f35800y, MessageObject.getMedia(photoViewer.P4.messageOwner).webpage.url);
                    photoViewer.G0(false, false);
                    return;
                }
                if (photoViewer.P4 == null) {
                    if (photoViewer.f35637f7 != null) {
                        if (AndroidUtilities.openForView(photoViewer.f35637f7.d(photoViewer.L4), photoViewer.f35800y)) {
                            photoViewer.G0(false, false);
                            return;
                        } else {
                            photoViewer.U2();
                            return;
                        }
                    }
                    return;
                }
                MessageObject messageObject2 = photoViewer.P4;
                Activity activity = photoViewer.f35800y;
                if (!photoViewer.P4.isVideo() && !photoViewer.P4.isPhoto() && !photoViewer.P4.isSticker()) {
                    z12 = false;
                }
                if (AndroidUtilities.openForView(messageObject2, activity, c6Var, z12)) {
                    photoViewer.G0(false, false);
                    return;
                } else {
                    photoViewer.U2();
                    return;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (i10 == 11 || i10 == 13) {
            if (photoViewer.f35800y == null || photoViewer.P4 == null) {
                return;
            }
            if (MessageObject.getMedia(photoViewer.P4.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                tLObject = MessageObject.getMedia(photoViewer.P4.messageOwner).photo;
            } else if (!(MessageObject.getMedia(photoViewer.P4.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
                return;
            } else {
                tLObject = MessageObject.getMedia(photoViewer.P4.messageOwner).document;
            }
            photoViewer.Q3 = new pr0(this, photoViewer.f35800y, photoViewer.P4, tLObject, this.f41738a);
            photoViewer.Q3.show();
            return;
        }
        if (i10 == 6) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35675k0.f23854b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || viewFindViewWithTag.getVisibility() != 0) {
                return;
            }
            if (!photoViewer.f35723p4) {
                photoViewer.h3();
                return;
            }
            if (photoViewer.f35591b0.e()) {
                if (PhotoViewer.W8 != null) {
                    PhotoViewer.W8.P0();
                }
                photoViewer.F3 = true;
                PhotoViewer.W8 = PhotoViewer.V8;
                PhotoViewer.V8 = null;
                photoViewer.f35619e = false;
                photoViewer.f35629f = false;
                cu0 cu0Var = photoViewer.Z4;
                if (cu0Var != null && !cu0Var.f37153a.getVisible()) {
                    photoViewer.Z4.f37153a.setVisible(true, true);
                }
                photoViewer.f35663i6 = 1.0f;
                photoViewer.f35583a0.invalidate();
                photoViewer.S0();
                return;
            }
            return;
        }
        if (i10 == 8) {
            if (photoViewer.P4 == null) {
                return;
            }
            FileLoader.getInstance(photoViewer.P).cancelLoadFile(photoViewer.P4.getDocument());
            photoViewer.n2(false);
            photoViewer.f35620e0.setTag(num);
            photoViewer.f35620e0.setVisibility(0);
            return;
        }
        if (i10 == 12) {
            if (photoViewer.P4 != null) {
                TLRPC.Document document2 = photoViewer.P4.getDocument();
                if (photoViewer.f35652h4 == null || photoViewer.f35652h4.U == null) {
                    MediaDataController.getInstance(photoViewer.P).addRecentGif(document2, (int) (System.currentTimeMillis() / 1000), true);
                } else {
                    photoViewer.f35652h4.U.n(document2);
                }
                MessagesController.getInstance(photoViewer.P).saveGif(photoViewer.P4, document2);
            } else {
                if (photoViewer.f35637f7 == null) {
                    return;
                }
                TLObject tLObjectD = photoViewer.f35637f7.d(photoViewer.L4);
                if (tLObjectD instanceof TLRPC.Document) {
                    TLRPC.Document document3 = (TLRPC.Document) tLObjectD;
                    MediaDataController.getInstance(photoViewer.P).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                    MessagesController.getInstance(photoViewer.P).saveGif(photoViewer.f35637f7.g(), document3);
                }
            }
            ut0 ut0Var = photoViewer.f35583a0;
            if (ut0Var != null) {
                org.telegram.ui.Components.mc.Z(ut0Var, c6Var).o(org.telegram.ui.Components.lc.f30346y, c6Var).j();
                return;
            }
            return;
        }
        if (i10 != 14) {
            if (i10 == 15) {
                FileLoader fileLoader3 = FileLoader.getInstance(photoViewer.P);
                ImageLocation imageLocation3 = photoViewer.W4;
                File pathToAttach3 = fileLoader3.getPathToAttach(imageLocation3 == null ? null : imageLocation3.location, PhotoViewer.q1(photoViewer.W4), true);
                boolean z20 = photoViewer.W4.imageType == 2;
                if (z20) {
                    FileLoader fileLoader4 = FileLoader.getInstance(photoViewer.P);
                    ImageLocation imageLocation4 = photoViewer.V4;
                    absolutePath2 = fileLoader4.getPathToAttach(imageLocation4 != null ? imageLocation4.location : null, PhotoViewer.q1(photoViewer.V4), true).getAbsolutePath();
                }
                photoViewer.d.f(pathToAttach3.getAbsolutePath(), absolutePath2, z20);
                return;
            }
            if (i10 == 19) {
                int i20 = photoViewer.M4;
                if (i20 < 0 || i20 >= photoViewer.U6.size()) {
                    return;
                }
                MessageObject messageObject3 = (MessageObject) photoViewer.U6.get(photoViewer.M4);
                photoViewer.f35671j5 = true;
                final int i21 = true ? 1 : 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final qr0 f40589b;

                    {
                        this.f40589b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.v0 v0Var = this.f40589b.f41739b.f35675k0;
                                if (v0Var != null) {
                                    v0Var.r(14);
                                    break;
                                }
                                break;
                            case 1:
                                PhotoViewer photoViewer2 = this.f40589b.f41739b;
                                photoViewer2.f35675k0.r(19);
                                photoViewer2.f35675k0.K(20);
                                break;
                            default:
                                PhotoViewer photoViewer3 = this.f40589b.f41739b;
                                photoViewer3.f35675k0.K(19);
                                photoViewer3.f35675k0.r(20);
                                break;
                        }
                    }
                }, 32L);
                PhotoViewer.S(photoViewer);
                MessagesController.getInstance(photoViewer.P).getTranslateController().translatePhoto(messageObject3, new ar0(photoViewer, 3));
                return;
            }
            if (i10 == 20) {
                photoViewer.f35671j5 = false;
                final int i22 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final qr0 f40589b;

                    {
                        this.f40589b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.ActionBar.v0 v0Var = this.f40589b.f41739b.f35675k0;
                                if (v0Var != null) {
                                    v0Var.r(14);
                                    break;
                                }
                                break;
                            case 1:
                                PhotoViewer photoViewer2 = this.f40589b.f41739b;
                                photoViewer2.f35675k0.r(19);
                                photoViewer2.f35675k0.K(20);
                                break;
                            default:
                                PhotoViewer photoViewer3 = this.f40589b.f41739b;
                                photoViewer3.f35675k0.K(19);
                                photoViewer3.f35675k0.r(20);
                                break;
                        }
                    }
                }, 32L);
                PhotoViewer.S(photoViewer);
                return;
            }
            if (i10 == 22) {
                photoViewer.V2 = !photoViewer.V2;
                org.telegram.ui.Components.m61.J(photoViewer.P4, photoViewer.V2);
                org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
                if (m61Var != null) {
                    m61Var.O(photoViewer.V2);
                }
                photoViewer.f35710o0.d(photoViewer.V2);
                photoViewer.f35710o0.setSelectorColor(photoViewer.V2 ? 259241196 : 268435455);
                return;
            }
            if (i10 == 23) {
                if (photoViewer.V4 != null && photoViewer.V4.photo != null) {
                    photo = photoViewer.V4.photo;
                } else if (photoViewer.W4 != null && photoViewer.W4.photo != null) {
                    photo = photoViewer.W4.photo;
                }
                TLRPC.Photo photo2 = photo;
                if (photo2 == null) {
                    return;
                }
                org.telegram.ui.Components.y4.J(photoViewer.P, photoViewer.f35800y, photoViewer.f35777v5, photo2, new jh.b());
                return;
            }
            return;
        }
        TLRPC.Photo photo3 = (TLRPC.Photo) photoViewer.f35598b7.get(photoViewer.L4);
        if (photo3 == null || photo3.sizes.isEmpty()) {
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
        UserConfig userConfig = UserConfig.getInstance(photoViewer.P);
        if (photoViewer.f35777v5 == userConfig.clientUserId) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f22512id = tL_inputPhoto;
            tL_inputPhoto.f22399id = photo3.f22404id;
            tL_inputPhoto.access_hash = photo3.access_hash;
            tL_inputPhoto.file_reference = photo3.file_reference;
            ConnectionsManager.getInstance(photoViewer.P).sendRequest(tL_photos_updateProfilePhoto, new lr0(this, userConfig, photo3, 0));
            TLRPC.User user2 = MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(userConfig.clientUserId));
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                userProfilePhoto.photo_id = photo3.f22404id;
                userProfilePhoto.dc_id = photo3.dc_id;
                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                userConfig.setCurrentUser(user2);
                userConfig.saveConfig(true);
                NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            }
        } else {
            TLRPC.Chat chat4 = MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-photoViewer.f35777v5));
            if (chat4 == null) {
                return;
            }
            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
            tL_inputChatPhoto.f22440id = tL_inputPhoto2;
            tL_inputPhoto2.f22399id = photo3.f22404id;
            tL_inputPhoto2.access_hash = photo3.access_hash;
            tL_inputPhoto2.file_reference = photo3.file_reference;
            MessagesController.getInstance(photoViewer.P).changeChatAvatar(-photoViewer.f35777v5, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
            TLRPC.ChatPhoto chatPhoto = chat4.photo;
            chatPhoto.dc_id = photo3.dc_id;
            chatPhoto.photo_small = closestPhotoSizeWithSize2.location;
            chatPhoto.photo_big = closestPhotoSizeWithSize.location;
            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
        }
        photoViewer.f35617d7 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo3);
        photoViewer.f35598b7.remove(photoViewer.L4);
        photoViewer.f35598b7.add(0, photo3);
        ImageLocation imageLocation5 = (ImageLocation) photoViewer.W6.get(photoViewer.L4);
        photoViewer.W6.remove(photoViewer.L4);
        photoViewer.W6.add(0, imageLocation5);
        ImageLocation imageLocation6 = (ImageLocation) photoViewer.X6.get(photoViewer.L4);
        photoViewer.X6.remove(photoViewer.L4);
        photoViewer.X6.add(0, imageLocation6);
        Long l10 = (Long) photoViewer.Y6.get(photoViewer.L4);
        photoViewer.Y6.remove(photoViewer.L4);
        photoViewer.Y6.add(0, l10);
        TLRPC.Message message = (TLRPC.Message) photoViewer.Z6.get(photoViewer.L4);
        photoViewer.Z6.remove(photoViewer.L4);
        photoViewer.Z6.add(0, message);
        photoViewer.L4 = -1;
        photoViewer.B2(0);
        org.telegram.ui.Components.k30 k30Var = photoViewer.f35649h1;
        k30Var.d.clear();
        k30Var.f29933e.clear();
        k30Var.f29932c.clear();
        photoViewer.f35649h1.b();
        photoViewer.f35667j1.m(photoViewer.f35777v5, photoViewer.W4 == photoViewer.V4 ? null : 1, 22);
        final int i23 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(this) {

            public final qr0 f40589b;

            {
                this.f40589b = this;
            }

            @Override
            public final void run() {
                switch (i23) {
                    case 0:
                        org.telegram.ui.ActionBar.v0 v0Var = this.f40589b.f41739b.f35675k0;
                        if (v0Var != null) {
                            v0Var.r(14);
                            break;
                        }
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = this.f40589b.f41739b;
                        photoViewer2.f35675k0.r(19);
                        photoViewer2.f35675k0.K(20);
                        break;
                    default:
                        PhotoViewer photoViewer3 = this.f40589b.f41739b;
                        photoViewer3.f35675k0.K(19);
                        photoViewer3.f35675k0.r(20);
                        break;
                }
            }
        }, 300L);
    }
}
