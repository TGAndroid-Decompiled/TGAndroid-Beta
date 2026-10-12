package rb;

import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.car.app.messaging.model.b;
import b2.s;
import ci.u5;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fb.n;
import fb.o;
import i5.e;
import j$.util.DesugarCollections;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import of.f;
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
import org.telegram.ui.sv0;
import org.xml.sax.Attributes;
import q9.d;
import r2.u;
import r5.c;
import yf.j;
import z3.k;
import z3.m;
public final class a implements b, bg.a, e, cg.a, ea.a, o, dh.a, d, l1, n5.b, u, u9.a, SuccessContinuation, k {
    public static volatile a f47365b;
    public static a f47366c;
    public static a d;
    public final int f47367a;

    public a(int i10, boolean z10) {
        this.f47367a = i10;
    }

    public static Calendar o3() {
        if (d == null) {
            d = new a(26, false);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static yf.k p3(Editable editable, int i10) {
        Object[] objArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    yf.k kVar = objArr[i11];
                    if (kVar.f52410a == i10) {
                        return kVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean q3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = j.a("data-document-id", attributes);
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
                editable.setSpan(new yf.k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object p32 = p3(editable, 0);
            if (p32 != null) {
                int spanStart2 = editable.getSpanStart(p32);
                editable.removeSpan(p32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(p32, spanStart2, editable.length(), 33);
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
            Object p33 = p3(editable, 1);
            if (p33 != null) {
                int spanStart3 = editable.getSpanStart(p33);
                editable.removeSpan(p33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(p33, spanStart3, editable.length(), 33);
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
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f52410a) == 2 || i10 == 3)) {
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
                Object p34 = p3(editable, 3);
                if (p34 != null) {
                    int spanStart5 = editable.getSpanStart(p34);
                    editable.removeSpan(p34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(p34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f47367a;
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
        int i10 = this.f47367a;
    }

    @Override
    public int C() {
        return 1711276032;
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        switch (this.f47367a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean C2(int i10) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f47367a;
    }

    @Override
    public void E0() {
        int i10 = this.f47367a;
    }

    @Override
    public void E2() {
        int i10 = this.f47367a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f47367a;
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
        int i12 = this.f47367a;
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47367a;
    }

    @Override
    public p9 G2() {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean H(s sVar) {
        return false;
    }

    @Override
    public boolean H1() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f47367a;
    }

    @Override
    public void I0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void K0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f47367a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f47367a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f47367a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean R() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47367a;
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f47367a;
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f47367a) {
            case 16:
            default:
                f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U0(int i10, u1 u1Var) {
        int i11 = this.f47367a;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int V() {
        switch (this.f47367a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f47367a;
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void X1() {
        int i10 = this.f47367a;
    }

    @Override
    public hh.a Y() {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f47367a;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean a0(u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f47367a;
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f47367a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public int b() {
        return 872415231;
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public int d() {
        return 352321535;
    }

    @Override
    public boolean e() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e0(int i10) {
        int i11 = this.f47367a;
    }

    @Override
    public void e1(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public sv0 e2() {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f47367a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f0() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object mo27get() {
        qb.b bVar = new qb.b(24);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(i5.d.f12012a, new r5.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(i5.d.f12014c, new r5.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c.f47206b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(i5.d.f12013b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= i5.d.values().length) {
                            new HashMap();
                            return new r5.a(bVar, hashMap);
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

    @Override
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47367a;
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47367a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f47367a;
    }

    @Override
    public int j0(u1 u1Var) {
        switch (this.f47367a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k() {
        int i10 = this.f47367a;
    }

    @Override
    public void k0(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public int l() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public m m(s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f47367a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f47367a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f47367a;
        return c1.a(messageObject);
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean o0() {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p() {
        int i10 = this.f47367a;
    }

    @Override
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void q1() {
        int i10 = this.f47367a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f47367a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f47367a;
    }

    @Override
    public boolean s0(b6 b6Var) {
        switch (this.f47367a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47367a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f47367a;
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47367a;
    }

    @Override
    public int v() {
        return 0;
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f47367a;
    }

    @Override
    public String w(long j3) {
        switch (this.f47367a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public Object w2() {
        switch (this.f47367a) {
            case 8:
                return new ArrayList();
            default:
                return new n(true);
        }
    }

    @Override
    public void x(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public Object x0(u5 u5Var) {
        switch (this.f47367a) {
            case 14:
                return new pb.c(u5Var.x(pb.b.class));
            case 15:
                return new pb.b(u5Var.c(ob.a.class));
            default:
                return new Object();
        }
    }

    @Override
    public void x2() {
        int i10 = this.f47367a;
    }

    @Override
    public int y(s sVar) {
        return 1;
    }

    @Override
    public boolean z() {
        return false;
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f47367a;
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f47367a;
    }

    public a(int i10) {
        this.f47367a = i10;
        switch (i10) {
            case 22:
                new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 35) {
                    return;
                }
                return;
        }
    }

    private final void A3() {
    }

    private final void C1() {
    }

    private final void D1() {
    }

    private final void D2() {
    }

    private final void D3() {
    }

    private final void E3() {
    }

    private final void H2() {
    }

    private final void U() {
    }

    private final void W() {
    }

    private final void g0() {
    }

    private final void i0() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void z3() {
    }

    private final void A2(u1 u1Var) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void B3(MessageObject messageObject) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void J0(u1 u1Var) {
    }

    private final void L0(u1 u1Var) {
    }

    private final void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O2(String str) {
    }

    private final void P0(u1 u1Var) {
    }

    private final void P2(String str) {
    }

    private final void Q0(u1 u1Var) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void X(u1 u1Var) {
    }

    private final void Y0(u1 u1Var) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z(u1 u1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b0(u1 u1Var) {
    }

    private final void b3(MessageObject messageObject) {
    }

    private final void c3(u1 u1Var) {
    }

    private final void d0(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void f2(u1 u1Var) {
    }

    private final void g1(u1 u1Var) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void h1(u1 u1Var) {
    }

    private final void h3(u1 u1Var) {
    }

    private final void i3(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l0(u1 u1Var) {
    }

    private final void m0(u1 u1Var) {
    }

    private final void m3(u1 u1Var) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void n3(u1 u1Var) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void p2(u1 u1Var) {
    }

    private final void q0(u1 u1Var) {
    }

    private final void q2(u1 u1Var) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void t0(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void t2(u1 u1Var) {
    }

    private final void u1(u1 u1Var) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void w1(u1 u1Var) {
    }

    private final void x3(int i10) {
    }

    private final void y3(int i10) {
    }

    private final void A1(int i10, u1 u1Var) {
    }

    private final void J(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void K(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Q2(u1 u1Var, long j3) {
    }

    private final void R2(u1 u1Var, long j3) {
    }

    private final void T0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void V0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void d1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void e3(u1 u1Var, bi.f fVar) {
    }

    private final void f1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void f3(u1 u1Var, bi.f fVar) {
    }

    private final void j2(u1 u1Var, TLRPC.Document document) {
    }

    private final void j3(u1 u1Var, boolean z10) {
    }

    private final void l1(int i10, u1 u1Var) {
    }

    private final void l2(u1 u1Var, TLRPC.Document document) {
    }

    private final void l3(u1 u1Var, boolean z10) {
    }

    private final void m1(int i10, u1 u1Var) {
    }

    private final void n0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void p1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void z1(int i10, u1 u1Var) {
    }

    private final void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void D(u1 u1Var, float f7, float f10) {
    }

    private final void E1(u1 u1Var, float f7, float f10) {
    }

    private final void F1(u1 u1Var, float f7, float f10) {
    }

    private final void G(u1 u1Var, float f7, float f10) {
    }

    private final void H0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void I2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void J2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void W2(u1 u1Var, float f7, float f10) {
    }

    private final void X2(u1 u1Var, float f7, float f10) {
    }

    private final void j1(u1 u1Var, int i10, int i11) {
    }

    private final void k1(u1 u1Var, int i10, int i11) {
    }

    private final void v2(u1 u1Var, float f7, float f10) {
    }

    private final void y2(u1 u1Var, float f7, float f10) {
    }

    private final void G1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void I1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void K2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void L2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void M2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void x1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void y1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void L1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void P1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void S2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void T2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void Y1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void c2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void v0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void y0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
