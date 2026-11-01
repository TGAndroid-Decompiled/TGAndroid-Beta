package vh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.ff;
import org.telegram.messenger.gf;
import org.telegram.messenger.ic;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.uz;
import org.telegram.messenger.v20;
import org.telegram.messenger.w20;
import org.telegram.messenger.wp;
import org.telegram.messenger.ze;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.mb;
import org.telegram.ui.ox0;
public final class n5 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public u6 E0;
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
    public gf f51531a1;
    public long f51532b;
    public boolean f51533b0;
    public Bitmap f51534b1;
    public boolean f51535c;
    public TLRPC.Document f51536c0;
    public boolean f51537c1;
    public long d;
    public kg.d0 f51538d0;
    public m5 f51539d1;
    public long e;
    public int f51542f;
    public boolean f51543f0;
    public boolean f51544g;
    public Bitmap f51545g0;
    public boolean h;
    public long f51546h0;
    public boolean f51549j;
    public boolean f51551k;
    public int f51552k0;
    public boolean f51553l;
    public int f51554l0;
    public ArrayList f51555m;
    public ze m0;
    public boolean f51556n;
    public boolean f51558o;
    public File f51559o0;
    public SpannableStringBuilder f51560p;
    public String f51561p0;
    public TLRPC.Peer f51562q;
    public long f51563q0;
    public int f51564r;
    public long f51565r0;
    public String f51566s;
    public float f51567s0;
    public TLRPC.MessageMedia f51568t;
    public boolean f51570u;
    public ArrayList v;
    public TLRPC.InputPeer f51572v0;
    public boolean f51573w;
    public HashSet f51574w0;
    public TLRPC.TL_error f51575x;
    public Drawable f51576x0;
    public String f51577y;
    public TLRPC.InputDocument f51579z;
    public final int f51529a = e20.f15506s0;
    public double f51547i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f51530a0 = 1.0f;
    public long f51540e0 = -1;
    public int f51548i0 = 720;
    public int f51550j0 = 1280;
    public final Matrix f51557n0 = new Matrix();
    public float f51569t0 = 1.0f;
    public float f51571u0 = 1.0f;
    public boolean f51578y0 = org.telegram.ui.ActionBar.t6.I.q();
    public long f51580z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f51541e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 * i12 * 8 <= maxMemory && Math.max(i11, i12) <= 4200 && uz.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i10;
    }

    public static Boolean D(kj kjVar) {
        TLRPC.Peer peer;
        if (kjVar != null) {
            int i10 = kjVar.I1;
            TLRPC.Message message = kjVar.f16690k;
            if (message != null) {
                TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-org.telegram.messenger.o5.o(message.peer_id)));
                if ((L0 != null && L0.noforwards) || !org.telegram.messenger.w3.V(L0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = kjVar.f16690k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long o10 = org.telegram.messenger.o5.o(peer);
                        TLRPC.Chat L02 = wp.r1(i10).L0(Long.valueOf(-o10));
                        if (o10 < 0 && ((L02 == null || !L02.noforwards) && org.telegram.messenger.w3.V(L02))) {
                            return Boolean.TRUE;
                        }
                    }
                    return null;
                }
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static n5 a(r rVar, ArrayList arrayList) {
        n5 n5Var = new n5();
        n5Var.S = rVar;
        n5Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n5 n5Var2 = (n5) obj;
            if (n5Var2.K) {
                n5Var.K = true;
                n5Var2.V = 0.0f;
                n5Var2.W = Math.min(1.0f, 59000.0f / ((float) n5Var2.f51546h0));
            }
        }
        if (n5Var.K) {
            n5Var.f51552k0 = 720;
            n5Var.f51554l0 = 1280;
            n5Var.f51548i0 = 720;
            n5Var.f51550j0 = 1280;
        } else {
            n5Var.f51552k0 = 1080;
            n5Var.f51554l0 = 1920;
            n5Var.f51548i0 = 1080;
            n5Var.f51550j0 = 1920;
        }
        n5Var.A();
        return n5Var;
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

    public static n5 l(ff ffVar) {
        boolean z10;
        int i10;
        n5 n5Var = new n5();
        n5Var.L = new File(ffVar.I);
        n5Var.Q = ffVar.J;
        n5Var.R = ffVar.K;
        if (!ffVar.d() && ffVar.f14603b) {
            z10 = true;
        } else {
            z10 = false;
        }
        n5Var.K = z10;
        n5Var.N = ffVar.f14604c;
        long j10 = ffVar.E * 1000;
        n5Var.f51546h0 = j10;
        n5Var.Z = 0.0f;
        n5Var.f51530a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (n5Var.K && n5Var.N == null) {
            n5Var.N = "vthumb://" + ffVar.C;
        }
        n5Var.A0 = ffVar.T;
        n5Var.B0 = ffVar.U;
        n5Var.h(n5Var.L.getAbsolutePath());
        int i11 = ffVar.F;
        if (i11 > 0 && (i10 = ffVar.G) > 0) {
            n5Var.f51552k0 = i11;
            n5Var.f51554l0 = i10;
        }
        n5Var.A();
        return n5Var;
    }

    public static n5 m(File file, int i10) {
        n5 n5Var = new n5();
        n5Var.L = file;
        n5Var.M = true;
        n5Var.Q = i10;
        n5Var.R = 0;
        n5Var.K = false;
        if (file != null) {
            n5Var.h(file.getAbsolutePath());
        }
        n5Var.A();
        return n5Var;
    }

    public static n5 n(File file, TL_stories.StoryItem storyItem) {
        n5 n5Var = new n5();
        n5Var.f51544g = true;
        n5Var.f51542f = storyItem.f20032id;
        n5Var.L = file;
        n5Var.M = false;
        n5Var.f51552k0 = 720;
        n5Var.f51554l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = n5Var.f51529a;
        if (z10) {
            n5Var.K = false;
            if (file != null) {
                n5Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            n5Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        n5Var.f51552k0 = documentAttribute.f19801w;
                        n5Var.f51554l0 = documentAttribute.h;
                        n5Var.f51547i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    n5Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            n5Var.O = ic.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.b8.G(i10);
                        File K = org.telegram.messenger.b8.K(photoSize, null, true, true);
                        if (K != null && K.exists()) {
                            n5Var.N = K.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = n5Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        wp r12 = wp.r1(i10);
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
                        Long l4 = tL_privacyValueDisallowUsers.users.get(i14);
                        l4.getClass();
                        TLRPC.InputUser p12 = r12.p1(r12.Z1(l4));
                        if (!(p12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(p12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        Long l10 = tL_privacyValueAllowUsers.users.get(i15);
                        l10.getClass();
                        TLRPC.InputUser p13 = r12.p1(r12.Z1(l10));
                        if (!(p13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(p13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        n5Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), true, null, 0);
            kj.b(m10, storyItem.entities, true, false, true, false, 0);
            n5Var.C0 = kj.A5(m10, storyItem.entities, org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        n5Var.A();
        n5Var.e(storyItem);
        n5Var.f51555m = storyItem.media_areas;
        n5Var.f51572v0 = wp.r1(i10).i1(storyItem.dialogId);
        return n5Var;
    }

    public static n5 o(File file, String str, long j10) {
        n5 n5Var = new n5();
        n5Var.f51537c1 = true;
        n5Var.L = file;
        n5Var.M = true;
        n5Var.Q = 0;
        n5Var.R = 0;
        n5Var.K = true;
        n5Var.f51546h0 = j10;
        n5Var.N = str;
        n5Var.Z = 0.0f;
        n5Var.f51530a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return n5Var;
    }

    public static long p(kj kjVar) {
        Boolean D = D(kjVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.o5.o(kjVar.f16690k.fwd_from.from_id);
        }
        return kj.B0(kjVar.f16690k);
    }

    public static Bitmap q(l5 l5Var, int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        if (i12 != 90 && i12 != 270) {
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10;
            i14 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        l5Var.i(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        if (((i14 * i13 * 4) + (i15 * i16 * 4)) * 1.1d <= maxMemory) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i15 <= i14 && i16 <= i13) {
            return l5Var.i(options);
        }
        if (z10 && z11 && uz.o() >= 1) {
            Bitmap i17 = l5Var.i(options);
            float max = Math.max(i14 / i17.getWidth(), i13 / i17.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (i17.getWidth() * max), (int) (i17.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(i17, createBitmap);
            Utilities.j(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i18 = options.outWidth;
        int i19 = options.outHeight;
        if (i14 / i18 > i13 / i19) {
            options.inDensity = i18;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i19;
            options.inTargetDensity = i13;
        }
        return l5Var.i(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (kj.K2(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a2 != null) {
                        int i10 = a2.f24121a[0];
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
        tL_fileLocationToBeDeprecated.local_id = uz.p();
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
        org.telegram.messenger.b8.G(i10);
        return org.telegram.messenger.b8.K(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i10, boolean z10) {
        String str;
        if (z10) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i10, str);
    }

    public static n5 y(ArrayList arrayList) {
        kj kjVar;
        int i10;
        n5 n5Var = new n5();
        n5Var.f51570u = true;
        n5Var.v = arrayList;
        n5Var.f51548i0 = 1080;
        n5Var.f51550j0 = 1920;
        n5Var.f51580z0 = p((kj) arrayList.get(0));
        w20 w20Var = new w20();
        w20Var.f18970a = (byte) 6;
        w20Var.f18972c = 0.5f;
        w20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        n5Var.T0 = arrayList2;
        arrayList2.add(w20Var);
        if (arrayList.size() == 1 && (kjVar = (kj) arrayList.get(0)) != null && ((i10 = kjVar.D) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = kjVar.f16690k;
            if (message != null && message.attachPath != null) {
                n5Var.L = new File(kjVar.f16690k.attachPath);
            }
            File file = n5Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.b8.G(n5Var.f51529a);
                n5Var.L = org.telegram.messenger.b8.N(kjVar.f16690k, false, true);
            }
            File file2 = n5Var.L;
            if (file2 != null && file2.exists()) {
                n5Var.K = true;
                n5Var.M = false;
                long L0 = (long) (kjVar.L0() * 1000.0d);
                n5Var.f51546h0 = L0;
                n5Var.Z = 0.0f;
                n5Var.f51530a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return n5Var;
            }
            n5Var.L = null;
        }
        return n5Var;
    }

    public final void A() {
        float f7;
        Matrix matrix = this.f51557n0;
        matrix.reset();
        int i10 = this.f51552k0;
        int i11 = this.f51554l0;
        int i12 = this.Q;
        int i13 = this.R;
        float f10 = 1.0f;
        if (i13 == 1) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (i13 == 2) {
            f10 = -1.0f;
        }
        matrix.postScale(f7, f10, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f11 = i10;
        float f12 = this.f51548i0 / f11;
        if (this.J0 != 0) {
            f12 = Math.min(f12, this.f51550j0 / i11);
        } else {
            float f13 = i11;
            if (f13 / f11 > 1.29f) {
                f12 = Math.max(f12, this.f51550j0 / f13);
            }
        }
        matrix.postScale(f12, f12);
        matrix.postTranslate(c3.i0.g(f11, f12, this.f51548i0, 2.0f), c3.i0.g(i11, f12, this.f51550j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f51544g && !this.f51556n && this.f51546h0 > 69000 && e20.i(this.f51529a).q()) {
            long j11 = this.f51546h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f51546h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f51530a0 = Math.min(1.0f, ((float) j10) / ((float) this.f51546h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        kj kjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f51577y == null && this.f51559o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (kjVar = (kj) this.v.get(0)) == null || (message = kjVar.f16690k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    w20 w20Var = (w20) arrayList3.get(i10);
                    byte b10 = w20Var.f18970a;
                    if (b10 == 0) {
                        if (!u(w20Var.B, w20Var.f18976j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = w20Var.f18977k) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < w20Var.f18977k.size(); i11++) {
                                v20 v20Var = (v20) w20Var.f18977k.get(i11);
                                if (!u(v20Var.document, v20Var.f18585a)) {
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

    public final android.graphics.Bitmap b(float r27, android.graphics.Bitmap r28) {
        throw new UnsupportedOperationException("Method not decompiled: vh.n5.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.f51534b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f51534b1 = null;
        }
        this.f51534b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
                    tL_inputStickeredMediaPhoto.f19864id = tL_inputPhoto;
                    tL_inputPhoto.f19813id = photo.f19818id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f51541e1 = ConnectionsManager.getInstance(this.f51529a).sendRequest(tL_messages_getAttachedStickers, new mb(this, storyItem, tL_messages_getAttachedStickers, new ag.c(this, 24), 18));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && kj.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f19863id = tL_inputDocument;
                    tL_inputDocument.f19806id = document.f19800id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f51541e1 = ConnectionsManager.getInstance(this.f51529a).sendRequest(tL_messages_getAttachedStickers, new mb(this, storyItem, tL_messages_getAttachedStickers, new ag.c(this, 24), 18));
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

    public final n5 g() {
        n5 n5Var = new n5();
        n5Var.f51532b = this.f51532b;
        n5Var.f51535c = this.f51535c;
        n5Var.d = this.d;
        n5Var.e = this.e;
        n5Var.f51542f = this.f51542f;
        n5Var.f51544g = this.f51544g;
        n5Var.h = this.h;
        n5Var.f51547i = this.f51547i;
        n5Var.f51549j = this.f51549j;
        n5Var.f51551k = this.f51551k;
        n5Var.f51553l = this.f51553l;
        n5Var.f51555m = this.f51555m;
        n5Var.f51573w = this.f51573w;
        n5Var.f51575x = this.f51575x;
        n5Var.f51577y = this.f51577y;
        n5Var.f51579z = this.f51579z;
        n5Var.A = this.A;
        n5Var.B = this.B;
        n5Var.C = this.C;
        n5Var.D = this.D;
        n5Var.E = this.E;
        n5Var.F = this.F;
        n5Var.G = this.G;
        n5Var.H = this.H;
        n5Var.I = this.I;
        n5Var.J = this.J;
        n5Var.K = this.K;
        n5Var.L = this.L;
        n5Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.f51529a;
        if (z10) {
            File w9 = w(i10, k(this.L));
            n5Var.L = w9;
            org.telegram.messenger.i0.F(this.L, w9);
        }
        n5Var.N = this.N;
        n5Var.Y = this.Y;
        n5Var.Z = this.Z;
        n5Var.f51530a0 = this.f51530a0;
        n5Var.f51546h0 = this.f51546h0;
        n5Var.f51552k0 = this.f51552k0;
        n5Var.f51554l0 = this.f51554l0;
        n5Var.f51548i0 = this.f51548i0;
        n5Var.f51550j0 = this.f51550j0;
        n5Var.f51572v0 = this.f51572v0;
        n5Var.R = this.R;
        n5Var.f51557n0.set(this.f51557n0);
        n5Var.A0 = this.A0;
        n5Var.B0 = this.B0;
        n5Var.C0 = this.C0;
        n5Var.D0 = this.D0;
        n5Var.E0 = this.E0;
        ArrayList arrayList = n5Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        n5Var.G0 = this.G0;
        n5Var.H0 = this.H0;
        n5Var.I0 = this.I0;
        n5Var.M0 = this.M0;
        n5Var.N0 = this.N0;
        n5Var.f51574w0 = this.f51574w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w10 = w(i10, k(this.N0));
            n5Var.N0 = w10;
            org.telegram.messenger.i0.F(this.N0, w10);
        }
        n5Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w11 = w(i10, k(this.O0));
            n5Var.O0 = w11;
            org.telegram.messenger.i0.F(this.O0, w11);
        }
        n5Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w12 = w(i10, k(this.P0));
            n5Var.P0 = w12;
            org.telegram.messenger.i0.F(this.P0, w12);
        }
        n5Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w13 = w(i10, k(this.W0));
            n5Var.W0 = w13;
            org.telegram.messenger.i0.F(this.W0, w13);
        }
        n5Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w14 = w(i10, k(this.Y0));
            n5Var.Y0 = w14;
            org.telegram.messenger.i0.F(this.Y0, w14);
        }
        n5Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w15 = w(i10, k(this.Q0));
            n5Var.Q0 = w15;
            org.telegram.messenger.i0.F(this.Q0, w15);
        }
        n5Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w16 = w(i10, k(this.R0));
            n5Var.R0 = w16;
            org.telegram.messenger.i0.F(this.R0, w16);
        }
        n5Var.S0 = this.S0;
        n5Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                n5Var.T0.add(((w20) this.T0.get(i11)).a());
            }
        }
        n5Var.U0 = this.U0;
        n5Var.V0 = this.V0;
        n5Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w17 = w(i10, k(this.Z0));
            n5Var.Z0 = w17;
            org.telegram.messenger.i0.F(this.Z0, w17);
        }
        n5Var.f51531a1 = this.f51531a1;
        n5Var.f51534b1 = this.f51534b1;
        n5Var.f51537c1 = this.f51537c1;
        n5Var.O = this.O;
        n5Var.f51556n = this.f51556n;
        n5Var.f51558o = this.f51558o;
        n5Var.f51559o0 = this.f51559o0;
        n5Var.f51567s0 = this.f51567s0;
        n5Var.f51569t0 = this.f51569t0;
        n5Var.f51563q0 = this.f51563q0;
        n5Var.f51561p0 = this.f51561p0;
        n5Var.f51565r0 = this.f51565r0;
        n5Var.f51571u0 = this.f51571u0;
        n5Var.f51533b0 = this.f51533b0;
        n5Var.J0 = this.J0;
        n5Var.K0 = this.K0;
        n5Var.L0 = this.L0;
        n5Var.f51540e0 = this.f51540e0;
        n5Var.T = this.T;
        n5Var.S = this.S;
        n5Var.U = this.U;
        n5Var.X = this.X;
        n5Var.P = this.P;
        return n5Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f51552k0 = options.outWidth;
                this.f51554l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f51552k0, (this.f51554l0 / 16.0f) * 9.0f)) <= 900) {
                this.f51548i0 = 720;
                this.f51550j0 = 1280;
                return;
            }
            this.f51548i0 = 1080;
            this.f51550j0 = 1920;
        }
    }

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.f51544g || this.f51549j)) {
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
                    w20 w20Var = (w20) obj;
                    if (w20Var.f18970a == 2 && !TextUtils.isEmpty(w20Var.f18986t)) {
                        try {
                            new File(w20Var.f18986t).delete();
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        w20Var.f18986t = "";
                    }
                }
            }
            File file4 = this.f51559o0;
            if (file4 != null && (!this.f51544g || this.f51549j)) {
                file4.delete();
                this.f51559o0 = null;
            }
            if (this.f51561p0 != null && (!this.f51544g || this.f51549j)) {
                try {
                    new File(this.f51561p0).delete();
                } catch (Exception unused) {
                }
                this.f51561p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((n5) this.T.get(i11)).i(z10);
            }
        }
        if (this.f51541e1 != 0) {
            ConnectionsManager.getInstance(this.f51529a).cancelRequest(this.f51541e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f51544g) {
            long j11 = this.f51546h0;
            if (j11 > 0 && !this.f51556n) {
                if ((this.f51530a0 - this.Z) * ((float) j11) >= 68999) {
                    return (int) Math.ceil(((float) j10) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(r20 r20Var) {
        String absolutePath;
        int i10;
        String absolutePath2;
        int i11;
        if (!E()) {
            r20Var.a(null);
            return;
        }
        if (!this.K && ((i11 = this.f51548i0) > 720 || this.f51550j0 > 1280)) {
            float f7 = 720.0f / i11;
            this.f51557n0.postScale(f7, f7, 0.0f, 0.0f);
            this.f51548i0 = 720;
            this.f51550j0 = 1280;
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
        ox0 ox0Var = new ox0(this, absolutePath, iArr, r20Var, 27);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                if (((n5) this.T.get(i12)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((n5) this.T.get(i12)).L.getAbsolutePath();
                }
                strArr[i12] = absolutePath2;
                iArr[i12] = new int[11];
            }
            Utilities.e.c(new rh.l5(strArr, iArr, ox0Var, 15));
        } else if (this.L == null) {
            ox0Var.run();
        } else {
            Utilities.e.c(new rh.l5(absolutePath, iArr, ox0Var, 16));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((n5) this.T.get(i10)).K) {
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
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.w0.f18945b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.w0.f18945b.getContentResolver(), parseInt, 1, options);
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
                    int[] b10 = w7.l8.b(bitmap, true);
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
                int[] b11 = w7.l8.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
