package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import bi.u6;
import com.google.android.gms.internal.play_billing.x3;
import di.q4;
import e9.i0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import m.g3;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import org.xml.sax.Attributes;
import r2.u;
public class b implements ag.a, s0, bg.a, i5.e, da.c, fb.n, wi, n5.b, n2.r, q9.d, sb, k1, u, u5.a, wf.a {
    public final int f40610a;

    public b(int i10) {
        this.f40610a = i10;
    }

    public static byte[] D3(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f6205x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static xf.k K3(Editable editable, int i10) {
        Object[] objArr = (xf.k[]) editable.getSpans(0, editable.length(), xf.k.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    xf.k kVar = objArr[i11];
                    if (kVar.f45154a == i10) {
                        return kVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean M3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = xf.j.a("data-document-id", attributes);
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
                editable.setSpan(new xf.k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object K3 = K3(editable, 0);
            if (K3 != null) {
                int spanStart2 = editable.getSpanStart(K3);
                editable.removeSpan(K3);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(K3, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = xf.j.a("language", attributes);
                if (a10 == null) {
                    a10 = xf.j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = xf.j.a("lng", attributes);
                }
                editable.setSpan(new xf.k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object K32 = K3(editable, 1);
            if (K32 != null) {
                int spanStart3 = editable.getSpanStart(K32);
                editable.removeSpan(K32);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(K32, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = xf.j.a("class", attributes);
                    if (xf.j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new xf.k(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                xf.k[] kVarArr = (xf.k[]) editable.getSpans(0, editable.length(), xf.k.class);
                for (int length2 = kVarArr.length - 1; length2 >= 0; length2--) {
                    xf.k kVar = kVarArr[length2];
                    if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.f45154a) == 2 || i10 == 3)) {
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
                    editable.setSpan(new xf.k(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object K33 = K3(editable, 3);
                if (K33 != null) {
                    int spanStart5 = editable.getSpanStart(K33);
                    editable.removeSpan(K33);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(K33, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static String X3(ad.c cVar) {
        String str = cVar.f385a;
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
    public void A(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void A0() {
        int i10 = this.f40610a;
    }

    @Override
    public byte[] B() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f40610a;
    }

    @Override
    public void B1(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public p0 C(Class cls, v1.b bVar) {
        switch (this.f40610a) {
            case 4:
                return b(cls);
            default:
                return b(cls);
        }
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
        int i10 = this.f40610a;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f40610a;
    }

    @Override
    public void E(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void E0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f40610a;
    }

    @Override
    public void G0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean G1() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f40610a;
    }

    @Override
    public void I(tb tbVar, eb ebVar, rg rgVar, rl rlVar) {
        tbVar.setInOutOffset(tbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(tbVar.getTranslationY()));
        o1.k kVar = new o1.k(tbVar, tb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f14134u.a(0.8f);
        kVar.f14134u.b(400.0f);
        kVar.a(new q4(1, tbVar, rgVar));
        kVar.b(new rb(rlVar, tbVar, 1));
        kVar.f();
        ebVar.run();
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void I1(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public byte[] J(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void K(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void K1(MessageObject messageObject) {
        int i10 = this.f40610a;
    }

    @Override
    public void L(int i10, t1 t1Var) {
        int i11 = this.f40610a;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f40610a) {
            case 17:
            default:
                nf.f.s(t1Var.getContext(), str);
                return;
        }
    }

    public Signature[] L3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean M0(long j3) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f40610a;
    }

    @Override
    public boolean O() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P(t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        int i11 = this.f40610a;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f40610a) {
            case 14:
                return new h();
            default:
                g gVar = (g) u6Var.a(g.class);
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
    public boolean Q() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1() {
        int i10 = this.f40610a;
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f40610a;
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean R1() {
        return false;
    }

    @Override
    public void S(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean T(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f40610a;
    }

    @Override
    public int U() {
        switch (this.f40610a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f40610a;
    }

    @Override
    public int V() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public gh.a X() {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public rv0 X1() {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y(t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y1(long j3) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public n2.p Z(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f40610a;
    }

    @Override
    public boolean a(Context context) {
        return e0.b.l(context);
    }

    @Override
    public int a0() {
        return 1;
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f40610a) {
            case 17:
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
    public p0 b(Class cls) {
        switch (this.f40610a) {
            case 4:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f40610a;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public MediaCodecInfo d(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean d0() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void e2(t1 t1Var, long j3) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean f() {
        switch (this.f40610a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        int i10 = this.f40610a;
        return em.a(messageObject);
    }

    @Override
    public Object mo28get() {
        switch (this.f40610a) {
            case 12:
                return new l5.p(Executors.newSingleThreadExecutor());
            default:
                rb.a aVar = new rb.a(23);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(i5.d.f10477a, new r5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(i5.d.f10479c, new r5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f41265b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(i5.d.f10478b, new r5.b(86400000L, 86400000L, unmodifiableSet));
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
    public Map h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public int h0(t1 t1Var) {
        switch (this.f40610a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f40610a;
    }

    @Override
    public void i0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void j() {
        int i10 = this.f40610a;
    }

    @Override
    public boolean j0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void j1() {
        int i10 = this.f40610a;
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k(tb tbVar, eb ebVar, cb cbVar, fb fbVar) {
        o1.k kVar = new o1.k(tbVar, tb.IN_OUT_OFFSET_Y, tbVar.getHeight());
        kVar.f14134u.a(0.8f);
        kVar.f14134u.b(400.0f);
        kVar.a(new gb(cbVar, 1));
        kVar.b(new rb(fbVar, tbVar, 0));
        kVar.f();
        ebVar.run();
    }

    @Override
    public void k2(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean l0() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f40610a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f40610a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f40610a;
    }

    @Override
    public Object n2() {
        switch (this.f40610a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public void o() {
        int i10 = this.f40610a;
    }

    @Override
    public boolean o0(y5 y5Var) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f40610a;
    }

    @Override
    public void o2() {
        int i10 = this.f40610a;
    }

    @Override
    public n2.q p() {
        throw new IllegalStateException();
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public da.a q2(na.d dVar, JSONObject jSONObject) {
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
    public void r() {
        int i10 = this.f40610a;
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hc.b.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f7 = remaining;
            float f10 = f7 / f7;
            float f11 = ceil;
            float f12 = f11 / f11;
            while (remaining > 0 && ceil > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f10 = remaining / f7;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f12 = ceil / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean t2(int i10) {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long u() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f40610a;
    }

    @Override
    public String v(long j3) {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v2() {
        int i10 = this.f40610a;
    }

    @Override
    public boolean w(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.f40610a;
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
        int i12 = this.f40610a;
    }

    @Override
    public h2.b x(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f40610a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public t9 x2() {
        switch (this.f40610a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean y(Context context) {
        return e0.b.p(context);
    }

    @Override
    public void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public void z0(t1 t1Var) {
        int i10 = this.f40610a;
    }

    @Override
    public boolean z1() {
        switch (this.f40610a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    public b(Context context) {
        this.f40610a = 11;
    }

    private final void D0() {
    }

    private final void D2() {
    }

    private final void E2() {
    }

    private final void N3() {
    }

    private final void O0() {
    }

    private final void O3() {
    }

    private final void Q0() {
    }

    private final void R3() {
    }

    private final void S3() {
    }

    private final void V3() {
    }

    private final void W3() {
    }

    private final void a4() {
    }

    private final void b3() {
    }

    private final void b4() {
    }

    private final void c3() {
    }

    private final void t0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void release() {
    }

    @Override
    public void v0() {
    }

    private final void B3(t1 t1Var) {
    }

    private final void C3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final void F0(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final void H0(t1 t1Var) {
    }

    private final void I3(t1 t1Var) {
    }

    private final void J0(t1 t1Var) {
    }

    private final void J3(t1 t1Var) {
    }

    private final void L0(t1 t1Var) {
    }

    private final void N2(t1 t1Var) {
    }

    private final void O2(t1 t1Var) {
    }

    private final void R2(t1 t1Var) {
    }

    private final void S2(t1 t1Var) {
    }

    private final void T0(t1 t1Var) {
    }

    private final void T2(t1 t1Var) {
    }

    private final void T3(int i10) {
    }

    private final void U2(t1 t1Var) {
    }

    private final void U3(int i10) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Y3(MessageObject messageObject) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void Z3(MessageObject messageObject) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b2(t1 t1Var) {
    }

    private final void d1(t1 t1Var) {
    }

    private final void d2(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void j3(String str) {
    }

    private final void k3(String str) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void p2(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void q1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void s1(t1 t1Var) {
    }

    private final void s2(t1 t1Var) {
    }

    private final void t3(t1 t1Var) {
    }

    private final void u1(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void v3(MessageObject messageObject) {
    }

    private final void w3(MessageObject messageObject) {
    }

    private final void x1(t1 t1Var) {
    }

    private final void x3(t1 t1Var) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void y2(t1 t1Var) {
    }

    private final void y3(t1 t1Var) {
    }

    @Override
    public void G(byte[] bArr) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void c(g3 g3Var) {
    }

    @Override
    public void i1(TLRPC.User user) {
    }

    private final void A3(t1 t1Var, ai.j jVar) {
    }

    private final void B2(int i10, t1 t1Var) {
    }

    private final void C2(int i10, t1 t1Var) {
    }

    private final void D1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void F3(t1 t1Var, boolean z10) {
    }

    private final void H1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void H3(t1 t1Var, boolean z10) {
    }

    private final void P2(t1 t1Var, TLRPC.Document document) {
    }

    private final void Q2(t1 t1Var, TLRPC.Document document) {
    }

    private final void a1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void b1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void h2(int i10, t1 t1Var) {
    }

    private final void i2(int i10, t1 t1Var) {
    }

    private final void l2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void l3(t1 t1Var, long j3) {
    }

    private final void m2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m3(t1 t1Var, long j3) {
    }

    private final void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void r0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void w1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void z3(t1 t1Var, ai.j jVar) {
    }

    @Override
    public void l(byte[] bArr, j2.k kVar) {
    }

    private final void F2(t1 t1Var, float f7, float f10) {
    }

    private final void G2(t1 t1Var, float f7, float f10) {
    }

    private final void X2(t1 t1Var, float f7, float f10) {
    }

    private final void Y2(t1 t1Var, float f7, float f10) {
    }

    private final void d3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void e3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void f2(t1 t1Var, int i10, int i11) {
    }

    private final void g2(t1 t1Var, int i10, int i11) {
    }

    private final void k0(t1 t1Var, float f7, float f10) {
    }

    private final void k1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void m0(t1 t1Var, float f7, float f10) {
    }

    private final void m1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void r3(t1 t1Var, float f7, float f10) {
    }

    private final void s3(t1 t1Var, float f7, float f10) {
    }

    @Override
    public int J1(int i10, int i11, int i12) {
        return i10;
    }

    private final void A2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void H2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void I2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void f3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void g3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void h3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void i3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void z2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final void J2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void K2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void L2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void M2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void n3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void o3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void f1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void h1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void P3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
