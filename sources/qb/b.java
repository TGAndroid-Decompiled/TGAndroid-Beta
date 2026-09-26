package qb;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import c5.b0;
import com.google.firebase.messaging.t;
import ei.m4;
import g2.x;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import ki.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.z5;
import org.telegram.ui.hv0;
import r2.u;
public class b implements s0, bg.a, cg.a, da.c, fb.n, ui, n5.b, n2.r, q9.d, tb, l1, u, u5.a, z3.k {
    public final int f41522a;

    public b(int i10) {
        this.f41522a = i10;
    }

    public static k4.d K3(w wVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f3839c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (wVar.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (wVar.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long M3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.f3839c;
        if (!(th2 instanceof b2.s0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof g2.u) && !(th2 instanceof y2.k)) {
            int i10 = g2.j.f9351b;
            while (th2 != null) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).f9352a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((b0Var.f3838b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static String Y3(ad.c cVar) {
        String str = cVar.f389a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean A1() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h2.b B(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public byte[] C() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void C1(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public int D(b2.s sVar) {
        String str = sVar.f3301r;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(v7.j.g("Unsupported MIME type: ", str));
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void D1(u1 u1Var, boolean z10) {
        int i10 = this.f41522a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f41522a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void F0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f41522a) {
            case 14:
                return new h();
            default:
                g gVar = (g) cVar.a(g.class);
                synchronized (t7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        t7.s.d(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new ob.a(0);
        }
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 H(Class cls, v1.b bVar) {
        switch (this.f41522a) {
            case 3:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f41522a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f41522a;
    }

    @Override
    public void I0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean I1() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void K1(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    public int L3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f41522a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void M1(MessageObject messageObject) {
        int i10 = this.f41522a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f41522a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f41522a) {
            case 17:
            default:
                nf.f.s(u1Var.getContext(), str);
                return;
        }
    }

    public Signature[] N3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean P() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, u1 u1Var) {
        int i11 = this.f41522a;
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f41522a;
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f41522a;
    }

    @Override
    public void R1() {
        int i10 = this.f41522a;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f41522a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(na.d.s3(s10, s11));
            }
        }
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f41522a;
    }

    @Override
    public void U(ub ubVar, fb fbVar, pg pgVar, nl nlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        nlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f15533u.a(0.8f);
        kVar.f15533u.b(400.0f);
        kVar.a(new m4(1, ubVar, pgVar));
        kVar.b(new sb(nlVar, ubVar, 1));
        kVar.f();
        fbVar.run();
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f41522a;
    }

    @Override
    public int V() {
        switch (this.f41522a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W(b2.s sVar) {
        String str = sVar.f3301r;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean W0(u1 u1Var, boolean z10) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public byte[] X(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void X0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public hh.a Y() {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public hv0 Y1() {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void Z0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public p0 a(Class cls) {
        switch (this.f41522a) {
            case 3:
                return new n0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public boolean a0(u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(long j3) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public MediaCodecInfo b(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f41522a;
    }

    @Override
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean c0() {
        return false;
    }

    @Override
    public boolean c1(int i10, u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f41522a;
    }

    @Override
    public boolean e() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean f() {
        switch (this.f41522a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        kVar.f15533u.a(0.8f);
        kVar.f15533u.b(400.0f);
        kVar.a(new hb(dbVar, 1));
        kVar.b(new sb(gbVar, ubVar, 0));
        kVar.f();
        fbVar.run();
    }

    @Override
    public int g0() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void g2(u1 u1Var, long j3) {
        int i10 = this.f41522a;
    }

    @Override
    public Object mo28get() {
        switch (this.f41522a) {
            case 12:
                return new l5.p(Executors.newSingleThreadExecutor());
            default:
                rb.a aVar = new rb.a(23);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(i5.d.f10983a, new r5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(i5.d.f10985c, new r5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f42331b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(i5.d.f10984b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= i5.d.values().length) {
                                    new HashMap();
                                    return new r5.a(aVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
        }
    }

    @Override
    public String h(u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int h0(u1 u1Var) {
        switch (this.f41522a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f41522a;
        return c1.a(messageObject);
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f41522a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f41522a;
    }

    @Override
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void k() {
        int i10 = this.f41522a;
    }

    @Override
    public n2.p k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void k1() {
        int i10 = this.f41522a;
    }

    @Override
    public boolean l0() {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public n2.q m() {
        throw new IllegalStateException();
    }

    @Override
    public int m0() {
        return 1;
    }

    @Override
    public void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f41522a;
    }

    @Override
    public void m2(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f41522a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f41522a;
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean o0(z5 z5Var) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p() {
        int i10 = this.f41522a;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void p1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f41522a;
    }

    @Override
    public Object p2() {
        switch (this.f41522a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public long q() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public void q2() {
        int i10 = this.f41522a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean r0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void s() {
        int i10 = this.f41522a;
    }

    @Override
    public da.a s2(na.d dVar, JSONObject jSONObject) {
        com.google.android.gms.internal.cast.a aVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            aVar = new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            aVar = new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        com.google.android.gms.internal.cast.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ac.d dVar2 = new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new da.a(currentTimeMillis, aVar2, dVar2, optDouble, optDouble2, optInt2);
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void u1(u1 u1Var, float f7, float f10) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean v(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f41522a;
    }

    @Override
    public boolean v2(int i10) {
        switch (this.f41522a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f41522a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public z3.m x(b2.s sVar) {
        String str = sVar.f3301r;
        List list = sVar.f3304u;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new b4.i(list);
                case 1:
                    return new t(2);
                case 2:
                    return new a6.m(25);
                case 3:
                    return new of.b(21);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new t(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(v7.j.g("Unsupported MIME type: ", str));
    }

    @Override
    public void x0(hh hhVar) {
        hhVar.run();
    }

    @Override
    public void x2() {
        int i10 = this.f41522a;
    }

    @Override
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.f4256q.y(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.f4255p.y(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void y0(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
        int i12 = this.f41522a;
    }

    @Override
    public void z(u1 u1Var) {
        int i10 = this.f41522a;
    }

    @Override
    public void z0() {
        int i10 = this.f41522a;
    }

    @Override
    public r9 z2() {
        switch (this.f41522a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    private final void E2() {
    }

    private final void F2() {
    }

    private final void H0() {
    }

    private final void J0() {
    }

    private final void O3() {
    }

    private final void P3() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void W3() {
    }

    private final void X3() {
    }

    private final void Y0() {
    }

    private final void a1() {
    }

    private final void b4() {
    }

    private final void c3() {
    }

    private final void c4() {
    }

    private final void d3() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u0() {
    }

    private final void C3(u1 u1Var) {
    }

    private final void D3(u1 u1Var) {
    }

    private final void E1(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final void F1(u1 u1Var) {
    }

    private final void G3(u1 u1Var) {
    }

    private final void I3(u1 u1Var) {
    }

    private final void J3(u1 u1Var) {
    }

    private final void L0(u1 u1Var) {
    }

    private final void O0(u1 u1Var) {
    }

    private final void O2(u1 u1Var) {
    }

    private final void P2(u1 u1Var) {
    }

    private final void Q0(u1 u1Var) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void T0(u1 u1Var) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void U3(int i10) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void V3(int i10) {
    }

    private final void W2(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Z1(u1 u1Var) {
    }

    private final void Z3(MessageObject messageObject) {
    }

    private final void a3(u1 u1Var) {
    }

    private final void a4(MessageObject messageObject) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final void d1(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void g1(u1 u1Var) {
    }

    private final void i1(u1 u1Var) {
    }

    private final void k3(String str) {
    }

    private final void l3(String str) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void r2(u1 u1Var) {
    }

    private final void r3(u1 u1Var) {
    }

    private final void s1(u1 u1Var) {
    }

    private final void t1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void u3(u1 u1Var) {
    }

    private final void v1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void v3(u1 u1Var) {
    }

    private final void w1(u1 u1Var) {
    }

    private final void w2(u1 u1Var) {
    }

    private final void w3(MessageObject messageObject) {
    }

    private final void x1(u1 u1Var) {
    }

    private final void x3(MessageObject messageObject) {
    }

    private final void y3(u1 u1Var) {
    }

    private final void z3(u1 u1Var) {
    }

    @Override
    public void K(byte[] bArr) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void d(l.d dVar) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    private final void A3(u1 u1Var, bi.f fVar) {
    }

    private final void B3(u1 u1Var, bi.f fVar) {
    }

    private final void C2(int i10, u1 u1Var) {
    }

    private final void D2(int i10, u1 u1Var) {
    }

    private final void E0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F3(u1 u1Var, boolean z10) {
    }

    private final void G0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void H3(u1 u1Var, boolean z10) {
    }

    private final void J1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void Q2(u1 u1Var, TLRPC.Document document) {
    }

    private final void R2(u1 u1Var, TLRPC.Document document) {
    }

    private final void X1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void e1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void f1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i2(int i10, u1 u1Var) {
    }

    private final void j2(int i10, u1 u1Var) {
    }

    private final void k2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m3(u1 u1Var, long j3) {
    }

    private final void n2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void n3(u1 u1Var, long j3) {
    }

    private final void y1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void z1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void l(byte[] bArr, j2.k kVar) {
    }

    private final void C0(u1 u1Var, float f7, float f10) {
    }

    private final void G2(u1 u1Var, float f7, float f10) {
    }

    private final void H2(u1 u1Var, float f7, float f10) {
    }

    private final void Y2(u1 u1Var, float f7, float f10) {
    }

    private final void Z2(u1 u1Var, float f7, float f10) {
    }

    private final void e3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void f2(u1 u1Var, int i10, int i11) {
    }

    private final void f3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void h2(u1 u1Var, int i10, int i11) {
    }

    private final void o1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void q1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void s0(u1 u1Var, float f7, float f10) {
    }

    private final void s3(u1 u1Var, float f7, float f10) {
    }

    private final void t3(u1 u1Var, float f7, float f10) {
    }

    private final void A2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void B2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void I2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void J2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void g3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void h3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void i3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void j3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void K2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void L2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void M2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void N2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void o3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void p3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void l1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void n1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void R3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
