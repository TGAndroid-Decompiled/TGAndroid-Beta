package qb;

import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ei.l4;
import j$.util.DesugarCollections;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xb;
import org.telegram.ui.qv0;
import org.xml.sax.Attributes;
import r2.v;
public class b implements bg.a, cg.a, df.b, fb.n, wi, n5.b, n2.q, q9.d, wb, l1, v, u9.a, SuccessContinuation, z3.k {
    public static b f46069b;
    public final int f46070a;

    public b(int i10) {
        this.f46070a = i10;
    }

    public static Calendar I3() {
        if (f46069b == null) {
            f46069b = new b(26);
        }
        f46069b.getClass();
        return Calendar.getInstance();
    }

    public static yf.k J3(Editable editable, int i10) {
        Object[] objArr = (yf.k[]) editable.getSpans(0, editable.length(), yf.k.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    yf.k kVar = objArr[i11];
                    if (kVar.f52178a == i10) {
                        return kVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean K3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = yf.j.a("data-document-id", attributes);
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
            Object J3 = J3(editable, 0);
            if (J3 != null) {
                int spanStart2 = editable.getSpanStart(J3);
                editable.removeSpan(J3);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(J3, spanStart2, editable.length(), 33);
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
            Object J32 = J3(editable, 1);
            if (J32 != null) {
                int spanStart3 = editable.getSpanStart(J32);
                editable.removeSpan(J32);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(J32, spanStart3, editable.length(), 33);
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
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f52178a) == 2 || i10 == 3)) {
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
                Object J33 = J3(editable, 3);
                if (J33 != null) {
                    int spanStart5 = editable.getSpanStart(J33);
                    editable.removeSpan(J33);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(J33, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean A2(int i10) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public byte[] C(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f46070a;
    }

    @Override
    public void C2() {
        int i10 = this.f46070a;
    }

    @Override
    public boolean D(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        switch (this.f46070a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean D1(b2.s sVar) {
        return false;
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
        int i12 = this.f46070a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f46070a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public p9 E2() {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int F() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void F0() {
        int i10 = this.f46070a;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f46070a;
    }

    @Override
    public void H(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean H1() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f46070a;
    }

    @Override
    public n2.o J(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void J0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public int K() {
        return 1;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f46070a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f46070a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f46070a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46070a;
    }

    public boolean N3(CharSequence charSequence) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean Q() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean R(u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public boolean S() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f46070a;
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46070a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f46070a) {
            case 17:
            default:
                of.f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public int U0(b2.s sVar) {
        return 1;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V0(int i10, u1 u1Var) {
        int i11 = this.f46070a;
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f46070a;
    }

    @Override
    public int W() {
        switch (this.f46070a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f46070a;
    }

    @Override
    public void X1() {
        int i10 = this.f46070a;
    }

    @Override
    public hh.a Y() {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(na.d.v3(s10, s11));
            }
        }
    }

    @Override
    public boolean Y1() {
        return false;
    }

    @Override
    public boolean Z(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f46070a;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f46070a;
    }

    @Override
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean b0(u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public df.a c(b5 b5Var) {
        return new ze.h(b5Var);
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(xb xbVar, ib ibVar, gb gbVar, jb jbVar) {
        o1.k kVar = new o1.k(xbVar, xb.IN_OUT_OFFSET_Y, xbVar.getHeight());
        kVar.f16938u.a(0.8f);
        kVar.f16938u.b(400.0f);
        kVar.a(new kb(gbVar, 1));
        kVar.b(new vb(jbVar, xbVar, 0));
        kVar.h();
        ibVar.run();
    }

    @Override
    public void d1(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean e() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public qv0 e2() {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f46070a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public void f1(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f46070a;
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object mo27get() {
        switch (this.f46070a) {
            case 12:
                return new l5.p(Executors.newSingleThreadExecutor());
            default:
                ob.a aVar = new ob.a(24);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(i5.d.f12014a, new r5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(i5.d.f12016c, new r5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f46984b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(i5.d.f12015b, new r5.b(86400000L, 86400000L, unmodifiableSet));
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
    public boolean h0() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46070a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f46070a;
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public void k() {
        int i10 = this.f46070a;
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public n2.p l() {
        throw new IllegalStateException();
    }

    @Override
    public int l0(u1 u1Var) {
        switch (this.f46070a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean m(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void m0(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f46070a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f46070a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f46070a;
        return c1.a(messageObject);
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void p() {
        int i10 = this.f46070a;
    }

    @Override
    public boolean p0() {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h2.b q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void q1() {
        int i10 = this.f46070a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f46070a;
    }

    @Override
    public z3.m s0(b2.s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46070a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public boolean t0(b6 b6Var) {
        switch (this.f46070a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f46070a;
    }

    @Override
    public byte[] v() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f46070a;
    }

    @Override
    public Object v2() {
        switch (this.f46070a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f46070a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f46070a;
    }

    @Override
    public void x(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hg.c.h(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public Object y0(u5 u5Var) {
        switch (this.f46070a) {
            case 14:
                return new h();
            case 15:
                g gVar = (g) u5Var.a(g.class);
                synchronized (androidx.activity.result.c.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        androidx.activity.result.c.b(new Object());
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
            default:
                return new Object();
        }
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f46070a;
    }

    @Override
    public void z(xb xbVar, ib ibVar, rg rgVar, dm dmVar) {
        xbVar.setInOutOffset(xbVar.getMeasuredHeight());
        dmVar.accept(Float.valueOf(xbVar.getTranslationY()));
        o1.k kVar = new o1.k(xbVar, xb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f16938u.a(0.8f);
        kVar.f16938u.b(400.0f);
        kVar.a(new l4(1, xbVar, rgVar));
        kVar.b(new vb(dmVar, xbVar, 1));
        kVar.h();
        ibVar.run();
    }

    public b() {
        this.f46070a = 22;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    private final void I0() {
    }

    private final void K0() {
    }

    private final void L3() {
    }

    private final void M3() {
    }

    private final void Q3() {
    }

    private final void R3() {
    }

    private final void U3() {
    }

    private final void V3() {
    }

    private final void Y3() {
    }

    private final void Z3() {
    }

    private final void a3() {
    }

    private final void b3() {
    }

    private final void n0() {
    }

    private final void o0() {
    }

    private final void x2() {
    }

    private final void z2() {
    }

    @Override
    public void B0() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void release() {
    }

    private final void A3(u1 u1Var) {
    }

    private final void B3(u1 u1Var) {
    }

    private final void C1(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
    }

    private final void E1(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final void G3(u1 u1Var) {
    }

    private final void H3(u1 u1Var) {
    }

    private final void M0(u1 u1Var) {
    }

    private final void M2(u1 u1Var) {
    }

    private final void N2(u1 u1Var) {
    }

    private final void O0(u1 u1Var) {
    }

    private final void Q2(u1 u1Var) {
    }

    private final void R2(u1 u1Var) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void S3(int i10) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void T3(int i10) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void W0(u1 u1Var) {
    }

    private final void W3(MessageObject messageObject) {
    }

    private final void X3(MessageObject messageObject) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void i3(String str) {
    }

    private final void j2(u1 u1Var) {
    }

    private final void j3(String str) {
    }

    private final void k1(u1 u1Var) {
    }

    private final void l1(u1 u1Var) {
    }

    private final void l2(u1 u1Var) {
    }

    private final void m1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void o1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void o3(u1 u1Var) {
    }

    private final void p3(u1 u1Var) {
    }

    private final void q0(u1 u1Var) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void s3(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void t3(u1 u1Var) {
    }

    private final void u0(u1 u1Var) {
    }

    private final void u3(MessageObject messageObject) {
    }

    private final void v3(MessageObject messageObject) {
    }

    private final void w0(u1 u1Var) {
    }

    private final void w3(u1 u1Var) {
    }

    private final void x1(u1 u1Var) {
    }

    private final void x3(u1 u1Var) {
    }

    private final void y1(u1 u1Var) {
    }

    private final void z0(u1 u1Var) {
    }

    @Override
    public void V(l2.f fVar) {
    }

    @Override
    public void a1(Object obj) {
    }

    @Override
    public void p1(TLRPC.User user) {
    }

    @Override
    public void y(byte[] bArr) {
    }

    private final void B1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void D3(u1 u1Var, boolean z10) {
    }

    private final void F3(u1 u1Var, boolean z10) {
    }

    private final void L1(int i10, u1 u1Var) {
    }

    private final void O2(u1 u1Var, TLRPC.Document document) {
    }

    private final void P1(int i10, u1 u1Var) {
    }

    private final void P2(u1 u1Var, TLRPC.Document document) {
    }

    private final void Q0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void d0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void d2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void f2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void k0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k3(u1 u1Var, long j3) {
    }

    private final void l3(u1 u1Var, long j3) {
    }

    private final void t2(int i10, u1 u1Var) {
    }

    private final void u1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void u2(int i10, u1 u1Var) {
    }

    private final void w1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void y3(u1 u1Var, bi.f fVar) {
    }

    private final void z1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void z3(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void h(byte[] bArr, j2.k kVar) {
    }

    private final void B2(u1 u1Var, float f7, float f10) {
    }

    private final void F1(u1 u1Var, int i10, int i11) {
    }

    private final void F2(u1 u1Var, float f7, float f10) {
    }

    private final void G1(u1 u1Var, int i10, int i11) {
    }

    private final void W2(u1 u1Var, float f7, float f10) {
    }

    private final void X2(u1 u1Var, float f7, float f10) {
    }

    private final void a0(u1 u1Var, float f7, float f10) {
    }

    private final void c0(u1 u1Var, float f7, float f10) {
    }

    private final void c3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void d3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void h1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void j1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void q3(u1 u1Var, float f7, float f10) {
    }

    private final void r3(u1 u1Var, float f7, float f10) {
    }

    private final void G2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void H2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void e3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void f3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void g3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void h3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void p2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void q2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void I2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void K2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void L2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void m3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void e1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void g1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void O3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void P3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
