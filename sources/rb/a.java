package rb;

import android.content.Context;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.s;
import c3.b0;
import c3.p;
import c3.t;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import fb.m;
import fb.n;
import hg.k0;
import i5.e;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import nf.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.pv0;
import org.xml.sax.Attributes;
import pb.b;
import q9.d;
import r2.k;
import r2.o;
import x3.g;
import y6.c;
import yf.j;
public final class a implements bg.a, e, cg.a, ea.a, n, dh.a, d, l1, OnFailureListener, k, u5.a, Continuation, g, c, z3.k {
    public static volatile a f42488b;
    public static a f42489c;
    public final int f42490a;

    public a(int i10) {
        this.f42490a = i10;
    }

    public static MediaCodec J(com.google.firebase.messaging.n nVar) {
        String str = ((o) nVar.f7330a).f42262a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static yf.k q3(Editable editable, int i10) {
        Object[] objArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    yf.k kVar = objArr[i11];
                    if (kVar.f47143a == i10) {
                        return kVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean r3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new y5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), y5.class);
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
                Object obj2 = (y5) obj;
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
                editable.setSpan(new yf.k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object q32 = q3(editable, 0);
            if (q32 != null) {
                int spanStart2 = editable.getSpanStart(q32);
                editable.removeSpan(q32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(q32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = j.a("language", attributes);
                if (a10 == null) {
                    a10 = j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = j.a("lng", attributes);
                }
                editable.setSpan(new yf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object q33 = q3(editable, 1);
            if (q33 != null) {
                int spanStart3 = editable.getSpanStart(q33);
                editable.removeSpan(q33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(q33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = j.a("class", attributes);
                    if (j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new yf.k(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                yf.k[] kVarArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
                for (int length2 = kVarArr.length - 1; length2 >= 0; length2--) {
                    yf.k kVar = kVarArr[length2];
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f47143a) == 2 || i10 == 3)) {
                        obj = kVar;
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
                    editable.setSpan(new yf.k(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object q34 = q3(editable, 3);
                if (q34 != null) {
                    int spanStart5 = editable.getSpanStart(q34);
                    editable.removeSpan(q34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(q34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void A0() {
        int i10 = this.f42490a;
    }

    @Override
    public void B0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean B1() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public int D(s sVar) {
        return 1;
    }

    @Override
    public void D1(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f42490a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void E1(u1 u1Var, boolean z10) {
        int i10 = this.f42490a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f42490a) {
            case 14:
                return new pb.c(cVar.x(b.class));
            default:
                return new b(cVar.c(ob.a.class));
        }
    }

    @Override
    public void G0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int H() {
        return 1711276032;
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f42490a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean I1() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void K1(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f42490a;
    }

    @Override
    public void M1(MessageObject messageObject) {
        int i10 = this.f42490a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean N0(long j3) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f42490a) {
            case 16:
            default:
                f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean P() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f42490a;
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(int i10, u1 u1Var) {
        int i11 = this.f42490a;
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1() {
        int i10 = this.f42490a;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f42490a;
    }

    @Override
    public void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f42490a;
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void T0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f42490a;
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f42490a;
    }

    @Override
    public int V() {
        switch (this.f42490a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W(s sVar) {
        return false;
    }

    @Override
    public void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean X0(u1 u1Var, boolean z10) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public hh.a Y() {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public pv0 Y1() {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int a() {
        return 872415231;
    }

    @Override
    public boolean a0(u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean a2(long j3) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public long b(p pVar) {
        return -1L;
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f42490a;
    }

    @Override
    public int c(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int d() {
        return 352321535;
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f42490a;
    }

    @Override
    public boolean d1(int i10, u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean f() {
        switch (this.f42490a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public b0 g() {
        return new t(-9223372036854775807L);
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public void g2(u1 u1Var, long j3) {
        int i10 = this.f42490a;
    }

    @Override
    public String h(u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f42490a;
    }

    @Override
    public int i0(u1 u1Var) {
        switch (this.f42490a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        int i10 = this.f42490a;
        return c1.a(messageObject);
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f42490a;
    }

    @Override
    public void j0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void k() {
        int i10 = this.f42490a;
    }

    @Override
    public int l(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public void l1() {
        int i10 = this.f42490a;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int m() {
        return 0;
    }

    @Override
    public boolean m0() {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m2(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f42490a;
    }

    @Override
    public void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f42490a;
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void o0(String str) {
        int i10 = this.f42490a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i10 = this.f42490a;
    }

    @Override
    public boolean p0(y5 y5Var) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object p2() {
        switch (this.f42490a) {
            case 8:
                return new ArrayList();
            default:
                return new m(true);
        }
    }

    @Override
    public long q() {
        return System.currentTimeMillis();
    }

    @Override
    public void q1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f42490a;
    }

    @Override
    public void q2() {
        int i10 = this.f42490a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void r0(u1 u1Var, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public void s() {
        int i10 = this.f42490a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public r2.l v(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: rb.a.v(com.google.firebase.messaging.n):r2.l");
    }

    @Override
    public void v1(u1 u1Var, float f7, float f10) {
        int i10 = this.f42490a;
    }

    @Override
    public boolean v2(int i10) {
        switch (this.f42490a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f42490a;
    }

    @Override
    public z3.m x(s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f42490a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x2() {
        int i10 = this.f42490a;
    }

    @Override
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(k0.h(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
        int i12 = this.f42490a;
    }

    @Override
    public void z(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public void z0(u1 u1Var) {
        int i10 = this.f42490a;
    }

    @Override
    public s9 z2() {
        switch (this.f42490a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    public a() {
        this.f42490a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void I2() {
    }

    private final void J2() {
    }

    private final void S1() {
    }

    private final void W1() {
    }

    private final void c0() {
    }

    private final void f0() {
    }

    private final void q0() {
    }

    private final void s0() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void w3() {
    }

    private final void x3() {
    }

    private final void A2(u1 u1Var) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void C2(u1 u1Var) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void D2(u1 u1Var) {
    }

    private final void D3(MessageObject messageObject) {
    }

    private final void F0(u1 u1Var) {
    }

    private final void G2(u1 u1Var) {
    }

    private final void H0(u1 u1Var) {
    }

    private final void H2(u1 u1Var) {
    }

    private final void P0(u1 u1Var) {
    }

    private final void Q2(String str) {
    }

    private final void R0(u1 u1Var) {
    }

    private final void R2(String str) {
    }

    private final void U0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void V0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void W2(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void a3(u1 u1Var) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final void c3(MessageObject messageObject) {
    }

    private final void d3(MessageObject messageObject) {
    }

    private final void e3(u1 u1Var) {
    }

    private final void f1(u1 u1Var) {
    }

    private final void f3(u1 u1Var) {
    }

    private final void g1(u1 u1Var) {
    }

    private final void h0(u1 u1Var) {
    }

    private final void i3(u1 u1Var) {
    }

    private final void j3(u1 u1Var) {
    }

    private final void k0(u1 u1Var) {
    }

    private final void k1(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l0(u1 u1Var) {
    }

    private final void m1(u1 u1Var) {
    }

    private final void m3(u1 u1Var) {
    }

    private final void n0(u1 u1Var) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void o3(u1 u1Var) {
    }

    private final void p3(u1 u1Var) {
    }

    private final void t0(u1 u1Var) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void v0(u1 u1Var) {
    }

    private final void w1(u1 u1Var) {
    }

    private final void w2(u1 u1Var) {
    }

    private final void x1(u1 u1Var) {
    }

    private final void y1(u1 u1Var) {
    }

    private final void y3(int i10) {
    }

    private final void z1(u1 u1Var) {
    }

    private final void z3(int i10) {
    }

    @Override
    public void B(long j3) {
    }

    private final void D0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F1(int i10, u1 u1Var) {
    }

    private final void J1(int i10, u1 u1Var) {
    }

    private final void S2(u1 u1Var, long j3) {
    }

    private final void T2(u1 u1Var, long j3) {
    }

    private final void X(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Z(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void c1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void e1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void g3(u1 u1Var, bi.f fVar) {
    }

    private final void h1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h3(u1 u1Var, bi.f fVar) {
    }

    private final void j1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void l3(u1 u1Var, boolean z10) {
    }

    private final void n3(u1 u1Var, boolean z10) {
    }

    private final void r1(int i10, u1 u1Var) {
    }

    private final void r2(u1 u1Var, TLRPC.Document document) {
    }

    private final void s1(int i10, u1 u1Var) {
    }

    private final void s2(u1 u1Var, TLRPC.Document document) {
    }

    private final void t1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void u1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void E2(u1 u1Var, float f7, float f10) {
    }

    private final void F2(u1 u1Var, float f7, float f10) {
    }

    private final void K(u1 u1Var, float f7, float f10) {
    }

    private final void K2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void L0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void L2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void M0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void U(u1 u1Var, float f7, float f10) {
    }

    private final void X1(u1 u1Var, float f7, float f10) {
    }

    private final void Y2(u1 u1Var, float f7, float f10) {
    }

    private final void Z1(u1 u1Var, float f7, float f10) {
    }

    private final void Z2(u1 u1Var, float f7, float f10) {
    }

    private final void o1(u1 u1Var, int i10, int i11) {
    }

    private final void p1(u1 u1Var, int i10, int i11) {
    }

    private final void A1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void C1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void M2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void N2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void O2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void P2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void d2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void f2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void U2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void V2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void h2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void j2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void k2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void I0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void K0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void v3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
