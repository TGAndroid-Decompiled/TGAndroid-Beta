package rf;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import cg.t1;
import f2.n1;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.e9;
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.fi1;
import org.telegram.ui.tn;
import sf.r1;
public final class v0 extends il0 implements NotificationCenter.NotificationCenterDelegate {
    public q0 A;
    public int A0;
    public String B;
    public e9 B0;
    public t0 C;
    public tn C0;
    public t0 D;
    public final c6 D0;
    public ArrayList E;
    public ArrayList F;
    public Object[] F0;
    public ArrayList G;
    public String H;
    public ArrayList I;
    public ArrayList J;
    public String[] K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public long O;
    public TLRPC.TL_inlineBotSwitchPM P;
    public TLRPC.TL_inlineBotWebView Q;
    public final fa0 R;
    public a0.h S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public int Y;
    public ArrayList Z;
    public int f47365c0;
    public int f47368e0;
    public int f47370f0;
    public boolean f47371g0;
    public final Context h;
    public TLRPC.Chat f47372h0;
    public vw f47374j0;
    public boolean f47375k0;
    public yw0 f47376l0;
    public String m0;
    public long f47377n;
    public String f47378n0;
    public String f47379o0;
    public int f47380p0;
    public int f47381q0;
    public final long f47382r;
    public boolean f47383r0;
    public final boolean f47384s;
    public TLRPC.User f47385s0;
    public boolean f47386t0;
    public n0 f47387u0;
    public TLRPC.ChatFull v;
    public Location f47388v0;
    public final k1 f47389w;
    public ArrayList f47390w0;
    public ArrayList f47391x;
    public HashMap f47392x0;
    public a0.h f47393y;
    public String f47395z0;
    public boolean f47364c = true;
    public boolean d = true;
    public boolean f47367e = true;
    public int f47369f = UserConfig.selectedAccount;
    public boolean f47362a0 = true;
    public boolean f47363b0 = true;
    public boolean f47366d0 = true;
    public boolean f47373i0 = false;
    public final ArrayList f47394y0 = new ArrayList();
    public final m0 E0 = new m0(this, new l0(this));
    public boolean G0 = false;
    public int H0 = -1;

    public v0(Context context, long j10, long j11, fa0 fa0Var, c6 c6Var, boolean z10) {
        this.D0 = c6Var;
        this.h = context;
        this.R = fa0Var;
        this.f47377n = j10;
        this.f47384s = z10;
        this.f47382r = j11;
        k1 k1Var = new k1(true);
        this.f47389w = k1Var;
        k1Var.f47277a = new o1.a(this, 19);
        NotificationCenter.getInstance(this.f47369f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f47369f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f47369f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f47369f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override
    public final boolean D(n1 n1Var) {
        if ((this.f47385s0 == null || this.f47366d0) && this.f47390w0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f22398id;
        HashMap hashMap = this.f47392x0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f47369f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.f47390w0 == null) {
                    this.f47390w0 = new ArrayList();
                    this.f47392x0 = new HashMap();
                }
                this.f47390w0.add(new u0(document, str));
                this.f47392x0.put(str2, document);
                vw vwVar = this.f47374j0;
                if (vwVar != null) {
                    vwVar.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            Object obj = str;
            while (i10 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                String str2 = document.dc_id + "_" + document.f22398id;
                HashMap hashMap = this.f47392x0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f47369f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                    int size2 = document.attributes.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i11++;
                    }
                    if (this.f47390w0 == null) {
                        this.f47390w0 = new ArrayList();
                        this.f47392x0 = new HashMap();
                    }
                    this.f47390w0.add(new u0(document, obj));
                    this.f47392x0.put(str2, document);
                }
                i10++;
                obj = obj;
            }
        }
    }

    public final void G() {
        tn tnVar = this.C0;
        if (tnVar != null && tnVar.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23 && this.C0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.C0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f47385s0;
            if (user != null && user.bot_inline_geo) {
                this.E0.start();
            }
        }
    }

