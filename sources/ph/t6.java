package ph;

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
import org.telegram.ui.Components.m71;
import org.telegram.ui.dy0;
public final class t6 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public c8 E0;
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
    public MediaController.SavedFilterState f42401a1;
    public long f42402b;
    public boolean f42403b0;
    public Bitmap f42404b1;
    public boolean f42405c;
    public TLRPC.Document f42406c0;
    public boolean f42407c1;
    public long d;
    public kh.h f42408d0;
    public s6 f42409d1;
    public long e;
    public int f42412f;
    public boolean f42413f0;
    public boolean f42414g;
    public Bitmap f42415g0;
    public boolean h;
    public long f42416h0;
    public boolean f42419j;
    public boolean f42421k;
    public int f42422k0;
    public boolean f42423l;
    public int f42424l0;
    public ArrayList f42425m;
    public MediaController.CropState m0;
    public boolean f42426n;
    public boolean f42428o;
    public File f42429o0;
    public SpannableStringBuilder f42430p;
    public String f42431p0;
    public TLRPC.Peer f42432q;
    public long f42433q0;
    public int f42434r;
    public long f42435r0;
    public String f42436s;
    public float f42437s0;
    public TLRPC.MessageMedia f42438t;
    public boolean f42440u;
    public ArrayList v;
    public TLRPC.InputPeer f42442v0;
    public boolean f42443w;
    public HashSet f42444w0;
    public TLRPC.TL_error f42445x;
    public Drawable f42446x0;
    public String f42447y;
    public TLRPC.InputDocument f42449z;
    public final int f42399a = UserConfig.selectedAccount;
    public double f42417i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f42400a0 = 1.0f;
    public long f42410e0 = -1;
    public int f42418i0 = 720;
    public int f42420j0 = 1280;
    public final Matrix f42427n0 = new Matrix();
    public float f42439t0 = 1.0f;
    public float f42441u0 = 1.0f;
    public boolean f42448y0 = org.telegram.ui.ActionBar.j6.I.q();
    public long f42450z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f42411e1 = 0;

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

    public static t6 a(r rVar, ArrayList arrayList) {
        t6 t6Var = new t6();
        t6Var.S = rVar;
        t6Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t6 t6Var2 = (t6) obj;
            if (t6Var2.K) {
                t6Var.K = true;
                t6Var2.V = 0.0f;
                t6Var2.W = Math.min(1.0f, 59000.0f / ((float) t6Var2.f42416h0));
            }
        }
        if (t6Var.K) {
            t6Var.f42422k0 = 720;
            t6Var.f42424l0 = 1280;
            t6Var.f42418i0 = 720;
            t6Var.f42420j0 = 1280;
        } else {
            t6Var.f42422k0 = 1080;
            t6Var.f42424l0 = 1920;
            t6Var.f42418i0 = 1080;
            t6Var.f42420j0 = 1920;
        }
        t6Var.A();
        return t6Var;
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

    public static t6 l(MediaController.PhotoEntry photoEntry) {
        boolean z4;
        int i10;
        t6 t6Var = new t6();
        t6Var.L = new File(photoEntry.path);
        t6Var.Q = photoEntry.orientation;
        t6Var.R = photoEntry.invert;
        if (!photoEntry.isLivePhoto() && photoEntry.isVideo) {
            z4 = true;
        } else {
            z4 = false;
        }
        t6Var.K = z4;
        t6Var.N = photoEntry.thumbPath;
        long j10 = photoEntry.duration * 1000;
        t6Var.f42416h0 = j10;
        t6Var.Z = 0.0f;
        t6Var.f42400a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (t6Var.K && t6Var.N == null) {
            t6Var.N = "vthumb://" + photoEntry.imageId;
        }
        t6Var.A0 = photoEntry.gradientTopColor;
        t6Var.B0 = photoEntry.gradientBottomColor;
        t6Var.h(t6Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            t6Var.f42422k0 = i11;
            t6Var.f42424l0 = i10;
        }
        t6Var.A();
        return t6Var;
    }

    public static t6 m(int i10, File file) {
        t6 t6Var = new t6();
        t6Var.L = file;
        t6Var.M = true;
        t6Var.Q = i10;
        t6Var.R = 0;
        t6Var.K = false;
        if (file != null) {
            t6Var.h(file.getAbsolutePath());
        }
        t6Var.A();
        return t6Var;
    }

    public static t6 n(File file, TL_stories.StoryItem storyItem) {
        t6 t6Var = new t6();
        t6Var.f42414g = true;
        t6Var.f42412f = storyItem.f19394id;
        t6Var.L = file;
        t6Var.M = false;
        t6Var.f42422k0 = 720;
        t6Var.f42424l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z4 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = t6Var.f42399a;
        if (z4) {
            t6Var.K = false;
            if (file != null) {
                t6Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            t6Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        t6Var.f42422k0 = documentAttribute.f19166w;
                        t6Var.f42424l0 = documentAttribute.h;
                        t6Var.f42417i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    t6Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            t6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            t6Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = t6Var.F0;
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
        t6Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            t6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        t6Var.A();
        t6Var.e(storyItem);
        t6Var.f42425m = storyItem.media_areas;
        t6Var.f42442v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return t6Var;
    }

    public static t6 o(File file, String str, long j10) {
        t6 t6Var = new t6();
        t6Var.f42407c1 = true;
        t6Var.L = file;
        t6Var.M = true;
        t6Var.Q = 0;
        t6Var.R = 0;
        t6Var.K = true;
        t6Var.f42416h0 = j10;
        t6Var.N = str;
        t6Var.Z = 0.0f;
        t6Var.f42400a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return t6Var;
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

    public static Bitmap q(r6 r6Var, int i10, int i11, int i12, boolean z4) {
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
        r6Var.c(options);
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
            return r6Var.c(options);
        }
        if (z4 && z10 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap c3 = r6Var.c(options);
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
        return r6Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, 0, 0, null, false, null, false, 0, null);
                    if (a2 != null) {
                        int i10 = a2.f23082a[0];
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

    public static t6 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        t6 t6Var = new t6();
        t6Var.f42440u = true;
        t6Var.v = arrayList;
        t6Var.f42418i0 = 1080;
        t6Var.f42420j0 = 1920;
        t6Var.f42450z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.f16673x = 0.5f;
        mediaEntity.f16674y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        t6Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                t6Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = t6Var.L;
            if (file == null || !file.exists()) {
                t6Var.L = FileLoader.getInstance(t6Var.f42399a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = t6Var.L;
            if (file2 != null && file2.exists()) {
                t6Var.K = true;
                t6Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                t6Var.f42416h0 = duration;
                t6Var.Z = 0.0f;
                t6Var.f42400a0 = Math.min(1.0f, 59500.0f / ((float) duration));
                return t6Var;
            }
            t6Var.L = null;
        }
        return t6Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f42427n0;
        matrix.reset();
        int i10 = this.f42422k0;
        int i11 = this.f42424l0;
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
        float f13 = this.f42418i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f42420j0 / i11);
        } else {
            float f14 = i11;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f42420j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(e2.c.d(f12, f13, this.f42418i0, 2.0f), e2.c.d(i11, f13, this.f42420j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f42414g && !this.f42426n && this.f42416h0 > 69000 && UserConfig.getInstance(this.f42399a).isPremium()) {
            long j11 = this.f42416h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f42416h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f42400a0 = Math.min(1.0f, ((float) j10) / ((float) this.f42416h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f42447y == null && this.f42429o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
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
        throw new UnsupportedOperationException("Method not decompiled: ph.t6.b(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
        Bitmap bitmap = this.f42404b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f42404b1 = null;
        }
        this.f42404b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
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
                    tL_inputStickeredMediaPhoto.f19229id = tL_inputPhoto;
                    tL_inputPhoto.f19178id = photo.f19183id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f42411e1 = ConnectionsManager.getInstance(this.f42399a).sendRequest(tL_messages_getAttachedStickers, new kh.b1(this, storyItem, tL_messages_getAttachedStickers, new ff.a(this, 17), 18));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f19228id = tL_inputDocument;
                    tL_inputDocument.f19171id = document.f19165id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f42411e1 = ConnectionsManager.getInstance(this.f42399a).sendRequest(tL_messages_getAttachedStickers, new kh.b1(this, storyItem, tL_messages_getAttachedStickers, new ff.a(this, 17), 18));
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

    public final t6 g() {
        t6 t6Var = new t6();
        t6Var.f42402b = this.f42402b;
        t6Var.f42405c = this.f42405c;
        t6Var.d = this.d;
        t6Var.e = this.e;
        t6Var.f42412f = this.f42412f;
        t6Var.f42414g = this.f42414g;
        t6Var.h = this.h;
        t6Var.f42417i = this.f42417i;
        t6Var.f42419j = this.f42419j;
        t6Var.f42421k = this.f42421k;
        t6Var.f42423l = this.f42423l;
        t6Var.f42425m = this.f42425m;
        t6Var.f42443w = this.f42443w;
        t6Var.f42445x = this.f42445x;
        t6Var.f42447y = this.f42447y;
        t6Var.f42449z = this.f42449z;
        t6Var.A = this.A;
        t6Var.B = this.B;
        t6Var.C = this.C;
        t6Var.D = this.D;
        t6Var.E = this.E;
        t6Var.F = this.F;
        t6Var.G = this.G;
        t6Var.H = this.H;
        t6Var.I = this.I;
        t6Var.J = this.J;
        t6Var.K = this.K;
        t6Var.L = this.L;
        t6Var.M = this.M;
        boolean z4 = this.M;
        int i10 = this.f42399a;
        if (z4) {
            File w10 = w(i10, k(this.L));
            t6Var.L = w10;
            AndroidUtilities.copyFileSafe(this.L, w10);
        }
        t6Var.N = this.N;
        t6Var.Y = this.Y;
        t6Var.Z = this.Z;
        t6Var.f42400a0 = this.f42400a0;
        t6Var.f42416h0 = this.f42416h0;
        t6Var.f42422k0 = this.f42422k0;
        t6Var.f42424l0 = this.f42424l0;
        t6Var.f42418i0 = this.f42418i0;
        t6Var.f42420j0 = this.f42420j0;
        t6Var.f42442v0 = this.f42442v0;
        t6Var.R = this.R;
        t6Var.f42427n0.set(this.f42427n0);
        t6Var.A0 = this.A0;
        t6Var.B0 = this.B0;
        t6Var.C0 = this.C0;
        t6Var.D0 = this.D0;
        t6Var.E0 = this.E0;
        ArrayList arrayList = t6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        t6Var.G0 = this.G0;
        t6Var.H0 = this.H0;
        t6Var.I0 = this.I0;
        t6Var.M0 = this.M0;
        t6Var.N0 = this.N0;
        t6Var.f42444w0 = this.f42444w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i10, k(this.N0));
            t6Var.N0 = w11;
            AndroidUtilities.copyFileSafe(this.N0, w11);
        }
        t6Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i10, k(this.O0));
            t6Var.O0 = w12;
            AndroidUtilities.copyFileSafe(this.O0, w12);
        }
        t6Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i10, k(this.P0));
            t6Var.P0 = w13;
            AndroidUtilities.copyFileSafe(this.P0, w13);
        }
        t6Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i10, k(this.W0));
            t6Var.W0 = w14;
            AndroidUtilities.copyFileSafe(this.W0, w14);
        }
        t6Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i10, k(this.Y0));
            t6Var.Y0 = w15;
            AndroidUtilities.copyFileSafe(this.Y0, w15);
        }
        t6Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i10, k(this.Q0));
            t6Var.Q0 = w16;
            AndroidUtilities.copyFileSafe(this.Q0, w16);
        }
        t6Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i10, k(this.R0));
            t6Var.R0 = w17;
            AndroidUtilities.copyFileSafe(this.R0, w17);
        }
        t6Var.S0 = this.S0;
        t6Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                t6Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        t6Var.U0 = this.U0;
        t6Var.V0 = this.V0;
        t6Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i10, k(this.Z0));
            t6Var.Z0 = w18;
            AndroidUtilities.copyFileSafe(this.Z0, w18);
        }
        t6Var.f42401a1 = this.f42401a1;
        t6Var.f42404b1 = this.f42404b1;
        t6Var.f42407c1 = this.f42407c1;
        t6Var.O = this.O;
        t6Var.f42426n = this.f42426n;
        t6Var.f42428o = this.f42428o;
        t6Var.f42429o0 = this.f42429o0;
        t6Var.f42437s0 = this.f42437s0;
        t6Var.f42439t0 = this.f42439t0;
        t6Var.f42433q0 = this.f42433q0;
        t6Var.f42431p0 = this.f42431p0;
        t6Var.f42435r0 = this.f42435r0;
        t6Var.f42441u0 = this.f42441u0;
        t6Var.f42403b0 = this.f42403b0;
        t6Var.J0 = this.J0;
        t6Var.K0 = this.K0;
        t6Var.L0 = this.L0;
        t6Var.f42410e0 = this.f42410e0;
        t6Var.T = this.T;
        t6Var.S = this.S;
        t6Var.U = this.U;
        t6Var.X = this.X;
        t6Var.P = this.P;
        return t6Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f42422k0 = options.outWidth;
                this.f42424l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f42422k0, (this.f42424l0 / 16.0f) * 9.0f)) <= 900) {
                this.f42418i0 = 720;
                this.f42420j0 = 1280;
                return;
            }
            this.f42418i0 = 1080;
            this.f42420j0 = 1920;
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
                if (this.M && (!this.f42414g || this.f42419j)) {
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.f42429o0;
            if (file4 != null && (!this.f42414g || this.f42419j)) {
                file4.delete();
                this.f42429o0 = null;
            }
            if (this.f42431p0 != null && (!this.f42414g || this.f42419j)) {
                try {
                    new File(this.f42431p0).delete();
                } catch (Exception unused) {
                }
                this.f42431p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((t6) this.T.get(i11)).i(z4);
            }
        }
        if (this.f42411e1 != 0) {
            ConnectionsManager.getInstance(this.f42399a).cancelRequest(this.f42411e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f42414g) {
            long j11 = this.f42416h0;
            if (j11 > 0 && !this.f42426n) {
                if ((this.f42400a0 - this.Z) * ((float) j11) >= 68999) {
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
        if (!this.K && ((i11 = this.f42418i0) > 720 || this.f42420j0 > 1280)) {
            float f10 = 720.0f / i11;
            this.f42427n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f42418i0 = 720;
            this.f42420j0 = 1280;
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
        dy0 dy0Var = new dy0(this, absolutePath, iArr, callback);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                if (((t6) this.T.get(i12)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((t6) this.T.get(i12)).L.getAbsolutePath();
                }
                strArr[i12] = absolutePath2;
                iArr[i12] = new int[11];
            }
            Utilities.globalQueue.postRunnable(new m71(strArr, iArr, dy0Var, 15));
        } else if (this.L == null) {
            dy0Var.run();
        } else {
            Utilities.globalQueue.postRunnable(new m71(absolutePath, iArr, dy0Var, 16));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((t6) this.T.get(i10)).K) {
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
