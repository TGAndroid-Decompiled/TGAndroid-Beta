package qh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.o71;
import org.telegram.ui.yx0;
public final class s6 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public b8 E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public r S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public MediaController.SavedFilterState f46043a1;
    public long f46044b;
    public boolean f46045b0;
    public Bitmap f46046b1;
    public boolean f46047c;
    public TLRPC.Document f46048c0;
    public boolean f46049c1;
    public long d;
    public lh.h f46050d0;
    public r6 f46051d1;
    public long f46052e;
    public int f46055f;
    public boolean f46056f0;
    public boolean f46057g;
    public Bitmap f46058g0;
    public boolean h;
    public long f46059h0;
    public boolean f46062j;
    public boolean f46064k;
    public int f46065k0;
    public boolean f46066l;
    public int f46067l0;
    public ArrayList f46068m;
    public MediaController.CropState m0;
    public boolean f46069n;
    public boolean f46071o;
    public File f46072o0;
    public SpannableStringBuilder f46073p;
    public String f46074p0;
    public TLRPC.Peer f46075q;
    public long f46076q0;
    public int f46077r;
    public long f46078r0;
    public String f46079s;
    public float f46080s0;
    public TLRPC.MessageMedia f46081t;
    public boolean f46083u;
    public ArrayList v;
    public TLRPC.InputPeer f46085v0;
    public boolean f46086w;
    public HashSet f46087w0;
    public TLRPC.TL_error f46088x;
    public Drawable f46089x0;
    public String f46090y;
    public TLRPC.InputDocument f46092z;
    public final int f46041a = UserConfig.selectedAccount;
    public double f46060i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f46042a0 = 1.0f;
    public long f46053e0 = -1;
    public int f46061i0 = 720;
    public int f46063j0 = 1280;
    public final Matrix f46070n0 = new Matrix();
    public float f46082t0 = 1.0f;
    public float f46084u0 = 1.0f;
    public boolean f46091y0 = org.telegram.ui.ActionBar.k6.I.q();
    public long f46093z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f46054e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 * i12 * 8 <= maxMemory && Math.max(i11, i12) <= 4200 && SharedConfig.getDevicePerformanceClass() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i10;
    }

    public static Boolean D(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat != null && chat.noforwards) || !ChatObject.isChannelAndNotMegaGroup(chat)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                    return Boolean.TRUE;
                }
            }
            return null;
        }
        return Boolean.FALSE;
    }

    public static s6 a(r rVar, ArrayList arrayList) {
        s6 s6Var = new s6();
        s6Var.S = rVar;
        s6Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s6 s6Var2 = (s6) obj;
            if (s6Var2.K) {
                s6Var.K = true;
                s6Var2.V = 0.0f;
                s6Var2.W = Math.min(1.0f, 59000.0f / ((float) s6Var2.f46059h0));
            }
        }
        if (s6Var.K) {
            s6Var.f46065k0 = 720;
            s6Var.f46067l0 = 1280;
            s6Var.f46061i0 = 720;
            s6Var.f46063j0 = 1280;
        } else {
            s6Var.f46065k0 = 1080;
            s6Var.f46067l0 = 1920;
            s6Var.f46061i0 = 1080;
            s6Var.f46063j0 = 1920;
        }
        s6Var.A();
        return s6Var;
    }

    public static int d(BitmapFactory.Options options, int i10, int i11) {
        int min;
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        if (i12 <= i11 && i13 <= i10) {
            min = 1;
        } else {
            min = Math.min((int) Math.ceil(i12 / i11), (int) Math.ceil(i13 / i10));
        }
        double d = min;
        return Math.max(1, (int) Math.pow(d, Math.floor(Math.log(d) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i10, int i11) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i10 / width, i11 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static s6 l(MediaController.PhotoEntry photoEntry) {
        boolean z4;
        int i10;
        s6 s6Var = new s6();
        s6Var.L = new File(photoEntry.path);
        s6Var.Q = photoEntry.orientation;
        s6Var.R = photoEntry.invert;
        if (!photoEntry.isLivePhoto() && photoEntry.isVideo) {
            z4 = true;
        } else {
            z4 = false;
        }
        s6Var.K = z4;
        s6Var.N = photoEntry.thumbPath;
        long j10 = photoEntry.duration * 1000;
        s6Var.f46059h0 = j10;
        s6Var.Z = 0.0f;
        s6Var.f46042a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (s6Var.K && s6Var.N == null) {
            s6Var.N = "vthumb://" + photoEntry.imageId;
        }
        s6Var.A0 = photoEntry.gradientTopColor;
        s6Var.B0 = photoEntry.gradientBottomColor;
        s6Var.h(s6Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            s6Var.f46065k0 = i11;
            s6Var.f46067l0 = i10;
        }
        s6Var.A();
        return s6Var;
    }

    public static s6 m(int i10, File file) {
        s6 s6Var = new s6();
        s6Var.L = file;
        s6Var.M = true;
        s6Var.Q = i10;
        s6Var.R = 0;
        s6Var.K = false;
        if (file != null) {
            s6Var.h(file.getAbsolutePath());
        }
        s6Var.A();
        return s6Var;
    }

    public static s6 n(File file, TL_stories.StoryItem storyItem) {
        s6 s6Var = new s6();
        s6Var.f46057g = true;
        s6Var.f46055f = storyItem.f21080id;
        s6Var.L = file;
        s6Var.M = false;
        s6Var.f46065k0 = 720;
        s6Var.f46067l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z4 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = s6Var.f46041a;
        if (z4) {
            s6Var.K = false;
            if (file != null) {
                s6Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            s6Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        s6Var.f46065k0 = documentAttribute.f20850w;
                        s6Var.f46067l0 = documentAttribute.h;
                        s6Var.f46060i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    s6Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            s6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            s6Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = s6Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i13);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueDisallowUsers.users.size(); i14++) {
                        TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i14).longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i15).longValue());
                        if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        s6Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            s6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        s6Var.A();
        s6Var.e(storyItem);
        s6Var.f46068m = storyItem.media_areas;
        s6Var.f46085v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return s6Var;
    }

    public static s6 o(File file, String str, long j10) {
        s6 s6Var = new s6();
        s6Var.f46049c1 = true;
        s6Var.L = file;
        s6Var.M = true;
        s6Var.Q = 0;
        s6Var.R = 0;
        s6Var.K = true;
        s6Var.f46059h0 = j10;
        s6Var.N = str;
        s6Var.Z = 0.0f;
        s6Var.f46042a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return s6Var;
    }

    public static long p(MessageObject messageObject) {
        Boolean D = D(messageObject);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
        }
        return messageObject.getDialogId();
    }

    public static Bitmap q(q6 q6Var, int i10, int i11, int i12, boolean z4) {
        int i13;
        int i14;
        boolean z10;
        if (i12 != 90 && i12 != 270) {
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10;
            i14 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        q6Var.c(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        if (((i14 * i13 * 4) + (i15 * i16 * 4)) * 1.1d <= maxMemory) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i15 <= i14 && i16 <= i13) {
            return q6Var.c(options);
        }
        if (z4 && z10 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap c3 = q6Var.c(options);
            float max = Math.max(i14 / c3.getWidth(), i13 / c3.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (c3.getWidth() * max), (int) (c3.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(c3, createBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        if (i14 / i17 > i13 / i18) {
            options.inDensity = i17;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i18;
            options.inTargetDensity = i13;
        }
        return q6Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, 0, 0, null, false, null, false, 0, null);
                    if (a2 != null) {
                        int i10 = a2.f24963a[0];
                        a2.d();
                        j10 = i10;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static File w(int i10, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if (!"mp4".equals(str) && !"webm".equals(str)) {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        } else {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        }
        return FileLoader.getInstance(i10).getPathToAttach(tL_videoSize_layer127, str, true);
    }

    public static File x(int i10, boolean z4) {
        String str;
        if (z4) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i10, str);
    }

    public static s6 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        s6 s6Var = new s6();
        s6Var.f46083u = true;
        s6Var.v = arrayList;
        s6Var.f46061i0 = 1080;
        s6Var.f46063j0 = 1920;
        s6Var.f46093z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.f18079x = 0.5f;
        mediaEntity.f18080y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        s6Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                s6Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = s6Var.L;
            if (file == null || !file.exists()) {
                s6Var.L = FileLoader.getInstance(s6Var.f46041a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = s6Var.L;
            if (file2 != null && file2.exists()) {
                s6Var.K = true;
                s6Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                s6Var.f46059h0 = duration;
                s6Var.Z = 0.0f;
                s6Var.f46042a0 = Math.min(1.0f, 59500.0f / ((float) duration));
                return s6Var;
            }
            s6Var.L = null;
        }
        return s6Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f46070n0;
        matrix.reset();
        int i10 = this.f46065k0;
        int i11 = this.f46067l0;
        int i12 = this.Q;
        int i13 = this.R;
        float f11 = 1.0f;
        if (i13 == 1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (i13 == 2) {
            f11 = -1.0f;
        }
        matrix.postScale(f10, f11, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f12 = i10;
        float f13 = this.f46061i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f46063j0 / i11);
        } else {
            float f14 = i11;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f46063j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(e2.c.d(f12, f13, this.f46061i0, 2.0f), e2.c.d(i11, f13, this.f46063j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f46057g && !this.f46069n && this.f46059h0 > 69000 && UserConfig.getInstance(this.f46041a).isPremium()) {
            long j11 = this.f46059h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f46059h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f46042a0 = Math.min(1.0f, ((float) j10) / ((float) this.f46059h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f46090y == null && this.f46072o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList3.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        if (!u(mediaEntity.document, mediaEntity.text)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < mediaEntity.entities.size(); i11++) {
                                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                                if (!u(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: qh.s6.b(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
        Bitmap bitmap = this.f46046b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f46046b1 = null;
        }
        this.f46046b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        b10.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo != null) {
                if (photo.has_stickers) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputStickeredMediaPhoto.f20913id = tL_inputPhoto;
                    tL_inputPhoto.f20862id = photo.f20867id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f46054e1 = ConnectionsManager.getInstance(this.f46041a).sendRequest(tL_messages_getAttachedStickers, new lh.b1(this, storyItem, tL_messages_getAttachedStickers, new gf.a(this, 17), 17));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f20912id = tL_inputDocument;
                    tL_inputDocument.f20855id = document.f20849id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f46054e1 = ConnectionsManager.getInstance(this.f46041a).sendRequest(tL_messages_getAttachedStickers, new lh.b1(this, storyItem, tL_messages_getAttachedStickers, new gf.a(this, 17), 17));
                }
            }
        }
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final s6 g() {
        s6 s6Var = new s6();
        s6Var.f46044b = this.f46044b;
        s6Var.f46047c = this.f46047c;
        s6Var.d = this.d;
        s6Var.f46052e = this.f46052e;
        s6Var.f46055f = this.f46055f;
        s6Var.f46057g = this.f46057g;
        s6Var.h = this.h;
        s6Var.f46060i = this.f46060i;
        s6Var.f46062j = this.f46062j;
        s6Var.f46064k = this.f46064k;
        s6Var.f46066l = this.f46066l;
        s6Var.f46068m = this.f46068m;
        s6Var.f46086w = this.f46086w;
        s6Var.f46088x = this.f46088x;
        s6Var.f46090y = this.f46090y;
        s6Var.f46092z = this.f46092z;
        s6Var.A = this.A;
        s6Var.B = this.B;
        s6Var.C = this.C;
        s6Var.D = this.D;
        s6Var.E = this.E;
        s6Var.F = this.F;
        s6Var.G = this.G;
        s6Var.H = this.H;
        s6Var.I = this.I;
        s6Var.J = this.J;
        s6Var.K = this.K;
        s6Var.L = this.L;
        s6Var.M = this.M;
        boolean z4 = this.M;
        int i10 = this.f46041a;
        if (z4) {
            File w10 = w(i10, k(this.L));
            s6Var.L = w10;
            AndroidUtilities.copyFileSafe(this.L, w10);
        }
        s6Var.N = this.N;
        s6Var.Y = this.Y;
        s6Var.Z = this.Z;
        s6Var.f46042a0 = this.f46042a0;
        s6Var.f46059h0 = this.f46059h0;
        s6Var.f46065k0 = this.f46065k0;
        s6Var.f46067l0 = this.f46067l0;
        s6Var.f46061i0 = this.f46061i0;
        s6Var.f46063j0 = this.f46063j0;
        s6Var.f46085v0 = this.f46085v0;
        s6Var.R = this.R;
        s6Var.f46070n0.set(this.f46070n0);
        s6Var.A0 = this.A0;
        s6Var.B0 = this.B0;
        s6Var.C0 = this.C0;
        s6Var.D0 = this.D0;
        s6Var.E0 = this.E0;
        ArrayList arrayList = s6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        s6Var.G0 = this.G0;
        s6Var.H0 = this.H0;
        s6Var.I0 = this.I0;
        s6Var.M0 = this.M0;
        s6Var.N0 = this.N0;
        s6Var.f46087w0 = this.f46087w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i10, k(this.N0));
            s6Var.N0 = w11;
            AndroidUtilities.copyFileSafe(this.N0, w11);
        }
        s6Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i10, k(this.O0));
            s6Var.O0 = w12;
            AndroidUtilities.copyFileSafe(this.O0, w12);
        }
        s6Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i10, k(this.P0));
            s6Var.P0 = w13;
            AndroidUtilities.copyFileSafe(this.P0, w13);
        }
        s6Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i10, k(this.W0));
            s6Var.W0 = w14;
            AndroidUtilities.copyFileSafe(this.W0, w14);
        }
        s6Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i10, k(this.Y0));
            s6Var.Y0 = w15;
            AndroidUtilities.copyFileSafe(this.Y0, w15);
        }
        s6Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i10, k(this.Q0));
            s6Var.Q0 = w16;
            AndroidUtilities.copyFileSafe(this.Q0, w16);
        }
        s6Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i10, k(this.R0));
            s6Var.R0 = w17;
            AndroidUtilities.copyFileSafe(this.R0, w17);
        }
        s6Var.S0 = this.S0;
        s6Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                s6Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        s6Var.U0 = this.U0;
        s6Var.V0 = this.V0;
        s6Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i10, k(this.Z0));
            s6Var.Z0 = w18;
            AndroidUtilities.copyFileSafe(this.Z0, w18);
        }
        s6Var.f46043a1 = this.f46043a1;
        s6Var.f46046b1 = this.f46046b1;
        s6Var.f46049c1 = this.f46049c1;
        s6Var.O = this.O;
        s6Var.f46069n = this.f46069n;
        s6Var.f46071o = this.f46071o;
        s6Var.f46072o0 = this.f46072o0;
        s6Var.f46080s0 = this.f46080s0;
        s6Var.f46082t0 = this.f46082t0;
        s6Var.f46076q0 = this.f46076q0;
        s6Var.f46074p0 = this.f46074p0;
        s6Var.f46078r0 = this.f46078r0;
        s6Var.f46084u0 = this.f46084u0;
        s6Var.f46045b0 = this.f46045b0;
        s6Var.J0 = this.J0;
        s6Var.K0 = this.K0;
        s6Var.L0 = this.L0;
        s6Var.f46053e0 = this.f46053e0;
        s6Var.T = this.T;
        s6Var.S = this.S;
        s6Var.U = this.U;
        s6Var.X = this.X;
        s6Var.P = this.P;
        return s6Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f46065k0 = options.outWidth;
                this.f46067l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f46065k0, (this.f46067l0 / 16.0f) * 9.0f)) <= 900) {
                this.f46061i0 = 720;
                this.f46063j0 = 1280;
                return;
            }
            this.f46061i0 = 1080;
            this.f46063j0 = 1920;
        }
    }

    public final void i(boolean z4) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z4) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.f46057g || this.f46062j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) obj;
                    if (mediaEntity.type == 2 && !TextUtils.isEmpty(mediaEntity.segmentedPath)) {
                        try {
                            new File(mediaEntity.segmentedPath).delete();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.f46072o0;
            if (file4 != null && (!this.f46057g || this.f46062j)) {
                file4.delete();
                this.f46072o0 = null;
            }
            if (this.f46074p0 != null && (!this.f46057g || this.f46062j)) {
                try {
                    new File(this.f46074p0).delete();
                } catch (Exception unused) {
                }
                this.f46074p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((s6) this.T.get(i11)).i(z4);
            }
        }
        if (this.f46054e1 != 0) {
            ConnectionsManager.getInstance(this.f46041a).cancelRequest(this.f46054e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f46057g) {
            long j11 = this.f46059h0;
            if (j11 > 0 && !this.f46069n) {
                if ((this.f46042a0 - this.Z) * ((float) j11) >= 68999) {
                    return (int) Math.ceil(((float) j10) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(Utilities.Callback callback) {
        String absolutePath;
        int i10;
        String absolutePath2;
        int i11;
        if (!E()) {
            callback.run(null);
            return;
        }
        if (!this.K && ((i11 = this.f46061i0) > 720 || this.f46063j0 > 1280)) {
            float f10 = 720.0f / i11;
            this.f46070n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f46061i0 = 720;
            this.f46063j0 = 1280;
        }
        File file = this.L;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        if (v()) {
            i10 = this.T.size();
        } else {
            i10 = 0;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, Math.max(1, i10), 11);
        iArr[0] = new int[11];
        yx0 yx0Var = new yx0(this, absolutePath, iArr, callback);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                if (((s6) this.T.get(i12)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((s6) this.T.get(i12)).L.getAbsolutePath();
                }
                strArr[i12] = absolutePath2;
                iArr[i12] = new int[11];
            }
            Utilities.globalQueue.postRunnable(new o71(strArr, iArr, yx0Var, 16));
        } else if (this.L == null) {
            yx0Var.run();
        } else {
            Utilities.globalQueue.postRunnable(new o71(absolutePath, iArr, yx0Var, 17));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((s6) this.T.get(i10)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        if (this.S != null && this.T != null) {
            return true;
        }
        return false;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (this.N.startsWith("vthumb://")) {
                        long parseInt = Integer.parseInt(this.N.substring(9));
                        options.inJustDecodeBounds = true;
                        MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                    } else {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(this.N);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = BitmapFactory.decodeFile(this.N);
                    }
                } catch (Exception unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int[] b10 = g0.b(bitmap, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
                    bitmap.recycle();
                    runnable.run();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.O;
            if (bitmap2 != null) {
                int[] b11 = g0.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