    public final void H() {
        if (this.f47390w0 == null) {
            return;
        }
        ArrayList arrayList = this.f47394y0;
        arrayList.clear();
        int min = Math.min(6, this.f47390w0.size());
        for (int i10 = 0; i10 < min; i10++) {
            u0 u0Var = (u0) this.f47390w0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(u0Var.f47357a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f47369f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f47369f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, u0Var.f47357a), u0Var.f47358b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f47385s0;
        if (user != null && user.f22539id != this.O) {
            return null;
        }
        return this.P;
    }

    public final Object J(int i10) {
        String str;
        long j10;
        String str2;
        TLRPC.User user = null;
        if (this.B != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.f47390w0;
        if (arrayList != null) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                return ((u0) this.f47390w0.get(i10)).f47357a;
            }
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.Q;
                if (tL_inlineBotWebView != null) {
                    if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.N.get(i10);
                    }
                }
                i10--;
                if (i10 >= 0) {
                    return this.N.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.f47391x;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f47391x.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 != null) {
                        if (i10 >= 0 && i10 < arrayList4.size()) {
                            return this.E.get(i10);
                        }
                    } else {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 != null) {
                            if (i10 >= 0 && i10 < arrayList5.size()) {
                                return this.J.get(i10);
                            }
                        } else {
                            ArrayList arrayList6 = this.I;
                            if (arrayList6 != null || this.F != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.I.get(i10);
                                    }
                                    ArrayList arrayList7 = this.I;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.F;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.L;
                                    if (arrayList9 != null && (this.f47365c0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i10) != null) {
                                            user = (TLRPC.User) this.L.get(i10);
                                            Object obj = this.F.get(i10);
                                            if (user != null) {
                                                str2 = UserObject.getPublicUsername(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.F.get(i10));
                                        }
                                    } else {
                                        str = (String) this.F.get(i10);
                                    }
                                    ArrayList arrayList10 = this.M;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        if (user != null) {
                                            j10 = user.f22539id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new s0(str, j10);
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int K() {
        int i10;
        int size;
        int i11;
        int i12 = 1;
        if (this.f47385s0 != null && !this.f47366d0) {
            return 1;
        }
        int i13 = 0;
        if (this.B != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f47390w0;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.P == null && this.Q == null) {
                    i12 = 0;
                }
                return size2 + i12 + i10;
            }
            ArrayList arrayList3 = this.f47391x;
            if (arrayList3 != null) {
                i11 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.E;
                if (arrayList4 != null) {
                    i11 = arrayList4.size();
                } else if (this.F == null && this.I == null) {
                    ArrayList arrayList5 = this.J;
                    if (arrayList5 != null) {
                        i11 = arrayList5.size();
                    } else {
                        return i10;
                    }
                } else {
                    ArrayList arrayList6 = this.I;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.F;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    }
                    i11 = size + i13;
                }
            }
        }
        return i11 + i10;
    }

    public final Object L(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.f47390w0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((u0) this.f47390w0.get(i10)).f47358b;
    }

