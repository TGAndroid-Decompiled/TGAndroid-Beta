package qb;

import a8.me;
import a8.qd;
import ag.j;
import ag.p;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b2.p0;
import b2.x;
import b4.i;
import c3.b0;
import c3.j0;
import c3.q;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.n0;
import fa.b;
import hb.n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import k9.y;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.og;
import org.telegram.ui.cv0;
import org.telegram.ui.d3;
import org.telegram.ui.kn;
import org.xml.sax.Attributes;
import r4.c;
import s9.d;
import sb.g;
import ti.e;
import z3.k;
import z3.m;
public final class a implements q, dg.a, eg.a, b, n, y2.n, og, j1, d, c, SuccessContinuation, k, z9.c {
    public static volatile a f47025b;
    public static a f47026c;
    public final int f47027a;

    public a(int i10) {
        this.f47027a = i10;
    }

    public static ag.q j4(Editable editable, int i10) {
        Object[] objArr = (ag.q[]) editable.getSpans(0, editable.length(), ag.q.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    ag.q qVar = objArr[i11];
                    if (qVar.f1368a == i10) {
                        return qVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean k4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = p.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new c6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), c6.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (c6) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new ag.q(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object j42 = j4(editable, 0);
            if (j42 != null) {
                int spanStart2 = editable.getSpanStart(j42);
                editable.removeSpan(j42);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(j42, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = p.a("language", attributes);
                if (a10 == null) {
                    a10 = p.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = p.a("lng", attributes);
                }
                editable.setSpan(new ag.q(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object j43 = j4(editable, 1);
            if (j43 != null) {
                int spanStart3 = editable.getSpanStart(j43);
                editable.removeSpan(j43);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(j43, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = p.a("class", attributes);
                    if (p.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new ag.q(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                ag.q[] qVarArr = (ag.q[]) editable.getSpans(0, editable.length(), ag.q.class);
                for (int length2 = qVarArr.length - 1; length2 >= 0; length2--) {
                    ag.q qVar = qVarArr[length2];
                    if (editable.getSpanFlags(qVar) == 17 && ((i10 = qVar.f1368a) == 2 || i10 == 3)) {
                        obj = qVar;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new ag.q(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object j44 = j4(editable, 3);
                if (j44 != null) {
                    int spanStart5 = editable.getSpanStart(j44);
                    editable.removeSpan(j44);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(j44, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static y t4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).f3345b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return qd.b(list);
    }

    public static String w4(dd.c cVar) {
        String str = cVar.f8329a;
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
    public void A0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f47027a;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers B() {
        return null;
    }

    @Override
    public int B0(x xVar) {
        String str = xVar.f3586s;
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
        throw new IllegalArgumentException(b10.j("Unsupported MIME type: ", str));
    }

    @Override
    public void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f47027a;
    }

    @Override
    public void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean C0(long j10) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public fa.a E(sb.b bVar, JSONObject jSONObject) {
        j jVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            jVar = new j(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            jVar = new j(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        j jVar2 = jVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        cc.d dVar = new cc.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new fa.a(currentTimeMillis, jVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void E0(int i10, s1 s1Var) {
        int i11 = this.f47027a;
    }

    @Override
    public cv0 E1() {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f47027a;
    }

    @Override
    public void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f47027a;
    }

    @Override
    public j0 F1(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public boolean G1(long j10) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47027a;
    }

    @Override
    public void I(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, s1 s1Var) {
        int i11 = this.f47027a;
    }

    @Override
    public boolean J0(s1 s1Var, boolean z10) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(MessageObject messageObject) {
        int i10 = this.f47027a;
    }

    @Override
    public void K0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void K1(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean M() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void M1(s1 s1Var, long j10) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean N(s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int N0() {
        return 0;
    }

    @Override
    public boolean O() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O0(int i10, s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47027a;
    }

    @Override
    public TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public void Q(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void R1(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public int S() {
        switch (this.f47027a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        int i10 = this.f47027a;
        return d3.a(messageObject);
    }

    @Override
    public Object S1(Uri uri, g2.k kVar) {
        return Long.valueOf(n0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public void T() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public void U0() {
        int i10 = this.f47027a;
    }

    @Override
    public Object U1() {
        switch (this.f47027a) {
            case 9:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public jh.a V() {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V1() {
        int i10 = this.f47027a;
    }

    @Override
    public boolean W(s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47027a;
    }

    @Override
    public void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean X(s1 s1Var, TLRPC.User user) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X1(int i10) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public void Z(int i10) {
        int i11 = this.f47027a;
    }

    @Override
    public void Z0(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f47027a;
    }

    @Override
    public void Z1() {
        int i10 = this.f47027a;
    }

    @Override
    public boolean a0() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a2(s1 s1Var, int i10, int i11) {
        int i12 = this.f47027a;
    }

    @Override
    public void b0(s1 s1Var, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public t9 b2() {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean c() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int c0(s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean d() {
        switch (this.f47027a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void d0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public Object d1(me meVar) {
        switch (this.f47027a) {
            case 18:
                g gVar = (g) meVar.a(g.class);
                return new tb.a(0);
            default:
                sb.a aVar = (sb.a) meVar.a(sb.a.class);
                return new sb.b(0);
        }
    }

    @Override
    public boolean e0() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public m f0(x xVar) {
        String str = xVar.f3586s;
        List list = xVar.v;
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
                    return new e(4);
                case 2:
                    return new za.c(27);
                case 3:
                    return new rf.b(25);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new h4.b(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.d();
            }
        }
        throw new IllegalArgumentException(b10.j("Unsupported MIME type: ", str));
    }

    @Override
    public void f1(s1 s1Var, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void g0(String str) {
        int i10 = this.f47027a;
    }

    @Override
    public String h(s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean h0(c6 c6Var) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean h1() {
        return false;
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f47027a;
    }

    @Override
    public kn i0() {
        return null;
    }

    @Override
    public boolean i1(x xVar) {
        String str = xVar.f3586s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public void j() {
        int i10 = this.f47027a;
    }

    @Override
    public void j0(s1 s1Var, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public TLRPC.Peer k() {
        return null;
    }

    @Override
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            eg.a.f9943t.k0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            eg.a.f9942q.k0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public boolean k1() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f47027a;
    }

    @Override
    public void l1(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.f47027a;
    }

    @Override
    public void m(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public void m1(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void n() {
        int i10 = this.f47027a;
    }

    @Override
    public void n0(s1 s1Var, bh.n nVar) {
        int i10 = this.f47027a;
    }

    @Override
    public void n1(s1 s1Var, boolean z10) {
        int i10 = this.f47027a;
    }

    @Override
    public void o0(s1 s1Var, float f7, float f10, boolean z10) {
        int i10 = this.f47027a;
    }

    @Override
    public void p(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean p0() {
        return true;
    }

    @Override
    public boolean p1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q() {
        int i10 = this.f47027a;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        switch (this.f47027a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47027a;
    }

    @Override
    public void r(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void r0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean r1() {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void s0() {
        int i10 = this.f47027a;
    }

    @Override
    public void s1(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void t0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f47027a;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public String u(long j10) {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u0(s1 s1Var, float f7, float f10) {
        int i10 = this.f47027a;
    }

    @Override
    public void u1(MessageObject messageObject) {
        int i10 = this.f47027a;
    }

    @Override
    public void v(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f47027a) {
            case 16:
            default:
                qf.d.r(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void w0(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public CharacterStyle w1(s1 s1Var) {
        switch (this.f47027a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x(s1 s1Var) {
        int i10 = this.f47027a;
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f47027a;
    }

    @Override
    public String y() {
        return null;
    }

    @Override
    public void y0(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.f47027a;
    }

    @Override
    public boolean y1(s1 s1Var, MessageObject messageObject) {
        switch (this.f47027a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void z1() {
        int i10 = this.f47027a;
    }

    private final void A3() {
    }

    private final void A4() {
    }

    private final void b3() {
    }

    private final void c3() {
    }

    private final void h2() {
    }

    private final void i2() {
    }

    private final void l4() {
    }

    private final void m4() {
    }

    private final void n2() {
    }

    private final void o2() {
    }

    private final void p4() {
    }

    private final void q4() {
    }

    private final void u4() {
    }

    private final void v4() {
    }

    private final void z3() {
    }

    private final void z4() {
    }

    @Override
    public void H() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void J1() {
    }

    @Override
    public void N1() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void U() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void Y1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void a1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void c2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void x0() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    private final void A2(s1 s1Var) {
    }

    private final void B2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void C2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void D2(s1 s1Var) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void H2(s1 s1Var) {
    }

    private final void H3(String str) {
    }

    private final void I2(s1 s1Var) {
    }

    private final void I3(String str) {
    }

    private final void L2(s1 s1Var) {
    }

    private final void M2(s1 s1Var) {
    }

    private final void N3(s1 s1Var) {
    }

    private final void O3(s1 s1Var) {
    }

    private final void R3(s1 s1Var) {
    }

    private final void S3(s1 s1Var) {
    }

    private final void T2(s1 s1Var) {
    }

    private final void T3(MessageObject messageObject) {
    }

    private final void U2(s1 s1Var) {
    }

    private final void U3(MessageObject messageObject) {
    }

    private final void V2(s1 s1Var) {
    }

    private final void V3(s1 s1Var) {
    }

    private final void W2(s1 s1Var) {
    }

    private final void W3(s1 s1Var) {
    }

    private final void Z3(s1 s1Var) {
    }

    private final void a4(s1 s1Var) {
    }

    private final void f4(s1 s1Var) {
    }

    private final void h4(s1 s1Var) {
    }

    private final void j2(s1 s1Var) {
    }

    private final void k2(s1 s1Var) {
    }

    private final void l2(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m2(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void p2(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void q2(s1 s1Var) {
    }

    private final void q3(s1 s1Var) {
    }

    private final void r3(s1 s1Var) {
    }

    private final void r4(int i10) {
    }

    private final void s3(s1 s1Var) {
    }

    private final void s4(int i10) {
    }

    private final void t2(s1 s1Var) {
    }

    private final void t3(s1 s1Var) {
    }

    private final void u2(s1 s1Var) {
    }

    private final void u3(s1 s1Var) {
    }

    private final void x3(s1 s1Var) {
    }

    private final void x4(MessageObject messageObject) {
    }

    private final void y3(s1 s1Var) {
    }

    private final void y4(MessageObject messageObject) {
    }

    private final void z2(s1 s1Var) {
    }

    @Override
    public void D1(b0 b0Var) {
    }

    @Override
    public void L1(int i10) {
    }

    @Override
    public void M0(int i10) {
    }

    @Override
    public void O1(boolean z10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void g1(CharSequence charSequence) {
    }

    @Override
    public void t(float f7) {
    }

    @Override
    public void w(boolean z10) {
    }

    private final void F2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void G2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void J2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void J3(s1 s1Var, long j10) {
    }

    private final void K2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void K3(s1 s1Var, long j10) {
    }

    private final void P2(int i10, s1 s1Var) {
    }

    private final void Q2(int i10, s1 s1Var) {
    }

    private final void R2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void S2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void X3(s1 s1Var, bh.n nVar) {
    }

    private final void Y3(s1 s1Var, bh.n nVar) {
    }

    private final void Z2(int i10, s1 s1Var) {
    }

    private final void a3(int i10, s1 s1Var) {
    }

    private final void b4(s1 s1Var, boolean z10) {
    }

    private final void d4(s1 s1Var, boolean z10) {
    }

    private final void f2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void g2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void n3(s1 s1Var, TLRPC.Document document) {
    }

    private final void o3(s1 s1Var, TLRPC.Document document) {
    }

    private final void r2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void G(float f7, int i10) {
    }

    @Override
    public void v0(int i10, int i11) {
    }

    private final void B3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void C3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void N2(s1 s1Var, int i10, int i11) {
    }

    private final void O2(s1 s1Var, int i10, int i11) {
    }

    private final void P3(s1 s1Var, float f7, float f10) {
    }

    private final void Q3(s1 s1Var, float f7, float f10) {
    }

    private final void c4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void d2(s1 s1Var, float f7, float f10) {
    }

    private final void d3(s1 s1Var, float f7, float f10) {
    }

    private final void e2(s1 s1Var, float f7, float f10) {
    }

    private final void e3(s1 s1Var, float f7, float f10) {
    }

    private final void e4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void g4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void i4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void v3(s1 s1Var, float f7, float f10) {
    }

    private final void w3(s1 s1Var, float f7, float f10) {
    }

    private final void x2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void y2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10;
    }

    private final void D3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void E3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void F3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void G3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void X2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final void Y2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final void f3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void g3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void L3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void M3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void h3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void i3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void j3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void k3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    private final void v2(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void w2(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    private final void n4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void o4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
