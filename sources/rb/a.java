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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.x5;
import org.telegram.ui.rv0;
import org.xml.sax.Attributes;
import pb.b;
import q9.d;
import r2.k;
import r2.o;
import x3.g;
import y6.c;
import yf.j;
public final class a implements bg.a, e, cg.a, ea.a, n, dh.a, d, k1, OnFailureListener, k, u5.a, Continuation, g, c, z3.k {
    public static volatile a f42212b;
    public static a f42213c;
    public final int f42214a;

    public a(int i10) {
        this.f42214a = i10;
    }

    public static MediaCodec J(com.google.firebase.messaging.n nVar) {
        String str = ((o) nVar.f7336a).f41985a;
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
                    if (kVar.f46864a == i10) {
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
                    editable.setSpan(new x5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), x5.class);
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
                Object obj2 = (x5) obj;
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
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f46864a) == 2 || i10 == 3)) {
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
    public void A(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void A0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean A1() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B0(t1 t1Var, float f7, float f10) {
        int i10 = this.f42214a;
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
    public void C1(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public int D(s sVar) {
        return 1;
    }

    @Override
    public void D0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void D1(t1 t1Var, boolean z10) {
        int i10 = this.f42214a;
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f42214a;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f42214a) {
            case 14:
                return new pb.c(cVar.w(b.class));
            default:
                return new b(cVar.c(ob.a.class));
        }
    }

    @Override
    public boolean G1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f42214a) {
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
    public void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f42214a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f42214a;
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean I1() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K1(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void M(int i10, t1 t1Var) {
        int i11 = this.f42214a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void M1(MessageObject messageObject) {
        int i10 = this.f42214a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f42214a;
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f42214a) {
            case 16:
            default:
                f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle O1(t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean P() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        int i11 = this.f42214a;
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f42214a;
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(t1 t1Var, MessageObject messageObject) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f42214a;
    }

    @Override
    public void R1() {
        int i10 = this.f42214a;
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f42214a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f42214a;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f42214a;
    }

    @Override
    public int V() {
        switch (this.f42214a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f42214a) {
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
    public boolean W0(t1 t1Var, boolean z10) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public hh.a Y() {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public rv0 Y1() {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public int a() {
        return 872415231;
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(long j3) {
        switch (this.f42214a) {
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
    public boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f42214a;
    }

    @Override
    public int c() {
        return 352321535;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int d(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f42214a;
    }

    @Override
    public boolean e() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean f() {
        switch (this.f42214a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f42214a;
    }

    @Override
    public b0 g() {
        return new t(-9223372036854775807L);
    }

    @Override
    public void g2(t1 t1Var, long j3) {
        int i10 = this.f42214a;
    }

    @Override
    public String h(t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f42214a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f42214a;
        return wl.a(messageObject);
    }

    @Override
    public void i(t1 t1Var, bi.f fVar) {
        int i10 = this.f42214a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f42214a;
    }

    @Override
    public void k() {
        int i10 = this.f42214a;
    }

    @Override
    public void k1() {
        int i10 = this.f42214a;
    }

    @Override
    public int l(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public boolean l0() {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f42214a) {
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
    public void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f42214a;
    }

    @Override
    public void m2(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f42214a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f42214a;
    }

    @Override
    public void o(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean o0(x5 x5Var) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i10 = this.f42214a;
    }

    @Override
    public void p1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f42214a;
    }

    @Override
    public Object p2() {
        switch (this.f42214a) {
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
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f42214a;
    }

    @Override
    public void q2() {
        int i10 = this.f42214a;
    }

    @Override
    public void r(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void s() {
        int i10 = this.f42214a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f42214a;
    }

    @Override
    public void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f42214a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void u1(t1 t1Var, float f7, float f10) {
        int i10 = this.f42214a;
    }

    @Override
    public r2.l v(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: rb.a.v(com.google.firebase.messaging.n):r2.l");
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f42214a;
    }

    @Override
    public boolean v2(int i10) {
        switch (this.f42214a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f42214a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public z3.m x(s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void x2() {
        int i10 = this.f42214a;
    }

    @Override
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(k0.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public void y0(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void y2(t1 t1Var, int i10, int i11) {
        int i12 = this.f42214a;
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f42214a;
    }

    @Override
    public void z0() {
        int i10 = this.f42214a;
    }

    @Override
    public r9 z2() {
        switch (this.f42214a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    public a() {
        this.f42214a = 10;
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

    private final void g0() {
    }

    private final void r0() {
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

    private final void A2(t1 t1Var) {
    }

    private final void B2(t1 t1Var) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void D3(MessageObject messageObject) {
    }

    private final void G0(t1 t1Var) {
    }

    private final void G2(t1 t1Var) {
    }

    private final void H0(t1 t1Var) {
    }

    private final void H2(t1 t1Var) {
    }

    private final void Q0(t1 t1Var) {
    }

    private final void Q2(String str) {
    }

    private final void R2(String str) {
    }

    private final void T0(t1 t1Var) {
    }

    private final void U0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void X2(t1 t1Var) {
    }

    private final void Y0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c3(MessageObject messageObject) {
    }

    private final void d3(MessageObject messageObject) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g1(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k0(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l1(t1 t1Var) {
    }

    private final void m0(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n2(t1 t1Var) {
    }

    private final void o2(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void p0(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void u0(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void w1(t1 t1Var) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void x0(t1 t1Var) {
    }

    private final void x1(t1 t1Var) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void y3(int i10) {
    }

    private final void z1(t1 t1Var) {
    }

    private final void z3(int i10) {
    }

    @Override
    public void B(long j3) {
    }

    private final void C0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void E0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F1(int i10, t1 t1Var) {
    }

    private final void J1(int i10, t1 t1Var) {
    }

    private final void S2(t1 t1Var, long j3) {
    }

    private final void T2(t1 t1Var, long j3) {
    }

    private final void X(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Z(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void d1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void e1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void g3(t1 t1Var, bi.f fVar) {
    }

    private final void h3(t1 t1Var, bi.f fVar) {
    }

    private final void i1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void j1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void l3(t1 t1Var, boolean z10) {
    }

    private final void n3(t1 t1Var, boolean z10) {
    }

    private final void r1(int i10, t1 t1Var) {
    }

    private final void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final void s1(int i10, t1 t1Var) {
    }

    private final void s2(t1 t1Var, TLRPC.Document document) {
    }

    private final void t1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void E2(t1 t1Var, float f7, float f10) {
    }

    private final void F2(t1 t1Var, float f7, float f10) {
    }

    private final void K(t1 t1Var, float f7, float f10) {
    }

    private final void K2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void L0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void L2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void O0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void U(t1 t1Var, float f7, float f10) {
    }

    private final void X1(t1 t1Var, float f7, float f10) {
    }

    private final void Y2(t1 t1Var, float f7, float f10) {
    }

    private final void Z1(t1 t1Var, float f7, float f10) {
    }

    private final void Z2(t1 t1Var, float f7, float f10) {
    }

    private final void o1(t1 t1Var, int i10, int i11) {
    }

    private final void q1(t1 t1Var, int i10, int i11) {
    }

    private final void B1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void E1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void M2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void N2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void O2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void P2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void d2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void f2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void U2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void V2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void h2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void j2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void k2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void J0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void K0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void v3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