    public final int M(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        if (this.N != null) {
            if (this.P != null || this.Q != null) {
                return i10 - 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean N() {
        if (this.f47390w0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        m0 m0Var = this.E0;
        if (m0Var != null) {
            m0Var.stop();
        }
        n0 n0Var = this.f47387u0;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
            this.f47387u0 = null;
        }
        if (this.f47380p0 != 0) {
            ConnectionsManager.getInstance(this.f47369f).cancelRequest(this.f47380p0, true);
            this.f47380p0 = 0;
        }
        if (this.f47381q0 != 0) {
            ConnectionsManager.getInstance(this.f47369f).cancelRequest(this.f47381q0, true);
            this.f47381q0 = 0;
        }
        this.f47385s0 = null;
        this.P = null;
        this.f47366d0 = true;
        this.m0 = null;
        this.f47378n0 = null;
        this.f47383r0 = false;
        NotificationCenter.getInstance(this.f47369f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f47369f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f47369f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f47369f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.f47385s0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f47388v0 = location;
            location.setLatitude(-1000.0d);
            this.f47388v0.setLongitude(-1000.0d);
            T(true, this.f47385s0, this.f47378n0, "");
        }
    }

    public final void R(TLRPC.User user) {
        tn tnVar;
        TLRPC.Chat chat;
        this.f47380p0 = 0;
        this.E0.stop();
        fa0 fa0Var = this.R;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f47385s0 = user;
            long j10 = user.f22539id;
            if (j10 != this.O) {
                this.P = null;
                this.O = j10;
            }
            tn tnVar2 = this.C0;
            if (tnVar2 != null && (chat = tnVar2.f42787e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f47366d0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    fa0Var.a(true);
                    return;
                }
            }
            if (this.f47385s0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f47369f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f47385s0.f22539id, false) && (tnVar = this.C0) != null && tnVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f47385s0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0.getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new w1(this, zArr, user2, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fi1(6, this, zArr));
                    this.C0.showDialog(alertDialog$Builder.f22714a, new eg.g(17, this, zArr));
                } else {
                    G();
                }
            }
        } else {
            this.f47385s0 = null;
            this.P = null;
            this.f47366d0 = true;
        }
        if (this.f47385s0 == null) {
            this.f47383r0 = true;
            this.P = null;
            return;
        }
        if (fa0Var != null) {
            fa0Var.b(true);
        }
        T(true, this.f47385s0, this.f47378n0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: rf.v0.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f47381q0 != 0) {
            ConnectionsManager.getInstance(this.f47369f).cancelRequest(this.f47381q0, true);
            this.f47381q0 = 0;
        }
        if (this.f47366d0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f47388v0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f47377n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f47377n);
                    sb2.append("_");
                    sb2.append(user.f22539id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f47388v0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f47388v0.getLongitude() + this.f47388v0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f47369f);
                    lk lkVar = new lk(this, str, z10, user, str2, messagesStorage, sb3);
                    long j10 = user.f22539id;
                    if (j10 != this.O) {
                        this.P = null;
                        this.O = j10;
                    }
                    if (z10) {
                        messagesStorage.getBotCache(sb3, lkVar);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f47369f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f47388v0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f47388v0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f47388v0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f47377n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f47369f).getInputPeer(this.f47377n);
                    }
                    this.f47381q0 = ConnectionsManager.getInstance(this.f47369f).sendRequest(tL_messages_getInlineBotResults, lkVar, 2);
                    return;
                }
                return;
            }
            this.f47378n0 = null;
            return;
        }
        fa0 fa0Var = this.R;
        if (fa0Var != null) {
            fa0Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r30, int r31, java.util.ArrayList r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: rf.v0.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f47364c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        tn tnVar;
        TLRPC.Chat chat;
        this.f47369f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f47366d0 && this.f47385s0 != null && (tnVar = this.C0) != null && (chat = tnVar.f42787e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f47366d0 = canSendStickers;
            if (canSendStickers) {
                this.f47391x = null;
                l();
                this.R.a(false);
                R(this.f47385s0);
            }
        }
        String str = this.V;
        if (str != null) {
            U(str, this.Y, this.Z, this.X, this.W);
        }
    }

    public final void X(tn tnVar) {
        this.C0 = tnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f47391x = arrayList;
        if (!this.d || !this.f47367e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f47367e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f22539id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f47393y = hVar;
        yw0 yw0Var = this.f47376l0;
        if (yw0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yw0Var);
            this.f47376l0 = null;
        }
        this.N = null;
        this.f47390w0 = null;
        if (z10) {
            l();
            this.R.a(!this.f47391x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e9 e9Var;
        boolean z10 = false;
        if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.fileLoadFailed) {
            if (i10 == NotificationCenter.recentDocumentsDidLoad) {
                e9 e9Var2 = this.B0;
                if (e9Var2 != null) {
                    AndroidUtilities.runOnUIThread(e9Var2);
                    this.B0 = null;
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (e9Var = this.B0) != null) {
                AndroidUtilities.runOnUIThread(e9Var);
                this.B0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.f47390w0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f47394y0;
            if (!arrayList2.isEmpty() && this.f47375k0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z10 = true;
                    }
                    this.R.a(z10);
                }
            }
        }
    }

    @Override
    public final int h() {
        int K = K();
        this.H0 = K;
        return K;
    }

    @Override
    public final int j(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.f47390w0 != null) {
            return 4;
        }
        if (this.f47385s0 != null && !this.f47366d0) {
            return 3;
        }
        if (this.N != null) {
            if (i10 == 0) {
                if (this.P != null || this.Q != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.H0;
        fa0 fa0Var = this.R;
        int i11 = 0;
        if (i10 != -1 && this.F0 != null) {
            int K = K();
            this.H0 = K;
            if (i10 != K) {
                z10 = true;
            } else {
                z10 = false;
            }
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.F0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof r1)) {
                            if (obj != obj2 && ((!(obj instanceof u0) || !(obj2 instanceof u0) || ((u0) obj).f47357a != ((u0) obj2).f47357a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f22539id != ((TLRPC.User) obj2).f22539id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f22392id != ((TLRPC.Chat) obj2).f22392id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                m(i11);
                z10 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z10 && fa0Var != null) {
                fa0Var.c();
            }
            this.F0 = objArr;
            return;
        }
        if (fa0Var != null) {
            this.H0 = K();
            fa0Var.c();
        }
        super.l();
        int K2 = K();
        this.H0 = K2;
        this.F0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.F0;
            if (i11 < objArr3.length) {
                objArr3[i11] = J(i11);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        String str;
        TLRPC.User user;
        tn tnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f9;
        String str3 = this.B;
        if (str3 != null) {
            i11 = i10 - 2;
        } else {
            i11 = i10;
        }
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        Boolean bool = null;
        if (i12 == 4) {
            z7 z7Var = (z7) view;
            if (i11 >= 0 && i11 < this.f47390w0.size()) {
                u0 u0Var = (u0) this.f47390w0.get(i11);
                TLRPC.Document document = u0Var.f47357a;
                Object obj = u0Var.f47358b;
                t1 t1Var = z7Var.f26060n;
                t9 t9Var = z7Var.f26055a;
                z7Var.f26057c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                z7Var.f26062s = isPremiumSticker;
                if (isPremiumSticker) {
                    t1Var.setColor(g6.w0(null, g6.f23062d6, false));
                    t1Var.D = true;
                    t1Var.E = false;
                    t1Var.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.f23009a7, 1.0f, 1.0f, z7Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        t9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, z7Var.f26057c);
                        f9 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f9 = 1.0f;
                        t9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, z7Var.f26057c);
                    } else {
                        f9 = 1.0f;
                        t9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, z7Var.f26057c);
                    }
                } else {
                    f9 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            t9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, z7Var.f26057c);
                        } else {
                            t9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, z7Var.f26057c);
                        }
                    } else {
                        t9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, z7Var.f26057c);
                    }
                }
                z7Var.f26056b = document;
                Drawable background = z7Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (z7Var.f26062s) {
                    z7Var.f26061r = true;
                } else {
                    z7Var.f26061r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t1Var.getLayoutParams();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int dp = AndroidUtilities.dp(24.0f);
                    layoutParams.width = dp;
                    layoutParams.height = dp;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    t1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    layoutParams.width = dp2;
                    layoutParams.height = dp2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    t1Var.setPadding(AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
                }
                t1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(t1Var, z7Var.f26061r, 0.9f, false);
                z7Var.invalidate();
                z7Var.setClearsInputField(true);
            }
        } else if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.C0.f42787e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                }
            }
        } else if (i12 == 5) {
            sf.m1 m1Var = (sf.m1) view;
            ArrayList arrayList = this.I;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                m1Var.a((r1) this.I.get(i11), this.H, false);
            }
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                if (tL_inlineBotSwitchPM == null && this.Q == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2) {
                    if (z10) {
                        org.telegram.ui.Cells.i0 i0Var = (org.telegram.ui.Cells.i0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.Q.text;
                        }
                        i0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i11--;
                }
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    d2 d2Var = (d2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.N.get(i11);
                    TLRPC.User user2 = this.f47385s0;
                    boolean z13 = this.f47386t0;
                    if (i11 != this.N.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.m0));
                }
            } else if (i12 == 6) {
                t0 t0Var = (t0) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.C = t0Var;
                } else {
                    this.D = t0Var;
                }
                TLRPC.Chat chat2 = this.f47372h0;
                if (chat2 == null && (tnVar = this.C0) != null) {
                    chat2 = tnVar.f42787e;
                }
                t0Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                f5 f5Var = (f5) view;
                ArrayList arrayList3 = this.f47391x;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        f5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        f5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 != null && i11 >= 0 && i11 < arrayList4.size()) {
                        f5Var.setText((String) this.E.get(i11));
                    } else {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 != null && i11 >= 0 && i11 < arrayList5.size()) {
                            f5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.J.get(i11));
                        } else {
                            ArrayList arrayList6 = this.F;
                            if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                                ArrayList arrayList7 = this.G;
                                if (arrayList7 != null && i11 >= 0 && i11 < arrayList7.size()) {
                                    str = (String) this.G.get(i11);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.L;
                                if (arrayList8 != null && i11 >= 0 && i11 < arrayList8.size()) {
                                    user = (TLRPC.User) this.L.get(i11);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.M;
                                if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                                    bool = (Boolean) this.M.get(i11);
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.F.get(i11);
                                eg.r rVar = f5Var.f24314b;
                                TextView textView2 = f5Var.f24315c;
                                org.telegram.ui.Components.e9 e9Var = f5Var.d;
                                t9 t9Var2 = f5Var.f24313a;
                                f5Var.a();
                                if (user != null) {
                                    t9Var2.setVisibility(0);
                                    e9Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        t9Var2.e(user, e9Var);
                                    } else {
                                        t9Var2.setImageDrawable(e9Var);
                                    }
                                } else {
                                    t9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    iq iqVar = new iq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    iqVar.setColorKey(g6.A6);
                                    iqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    rVar.setText(spannableStringBuilder);
                                } else {
                                    rVar.setText(str4);
                                }
                                textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        }
                    }
                }
                f5Var.setDivider(false);
            }
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int v02;
        c6 c6Var = this.D0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z10 = this.f47384s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = c6Var;
                                    t9 t9Var = new t9(context);
                                    frameLayout.f26055a = t9Var;
                                    t9Var.setAspectFit(true);
                                    t9Var.setLayerNum(1);
                                    frameLayout.addView(t9Var, f6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    t1 t1Var = new t1(context, 1, null);
                                    frameLayout.f26060n = t1Var;
                                    t1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    t1Var.setImageReceiver(t9Var.getImageReceiver());
                                    frameLayout.addView(t1Var, f6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View r0Var = new r0(context, 0);
                                    if (z10) {
                                        v02 = g6.l1(0.15f, -1);
                                    } else {
                                        v02 = g6.v0(g6.f23009a7, c6Var);
                                    }
                                    jq jqVar = new jq(new ColorDrawable(v02), g6.U0(context, R.drawable.greydivider, g6.v0(g6.f23028b7, c6Var)), 0, 0);
                                    jqVar.f29792w = true;
                                    r0Var.setBackground(jqVar);
                                    view = r0Var;
                                }
                            } else {
                                textView = new t0(context, c6Var, z10);
                            }
                        } else {
                            view = new sf.m1(context, c6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(g6.v0(g6.f23450z6, c6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f24472a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(g6.w0(null, g6.Ce, false));
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView3.setGravity(i11);
                    if (!LocaleController.isRTL) {
                        i12 = 3;
                    }
                    frameLayout2.addView(textView3, f6.d(-2, -2.0f, i12 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = frameLayout2;
                }
            } else {
                d2 d2Var = new d2(context);
                d2Var.setDelegate(new k0(this));
                textView = d2Var;
            }
            return new n1(textView);
        }
        f5 f5Var = new f5(context, c6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        textView = view;
        return new n1(textView);
    }
}
