package pf;

import ag.k2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.o1;
import h7.z5;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.c9;
import org.telegram.messenger.ik;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.di1;
import org.telegram.ui.rc1;
import org.telegram.ui.rn;
import qf.m1;
import qf.p1;
import qf.q1;

public final class u0 extends yk0 implements NotificationCenter.NotificationCenterDelegate {
    public p0 A;
    public int A0;
    public String B;
    public c9 B0;
    public s0 C;
    public rn C0;
    public s0 D;
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
    public final v90 R;
    public a0.h S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public int Y;
    public ArrayList Z;

    public int f45924c0;

    public int f45927e0;

    public int f45929f0;

    public boolean f45930g0;
    public final Context h;

    public TLRPC.Chat f45931h0;

    public ow f45933j0;

    public boolean f45934k0;

    public gs0 f45935l0;
    public String m0;

    public long f45936n;

    public String f45937n0;

    public String f45938o0;

    public int f45939p0;

    public int f45940q0;

    public final long f45941r;

    public boolean f45942r0;

    public final boolean f45943s;

    public TLRPC.User f45944s0;

    public boolean f45945t0;

    public m0 f45946u0;
    public TLRPC.ChatFull v;

    public Location f45947v0;

    public final j1 f45948w;

    public ArrayList f45949w0;

    public ArrayList f45950x;

    public HashMap f45951x0;

    public a0.h f45952y;

    public String f45954z0;

    public boolean f45923c = true;
    public boolean d = true;

    public boolean f45926e = true;

    public int f45928f = UserConfig.selectedAccount;

    public boolean f45921a0 = true;

    public boolean f45922b0 = true;

    public boolean f45925d0 = true;

    public boolean f45932i0 = false;

    public final ArrayList f45953y0 = new ArrayList();
    public final l0 E0 = new l0(this, new k0(this));
    public boolean G0 = false;
    public int H0 = -1;

