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
import gb.o;
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
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.ee;
import org.telegram.ui.wv0;
import org.xml.sax.Attributes;
import p2.p;
import p2.t;
import r0.s;
import r9.d;
import rb.h;
import ri.i;
import t7.u;
import v2.m;
import v7.q8;
import x3.g;
import y2.n;
import y6.c;
import y6.e;
import zf.k;
import zf.l;
public class a implements s0, q, cg.a, dg.a, b, o, eh.a, d, fp0, l1, t, s, i, Continuation, u5.a, m, g, c, y2.i {
    public final int f43193a;

    public a(int i10) {
        this.f43193a = i10;
    }

    public static l g0(Editable editable, int i10) {
        Object[] objArr = (l[]) editable.getSpans(0, editable.length(), l.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    l lVar = objArr[i11];
                    if (lVar.f50197a == i10) {
                        return lVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean m0(boolean z10, String str, Editable editable, Attributes attributes) {
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
            Object g02 = g0(editable, 0);
            if (g02 != null) {
                int spanStart2 = editable.getSpanStart(g02);
                editable.removeSpan(g02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(g02, spanStart2, editable.length(), 33);
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
            Object g03 = g0(editable, 1);
            if (g03 != null) {
                int spanStart3 = editable.getSpanStart(g03);
                editable.removeSpan(g03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(g03, spanStart3, editable.length(), 33);
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
                    if (editable.getSpanFlags(lVar) == 17 && ((i10 = lVar.f50197a) == 2 || i10 == 3)) {
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
                Object g04 = g0(editable, 3);
                if (g04 != null) {
                    int spanStart5 = editable.getSpanStart(g04);
                    editable.removeSpan(g04);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(g04, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static y p0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).f2278b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return q8.b(list);
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public int G() {
        return 0;
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public n H() {
        return new p2.s(p.f42935n, null);
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
    public wv0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public n U(p pVar, p2.m mVar) {
        return new p2.s(pVar, mVar);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public androidx.lifecycle.p0 W0(Class cls, v1.c cVar) {
        return e(cls);
    }

    @Override
    public void X(float f7, boolean z10) {
        ee.f35522b = f7 * 2.0f;
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
    public boolean Z0(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public void a() {
        synchronized (z2.b.f49244a) {
            Object obj = z2.b.f49245b;
            synchronized (obj) {
                if (z2.b.f49246c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f49246c = true;
                }
            }
        }
    }

    @Override
    public i0 a0(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public long b() {
        throw new NoSuchElementException();
    }

    @Override
    public int b0() {
        return 1711276032;
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
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
        return SystemClock.elapsedRealtime();
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return d0.a(messageObject);
    }

    @Override
    public androidx.lifecycle.p0 e(Class cls) {
        return new l0(true);
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public Object f2() {
        switch (this.f43193a) {
            case 9:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
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
    public int h() {
        return 872415231;
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    public Signature[] j0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f43193a) {
            case 15:
                return new h();
            default:
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
        }
    }

    @Override
    public long k(c3.p pVar) {
        return -1L;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public int l(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
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
    public long p() {
        throw new NoSuchElementException();
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public int q() {
        return 352321535;
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
    public b0 v() {
        return new c3.t(-9223372036854775807L);
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public ef.a x(qf.b bVar) {
        return new af.m(bVar);
    }

    @Override
    public int y(Context context, String str) {
        return e.a(context, str);
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public a() {
        this.f43193a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void J() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void z() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C0(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K(b0 b0Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void T0(u1 u1Var) {
    }

    @Override
    public void U1(u1 u1Var) {
    }

    @Override
    public void V0(u1 u1Var) {
    }

    @Override
    public void W(long j10) {
    }

    @Override
    public void c2(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
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
    public void w1(u1 u1Var) {
    }

    @Override
    public void x0(u1 u1Var) {
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void M0(int i10, u1 u1Var) {
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(u1 u1Var, long j10) {
    }

    @Override
    public void error(String str, Throwable th2) {
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
