package rb;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b4.i;
import c5.b0;
import da.c;
import f4.e;
import fb.n;
import fi.n4;
import g2.j;
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
import ji.u4;
import l5.p;
import n2.o;
import n2.q;
import n5.b;
import of.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import q9.d;
import qb.h;
import r2.u;
import t7.s;
import y2.g;
import y2.l;
import z3.k;
import z3.m;
public class a implements s0, bg.a, cg.a, c, n, ti, b, q, d, tb, k1, u, u5.a, k {
    public final int f45077a;

    public a(int i10) {
        this.f45077a = i10;
    }

    public static k4.d K3(g gVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f4347c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (gVar.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (gVar.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long M3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.f4347c;
        if (!(th2 instanceof b2.s0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof g2.u) && !(th2 instanceof l)) {
            int i10 = j.f10317b;
            while (th2 != null) {
                if (!(th2 instanceof j) || ((j) th2).f10318a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((b0Var.f4346b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void A0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45077a;
    }

    @Override
    public void B(hh hhVar) {
        hhVar.run();
    }

    @Override
    public o B0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public boolean B1() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h2.a C(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void C0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f45077a) {
            case 14:
                return new h();
            default:
                qb.g gVar = (qb.g) cVar.a(qb.g.class);
                synchronized (s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        s.d(new Object());
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
    public boolean D0() {
        return false;
    }

    @Override
    public void D1(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f45077a;
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f45077a;
    }

    @Override
    public byte[] G() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public int G0() {
        return 1;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f45077a) {
            case 17:
            default:
                f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean I0(long j3) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f45077a;
    }

    @Override
    public int J(b2.s sVar) {
        String str = sVar.f2370r;
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
        throw new IllegalArgumentException(p6.i("Unsupported MIME type: ", str));
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K0() {
        return false;
    }

    @Override
    public void K1(t1 t1Var, ah.u uVar) {
        int i10 = this.f45077a;
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void L0(int i10, t1 t1Var) {
        int i11 = this.f45077a;
    }

    @Override
    public void L1() {
        int i10 = this.f45077a;
    }

    public int L3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void M(int i10, t1 t1Var) {
        int i11 = this.f45077a;
    }

    @Override
    public boolean M0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f45077a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f45077a;
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f45077a;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f45077a;
    }

    public Signature[] N3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(ob.a.p3(s10, s11));
            }
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f45077a;
    }

    @Override
    public ov0 Q1() {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean R() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45077a;
    }

    @Override
    public void S0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean S1(long j3) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45077a;
    }

    @Override
    public p0 U(Class cls, v1.b bVar) {
        switch (this.f45077a) {
            case 3:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override
    public void U0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int V() {
        switch (this.f45077a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void W1(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public ih.a Y() {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean Z(t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 a(Class cls) {
        switch (this.f45077a) {
            case 3:
                return new l0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        switch (this.f45077a) {
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
    public boolean c() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f45077a;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        int i10 = this.f45077a;
        return vl.a(messageObject);
    }

    @Override
    public Map d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean d0() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        kVar.f16825u.a(0.8f);
        kVar.f16825u.b(400.0f);
        kVar.a(new hb(dbVar, 1));
        kVar.b(new sb(gbVar, ubVar, 0));
        kVar.f();
        fbVar.run();
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public void e1() {
        int i10 = this.f45077a;
    }

    @Override
    public void e2(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean f() {
        switch (this.f45077a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45077a;
    }

    @Override
    public Object mo28get() {
        switch (this.f45077a) {
            case 12:
                return new p(Executors.newSingleThreadExecutor());
            default:
                t7.u uVar = new t7.u(23);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(i5.d.f11859a, new r5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(i5.d.f11861c, new r5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f44919b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(i5.d.f11860b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= i5.d.values().length) {
                                    new HashMap();
                                    return new r5.a(uVar, hashMap);
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
    public void h0(ub ubVar, fb fbVar, pg pgVar, ml mlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f16825u.a(0.8f);
        kVar.f16825u.b(400.0f);
        kVar.a(new n4(1, ubVar, pgVar));
        kVar.b(new sb(mlVar, ubVar, 1));
        kVar.f();
        fbVar.run();
    }

    @Override
    public Object h2() {
        switch (this.f45077a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f45077a;
    }

    @Override
    public boolean i0(b2.s sVar) {
        String str = sVar.f2370r;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public void i2() {
        int i10 = this.f45077a;
    }

    @Override
    public void j() {
        int i10 = this.f45077a;
    }

    @Override
    public boolean j0() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f45077a;
    }

    @Override
    public n2.p k() {
        throw new IllegalStateException();
    }

    @Override
    public da.a k0(ob.a aVar, JSONObject jSONObject) {
        com.google.android.gms.internal.cast.a aVar2;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            aVar2 = new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            aVar2 = new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        com.google.android.gms.internal.cast.a aVar3 = aVar2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ac.d dVar = new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new da.a(currentTimeMillis, aVar3, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public long l() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f45077a;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean m2(int i10) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean n0(z5 z5Var) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o() {
        int i10 = this.f45077a;
    }

    @Override
    public byte[] o0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public void o2() {
        int i10 = this.f45077a;
    }

    @Override
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
        int i12 = this.f45077a;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean q0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public r9 q2() {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public int r0() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void s() {
        int i10 = this.f45077a;
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f45077a;
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        switch (this.f45077a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean u1() {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public m v(b2.s sVar) {
        String str = sVar.f2370r;
        List list = sVar.f2373u;
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
                    return new i(list);
                case 1:
                    return new com.google.firebase.messaging.s(2);
                case 2:
                    return new a4.m(25);
                case 3:
                    return new pf.b(21);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new com.google.firebase.messaging.s(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new e();
            }
        }
        throw new IllegalArgumentException(p6.i("Unsupported MIME type: ", str));
    }

    @Override
    public void v0(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void v1(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public String w(long j3) {
        switch (this.f45077a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0() {
        int i10 = this.f45077a;
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
        int i10 = this.f45077a;
    }

    @Override
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f45077a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f45077a;
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
        int i10 = this.f45077a;
    }

    @Override
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.f4801q.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.f4800p.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void z0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f45077a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void E2() {
    }

    private final void F2() {
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

    private final void Z0() {
    }

    private final void a4() {
    }

    private final void b4() {
    }

    private final void c3() {
    }

    private final void d3() {
    }

    private final void h1() {
    }

    private final void i1() {
    }

    @Override
    public void H() {
    }

    @Override
    public void release() {
    }

    @Override
    public void x() {
    }

    private final void C1(t1 t1Var) {
    }

    private final void C3(t1 t1Var) {
    }

    private final void D3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final void I3(t1 t1Var) {
    }

    private final void J3(t1 t1Var) {
    }

    private final void O2(t1 t1Var) {
    }

    private final void P1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void P2(t1 t1Var) {
    }

    private final void R1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void S2(t1 t1Var) {
    }

    private final void T2(t1 t1Var) {
    }

    private final void U2(t1 t1Var) {
    }

    private final void U3(int i10) {
    }

    private final void V1(t1 t1Var) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void V3(int i10) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void X1(t1 t1Var) {
    }

    private final void X2(t1 t1Var) {
    }

    private final void Y3(MessageObject messageObject) {
    }

    private final void Z3(MessageObject messageObject) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void b2(t1 t1Var) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c2(t1 t1Var) {
    }

    private final void d1(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void j2(t1 t1Var) {
    }

    private final void k1(t1 t1Var) {
    }

    private final void k3(String str) {
    }

    private final void l1(t1 t1Var) {
    }

    private final void l2(t1 t1Var) {
    }

    private final void l3(String str) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void q1(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void v3(t1 t1Var) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void w3(MessageObject messageObject) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void x3(MessageObject messageObject) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void y2(t1 t1Var) {
    }

    private final void y3(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    private final void z3(t1 t1Var) {
    }

    @Override
    public void H0(u4 u4Var) {
    }

    @Override
    public void K(Object obj) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void b0(byte[] bArr) {
    }

    private final void A3(t1 t1Var, ah.u uVar) {
    }

    private final void B3(t1 t1Var, ah.u uVar) {
    }

    private final void C2(int i10, t1 t1Var) {
    }

    private final void D2(int i10, t1 t1Var) {
    }

    private final void F3(t1 t1Var, boolean z10) {
    }

    private final void H3(t1 t1Var, boolean z10) {
    }

    private final void Q2(t1 t1Var, TLRPC.Document document) {
    }

    private final void R2(t1 t1Var, TLRPC.Document document) {
    }

    private final void V0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void W0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Z1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void a2(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void f2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void g2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void m3(t1 t1Var, long j3) {
    }

    private final void n1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void n3(t1 t1Var, long j3) {
    }

    private final void s2(int i10, t1 t1Var) {
    }

    private final void t2(int i10, t1 t1Var) {
    }

    private final void u2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void h(byte[] bArr, j2.k kVar) {
    }

    private final void G2(t1 t1Var, float f7, float f10) {
    }

    private final void H2(t1 t1Var, float f7, float f10) {
    }

    private final void P0(t1 t1Var, float f7, float f10) {
    }

    private final void T0(t1 t1Var, float f7, float f10) {
    }

    private final void Y2(t1 t1Var, float f7, float f10) {
    }

    private final void Z2(t1 t1Var, float f7, float f10) {
    }

    private final void e3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void f3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void n2(t1 t1Var, int i10, int i11) {
    }

    private final void r2(t1 t1Var, int i10, int i11) {
    }

    private final void s3(t1 t1Var, float f7, float f10) {
    }

    private final void t1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void t3(t1 t1Var, float f7, float f10) {
    }

    private final void x1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void A2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void B2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void I2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void J2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void g3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void h3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void i3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void j3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void K2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void L2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void M2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void N2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void o3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void p3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void r1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void s1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void R3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