    public u0(Context context, long j10, long j11, v90 v90Var, c6 c6Var, boolean z10) {
        this.D0 = c6Var;
        this.h = context;
        this.R = v90Var;
        this.f45936n = j10;
        this.f45943s = z10;
        this.f45941r = j11;
        j1 j1Var = new j1(true);
        this.f45948w = j1Var;
        j1Var.f45836a = new n1.d(this, 15);
        NotificationCenter.getInstance(this.f45928f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f45928f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f45928f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f45928f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean D(o1 o1Var) {
        return (this.f45944s0 == null || this.f45925d0) && this.f45949w0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f22386id;
        HashMap map = this.f45951x0;
        if (map == null || !map.containsKey(str2)) {
            if (UserConfig.getInstance(this.f45928f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.f45949w0 == null) {
                    this.f45949w0 = new ArrayList();
                    this.f45951x0 = new HashMap();
                }
                this.f45949w0.add(new t0(document, str));
                this.f45951x0.put(str2, document);
                ow owVar = this.f45933j0;
                if (owVar != null) {
                    owVar.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        Object obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            String str2 = document.dc_id + "_" + document.f22386id;
            HashMap map = this.f45951x0;
            if (map == null || !map.containsKey(str2)) {
                obj = str;
                obj = str;
                if (UserConfig.getInstance(this.f45928f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                    int size2 = document.attributes.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                    }
                    if (this.f45949w0 == null) {
                        this.f45949w0 = new ArrayList();
                        this.f45951x0 = new HashMap();
                    }
                    this.f45949w0.add(new t0(document, obj));
                    this.f45951x0.put(str2, document);
                }
            } else {
                obj = str;
            }
            i10++;
            obj = obj;
        }
        obj = str;
    }

    public final void G() {
        rn rnVar = this.C0;
        if (rnVar == null || rnVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.C0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.C0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.f45944s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.E0.start();
    }

    public final void H() {
        if (this.f45949w0 == null) {
            return;
        }
        ArrayList arrayList = this.f45953y0;
        arrayList.clear();
        int iMin = Math.min(6, this.f45949w0.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            t0 t0Var = (t0) this.f45949w0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(t0Var.f45916a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f45928f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f45928f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, t0Var.f45916a), t0Var.f45917b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f45944s0;
        if (user == null || user.f22527id == this.O) {
            return this.P;
        }
        return null;
    }

    public final Object J(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str;
        ArrayList arrayList9;
        ArrayList arrayList10;
        TLRPC.TL_inlineBotWebView tL_inlineBotWebView;
        TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM;
        TLRPC.User user = null;
        if (this.B == null) {
            arrayList = this.f45949w0;
            if (arrayList != null) {
                arrayList2 = this.N;
                if (arrayList2 != null) {
                    tL_inlineBotWebView = this.Q;
                    if (tL_inlineBotWebView != null) {
                        tL_inlineBotSwitchPM = this.P;
                        if (tL_inlineBotSwitchPM == null) {
                            if (i10 >= 0 && i10 < arrayList2.size()) {
                                return this.N.get(i10);
                            }
                        } else if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    } else if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                    i10--;
                    if (i10 >= 0) {
                        return this.N.get(i10);
                    }
                } else {
                    arrayList3 = this.f45950x;
                    if (arrayList3 != null) {
                        arrayList4 = this.E;
                        if (arrayList4 != null) {
                            arrayList5 = this.J;
                            if (arrayList5 != null) {
                                arrayList6 = this.I;
                                if (arrayList6 == null || this.F != null) {
                                    if (arrayList6 != null) {
                                        if (i10 < 0 && i10 < arrayList6.size()) {
                                            return this.I.get(i10);
                                        }
                                        arrayList10 = this.I;
                                        if (arrayList10 != null) {
                                            i10 -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.F;
                                    if (arrayList7 != null && i10 >= 0 && i10 < arrayList7.size()) {
                                        arrayList8 = this.L;
                                        if (arrayList8 != null || (this.f45924c0 == 1 && !(this.v instanceof TLRPC.TL_channelFull))) {
                                            str = (String) this.F.get(i10);
                                        } else if (arrayList8.get(i10) != null) {
                                            user = (TLRPC.User) this.L.get(i10);
                                            str = String.format("%s@%s", this.F.get(i10), user != null ? UserObject.getPublicUsername(user) : "");
                                        } else {
                                            str = String.format("%s", this.F.get(i10));
                                        }
                                        arrayList9 = this.M;
                                        if (arrayList9 == null && ((Boolean) arrayList9.get(i10)).booleanValue()) {
                                            return new r0(str, user != null ? user.f22527id : 0L);
                                        }
                                        return str;
                                    }
                                }
                            } else if (i10 >= 0 && i10 < arrayList5.size()) {
                                return this.J.get(i10);
                            }
                        } else if (i10 >= 0 && i10 < arrayList4.size()) {
                            return this.E.get(i10);
                        }
                    } else if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f45950x.get(i10);
                    }
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                return ((t0) this.f45949w0.get(i10)).f45916a;
            }
        } else if (i10 >= 2) {
            i10 -= 2;
            arrayList = this.f45949w0;
            if (arrayList != null) {
                arrayList2 = this.N;
                if (arrayList2 != null) {
                    tL_inlineBotWebView = this.Q;
                    if (tL_inlineBotWebView != null) {
                        tL_inlineBotSwitchPM = this.P;
                        if (tL_inlineBotSwitchPM == null) {
                            if (i10 >= 0) {
                                return this.N.get(i10);
                            }
                        } else if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    } else if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                    i10--;
                    if (i10 >= 0) {
                        return this.N.get(i10);
                    }
                } else {
                    arrayList3 = this.f45950x;
                    if (arrayList3 != null) {
                        arrayList4 = this.E;
                        if (arrayList4 != null) {
                            arrayList5 = this.J;
                            if (arrayList5 != null) {
                                arrayList6 = this.I;
                                if (arrayList6 == null) {
                                    if (arrayList6 != null) {
                                        if (i10 < 0) {
                                        }
                                        arrayList10 = this.I;
                                        if (arrayList10 != null) {
                                            i10 -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.F;
                                    if (arrayList7 != null) {
                                        arrayList8 = this.L;
                                        if (arrayList8 != null) {
                                            str = (String) this.F.get(i10);
                                        } else {
                                            str = (String) this.F.get(i10);
                                        }
                                        arrayList9 = this.M;
                                        if (arrayList9 == null) {
                                        }
                                        return str;
                                    }
                                } else {
                                    if (arrayList6 != null) {
                                        if (i10 < 0) {
                                        }
                                        arrayList10 = this.I;
                                        if (arrayList10 != null) {
                                            i10 -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.F;
                                    if (arrayList7 != null) {
                                        arrayList8 = this.L;
                                        if (arrayList8 != null) {
                                            str = (String) this.F.get(i10);
                                        } else {
                                            str = (String) this.F.get(i10);
                                        }
                                        arrayList9 = this.M;
                                        if (arrayList9 == null) {
                                        }
                                        return str;
                                    }
                                }
                            } else if (i10 >= 0) {
                                return this.J.get(i10);
                            }
                        } else if (i10 >= 0) {
                            return this.E.get(i10);
                        }
                    } else if (i10 >= 0) {
                        return this.f45950x.get(i10);
                    }
                }
            } else if (i10 >= 0) {
                return ((t0) this.f45949w0.get(i10)).f45916a;
            }
        }
        return null;
    }

    public final int K() {
        int size;
        int i10 = 1;
        if (this.f45944s0 != null && !this.f45925d0) {
            return 1;
        }
        int i11 = this.B != null ? 2 : 0;
        ArrayList arrayList = this.f45949w0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.P == null && this.Q == null) {
                    i10 = 0;
                }
                return size2 + i10 + i11;
            }
            ArrayList arrayList3 = this.f45950x;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.E;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.F == null && this.I == null) {
                    ArrayList arrayList5 = this.J;
                    if (arrayList5 == null) {
                        return i11;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.I;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.F;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i11;
    }

    public final Object L(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.f45949w0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((t0) this.f45949w0.get(i10)).f45917b;
    }

    public final int M(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        if (this.N != null) {
            return (this.P == null && this.Q == null) ? i10 : i10 - 1;
        }
        return i10;
    }

    public final boolean N() {
        return this.f45949w0 != null;
    }

    public final void P() {
        l0 l0Var = this.E0;
        if (l0Var != null) {
            l0Var.stop();
        }
        m0 m0Var = this.f45946u0;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.f45946u0 = null;
        }
        if (this.f45939p0 != 0) {
            ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45939p0, true);
            this.f45939p0 = 0;
        }
        if (this.f45940q0 != 0) {
            ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45940q0, true);
            this.f45940q0 = 0;
        }
        this.f45944s0 = null;
        this.P = null;
        this.f45925d0 = true;
        this.m0 = null;
        this.f45937n0 = null;
        this.f45942r0 = false;
        NotificationCenter.getInstance(this.f45928f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f45928f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f45928f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f45928f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.f45944s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.f45947v0 = location;
        location.setLatitude(-1000.0d);
        this.f45947v0.setLongitude(-1000.0d);
        T(true, this.f45944s0, this.f45937n0, "");
    }

    public final void R(TLRPC.User user) {
        rn rnVar;
        TLRPC.Chat chat;
        this.f45939p0 = 0;
        this.E0.stop();
        v90 v90Var = this.R;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.f45944s0 = null;
            this.P = null;
            this.f45925d0 = true;
        } else {
            this.f45944s0 = user;
            long j10 = user.f22527id;
            if (j10 != this.O) {
                this.P = null;
                this.O = j10;
            }
            rn rnVar2 = this.C0;
            if (rnVar2 != null && (chat = rnVar2.f42026e) != null) {
                boolean zCanSendStickers = ChatObject.canSendStickers(chat);
                this.f45925d0 = zCanSendStickers;
                if (!zCanSendStickers) {
                    l();
                    v90Var.a(true);
                    return;
                }
            }
            if (this.f45944s0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f45928f).getBoolean("inlinegeo_" + this.f45944s0.f22527id, false) || (rnVar = this.C0) == null || rnVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.f45944s0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new iq0(this, zArr, user2, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new di1(4, this, zArr));
                    this.C0.showDialog(alertDialog$Builder.f22702a, new cg.g(17, this, zArr));
                }
            }
        }
        if (this.f45944s0 == null) {
            this.f45942r0 = true;
            this.P = null;
        } else {
            if (v90Var != null) {
                v90Var.b(true);
            }
            T(true, this.f45944s0, this.f45937n0, "");
        }
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.f45944s0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.f45937n0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.f45944s0;
            v90 v90Var = this.R;
            if (user2 != null) {
                if (!this.f45925d0 && str != null && str2 != null) {
                    return;
                } else {
                    v90Var.a(false);
                }
            }
            m0 m0Var = this.f45946u0;
            if (m0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                this.f45946u0 = null;
            }
            if (TextUtils.isEmpty(str) || !((str3 = this.m0) == null || str3.equals(str))) {
                if (this.f45939p0 != 0) {
                    ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45939p0, true);
                    this.f45939p0 = 0;
                }
                if (this.f45940q0 != 0) {
                    ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45940q0, true);
                    this.f45940q0 = 0;
                }
                this.f45944s0 = null;
                this.P = null;
                this.f45925d0 = true;
                this.m0 = null;
                this.f45937n0 = null;
                this.E0.stop();
                this.f45942r0 = false;
                if (v90Var != null) {
                    v90Var.b(false);
                }
                if (str != null && str.length() != 0) {
                    if (str2 == null) {
                        if (v90Var != null) {
                            if (this.f45944s0 != null) {
                                v90Var.b(true);
                            } else if (str.equals("gif")) {
                                this.m0 = "gif";
                                v90Var.b(false);
                            }
                        }
                        MessagesController messagesController = MessagesController.getInstance(this.f45928f);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45928f);
                        this.f45937n0 = str2;
                        m0 m0Var2 = new m0(this, str2, str, messagesController, messagesStorage);
                        this.f45946u0 = m0Var2;
                        AndroidUtilities.runOnUIThread(m0Var2, 400L);
                        return;
                    }
                    if (this.f45940q0 != 0) {
                        ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45940q0, true);
                        this.f45940q0 = 0;
                    }
                    this.f45937n0 = null;
                    if (v90Var != null) {
                        v90Var.b(false);
                    }
                }
            } else {
                if (str2 == null) {
                    if (v90Var != null) {
                        if (this.f45944s0 != null) {
                            v90Var.b(true);
                        } else if (str.equals("gif")) {
                            this.m0 = "gif";
                            v90Var.b(false);
                        }
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(this.f45928f);
                    MessagesStorage messagesStorage2 = MessagesStorage.getInstance(this.f45928f);
                    this.f45937n0 = str2;
                    m0 m0Var3 = new m0(this, str2, str, messagesController2, messagesStorage2);
                    this.f45946u0 = m0Var3;
                    AndroidUtilities.runOnUIThread(m0Var3, 400L);
                    return;
                }
                if (this.f45940q0 != 0) {
                    ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45940q0, true);
                    this.f45940q0 = 0;
                }
                this.f45937n0 = null;
                if (v90Var != null) {
                    v90Var.b(false);
                }
            }
        }
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.f45940q0 != 0) {
            ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45940q0, true);
            this.f45940q0 = 0;
        }
        if (!this.f45925d0 || !this.d) {
            v90 v90Var = this.R;
            if (v90Var != null) {
                v90Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.f45937n0 = null;
            return;
        }
        if (user.bot_inline_geo && this.f45947v0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45936n);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(this.f45936n);
        sb2.append("_");
        sb2.append(user.f22527id);
        sb2.append("_");
        sb2.append((!user.bot_inline_geo || this.f45947v0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.f45947v0.getLongitude() + this.f45947v0.getLatitude()));
        String string = sb2.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45928f);
        ik ikVar = new ik(this, str, z10, user, str2, messagesStorage, string);
        long j10 = user.f22527id;
        if (j10 != this.O) {
            this.P = null;
            this.O = j10;
        }
        if (z10) {
            messagesStorage.getBotCache(string, ikVar);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f45928f).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.f45947v0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f45947v0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f45947v0.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.f45936n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f45928f).getInputPeer(this.f45936n);
        }
        this.f45940q0 = ConnectionsManager.getInstance(this.f45928f).sendRequest(tL_messages_getInlineBotResults, ikVar, 2);
    }

    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        int i11;
        ArrayList arrayList2;
        v90 v90Var;
        String str3;
        rn rnVar;
        byte b10;
        int i12;
        String strSubstring;
        String strSubstring2;
        ?? r15;
        byte b11;
        String strSubstring3;
        int i13;
        boolean z12;
        s0 s0Var;
        s0 s0Var2;
        String[] currentKeyboardLanguage;
        boolean z13;
        ArrayList arrayList3;
        int i14;
        ?? r10;
        boolean z14;
        ArrayList arrayList4;
        TL_bots.BotInfo botInfo;
        int i15;
        TLRPC.BotCommand botCommand;
        String str4;
        ArrayList arrayList5;
        int i16;
        boolean z15;
        h1 h1Var;
        String str5;
        String lowerCase;
        boolean z16;
        ArrayList arrayList6;
        a0.h hVar;
        a0.h hVar2;
        ArrayList arrayList7;
        LinkedHashMap linkedHashMap;
        int size;
        int i17;
        ArrayList arrayList8;
        rn rnVar2;
        TLRPC.ChatFull chatFull;
        long j10;
        TLRPC.User currentUser;
        ArrayList<TLRPC.Dialog> allDialogs;
        int i18;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        int i19;
        int i20;
        TLRPC.User user2;
        int i21;
        TLRPC.ChatParticipant chatParticipant;
        long j11;
        TLRPC.User user3;
        String str6;
        String publicUsername;
        String str7;
        TLRPC.User user4;
        long j12;
        Object obj;
        int i22;
        int i23;
        TLRPC.User user5;
        String publicUsername2;
        int i24;
        long fromChatId;
        boolean z17;
        v90 v90Var2;
        v90 v90Var3;
        String str8 = "";
        String string = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat2 = this.f45931h0;
        rn rnVar3 = this.C0;
        if (rnVar3 != null) {
            chat2 = rnVar3.f42026e;
            rnVar3.i();
        }
        TLRPC.Chat chat3 = chat2;
        gs0 gs0Var = this.f45935l0;
        if (gs0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gs0Var);
            this.f45935l0 = null;
        }
        if (this.f45929f0 != 0) {
            ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.f45929f0, true);
            this.f45929f0 = 0;
        }
        p0 p0Var = this.A;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.A = null;
        }
        c9 c9Var = this.B0;
        if (c9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c9Var);
            this.B0 = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        v90 v90Var4 = this.R;
        if (zIsEmpty || string.length() > MessagesController.getInstance(this.f45928f).getMaxMessageLength()) {
            S(null, null);
            v90Var4.a(false);
            this.V = null;
            this.f45954z0 = null;
            this.f45949w0 = null;
            this.f45951x0 = null;
            l();
            this.f45934k0 = false;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            ow owVar = this.f45933j0;
            if (owVar != null) {
                owVar.a();
                return;
            }
            return;
        }
        int i25 = string.length() > 0 ? i10 - 1 : i10;
        this.V = null;
        this.X = z10;
        this.W = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z18 = !z10 && string.length() > 0 && string.length() <= 14;
        if (z18) {
            int length = string.length();
            CharSequence charSequenceConcat = string;
            int i26 = 0;
            while (i26 < length) {
                char cCharAt = charSequenceConcat.charAt(i26);
                int i27 = length - 1;
                char cCharAt2 = i26 < i27 ? charSequenceConcat.charAt(i26 + 1) : (char) 0;
                if (i26 >= i27 || cCharAt != 55356 || cCharAt2 < 57339 || cCharAt2 > 57343) {
                    if (cCharAt == 65039) {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i26), charSequenceConcat.subSequence(i26 + 1, charSequenceConcat.length()));
                        length--;
                    }
                    i26++;
                    str8 = str8;
                } else {
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i26), charSequenceConcat.subSequence(i26 + 2, charSequenceConcat.length()));
                    length -= 2;
                }
                i26--;
                i26++;
                str8 = str8;
            }
            str = str8;
            this.f45954z0 = charSequenceConcat.toString().trim();
            str2 = string;
        } else {
            str = "";
            str2 = str;
        }
        boolean z19 = z18 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.f45954z0));
        if (z19 && (charSequence instanceof Spanned)) {
            t5[] t5VarArr = (t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), t5.class);
            z19 = t5VarArr == null || t5VarArr.length == 0;
        }
        if (this.f45923c && z19 && (chat3 == null || ChatObject.canSendStickers(chat3))) {
            ArrayList arrayList9 = this.f45953y0;
            arrayList9.clear();
            int i28 = SharedConfig.suggestStickers;
            if (i28 == 2 || !z19) {
                if (this.f45934k0 && i28 == 2) {
                    this.f45934k0 = false;
                    v90Var4.a(false);
                    l();
                    return;
                }
                return;
            }
            this.f45949w0 = null;
            this.f45951x0 = null;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f45928f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            boolean z20 = MessagesController.getInstance(this.f45928f).suggestStickersApiOnly;
            if (z20) {
                arrayList2 = arrayList;
                z17 = z20;
                i11 = i10;
            } else {
                arrayList2 = arrayList;
                z17 = z20;
                i11 = i10;
                this.B0 = new c9(this, charSequence, i10, arrayList2, z10, z11);
                MediaDataController.getInstance(this.f45928f).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.f45928f).loadRecents(2, false, true, false);
                ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.f45928f).getRecentStickersNoCopy(0);
                ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.f45928f).getRecentStickersNoCopy(2);
                int iMin = Math.min(20, recentStickersNoCopy.size());
                int i29 = 0;
                for (int i30 = 0; i30 < iMin; i30++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i30);
                    if (O(document, this.f45954z0)) {
                        E(document, "recent");
                        int i31 = i29 + 1;
                        if (i31 >= 5) {
                            break;
                        } else {
                            i29 = i31;
                        }
                    }
                }
                int size2 = recentStickersNoCopy2.size();
                for (int i32 = 0; i32 < size2; i32++) {
                    TLRPC.Document document2 = recentStickersNoCopy2.get(i32);
                    if (O(document2, this.f45954z0)) {
                        E(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.f45928f).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.f45928f).getAllStickers();
                ArrayList<TLRPC.Document> arrayList10 = allStickers != null ? allStickers.get(this.f45954z0) : null;
                if (arrayList10 != null && !arrayList10.isEmpty()) {
                    F(null, arrayList10);
                }
                ArrayList arrayList11 = this.f45949w0;
                if (arrayList11 != null) {
                    Collections.sort(arrayList11, new n0(recentStickersNoCopy2, recentStickersNoCopy));
                }
            }
            if (SharedConfig.suggestStickers == 0 || z17) {
                String str9 = this.f45954z0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.A0 = ConnectionsManager.getInstance(this.f45928f).sendRequest(tL_messages_getStickers, new rc1(6, this, str9));
            }
            ArrayList arrayList12 = this.f45949w0;
            if (arrayList12 == null || arrayList12.isEmpty()) {
                v90 v90Var5 = v90Var4;
                v90Var2 = v90Var5;
                if (this.f45934k0) {
                    v90Var5.a(false);
                    this.f45934k0 = false;
                    v90Var2 = v90Var5;
                }
            } else {
                if (SharedConfig.suggestStickers != 0 || this.f45949w0.size() >= 5) {
                    v90 v90Var6 = v90Var4;
                    H();
                    v90Var6.a(arrayList9.isEmpty());
                    this.f45934k0 = true;
                    v90Var3 = v90Var6;
                } else {
                    v90 v90Var7 = v90Var4;
                    v90Var7.a(false);
                    this.f45934k0 = false;
                    v90Var3 = v90Var7;
                }
                l();
                v90Var2 = v90Var3;
            }
            b10 = 4;
            str3 = null;
            v90Var = v90Var2;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            v90Var = v90Var4;
            if (!z10 && this.f45922b0 && string.charAt(0) == '@') {
                int iIndexOf = string.indexOf(32);
                int length2 = string.length();
                if (iIndexOf > 0) {
                    String strSubstring4 = string.substring(1, iIndexOf);
                    strSubstring2 = string.substring(iIndexOf + 1);
                    strSubstring = strSubstring4;
                    i12 = 1;
                } else if (string.charAt(length2 - 1) == 't' && string.charAt(length2 - 2) == 'o' && string.charAt(length2 - 3) == 'b') {
                    i12 = 1;
                    strSubstring = string.substring(1);
                    strSubstring2 = str;
                } else {
                    i12 = 1;
                    S(null, null);
                    strSubstring = null;
                    strSubstring2 = null;
                }
                if (strSubstring != null && strSubstring.length() >= i12) {
                    int i33 = 1;
                    while (true) {
                        if (i33 >= strSubstring.length()) {
                            str = strSubstring;
                            break;
                        }
                        char cCharAt3 = strSubstring.charAt(i33);
                        if ((cCharAt3 < '0' || cCharAt3 > '9') && ((cCharAt3 < 'a' || cCharAt3 > 'z') && ((cCharAt3 < 'A' || cCharAt3 > 'Z') && cCharAt3 != '_'))) {
                            break;
                        } else {
                            i33++;
                        }
                    }
                }
                S(str, strSubstring2);
                str3 = null;
            } else if (!this.f45923c || (rnVar = this.C0) == null || rnVar.h != null || (!(chat3 == null || ChatObject.canSendStickers(chat3)) || string.trim().length() < 2 || string.trim().indexOf(32) >= 0)) {
                str3 = null;
                S(null, null);
            } else {
                str3 = null;
                S(null, null);
            }
            b10 = -1;
        }
        if (this.f45944s0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f45928f);
        String str10 = this.B;
        this.B = str3;
        j1 j1Var = this.f45948w;
        if (!z10) {
            while (true) {
                if (i25 >= 0) {
                    if (i25 < string.length()) {
                        char cCharAt4 = string.charAt(i25);
                        if (i25 != 0) {
                            int i34 = i25 - 1;
                            if (string.charAt(i34) == ' ' || string.charAt(i34) == '\n' || cCharAt4 == ':') {
                                if (cCharAt4 == '@') {
                                    z12 = this.f45932i0;
                                    if (!z12 || this.f45921a0 || (this.f45922b0 && i25 == 0)) {
                                        if (z12 && this.v == null && i25 != 0) {
                                            this.V = string;
                                            this.Y = i11;
                                            this.Z = arrayList2;
                                            v90Var.a(false);
                                            return;
                                        }
                                        this.T = i25;
                                        this.U = sb2.length() + 1;
                                        b11 = 0;
                                        r15 = 0;
                                    }
                                } else if (cCharAt4 == '#') {
                                    if (ChatObject.isChannelAndNotMegaGroup(chat3) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                                        strSubstring3 = string.substring(i25);
                                        this.B = strSubstring3;
                                        if (strSubstring3.length() >= 4 || !this.B.matches("^[#$][\\p{L}_-]+$")) {
                                            this.B = null;
                                        }
                                    }
                                    if (j1Var.f45852s) {
                                        MessagesStorage.getInstance(j1Var.f45846m).getStorageQueue().postRunnable(new g1(j1Var, 1));
                                        this.V = string;
                                        this.Y = i11;
                                        this.Z = arrayList2;
                                        return;
                                    }
                                    this.T = i25;
                                    this.U = sb2.length() + 1;
                                    sb2.insert(0, cCharAt4);
                                    b11 = 1;
                                } else if (i25 != 0 && this.S != null && cCharAt4 == '/') {
                                    this.T = i25;
                                    this.U = sb2.length() + 1;
                                    b11 = 2;
                                } else if (cCharAt4 == ':' && sb2.length() > 0) {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i13 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i13 = 1;
                                    }
                                    this.T = i25;
                                    this.U = sb2.length() + i13;
                                    b11 = 3;
                                }
                            }
                            sb2.insert(0, cCharAt4);
                        } else {
                            if (cCharAt4 == '@') {
                                z12 = this.f45932i0;
                                if (!z12) {
                                }
                                if (z12) {
                                }
                                this.T = i25;
                                this.U = sb2.length() + 1;
                                b11 = 0;
                                r15 = 0;
                            } else if (cCharAt4 == '#') {
                                if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                    strSubstring3 = string.substring(i25);
                                    this.B = strSubstring3;
                                    if (strSubstring3.length() >= 4) {
                                        this.B = null;
                                    } else {
                                        this.B = null;
                                    }
                                }
                                if (j1Var.f45852s) {
                                    MessagesStorage.getInstance(j1Var.f45846m).getStorageQueue().postRunnable(new g1(j1Var, 1));
                                    this.V = string;
                                    this.Y = i11;
                                    this.Z = arrayList2;
                                    return;
                                }
                                this.T = i25;
                                this.U = sb2.length() + 1;
                                sb2.insert(0, cCharAt4);
                                b11 = 1;
                            } else if (i25 != 0) {
                                if (cCharAt4 == ':') {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i13 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i13 = 1;
                                    }
                                    this.T = i25;
                                    this.U = sb2.length() + i13;
                                    b11 = 3;
                                }
                            } else if (cCharAt4 == ':') {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                    i13 = 1;
                                    if (sb2.length() > 1) {
                                    }
                                } else {
                                    i13 = 1;
                                }
                                this.T = i25;
                                this.U = sb2.length() + i13;
                                b11 = 3;
                            }
                            sb2.insert(0, cCharAt4);
                        }
                    }
                    i25--;
                } else {
                    r15 = 0;
                    b11 = b10;
                    i25 = -1;
                }
                if (str10 != null && this.B != null) {
                    s(r15, 2);
                } else if (str10 == null && this.B == null) {
                    t(r15, 2);
                } else {
                    s0Var = this.C;
                    if (s0Var != 0) {
                        s0Var.a(r15, this.B, chat3);
                    }
                    s0Var2 = this.D;
                    if (s0Var2 != null) {
                        s0Var2.a(1, this.B, chat3);
                    }
                }
                if (b11 == -1) {
                    this.f45945t0 = r15;
                    this.N = null;
                    v90Var.a(r15);
                    return;
                }
                if (b11 == 0) {
                    if (b11 == 1) {
                        ArrayList arrayList13 = new ArrayList();
                        String lowerCase2 = sb2.toString().toLowerCase();
                        arrayList5 = j1Var.f45850q;
                        for (i16 = 0; i16 < arrayList5.size(); i16++) {
                            h1Var = (h1) arrayList5.get(i16);
                            if (h1Var == null && (str5 = h1Var.f45821a) != null && str5.startsWith(lowerCase2)) {
                                arrayList13.add(h1Var.f45821a);
                            }
                        }
                        this.E = arrayList13;
                        this.f45949w0 = null;
                        this.f45950x = null;
                        this.f45952y = null;
                        this.I = null;
                        this.F = null;
                        this.M = null;
                        this.G = null;
                        this.L = null;
                        this.J = null;
                        this.f45945t0 = false;
                        this.N = null;
                        l();
                        if (this.E.isEmpty() || this.B != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        v90Var.a(z15);
                        return;
                    }
                    if (b11 == 2) {
                        if (b11 == 3) {
                            if (b11 == 4) {
                                this.E = null;
                                this.f45950x = null;
                                this.f45952y = null;
                                this.J = null;
                                this.F = null;
                                this.M = null;
                                this.I = null;
                                this.G = null;
                                this.L = null;
                                return;
                            }
                            return;
                        }
                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        if (!Arrays.equals(currentKeyboardLanguage, this.K)) {
                            MediaDataController.getInstance(this.f45928f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        this.K = currentKeyboardLanguage;
                        MediaDataController mediaDataController = MediaDataController.getInstance(this.f45928f);
                        String[] strArr = this.K;
                        String string2 = sb2.toString();
                        j0 j0Var = new j0(this);
                        if (SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(this.f45928f).isPremium()) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        mediaDataController.getEmojiSuggestions(strArr, string2, false, j0Var, z13);
                        return;
                    }
                    arrayList3 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    String lowerCase3 = sb2.toString().toLowerCase();
                    for (i14 = 0; i14 < this.S.m(); i14++) {
                        botInfo = (TL_bots.BotInfo) this.S.n(i14);
                        for (i15 = 0; i15 < botInfo.commands.size(); i15++) {
                            botCommand = botInfo.commands.get(i15);
                            if (botCommand == null && (str4 = botCommand.command) != null && str4.startsWith(lowerCase3)) {
                                arrayList3.add("/" + botCommand.command);
                                arrayList14.add(botCommand.description);
                                arrayList15.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                                arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                            }
                        }
                    }
                    if (this.C0 != null || DialogObject.isEncryptedDialog(this.f45936n)) {
                        r10 = 0;
                        this.H = null;
                        this.I = null;
                    } else {
                        rn rnVar4 = this.C0;
                        if (rnVar4.N3 != 0 || rnVar4.i() == null || this.C0.i().bot || UserObject.isReplyUser(this.C0.i()) || UserObject.isService(this.C0.i().f22527id)) {
                            r10 = 0;
                            this.H = null;
                            this.I = null;
                        } else {
                            q1 q1VarF = q1.f(this.f45928f);
                            ArrayList arrayList17 = q1VarF.f46434b;
                            q1VarF.h();
                            this.H = lowerCase3;
                            this.I = new ArrayList();
                            for (int i35 = 0; i35 < arrayList17.size(); i35++) {
                                p1 p1Var = (p1) arrayList17.get(i35);
                                if (!q1.g(p1Var.f46419b)) {
                                    String lowerCase4 = p1Var.f46419b.toLowerCase();
                                    if (lowerCase4.startsWith(lowerCase3) || AndroidUtilities.translitSafe(lowerCase4).startsWith(lowerCase3)) {
                                        this.I.add(p1Var);
                                    }
                                }
                            }
                            r10 = 0;
                        }
                    }
                    this.E = r10;
                    this.f45949w0 = r10;
                    this.f45950x = r10;
                    this.f45952y = r10;
                    this.J = r10;
                    this.F = arrayList3;
                    this.G = arrayList14;
                    this.L = arrayList15;
                    this.M = arrayList16;
                    this.f45945t0 = false;
                    this.N = r10;
                    l();
                    if (arrayList3.isEmpty() || !((arrayList4 = this.I) == null || arrayList4.isEmpty())) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    v90Var.a(z14);
                    return;
                }
                this.f45945t0 = r15;
                this.N = null;
                ArrayList arrayList18 = new ArrayList();
                if (arrayList2 != null) {
                    for (i24 = 0; i24 < Math.min(100, arrayList2.size()); i24++) {
                        fromChatId = ((MessageObject) arrayList2.get(i24)).getFromChatId();
                        if (fromChatId <= 0 && !arrayList18.contains(Long.valueOf(fromChatId))) {
                            arrayList18.add(Long.valueOf(fromChatId));
                        }
                    }
                }
                lowerCase = sb2.toString().toLowerCase();
                if (lowerCase.indexOf(32) >= 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                arrayList6 = new ArrayList();
                hVar = new a0.h();
                hVar2 = new a0.h();
                arrayList7 = new ArrayList();
                arrayList7.addAll(MediaDataController.getInstance(this.f45928f).inlineBots);
                if (chat3 != null || (!ChatObject.isMonoForum(chat3) && !ChatObject.isChannelAndNotMegaGroup(chat3))) {
                    arrayList7.addAll(MediaDataController.getInstance(this.f45928f).guestBots);
                }
                List.EL.sort(arrayList7, new lp0(20));
                linkedHashMap = new LinkedHashMap();
                size = arrayList7.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj2 = arrayList7.get(i17);
                    i17++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj2;
                    Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
                }
                arrayList8 = new ArrayList(linkedHashMap.values());
                if (!z10 && this.f45922b0 && i25 == 0 && !arrayList8.isEmpty()) {
                    i23 = 0;
                    for (i22 = 0; i22 < arrayList8.size(); i22++) {
                        user5 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i22)).peer.user_id));
                        if (user5 == null) {
                            publicUsername2 = UserObject.getPublicUsername(user5);
                            if (!TextUtils.isEmpty(publicUsername2) && (lowerCase.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase))) {
                                arrayList6.add(user5);
                                hVar.k(user5, user5.f22527id);
                                hVar2.k(user5, user5.f22527id);
                                i23++;
                            }
                            if (i23 == 5) {
                                break;
                            }
                        }
                    }
                }
                rnVar2 = this.C0;
                if (rnVar2 != null) {
                    chat3 = rnVar2.f42026e;
                    j10 = rnVar2.Z3;
                } else {
                    chatFull = this.v;
                    if (chatFull != null) {
                        chat3 = messagesController.getChat(Long.valueOf(chatFull.f22381id));
                    }
                    j10 = 0;
                }
                currentUser = UserConfig.getInstance(this.f45928f).getCurrentUser();
                if (chat3 != null && (chatFull2 = this.v) != null && chatFull2.participants != null && (!ChatObject.isChannel(chat3) || chat3.megagroup)) {
                    i19 = -2;
                    i20 = -2;
                    user2 = currentUser;
                    while (i20 < this.v.participants.participants.size()) {
                        if (i20 != i19) {
                            i21 = i20;
                            if (i21 == -1) {
                                if (z11) {
                                    if (lowerCase.length() == 0) {
                                        arrayList6.add(chat3);
                                    } else {
                                        String str11 = chat3.title;
                                        publicUsername = ChatObject.getPublicUsername(chat3);
                                        j11 = j10;
                                        obj = chat3;
                                        user4 = user2;
                                        j12 = -chat3.f22380id;
                                        str6 = str11;
                                        str7 = null;
                                        if (TextUtils.isEmpty(publicUsername)) {
                                            z16 = z16;
                                        } else {
                                            z16 = z16;
                                            if (publicUsername.toLowerCase().startsWith(lowerCase)) {
                                                arrayList6.add(obj);
                                                hVar2.k(obj, j12);
                                            }
                                        }
                                        if (TextUtils.isEmpty(str6)) {
                                        }
                                    }
                                }
                                j11 = j10;
                                user4 = user2;
                            } else {
                                chatParticipant = this.v.participants.participants.get(i21);
                                if (user2 != null) {
                                    j11 = j10;
                                    if (chatParticipant.user_id != user2.f22527id) {
                                    }
                                    user4 = user2;
                                } else {
                                    j11 = j10;
                                }
                                user3 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                                if (user3 != null && !UserObject.isUserSelf(user3) && hVar.h(user3.f22527id) < 0) {
                                    if (lowerCase.length() == 0 || user3.deleted) {
                                        str6 = user3.first_name;
                                        String str12 = user3.last_name;
                                        publicUsername = UserObject.getPublicUsername(user3);
                                        str7 = str12;
                                        user4 = user2;
                                        j12 = user3.f22527id;
                                        obj = user3;
                                        if (TextUtils.isEmpty(publicUsername)) {
                                            z16 = z16;
                                            if (publicUsername.toLowerCase().startsWith(lowerCase)) {
                                                arrayList6.add(obj);
                                                hVar2.k(obj, j12);
                                            }
                                        } else {
                                            z16 = z16;
                                        }
                                        if (TextUtils.isEmpty(str6)) {
                                        }
                                    } else {
                                        arrayList6.add(user3);
                                    }
                                }
                                user4 = user2;
                            }
                        } else if (user2 == null && z10) {
                            str6 = user2.first_name;
                            str7 = user2.last_name;
                            publicUsername = UserObject.getPublicUsername(user2);
                            j11 = j10;
                            TLRPC.User user6 = user2;
                            j12 = user2.f22527id;
                            i21 = i20;
                            user4 = user6;
                            obj = user6;
                            if (TextUtils.isEmpty(publicUsername)) {
                                z16 = z16;
                                if (publicUsername.toLowerCase().startsWith(lowerCase)) {
                                    arrayList6.add(obj);
                                    hVar2.k(obj, j12);
                                }
                            } else {
                                z16 = z16;
                            }
                            if ((TextUtils.isEmpty(str6) && str6.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str7) && str7.toLowerCase().startsWith(lowerCase)) || (z16 && ContactsController.formatName(str6, str7).toLowerCase().startsWith(lowerCase)))) {
                                arrayList6.add(obj);
                                hVar2.k(obj, j12);
                            }
                        } else {
                            j11 = j10;
                            i21 = i20;
                            user4 = user2;
                        }
                        int i36 = i21 + 1;
                        j10 = j11;
                        user2 = user4;
                        i19 = -2;
                        i20 = i36;
                        z16 = z16;
                    }
                }
                boolean z21 = z16;
                long j13 = j10;
                if (this.f45932i0) {
                    allDialogs = MessagesController.getInstance(this.f45928f).getAllDialogs();
                    for (i18 = 0; i18 < allDialogs.size(); i18++) {
                        if (allDialogs.get(i18).f22384id > 0) {
                            user = messagesController.getUser(Long.valueOf(allDialogs.get(i18).f22384id));
                            if (user == null && !UserObject.isUserSelf(user) && hVar.h(user.f22527id) < 0) {
                                if (lowerCase.length() != 0 || user.deleted) {
                                    String str13 = user.first_name;
                                    String str14 = user.last_name;
                                    String publicUsername3 = UserObject.getPublicUsername(user);
                                    long j14 = user.f22527id;
                                    if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str13) && str13.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str14) && str14.toLowerCase().startsWith(lowerCase)) || (z21 && ContactsController.formatName(str13, str14).toLowerCase().startsWith(lowerCase))))) {
                                        arrayList6.add(user);
                                        hVar2.k(user, j14);
                                    }
                                } else {
                                    arrayList6.add(user);
                                }
                            }
                        } else if (TextUtils.isEmpty(lowerCase) && (chat = messagesController.getChat(Long.valueOf(-allDialogs.get(i18).f22384id))) != null && chat.username != null && hVar.h(chat.f22380id) < 0) {
                            if (lowerCase.length() == 0) {
                                arrayList6.add(chat);
                            } else {
                                String str15 = chat.title;
                                String str16 = chat.username;
                                long j15 = chat.f22380id;
                                if ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase)) || (!TextUtils.isEmpty(str15) && str15.toLowerCase().startsWith(lowerCase))) {
                                    arrayList6.add(chat);
                                    hVar2.k(chat, j15);
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList6, new o0(hVar2, arrayList18));
                this.E = null;
                this.f45949w0 = null;
                this.I = null;
                this.F = null;
                this.M = null;
                this.G = null;
                this.L = null;
                this.J = null;
                if (!((chat3 == null && chat3.megagroup) || this.f45932i0) || lowerCase.length() <= 0) {
                    Y(hVar2, arrayList6, true);
                }
                if (arrayList6.size() < 5) {
                    gs0 gs0Var2 = new gs0(this, arrayList6, hVar2, 27);
                    this.f45935l0 = gs0Var2;
                    AndroidUtilities.runOnUIThread(gs0Var2, 1000L);
                } else {
                    Y(hVar2, arrayList6, true);
                }
                p0 p0Var2 = new p0(this, chat3, lowerCase, j13, arrayList6, hVar2, messagesController);
                this.A = p0Var2;
                AndroidUtilities.runOnUIThread(p0Var2, 200L);
                return;
            }
        }
        sb2.append(string.substring(1));
        this.T = 0;
        this.U = sb2.length();
        b11 = 0;
        i25 = -1;
        r15 = 0;
        if (str10 != null) {
            if (str10 == null) {
                s0Var = this.C;
                if (s0Var != 0) {
                    s0Var.a(r15, this.B, chat3);
                }
                s0Var2 = this.D;
                if (s0Var2 != null) {
                    s0Var2.a(1, this.B, chat3);
                }
            } else {
                s0Var = this.C;
                if (s0Var != 0) {
                    s0Var.a(r15, this.B, chat3);
                }
                s0Var2 = this.D;
                if (s0Var2 != null) {
                    s0Var2.a(1, this.B, chat3);
                }
            }
        } else if (str10 == null) {
            s0Var = this.C;
            if (s0Var != 0) {
                s0Var.a(r15, this.B, chat3);
            }
            s0Var2 = this.D;
            if (s0Var2 != null) {
                s0Var2.a(1, this.B, chat3);
            }
        } else {
            s0Var = this.C;
            if (s0Var != 0) {
                s0Var.a(r15, this.B, chat3);
            }
            s0Var2 = this.D;
            if (s0Var2 != null) {
                s0Var2.a(1, this.B, chat3);
            }
        }
        if (b11 == -1) {
            this.f45945t0 = r15;
            this.N = null;
            v90Var.a(r15);
            return;
        }
        if (b11 == 0) {
            if (b11 == 1) {
                ArrayList arrayList19 = new ArrayList();
                String lowerCase5 = sb2.toString().toLowerCase();
                arrayList5 = j1Var.f45850q;
                while (i16 < arrayList5.size()) {
                    h1Var = (h1) arrayList5.get(i16);
                    if (h1Var == null) {
                    }
                }
                this.E = arrayList19;
                this.f45949w0 = null;
                this.f45950x = null;
                this.f45952y = null;
                this.I = null;
                this.F = null;
                this.M = null;
                this.G = null;
                this.L = null;
                this.J = null;
                this.f45945t0 = false;
                this.N = null;
                l();
                if (this.E.isEmpty()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                v90Var.a(z15);
                return;
            }
            if (b11 == 2) {
                if (b11 == 3) {
                    if (b11 == 4) {
                        this.E = null;
                        this.f45950x = null;
                        this.f45952y = null;
                        this.J = null;
                        this.F = null;
                        this.M = null;
                        this.I = null;
                        this.G = null;
                        this.L = null;
                        return;
                    }
                    return;
                }
                currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                if (!Arrays.equals(currentKeyboardLanguage, this.K)) {
                    MediaDataController.getInstance(this.f45928f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                this.K = currentKeyboardLanguage;
                MediaDataController mediaDataController2 = MediaDataController.getInstance(this.f45928f);
                String[] strArr2 = this.K;
                String string3 = sb2.toString();
                j0 j0Var2 = new j0(this);
                if (SharedConfig.suggestAnimatedEmoji) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                mediaDataController2.getEmojiSuggestions(strArr2, string3, false, j0Var2, z13);
                return;
            }
            arrayList3 = new ArrayList();
            ArrayList arrayList110 = new ArrayList();
            ArrayList arrayList111 = new ArrayList();
            ArrayList arrayList112 = new ArrayList();
            String lowerCase6 = sb2.toString().toLowerCase();
            while (i14 < this.S.m()) {
                botInfo = (TL_bots.BotInfo) this.S.n(i14);
                while (i15 < botInfo.commands.size()) {
                    botCommand = botInfo.commands.get(i15);
                    if (botCommand == null) {
                    }
                }
            }
            if (this.C0 != null) {
                r10 = 0;
                this.H = null;
                this.I = null;
            } else {
                r10 = 0;
                this.H = null;
                this.I = null;
            }
            this.E = r10;
            this.f45949w0 = r10;
            this.f45950x = r10;
            this.f45952y = r10;
            this.J = r10;
            this.F = arrayList3;
            this.G = arrayList110;
            this.L = arrayList111;
            this.M = arrayList112;
            this.f45945t0 = false;
            this.N = r10;
            l();
            if (arrayList3.isEmpty()) {
                z14 = true;
            } else {
                z14 = true;
            }
            v90Var.a(z14);
            return;
        }
        this.f45945t0 = r15;
        this.N = null;
        ArrayList arrayList113 = new ArrayList();
        if (arrayList2 != null) {
            while (i24 < Math.min(100, arrayList2.size())) {
                fromChatId = ((MessageObject) arrayList2.get(i24)).getFromChatId();
                if (fromChatId <= 0) {
                }
            }
        }
        lowerCase = sb2.toString().toLowerCase();
        if (lowerCase.indexOf(32) >= 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        arrayList6 = new ArrayList();
        hVar = new a0.h();
        hVar2 = new a0.h();
        arrayList7 = new ArrayList();
        arrayList7.addAll(MediaDataController.getInstance(this.f45928f).inlineBots);
        if (chat3 != null) {
            arrayList7.addAll(MediaDataController.getInstance(this.f45928f).guestBots);
        } else {
            arrayList7.addAll(MediaDataController.getInstance(this.f45928f).guestBots);
        }
        List.EL.sort(arrayList7, new lp0(20));
        linkedHashMap = new LinkedHashMap();
        size = arrayList7.size();
        i17 = 0;
        while (i17 < size) {
            Object obj3 = arrayList7.get(i17);
            i17++;
            TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) obj3;
            Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer2.peer)), tL_topPeer2);
        }
        arrayList8 = new ArrayList(linkedHashMap.values());
        if (!z10) {
            i23 = 0;
            while (i22 < arrayList8.size()) {
                user5 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i22)).peer.user_id));
                if (user5 == null) {
                    publicUsername2 = UserObject.getPublicUsername(user5);
                    if (!TextUtils.isEmpty(publicUsername2)) {
                        arrayList6.add(user5);
                        hVar.k(user5, user5.f22527id);
                        hVar2.k(user5, user5.f22527id);
                        i23++;
                    }
                    if (i23 == 5) {
                        break;
                        break;
                    }
                }
            }
        }
        rnVar2 = this.C0;
        if (rnVar2 != null) {
            chat3 = rnVar2.f42026e;
            j10 = rnVar2.Z3;
        } else {
            chatFull = this.v;
            if (chatFull != null) {
                chat3 = messagesController.getChat(Long.valueOf(chatFull.f22381id));
            }
            j10 = 0;
        }
        currentUser = UserConfig.getInstance(this.f45928f).getCurrentUser();
        if (chat3 != null) {
            i19 = -2;
            i20 = -2;
            user2 = currentUser;
            while (i20 < this.v.participants.participants.size()) {
                if (i20 != i19) {
                    if (user2 == null) {
                    }
                    j11 = j10;
                    i21 = i20;
                    user4 = user2;
                } else {
                    i21 = i20;
                    if (i21 == -1) {
                        if (z11) {
                            if (lowerCase.length() == 0) {
                                arrayList6.add(chat3);
                            } else {
                                String str17 = chat3.title;
                                publicUsername = ChatObject.getPublicUsername(chat3);
                                j11 = j10;
                                obj = chat3;
                                user4 = user2;
                                j12 = -chat3.f22380id;
                                str6 = str17;
                                str7 = null;
                                if (TextUtils.isEmpty(publicUsername)) {
                                    z16 = z16;
                                    if (publicUsername.toLowerCase().startsWith(lowerCase)) {
                                        arrayList6.add(obj);
                                        hVar2.k(obj, j12);
                                    }
                                } else {
                                    z16 = z16;
                                }
                                if (TextUtils.isEmpty(str6)) {
                                }
                            }
                        }
                        j11 = j10;
                        user4 = user2;
                    } else {
                        chatParticipant = this.v.participants.participants.get(i21);
                        if (user2 != null) {
                            j11 = j10;
                            if (chatParticipant.user_id != user2.f22527id) {
                            }
                            user4 = user2;
                        } else {
                            j11 = j10;
                        }
                        user3 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                        if (user3 != null) {
                            if (lowerCase.length() == 0) {
                            }
                            str6 = user3.first_name;
                            String str18 = user3.last_name;
                            publicUsername = UserObject.getPublicUsername(user3);
                            str7 = str18;
                            user4 = user2;
                            j12 = user3.f22527id;
                            obj = user3;
                            if (TextUtils.isEmpty(publicUsername)) {
                                z16 = z16;
                                if (publicUsername.toLowerCase().startsWith(lowerCase)) {
                                    arrayList6.add(obj);
                                    hVar2.k(obj, j12);
                                }
                            } else {
                                z16 = z16;
                            }
                            if (TextUtils.isEmpty(str6)) {
                            }
                        }
                        user4 = user2;
                    }
                }
                int i37 = i21 + 1;
                j10 = j11;
                user2 = user4;
                i19 = -2;
                i20 = i37;
                z16 = z16;
            }
        }
        boolean z22 = z16;
        long j16 = j10;
        if (this.f45932i0) {
            allDialogs = MessagesController.getInstance(this.f45928f).getAllDialogs();
            while (i18 < allDialogs.size()) {
                if (allDialogs.get(i18).f22384id > 0) {
                    user = messagesController.getUser(Long.valueOf(allDialogs.get(i18).f22384id));
                    if (user == null) {
                    }
                } else if (TextUtils.isEmpty(lowerCase)) {
                }
            }
        }
        Collections.sort(arrayList6, new o0(hVar2, arrayList113));
        this.E = null;
        this.f45949w0 = null;
        this.I = null;
        this.F = null;
        this.M = null;
        this.G = null;
        this.L = null;
        this.J = null;
        if (chat3 == null) {
        }
        Y(hVar2, arrayList6, true);
    }

    public final void V(boolean z10) {
        this.f45923c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        rn rnVar;
        TLRPC.Chat chat;
        this.f45928f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f45925d0 && this.f45944s0 != null && (rnVar = this.C0) != null && (chat = rnVar.f42026e) != null) {
            boolean zCanSendStickers = ChatObject.canSendStickers(chat);
            this.f45925d0 = zCanSendStickers;
            if (zCanSendStickers) {
                this.f45950x = null;
                l();
                this.R.a(false);
                R(this.f45944s0);
            }
        }
        String str = this.V;
        if (str != null) {
            U(str, this.Y, this.Z, this.X, this.W);
        }
    }

    public final void X(rn rnVar) {
        this.C0 = rnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f45950x = arrayList;
        if (!this.d || !this.f45926e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f45926e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f22527id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f45952y = hVar;
        gs0 gs0Var = this.f45935l0;
        if (gs0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gs0Var);
            this.f45935l0 = null;
        }
        this.N = null;
        this.f45949w0 = null;
        if (z10) {
            l();
            this.R.a(!this.f45950x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c9 c9Var;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.f45949w0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.f45953y0;
            if (arrayList2.isEmpty() || !this.f45934k0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.R.a(K() > 0);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            c9 c9Var2 = this.B0;
            if (c9Var2 != null) {
                AndroidUtilities.runOnUIThread(c9Var2);
                this.B0 = null;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (c9Var = this.B0) != null) {
            AndroidUtilities.runOnUIThread(c9Var);
            this.B0 = null;
        }
    }

    @Override
    public final int h() {
        int iK = K();
        this.H0 = iK;
        return iK;
    }

    @Override
    public final int j(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.f45949w0 != null) {
            return 4;
        }
        if (this.f45944s0 != null && !this.f45925d0) {
            return 3;
        }
        if (this.N == null) {
            ArrayList arrayList = this.I;
            return (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? 0 : 5;
        }
        if (i10 == 0) {
            return (this.P == null && this.Q == null) ? 1 : 2;
        }
        return 1;
    }

    @Override
    public final void l() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.H0;
        v90 v90Var = this.R;
        int i11 = 0;
        if (i10 != -1 && this.F0 != null) {
            int iK = K();
            this.H0 = iK;
            boolean z10 = i10 != iK;
            int iMin = Math.min(i10, iK);
            Object[] objArr = new Object[iK];
            for (int i12 = 0; i12 < iK; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < iMin) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.F0;
                    if (i11 >= objArr2.length || i11 >= iK) {
                        m(i11);
                        z10 = true;
                    } else {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (obj instanceof p1) {
                            m(i11);
                            z10 = true;
                        } else if (obj != obj2 && ((!(obj instanceof t0) || !(obj2 instanceof t0) || ((t0) obj).f45916a != ((t0) obj2).f45916a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f22527id != ((TLRPC.User) obj2).f22527id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f22380id != ((TLRPC.Chat) obj2).f22380id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                            if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                if (!str.equals(keywordResult2.keyword) || (str2 = keywordResult.emoji) == null || !str2.equals(keywordResult2.emoji)) {
                                    m(i11);
                                    z10 = true;
                                }
                            } else {
                                m(i11);
                                z10 = true;
                            }
                        }
                    }
                } else {
                    m(i11);
                    z10 = true;
                }
                i11++;
            }
            t(iMin, i10 - iMin);
            s(iMin, iK - iMin);
            if (z10 && v90Var != null) {
                v90Var.c();
            }
            this.F0 = objArr;
            return;
        }
        if (v90Var != null) {
            this.H0 = K();
            v90Var.c();
        }
        super.l();
        int iK2 = K();
        this.H0 = iK2;
        this.F0 = new Object[iK2];
        while (true) {
            Object[] objArr3 = this.F0;
            if (i11 >= objArr3.length) {
                return;
            }
            objArr3[i11] = J(i11);
            i11++;
        }
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        rn rnVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.B;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        Boolean bool = null;
        if (i12 == 4) {
            y7 y7Var = (y7) view;
            if (i11 < 0 || i11 >= this.f45949w0.size()) {
                return;
            }
            t0 t0Var = (t0) this.f45949w0.get(i11);
            TLRPC.Document document = t0Var.f45916a;
            Object obj = t0Var.f45917b;
            k2 k2Var = y7Var.f26007n;
            n9 n9Var = y7Var.f26002a;
            y7Var.f26004c = obj;
            boolean zIsPremiumSticker = MessageObject.isPremiumSticker(document);
            y7Var.f26009s = zIsPremiumSticker;
            if (zIsPremiumSticker) {
                k2Var.setColor(g6.w0(null, g6.f23053d6, false));
                k2Var.D = true;
                k2Var.E = false;
                k2Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.f22999a7, 1.0f, 1.0f, y7Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f10 = 1.0f;
                if (svgThumb == null) {
                    n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, y7Var.f26004c);
                } else if (closestPhotoSizeWithSize != null) {
                    n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, y7Var.f26004c);
                } else {
                    n9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, y7Var.f26004c);
                }
            } else if (svgThumb != null) {
                n9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, y7Var.f26004c);
                f10 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f10 = 1.0f;
                n9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, y7Var.f26004c);
            } else {
                f10 = 1.0f;
                n9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, y7Var.f26004c);
            }
            y7Var.f26003b = document;
            Drawable background = y7Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (y7Var.f26009s) {
                y7Var.f26008r = true;
            } else {
                y7Var.f26008r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int iDp = AndroidUtilities.dp(16.0f);
                layoutParams.width = iDp;
                layoutParams.height = iDp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                k2Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            } else {
                int iDp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = iDp2;
                layoutParams.height = iDp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            k2Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(k2Var, y7Var.f26008r, 0.9f, false);
            y7Var.invalidate();
            y7Var.setClearsInputField(true);
            return;
        }
        if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.C0.f42026e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i12 == 5) {
            m1 m1Var = (m1) view;
            ArrayList arrayList = this.I;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            m1Var.a((p1) this.I.get(i11), this.H, false);
            return;
        }
        ArrayList arrayList2 = this.N;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.Q == null) ? false : true;
            if (i12 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.i0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.Q.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i11--;
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                ((d2) view).e((TLRPC.BotInlineResult) this.N.get(i11), this.f45944s0, this.f45945t0, i11 != this.N.size() - 1, z10 && i11 == 0, "gif".equals(this.m0));
                return;
            }
        }
        if (i12 == 6) {
            s0 s0Var = (s0) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.C = s0Var;
            } else {
                this.D = s0Var;
            }
            TLRPC.Chat chat2 = this.f45931h0;
            if (chat2 == null && (rnVar = this.C0) != null) {
                chat2 = rnVar.f42026e;
            }
            s0Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        e5 e5Var = (e5) view;
        ArrayList arrayList3 = this.f45950x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                e5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                e5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.E;
            if (arrayList4 == null || i11 < 0 || i11 >= arrayList4.size()) {
                ArrayList arrayList5 = this.J;
                if (arrayList5 == null || i11 < 0 || i11 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.F;
                    if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                        ArrayList arrayList7 = this.G;
                        String str2 = (arrayList7 == null || i11 < 0 || i11 >= arrayList7.size()) ? null : (String) this.G.get(i11);
                        ArrayList arrayList8 = this.L;
                        TLRPC.User user = (arrayList8 == null || i11 < 0 || i11 >= arrayList8.size()) ? null : (TLRPC.User) this.L.get(i11);
                        ArrayList arrayList9 = this.M;
                        if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                            bool = (Boolean) this.M.get(i11);
                        }
                        boolean zBooleanValue = bool.booleanValue();
                        String str3 = (String) this.F.get(i11);
                        cg.q qVar = e5Var.f24263b;
                        TextView textView2 = e5Var.f24264c;
                        y8 y8Var = e5Var.d;
                        n9 n9Var2 = e5Var.f24262a;
                        e5Var.a();
                        if (user != null) {
                            n9Var2.setVisibility(0);
                            y8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                n9Var2.setImageDrawable(y8Var);
                            } else {
                                n9Var2.e(user, y8Var);
                            }
                        } else {
                            n9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (zBooleanValue) {
                            cq cqVar = new cq(R.drawable.mini_ephemeral_hidden_14, 0);
                            cqVar.setColorKey(g6.A6);
                            cqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            qVar.setText(spannableStringBuilder);
                        } else {
                            qVar.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    e5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.J.get(i11));
                }
            } else {
                e5Var.setText((String) this.E.get(i11));
            }
        }
        e5Var.setDivider(false);
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        View s0Var;
        c6 c6Var = this.D0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context);
                    TextView textView = new TextView(context);
                    i0Var.f24470a = textView;
                    textView.setTextSize(1, 15.0f);
                    textView.setTextColor(g6.w0(null, g6.Ce, false));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    i0Var.addView(textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    m1Var = i0Var;
                } else if (i10 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(g6.v0(g6.f23441z6, c6Var));
                    s0Var = textView2;
                } else if (i10 != 5) {
                    boolean z10 = this.f45943s;
                    if (i10 == 6) {
                        s0Var = new s0(context, c6Var, z10);
                    } else if (i10 != 7) {
                        y7 y7Var = new y7(context);
                        y7Var.v = c6Var;
                        n9 n9Var = new n9(context);
                        y7Var.f26002a = n9Var;
                        n9Var.setAspectFit(true);
                        n9Var.setLayerNum(1);
                        y7Var.addView(n9Var, z5.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        y7Var.setFocusable(true);
                        k2 k2Var = new k2(context, 1, null);
                        y7Var.f26007n = k2Var;
                        k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        k2Var.setImageReceiver(n9Var.getImageReceiver());
                        y7Var.addView(k2Var, z5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        s0Var = y7Var;
                    } else {
                        q0 q0Var = new q0(context, 0);
                        dq dqVar = new dq(new ColorDrawable(z10 ? g6.l1(0.15f, -1) : g6.v0(g6.f22999a7, c6Var)), g6.U0(context, R.drawable.greydivider, g6.v0(g6.f23018b7, c6Var)), 0, 0);
                        dqVar.f27828w = true;
                        q0Var.setBackground(dqVar);
                        m1Var = q0Var;
                    }
                } else {
                    m1Var = new m1(context, c6Var, false);
                }
            } else {
                d2 d2Var = new d2(context);
                d2Var.setDelegate(new j0(this));
                s0Var = d2Var;
            }
            return new lk0(s0Var);
        }
        e5 e5Var = new e5(context, c6Var);
        e5Var.setIsDarkTheme(false);
        m1Var = e5Var;
        s0Var = m1Var;
        return new lk0(s0Var);
    }
}
