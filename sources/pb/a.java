package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.l0;
import androidx.lifecycle.s0;
import b2.p0;
import c3.b0;
import c3.i0;
import c3.q;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ef.b;
import gb.p;
import j9.y;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.ee;
import org.telegram.ui.vv0;
import org.xml.sax.Attributes;
import p2.s;
import p2.t;
import qi.i;
import r4.c;
import r9.d;
import rb.h;
import t7.u;
import v2.m;
import v7.q8;
import x3.g;
import y2.n;
import y6.e;
import zf.k;
import zf.l;
public class a implements s0, q, cg.a, dg.a, b, p, eh.a, d, fp0, l1, t, i, c, Continuation, u5.a, m, g, y6.c, y2.i {
    public final int f42894a;

    public a(int i10) {
        this.f42894a = i10;
    }

    public static l m0(Editable editable, int i10) {
        Object[] objArr = (l[]) editable.getSpans(0, editable.length(), l.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    l lVar = objArr[i11];
                    if (lVar.f50198a == i10) {
                        return lVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean r0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = k.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new b6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), b6.class);
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
                Object obj2 = (b6) obj;
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
                editable.setSpan(new l(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object m0 = m0(editable, 0);
            if (m0 != null) {
                int spanStart2 = editable.getSpanStart(m0);
                editable.removeSpan(m0);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(m0, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = k.a("language", attributes);
                if (a10 == null) {
                    a10 = k.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = k.a("lng", attributes);
                }
                editable.setSpan(new l(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object m02 = m0(editable, 1);
            if (m02 != null) {
                int spanStart3 = editable.getSpanStart(m02);
                editable.removeSpan(m02);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(m02, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = k.a("class", attributes);
                    if (k.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new l(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                l[] lVarArr = (l[]) editable.getSpans(0, editable.length(), l.class);
                for (int length2 = lVarArr.length - 1; length2 >= 0; length2--) {
                    l lVar = lVarArr[length2];
                    if (editable.getSpanFlags(lVar) == 17 && ((i10 = lVar.f50198a) == 2 || i10 == 3)) {
                        obj = lVar;
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
                    editable.setSpan(new l(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object m03 = m0(editable, 3);
                if (m03 != null) {
                    int spanStart5 = editable.getSpanStart(m03);
                    editable.removeSpan(m03);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(m03, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static y s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).f2282b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return q8.b(list);
    }

    @Override
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean C1() {
        return false;
    }

    @Override
    public ef.a F(qf.b bVar) {
        return new af.m(bVar);
    }

    @Override
    public int F1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public int H(Context context, String str) {
        return e.a(context, str);
    }

    @Override
    public int J() {
        return 0;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(u.L3(s10, s11));
            }
        }
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public vv0 S1() {
        return null;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean T1(long j10) {
        return false;
    }

    @Override
    public n U() {
        return new s(p2.p.f42635n, null);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public i0 W(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public void X(float f7, boolean z10) {
        ee.f35266b = f7 * 2.0f;
    }

    @Override
    public androidx.lifecycle.p0 X0(Class cls, v1.c cVar) {
        return f(cls);
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public void a() {
        synchronized (z2.b.f49243a) {
            Object obj = z2.b.f49244b;
            synchronized (obj) {
                if (z2.b.f49245c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f49245c = true;
                }
            }
        }
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public n b0(p2.p pVar, p2.m mVar) {
        return new s(pVar, mVar);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public long d() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 f(Class cls) {
        return new l0(true);
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public Object i2() {
        switch (this.f42894a) {
            case 9:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public int j0() {
        return 1711276032;
    }

    @Override
    public int k() {
        return 872415231;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public long l(c3.p pVar) {
        return -1L;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public Object n2(z5 z5Var) {
        switch (this.f42894a) {
            case 15:
                return new h();
            case 16:
                rb.g gVar = (rb.g) z5Var.a(rb.g.class);
                synchronized (t7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        t7.s.c(new Object());
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
                return new a(0);
            default:
                return new rb.k((Context) z5Var.a(Context.class));
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public void p(int i10, Object obj) {
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

    public Signature[] p0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public boolean p2(int i10) {
        return false;
    }

    @Override
    public int q(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override
    public p9 t2() {
        return null;
    }

    @Override
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    @Override
    public long v() {
        throw new NoSuchElementException();
    }

    @Override
    public int w() {
        return 352321535;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public b0 y() {
        return new c3.t(-9223372036854775807L);
    }

    public a() {
        this.f42894a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void E1(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void H0(u1 u1Var) {
    }

    @Override
    public void H1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K(b0 b0Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void L0(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void U0(u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var) {
    }

    @Override
    public void X1(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f2(u1 u1Var) {
    }

    @Override
    public void g0(long j10) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void log(String str) {
    }

    @Override
    public void n(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void x1(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N0(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
    }

    @Override
    public void error(String str, Throwable th2) {
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
