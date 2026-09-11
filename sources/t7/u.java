package t7;

import android.content.Context;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import c3.b0;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import org.xml.sax.Attributes;
public final class u implements bg.a, i5.e, cg.a, ea.a, fb.n, ti, q9.d, k1, OnFailureListener, r2.k, u5.a, Continuation, x3.g, y6.c, z3.k {
    public static u f46462b;
    public static volatile u f46463c;
    public static u d;
    public final int f46464a;

    public u(int i10) {
        this.f46464a = i10;
    }

    public static MediaCodec k(com.google.firebase.messaging.n nVar) {
        String str = ((r2.o) nVar.f6374a).f44831a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static yf.k v3(Editable editable, int i10) {
        Object[] objArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    yf.k kVar = objArr[i11];
                    if (kVar.f50116a == i10) {
                        return kVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean w3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = yf.j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new z5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), z5.class);
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
                Object obj2 = (z5) obj;
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
            Object v32 = v3(editable, 0);
            if (v32 != null) {
                int spanStart2 = editable.getSpanStart(v32);
                editable.removeSpan(v32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(v32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = yf.j.a("language", attributes);
                if (a10 == null) {
                    a10 = yf.j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = yf.j.a("lng", attributes);
                }
                editable.setSpan(new yf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object v33 = v3(editable, 1);
            if (v33 != null) {
                int spanStart3 = editable.getSpanStart(v33);
                editable.removeSpan(v33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(v33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = yf.j.a("class", attributes);
                    if (yf.j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
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
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f50116a) == 2 || i10 == 3)) {
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
                Object v34 = v3(editable, 3);
                if (v34 != null) {
                    int spanStart5 = editable.getSpanStart(v34);
                    editable.removeSpan(v34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(v34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void A0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46464a;
    }

    @Override
    public void B(hh hhVar) {
        hhVar.run();
    }

    @Override
    public boolean B1() {
        switch (this.f46464a) {
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
    public void C0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f46464a) {
            case 14:
                return new pb.c(cVar.s(pb.b.class));
            default:
                return new pb.b(cVar.c(ob.a.class));
        }
    }

    @Override
    public boolean D0() {
        return false;
    }

    @Override
    public void D1(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f46464a;
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f46464a;
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f46464a) {
            case 16:
            default:
                of.f.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean I0(long j3) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f46464a;
    }

    @Override
    public int J(b2.s sVar) {
        return 1;
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K1(t1 t1Var, ah.u uVar) {
        int i10 = this.f46464a;
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void L0(int i10, t1 t1Var) {
        int i11 = this.f46464a;
    }

    @Override
    public void L1() {
        int i10 = this.f46464a;
    }

    @Override
    public void M(int i10, t1 t1Var) {
        int i11 = this.f46464a;
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f46464a;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f46464a;
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f46464a;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f46464a;
    }

    @Override
    public ov0 Q1() {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean R() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46464a;
    }

    @Override
    public void S0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean S1(long j3) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46464a;
    }

    @Override
    public void U0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int V() {
        switch (this.f46464a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W1(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public ih.a Y() {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean Z(t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long a(c3.p pVar) {
        return -1L;
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        switch (this.f46464a) {
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
    public int b(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public boolean c() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f46464a;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        int i10 = this.f46464a;
        return vl.a(messageObject);
    }

    @Override
    public b0 d() {
        return new c3.t(-9223372036854775807L);
    }

    @Override
    public boolean d0() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int e(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public void e1() {
        int i10 = this.f46464a;
    }

    @Override
    public void e2(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean f() {
        switch (this.f46464a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46464a;
    }

    @Override
    public Object h2() {
        switch (this.f46464a) {
            case 8:
                return new ArrayList();
            default:
                return new fb.m(true);
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f46464a;
    }

    @Override
    public boolean i0(b2.s sVar) {
        return false;
    }

    @Override
    public void i2() {
        int i10 = this.f46464a;
    }

    @Override
    public void j() {
        int i10 = this.f46464a;
    }

    @Override
    public boolean j0() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f46464a;
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public long l() {
        return System.currentTimeMillis();
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f46464a;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean m2(int i10) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean n0(z5 z5Var) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o() {
        int i10 = this.f46464a;
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public void o2() {
        int i10 = this.f46464a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public r2.l p(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: t7.u.p(com.google.firebase.messaging.n):r2.l");
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
        int i12 = this.f46464a;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public r9 q2() {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void s() {
        int i10 = this.f46464a;
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f46464a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        switch (this.f46464a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean u1() {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public z3.m v(b2.s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void v0(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void v1(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public String w(long j3) {
        switch (this.f46464a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0() {
        int i10 = this.f46464a;
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
        int i10 = this.f46464a;
    }

    @Override
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f46464a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f46464a;
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
        int i10 = this.f46464a;
    }

    @Override
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i2.g.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f46464a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    public u() {
        this.f46464a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    private final void B0() {
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void F3() {
    }

    private final void G0() {
    }

    private final void G3() {
    }

    private final void J3() {
    }

    private final void K3() {
    }

    private final void N2() {
    }

    private final void O2() {
    }

    private final void h0() {
    }

    private final void k0() {
    }

    private final void l2() {
    }

    private final void n2() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override
    public void H() {
    }

    @Override
    public void x() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void D3(int i10) {
    }

    private final void E2(t1 t1Var) {
    }

    private final void E3(int i10) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void G2(t1 t1Var) {
    }

    private final void H0(t1 t1Var) {
    }

    private final void H2(t1 t1Var) {
    }

    private final void H3(MessageObject messageObject) {
    }

    private final void I2(t1 t1Var) {
    }

    private final void I3(MessageObject messageObject) {
    }

    private final void K0(t1 t1Var) {
    }

    private final void L2(t1 t1Var) {
    }

    private final void M2(t1 t1Var) {
    }

    private final void T0(t1 t1Var) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void V2(String str) {
    }

    private final void W2(String str) {
    }

    private final void X1(t1 t1Var) {
    }

    private final void Z1(t1 t1Var) {
    }

    private final void a2(t1 t1Var) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void b2(t1 t1Var) {
    }

    private final void b3(t1 t1Var) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void d1(t1 t1Var) {
    }

    private final void f1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void h1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void h3(MessageObject messageObject) {
    }

    private final void i1(t1 t1Var) {
    }

    private final void i3(MessageObject messageObject) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k1(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void o0(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void q0(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void t3(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void z0(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    @Override
    public void K(Object obj) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void h(long j3) {
    }

    private final void B2(t1 t1Var, TLRPC.Document document) {
    }

    private final void C1(int i10, t1 t1Var) {
    }

    private final void C2(t1 t1Var, TLRPC.Document document) {
    }

    private final void M0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void P0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void P1(int i10, t1 t1Var) {
    }

    private final void R1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void V1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void W(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void X2(t1 t1Var, long j3) {
    }

    private final void Y2(t1 t1Var, long j3) {
    }

    private final void b0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void g2(int i10, t1 t1Var) {
    }

    private final void j2(int i10, t1 t1Var) {
    }

    private final void l1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void l3(t1 t1Var, ah.u uVar) {
    }

    private final void m1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m3(t1 t1Var, ah.u uVar) {
    }

    private final void q1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void q3(t1 t1Var, boolean z10) {
    }

    private final void r1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void s3(t1 t1Var, boolean z10) {
    }

    private final void G(t1 t1Var, float f7, float f10) {
    }

    private final void J2(t1 t1Var, float f7, float f10) {
    }

    private final void K2(t1 t1Var, float f7, float f10) {
    }

    private final void P2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void Q2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void U(t1 t1Var, float f7, float f10) {
    }

    private final void Z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void a1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void d3(t1 t1Var, float f7, float f10) {
    }

    private final void e3(t1 t1Var, float f7, float f10) {
    }

    private final void r2(t1 t1Var, float f7, float f10) {
    }

    private final void s2(t1 t1Var, float f7, float f10) {
    }

    private final void x1(t1 t1Var, int i10, int i11) {
    }

    private final void y1(t1 t1Var, int i10, int i11) {
    }

    private final void R2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void S2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void T2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void U2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void c2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void f2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void t2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void u2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void Z2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void a3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void w2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void x2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void y2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void W0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void Y0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void A3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void z3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
