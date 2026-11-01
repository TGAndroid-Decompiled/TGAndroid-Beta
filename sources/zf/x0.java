package zf;

import ag.h3;
import ag.j3;
import ag.y2;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.jc;
import org.telegram.messenger.k6;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.ri;
import org.telegram.messenger.sh;
import org.telegram.messenger.v5;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.mw;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.un;
import w7.b6;
public final class x0 extends tk0 implements vs {
    public ArrayList A0;
    public HashMap B0;
    public a0.h D;
    public String D0;
    public s0 E;
    public int E0;
    public String F;
    public sh F0;
    public v0 G;
    public un G0;
    public v0 H;
    public final p6 H0;
    public ArrayList I;
    public ArrayList J;
    public final xa.n J0;
    public ArrayList K;
    public Object[] K0;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final t90 V;
    public a0.h W;
    public int X;
    public int Y;
    public String Z;
    public boolean f55663a0;
    public boolean f55664b0;
    public int f55666c0;
    public ArrayList f55667d0;
    public int f55671g0;
    public final Context h;
    public int f55673i0;
    public int f55674j0;
    public boolean f55675k0;
    public TLRPC.Chat f55676l0;
    public long f55677n;
    public mw f55678n0;
    public boolean f55679o0;
    public k0 f55680p0;
    public String f55681q0;
    public final long f55682r;
    public String f55683r0;
    public final boolean f55684s;
    public String f55685s0;
    public int f55686t0;
    public int f55687u0;
    public boolean f55688v0;
    public TLRPC.ChatFull f55689w;
    public TLRPC.User f55690w0;
    public final m1 f55691x;
    public boolean f55692x0;
    public ArrayList f55693y;
    public p0 f55694y0;
    public Location f55695z0;
    public boolean f55665c = true;
    public boolean d = true;
    public boolean e = true;
    public int f55669f = e20.f15506s0;
    public boolean f55668e0 = true;
    public boolean f55670f0 = true;
    public boolean f55672h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final o0 I0 = new o0(this, new n0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public x0(Context context, long j10, long j11, t90 t90Var, p6 p6Var, boolean z10) {
        this.H0 = p6Var;
        this.h = context;
        this.V = t90Var;
        this.f55677n = j10;
        this.f55684s = z10;
        this.f55682r = j11;
        m1 m1Var = new m1(true);
        this.f55691x = m1Var;
        m1Var.f55593a = new vh.e0(this);
        xa.n nVar = (xa.n) new zs(at.f(this.f55669f), this).f19759b;
        nVar.e(at.X0);
        nVar.e(at.f14814x0);
        this.J0 = nVar;
        nVar.e(at.Y1);
        nVar.e(at.Z1);
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
    public final boolean D(s4.c1 c1Var) {
        if ((this.f55690w0 == null || this.f55672h0) && this.A0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f19800id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (e20.i(this.f55669f).q() || !kj.X3(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new w0(str, document));
                this.B0.put(str2, document);
                mw mwVar = this.f55678n0;
                if (mwVar != null) {
                    mwVar.a();
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
                String str2 = document.dc_id + "_" + document.f19800id;
                HashMap hashMap = this.B0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (e20.i(this.f55669f).q() || !kj.X3(document))) {
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
                    if (this.A0 == null) {
                        this.A0 = new ArrayList();
                        this.B0 = new HashMap();
                    }
                    this.A0.add(new w0(obj, document));
                    this.B0.put(str2, document);
                }
                i10++;
                obj = obj;
            }
        }
    }

    public final void G() {
        un unVar = this.G0;
        if (unVar != null && unVar.getParentActivity() != null) {
            if (this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f55690w0;
            if (user != null && user.bot_inline_geo) {
                this.I0.B();
            }
        }
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i10 = 0; i10 < min; i10++) {
            w0 w0Var = (w0) this.A0.get(i10);
            TLRPC.PhotoSize w9 = b8.w(w0Var.f55661a.thumbs, 90, false, null, false);
            if ((w9 instanceof TLRPC.TL_photoSize) || (w9 instanceof TLRPC.TL_photoSizeProgressive)) {
                b8.G(this.f55669f);
                if (!b8.K(w9, "webp", true, true).exists()) {
                    arrayList.add(b8.r("webp", w9));
                    b8.G(this.f55669f).W(jc.c(w9, w0Var.f55661a), w0Var.f55662b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f55690w0;
        if (user != null && user.f19943id != this.S) {
            return null;
        }
        return this.T;
    }

    public final Object J(int i10) {
        String str;
        long j10;
        String str2;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                return ((w0) this.A0.get(i10)).f55661a;
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView != null) {
                    if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.R.get(i10);
                    }
                }
                i10--;
                if (i10 >= 0) {
                    return this.R.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.f55693y;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f55693y.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null) {
                        if (i10 >= 0 && i10 < arrayList4.size()) {
                            return this.I.get(i10);
                        }
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null) {
                            if (i10 >= 0 && i10 < arrayList5.size()) {
                                return this.N.get(i10);
                            }
                        } else {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.M.get(i10);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 != null && (this.f55671g0 != 1 || (this.f55689w instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i10) != null) {
                                            user = (TLRPC.User) this.P.get(i10);
                                            Object obj = this.J.get(i10);
                                            if (user != null) {
                                                str2 = i20.n(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.J.get(i10));
                                        }
                                    } else {
                                        str = (String) this.J.get(i10);
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        if (user != null) {
                                            j10 = user.f19943id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new u0(str, j10);
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
        if (this.f55690w0 != null && !this.f55672h0) {
            return 1;
        }
        int i13 = 0;
        if (this.F != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i12 = 0;
                }
                return size2 + i12 + i10;
            }
            ArrayList arrayList3 = this.f55693y;
            if (arrayList3 != null) {
                i11 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    i11 = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 != null) {
                        i11 = arrayList5.size();
                    } else {
                        return i10;
                    }
                } else {
                    ArrayList arrayList6 = this.M;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.J;
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
        if (this.F != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((w0) this.A0.get(i10)).f55662b;
    }

    public final int M(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        if (this.R != null) {
            if (this.T != null || this.U != null) {
                return i10 - 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean N() {
        if (this.A0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        o0 o0Var = this.I0;
        if (o0Var != null) {
            o0Var.D();
        }
        p0 p0Var = this.f55694y0;
        if (p0Var != null) {
            org.telegram.messenger.i0.r(p0Var);
            this.f55694y0 = null;
        }
        if (this.f55686t0 != 0) {
            ConnectionsManager.getInstance(this.f55669f).cancelRequest(this.f55686t0, true);
            this.f55686t0 = 0;
        }
        if (this.f55687u0 != 0) {
            ConnectionsManager.getInstance(this.f55669f).cancelRequest(this.f55687u0, true);
            this.f55687u0 = 0;
        }
        this.f55690w0 = null;
        this.T = null;
        this.f55672h0 = true;
        this.f55681q0 = null;
        this.f55683r0 = null;
        this.f55688v0 = false;
        this.J0.a();
    }

    public final void Q() {
        TLRPC.User user = this.f55690w0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f55695z0 = location;
            location.setLatitude(-1000.0d);
            this.f55695z0.setLongitude(-1000.0d);
            T(true, this.f55690w0, this.f55683r0, "");
        }
    }

    public final void R(TLRPC.User user) {
        un unVar;
        TLRPC.Chat chat;
        this.f55686t0 = 0;
        this.I0.D();
        t90 t90Var = this.V;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f55690w0 = user;
            long j10 = user.f19943id;
            if (j10 != this.S) {
                this.T = null;
                this.S = j10;
            }
            un unVar2 = this.G0;
            if (unVar2 != null && (chat = unVar2.e) != null) {
                boolean t10 = w3.t(chat);
                this.f55672h0 = t10;
                if (!t10) {
                    f();
                    t90Var.a(true);
                    return;
                }
            }
            if (this.f55690w0.bot_inline_geo) {
                SharedPreferences sharedPreferences = wp.r1(this.f55669f).e7;
                if (!sharedPreferences.getBoolean("inlinegeo_" + this.f55690w0.f19943id, false) && (unVar = this.G0) != null && unVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f55690w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    String L0 = dd.L0(2131745441, null);
                    x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = dd.L0(2131745442, null);
                    ?? r42 = new boolean[1];
                    alertDialog$Builder.k(dd.L0(2131747847, null), new q5.a(this, (Object) r42, user2, 14));
                    alertDialog$Builder.h(dd.L0(2131752589, null), new j0(this, r42));
                    this.G0.showDialog(x1Var, new mg.g(18, this, r42));
                } else {
                    G();
                }
            }
        } else {
            this.f55690w0 = null;
            this.T = null;
            this.f55672h0 = true;
        }
        if (this.f55690w0 == null) {
            this.f55688v0 = true;
            this.T = null;
            return;
        }
        if (t90Var != null) {
            t90Var.b(true);
        }
        T(true, this.f55690w0, this.f55683r0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: zf.x0.S(java.lang.String, java.lang.String):void");
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Object obj;
        Location location;
        if (this.f55687u0 != 0) {
            ConnectionsManager.getInstance(this.f55669f).cancelRequest(this.f55687u0, true);
            this.f55687u0 = 0;
        }
        if (this.f55672h0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f55695z0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f55677n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f55677n);
                    sb2.append("_");
                    sb2.append(user.f19943id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f55695z0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f55695z0.getLongitude() + this.f55695z0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    final String sb3 = sb2.toString();
                    final is a02 = is.a0(this.f55669f);
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.i0.g3(new org.telegram.messenger.camera.i(x0.this, str, z10, tLObject, user, str2, a02, sb3));
                        }
                    };
                    long j10 = user.f19943id;
                    if (j10 != this.S) {
                        this.T = null;
                        this.S = j10;
                    }
                    if (z10) {
                        a02.M(sb3, requestDelegate);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = wp.r1(this.f55669f).p1(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f55695z0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = org.telegram.messenger.i0.b0(this.f55695z0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.i0.b0(this.f55695z0.getLongitude());
                    }
                    if (o5.C(this.f55677n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = wp.r1(this.f55669f).i1(this.f55677n);
                    }
                    this.f55687u0 = ConnectionsManager.getInstance(this.f55669f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
                    return;
                }
                return;
            }
            this.f55683r0 = null;
            return;
        }
        t90 t90Var = this.V;
        if (t90Var != null) {
            t90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: zf.x0.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f55665c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        un unVar;
        TLRPC.Chat chat;
        this.f55669f = e20.f15506s0;
        this.f55689w = chatFull;
        if (!this.f55672h0 && this.f55690w0 != null && (unVar = this.G0) != null && (chat = unVar.e) != null) {
            boolean t10 = w3.t(chat);
            this.f55672h0 = t10;
            if (t10) {
                this.f55693y = null;
                f();
                this.V.a(false);
                R(this.f55690w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.f55666c0, this.f55667d0, this.f55664b0, this.f55663a0);
        }
    }

    public final void X(un unVar) {
        this.G0 = unVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f55693y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || i20.A(user.f19943id)) {
                        it.remove();
                    }
                }
            }
        }
        this.D = hVar;
        k0 k0Var = this.f55680p0;
        if (k0Var != null) {
            org.telegram.messenger.i0.r(k0Var);
            this.f55680p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            f();
            this.V.a(!this.f55693y.isEmpty());
        }
    }

    @Override
    public final int b() {
        int K = K();
        this.M0 = K;
        return K;
    }

    @Override
    public final int d(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.f55690w0 != null && !this.f55672h0) {
            return 3;
        }
        if (this.R != null) {
            if (i10 == 0) {
                if (this.T != null || this.U != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sh shVar;
        boolean z10 = false;
        if (i10 != at.Y1 && i10 != at.Z1) {
            if (i10 == at.X0) {
                sh shVar2 = this.F0;
                if (shVar2 != null) {
                    org.telegram.messenger.i0.g3(shVar2);
                    this.F0 = null;
                    return;
                }
                return;
            } else if (i10 == at.f14814x0 && ((Integer) objArr[0]).intValue() == 0 && (shVar = this.F0) != null) {
                org.telegram.messenger.i0.g3(shVar);
                this.F0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.C0;
            if (!arrayList2.isEmpty() && this.f55679o0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z10 = true;
                    }
                    this.V.a(z10);
                }
            }
        }
    }

    @Override
    public final void f() {
        boolean z10;
        ri riVar;
        String str;
        String str2;
        int i10 = this.M0;
        t90 t90Var = this.V;
        int i11 = 0;
        if (i10 != -1 && this.K0 != null) {
            int K = K();
            this.M0 = K;
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
                    Object[] objArr2 = this.K0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof h3)) {
                            if (obj != obj2 && ((!(obj instanceof w0) || !(obj2 instanceof w0) || ((w0) obj).f55661a != ((w0) obj2).f55661a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f19943id != ((TLRPC.User) obj2).f19943id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f19794id != ((TLRPC.Chat) obj2).f19794id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof ri) && (obj2 instanceof ri) && (str = (riVar = (ri) obj).f17937b) != null) {
                                    ri riVar2 = (ri) obj2;
                                    if (str.equals(riVar2.f17937b) && (str2 = riVar.f17936a) != null && str2.equals(riVar2.f17936a)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                g(i11);
                z10 = true;
                i11++;
            }
            p(min, i10 - min);
            o(min, K - min);
            if (z10 && t90Var != null) {
                t90Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (t90Var != null) {
            this.M0 = K();
            t90Var.c();
        }
        super.f();
        int K2 = K();
        this.M0 = K2;
        this.K0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.K0;
            if (i11 < objArr3.length) {
                objArr3[i11] = J(i11);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String str;
        TLRPC.User user;
        Boolean bool;
        un unVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f7;
        String str3 = this.F;
        if (str3 != null) {
            i11 = i10 - 2;
        } else {
            i11 = i10;
        }
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i12 == 4) {
            org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
            if (i11 >= 0 && i11 < this.A0.size()) {
                w0 w0Var = (w0) this.A0.get(i11);
                TLRPC.Document document = w0Var.f55661a;
                Object obj = w0Var.f55662b;
                kg.l1 l1Var = b8Var.f21740n;
                g9 g9Var = b8Var.f21736a;
                b8Var.f21738c = obj;
                boolean X3 = kj.X3(document);
                b8Var.f21742s = X3;
                if (X3) {
                    l1Var.setColor(t6.x0(null, t6.f20930d6, false));
                    l1Var.H = true;
                    l1Var.I = false;
                    l1Var.invalidate();
                }
                TLRPC.PhotoSize w9 = b8.w(document.thumbs, 90, false, null, false);
                d00 f10 = v5.f(document, t6.f20873a7, 1.0f, b8Var.f21743w);
                if (kj.p(document)) {
                    if (f10 != null) {
                        g9Var.k(jc.b(document), "80_80", null, f10, b8Var.f21738c);
                        f7 = 1.0f;
                    } else if (w9 != null) {
                        f7 = 1.0f;
                        g9Var.l(jc.b(document), "80_80", jc.c(w9, document), null, 0, b8Var.f21738c);
                    } else {
                        f7 = 1.0f;
                        g9Var.k(jc.b(document), "80_80", null, null, b8Var.f21738c);
                    }
                } else {
                    f7 = 1.0f;
                    if (f10 != null) {
                        if (w9 != null) {
                            g9Var.k(jc.c(w9, document), null, "webp", f10, b8Var.f21738c);
                        } else {
                            g9Var.k(jc.b(document), null, "webp", f10, b8Var.f21738c);
                        }
                    } else {
                        g9Var.k(jc.c(w9, document), null, "webp", null, b8Var.f21738c);
                    }
                }
                b8Var.f21737b = document;
                Drawable background = b8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    a7.y(b8Var, background, t6.qf, null, PorterDuff.Mode.MULTIPLY);
                }
                if (b8Var.f21742s) {
                    b8Var.f21741r = true;
                } else {
                    b8Var.f21741r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l1Var.getLayoutParams();
                if (!e20.i(e20.f15506s0).q()) {
                    int L = org.telegram.messenger.i0.L(24.0f);
                    layoutParams.width = L;
                    layoutParams.height = L;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                } else {
                    int L2 = org.telegram.messenger.i0.L(16.0f);
                    layoutParams.width = L2;
                    layoutParams.height = L2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
                    layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                    l1Var.setPadding(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7));
                }
                l1Var.setLocked(!e20.i(e20.f15506s0).q());
                org.telegram.messenger.i0.Y3(l1Var, b8Var.f21741r, 0.9f, true, false);
                b8Var.invalidate();
                b8Var.setClearsInputField(true);
            }
        } else if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.e;
            if (chat != null) {
                if (!w3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(dd.L0(2131749553, null));
                } else if (org.telegram.messenger.i0.D1(chat.banned_rights)) {
                    textView.setText(dd.L0(2131753967, null));
                } else {
                    textView.setText(dd.a0("AttachInlineRestricted", null, 2131753968, dd.v(chat.banned_rights.until_date)));
                }
            }
        } else if (i12 == 5) {
            y2 y2Var = (y2) view;
            ArrayList arrayList = this.M;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                y2Var.a((h3) this.M.get(i11), this.L, false);
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                if (tL_inlineBotSwitchPM == null && this.U == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2) {
                    if (z10) {
                        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.U.text;
                        }
                        g0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i11--;
                }
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    h2 h2Var = (h2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.R.get(i11);
                    TLRPC.User user2 = this.f55690w0;
                    boolean z13 = this.f55692x0;
                    if (i11 != this.R.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f55681q0));
                }
            } else if (i12 == 6) {
                v0 v0Var = (v0) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.G = v0Var;
                } else {
                    this.H = v0Var;
                }
                TLRPC.Chat chat2 = this.f55676l0;
                if (chat2 == null && (unVar = this.G0) != null) {
                    chat2 = unVar.e;
                }
                v0Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                j5 j5Var = (j5) view;
                ArrayList arrayList3 = this.f55693y;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        j5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        j5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null && i11 >= 0 && i11 < arrayList4.size()) {
                        j5Var.setText((String) this.I.get(i11));
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null && i11 >= 0 && i11 < arrayList5.size()) {
                            j5Var.setEmojiSuggestion((ri) this.N.get(i11));
                        } else {
                            ArrayList arrayList6 = this.J;
                            if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                                ArrayList arrayList7 = this.K;
                                if (arrayList7 != null && i11 >= 0 && i11 < arrayList7.size()) {
                                    str = (String) this.K.get(i11);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.P;
                                if (arrayList8 != null && i11 >= 0 && i11 < arrayList8.size()) {
                                    user = (TLRPC.User) this.P.get(i11);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.Q;
                                if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                                    bool = (Boolean) this.Q.get(i11);
                                } else {
                                    bool = null;
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.J.get(i11);
                                j3 j3Var = j5Var.f22086b;
                                TextView textView2 = j5Var.f22087c;
                                r8 r8Var = j5Var.d;
                                g9 g9Var2 = j5Var.f22085a;
                                j5Var.a();
                                if (user != null) {
                                    g9Var2.setVisibility(0);
                                    r8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        g9Var2.e(user, r8Var);
                                    } else {
                                        g9Var2.setImageDrawable(r8Var);
                                    }
                                } else {
                                    g9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    dq dqVar = new dq(2131231941, 0);
                                    dqVar.a(t6.A6);
                                    dqVar.f25567n = 1;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    j3Var.setText(spannableStringBuilder);
                                } else {
                                    j3Var.setText(str4);
                                }
                                textView2.setText(k6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        }
                    }
                }
                j5Var.setDivider(false);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int w02;
        p6 p6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z10 = this.f55684s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.f21743w = p6Var;
                                    g9 g9Var = new g9(context);
                                    frameLayout.f21736a = g9Var;
                                    g9Var.setAspectFit(true);
                                    g9Var.setLayerNum(1);
                                    frameLayout.addView(g9Var, b6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    kg.l1 l1Var = new kg.l1(1, context, null);
                                    frameLayout.f21740n = l1Var;
                                    l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                    l1Var.setImageReceiver(g9Var.getImageReceiver());
                                    frameLayout.addView(l1Var, b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View t0Var = new t0(context, 0);
                                    if (z10) {
                                        w02 = t6.r1(0.15f, -1);
                                    } else {
                                        w02 = t6.w0(t6.f20873a7, p6Var);
                                    }
                                    ColorDrawable colorDrawable = new ColorDrawable(w02);
                                    if (!z10) {
                                        a7.y(t0Var, colorDrawable, t6.f20873a7, p6Var, PorterDuff.Mode.SRC_IN);
                                    }
                                    eq eqVar = new eq(colorDrawable, t6.X0(context, 2131231230, t6.w0(t6.f20893b7, p6Var)), 0, 0);
                                    eqVar.f25909x = true;
                                    t0Var.setBackground(eqVar);
                                    view = t0Var;
                                }
                            } else {
                                textView = new v0(context, p6Var, z10);
                            }
                        } else {
                            view = new y2(context, p6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        a7.V(textView2, t6.f21331z6, p6Var);
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f21909a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    a7.V(textView3, t6.f21195rf, null);
                    textView3.setTypeface(org.telegram.messenger.i0.o());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (dd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView3.setGravity(i11);
                    if (!dd.X) {
                        i12 = 3;
                    }
                    frameLayout2.addView(textView3, b6.d(-2, -2.0f, i12 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    textView = frameLayout2;
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new l0(this));
                textView = h2Var;
            }
            return new s4.c1(textView);
        }
        j5 j5Var = new j5(context, p6Var);
        j5Var.setIsDarkTheme(false);
        view = j5Var;
        textView = view;
        return new s4.c1(textView);
    }
}
